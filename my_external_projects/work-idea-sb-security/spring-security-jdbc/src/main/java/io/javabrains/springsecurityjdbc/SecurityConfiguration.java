package io.javabrains.springsecurityjdbc;

import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import javax.sql.DataSource;

@EnableWebSecurity
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {

    @Autowired
    private DataSource dataSource;
/*
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        System.out.println(dataSource.toString());
        auth.jdbcAuthentication()
                .dataSource(dataSource)
                .usersByUsernameQuery("select username, password, enabled "
                       + "from users "
                       + "where username = ?")
                .authoritiesByUsernameQuery("select username, authority "
                        + "from authorities "
                        + "where username = ?");
    }
*/
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        System.out.println(dataSource.toString());
        auth.jdbcAuthentication()
                .dataSource(dataSource)
                .withDefaultSchema()
                .withUser(User.withUsername("user")
                        .password("pass")
                        .roles("USER")
                )
                        .withUser(User.withUsername("admin")
                                .password("pass")
                                .roles("ADMIN")
                );
    }

    //if you want to use your users table - give the name and create DataSource - put dbase data in application.properties
    /*
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        System.out.println(dataSource.toString());
        auth.jdbcAuthentication()
                .dataSource(dataSource);
    }
     */


    @Bean
    public PasswordEncoder getPasswordEncoder() {
        return NoOpPasswordEncoder.getInstance();
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests()
                .antMatchers("/admin").hasRole("ADMIN")
                .antMatchers("/user").hasAnyRole("ADMIN", "USER")
                .antMatchers("/").permitAll()
                .and().formLogin();
        }
    }
