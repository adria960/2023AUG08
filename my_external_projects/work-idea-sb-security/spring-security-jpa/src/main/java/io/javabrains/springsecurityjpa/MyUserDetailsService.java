package io.javabrains.springsecurityjpa;

import io.javabrains.springsecurityjpa.models.MyUserDetails;
import io.javabrains.springsecurityjpa.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class MyUserDetailsService implements UserDetailsService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Optional<User> user = userRepository.findByUsername(username);

       System.out.println("userName: " + username + "  " + user.isPresent());
       //System.out.println("password:  " + user.get().getPassword() + " username:  " + user.get().getUsername());

        user.orElseThrow(() -> new UsernameNotFoundException("Not found: " + username ));

       // UserDetails ud = user.map(MyUserDetails::new).get();
       // System.out.println("UserDetails username: " + ud.getUsername() + "  pass: " + ud.getPassword());

        return user.map(MyUserDetails::new).get();
    }
}
