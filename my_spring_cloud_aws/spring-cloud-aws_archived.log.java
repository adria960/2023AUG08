~
$ pwd
/c/Users/jstupar

jstupar@SRB2NF69C3 MINGW64 ~
$ mkdir my_spring_cloud_aws

jstupar@SRB2NF69C3 MINGW64 ~
$ ls my_spring_cloud_aws/

jstupar@SRB2NF69C3 MINGW64 ~
$ ls -l | my_spring*
bash: my_spring_cloud_aws: command not found

jstupar@SRB2NF69C3 MINGW64 ~
$ ls | my_spring*
bash: my_spring_cloud_aws: command not found

jstupar@SRB2NF69C3 MINGW64 ~
$ pwd
/c/Users/jstupar

jstupar@SRB2NF69C3 MINGW64 ~
$ cd my_spring_cloud_aws/

jstupar@SRB2NF69C3 MINGW64 ~/my_spring_cloud_aws
$ git clone https://github.com/spring-attic/spring-cloud-aws.git
Cloning into 'spring-cloud-aws'...
remote: Enumerating objects: 66996, done.
remote: Counting objects: 100% (211/211), done.
remote: Compressing objects: 100% (123/123), done.
remote: Total 66996 (delta 75), reused 157 (delta 39), pack-reused 66785
Receiving objects: 100% (66996/66996), 45.82 MiB | 678.00 KiB/s, done.
Resolving deltas: 100% (32252/32252), done.

jstupar@SRB2NF69C3 MINGW64 ~/my_spring_cloud_aws
$ ls -l
total 12
drwxr-xr-x 1 jstupar 1049089 0 Feb 19 12:26 spring-cloud-aws/

jstupar@SRB2NF69C3 MINGW64 ~/my_spring_cloud_aws
$ cd spring-cloud-aws/

jstupar@SRB2NF69C3 MINGW64 ~/my_spring_cloud_aws/spring-cloud-aws (main)
$ mvn clean package
[INFO] Scanning for projects...
Downloading from spring-milestones: https://repo.spring.io/libs-milestone-local/org/springframework/cloud/spring-cloud-build/3.0.0-RC1/spring-cloud-build-3.0.0-RC1.pom
Downloaded from spring-milestones: https://repo.spring.io/libs-milestone-local/org/springframework/cloud/spring-cloud-build/3.0.0-RC1/spring-cloud-build-3.0.0-RC1.pom (54 kB at 34 kB/s)
Downloading from spring-milestones: https://repo.spring.io/libs-milestone-local/org/springframework/cloud/spring-cloud-dependencies-parent/3.0.0-RC1/spring-cloud-dependencies-parent-3.0.0-RC1.pom
Downloaded from spring-milestones: https://repo.spring.io/libs-milestone-local/org/springframework/cloud/spring-cloud-dependencies-parent/3.0.0-RC1/spring-cloud-dependencies-parent-3.0.0-RC1.pom (7.7 kB at 19 kB/s)
Downloading from spring-milestones: https://repo.spring.io/libs-milestone-local/com/amazonaws/aws-java-sdk-bom/1.11.907/aws-java-sdk-bom-1.11.907.pom
Downloading from spring-releases: https://repo.spring.io/release/com/amazonaws/aws-java-sdk-bom/1.11.907/aws-java-sdk-bom-1.11.907.pom
Downloading from spring-plugins: https://repo.spring.io/plugins/com/amazonaws/aws-java-sdk-bom/1.11.907/aws-java-sdk-bom-1.11.907.pom
Downloading from central: https://repo.maven.apache.org/maven2/com/amazonaws/aws-java-sdk-bom/1.11.907/aws-java-sdk-bom-1.11.907.pom
Downloaded from central: https://repo.maven.apache.org/maven2/com/amazonaws/aws-java-sdk-bom/1.11.907/aws-java-sdk-bom-1.11.907.pom (51 kB at 97 kB/s)
Downloading from spring-milestones: https://repo.spring.io/libs-milestone-local/com/amazonaws/aws-java-sdk-pom/1.11.907/aws-java-sdk-pom-1.11.907.pom
Downloading from spring-releases: https://repo.spring.io/release/com/amazonaws/aws-java-sdk-pom/1.11.907/aws-java-sdk-pom-1.11.907.pom
Downloading from spring-plugins: https://repo.spring.io/plugins/com/amazonaws/aws-java-sdk-pom/1.11.907/aws-java-sdk-pom-1.11.907.pom
Downloading from central: https://repo.maven.apache.org/maven2/com/amazonaws/aws-java-sdk-pom/1.11.907/aws-java-sdk-pom-1.11.907.pom
Downloaded from central: https://repo.maven.apache.org/maven2/com/amazonaws/aws-java-sdk-pom/1.11.907/aws-java-sdk-pom-1.11.907.pom (20 kB at 145 kB/s)
Downloading from spring-milestones: https://repo.spring.io/libs-milestone-local/org/springframework/cloud/spring-cloud-commons-dependencies/3.0.0-RC1/spring-cloud-commons-dependencies-3.0.0-RC1.pom
Downloaded from spring-milestones: https://repo.spring.io/libs-milestone-local/org/springframework/cloud/spring-cloud-commons-dependencies/3.0.0-RC1/spring-cloud-commons-dependencies-3.0.0-RC1.pom (3.9 kB at 11 kB/s)
Downloading from spring-milestones: https://repo.spring.io/libs-milestone-local/org/springframework/cloud/spring-cloud-build-dependencies/3.0.0-RC1/spring-cloud-build-dependencies-3.0.0-RC1.pom
Downloaded from spring-milestones: https://repo.spring.io/libs-milestone-local/org/springframework/cloud/spring-cloud-build-dependencies/3.0.0-RC1/spring-cloud-build-dependencies-3.0.0-RC1.pom (3.2 kB at 8.2 kB/s)
Downloading from spring-milestones: https://repo.spring.io/libs-milestone-local/org/springframework/boot/spring-boot-dependencies/2.4.0/spring-boot-dependencies-2.4.0.pom
Downloading from spring-releases: https://repo.spring.io/release/org/springframework/boot/spring-boot-dependencies/2.4.0/spring-boot-dependencies-2.4.0.pom
Downloaded from spring-releases: https://repo.spring.io/release/org/springframework/boot/spring-boot-dependencies/2.4.0/spring-boot-dependencies-2.4.0.pom (108 kB at 43 kB/s)
Downloading from spring-milestones: https://repo.spring.io/libs-milestone-local/io/dropwizard/metrics/metrics-bom/4.1.14/metrics-bom-4.1.14.pom
Downloading from spring-releases: https://repo.spring.io/release/io/dropwizard/metrics/metrics-bom/4.1.14/metrics-bom-4.1.14.pom
Downloading from spring-plugins: https://repo.spring.io/plugins/io/dropwizard/metrics/metrics-bom/4.1.14/metrics-bom-4.1.14.pom
Downloading from central: https://repo.maven.apache.org/maven2/io/dropwizard/metrics/metrics-bom/4.1.14/metrics-bom-4.1.14.pom
Downloaded from central: https://repo.maven.apache.org/maven2/io/dropwizard/metrics/metrics-bom/4.1.14/metrics-bom-4.1.14.pom (5.3 kB at 55 kB/s)
Downloading from spring-milestones: https://repo.spring.io/libs-milestone-local/io/dropwizard/metrics/metrics-parent/4.1.14/metrics-parent-4.1.14.pom
Downloading from spring-releases: https://repo.spring.io/release/io/dropwizard/metrics/metrics-parent/4.1.14/metrics-parent-4.1.14.pom
Downloading from spring-plugins: https://repo.spring.io/plugins/io/dropwizard/metrics/metrics-parent/4.1.14/metrics-parent-4.1.14.pom
Downloading from central: https://repo.maven.apache.org/maven2/io/dropwizard/metrics/metrics-parent/4.1.14/metrics-parent-4.1.14.pom
Downloaded from central: https://repo.maven.apache.org/maven2/io/dropwizard/metrics/metrics-parent/4.1.14/metrics-parent-4.1.14.pom (16 kB at 159 kB/s)
Downloading from spring-milestones: https://repo.spring.io/libs-milestone-local/org/infinispan/infinispan-bom/11.0.5.Final/infinispan-bom-11.0.5.Final.pom
Downloading from spring-releases: https://repo.spring.io/release/org/infinispan/infinispan-bom/11.0.5.Final/infinispan-bom-11.0.5.Final.pom
Downloading from spring-plugins: https://repo.spring.io/plugins/org/infinispan/infinispan-bom/11.0.5.Final/infinispan-bom-11.0.5.Final.pom
Downloading from central: https://repo.maven.apache.org/maven2/org/infinispan/infinispan-bom/11.0.5.Final/infinispan-bom-11.0.5.Final.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/infinispan/infinispan-bom/11.0.5.Final/infinispan-bom-11.0.5.Final.pom (19 kB at 184 kB/s)
Downloading from spring-milestones: https://repo.spring.io/libs-milestone-local/org/infinispan/infinispan-build-configuration-parent/11.0.5.Final/infinispan-build-configuration-parent-11.0.5.Final.pom
Downloading from spring-releases: https://repo.spring.io/release/org/infinispan/infinispan-build-configuration-parent/11.0.5.Final/infinispan-build-configuration-parent-11.0.5.Final.pom
Downloading from spring-plugins: https://repo.spring.io/plugins/org/infinispan/infinispan-build-configuration-parent/11.0.5.Final/infinispan-build-configuration-parent-11.0.5.Final.pom
Downloading from central: https://repo.maven.apache.org/maven2/org/infinispan/infinispan-build-configuration-parent/11.0.5.Final/infinispan-build-configuration-parent-11.0.5.Final.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/infinispan/infinispan-build-configuration-parent/11.0.5.Final/infinispan-build-configuration-parent-11.0.5.Final.pom (13 kB at 130 kB/s)
Downloading from spring-milestones: https://repo.spring.io/libs-milestone-local/org/eclipse/jetty/jetty-bom/9.4.34.v20201102/jetty-bom-9.4.34.v20201102.pom
Downloading from spring-releases: https://repo.spring.io/release/org/eclipse/jetty/jetty-bom/9.4.34.v20201102/jetty-bom-9.4.34.v20201102.pom
Downloading from spring-plugins: https://repo.spring.io/plugins/org/eclipse/jetty/jetty-bom/9.4.34.v20201102/jetty-bom-9.4.34.v20201102.pom
Downloading from central: https://repo.maven.apache.org/maven2/org/eclipse/jetty/jetty-bom/9.4.34.v20201102/jetty-bom-9.4.34.v20201102.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/eclipse/jetty/jetty-bom/9.4.34.v20201102/jetty-bom-9.4.34.v20201102.pom (17 kB at 189 kB/s)
Downloading from spring-milestones: https://repo.spring.io/libs-milestone-local/org/jetbrains/kotlin/kotlin-bom/1.4.10/kotlin-bom-1.4.10.pom
Downloading from spring-releases: https://repo.spring.io/release/org/jetbrains/kotlin/kotlin-bom/1.4.10/kotlin-bom-1.4.10.pom
Downloading from spring-plugins: https://repo.spring.io/plugins/org/jetbrains/kotlin/kotlin-bom/1.4.10/kotlin-bom-1.4.10.pom
Downloading from central: https://repo.maven.apache.org/maven2/org/jetbrains/kotlin/kotlin-bom/1.4.10/kotlin-bom-1.4.10.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/jetbrains/kotlin/kotlin-bom/1.4.10/kotlin-bom-1.4.10.pom (9.3 kB at 114 kB/s)
Downloading from spring-milestones: https://repo.spring.io/libs-milestone-local/org/jetbrains/kotlinx/kotlinx-coroutines-bom/1.4.1/kotlinx-coroutines-bom-1.4.1.pom
Downloading from spring-releases: https://repo.spring.io/release/org/jetbrains/kotlinx/kotlinx-coroutines-bom/1.4.1/kotlinx-coroutines-bom-1.4.1.pom
Downloading from spring-plugins: https://repo.spring.io/plugins/org/jetbrains/kotlinx/kotlinx-coroutines-bom/1.4.1/kotlinx-coroutines-bom-1.4.1.pom
Downloading from central: https://repo.maven.apache.org/maven2/org/jetbrains/kotlinx/kotlinx-coroutines-bom/1.4.1/kotlinx-coroutines-bom-1.4.1.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/jetbrains/kotlinx/kotlinx-coroutines-bom/1.4.1/kotlinx-coroutines-bom-1.4.1.pom (4.1 kB at 51 kB/s)
Downloading from spring-milestones: https://repo.spring.io/libs-milestone-local/io/micrometer/micrometer-bom/1.6.1/micrometer-bom-1.6.1.pom
Downloading from spring-releases: https://repo.spring.io/release/io/micrometer/micrometer-bom/1.6.1/micrometer-bom-1.6.1.pom
Downloaded from spring-releases: https://repo.spring.io/release/io/micrometer/micrometer-bom/1.6.1/micrometer-bom-1.6.1.pom (6.8 kB at 11 kB/s)
Downloading from spring-milestones: https://repo.spring.io/libs-milestone-local/io/netty/netty-bom/4.1.54.Final/netty-bom-4.1.54.Final.pom
Downloading from spring-releases: https://repo.spring.io/release/io/netty/netty-bom/4.1.54.Final/netty-bom-4.1.54.Final.pom
Downloading from spring-plugins: https://repo.spring.io/plugins/io/netty/netty-bom/4.1.54.Final/netty-bom-4.1.54.Final.pom
Downloading from central: https://repo.maven.apache.org/maven2/io/netty/netty-bom/4.1.54.Final/netty-bom-4.1.54.Final.pom
Downloaded from central: https://repo.maven.apache.org/maven2/io/netty/netty-bom/4.1.54.Final/netty-bom-4.1.54.Final.pom (8.8 kB at 96 kB/s)
Downloading from spring-milestones: https://repo.spring.io/libs-milestone-local/io/projectreactor/reactor-bom/2020.0.1/reactor-bom-2020.0.1.pom
Downloading from spring-releases: https://repo.spring.io/release/io/projectreactor/reactor-bom/2020.0.1/reactor-bom-2020.0.1.pom
Downloaded from spring-releases: https://repo.spring.io/release/io/projectreactor/reactor-bom/2020.0.1/reactor-bom-2020.0.1.pom (4.5 kB at 11 kB/s)
Downloading from spring-milestones: https://repo.spring.io/libs-milestone-local/org/springframework/data/spring-data-bom/2020.0.1/spring-data-bom-2020.0.1.pom
Downloading from spring-releases: https://repo.spring.io/release/org/springframework/data/spring-data-bom/2020.0.1/spring-data-bom-2020.0.1.pom
Downloaded from spring-releases: https://repo.spring.io/release/org/springframework/data/spring-data-bom/2020.0.1/spring-data-bom-2020.0.1.pom (5.9 kB at 13 kB/s)
Downloading from spring-milestones: https://repo.spring.io/libs-milestone-local/org/springframework/spring-framework-bom/5.3.1/spring-framework-bom-5.3.1.pom
Downloading from spring-releases: https://repo.spring.io/release/org/springframework/spring-framework-bom/5.3.1/spring-framework-bom-5.3.1.pom
Downloaded from spring-releases: https://repo.spring.io/release/org/springframework/spring-framework-bom/5.3.1/spring-framework-bom-5.3.1.pom (5.6 kB at 12 kB/s)
Downloading from spring-milestones: https://repo.spring.io/libs-milestone-local/org/springframework/integration/spring-integration-bom/5.4.1/spring-integration-bom-5.4.1.pom
Downloading from spring-releases: https://repo.spring.io/release/org/springframework/integration/spring-integration-bom/5.4.1/spring-integration-bom-5.4.1.pom
Downloaded from spring-releases: https://repo.spring.io/release/org/springframework/integration/spring-integration-bom/5.4.1/spring-integration-bom-5.4.1.pom (9.5 kB at 15 kB/s)
Downloading from spring-milestones: https://repo.spring.io/libs-milestone-local/org/springframework/security/spring-security-bom/5.4.1/spring-security-bom-5.4.1.pom
Downloading from spring-releases: https://repo.spring.io/release/org/springframework/security/spring-security-bom/5.4.1/spring-security-bom-5.4.1.pom
Downloaded from spring-releases: https://repo.spring.io/release/org/springframework/security/spring-security-bom/5.4.1/spring-security-bom-5.4.1.pom (5.3 kB at 11 kB/s)
[INFO] ------------------------------------------------------------------------
[INFO] Reactor Build Order:
[INFO]
[INFO] Spring Cloud AWS Dependencies                                      [pom]
[INFO] Spring Cloud AWS                                                   [pom]
[INFO] Spring Cloud AWS Core                                              [jar]
[INFO] Spring Cloud AWS Context                                           [jar]
[INFO] Spring Cloud AWS JDBC                                              [jar]
[INFO] Spring Cloud AWS Messaging                                         [jar]
[INFO] Spring Cloud AWS Parameter Store Configuration                     [jar]
[INFO] Spring Cloud AWS SimpleEmail                                       [jar]
[INFO] Spring Cloud AWS Autoconfigure                                     [jar]
[INFO] Spring Cloud AWS Secrets Manager Configuration                     [jar]
[INFO] Spring Cloud AWS Starter                                           [jar]
[INFO] Spring Cloud AWS JDBC Starter                                      [jar]
[INFO] Spring Cloud AWS Messaging Starter                                 [jar]
[INFO] Spring Cloud AWS Parameter Store Configuration Starter             [jar]
[INFO] Spring Cloud AWS Secrets Manager Configuration Starter             [jar]
[INFO] Spring Cloud AWS SES Starter                                       [jar]
[INFO] Spring Cloud AWS Integration Tests                                 [jar]
[INFO] Spring Cloud AWS Docs                                              [jar]
[INFO]
[INFO] ------< org.springframework.cloud:spring-cloud-aws-dependencies >-------
[INFO] Building Spring Cloud AWS Dependencies 3.0.0-SNAPSHOT             [1/18]
[INFO] --------------------------------[ pom ]---------------------------------
[INFO]
[INFO] --- maven-clean-plugin:2.5:clean (default-clean) @ spring-cloud-aws-dependencies ---
[INFO]
[INFO] -------------< org.springframework.cloud:spring-cloud-aws >-------------
[INFO] Building Spring Cloud AWS 3.0.0-SNAPSHOT                          [2/18]
[INFO] --------------------------------[ pom ]---------------------------------
Downloading from spring-snapshots: https://repo.spring.io/libs-snapshot-local/org/codehaus/mojo/flatten-maven-plugin/maven-metadata.xml
Downloading from spring-releases: https://repo.spring.io/libs-release-local/org/codehaus/mojo/flatten-maven-plugin/maven-metadata.xml
Downloading from spring-milestones: https://repo.spring.io/libs-milestone-local/org/codehaus/mojo/flatten-maven-plugin/maven-metadata.xml
Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/mojo/flatten-maven-plugin/maven-metadata.xml
Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/mojo/flatten-maven-plugin/maven-metadata.xml (782 B at 7.1 kB/s)
Downloading from spring-milestones: https://repo.spring.io/libs-milestone-local/org/codehaus/mojo/flatten-maven-plugin/1.2.7/flatten-maven-plugin-1.2.7.pom
Downloading from spring-releases: https://repo.spring.io/libs-release-local/org/codehaus/mojo/flatten-maven-plugin/1.2.7/flatten-maven-plugin-1.2.7.pom
Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/mojo/flatten-maven-plugin/1.2.7/flatten-maven-plugin-1.2.7.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/mojo/flatten-maven-plugin/1.2.7/flatten-maven-plugin-1.2.7.pom (11 kB at 102 kB/s)
Downloading from spring-milestones: https://repo.spring.io/libs-milestone-local/org/codehaus/mojo/mojo-parent/61/mojo-parent-61.pom
Downloading from spring-releases: https://repo.spring.io/libs-release-local/org/codehaus/mojo/mojo-parent/61/mojo-parent-61.pom
Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/mojo/mojo-parent/61/mojo-parent-61.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/mojo/mojo-parent/61/mojo-parent-61.pom (30 kB at 267 kB/s)
Downloading from spring-milestones: https://repo.spring.io/libs-milestone-local/org/codehaus/mojo/flatten-maven-plugin/1.2.7/flatten-maven-plugin-1.2.7.jar
Downloading from spring-releases: https://repo.spring.io/libs-release-local/org/codehaus/mojo/flatten-maven-plugin/1.2.7/flatten-maven-plugin-1.2.7.jar
Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/mojo/flatten-maven-plugin/1.2.7/flatten-maven-plugin-1.2.7.jar
Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/mojo/flatten-maven-plugin/1.2.7/flatten-maven-plugin-1.2.7.jar (112 kB at 442 kB/s)
Downloading from spring-milestones: https://repo.spring.io/libs-milestone-local/org/apache/maven/plugins/maven-checkstyle-plugin/3.1.0/maven-checkstyle-plugin-3.1.0.pom
Downloading from spring-releases: https://repo.spring.io/libs-release-local/org/apache/maven/plugins/maven-checkstyle-plugin/3.1.0/maven-checkstyle-plugin-3.1.0.pom
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/plugins/maven-checkstyle-plugin/3.1.0/maven-checkstyle-plugin-3.1.0.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/plugins/maven-checkstyle-plugin/3.1.0/maven-checkstyle-plugin-3.1.0.pom (14 kB at 132 kB/s)
Downloading from spring-milestones: https://repo.spring.io/libs-milestone-local/org/apache/maven/plugins/maven-checkstyle-plugin/3.1.0/maven-checkstyle-plugin-3.1.0.jar
Downloading from spring-releases: https://repo.spring.io/libs-release-local/org/apache/maven/plugins/maven-checkstyle-plugin/3.1.0/maven-checkstyle-plugin-3.1.0.jar
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/plugins/maven-checkstyle-plugin/3.1.0/maven-checkstyle-plugin-3.1.0.jar
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/plugins/maven-checkstyle-plugin/3.1.0/maven-checkstyle-plugin-3.1.0.jar (110 kB at 656 kB/s)
Downloading from spring-milestones: https://repo.spring.io/libs-milestone-local/io/spring/javaformat/spring-javaformat-maven-plugin/0.0.25/spring-javaformat-maven-plugin-0.0.25.pom
Downloading from spring-releases: https://repo.spring.io/libs-release-local/io/spring/javaformat/spring-javaformat-maven-plugin/0.0.25/spring-javaformat-maven-plugin-0.0.25.pom
Downloaded from spring-releases: https://repo.spring.io/libs-release-local/io/spring/javaformat/spring-javaformat-maven-plugin/0.0.25/spring-javaformat-maven-plugin-0.0.25.pom (2.5 kB at 7.1 kB/s)
Downloading from spring-milestones: https://repo.spring.io/libs-milestone-local/io/spring/javaformat/spring-javaformat-maven/0.0.25/spring-javaformat-maven-0.0.25.pom
Downloading from spring-releases: https://repo.spring.io/libs-release-local/io/spring/javaformat/spring-javaformat-maven/0.0.25/spring-javaformat-maven-0.0.25.pom
Downloaded from spring-releases: https://repo.spring.io/libs-release-local/io/spring/javaformat/spring-javaformat-maven/0.0.25/spring-javaformat-maven-0.0.25.pom (1.3 kB at 3.4 kB/s)
Downloading from spring-milestones: https://repo.spring.io/libs-milestone-local/io/spring/javaformat/spring-javaformat-build/0.0.25/spring-javaformat-build-0.0.25.pom
Downloading from spring-releases: https://repo.spring.io/libs-release-local/io/spring/javaformat/spring-javaformat-build/0.0.25/spring-javaformat-build-0.0.25.pom
Downloaded from spring-releases: https://repo.spring.io/libs-release-local/io/spring/javaformat/spring-javaformat-build/0.0.25/spring-javaformat-build-0.0.25.pom (1.1 kB at 2.7 kB/s)
Downloading from spring-milestones: https://repo.spring.io/libs-milestone-local/io/spring/javaformat/spring-javaformat-maven-plugin/0.0.25/spring-javaformat-maven-plugin-0.0.25.jar
Downloading from spring-releases: https://repo.spring.io/libs-release-local/io/spring/javaformat/spring-javaformat-maven-plugin/0.0.25/spring-javaformat-maven-plugin-0.0.25.jar
Downloaded from spring-releases: https://repo.spring.io/libs-release-local/io/spring/javaformat/spring-javaformat-maven-plugin/0.0.25/spring-javaformat-maven-plugin-0.0.25.jar (18 kB at 22 kB/s)
Downloading from spring-milestones: https://repo.spring.io/libs-milestone-local/org/apache/maven/plugins/maven-javadoc-plugin/3.2.0/maven-javadoc-plugin-3.2.0.pom
Downloading from spring-releases: https://repo.spring.io/libs-release-local/org/apache/maven/plugins/maven-javadoc-plugin/3.2.0/maven-javadoc-plugin-3.2.0.pom
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/plugins/maven-javadoc-plugin/3.2.0/maven-javadoc-plugin-3.2.0.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/plugins/maven-javadoc-plugin/3.2.0/maven-javadoc-plugin-3.2.0.pom (20 kB at 56 kB/s)
Downloading from spring-milestones: https://repo.spring.io/libs-milestone-local/org/apache/maven/plugins/maven-javadoc-plugin/3.2.0/maven-javadoc-plugin-3.2.0.jar
Downloading from spring-releases: https://repo.spring.io/libs-release-local/org/apache/maven/plugins/maven-javadoc-plugin/3.2.0/maven-javadoc-plugin-3.2.0.jar
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/plugins/maven-javadoc-plugin/3.2.0/maven-javadoc-plugin-3.2.0.jar
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/plugins/maven-javadoc-plugin/3.2.0/maven-javadoc-plugin-3.2.0.jar (492 kB at 432 kB/s)
Downloading from spring-milestones: https://repo.spring.io/libs-milestone-local/org/apache/maven/plugins/maven-source-plugin/3.2.1/maven-source-plugin-3.2.1.pom
Downloading from spring-releases: https://repo.spring.io/libs-release-local/org/apache/maven/plugins/maven-source-plugin/3.2.1/maven-source-plugin-3.2.1.pom
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/plugins/maven-source-plugin/3.2.1/maven-source-plugin-3.2.1.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/plugins/maven-source-plugin/3.2.1/maven-source-plugin-3.2.1.pom (6.9 kB at 72 kB/s)
Downloading from spring-milestones: https://repo.spring.io/libs-milestone-local/org/apache/maven/plugins/maven-source-plugin/3.2.1/maven-source-plugin-3.2.1.jar
Downloading from spring-releases: https://repo.spring.io/libs-release-local/org/apache/maven/plugins/maven-source-plugin/3.2.1/maven-source-plugin-3.2.1.jar
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/plugins/maven-source-plugin/3.2.1/maven-source-plugin-3.2.1.jar
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/plugins/maven-source-plugin/3.2.1/maven-source-plugin-3.2.1.jar (32 kB at 292 kB/s)
Downloading from spring-milestones: https://repo.spring.io/libs-milestone-local/org/springframework/boot/spring-boot-starter-test/2.4.0/spring-boot-starter-test-2.4.0.pom
Downloading from spring-releases: https://repo.spring.io/release/org/springframework/boot/spring-boot-starter-test/2.4.0/spring-boot-starter-test-2.4.0.pom
Downloaded from spring-releases: https://repo.spring.io/release/org/springframework/boot/spring-boot-starter-test/2.4.0/spring-boot-starter-test-2.4.0.pom (4.7 kB at 11 kB/s)
Downloading from spring-milestones: https://repo.spring.io/libs-milestone-local/org/springframework/boot/spring-boot-starter/2.4.0/spring-boot-starter-2.4.0.pom
Downloading from spring-releases: https://repo.spring.io/release/org/springframework/boot/spring-boot-starter/2.4.0/spring-boot-starter-2.4.0.pom
Downloaded from spring-releases: https://repo.spring.io/release/org/springframework/boot/spring-boot-starter/2.4.0/spring-boot-starter-2.4.0.pom (3.1 kB at 9.5 kB/s)
Downloading from spring-milestones: https://repo.spring.io/libs-milestone-local/org/springframework/boot/spring-boot/2.4.0/spring-boot-2.4.0.pom
Downloading from spring-releases: https://repo.spring.io/release/org/springframework/boot/spring-boot/2.4.0/spring-boot-2.4.0.pom
Downloaded from spring-releases: https://repo.spring.io/release/org/springframework/boot/spring-boot/2.4.0/spring-boot-2.4.0.pom (2.2 kB at 5.4 kB/s)
Downloading from spring-milestones: https://repo.spring.io/libs-milestone-local/org/springframework/spring-core/5.3.1/spring-core-5.3.1.pom
Downloading from spring-releases: https://repo.spring.io/release/org/springframework/spring-core/5.3.1/spring-core-5.3.1.pom
Downloaded from spring-releases: https://repo.spring.io/release/org/springframework/spring-core/5.3.1/spring-core-5.3.1.pom (2.0 kB at 4.9 kB/s)
Downloading from spring-milestones: https://repo.spring.io/libs-milestone-local/org/springframework/spring-jcl/5.3.1/spring-jcl-5.3.1.pom
Downloading from spring-releases: https://repo.spring.io/release/org/springframework/spring-jcl/5.3.1/spring-jcl-5.3.1.pom
Downloaded from spring-releases: https://repo.spring.io/release/org/springframework/spring-jcl/5.3.1/spring-jcl-5.3.1.pom (1.8 kB at 4.5 kB/s)
Downloading from spring-milestones: https://repo.spring.io/libs-milestone-local/org/springframework/spring-context/5.3.1/spring-context-5.3.1.pom
Downloading from spring-releases: https://repo.spring.io/release/org/springframework/spring-context/5.3.1/spring-context-5.3.1.pom
Downloaded from spring-releases: https://repo.spring.io/release/org/springframework/spring-context/5.3.1/spring-context-5.3.1.pom (2.6 kB at 6.2 kB/s)
Downloading from spring-milestones: https://repo.spring.io/libs-milestone-local/org/springframework/spring-aop/5.3.1/spring-aop-5.3.1.pom
Downloading from spring-releases: https://repo.spring.io/release/org/springframework/spring-aop/5.3.1/spring-aop-5.3.1.pom
Downloaded from spring-releases: https://repo.spring.io/release/org/springframework/spring-aop/5.3.1/spring-aop-5.3.1.pom (2.2 kB at 5.2 kB/s)
Downloading from spring-milestones: https://repo.spring.io/libs-milestone-local/org/springframework/spring-beans/5.3.1/spring-beans-5.3.1.pom
Downloading from spring-releases: https://repo.spring.io/release/org/springframework/spring-beans/5.3.1/spring-beans-5.3.1.pom
Downloaded from spring-releases: https://repo.spring.io/release/org/springframework/spring-beans/5.3.1/spring-beans-5.3.1.pom (2.0 kB at 5.0 kB/s)
Downloading from spring-milestones: https://repo.spring.io/libs-milestone-local/org/springframework/spring-expression/5.3.1/spring-expression-5.3.1.pom
Downloading from spring-releases: https://repo.spring.io/release/org/springframework/spring-expression/5.3.1/spring-expression-5.3.1.pom
Downloaded from spring-releases: https://repo.spring.io/release/org/springframework/spring-expression/5.3.1/spring-expression-5.3.1.pom (2.1 kB at 5.1 kB/s)
Downloading from spring-milestones: https://repo.spring.io/libs-milestone-local/org/springframework/boot/spring-boot-autoconfigure/2.4.0/spring-boot-autoconfigure-2.4.0.pom
Downloading from spring-releases: https://repo.spring.io/release/org/springframework/boot/spring-boot-autoconfigure/2.4.0/spring-boot-autoconfigure-2.4.0.pom
Downloaded from spring-releases: https://repo.spring.io/release/org/springframework/boot/spring-boot-autoconfigure/2.4.0/spring-boot-autoconfigure-2.4.0.pom (2.1 kB at 5.0 kB/s)
Downloading from spring-milestones: https://repo.spring.io/libs-milestone-local/org/springframework/boot/spring-boot-starter-logging/2.4.0/spring-boot-starter-logging-2.4.0.pom
Downloading from spring-releases: https://repo.spring.io/release/org/springframework/boot/spring-boot-starter-logging/2.4.0/spring-boot-starter-logging-2.4.0.pom
Downloaded from spring-releases: https://repo.spring.io/release/org/springframework/boot/spring-boot-starter-logging/2.4.0/spring-boot-starter-logging-2.4.0.pom (2.5 kB at 6.7 kB/s)
Downloading from spring-milestones: https://repo.spring.io/libs-milestone-local/org/springframework/boot/spring-boot-test/2.4.0/spring-boot-test-2.4.0.pom
Downloading from spring-releases: https://repo.spring.io/release/org/springframework/boot/spring-boot-test/2.4.0/spring-boot-test-2.4.0.pom
Downloaded from spring-releases: https://repo.spring.io/release/org/springframework/boot/spring-boot-test/2.4.0/spring-boot-test-2.4.0.pom (2.1 kB at 5.6 kB/s)
Downloading from spring-milestones: https://repo.spring.io/libs-milestone-local/org/springframework/boot/spring-boot-test-autoconfigure/2.4.0/spring-boot-test-autoconfigure-2.4.0.pom
Downloading from spring-releases: https://repo.spring.io/release/org/springframework/boot/spring-boot-test-autoconfigure/2.4.0/spring-boot-test-autoconfigure-2.4.0.pom
Downloaded from spring-releases: https://repo.spring.io/release/org/springframework/boot/spring-boot-test-autoconfigure/2.4.0/spring-boot-test-autoconfigure-2.4.0.pom (2.5 kB at 6.3 kB/s)
Downloading from spring-milestones: https://repo.spring.io/libs-milestone-local/org/mockito/mockito-core/3.6.0/mockito-core-3.6.0.pom
Downloading from spring-releases: https://repo.spring.io/release/org/mockito/mockito-core/3.6.0/mockito-core-3.6.0.pom
Downloading from spring-plugins: https://repo.spring.io/plugins/org/mockito/mockito-core/3.6.0/mockito-core-3.6.0.pom
Downloading from central: https://repo.maven.apache.org/maven2/org/mockito/mockito-core/3.6.0/mockito-core-3.6.0.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/mockito/mockito-core/3.6.0/mockito-core-3.6.0.pom (26 kB at 197 kB/s)
Downloading from spring-milestones: https://repo.spring.io/libs-milestone-local/org/mockito/mockito-junit-jupiter/3.6.0/mockito-junit-jupiter-3.6.0.pom
Downloading from spring-releases: https://repo.spring.io/release/org/mockito/mockito-junit-jupiter/3.6.0/mockito-junit-jupiter-3.6.0.pom
Downloading from spring-plugins: https://repo.spring.io/plugins/org/mockito/mockito-junit-jupiter/3.6.0/mockito-junit-jupiter-3.6.0.pom
Downloading from central: https://repo.maven.apache.org/maven2/org/mockito/mockito-junit-jupiter/3.6.0/mockito-junit-jupiter-3.6.0.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/mockito/mockito-junit-jupiter/3.6.0/mockito-junit-jupiter-3.6.0.pom (25 kB at 174 kB/s)
Downloading from spring-milestones: https://repo.spring.io/libs-milestone-local/org/springframework/spring-test/5.3.1/spring-test-5.3.1.pom
Downloading from spring-releases: https://repo.spring.io/release/org/springframework/spring-test/5.3.1/spring-test-5.3.1.pom
Downloaded from spring-releases: https://repo.spring.io/release/org/springframework/spring-test/5.3.1/spring-test-5.3.1.pom (2.0 kB at 2.6 kB/s)
[INFO]
[INFO] --- maven-clean-plugin:2.5:clean (default-clean) @ spring-cloud-aws ---
[INFO]
[INFO] --- maven-checkstyle-plugin:3.1.0:check (checkstyle-validation) @ spring-cloud-aws ---
Downloading from spring-milestones: https://repo.spring.io/libs-milestone-local/com/puppycrawl/tools/checkstyle/8.29/checkstyle-8.29.pom
Downloading from spring-releases: https://repo.spring.io/libs-release-local/com/puppycrawl/tools/checkstyle/8.29/checkstyle-8.29.pom
Downloading from central: https://repo.maven.apache.org/maven2/com/puppycrawl/tools/checkstyle/8.29/checkstyle-8.29.pom
Downloaded from central: https://repo.maven.apache.org/maven2/com/puppycrawl/tools/checkstyle/8.29/checkstyle-8.29.pom (127 kB at 90 kB/s)
Downloading from spring-milestones: https://repo.spring.io/libs-milestone-local/info/picocli/picocli/4.1.4/picocli-4.1.4.pom
Downloading from spring-releases: https://repo.spring.io/libs-release-local/info/picocli/picocli/4.1.4/picocli-4.1.4.pom
Downloading from central: https://repo.maven.apache.org/maven2/info/picocli/picocli/4.1.4/picocli-4.1.4.pom
Downloaded from central: https://repo.maven.apache.org/maven2/info/picocli/picocli/4.1.4/picocli-4.1.4.pom (1.4 kB at 15 kB/s)
Downloading from spring-milestones: https://repo.spring.io/libs-milestone-local/org/antlr/antlr4-runtime/4.8-1/antlr4-runtime-4.8-1.pom
Downloading from spring-releases: https://repo.spring.io/libs-release-local/org/antlr/antlr4-runtime/4.8-1/antlr4-runtime-4.8-1.pom
Downloading from central: https://repo.maven.apache.org/maven2/org/antlr/antlr4-runtime/4.8-1/antlr4-runtime-4.8-1.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/antlr/antlr4-runtime/4.8-1/antlr4-runtime-4.8-1.pom (3.6 kB at 33 kB/s)
Downloading from spring-milestones: https://repo.spring.io/libs-milestone-local/org/antlr/antlr4-master/4.8-1/antlr4-master-4.8-1.pom
Downloading from spring-releases: https://repo.spring.io/libs-release-local/org/antlr/antlr4-master/4.8-1/antlr4-master-4.8-1.pom
Downloading from central: https://repo.maven.apache.org/maven2/org/antlr/antlr4-master/4.8-1/antlr4-master-4.8-1.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/antlr/antlr4-master/4.8-1/antlr4-master-4.8-1.pom (4.4 kB at 41 kB/s)
Downloading from spring-milestones: https://repo.spring.io/libs-milestone-local/com/google/guava/guava/28.2-jre/guava-28.2-jre.pom
Downloading from spring-releases: https://repo.spring.io/libs-release-local/com/google/guava/guava/28.2-jre/guava-28.2-jre.pom
Downloading from central: https://repo.maven.apache.org/maven2/com/google/guava/guava/28.2-jre/guava-28.2-jre.pom
Downloaded from central: https://repo.maven.apache.org/maven2/com/google/guava/guava/28.2-jre/guava-28.2-jre.pom (11 kB at 83 kB/s)
Downloading from spring-milestones: https://repo.spring.io/libs-milestone-local/com/google/guava/guava-parent/28.2-jre/guava-parent-28.2-jre.pom
Downloading from spring-releases: https://repo.spring.io/libs-release-local/com/google/guava/guava-parent/28.2-jre/guava-parent-28.2-jre.pom
Downloading from central: https://repo.maven.apache.org/maven2/com/google/guava/guava-parent/28.2-jre/guava-parent-28.2-jre.pom
Downloaded from central: https://repo.maven.apache.org/maven2/com/google/guava/guava-parent/28.2-jre/guava-parent-28.2-jre.pom (13 kB at 107 kB/s)
Downloading from spring-milestones: https://repo.spring.io/libs-milestone-local/org/checkerframework/checker-qual/2.10.0/checker-qual-2.10.0.pom
Downloading from spring-releases: https://repo.spring.io/libs-release-local/org/checkerframework/checker-qual/2.10.0/checker-qual-2.10.0.pom
Downloading from central: https://repo.maven.apache.org/maven2/org/checkerframework/checker-qual/2.10.0/checker-qual-2.10.0.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/checkerframework/checker-qual/2.10.0/checker-qual-2.10.0.pom (2.4 kB at 28 kB/s)
Downloading from spring-milestones: https://repo.spring.io/libs-milestone-local/net/sf/saxon/Saxon-HE/9.9.1-6/Saxon-HE-9.9.1-6.pom
Downloading from spring-releases: https://repo.spring.io/libs-release-local/net/sf/saxon/Saxon-HE/9.9.1-6/Saxon-HE-9.9.1-6.pom
Downloading from central: https://repo.maven.apache.org/maven2/net/sf/saxon/Saxon-HE/9.9.1-6/Saxon-HE-9.9.1-6.pom
Downloaded from central: https://repo.maven.apache.org/maven2/net/sf/saxon/Saxon-HE/9.9.1-6/Saxon-HE-9.9.1-6.pom (3.9 kB at 47 kB/s)
Downloading from spring-milestones: https://repo.spring.io/libs-milestone-local/io/spring/javaformat/spring-javaformat-checkstyle/0.0.25/spring-javaformat-checkstyle-0.0.25.pom
Downloading from spring-releases: https://repo.spring.io/libs-release-local/io/spring/javaformat/spring-javaformat-checkstyle/0.0.25/spring-javaformat-checkstyle-0.0.25.pom
Downloaded from spring-releases: https://repo.spring.io/libs-release-local/io/spring/javaformat/spring-javaformat-checkstyle/0.0.25/spring-javaformat-checkstyle-0.0.25.pom (1.5 kB at 3.8 kB/s)
Downloading from spring-milestones: https://repo.spring.io/libs-milestone-local/io/spring/javaformat/spring-javaformat/0.0.25/spring-javaformat-0.0.25.pom
Downloading from spring-releases: https://repo.spring.io/libs-release-local/io/spring/javaformat/spring-javaformat/0.0.25/spring-javaformat-0.0.25.pom
Downloaded from spring-releases: https://repo.spring.io/libs-release-local/io/spring/javaformat/spring-javaformat/0.0.25/spring-javaformat-0.0.25.pom (1.3 kB at 3.1 kB/s)
Downloading from spring-milestones: https://repo.spring.io/libs-milestone-local/com/puppycrawl/tools/checkstyle/8.32/checkstyle-8.32.pom
Downloading from spring-releases: https://repo.spring.io/libs-release-local/com/puppycrawl/tools/checkstyle/8.32/checkstyle-8.32.pom
Downloading from central: https://repo.maven.apache.org/maven2/com/puppycrawl/tools/checkstyle/8.32/checkstyle-8.32.pom
Downloaded from central: https://repo.maven.apache.org/maven2/com/puppycrawl/tools/checkstyle/8.32/checkstyle-8.32.pom (127 kB at 477 kB/s)
Downloading from spring-milestones: https://repo.spring.io/libs-milestone-local/info/picocli/picocli/4.2.0/picocli-4.2.0.pom
Downloading from spring-releases: https://repo.spring.io/libs-release-local/info/picocli/picocli/4.2.0/picocli-4.2.0.pom
Downloading from central: https://repo.maven.apache.org/maven2/info/picocli/picocli/4.2.0/picocli-4.2.0.pom
Downloaded from central: https://repo.maven.apache.org/maven2/info/picocli/picocli/4.2.0/picocli-4.2.0.pom (1.4 kB at 15 kB/s)
Downloading from spring-milestones: https://repo.spring.io/libs-milestone-local/net/sf/saxon/Saxon-HE/9.9.1-7/Saxon-HE-9.9.1-7.pom
Downloading from spring-releases: https://repo.spring.io/libs-release-local/net/sf/saxon/Saxon-HE/9.9.1-7/Saxon-HE-9.9.1-7.pom
Downloading from central: https://repo.maven.apache.org/maven2/net/sf/saxon/Saxon-HE/9.9.1-7/Saxon-HE-9.9.1-7.pom
Downloaded from central: https://repo.maven.apache.org/maven2/net/sf/saxon/Saxon-HE/9.9.1-7/Saxon-HE-9.9.1-7.pom (4.1 kB at 40 kB/s)
Downloading from spring-milestones: https://repo.spring.io/libs-milestone-local/org/springframework/cloud/spring-cloud-build-tools/3.0.0-RC1/spring-cloud-build-tools-3.0.0-RC1.pom
Downloaded from spring-milestones: https://repo.spring.io/libs-milestone-local/org/springframework/cloud/spring-cloud-build-tools/3.0.0-RC1/spring-cloud-build-tools-3.0.0-RC1.pom (822 B at 2.0 kB/s)
Downloading from spring-milestones: https://repo.spring.io/libs-milestone-local/io/spring/nohttp/nohttp-checkstyle/0.0.5.RELEASE/nohttp-checkstyle-0.0.5.RELEASE.pom
Downloading from spring-releases: https://repo.spring.io/libs-release-local/io/spring/nohttp/nohttp-checkstyle/0.0.5.RELEASE/nohttp-checkstyle-0.0.5.RELEASE.pom
Downloading from central: https://repo.maven.apache.org/maven2/io/spring/nohttp/nohttp-checkstyle/0.0.5.RELEASE/nohttp-checkstyle-0.0.5.RELEASE.pom
Downloaded from central: https://repo.maven.apache.org/maven2/io/spring/nohttp/nohttp-checkstyle/0.0.5.RELEASE/nohttp-checkstyle-0.0.5.RELEASE.pom (2.5 kB at 31 kB/s)
Downloading from spring-milestones: https://repo.spring.io/libs-milestone-local/com/puppycrawl/tools/checkstyle/8.33/checkstyle-8.33.pom
Downloading from spring-releases: https://repo.spring.io/libs-release-local/com/puppycrawl/tools/checkstyle/8.33/checkstyle-8.33.pom
Downloading from central: https://repo.maven.apache.org/maven2/com/puppycrawl/tools/checkstyle/8.33/checkstyle-8.33.pom
Downloaded from central: https://repo.maven.apache.org/maven2/com/puppycrawl/tools/checkstyle/8.33/checkstyle-8.33.pom (127 kB at 477 kB/s)
Downloading from spring-milestones: https://repo.spring.io/libs-milestone-local/info/picocli/picocli/4.3.1/picocli-4.3.1.pom
Downloading from spring-releases: https://repo.spring.io/libs-release-local/info/picocli/picocli/4.3.1/picocli-4.3.1.pom
Downloading from central: https://repo.maven.apache.org/maven2/info/picocli/picocli/4.3.1/picocli-4.3.1.pom
Downloaded from central: https://repo.maven.apache.org/maven2/info/picocli/picocli/4.3.1/picocli-4.3.1.pom (1.4 kB at 8.4 kB/s)
Downloading from spring-milestones: https://repo.spring.io/libs-milestone-local/io/spring/nohttp/nohttp/0.0.5.RELEASE/nohttp-0.0.5.RELEASE.pom
Downloading from spring-releases: https://repo.spring.io/libs-release-local/io/spring/nohttp/nohttp/0.0.5.RELEASE/nohttp-0.0.5.RELEASE.pom
Downloading from central: https://repo.maven.apache.org/maven2/io/spring/nohttp/nohttp/0.0.5.RELEASE/nohttp-0.0.5.RELEASE.pom
Downloaded from central: https://repo.maven.apache.org/maven2/io/spring/nohttp/nohttp/0.0.5.RELEASE/nohttp-0.0.5.RELEASE.pom (2.5 kB at 22 kB/s)
Downloading from spring-milestones: https://repo.spring.io/libs-milestone-local/org/apache/maven/reporting/maven-reporting-impl/2.3/maven-reporting-impl-2.3.pom
Downloading from spring-releases: https://repo.spring.io/libs-release-local/org/apache/maven/reporting/maven-reporting-impl/2.3/maven-reporting-impl-2.3.pom
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/reporting/maven-reporting-impl/2.3/maven-reporting-impl-2.3.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/reporting/maven-reporting-impl/2.3/maven-reporting-impl-2.3.pom (5.0 kB at 49 kB/s)
Downloading from spring-milestones: https://repo.spring.io/libs-milestone-local/org/apache/maven/doxia/doxia-sink-api/1.2/doxia-sink-api-1.2.pom
Downloading from spring-releases: https://repo.spring.io/libs-release-local/org/apache/maven/doxia/doxia-sink-api/1.2/doxia-sink-api-1.2.pom
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/doxia/doxia-sink-api/1.2/doxia-sink-api-1.2.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/doxia/doxia-sink-api/1.2/doxia-sink-api-1.2.pom (1.6 kB at 19 kB/s)
Downloading from spring-milestones: https://repo.spring.io/libs-milestone-local/org/apache/maven/doxia/doxia/1.2/doxia-1.2.pom
Downloading from spring-releases: https://repo.spring.io/libs-release-local/org/apache/maven/doxia/doxia/1.2/doxia-1.2.pom
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/doxia/doxia/1.2/doxia-1.2.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/doxia/doxia/1.2/doxia-1.2.pom (19 kB at 167 kB/s)
Downloading from spring-milestones: https://repo.spring.io/libs-milestone-local/org/apache/maven/doxia/doxia-logging-api/1.2/doxia-logging-api-1.2.pom
Downloading from spring-releases: https://repo.spring.io/libs-release-local/org/apache/maven/doxia/doxia-logging-api/1.2/doxia-logging-api-1.2.pom
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/doxia/doxia-logging-api/1.2/doxia-logging-api-1.2.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/doxia/doxia-logging-api/1.2/doxia-logging-api-1.2.pom (1.6 kB at 13 kB/s)
Downloading from spring-milestones: https://repo.spring.io/libs-milestone-local/org/apache/maven/doxia/doxia-core/1.2/doxia-core-1.2.pom
Downloading from spring-releases: https://repo.spring.io/libs-release-local/org/apache/maven/doxia/doxia-core/1.2/doxia-core-1.2.pom
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/doxia/doxia-core/1.2/doxia-core-1.2.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/doxia/doxia-core/1.2/doxia-core-1.2.pom (4.0 kB at 31 kB/s)
Downloading from spring-milestones: https://repo.spring.io/libs-milestone-local/org/apache/maven/doxia/doxia-site-renderer/1.2/doxia-site-renderer-1.2.pom
Downloading from spring-releases: https://repo.spring.io/libs-release-local/org/apache/maven/doxia/doxia-site-renderer/1.2/doxia-site-renderer-1.2.pom
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/doxia/doxia-site-renderer/1.2/doxia-site-renderer-1.2.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/doxia/doxia-site-renderer/1.2/doxia-site-renderer-1.2.pom (6.2 kB at 70 kB/s)
Downloading from spring-milestones: https://repo.spring.io/libs-milestone-local/org/apache/maven/doxia/doxia-sitetools/1.2/doxia-sitetools-1.2.pom
Downloading from spring-releases: https://repo.spring.io/libs-release-local/org/apache/maven/doxia/doxia-sitetools/1.2/doxia-sitetools-1.2.pom
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/doxia/doxia-sitetools/1.2/doxia-sitetools-1.2.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/doxia/doxia-sitetools/1.2/doxia-sitetools-1.2.pom (16 kB at 159 kB/s)
Downloading from spring-milestones: https://repo.spring.io/libs-milestone-local/org/apache/maven/doxia/doxia-decoration-model/1.2/doxia-decoration-model-1.2.pom
Downloading from spring-releases: https://repo.spring.io/libs-release-local/org/apache/maven/doxia/doxia-decoration-model/1.2/doxia-decoration-model-1.2.pom
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/doxia/doxia-decoration-model/1.2/doxia-decoration-model-1.2.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/doxia/doxia-decoration-model/1.2/doxia-decoration-model-1.2.pom (3.1 kB at 26 kB/s)
Downloading from spring-milestones: https://repo.spring.io/libs-milestone-local/org/apache/maven/doxia/doxia-module-xhtml/1.2/doxia-module-xhtml-1.2.pom
Downloading from spring-releases: https://repo.spring.io/libs-release-local/org/apache/maven/doxia/doxia-module-xhtml/1.2/doxia-module-xhtml-1.2.pom
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/doxia/doxia-module-xhtml/1.2/doxia-module-xhtml-1.2.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/doxia/doxia-module-xhtml/1.2/doxia-module-xhtml-1.2.pom (1.8 kB at 18 kB/s)
Downloading from spring-milestones: https://repo.spring.io/libs-milestone-local/org/apache/maven/doxia/doxia-modules/1.2/doxia-modules-1.2.pom
Downloading from spring-releases: https://repo.spring.io/libs-release-local/org/apache/maven/doxia/doxia-modules/1.2/doxia-modules-1.2.pom
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/doxia/doxia-modules/1.2/doxia-modules-1.2.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/doxia/doxia-modules/1.2/doxia-modules-1.2.pom (2.5 kB at 23 kB/s)
Downloading from spring-milestones: https://repo.spring.io/libs-milestone-local/org/apache/maven/doxia/doxia-module-fml/1.2/doxia-module-fml-1.2.pom
Downloading from spring-releases: https://repo.spring.io/libs-release-local/org/apache/maven/doxia/doxia-module-fml/1.2/doxia-module-fml-1.2.pom
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/doxia/doxia-module-fml/1.2/doxia-module-fml-1.2.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/doxia/doxia-module-fml/1.2/doxia-module-fml-1.2.pom (5.6 kB at 57 kB/s)
Downloading from spring-milestones: https://repo.spring.io/libs-milestone-local/org/apache/maven/doxia/doxia-integration-tools/1.6/doxia-integration-tools-1.6.pom
Downloading from spring-releases: https://repo.spring.io/libs-release-local/org/apache/maven/doxia/doxia-integration-tools/1.6/doxia-integration-tools-1.6.pom
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/doxia/doxia-integration-tools/1.6/doxia-integration-tools-1.6.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/doxia/doxia-integration-tools/1.6/doxia-integration-tools-1.6.pom (7.0 kB at 79 kB/s)
Downloading from spring-milestones: https://repo.spring.io/libs-milestone-local/org/apache/maven/doxia/doxia-tools/3/doxia-tools-3.pom
Downloading from spring-releases: https://repo.spring.io/libs-release-local/org/apache/maven/doxia/doxia-tools/3/doxia-tools-3.pom
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/doxia/doxia-tools/3/doxia-tools-3.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/doxia/doxia-tools/3/doxia-tools-3.pom (9.9 kB at 102 kB/s)
Downloading from spring-milestones: https://repo.spring.io/libs-milestone-local/org/apache/maven/doxia/doxia-logging-api/1.6/doxia-logging-api-1.6.pom
Downloading from spring-releases: https://repo.spring.io/libs-release-local/org/apache/maven/doxia/doxia-logging-api/1.6/doxia-logging-api-1.6.pom
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/doxia/doxia-logging-api/1.6/doxia-logging-api-1.6.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/doxia/doxia-logging-api/1.6/doxia-logging-api-1.6.pom (1.5 kB at 3.5 kB/s)
Downloading from spring-milestones: https://repo.spring.io/libs-milestone-local/org/apache/maven/doxia/doxia/1.6/doxia-1.6.pom
Downloading from spring-releases: https://repo.spring.io/libs-release-local/org/apache/maven/doxia/doxia/1.6/doxia-1.6.pom
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/doxia/doxia/1.6/doxia-1.6.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/doxia/doxia/1.6/doxia-1.6.pom (19 kB at 206 kB/s)
Downloading from spring-milestones: https://repo.spring.io/libs-milestone-local/org/apache/maven/doxia/doxia-decoration-model/1.6/doxia-decoration-model-1.6.pom
Downloading from spring-releases: https://repo.spring.io/libs-release-local/org/apache/maven/doxia/doxia-decoration-model/1.6/doxia-decoration-model-1.6.pom
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/doxia/doxia-decoration-model/1.6/doxia-decoration-model-1.6.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/doxia/doxia-decoration-model/1.6/doxia-decoration-model-1.6.pom (3.0 kB at 33 kB/s)
Downloading from spring-milestones: https://repo.spring.io/libs-milestone-local/org/apache/maven/doxia/doxia-sitetools/1.6/doxia-sitetools-1.6.pom
Downloading from spring-releases: https://repo.spring.io/libs-release-local/org/apache/maven/doxia/doxia-sitetools/1.6/doxia-sitetools-1.6.pom
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/doxia/doxia-sitetools/1.6/doxia-sitetools-1.6.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/doxia/doxia-sitetools/1.6/doxia-sitetools-1.6.pom (18 kB at 174 kB/s)
Downloading from spring-milestones: https://repo.spring.io/libs-milestone-local/org/codehaus/plexus/plexus-resources/1.1.0/plexus-resources-1.1.0.pom
Downloading from spring-releases: https://repo.spring.io/libs-release-local/org/codehaus/plexus/plexus-resources/1.1.0/plexus-resources-1.1.0.pom
Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-resources/1.1.0/plexus-resources-1.1.0.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-resources/1.1.0/plexus-resources-1.1.0.pom (3.2 kB at 18 kB/s)
Downloading from spring-milestones: https://repo.spring.io/libs-milestone-local/com/puppycrawl/tools/checkstyle/8.29/checkstyle-8.29.jar
Downloading from spring-milestones: https://repo.spring.io/libs-milestone-local/org/checkerframework/checker-qual/2.10.0/checker-qual-2.10.0.jar
Downloading from spring-milestones: https://repo.spring.io/libs-milestone-local/com/google/guava/guava/28.2-jre/guava-28.2-jre.jar
Downloading from spring-milestones: https://repo.spring.io/libs-milestone-local/org/antlr/antlr4-runtime/4.8-1/antlr4-runtime-4.8-1.jar
Downloading from spring-milestones: https://repo.spring.io/libs-milestone-local/info/picocli/picocli/4.1.4/picocli-4.1.4.jar
Downloading from spring-milestones: https://repo.spring.io/libs-milestone-local/net/sf/saxon/Saxon-HE/9.9.1-6/Saxon-HE-9.9.1-6.jar
Downloading from spring-milestones: https://repo.spring.io/libs-milestone-local/io/spring/javaformat/spring-javaformat-checkstyle/0.0.25/spring-javaformat-checkstyle-0.0.25.jar
Downloading from spring-milestones: https://repo.spring.io/libs-milestone-local/org/springframework/cloud/spring-cloud-build-tools/3.0.0-RC1/spring-cloud-build-tools-3.0.0-RC1.jar
Downloading from spring-milestones: https://repo.spring.io/libs-milestone-local/io/spring/nohttp/nohttp-checkstyle/0.0.5.RELEASE/nohttp-checkstyle-0.0.5.RELEASE.jar
Downloading from spring-milestones: https://repo.spring.io/libs-milestone-local/io/spring/nohttp/nohttp/0.0.5.RELEASE/nohttp-0.0.5.RELEASE.jar
Downloading from spring-milestones: https://repo.spring.io/libs-milestone-local/org/apache/maven/reporting/maven-reporting-impl/2.3/maven-reporting-impl-2.3.jar
Downloading from spring-milestones: https://repo.spring.io/libs-milestone-local/org/apache/maven/shared/maven-shared-utils/0.6/maven-shared-utils-0.6.jar
Downloading from spring-milestones: https://repo.spring.io/libs-milestone-local/org/apache/maven/doxia/doxia-core/1.2/doxia-core-1.2.jar
Downloading from spring-milestones: https://repo.spring.io/libs-milestone-local/org/apache/maven/doxia/doxia-integration-tools/1.6/doxia-integration-tools-1.6.jar
Downloading from spring-milestones: https://repo.spring.io/libs-milestone-local/org/codehaus/plexus/plexus-resources/1.1.0/plexus-resources-1.1.0.jar
Downloaded from spring-milestones: https://repo.spring.io/libs-milestone-local/org/springframework/cloud/spring-cloud-build-tools/3.0.0-RC1/spring-cloud-build-tools-3.0.0-RC1.jar (10 kB at 6.8 kB/s)
Downloading from spring-releases: https://repo.spring.io/libs-release-local/com/puppycrawl/tools/checkstyle/8.29/checkstyle-8.29.jar
Downloading from spring-releases: https://repo.spring.io/libs-release-local/com/google/guava/guava/28.2-jre/guava-28.2-jre.jar
Downloading from spring-releases: https://repo.spring.io/libs-release-local/org/antlr/antlr4-runtime/4.8-1/antlr4-runtime-4.8-1.jar
Downloading from spring-releases: https://repo.spring.io/libs-release-local/info/picocli/picocli/4.1.4/picocli-4.1.4.jar
Downloading from spring-releases: https://repo.spring.io/libs-release-local/org/checkerframework/checker-qual/2.10.0/checker-qual-2.10.0.jar
Downloading from spring-releases: https://repo.spring.io/libs-release-local/net/sf/saxon/Saxon-HE/9.9.1-6/Saxon-HE-9.9.1-6.jar
Downloading from spring-releases: https://repo.spring.io/libs-release-local/io/spring/nohttp/nohttp-checkstyle/0.0.5.RELEASE/nohttp-checkstyle-0.0.5.RELEASE.jar
Downloading from spring-releases: https://repo.spring.io/libs-release-local/io/spring/javaformat/spring-javaformat-checkstyle/0.0.25/spring-javaformat-checkstyle-0.0.25.jar
Downloading from spring-releases: https://repo.spring.io/libs-release-local/io/spring/nohttp/nohttp/0.0.5.RELEASE/nohttp-0.0.5.RELEASE.jar
Downloading from spring-releases: https://repo.spring.io/libs-release-local/org/apache/maven/reporting/maven-reporting-impl/2.3/maven-reporting-impl-2.3.jar
Downloading from spring-releases: https://repo.spring.io/libs-release-local/org/apache/maven/shared/maven-shared-utils/0.6/maven-shared-utils-0.6.jar
Downloading from spring-releases: https://repo.spring.io/libs-release-local/org/apache/maven/doxia/doxia-core/1.2/doxia-core-1.2.jar
Downloading from spring-releases: https://repo.spring.io/libs-release-local/org/apache/maven/doxia/doxia-integration-tools/1.6/doxia-integration-tools-1.6.jar
Downloading from spring-releases: https://repo.spring.io/libs-release-local/org/codehaus/plexus/plexus-resources/1.1.0/plexus-resources-1.1.0.jar
Downloaded from spring-releases: https://repo.spring.io/libs-release-local/io/spring/javaformat/spring-javaformat-checkstyle/0.0.25/spring-javaformat-checkstyle-0.0.25.jar (49 kB at 55 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/com/puppycrawl/tools/checkstyle/8.29/checkstyle-8.29.jar
Downloading from central: https://repo.maven.apache.org/maven2/com/google/guava/guava/28.2-jre/guava-28.2-jre.jar
Downloading from central: https://repo.maven.apache.org/maven2/org/antlr/antlr4-runtime/4.8-1/antlr4-runtime-4.8-1.jar
Downloading from central: https://repo.maven.apache.org/maven2/info/picocli/picocli/4.1.4/picocli-4.1.4.jar
Downloading from central: https://repo.maven.apache.org/maven2/org/checkerframework/checker-qual/2.10.0/checker-qual-2.10.0.jar
Downloaded from central: https://repo.maven.apache.org/maven2/org/checkerframework/checker-qual/2.10.0/checker-qual-2.10.0.jar (201 kB at 243 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/net/sf/saxon/Saxon-HE/9.9.1-6/Saxon-HE-9.9.1-6.jar
Downloaded from central: https://repo.maven.apache.org/maven2/info/picocli/picocli/4.1.4/picocli-4.1.4.jar (352 kB at 153 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/io/spring/nohttp/nohttp-checkstyle/0.0.5.RELEASE/nohttp-checkstyle-0.0.5.RELEASE.jar
Downloaded from central: https://repo.maven.apache.org/maven2/io/spring/nohttp/nohttp-checkstyle/0.0.5.RELEASE/nohttp-checkstyle-0.0.5.RELEASE.jar (4.9 kB at 2.0 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/io/spring/nohttp/nohttp/0.0.5.RELEASE/nohttp-0.0.5.RELEASE.jar
Downloaded from central: https://repo.maven.apache.org/maven2/io/spring/nohttp/nohttp/0.0.5.RELEASE/nohttp-0.0.5.RELEASE.jar (25 kB at 9.2 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/reporting/maven-reporting-impl/2.3/maven-reporting-impl-2.3.jar
Downloaded from central: https://repo.maven.apache.org/maven2/org/antlr/antlr4-runtime/4.8-1/antlr4-runtime-4.8-1.jar (338 kB at 117 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/shared/maven-shared-utils/0.6/maven-shared-utils-0.6.jar
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/reporting/maven-reporting-impl/2.3/maven-reporting-impl-2.3.jar (18 kB at 6.2 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/doxia/doxia-core/1.2/doxia-core-1.2.jar
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/shared/maven-shared-utils/0.6/maven-shared-utils-0.6.jar (165 kB at 44 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/doxia/doxia-integration-tools/1.6/doxia-integration-tools-1.6.jar
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/doxia/doxia-core/1.2/doxia-core-1.2.jar (154 kB at 41 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-resources/1.1.0/plexus-resources-1.1.0.jar
Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-resources/1.1.0/plexus-resources-1.1.0.jar (23 kB at 5.8 kB/s)
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/doxia/doxia-integration-tools/1.6/doxia-integration-tools-1.6.jar (45 kB at 11 kB/s)
Downloaded from central: https://repo.maven.apache.org/maven2/com/puppycrawl/tools/checkstyle/8.29/checkstyle-8.29.jar (1.3 MB at 223 kB/s)
Downloaded from central: https://repo.maven.apache.org/maven2/com/google/guava/guava/28.2-jre/guava-28.2-jre.jar (2.8 MB at 339 kB/s)
Downloaded from central: https://repo.maven.apache.org/maven2/net/sf/saxon/Saxon-HE/9.9.1-6/Saxon-HE-9.9.1-6.jar (5.5 MB at 530 kB/s)
[INFO] Starting audit...
Audit done.
[INFO]
[INFO] --- maven-checkstyle-plugin:3.1.0:check (no-http-checkstyle-validation) @ spring-cloud-aws ---
[INFO]
[INFO] --- spring-javaformat-maven-plugin:0.0.25:validate (default) @ spring-cloud-aws ---
Downloading from spring-milestones: https://repo.spring.io/libs-milestone-local/io/spring/javaformat/spring-javaformat-formatter/0.0.25/spring-javaformat-formatter-0.0.25.pom
Downloading from spring-releases: https://repo.spring.io/libs-release-local/io/spring/javaformat/spring-javaformat-formatter/0.0.25/spring-javaformat-formatter-0.0.25.pom
Downloaded from spring-releases: https://repo.spring.io/libs-release-local/io/spring/javaformat/spring-javaformat-formatter/0.0.25/spring-javaformat-formatter-0.0.25.pom (1.8 kB at 3.5 kB/s)
Downloading from spring-milestones: https://repo.spring.io/libs-milestone-local/io/spring/javaformat/spring-javaformat-formatter-eclipse/0.0.25/spring-javaformat-formatter-eclipse-0.0.25.pom
Downloading from spring-releases: https://repo.spring.io/libs-release-local/io/spring/javaformat/spring-javaformat-formatter-eclipse/0.0.25/spring-javaformat-formatter-eclipse-0.0.25.pom
Downloaded from spring-releases: https://repo.spring.io/libs-release-local/io/spring/javaformat/spring-javaformat-formatter-eclipse/0.0.25/spring-javaformat-formatter-eclipse-0.0.25.pom (1.6 kB at 3.8 kB/s)
Downloading from spring-milestones: https://repo.spring.io/libs-milestone-local/io/spring/javaformat/spring-javaformat-formatter-eclipse-runtime/0.0.25/spring-javaformat-formatter-eclipse-runtime-0.0.25.pom
Downloading from spring-releases: https://repo.spring.io/libs-release-local/io/spring/javaformat/spring-javaformat-formatter-eclipse-runtime/0.0.25/spring-javaformat-formatter-eclipse-runtime-0.0.25.pom
Downloaded from spring-releases: https://repo.spring.io/libs-release-local/io/spring/javaformat/spring-javaformat-formatter-eclipse-runtime/0.0.25/spring-javaformat-formatter-eclipse-runtime-0.0.25.pom (1.9 kB at 3.7 kB/s)
Downloading from spring-milestones: https://repo.spring.io/libs-milestone-local/io/spring/javaformat/spring-javaformat-formatter/0.0.25/spring-javaformat-formatter-0.0.25.jar
Downloading from spring-milestones: https://repo.spring.io/libs-milestone-local/io/spring/javaformat/spring-javaformat-formatter-eclipse-runtime/0.0.25/spring-javaformat-formatter-eclipse-runtime-0.0.25.jar
Downloading from spring-milestones: https://repo.spring.io/libs-milestone-local/io/spring/javaformat/spring-javaformat-formatter-eclipse/0.0.25/spring-javaformat-formatter-eclipse-0.0.25.jar
Downloading from spring-releases: https://repo.spring.io/libs-release-local/io/spring/javaformat/spring-javaformat-formatter/0.0.25/spring-javaformat-formatter-0.0.25.jar
Downloading from spring-releases: https://repo.spring.io/libs-release-local/io/spring/javaformat/spring-javaformat-formatter-eclipse-runtime/0.0.25/spring-javaformat-formatter-eclipse-runtime-0.0.25.jar
Downloading from spring-releases: https://repo.spring.io/libs-release-local/io/spring/javaformat/spring-javaformat-formatter-eclipse/0.0.25/spring-javaformat-formatter-eclipse-0.0.25.jar
Downloaded from spring-releases: https://repo.spring.io/libs-release-local/io/spring/javaformat/spring-javaformat-formatter/0.0.25/spring-javaformat-formatter-0.0.25.jar (20 kB at 29 kB/s)
Downloaded from spring-releases: https://repo.spring.io/libs-release-local/io/spring/javaformat/spring-javaformat-formatter-eclipse/0.0.25/spring-javaformat-formatter-eclipse-0.0.25.jar (199 kB at 56 kB/s)
Downloaded from spring-releases: https://repo.spring.io/libs-release-local/io/spring/javaformat/spring-javaformat-formatter-eclipse-runtime/0.0.25/spring-javaformat-formatter-eclipse-runtime-0.0.25.jar (19 MB at 298 kB/s)
[INFO]
[INFO] --- spring-javaformat-maven-plugin:0.0.25:apply (default) @ spring-cloud-aws ---
[INFO]
[INFO] --- maven-javadoc-plugin:3.2.0:jar (javadoc) @ spring-cloud-aws ---
Downloading from spring-milestones: https://repo.spring.io/libs-milestone-local/org/sonatype/aether/aether-api/1.13.1/aether-api-1.13.1.pom
Downloading from spring-releases: https://repo.spring.io/libs-release-local/org/sonatype/aether/aether-api/1.13.1/aether-api-1.13.1.pom
Downloading from central: https://repo.maven.apache.org/maven2/org/sonatype/aether/aether-api/1.13.1/aether-api-1.13.1.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/sonatype/aether/aether-api/1.13.1/aether-api-1.13.1.pom (1.4 kB at 12 kB/s)
Downloading from spring-milestones: https://repo.spring.io/libs-milestone-local/org/sonatype/aether/aether/1.13.1/aether-1.13.1.pom
Downloading from spring-releases: https://repo.spring.io/libs-release-local/org/sonatype/aether/aether/1.13.1/aether-1.13.1.pom
Downloading from central: https://repo.maven.apache.org/maven2/org/sonatype/aether/aether/1.13.1/aether-1.13.1.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/sonatype/aether/aether/1.13.1/aether-1.13.1.pom (10 kB at 128 kB/s)
Downloading from spring-milestones: https://repo.spring.io/libs-milestone-local/org/sonatype/aether/aether-util/1.13.1/aether-util-1.13.1.pom
Downloading from spring-releases: https://repo.spring.io/libs-release-local/org/sonatype/aether/aether-util/1.13.1/aether-util-1.13.1.pom
Downloading from central: https://repo.maven.apache.org/maven2/org/sonatype/aether/aether-util/1.13.1/aether-util-1.13.1.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/sonatype/aether/aether-util/1.13.1/aether-util-1.13.1.pom (1.7 kB at 19 kB/s)
Downloading from spring-milestones: https://repo.spring.io/libs-milestone-local/org/sonatype/aether/aether-impl/1.13.1/aether-impl-1.13.1.pom
Downloading from spring-releases: https://repo.spring.io/libs-release-local/org/sonatype/aether/aether-impl/1.13.1/aether-impl-1.13.1.pom
Downloading from central: https://repo.maven.apache.org/maven2/org/sonatype/aether/aether-impl/1.13.1/aether-impl-1.13.1.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/sonatype/aether/aether-impl/1.13.1/aether-impl-1.13.1.pom (2.5 kB at 33 kB/s)
Downloading from spring-milestones: https://repo.spring.io/libs-milestone-local/org/sonatype/aether/aether-spi/1.13.1/aether-spi-1.13.1.pom
Downloading from spring-releases: https://repo.spring.io/libs-release-local/org/sonatype/aether/aether-spi/1.13.1/aether-spi-1.13.1.pom
Downloading from central: https://repo.maven.apache.org/maven2/org/sonatype/aether/aether-spi/1.13.1/aether-spi-1.13.1.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/sonatype/aether/aether-spi/1.13.1/aether-spi-1.13.1.pom (1.4 kB at 19 kB/s)
Downloading from spring-milestones: https://repo.spring.io/libs-milestone-local/org/apache/maven/shared/maven-invoker/3.0.0/maven-invoker-3.0.0.pom
Downloading from spring-releases: https://repo.spring.io/libs-release-local/org/apache/maven/shared/maven-invoker/3.0.0/maven-invoker-3.0.0.pom
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/shared/maven-invoker/3.0.0/maven-invoker-3.0.0.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/shared/maven-invoker/3.0.0/maven-invoker-3.0.0.pom (5.0 kB at 71 kB/s)
Downloading from spring-milestones: https://repo.spring.io/libs-milestone-local/org/apache/maven/shared/maven-common-artifact-filters/3.0.0/maven-common-artifact-filters-3.0.0.pom
Downloading from spring-releases: https://repo.spring.io/libs-release-local/org/apache/maven/shared/maven-common-artifact-filters/3.0.0/maven-common-artifact-filters-3.0.0.pom
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/shared/maven-common-artifact-filters/3.0.0/maven-common-artifact-filters-3.0.0.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/shared/maven-common-artifact-filters/3.0.0/maven-common-artifact-filters-3.0.0.pom (4.8 kB at 62 kB/s)
Downloading from spring-milestones: https://repo.spring.io/libs-milestone-local/org/apache/maven/doxia/doxia-site-renderer/1.9.2/doxia-site-renderer-1.9.2.pom
Downloading from spring-releases: https://repo.spring.io/libs-release-local/org/apache/maven/doxia/doxia-site-renderer/1.9.2/doxia-site-renderer-1.9.2.pom
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/doxia/doxia-site-renderer/1.9.2/doxia-site-renderer-1.9.2.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/doxia/doxia-site-renderer/1.9.2/doxia-site-renderer-1.9.2.pom (7.5 kB at 96 kB/s)
Downloading from spring-milestones: https://repo.spring.io/libs-milestone-local/org/apache/maven/doxia/doxia-sitetools/1.9.2/doxia-sitetools-1.9.2.pom
Downloading from spring-releases: https://repo.spring.io/libs-release-local/org/apache/maven/doxia/doxia-sitetools/1.9.2/doxia-sitetools-1.9.2.pom
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/doxia/doxia-sitetools/1.9.2/doxia-sitetools-1.9.2.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/doxia/doxia-sitetools/1.9.2/doxia-sitetools-1.9.2.pom (15 kB at 49 kB/s)
Downloading from spring-milestones: https://repo.spring.io/libs-milestone-local/org/apache/maven/doxia/doxia-core/1.9.1/doxia-core-1.9.1.pom
Downloading from spring-releases: https://repo.spring.io/libs-release-local/org/apache/maven/doxia/doxia-core/1.9.1/doxia-core-1.9.1.pom
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/doxia/doxia-core/1.9.1/doxia-core-1.9.1.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/doxia/doxia-core/1.9.1/doxia-core-1.9.1.pom (4.2 kB at 54 kB/s)
Downloading from spring-milestones: https://repo.spring.io/libs-milestone-local/org/apache/maven/doxia/doxia/1.9.1/doxia-1.9.1.pom
Downloading from spring-releases: https://repo.spring.io/libs-release-local/org/apache/maven/doxia/doxia/1.9.1/doxia-1.9.1.pom
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/doxia/doxia/1.9.1/doxia-1.9.1.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/doxia/doxia/1.9.1/doxia-1.9.1.pom (18 kB at 179 kB/s)
Downloading from spring-milestones: https://repo.spring.io/libs-milestone-local/org/apache/maven/doxia/doxia-sink-api/1.9.1/doxia-sink-api-1.9.1.pom
Downloading from spring-releases: https://repo.spring.io/libs-release-local/org/apache/maven/doxia/doxia-sink-api/1.9.1/doxia-sink-api-1.9.1.pom
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/doxia/doxia-sink-api/1.9.1/doxia-sink-api-1.9.1.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/doxia/doxia-sink-api/1.9.1/doxia-sink-api-1.9.1.pom (1.5 kB at 21 kB/s)
Downloading from spring-milestones: https://repo.spring.io/libs-milestone-local/org/apache/maven/doxia/doxia-logging-api/1.9.1/doxia-logging-api-1.9.1.pom
Downloading from spring-releases: https://repo.spring.io/libs-release-local/org/apache/maven/doxia/doxia-logging-api/1.9.1/doxia-logging-api-1.9.1.pom
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/doxia/doxia-logging-api/1.9.1/doxia-logging-api-1.9.1.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/doxia/doxia-logging-api/1.9.1/doxia-logging-api-1.9.1.pom (1.5 kB at 21 kB/s)
Downloading from spring-milestones: https://repo.spring.io/libs-milestone-local/org/apache/maven/doxia/doxia-decoration-model/1.9.2/doxia-decoration-model-1.9.2.pom
Downloading from spring-releases: https://repo.spring.io/libs-release-local/org/apache/maven/doxia/doxia-decoration-model/1.9.2/doxia-decoration-model-1.9.2.pom
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/doxia/doxia-decoration-model/1.9.2/doxia-decoration-model-1.9.2.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/doxia/doxia-decoration-model/1.9.2/doxia-decoration-model-1.9.2.pom (3.3 kB at 39 kB/s)
Downloading from spring-milestones: https://repo.spring.io/libs-milestone-local/org/apache/maven/doxia/doxia-skin-model/1.9.2/doxia-skin-model-1.9.2.pom
Downloading from spring-releases: https://repo.spring.io/libs-release-local/org/apache/maven/doxia/doxia-skin-model/1.9.2/doxia-skin-model-1.9.2.pom
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/doxia/doxia-skin-model/1.9.2/doxia-skin-model-1.9.2.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/doxia/doxia-skin-model/1.9.2/doxia-skin-model-1.9.2.pom (2.9 kB at 37 kB/s)
Downloading from spring-milestones: https://repo.spring.io/libs-milestone-local/org/apache/maven/doxia/doxia-module-xhtml/1.9.1/doxia-module-xhtml-1.9.1.pom
Downloading from spring-releases: https://repo.spring.io/libs-release-local/org/apache/maven/doxia/doxia-module-xhtml/1.9.1/doxia-module-xhtml-1.9.1.pom
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/doxia/doxia-module-xhtml/1.9.1/doxia-module-xhtml-1.9.1.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/doxia/doxia-module-xhtml/1.9.1/doxia-module-xhtml-1.9.1.pom (1.9 kB at 14 kB/s)
Downloading from spring-milestones: https://repo.spring.io/libs-milestone-local/org/apache/maven/doxia/doxia-modules/1.9.1/doxia-modules-1.9.1.pom
Downloading from spring-releases: https://repo.spring.io/libs-release-local/org/apache/maven/doxia/doxia-modules/1.9.1/doxia-modules-1.9.1.pom
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/doxia/doxia-modules/1.9.1/doxia-modules-1.9.1.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/doxia/doxia-modules/1.9.1/doxia-modules-1.9.1.pom (2.7 kB at 37 kB/s)
Downloading from spring-milestones: https://repo.spring.io/libs-milestone-local/org/apache/maven/doxia/doxia-module-xhtml5/1.9.1/doxia-module-xhtml5-1.9.1.pom
Downloading from spring-releases: https://repo.spring.io/libs-release-local/org/apache/maven/doxia/doxia-module-xhtml5/1.9.1/doxia-module-xhtml5-1.9.1.pom
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/doxia/doxia-module-xhtml5/1.9.1/doxia-module-xhtml5-1.9.1.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/doxia/doxia-module-xhtml5/1.9.1/doxia-module-xhtml5-1.9.1.pom (1.9 kB at 22 kB/s)
Downloading from spring-milestones: https://repo.spring.io/libs-milestone-local/org/apache/maven/wagon/wagon-provider-api/2.4/wagon-provider-api-2.4.pom
Downloading from spring-releases: https://repo.spring.io/libs-release-local/org/apache/maven/wagon/wagon-provider-api/2.4/wagon-provider-api-2.4.pom
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/wagon/wagon-provider-api/2.4/wagon-provider-api-2.4.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/wagon/wagon-provider-api/2.4/wagon-provider-api-2.4.pom (1.7 kB at 24 kB/s)
Downloading from spring-milestones: https://repo.spring.io/libs-milestone-local/org/apache/maven/wagon/wagon/2.4/wagon-2.4.pom
Downloading from spring-releases: https://repo.spring.io/libs-release-local/org/apache/maven/wagon/wagon/2.4/wagon-2.4.pom
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/wagon/wagon/2.4/wagon-2.4.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/wagon/wagon/2.4/wagon-2.4.pom (20 kB at 220 kB/s)
Downloading from spring-milestones: https://repo.spring.io/libs-milestone-local/com/thoughtworks/qdox/qdox/2.0-M10/qdox-2.0-M10.pom
Downloading from spring-releases: https://repo.spring.io/libs-release-local/com/thoughtworks/qdox/qdox/2.0-M10/qdox-2.0-M10.pom
Downloading from central: https://repo.maven.apache.org/maven2/com/thoughtworks/qdox/qdox/2.0-M10/qdox-2.0-M10.pom
Downloaded from central: https://repo.maven.apache.org/maven2/com/thoughtworks/qdox/qdox/2.0-M10/qdox-2.0-M10.pom (16 kB at 158 kB/s)
Downloading from spring-milestones: https://repo.spring.io/libs-milestone-local/org/sonatype/aether/aether-impl/1.13.1/aether-impl-1.13.1.jar
Downloading from spring-milestones: https://repo.spring.io/libs-milestone-local/org/sonatype/aether/aether-util/1.13.1/aether-util-1.13.1.jar
Downloading from spring-milestones: https://repo.spring.io/libs-milestone-local/org/sonatype/aether/aether-api/1.13.1/aether-api-1.13.1.jar
Downloading from spring-milestones: https://repo.spring.io/libs-milestone-local/org/sonatype/aether/aether-spi/1.13.1/aether-spi-1.13.1.jar
Downloading from spring-milestones: https://repo.spring.io/libs-milestone-local/org/apache/maven/shared/maven-invoker/3.0.0/maven-invoker-3.0.0.jar
Downloading from spring-milestones: https://repo.spring.io/libs-milestone-local/org/apache/maven/shared/maven-common-artifact-filters/3.0.0/maven-common-artifact-filters-3.0.0.jar
Downloading from spring-milestones: https://repo.spring.io/libs-milestone-local/org/apache/maven/doxia/doxia-site-renderer/1.9.2/doxia-site-renderer-1.9.2.jar
Downloading from spring-milestones: https://repo.spring.io/libs-milestone-local/org/apache/maven/doxia/doxia-core/1.9.1/doxia-core-1.9.1.jar
Downloading from spring-milestones: https://repo.spring.io/libs-milestone-local/org/apache/maven/doxia/doxia-decoration-model/1.9.2/doxia-decoration-model-1.9.2.jar
Downloading from spring-milestones: https://repo.spring.io/libs-milestone-local/org/apache/maven/doxia/doxia-skin-model/1.9.2/doxia-skin-model-1.9.2.jar
Downloading from spring-milestones: https://repo.spring.io/libs-milestone-local/org/apache/maven/doxia/doxia-module-xhtml/1.9.1/doxia-module-xhtml-1.9.1.jar
Downloading from spring-milestones: https://repo.spring.io/libs-milestone-local/org/apache/maven/doxia/doxia-module-xhtml5/1.9.1/doxia-module-xhtml5-1.9.1.jar
Downloading from spring-milestones: https://repo.spring.io/libs-milestone-local/org/apache/maven/wagon/wagon-provider-api/2.4/wagon-provider-api-2.4.jar
Downloading from spring-milestones: https://repo.spring.io/libs-milestone-local/com/thoughtworks/qdox/qdox/2.0-M10/qdox-2.0-M10.jar
Downloading from spring-releases: https://repo.spring.io/libs-release-local/org/sonatype/aether/aether-impl/1.13.1/aether-impl-1.13.1.jar
Downloading from spring-releases: https://repo.spring.io/libs-release-local/org/sonatype/aether/aether-util/1.13.1/aether-util-1.13.1.jar
Downloading from spring-releases: https://repo.spring.io/libs-release-local/org/sonatype/aether/aether-api/1.13.1/aether-api-1.13.1.jar
Downloading from spring-releases: https://repo.spring.io/libs-release-local/org/sonatype/aether/aether-spi/1.13.1/aether-spi-1.13.1.jar
Downloading from spring-releases: https://repo.spring.io/libs-release-local/org/apache/maven/shared/maven-invoker/3.0.0/maven-invoker-3.0.0.jar
Downloading from spring-releases: https://repo.spring.io/libs-release-local/org/apache/maven/shared/maven-common-artifact-filters/3.0.0/maven-common-artifact-filters-3.0.0.jar
Downloading from spring-releases: https://repo.spring.io/libs-release-local/org/apache/maven/doxia/doxia-site-renderer/1.9.2/doxia-site-renderer-1.9.2.jar
Downloading from spring-releases: https://repo.spring.io/libs-release-local/org/apache/maven/doxia/doxia-core/1.9.1/doxia-core-1.9.1.jar
Downloading from spring-releases: https://repo.spring.io/libs-release-local/org/apache/maven/doxia/doxia-decoration-model/1.9.2/doxia-decoration-model-1.9.2.jar
Downloading from spring-releases: https://repo.spring.io/libs-release-local/org/apache/maven/doxia/doxia-skin-model/1.9.2/doxia-skin-model-1.9.2.jar
Downloading from spring-releases: https://repo.spring.io/libs-release-local/org/apache/maven/doxia/doxia-module-xhtml/1.9.1/doxia-module-xhtml-1.9.1.jar
Downloading from spring-releases: https://repo.spring.io/libs-release-local/org/apache/maven/doxia/doxia-module-xhtml5/1.9.1/doxia-module-xhtml5-1.9.1.jar
Downloading from spring-releases: https://repo.spring.io/libs-release-local/com/thoughtworks/qdox/qdox/2.0-M10/qdox-2.0-M10.jar
Downloading from spring-releases: https://repo.spring.io/libs-release-local/org/apache/maven/wagon/wagon-provider-api/2.4/wagon-provider-api-2.4.jar
Downloading from central: https://repo.maven.apache.org/maven2/org/sonatype/aether/aether-impl/1.13.1/aether-impl-1.13.1.jar
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/shared/maven-invoker/3.0.0/maven-invoker-3.0.0.jar
Downloading from central: https://repo.maven.apache.org/maven2/org/sonatype/aether/aether-util/1.13.1/aether-util-1.13.1.jar
Downloading from central: https://repo.maven.apache.org/maven2/org/sonatype/aether/aether-api/1.13.1/aether-api-1.13.1.jar
Downloading from central: https://repo.maven.apache.org/maven2/org/sonatype/aether/aether-spi/1.13.1/aether-spi-1.13.1.jar
Downloaded from central: https://repo.maven.apache.org/maven2/org/sonatype/aether/aether-spi/1.13.1/aether-spi-1.13.1.jar (15 kB at 32 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/shared/maven-common-artifact-filters/3.0.0/maven-common-artifact-filters-3.0.0.jar
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/shared/maven-invoker/3.0.0/maven-invoker-3.0.0.jar (33 kB at 65 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/doxia/doxia-site-renderer/1.9.2/doxia-site-renderer-1.9.2.jar
Downloaded from central: https://repo.maven.apache.org/maven2/org/sonatype/aether/aether-impl/1.13.1/aether-impl-1.13.1.jar (130 kB at 228 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/doxia/doxia-core/1.9.1/doxia-core-1.9.1.jar
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/doxia/doxia-site-renderer/1.9.2/doxia-site-renderer-1.9.2.jar (65 kB at 65 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/doxia/doxia-decoration-model/1.9.2/doxia-decoration-model-1.9.2.jar
Downloaded from central: https://repo.maven.apache.org/maven2/org/sonatype/aether/aether-util/1.13.1/aether-util-1.13.1.jar (130 kB at 122 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/doxia/doxia-skin-model/1.9.2/doxia-skin-model-1.9.2.jar
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/shared/maven-common-artifact-filters/3.0.0/maven-common-artifact-filters-3.0.0.jar (57 kB at 53 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/doxia/doxia-module-xhtml/1.9.1/doxia-module-xhtml-1.9.1.jar
Downloaded from central: https://repo.maven.apache.org/maven2/org/sonatype/aether/aether-api/1.13.1/aether-api-1.13.1.jar (90 kB at 77 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/doxia/doxia-module-xhtml5/1.9.1/doxia-module-xhtml5-1.9.1.jar
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/doxia/doxia-module-xhtml5/1.9.1/doxia-module-xhtml5-1.9.1.jar (18 kB at 13 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/wagon/wagon-provider-api/2.4/wagon-provider-api-2.4.jar
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/doxia/doxia-module-xhtml/1.9.1/doxia-module-xhtml-1.9.1.jar (17 kB at 12 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/com/thoughtworks/qdox/qdox/2.0-M10/qdox-2.0-M10.jar
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/doxia/doxia-skin-model/1.9.2/doxia-skin-model-1.9.2.jar (16 kB at 11 kB/s)
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/doxia/doxia-decoration-model/1.9.2/doxia-decoration-model-1.9.2.jar (60 kB at 38 kB/s)
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/doxia/doxia-core/1.9.1/doxia-core-1.9.1.jar (217 kB at 123 kB/s)
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/wagon/wagon-provider-api/2.4/wagon-provider-api-2.4.jar (52 kB at 29 kB/s)
Downloaded from central: https://repo.maven.apache.org/maven2/com/thoughtworks/qdox/qdox/2.0-M10/qdox-2.0-M10.jar (317 kB at 100 kB/s)
[INFO] Not executing Javadoc as the project is not a Java classpath-capable package
[INFO]
[INFO] >>> maven-source-plugin:3.2.1:jar (attach-sources) > generate-sources @ spring-cloud-aws >>>
[INFO]
[INFO] --- maven-checkstyle-plugin:3.1.0:check (checkstyle-validation) @ spring-cloud-aws ---
[INFO] Starting audit...
Audit done.
[INFO]
[INFO] --- maven-checkstyle-plugin:3.1.0:check (no-http-checkstyle-validation) @ spring-cloud-aws ---
[INFO]
[INFO] --- spring-javaformat-maven-plugin:0.0.25:validate (default) @ spring-cloud-aws ---
[INFO]
[INFO] --- spring-javaformat-maven-plugin:0.0.25:apply (default) @ spring-cloud-aws ---
[INFO]
[INFO] <<< maven-source-plugin:3.2.1:jar (attach-sources) < generate-sources @ spring-cloud-aws <<<
[INFO]
[INFO]
[INFO] --- maven-source-plugin:3.2.1:jar (attach-sources) @ spring-cloud-aws ---
[INFO]
[INFO] ----------< org.springframework.cloud:spring-cloud-aws-core >-----------
[INFO] Building Spring Cloud AWS Core 3.0.0-SNAPSHOT                     [3/18]
[INFO] --------------------------------[ jar ]---------------------------------
Downloading from spring-milestones: https://repo.spring.io/libs-milestone-local/com/amazonaws/aws-java-sdk-core/1.11.907/aws-java-sdk-core-1.11.907.pom
Downloading from spring-releases: https://repo.spring.io/release/com/amazonaws/aws-java-sdk-core/1.11.907/aws-java-sdk-core-1.11.907.pom
Downloading from spring-plugins: https://repo.spring.io/plugins/com/amazonaws/aws-java-sdk-core/1.11.907/aws-java-sdk-core-1.11.907.pom
Downloading from central: https://repo.maven.apache.org/maven2/com/amazonaws/aws-java-sdk-core/1.11.907/aws-java-sdk-core-1.11.907.pom
Downloaded from central: https://repo.maven.apache.org/maven2/com/amazonaws/aws-java-sdk-core/1.11.907/aws-java-sdk-core-1.11.907.pom (4.3 kB at 50 kB/s)
Downloading from spring-milestones: https://repo.spring.io/libs-milestone-local/com/fasterxml/jackson/dataformat/jackson-dataformat-cbor/2.11.3/jackson-dataformat-cbor-2.11.3.pom
Downloading from spring-releases: https://repo.spring.io/release/com/fasterxml/jackson/dataformat/jackson-dataformat-cbor/2.11.3/jackson-dataformat-cbor-2.11.3.pom
Downloading from spring-plugins: https://repo.spring.io/plugins/com/fasterxml/jackson/dataformat/jackson-dataformat-cbor/2.11.3/jackson-dataformat-cbor-2.11.3.pom
Downloading from central: https://repo.maven.apache.org/maven2/com/fasterxml/jackson/dataformat/jackson-dataformat-cbor/2.11.3/jackson-dataformat-cbor-2.11.3.pom
Downloaded from central: https://repo.maven.apache.org/maven2/com/fasterxml/jackson/dataformat/jackson-dataformat-cbor/2.11.3/jackson-dataformat-cbor-2.11.3.pom (2.5 kB at 25 kB/s)
Downloading from spring-milestones: https://repo.spring.io/libs-milestone-local/com/fasterxml/jackson/dataformat/jackson-dataformats-binary/2.11.3/jackson-dataformats-binary-2.11.3.pom
Downloading from spring-releases: https://repo.spring.io/release/com/fasterxml/jackson/dataformat/jackson-dataformats-binary/2.11.3/jackson-dataformats-binary-2.11.3.pom
Downloading from spring-plugins: https://repo.spring.io/plugins/com/fasterxml/jackson/dataformat/jackson-dataformats-binary/2.11.3/jackson-dataformats-binary-2.11.3.pom
Downloading from central: https://repo.maven.apache.org/maven2/com/fasterxml/jackson/dataformat/jackson-dataformats-binary/2.11.3/jackson-dataformats-binary-2.11.3.pom
Downloaded from central: https://repo.maven.apache.org/maven2/com/fasterxml/jackson/dataformat/jackson-dataformats-binary/2.11.3/jackson-dataformats-binary-2.11.3.pom (3.1 kB at 35 kB/s)
Downloading from spring-milestones: https://repo.spring.io/libs-milestone-local/com/amazonaws/aws-java-sdk-s3/1.11.907/aws-java-sdk-s3-1.11.907.pom
Downloading from spring-releases: https://repo.spring.io/release/com/amazonaws/aws-java-sdk-s3/1.11.907/aws-java-sdk-s3-1.11.907.pom
Downloading from spring-plugins: https://repo.spring.io/plugins/com/amazonaws/aws-java-sdk-s3/1.11.907/aws-java-sdk-s3-1.11.907.pom
Downloading from central: https://repo.maven.apache.org/maven2/com/amazonaws/aws-java-sdk-s3/1.11.907/aws-java-sdk-s3-1.11.907.pom
Downloaded from central: https://repo.maven.apache.org/maven2/com/amazonaws/aws-java-sdk-s3/1.11.907/aws-java-sdk-s3-1.11.907.pom (3.8 kB at 26 kB/s)
Downloading from spring-milestones: https://repo.spring.io/libs-milestone-local/com/amazonaws/aws-java-sdk-kms/1.11.907/aws-java-sdk-kms-1.11.907.pom
Downloading from spring-releases: https://repo.spring.io/release/com/amazonaws/aws-java-sdk-kms/1.11.907/aws-java-sdk-kms-1.11.907.pom
Downloading from spring-plugins: https://repo.spring.io/plugins/com/amazonaws/aws-java-sdk-kms/1.11.907/aws-java-sdk-kms-1.11.907.pom
Downloading from central: https://repo.maven.apache.org/maven2/com/amazonaws/aws-java-sdk-kms/1.11.907/aws-java-sdk-kms-1.11.907.pom
Downloaded from central: https://repo.maven.apache.org/maven2/com/amazonaws/aws-java-sdk-kms/1.11.907/aws-java-sdk-kms-1.11.907.pom (3.5 kB at 16 kB/s)
Downloading from spring-milestones: https://repo.spring.io/libs-milestone-local/com/amazonaws/jmespath-java/1.11.907/jmespath-java-1.11.907.pom
Downloading from spring-releases: https://repo.spring.io/release/com/amazonaws/jmespath-java/1.11.907/jmespath-java-1.11.907.pom
Downloading from spring-plugins: https://repo.spring.io/plugins/com/amazonaws/jmespath-java/1.11.907/jmespath-java-1.11.907.pom
Downloading from central: https://repo.maven.apache.org/maven2/com/amazonaws/jmespath-java/1.11.907/jmespath-java-1.11.907.pom
Downloaded from central: https://repo.maven.apache.org/maven2/com/amazonaws/jmespath-java/1.11.907/jmespath-java-1.11.907.pom (3.4 kB at 13 kB/s)
Downloading from spring-milestones: https://repo.spring.io/libs-milestone-local/com/amazonaws/aws-java-sdk-ec2/1.11.907/aws-java-sdk-ec2-1.11.907.pom
Downloading from spring-releases: https://repo.spring.io/release/com/amazonaws/aws-java-sdk-ec2/1.11.907/aws-java-sdk-ec2-1.11.907.pom
Downloading from spring-plugins: https://repo.spring.io/plugins/com/amazonaws/aws-java-sdk-ec2/1.11.907/aws-java-sdk-ec2-1.11.907.pom
Downloading from central: https://repo.maven.apache.org/maven2/com/amazonaws/aws-java-sdk-ec2/1.11.907/aws-java-sdk-ec2-1.11.907.pom
Downloaded from central: https://repo.maven.apache.org/maven2/com/amazonaws/aws-java-sdk-ec2/1.11.907/aws-java-sdk-ec2-1.11.907.pom (3.5 kB at 7.7 kB/s)
Downloading from spring-milestones: https://repo.spring.io/libs-milestone-local/com/amazonaws/aws-java-sdk-cloudformation/1.11.907/aws-java-sdk-cloudformation-1.11.907.pom
Downloading from spring-releases: https://repo.spring.io/release/com/amazonaws/aws-java-sdk-cloudformation/1.11.907/aws-java-sdk-cloudformation-1.11.907.pom
Downloading from spring-plugins: https://repo.spring.io/plugins/com/amazonaws/aws-java-sdk-cloudformation/1.11.907/aws-java-sdk-cloudformation-1.11.907.pom
Downloading from central: https://repo.maven.apache.org/maven2/com/amazonaws/aws-java-sdk-cloudformation/1.11.907/aws-java-sdk-cloudformation-1.11.907.pom
Downloaded from central: https://repo.maven.apache.org/maven2/com/amazonaws/aws-java-sdk-cloudformation/1.11.907/aws-java-sdk-cloudformation-1.11.907.pom (3.6 kB at 7.9 kB/s)
Downloading from spring-milestones: https://repo.spring.io/libs-milestone-local/org/springframework/spring-beans/5.3.1/spring-beans-5.3.1.jar
Downloading from spring-milestones: https://repo.spring.io/libs-milestone-local/com/amazonaws/aws-java-sdk-core/1.11.907/aws-java-sdk-core-1.11.907.jar
Downloading from spring-milestones: https://repo.spring.io/libs-milestone-local/org/springframework/spring-aop/5.3.1/spring-aop-5.3.1.jar
Downloading from spring-milestones: https://repo.spring.io/libs-milestone-local/org/springframework/spring-jcl/5.3.1/spring-jcl-5.3.1.jar
Downloading from spring-milestones: https://repo.spring.io/libs-milestone-local/org/springframework/spring-core/5.3.1/spring-core-5.3.1.jar
Downloading from spring-milestones: https://repo.spring.io/libs-milestone-local/com/fasterxml/jackson/dataformat/jackson-dataformat-cbor/2.11.3/jackson-dataformat-cbor-2.11.3.jar
Downloading from spring-milestones: https://repo.spring.io/libs-milestone-local/com/amazonaws/aws-java-sdk-s3/1.11.907/aws-java-sdk-s3-1.11.907.jar
Downloading from spring-milestones: https://repo.spring.io/libs-milestone-local/com/amazonaws/jmespath-java/1.11.907/jmespath-java-1.11.907.jar
Downloading from spring-milestones: https://repo.spring.io/libs-milestone-local/com/amazonaws/aws-java-sdk-kms/1.11.907/aws-java-sdk-kms-1.11.907.jar
Downloading from spring-milestones: https://repo.spring.io/libs-milestone-local/com/amazonaws/aws-java-sdk-ec2/1.11.907/aws-java-sdk-ec2-1.11.907.jar
Downloading from spring-milestones: https://repo.spring.io/libs-milestone-local/com/amazonaws/aws-java-sdk-cloudformation/1.11.907/aws-java-sdk-cloudformation-1.11.907.jar
Downloading from spring-milestones: https://repo.spring.io/libs-milestone-local/org/springframework/boot/spring-boot-starter/2.4.0/spring-boot-starter-2.4.0.jar
Downloading from spring-milestones: https://repo.spring.io/libs-milestone-local/org/springframework/boot/spring-boot-starter-test/2.4.0/spring-boot-starter-test-2.4.0.jar
Downloading from spring-milestones: https://repo.spring.io/libs-milestone-local/org/springframework/boot/spring-boot/2.4.0/spring-boot-2.4.0.jar
Downloading from spring-milestones: https://repo.spring.io/libs-milestone-local/org/springframework/spring-context/5.3.1/spring-context-5.3.1.jar
Downloading from spring-milestones: https://repo.spring.io/libs-milestone-local/org/springframework/spring-expression/5.3.1/spring-expression-5.3.1.jar
Downloading from spring-milestones: https://repo.spring.io/libs-milestone-local/org/springframework/boot/spring-boot-autoconfigure/2.4.0/spring-boot-autoconfigure-2.4.0.jar
Downloading from spring-milestones: https://repo.spring.io/libs-milestone-local/org/springframework/boot/spring-boot-starter-logging/2.4.0/spring-boot-starter-logging-2.4.0.jar
Downloading from spring-milestones: https://repo.spring.io/libs-milestone-local/org/springframework/boot/spring-boot-test/2.4.0/spring-boot-test-2.4.0.jar
Downloading from spring-milestones: https://repo.spring.io/libs-milestone-local/org/springframework/boot/spring-boot-test-autoconfigure/2.4.0/spring-boot-test-autoconfigure-2.4.0.jar
Downloading from spring-milestones: https://repo.spring.io/libs-milestone-local/org/mockito/mockito-core/3.6.0/mockito-core-3.6.0.jar
Downloading from spring-milestones: https://repo.spring.io/libs-milestone-local/org/mockito/mockito-junit-jupiter/3.6.0/mockito-junit-jupiter-3.6.0.jar
Downloading from spring-milestones: https://repo.spring.io/libs-milestone-local/org/springframework/spring-test/5.3.1/spring-test-5.3.1.jar
Downloading from spring-releases: https://repo.spring.io/release/org/springframework/spring-beans/5.3.1/spring-beans-5.3.1.jar
Downloading from spring-releases: https://repo.spring.io/release/org/springframework/spring-aop/5.3.1/spring-aop-5.3.1.jar
Downloading from spring-releases: https://repo.spring.io/release/org/springframework/spring-jcl/5.3.1/spring-jcl-5.3.1.jar
Downloading from spring-releases: https://repo.spring.io/release/org/springframework/spring-core/5.3.1/spring-core-5.3.1.jar
Downloading from spring-releases: https://repo.spring.io/release/com/amazonaws/aws-java-sdk-core/1.11.907/aws-java-sdk-core-1.11.907.jar
Downloading from spring-releases: https://repo.spring.io/release/com/fasterxml/jackson/dataformat/jackson-dataformat-cbor/2.11.3/jackson-dataformat-cbor-2.11.3.jar
Downloading from spring-releases: https://repo.spring.io/release/com/amazonaws/aws-java-sdk-s3/1.11.907/aws-java-sdk-s3-1.11.907.jar
Downloading from spring-releases: https://repo.spring.io/release/com/amazonaws/aws-java-sdk-kms/1.11.907/aws-java-sdk-kms-1.11.907.jar
Downloading from spring-releases: https://repo.spring.io/release/com/amazonaws/jmespath-java/1.11.907/jmespath-java-1.11.907.jar
Downloaded from spring-releases: https://repo.spring.io/release/org/springframework/spring-jcl/5.3.1/spring-jcl-5.3.1.jar (24 kB at 18 kB/s)
Downloading from spring-releases: https://repo.spring.io/release/com/amazonaws/aws-java-sdk-ec2/1.11.907/aws-java-sdk-ec2-1.11.907.jar
Downloading from spring-releases: https://repo.spring.io/release/com/amazonaws/aws-java-sdk-cloudformation/1.11.907/aws-java-sdk-cloudformation-1.11.907.jar
Downloading from spring-releases: https://repo.spring.io/release/org/springframework/boot/spring-boot-starter-test/2.4.0/spring-boot-starter-test-2.4.0.jar
Downloading from spring-releases: https://repo.spring.io/release/org/springframework/boot/spring-boot-starter/2.4.0/spring-boot-starter-2.4.0.jar
Downloaded from spring-releases: https://repo.spring.io/release/org/springframework/boot/spring-boot-starter-test/2.4.0/spring-boot-starter-test-2.4.0.jar (4.8 kB at 2.6 kB/s)
Downloading from spring-releases: https://repo.spring.io/release/org/springframework/boot/spring-boot/2.4.0/spring-boot-2.4.0.jar
Downloaded from spring-releases: https://repo.spring.io/release/org/springframework/boot/spring-boot-starter/2.4.0/spring-boot-starter-2.4.0.jar (4.8 kB at 2.4 kB/s)
Downloading from spring-releases: https://repo.spring.io/release/org/springframework/spring-context/5.3.1/spring-context-5.3.1.jar
Downloaded from spring-releases: https://repo.spring.io/release/org/springframework/spring-beans/5.3.1/spring-beans-5.3.1.jar (696 kB at 232 kB/s)
Downloading from spring-releases: https://repo.spring.io/release/org/springframework/spring-expression/5.3.1/spring-expression-5.3.1.jar
Downloaded from spring-releases: https://repo.spring.io/release/org/springframework/spring-expression/5.3.1/spring-expression-5.3.1.jar (283 kB at 59 kB/s)
Downloading from spring-releases: https://repo.spring.io/release/org/springframework/boot/spring-boot-autoconfigure/2.4.0/spring-boot-autoconfigure-2.4.0.jar
Downloaded from spring-releases: https://repo.spring.io/release/org/springframework/spring-aop/5.3.1/spring-aop-5.3.1.jar (374 kB at 73 kB/s)
Downloading from spring-releases: https://repo.spring.io/release/org/springframework/boot/spring-boot-starter-logging/2.4.0/spring-boot-starter-logging-2.4.0.jar
Downloaded from spring-releases: https://repo.spring.io/release/org/springframework/boot/spring-boot-starter-logging/2.4.0/spring-boot-starter-logging-2.4.0.jar (4.8 kB at 875 B/s)
Downloading from spring-releases: https://repo.spring.io/release/org/springframework/boot/spring-boot-test/2.4.0/spring-boot-test-2.4.0.jar
Downloaded from spring-releases: https://repo.spring.io/release/org/springframework/boot/spring-boot-test/2.4.0/spring-boot-test-2.4.0.jar (218 kB at 28 kB/s)
Downloading from spring-releases: https://repo.spring.io/release/org/springframework/boot/spring-boot-test-autoconfigure/2.4.0/spring-boot-test-autoconfigure-2.4.0.jar
Downloaded from spring-releases: https://repo.spring.io/release/org/springframework/spring-context/5.3.1/spring-context-5.3.1.jar (1.2 MB at 151 kB/s)
Downloading from spring-releases: https://repo.spring.io/release/org/mockito/mockito-core/3.6.0/mockito-core-3.6.0.jar
Downloading from spring-releases: https://repo.spring.io/release/org/mockito/mockito-junit-jupiter/3.6.0/mockito-junit-jupiter-3.6.0.jar
Downloading from spring-releases: https://repo.spring.io/release/org/springframework/spring-test/5.3.1/spring-test-5.3.1.jar
Downloaded from spring-releases: https://repo.spring.io/release/org/springframework/boot/spring-boot-test-autoconfigure/2.4.0/spring-boot-test-autoconfigure-2.4.0.jar (182 kB at 19 kB/s)
Downloaded from spring-releases: https://repo.spring.io/release/org/springframework/boot/spring-boot/2.4.0/spring-boot-2.4.0.jar (1.3 MB at 101 kB/s)
Downloaded from spring-releases: https://repo.spring.io/release/org/springframework/spring-test/5.3.1/spring-test-5.3.1.jar (752 kB at 51 kB/s)
Downloaded from spring-releases: https://repo.spring.io/release/org/springframework/boot/spring-boot-autoconfigure/2.4.0/spring-boot-autoconfigure-2.4.0.jar (1.5 MB at 97 kB/s)
Downloaded from spring-releases: https://repo.spring.io/release/org/springframework/spring-core/5.3.1/spring-core-5.3.1.jar (1.5 MB at 91 kB/s)
Downloading from spring-plugins: https://repo.spring.io/plugins/com/amazonaws/aws-java-sdk-core/1.11.907/aws-java-sdk-core-1.11.907.jar
Downloading from spring-plugins: https://repo.spring.io/plugins/com/amazonaws/jmespath-java/1.11.907/jmespath-java-1.11.907.jar
Downloading from spring-plugins: https://repo.spring.io/plugins/com/amazonaws/aws-java-sdk-kms/1.11.907/aws-java-sdk-kms-1.11.907.jar
Downloading from spring-plugins: https://repo.spring.io/plugins/com/amazonaws/aws-java-sdk-s3/1.11.907/aws-java-sdk-s3-1.11.907.jar
Downloading from spring-plugins: https://repo.spring.io/plugins/com/fasterxml/jackson/dataformat/jackson-dataformat-cbor/2.11.3/jackson-dataformat-cbor-2.11.3.jar
Downloading from spring-plugins: https://repo.spring.io/plugins/com/amazonaws/aws-java-sdk-ec2/1.11.907/aws-java-sdk-ec2-1.11.907.jar
Downloading from spring-plugins: https://repo.spring.io/plugins/com/amazonaws/aws-java-sdk-cloudformation/1.11.907/aws-java-sdk-cloudformation-1.11.907.jar
Downloading from spring-plugins: https://repo.spring.io/plugins/org/mockito/mockito-core/3.6.0/mockito-core-3.6.0.jar
Downloading from spring-plugins: https://repo.spring.io/plugins/org/mockito/mockito-junit-jupiter/3.6.0/mockito-junit-jupiter-3.6.0.jar
Downloading from central: https://repo.maven.apache.org/maven2/com/amazonaws/aws-java-sdk-core/1.11.907/aws-java-sdk-core-1.11.907.jar
Downloading from central: https://repo.maven.apache.org/maven2/com/amazonaws/jmespath-java/1.11.907/jmespath-java-1.11.907.jar
Downloading from central: https://repo.maven.apache.org/maven2/com/amazonaws/aws-java-sdk-kms/1.11.907/aws-java-sdk-kms-1.11.907.jar
Downloading from central: https://repo.maven.apache.org/maven2/com/amazonaws/aws-java-sdk-s3/1.11.907/aws-java-sdk-s3-1.11.907.jar
Downloading from central: https://repo.maven.apache.org/maven2/com/fasterxml/jackson/dataformat/jackson-dataformat-cbor/2.11.3/jackson-dataformat-cbor-2.11.3.jar
Downloaded from central: https://repo.maven.apache.org/maven2/com/amazonaws/jmespath-java/1.11.907/jmespath-java-1.11.907.jar (28 kB at 132 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/com/amazonaws/aws-java-sdk-ec2/1.11.907/aws-java-sdk-ec2-1.11.907.jar
Downloaded from central: https://repo.maven.apache.org/maven2/com/fasterxml/jackson/dataformat/jackson-dataformat-cbor/2.11.3/jackson-dataformat-cbor-2.11.3.jar (59 kB at 83 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/com/amazonaws/aws-java-sdk-cloudformation/1.11.907/aws-java-sdk-cloudformation-1.11.907.jar
Downloaded from central: https://repo.maven.apache.org/maven2/com/amazonaws/aws-java-sdk-kms/1.11.907/aws-java-sdk-kms-1.11.907.jar (593 kB at 244 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/mockito/mockito-core/3.6.0/mockito-core-3.6.0.jar
Downloaded from central: https://repo.maven.apache.org/maven2/com/amazonaws/aws-java-sdk-core/1.11.907/aws-java-sdk-core-1.11.907.jar (1.0 MB at 322 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/mockito/mockito-junit-jupiter/3.6.0/mockito-junit-jupiter-3.6.0.jar
Downloaded from central: https://repo.maven.apache.org/maven2/org/mockito/mockito-junit-jupiter/3.6.0/mockito-junit-jupiter-3.6.0.jar (4.9 kB at 1.4 kB/s)
Downloaded from central: https://repo.maven.apache.org/maven2/com/amazonaws/aws-java-sdk-s3/1.11.907/aws-java-sdk-s3-1.11.907.jar (1.2 MB at 299 kB/s)
Downloaded from central: https://repo.maven.apache.org/maven2/com/amazonaws/aws-java-sdk-cloudformation/1.11.907/aws-java-sdk-cloudformation-1.11.907.jar (834 kB at 177 kB/s)
Downloaded from central: https://repo.maven.apache.org/maven2/org/mockito/mockito-core/3.6.0/mockito-core-3.6.0.jar (675 kB at 131 kB/s)
Downloaded from central: https://repo.maven.apache.org/maven2/com/amazonaws/aws-java-sdk-ec2/1.11.907/aws-java-sdk-ec2-1.11.907.jar (6.1 MB at 541 kB/s)
[INFO]
[INFO] --- maven-clean-plugin:2.5:clean (default-clean) @ spring-cloud-aws-core ---
[INFO]
[INFO] --- maven-checkstyle-plugin:3.1.0:check (checkstyle-validation) @ spring-cloud-aws-core ---
[INFO] Starting audit...
Audit done.
[INFO]
[INFO] --- maven-checkstyle-plugin:3.1.0:check (no-http-checkstyle-validation) @ spring-cloud-aws-core ---
[INFO]
[INFO] --- spring-javaformat-maven-plugin:0.0.25:validate (default) @ spring-cloud-aws-core ---
[INFO]
[INFO] --- spring-javaformat-maven-plugin:0.0.25:apply (default) @ spring-cloud-aws-core ---
[INFO]
[INFO] --- maven-resources-plugin:3.1.0:resources (default-resources) @ spring-cloud-aws-core ---
[INFO] Using 'UTF-8' encoding to copy filtered resources.
[INFO] Copying 0 resource
[INFO] Copying 1 resource
[INFO]
[INFO] --- maven-compiler-plugin:3.8.1:compile (default-compile) @ spring-cloud-aws-core ---
[INFO] Changes detected - recompiling the module!
[INFO] Compiling 33 source files to C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-core\target\classes
[INFO]
[INFO] --- maven-resources-plugin:3.1.0:testResources (default-testResources) @ spring-cloud-aws-core ---
[INFO] Using 'UTF-8' encoding to copy filtered resources.
[INFO] Copying 1 resource
[INFO]
[INFO] --- maven-compiler-plugin:3.8.1:testCompile (default-testCompile) @ spring-cloud-aws-core ---
[INFO] Changes detected - recompiling the module!
[INFO] Compiling 19 source files to C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-core\target\test-classes
[INFO]
[INFO] --- maven-surefire-plugin:2.22.2:test (default-test) @ spring-cloud-aws-core ---
[INFO]
[INFO] -------------------------------------------------------
[INFO]  T E S T S
[INFO] -------------------------------------------------------
[INFO] Running org.springframework.cloud.aws.core.config.AmazonWebserviceClientConfigurationUtilsTest
[INFO] Tests run: 5, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 2.138 s - in org.springframework.cloud.aws.core.config.AmazonWebserviceClientConfigurationUtilsTest
[INFO] Running org.springframework.cloud.aws.core.config.AmazonWebserviceClientFactoryBeanTest
[INFO] Tests run: 3, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0 s - in org.springframework.cloud.aws.core.config.AmazonWebserviceClientFactoryBeanTest
[INFO] Running org.springframework.cloud.aws.core.credentials.CredentialsProviderFactoryBeanTest
[INFO] Tests run: 3, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.892 s - in org.springframework.cloud.aws.core.credentials.CredentialsProviderFactoryBeanTest
[INFO] Running org.springframework.cloud.aws.core.env.ec2.AmazonEc2InstanceDataPropertySourceTest
[INFO] Tests run: 5, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 10.34 s - in org.springframework.cloud.aws.core.env.ec2.AmazonEc2InstanceDataPropertySourceTest
[INFO] Running org.springframework.cloud.aws.core.env.ec2.AmazonEc2InstanceUserTagsFactoryBeanTest
[INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 1.237 s - in org.springframework.cloud.aws.core.env.ec2.AmazonEc2InstanceUserTagsFactoryBeanTest
[INFO] Running org.springframework.cloud.aws.core.env.stack.config.StackResourceRegistryFactoryBeanTest
[INFO] Tests run: 7, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.281 s - in org.springframework.cloud.aws.core.env.stack.config.StackResourceRegistryFactoryBeanTest
[INFO] Running org.springframework.cloud.aws.core.env.stack.config.StackResourceUserTagsFactoryBeanTest
[INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.001 s - in org.springframework.cloud.aws.core.env.stack.config.StackResourceUserTagsFactoryBeanTest
[INFO] Running org.springframework.cloud.aws.core.env.StackResourceRegistryDetectingResourceIdResolverTest
[INFO] Tests run: 4, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.04 s - in org.springframework.cloud.aws.core.env.StackResourceRegistryDetectingResourceIdResolverTest
[INFO] Running org.springframework.cloud.aws.core.io.s3.AmazonS3ClientFactoryTest
[INFO] Tests run: 7, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.485 s - in org.springframework.cloud.aws.core.io.s3.AmazonS3ClientFactoryTest
[INFO] Running org.springframework.cloud.aws.core.io.s3.AmazonS3ProxyFactoryTest
[INFO] Tests run: 4, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.156 s - in org.springframework.cloud.aws.core.io.s3.AmazonS3ProxyFactoryTest
[INFO] Running org.springframework.cloud.aws.core.io.s3.PathMatchingSimpleStorageResourcePatternResolverTest
[INFO] Tests run: 4, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.14 s - in org.springframework.cloud.aws.core.io.s3.PathMatchingSimpleStorageResourcePatternResolverTest
[INFO] Running org.springframework.cloud.aws.core.io.s3.SimpleStorageNameUtilsTest
[INFO] Tests run: 17, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.011 s - in org.springframework.cloud.aws.core.io.s3.SimpleStorageNameUtilsTest
[INFO] Running org.springframework.cloud.aws.core.io.s3.SimpleStorageProtocolResolverTest
[INFO] Tests run: 6, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.001 s - in org.springframework.cloud.aws.core.io.s3.SimpleStorageProtocolResolverTest
[INFO] Running org.springframework.cloud.aws.core.io.s3.SimpleStorageResourceTest
[INFO] Tests run: 17, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.814 s - in org.springframework.cloud.aws.core.io.s3.SimpleStorageResourceTest
[INFO] Running org.springframework.cloud.aws.core.naming.AmazonResourceNameTest
[INFO] Tests run: 15, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.009 s - in org.springframework.cloud.aws.core.naming.AmazonResourceNameTest
[INFO] Running org.springframework.cloud.aws.core.region.Ec2MetadataRegionProviderTest
[INFO] Tests run: 2, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.001 s - in org.springframework.cloud.aws.core.region.Ec2MetadataRegionProviderTest
[INFO] Running org.springframework.cloud.aws.core.region.StaticRegionProviderTest
[INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0 s - in org.springframework.cloud.aws.core.region.StaticRegionProviderTest
[INFO]
[INFO] Results:
[INFO]
[INFO] Tests run: 102, Failures: 0, Errors: 0, Skipped: 0
[INFO]
[INFO]
[INFO] --- maven-jar-plugin:3.2.0:jar (default-jar) @ spring-cloud-aws-core ---
[INFO] Building jar: C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-core\target\spring-cloud-aws-core-3.0.0-SNAPSHOT.jar
[INFO]
[INFO] --- maven-javadoc-plugin:3.2.0:jar (javadoc) @ spring-cloud-aws-core ---
[INFO] No previous run data found, generating javadoc.
[INFO]
Loading source file C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-core\src\main\java\org\springframework\cloud\aws\core\config\AmazonWebserviceClientConfigurationUtils.java...
Loading source file C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-core\src\main\java\org\springframework\cloud\aws\core\config\AmazonWebserviceClientFactoryBean.java...
Loading source file C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-core\src\main\java\org\springframework\cloud\aws\core\config\AwsClientProperties.java...
Loading source file C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-core\src\main\java\org\springframework\cloud\aws\core\config\xml\XmlWebserviceConfigurationUtils.java...
Loading source file C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-core\src\main\java\org\springframework\cloud\aws\core\credentials\CredentialsProviderFactoryBean.java...
Loading source file C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-core\src\main\java\org\springframework\cloud\aws\core\env\ec2\AmazonEc2InstanceDataPropertySource.java...
Loading source file C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-core\src\main\java\org\springframework\cloud\aws\core\env\ec2\AmazonEc2InstanceIdProvider.java...
Loading source file C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-core\src\main\java\org\springframework\cloud\aws\core\env\ec2\AmazonEc2InstanceUserTagsFactoryBean.java...
Loading source file C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-core\src\main\java\org\springframework\cloud\aws\core\env\ec2\InstanceIdProvider.java...
Loading source file C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-core\src\main\java\org\springframework\cloud\aws\core\env\ResourceIdResolver.java...
Loading source file C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-core\src\main\java\org\springframework\cloud\aws\core\env\stack\config\AutoDetectingStackNameProvider.java...
Loading source file C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-core\src\main\java\org\springframework\cloud\aws\core\env\stack\config\StackNameProvider.java...
Loading source file C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-core\src\main\java\org\springframework\cloud\aws\core\env\stack\config\StackResourceRegistryFactoryBean.java...
Loading source file C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-core\src\main\java\org\springframework\cloud\aws\core\env\stack\config\StackResourceUserTagsFactoryBean.java...
Loading source file C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-core\src\main\java\org\springframework\cloud\aws\core\env\stack\config\StaticStackNameProvider.java...
Loading source file C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-core\src\main\java\org\springframework\cloud\aws\core\env\stack\ListableStackResourceFactory.java...
Loading source file C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-core\src\main\java\org\springframework\cloud\aws\core\env\stack\StackResource.java...
Loading source file C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-core\src\main\java\org\springframework\cloud\aws\core\env\stack\StackResourceRegistry.java...
Loading source file C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-core\src\main\java\org\springframework\cloud\aws\core\env\StackResourceRegistryDetectingResourceIdResolver.java...
Loading source file C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-core\src\main\java\org\springframework\cloud\aws\core\io\s3\AmazonS3ClientFactory.java...
Loading source file C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-core\src\main\java\org\springframework\cloud\aws\core\io\s3\AmazonS3ProxyFactory.java...
Loading source file C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-core\src\main\java\org\springframework\cloud\aws\core\io\s3\PathMatchingSimpleStorageResourcePatternResolver.java...
Loading source file C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-core\src\main\java\org\springframework\cloud\aws\core\io\s3\SimpleStorageNameUtils.java...
Loading source file C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-core\src\main\java\org\springframework\cloud\aws\core\io\s3\SimpleStorageProtocolResolver.java...
Loading source file C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-core\src\main\java\org\springframework\cloud\aws\core\io\s3\SimpleStorageResource.java...
Loading source file C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-core\src\main\java\org\springframework\cloud\aws\core\naming\AmazonResourceName.java...
Loading source file C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-core\src\main\java\org\springframework\cloud\aws\core\region\DefaultAwsRegionProviderChainDelegate.java...
Loading source file C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-core\src\main\java\org\springframework\cloud\aws\core\region\Ec2MetadataRegionProvider.java...
Loading source file C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-core\src\main\java\org\springframework\cloud\aws\core\region\RegionProvider.java...
Loading source file C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-core\src\main\java\org\springframework\cloud\aws\core\region\StaticRegionProvider.java...
Loading source file C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-core\src\main\java\org\springframework\cloud\aws\core\SpringCloudClientConfiguration.java...
Loading source file C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-core\src\main\java\org\springframework\cloud\aws\core\support\documentation\RuntimeUse.java...
Loading source file C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-core\src\main\java\org\springframework\cloud\aws\core\task\ShutdownSuppressingExecutorServiceAdapter.java...
Constructing Javadoc information...
Standard Doclet version 1.8.0_291
Building tree for all the packages and classes...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-core\target\apidocs\org\springframework\cloud\aws\core\env\stack\config\AutoDetectingStackNameProvider.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-core\target\apidocs\org\springframework\cloud\aws\core\env\stack\config\StackNameProvider.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-core\target\apidocs\org\springframework\cloud\aws\core\env\stack\config\StackResourceRegistryFactoryBean.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-core\target\apidocs\org\springframework\cloud\aws\core\env\stack\config\StackResourceUserTagsFactoryBean.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-core\target\apidocs\org\springframework\cloud\aws\core\env\stack\config\StaticStackNameProvider.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-core\target\apidocs\org\springframework\cloud\aws\core\config\xml\XmlWebserviceConfigurationUtils.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-core\target\apidocs\org\springframework\cloud\aws\core\naming\AmazonResourceName.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-core\target\apidocs\org\springframework\cloud\aws\core\naming\AmazonResourceName.Builder.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-core\target\apidocs\org\springframework\cloud\aws\core\SpringCloudClientConfiguration.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-core\target\apidocs\org\springframework\cloud\aws\core\region\DefaultAwsRegionProviderChainDelegate.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-core\target\apidocs\org\springframework\cloud\aws\core\region\Ec2MetadataRegionProvider.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-core\target\apidocs\org\springframework\cloud\aws\core\region\RegionProvider.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-core\target\apidocs\org\springframework\cloud\aws\core\region\StaticRegionProvider.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-core\target\apidocs\org\springframework\cloud\aws\core\task\ShutdownSuppressingExecutorServiceAdapter.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-core\target\apidocs\org\springframework\cloud\aws\core\config\AmazonWebserviceClientConfigurationUtils.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-core\target\apidocs\org\springframework\cloud\aws\core\config\AmazonWebserviceClientFactoryBean.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-core\target\apidocs\org\springframework\cloud\aws\core\config\AwsClientProperties.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-core\target\apidocs\org\springframework\cloud\aws\core\env\ResourceIdResolver.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-core\target\apidocs\org\springframework\cloud\aws\core\env\StackResourceRegistryDetectingResourceIdResolver.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-core\target\apidocs\org\springframework\cloud\aws\core\env\ec2\AmazonEc2InstanceDataPropertySource.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-core\target\apidocs\org\springframework\cloud\aws\core\env\ec2\AmazonEc2InstanceIdProvider.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-core\target\apidocs\org\springframework\cloud\aws\core\env\ec2\AmazonEc2InstanceUserTagsFactoryBean.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-core\target\apidocs\org\springframework\cloud\aws\core\env\ec2\InstanceIdProvider.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-core\target\apidocs\org\springframework\cloud\aws\core\env\stack\ListableStackResourceFactory.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-core\target\apidocs\org\springframework\cloud\aws\core\env\stack\StackResource.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-core\target\apidocs\org\springframework\cloud\aws\core\env\stack\StackResourceRegistry.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-core\target\apidocs\org\springframework\cloud\aws\core\io\s3\AmazonS3ClientFactory.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-core\target\apidocs\org\springframework\cloud\aws\core\io\s3\AmazonS3ProxyFactory.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-core\target\apidocs\org\springframework\cloud\aws\core\io\s3\PathMatchingSimpleStorageResourcePatternResolver.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-core\target\apidocs\org\springframework\cloud\aws\core\io\s3\SimpleStorageProtocolResolver.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-core\target\apidocs\org\springframework\cloud\aws\core\io\s3\SimpleStorageResource.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-core\target\apidocs\org\springframework\cloud\aws\core\credentials\CredentialsProviderFactoryBean.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-core\target\apidocs\org\springframework\cloud\aws\core\support\documentation\RuntimeUse.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-core\target\apidocs\overview-frame.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-core\target\apidocs\org\springframework\cloud\aws\core\package-frame.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-core\target\apidocs\org\springframework\cloud\aws\core\package-summary.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-core\target\apidocs\org\springframework\cloud\aws\core\package-tree.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-core\target\apidocs\org\springframework\cloud\aws\core\config\package-frame.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-core\target\apidocs\org\springframework\cloud\aws\core\config\package-summary.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-core\target\apidocs\org\springframework\cloud\aws\core\config\package-tree.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-core\target\apidocs\org\springframework\cloud\aws\core\config\xml\package-frame.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-core\target\apidocs\org\springframework\cloud\aws\core\config\xml\package-summary.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-core\target\apidocs\org\springframework\cloud\aws\core\config\xml\package-tree.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-core\target\apidocs\org\springframework\cloud\aws\core\credentials\package-frame.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-core\target\apidocs\org\springframework\cloud\aws\core\credentials\package-summary.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-core\target\apidocs\org\springframework\cloud\aws\core\credentials\package-tree.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-core\target\apidocs\org\springframework\cloud\aws\core\env\package-frame.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-core\target\apidocs\org\springframework\cloud\aws\core\env\package-summary.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-core\target\apidocs\org\springframework\cloud\aws\core\env\package-tree.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-core\target\apidocs\org\springframework\cloud\aws\core\env\ec2\package-frame.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-core\target\apidocs\org\springframework\cloud\aws\core\env\ec2\package-summary.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-core\target\apidocs\org\springframework\cloud\aws\core\env\ec2\package-tree.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-core\target\apidocs\org\springframework\cloud\aws\core\env\stack\package-frame.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-core\target\apidocs\org\springframework\cloud\aws\core\env\stack\package-summary.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-core\target\apidocs\org\springframework\cloud\aws\core\env\stack\package-tree.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-core\target\apidocs\org\springframework\cloud\aws\core\env\stack\config\package-frame.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-core\target\apidocs\org\springframework\cloud\aws\core\env\stack\config\package-summary.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-core\target\apidocs\org\springframework\cloud\aws\core\env\stack\config\package-tree.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-core\target\apidocs\org\springframework\cloud\aws\core\io\s3\package-frame.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-core\target\apidocs\org\springframework\cloud\aws\core\io\s3\package-summary.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-core\target\apidocs\org\springframework\cloud\aws\core\io\s3\package-tree.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-core\target\apidocs\org\springframework\cloud\aws\core\naming\package-frame.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-core\target\apidocs\org\springframework\cloud\aws\core\naming\package-summary.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-core\target\apidocs\org\springframework\cloud\aws\core\naming\package-tree.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-core\target\apidocs\org\springframework\cloud\aws\core\region\package-frame.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-core\target\apidocs\org\springframework\cloud\aws\core\region\package-summary.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-core\target\apidocs\org\springframework\cloud\aws\core\region\package-tree.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-core\target\apidocs\org\springframework\cloud\aws\core\support\documentation\package-frame.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-core\target\apidocs\org\springframework\cloud\aws\core\support\documentation\package-summary.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-core\target\apidocs\org\springframework\cloud\aws\core\support\documentation\package-tree.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-core\target\apidocs\org\springframework\cloud\aws\core\task\package-frame.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-core\target\apidocs\org\springframework\cloud\aws\core\task\package-summary.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-core\target\apidocs\org\springframework\cloud\aws\core\task\package-tree.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-core\target\apidocs\constant-values.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-core\target\apidocs\org\springframework\cloud\aws\core\config\class-use\AmazonWebserviceClientConfigurationUtils.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-core\target\apidocs\org\springframework\cloud\aws\core\config\class-use\AmazonWebserviceClientFactoryBean.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-core\target\apidocs\org\springframework\cloud\aws\core\config\class-use\AwsClientProperties.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-core\target\apidocs\org\springframework\cloud\aws\core\config\xml\class-use\XmlWebserviceConfigurationUtils.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-core\target\apidocs\org\springframework\cloud\aws\core\credentials\class-use\CredentialsProviderFactoryBean.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-core\target\apidocs\org\springframework\cloud\aws\core\env\ec2\class-use\AmazonEc2InstanceDataPropertySource.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-core\target\apidocs\org\springframework\cloud\aws\core\env\ec2\class-use\AmazonEc2InstanceIdProvider.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-core\target\apidocs\org\springframework\cloud\aws\core\env\ec2\class-use\AmazonEc2InstanceUserTagsFactoryBean.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-core\target\apidocs\org\springframework\cloud\aws\core\env\ec2\class-use\InstanceIdProvider.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-core\target\apidocs\org\springframework\cloud\aws\core\env\class-use\ResourceIdResolver.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-core\target\apidocs\org\springframework\cloud\aws\core\env\stack\config\class-use\AutoDetectingStackNameProvider.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-core\target\apidocs\org\springframework\cloud\aws\core\env\stack\config\class-use\StackNameProvider.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-core\target\apidocs\org\springframework\cloud\aws\core\env\stack\config\class-use\StackResourceRegistryFactoryBean.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-core\target\apidocs\org\springframework\cloud\aws\core\env\stack\config\class-use\StackResourceUserTagsFactoryBean.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-core\target\apidocs\org\springframework\cloud\aws\core\env\stack\config\class-use\StaticStackNameProvider.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-core\target\apidocs\org\springframework\cloud\aws\core\env\stack\class-use\ListableStackResourceFactory.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-core\target\apidocs\org\springframework\cloud\aws\core\env\stack\class-use\StackResource.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-core\target\apidocs\org\springframework\cloud\aws\core\env\stack\class-use\StackResourceRegistry.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-core\target\apidocs\org\springframework\cloud\aws\core\env\class-use\StackResourceRegistryDetectingResourceIdResolver.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-core\target\apidocs\org\springframework\cloud\aws\core\io\s3\class-use\AmazonS3ClientFactory.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-core\target\apidocs\org\springframework\cloud\aws\core\io\s3\class-use\AmazonS3ProxyFactory.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-core\target\apidocs\org\springframework\cloud\aws\core\io\s3\class-use\PathMatchingSimpleStorageResourcePatternResolver.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-core\target\apidocs\org\springframework\cloud\aws\core\io\s3\class-use\SimpleStorageProtocolResolver.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-core\target\apidocs\org\springframework\cloud\aws\core\io\s3\class-use\SimpleStorageResource.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-core\target\apidocs\org\springframework\cloud\aws\core\naming\class-use\AmazonResourceName.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-core\target\apidocs\org\springframework\cloud\aws\core\naming\class-use\AmazonResourceName.Builder.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-core\target\apidocs\org\springframework\cloud\aws\core\region\class-use\DefaultAwsRegionProviderChainDelegate.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-core\target\apidocs\org\springframework\cloud\aws\core\region\class-use\Ec2MetadataRegionProvider.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-core\target\apidocs\org\springframework\cloud\aws\core\region\class-use\RegionProvider.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-core\target\apidocs\org\springframework\cloud\aws\core\region\class-use\StaticRegionProvider.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-core\target\apidocs\org\springframework\cloud\aws\core\class-use\SpringCloudClientConfiguration.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-core\target\apidocs\org\springframework\cloud\aws\core\support\documentation\class-use\RuntimeUse.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-core\target\apidocs\org\springframework\cloud\aws\core\task\class-use\ShutdownSuppressingExecutorServiceAdapter.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-core\target\apidocs\org\springframework\cloud\aws\core\package-use.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-core\target\apidocs\org\springframework\cloud\aws\core\config\package-use.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-core\target\apidocs\org\springframework\cloud\aws\core\config\xml\package-use.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-core\target\apidocs\org\springframework\cloud\aws\core\credentials\package-use.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-core\target\apidocs\org\springframework\cloud\aws\core\env\package-use.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-core\target\apidocs\org\springframework\cloud\aws\core\env\ec2\package-use.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-core\target\apidocs\org\springframework\cloud\aws\core\env\stack\package-use.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-core\target\apidocs\org\springframework\cloud\aws\core\env\stack\config\package-use.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-core\target\apidocs\org\springframework\cloud\aws\core\io\s3\package-use.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-core\target\apidocs\org\springframework\cloud\aws\core\naming\package-use.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-core\target\apidocs\org\springframework\cloud\aws\core\region\package-use.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-core\target\apidocs\org\springframework\cloud\aws\core\support\documentation\package-use.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-core\target\apidocs\org\springframework\cloud\aws\core\task\package-use.html...
Building index for all the packages and classes...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-core\target\apidocs\overview-tree.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-core\target\apidocs\index-all.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-core\target\apidocs\deprecated-list.html...
Building index for all classes...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-core\target\apidocs\allclasses-frame.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-core\target\apidocs\allclasses-noframe.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-core\target\apidocs\index.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-core\target\apidocs\overview-summary.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-core\target\apidocs\help-doc.html...
[INFO] Building jar: C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-core\target\spring-cloud-aws-core-3.0.0-SNAPSHOT-javadoc.jar
[INFO]
[INFO] >>> maven-source-plugin:3.2.1:jar (attach-sources) > generate-sources @ spring-cloud-aws-core >>>
[INFO]
[INFO] --- maven-checkstyle-plugin:3.1.0:check (checkstyle-validation) @ spring-cloud-aws-core ---
[INFO] Starting audit...
Audit done.
[INFO]
[INFO] --- maven-checkstyle-plugin:3.1.0:check (no-http-checkstyle-validation) @ spring-cloud-aws-core ---
[INFO]
[INFO] --- spring-javaformat-maven-plugin:0.0.25:validate (default) @ spring-cloud-aws-core ---
[INFO]
[INFO] --- spring-javaformat-maven-plugin:0.0.25:apply (default) @ spring-cloud-aws-core ---
[INFO]
[INFO] <<< maven-source-plugin:3.2.1:jar (attach-sources) < generate-sources @ spring-cloud-aws-core <<<
[INFO]
[INFO]
[INFO] --- maven-source-plugin:3.2.1:jar (attach-sources) @ spring-cloud-aws-core ---
[INFO] Building jar: C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-core\target\spring-cloud-aws-core-3.0.0-SNAPSHOT-sources.jar
[INFO]
[INFO] ---------< org.springframework.cloud:spring-cloud-aws-context >---------
[INFO] Building Spring Cloud AWS Context 3.0.0-SNAPSHOT                  [4/18]
[INFO] --------------------------------[ jar ]---------------------------------
Downloading from spring-milestones: https://repo.spring.io/libs-milestone-local/org/springframework/spring-context-support/5.3.1/spring-context-support-5.3.1.pom
Downloading from spring-releases: https://repo.spring.io/release/org/springframework/spring-context-support/5.3.1/spring-context-support-5.3.1.pom
Downloaded from spring-releases: https://repo.spring.io/release/org/springframework/spring-context-support/5.3.1/spring-context-support-5.3.1.pom (2.4 kB at 3.4 kB/s)
Downloading from spring-milestones: https://repo.spring.io/libs-milestone-local/javax/mail/javax.mail-api/1.5.5/javax.mail-api-1.5.5.pom
Downloading from spring-releases: https://repo.spring.io/release/javax/mail/javax.mail-api/1.5.5/javax.mail-api-1.5.5.pom
Downloading from spring-plugins: https://repo.spring.io/plugins/javax/mail/javax.mail-api/1.5.5/javax.mail-api-1.5.5.pom
Downloading from central: https://repo.maven.apache.org/maven2/javax/mail/javax.mail-api/1.5.5/javax.mail-api-1.5.5.pom
Downloaded from central: https://repo.maven.apache.org/maven2/javax/mail/javax.mail-api/1.5.5/javax.mail-api-1.5.5.pom (4.7 kB at 44 kB/s)
Downloading from spring-milestones: https://repo.spring.io/libs-milestone-local/com/sun/mail/jakarta.mail/1.6.5/jakarta.mail-1.6.5.pom
Downloading from spring-releases: https://repo.spring.io/release/com/sun/mail/jakarta.mail/1.6.5/jakarta.mail-1.6.5.pom
Downloading from spring-plugins: https://repo.spring.io/plugins/com/sun/mail/jakarta.mail/1.6.5/jakarta.mail-1.6.5.pom
Downloading from central: https://repo.maven.apache.org/maven2/com/sun/mail/jakarta.mail/1.6.5/jakarta.mail-1.6.5.pom
Downloaded from central: https://repo.maven.apache.org/maven2/com/sun/mail/jakarta.mail/1.6.5/jakarta.mail-1.6.5.pom (5.9 kB at 70 kB/s)
Downloading from spring-milestones: https://repo.spring.io/libs-milestone-local/com/sun/mail/all/1.6.5/all-1.6.5.pom
Downloading from spring-releases: https://repo.spring.io/release/com/sun/mail/all/1.6.5/all-1.6.5.pom
Downloading from spring-plugins: https://repo.spring.io/plugins/com/sun/mail/all/1.6.5/all-1.6.5.pom
Downloading from central: https://repo.maven.apache.org/maven2/com/sun/mail/all/1.6.5/all-1.6.5.pom
Downloaded from central: https://repo.maven.apache.org/maven2/com/sun/mail/all/1.6.5/all-1.6.5.pom (21 kB at 34 kB/s)
Downloading from spring-milestones: https://repo.spring.io/libs-milestone-local/com/amazonaws/aws-java-sdk-elasticache/1.11.907/aws-java-sdk-elasticache-1.11.907.pom
Downloading from spring-releases: https://repo.spring.io/release/com/amazonaws/aws-java-sdk-elasticache/1.11.907/aws-java-sdk-elasticache-1.11.907.pom
Downloading from spring-plugins: https://repo.spring.io/plugins/com/amazonaws/aws-java-sdk-elasticache/1.11.907/aws-java-sdk-elasticache-1.11.907.pom
Downloading from central: https://repo.maven.apache.org/maven2/com/amazonaws/aws-java-sdk-elasticache/1.11.907/aws-java-sdk-elasticache-1.11.907.pom
Downloaded from central: https://repo.maven.apache.org/maven2/com/amazonaws/aws-java-sdk-elasticache/1.11.907/aws-java-sdk-elasticache-1.11.907.pom (3.6 kB at 13 kB/s)
Downloading from spring-milestones: https://repo.spring.io/libs-milestone-local/com/amazonaws/aws-java-sdk-ses/1.11.907/aws-java-sdk-ses-1.11.907.pom
Downloading from spring-releases: https://repo.spring.io/release/com/amazonaws/aws-java-sdk-ses/1.11.907/aws-java-sdk-ses-1.11.907.pom
Downloading from spring-plugins: https://repo.spring.io/plugins/com/amazonaws/aws-java-sdk-ses/1.11.907/aws-java-sdk-ses-1.11.907.pom
Downloading from central: https://repo.maven.apache.org/maven2/com/amazonaws/aws-java-sdk-ses/1.11.907/aws-java-sdk-ses-1.11.907.pom
Downloaded from central: https://repo.maven.apache.org/maven2/com/amazonaws/aws-java-sdk-ses/1.11.907/aws-java-sdk-ses-1.11.907.pom (3.8 kB at 14 kB/s)
Downloading from spring-milestones: https://repo.spring.io/libs-milestone-local/com/thimbleware/jmemcached/jmemcached-core/1.0.0/jmemcached-core-1.0.0.pom
Downloading from spring-releases: https://repo.spring.io/release/com/thimbleware/jmemcached/jmemcached-core/1.0.0/jmemcached-core-1.0.0.pom
Downloading from spring-plugins: https://repo.spring.io/plugins/com/thimbleware/jmemcached/jmemcached-core/1.0.0/jmemcached-core-1.0.0.pom
Downloading from central: https://repo.maven.apache.org/maven2/com/thimbleware/jmemcached/jmemcached-core/1.0.0/jmemcached-core-1.0.0.pom
Downloaded from central: https://repo.maven.apache.org/maven2/com/thimbleware/jmemcached/jmemcached-core/1.0.0/jmemcached-core-1.0.0.pom (1.3 kB at 15 kB/s)
Downloading from spring-milestones: https://repo.spring.io/libs-milestone-local/com/thimbleware/jmemcached/jmemcached-parent/1.0.0/jmemcached-parent-1.0.0.pom
Downloading from spring-releases: https://repo.spring.io/release/com/thimbleware/jmemcached/jmemcached-parent/1.0.0/jmemcached-parent-1.0.0.pom
Downloading from spring-plugins: https://repo.spring.io/plugins/com/thimbleware/jmemcached/jmemcached-parent/1.0.0/jmemcached-parent-1.0.0.pom
Downloading from central: https://repo.maven.apache.org/maven2/com/thimbleware/jmemcached/jmemcached-parent/1.0.0/jmemcached-parent-1.0.0.pom
Downloaded from central: https://repo.maven.apache.org/maven2/com/thimbleware/jmemcached/jmemcached-parent/1.0.0/jmemcached-parent-1.0.0.pom (6.2 kB at 80 kB/s)
Downloading from spring-milestones: https://repo.spring.io/libs-milestone-local/org/jboss/netty/netty/3.2.3.Final/netty-3.2.3.Final.pom
Downloading from spring-releases: https://repo.spring.io/release/org/jboss/netty/netty/3.2.3.Final/netty-3.2.3.Final.pom
Downloading from spring-plugins: https://repo.spring.io/plugins/org/jboss/netty/netty/3.2.3.Final/netty-3.2.3.Final.pom
Downloading from central: https://repo.maven.apache.org/maven2/org/jboss/netty/netty/3.2.3.Final/netty-3.2.3.Final.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/jboss/netty/netty/3.2.3.Final/netty-3.2.3.Final.pom (24 kB at 77 kB/s)
Downloading from spring-milestones: https://repo.spring.io/libs-milestone-local/com/amazonaws/elasticache-java-cluster-client/1.1.1/elasticache-java-cluster-client-1.1.1.pom
Downloading from spring-releases: https://repo.spring.io/release/com/amazonaws/elasticache-java-cluster-client/1.1.1/elasticache-java-cluster-client-1.1.1.pom
Downloading from spring-plugins: https://repo.spring.io/plugins/com/amazonaws/elasticache-java-cluster-client/1.1.1/elasticache-java-cluster-client-1.1.1.pom
Downloading from central: https://repo.maven.apache.org/maven2/com/amazonaws/elasticache-java-cluster-client/1.1.1/elasticache-java-cluster-client-1.1.1.pom
Downloaded from central: https://repo.maven.apache.org/maven2/com/amazonaws/elasticache-java-cluster-client/1.1.1/elasticache-java-cluster-client-1.1.1.pom (2.6 kB at 14 kB/s)
Downloading from spring-milestones: https://repo.spring.io/libs-milestone-local/org/springframework/data/spring-data-redis/2.4.1/spring-data-redis-2.4.1.pom
Downloading from spring-releases: https://repo.spring.io/release/org/springframework/data/spring-data-redis/2.4.1/spring-data-redis-2.4.1.pom
Downloaded from spring-releases: https://repo.spring.io/release/org/springframework/data/spring-data-redis/2.4.1/spring-data-redis-2.4.1.pom (7.9 kB at 15 kB/s)
Downloading from spring-milestones: https://repo.spring.io/libs-milestone-local/org/springframework/data/build/spring-data-parent/2.4.1/spring-data-parent-2.4.1.pom
Downloading from spring-releases: https://repo.spring.io/release/org/springframework/data/build/spring-data-parent/2.4.1/spring-data-parent-2.4.1.pom
Downloaded from spring-releases: https://repo.spring.io/release/org/springframework/data/build/spring-data-parent/2.4.1/spring-data-parent-2.4.1.pom (38 kB at 45 kB/s)
Downloading from spring-milestones: https://repo.spring.io/libs-milestone-local/org/springframework/data/build/spring-data-build/2.4.1/spring-data-build-2.4.1.pom
Downloading from spring-releases: https://repo.spring.io/release/org/springframework/data/build/spring-data-build/2.4.1/spring-data-build-2.4.1.pom
Downloaded from spring-releases: https://repo.spring.io/release/org/springframework/data/build/spring-data-build/2.4.1/spring-data-build-2.4.1.pom (7.0 kB at 13 kB/s)
Downloading from spring-milestones: https://repo.spring.io/libs-milestone-local/org/springframework/data/spring-data-keyvalue/2.4.1/spring-data-keyvalue-2.4.1.pom
Downloading from spring-releases: https://repo.spring.io/release/org/springframework/data/spring-data-keyvalue/2.4.1/spring-data-keyvalue-2.4.1.pom
Downloaded from spring-releases: https://repo.spring.io/release/org/springframework/data/spring-data-keyvalue/2.4.1/spring-data-keyvalue-2.4.1.pom (2.5 kB at 6.6 kB/s)
Downloading from spring-milestones: https://repo.spring.io/libs-milestone-local/org/springframework/data/spring-data-commons/2.4.1/spring-data-commons-2.4.1.pom
Downloading from spring-releases: https://repo.spring.io/release/org/springframework/data/spring-data-commons/2.4.1/spring-data-commons-2.4.1.pom
Downloaded from spring-releases: https://repo.spring.io/release/org/springframework/data/spring-data-commons/2.4.1/spring-data-commons-2.4.1.pom (9.3 kB at 19 kB/s)
Downloading from spring-milestones: https://repo.spring.io/libs-milestone-local/org/springframework/spring-tx/5.3.1/spring-tx-5.3.1.pom
Downloading from spring-releases: https://repo.spring.io/release/org/springframework/spring-tx/5.3.1/spring-tx-5.3.1.pom
Downloaded from spring-releases: https://repo.spring.io/release/org/springframework/spring-tx/5.3.1/spring-tx-5.3.1.pom (2.2 kB at 5.7 kB/s)
Downloading from spring-milestones: https://repo.spring.io/libs-milestone-local/org/springframework/spring-oxm/5.3.1/spring-oxm-5.3.1.pom
Downloading from spring-releases: https://repo.spring.io/release/org/springframework/spring-oxm/5.3.1/spring-oxm-5.3.1.pom
Downloaded from spring-releases: https://repo.spring.io/release/org/springframework/spring-oxm/5.3.1/spring-oxm-5.3.1.pom (2.2 kB at 6.4 kB/s)
Downloading from spring-milestones: https://repo.spring.io/libs-milestone-local/redis/clients/jedis/3.3.0/jedis-3.3.0.pom
Downloading from spring-releases: https://repo.spring.io/release/redis/clients/jedis/3.3.0/jedis-3.3.0.pom
Downloading from spring-plugins: https://repo.spring.io/plugins/redis/clients/jedis/3.3.0/jedis-3.3.0.pom
Downloading from central: https://repo.maven.apache.org/maven2/redis/clients/jedis/3.3.0/jedis-3.3.0.pom
Downloaded from central: https://repo.maven.apache.org/maven2/redis/clients/jedis/3.3.0/jedis-3.3.0.pom (7.0 kB at 49 kB/s)
Downloading from spring-milestones: https://repo.spring.io/libs-milestone-local/org/apache/commons/commons-pool2/2.9.0/commons-pool2-2.9.0.pom
Downloading from spring-releases: https://repo.spring.io/release/org/apache/commons/commons-pool2/2.9.0/commons-pool2-2.9.0.pom
Downloading from spring-plugins: https://repo.spring.io/plugins/org/apache/commons/commons-pool2/2.9.0/commons-pool2-2.9.0.pom
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/commons/commons-pool2/2.9.0/commons-pool2-2.9.0.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/commons/commons-pool2/2.9.0/commons-pool2-2.9.0.pom (17 kB at 185 kB/s)
Downloading from spring-milestones: https://repo.spring.io/libs-milestone-local/org/springframework/spring-context-support/5.3.1/spring-context-support-5.3.1.jar
Downloading from spring-milestones: https://repo.spring.io/libs-milestone-local/com/amazonaws/aws-java-sdk-ses/1.11.907/aws-java-sdk-ses-1.11.907.jar
Downloading from spring-milestones: https://repo.spring.io/libs-milestone-local/com/amazonaws/aws-java-sdk-elasticache/1.11.907/aws-java-sdk-elasticache-1.11.907.jar
Downloading from spring-milestones: https://repo.spring.io/libs-milestone-local/com/sun/mail/jakarta.mail/1.6.5/jakarta.mail-1.6.5.jar
Downloading from spring-milestones: https://repo.spring.io/libs-milestone-local/javax/mail/javax.mail-api/1.5.5/javax.mail-api-1.5.5.jar
Downloading from spring-milestones: https://repo.spring.io/libs-milestone-local/com/thimbleware/jmemcached/jmemcached-core/1.0.0/jmemcached-core-1.0.0.jar
Downloading from spring-milestones: https://repo.spring.io/libs-milestone-local/org/jboss/netty/netty/3.2.3.Final/netty-3.2.3.Final.jar
Downloading from spring-milestones: https://repo.spring.io/libs-milestone-local/com/amazonaws/elasticache-java-cluster-client/1.1.1/elasticache-java-cluster-client-1.1.1.jar
Downloading from spring-milestones: https://repo.spring.io/libs-milestone-local/org/springframework/data/spring-data-redis/2.4.1/spring-data-redis-2.4.1.jar
Downloading from spring-milestones: https://repo.spring.io/libs-milestone-local/org/springframework/data/spring-data-keyvalue/2.4.1/spring-data-keyvalue-2.4.1.jar
Downloading from spring-milestones: https://repo.spring.io/libs-milestone-local/org/springframework/spring-tx/5.3.1/spring-tx-5.3.1.jar
Downloading from spring-milestones: https://repo.spring.io/libs-milestone-local/org/springframework/data/spring-data-commons/2.4.1/spring-data-commons-2.4.1.jar
Downloading from spring-milestones: https://repo.spring.io/libs-milestone-local/org/springframework/spring-oxm/5.3.1/spring-oxm-5.3.1.jar
Downloading from spring-milestones: https://repo.spring.io/libs-milestone-local/redis/clients/jedis/3.3.0/jedis-3.3.0.jar
Downloading from spring-milestones: https://repo.spring.io/libs-milestone-local/org/apache/commons/commons-pool2/2.9.0/commons-pool2-2.9.0.jar
Downloading from spring-releases: https://repo.spring.io/release/org/springframework/spring-context-support/5.3.1/spring-context-support-5.3.1.jar
Downloading from spring-releases: https://repo.spring.io/release/com/amazonaws/aws-java-sdk-ses/1.11.907/aws-java-sdk-ses-1.11.907.jar
Downloading from spring-releases: https://repo.spring.io/release/com/amazonaws/aws-java-sdk-elasticache/1.11.907/aws-java-sdk-elasticache-1.11.907.jar
Downloading from spring-releases: https://repo.spring.io/release/com/sun/mail/jakarta.mail/1.6.5/jakarta.mail-1.6.5.jar
Downloading from spring-releases: https://repo.spring.io/release/javax/mail/javax.mail-api/1.5.5/javax.mail-api-1.5.5.jar
Downloading from spring-releases: https://repo.spring.io/release/com/thimbleware/jmemcached/jmemcached-core/1.0.0/jmemcached-core-1.0.0.jar
Downloading from spring-releases: https://repo.spring.io/release/com/amazonaws/elasticache-java-cluster-client/1.1.1/elasticache-java-cluster-client-1.1.1.jar
Downloading from spring-releases: https://repo.spring.io/release/org/springframework/data/spring-data-redis/2.4.1/spring-data-redis-2.4.1.jar
Downloading from spring-releases: https://repo.spring.io/release/org/jboss/netty/netty/3.2.3.Final/netty-3.2.3.Final.jar
Downloading from spring-releases: https://repo.spring.io/release/org/springframework/data/spring-data-keyvalue/2.4.1/spring-data-keyvalue-2.4.1.jar
Downloading from spring-releases: https://repo.spring.io/release/org/springframework/data/spring-data-commons/2.4.1/spring-data-commons-2.4.1.jar
Downloading from spring-releases: https://repo.spring.io/release/org/springframework/spring-tx/5.3.1/spring-tx-5.3.1.jar
Downloaded from spring-releases: https://repo.spring.io/release/org/springframework/spring-context-support/5.3.1/spring-context-support-5.3.1.jar (183 kB at 155 kB/s)
Downloading from spring-releases: https://repo.spring.io/release/org/springframework/spring-oxm/5.3.1/spring-oxm-5.3.1.jar
Downloaded from spring-releases: https://repo.spring.io/release/org/springframework/spring-oxm/5.3.1/spring-oxm-5.3.1.jar (64 kB at 38 kB/s)
Downloading from spring-releases: https://repo.spring.io/release/redis/clients/jedis/3.3.0/jedis-3.3.0.jar
Downloading from spring-releases: https://repo.spring.io/release/org/apache/commons/commons-pool2/2.9.0/commons-pool2-2.9.0.jar
Downloaded from spring-releases: https://repo.spring.io/release/org/springframework/data/spring-data-keyvalue/2.4.1/spring-data-keyvalue-2.4.1.jar (107 kB at 42 kB/s)
Downloaded from spring-releases: https://repo.spring.io/release/org/springframework/spring-tx/5.3.1/spring-tx-5.3.1.jar (328 kB at 89 kB/s)
Downloaded from spring-releases: https://repo.spring.io/release/org/springframework/data/spring-data-commons/2.4.1/spring-data-commons-2.4.1.jar (1.2 MB at 198 kB/s)
Downloaded from spring-releases: https://repo.spring.io/release/org/springframework/data/spring-data-redis/2.4.1/spring-data-redis-2.4.1.jar (1.9 MB at 228 kB/s)
Downloading from spring-plugins: https://repo.spring.io/plugins/javax/mail/javax.mail-api/1.5.5/javax.mail-api-1.5.5.jar
Downloading from spring-plugins: https://repo.spring.io/plugins/com/amazonaws/aws-java-sdk-ses/1.11.907/aws-java-sdk-ses-1.11.907.jar
Downloading from spring-plugins: https://repo.spring.io/plugins/com/amazonaws/aws-java-sdk-elasticache/1.11.907/aws-java-sdk-elasticache-1.11.907.jar
Downloading from spring-plugins: https://repo.spring.io/plugins/com/sun/mail/jakarta.mail/1.6.5/jakarta.mail-1.6.5.jar
Downloading from spring-plugins: https://repo.spring.io/plugins/com/thimbleware/jmemcached/jmemcached-core/1.0.0/jmemcached-core-1.0.0.jar
Downloading from spring-plugins: https://repo.spring.io/plugins/org/jboss/netty/netty/3.2.3.Final/netty-3.2.3.Final.jar
Downloading from spring-plugins: https://repo.spring.io/plugins/com/amazonaws/elasticache-java-cluster-client/1.1.1/elasticache-java-cluster-client-1.1.1.jar
Downloading from spring-plugins: https://repo.spring.io/plugins/redis/clients/jedis/3.3.0/jedis-3.3.0.jar
Downloading from spring-plugins: https://repo.spring.io/plugins/org/apache/commons/commons-pool2/2.9.0/commons-pool2-2.9.0.jar
Downloading from central: https://repo.maven.apache.org/maven2/javax/mail/javax.mail-api/1.5.5/javax.mail-api-1.5.5.jar
Downloading from central: https://repo.maven.apache.org/maven2/com/amazonaws/aws-java-sdk-ses/1.11.907/aws-java-sdk-ses-1.11.907.jar
Downloading from central: https://repo.maven.apache.org/maven2/com/amazonaws/aws-java-sdk-elasticache/1.11.907/aws-java-sdk-elasticache-1.11.907.jar
Downloading from central: https://repo.maven.apache.org/maven2/com/sun/mail/jakarta.mail/1.6.5/jakarta.mail-1.6.5.jar
Downloading from central: https://repo.maven.apache.org/maven2/com/thimbleware/jmemcached/jmemcached-core/1.0.0/jmemcached-core-1.0.0.jar
Downloaded from central: https://repo.maven.apache.org/maven2/javax/mail/javax.mail-api/1.5.5/javax.mail-api-1.5.5.jar (203 kB at 489 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/jboss/netty/netty/3.2.3.Final/netty-3.2.3.Final.jar
Downloaded from central: https://repo.maven.apache.org/maven2/com/thimbleware/jmemcached/jmemcached-core/1.0.0/jmemcached-core-1.0.0.jar (101 kB at 206 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/com/amazonaws/elasticache-java-cluster-client/1.1.1/elasticache-java-cluster-client-1.1.1.jar
Downloaded from central: https://repo.maven.apache.org/maven2/com/sun/mail/jakarta.mail/1.6.5/jakarta.mail-1.6.5.jar (670 kB at 254 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/redis/clients/jedis/3.3.0/jedis-3.3.0.jar
Downloaded from central: https://repo.maven.apache.org/maven2/org/jboss/netty/netty/3.2.3.Final/netty-3.2.3.Final.jar (786 kB at 278 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/commons/commons-pool2/2.9.0/commons-pool2-2.9.0.jar
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/commons/commons-pool2/2.9.0/commons-pool2-2.9.0.jar (135 kB at 41 kB/s)
Downloaded from central: https://repo.maven.apache.org/maven2/com/amazonaws/elasticache-java-cluster-client/1.1.1/elasticache-java-cluster-client-1.1.1.jar (515 kB at 151 kB/s)
Downloaded from central: https://repo.maven.apache.org/maven2/com/amazonaws/aws-java-sdk-elasticache/1.11.907/aws-java-sdk-elasticache-1.11.907.jar (891 kB at 261 kB/s)
Downloaded from central: https://repo.maven.apache.org/maven2/redis/clients/jedis/3.3.0/jedis-3.3.0.jar (679 kB at 167 kB/s)
Downloaded from central: https://repo.maven.apache.org/maven2/com/amazonaws/aws-java-sdk-ses/1.11.907/aws-java-sdk-ses-1.11.907.jar (792 kB at 184 kB/s)
[INFO]
[INFO] --- maven-clean-plugin:2.5:clean (default-clean) @ spring-cloud-aws-context ---
[INFO]
[INFO] --- maven-checkstyle-plugin:3.1.0:check (checkstyle-validation) @ spring-cloud-aws-context ---
[INFO] Starting audit...
Audit done.
[INFO]
[INFO] --- maven-checkstyle-plugin:3.1.0:check (no-http-checkstyle-validation) @ spring-cloud-aws-context ---
[INFO]
[INFO] --- spring-javaformat-maven-plugin:0.0.25:validate (default) @ spring-cloud-aws-context ---
[INFO]
[INFO] --- spring-javaformat-maven-plugin:0.0.25:apply (default) @ spring-cloud-aws-context ---
[INFO]
[INFO] --- maven-resources-plugin:3.1.0:resources (default-resources) @ spring-cloud-aws-context ---
[INFO] Using 'UTF-8' encoding to copy filtered resources.
[INFO] Copying 0 resource
[INFO] Copying 8 resources
[INFO]
[INFO] --- maven-compiler-plugin:3.8.1:compile (default-compile) @ spring-cloud-aws-context ---
[INFO] Changes detected - recompiling the module!
[INFO] Compiling 46 source files to C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-context\target\classes
[WARNING] /C:/Users/jstupar/my_spring_cloud_aws/spring-cloud-aws/spring-cloud-aws-context/src/main/java/org/springframework/cloud/aws/context/config/xml/ContextResourceLoaderBeanDefinitionParser.java:[30,60] org.springframework.cloud.aws.core.config.xml.XmlWebserviceConfigurationUtils in org.springframework.cloud.aws.core.config.xml has been deprecated
[WARNING] /C:/Users/jstupar/my_spring_cloud_aws/spring-cloud-aws/spring-cloud-aws-context/src/main/java/org/springframework/cloud/aws/mail/config/xml/SimpleEmailServiceBeanDefinitionParser.java:[26,60] org.springframework.cloud.aws.core.config.xml.XmlWebserviceConfigurationUtils in org.springframework.cloud.aws.core.config.xml has been deprecated
[WARNING] /C:/Users/jstupar/my_spring_cloud_aws/spring-cloud-aws/spring-cloud-aws-context/src/main/java/org/springframework/cloud/aws/context/config/annotation/ContextCredentialsConfigurationRegistrar.java:[26,67] org.springframework.cloud.aws.context.config.support.ContextConfigurationUtils in org.springframework.cloud.aws.context.config.support has been deprecated
[WARNING] /C:/Users/jstupar/my_spring_cloud_aws/spring-cloud-aws/spring-cloud-aws-context/src/main/java/org/springframework/cloud/aws/context/config/annotation/ContextInstanceDataConfiguration.java:[26,67] org.springframework.cloud.aws.context.config.support.ContextConfigurationUtils in org.springframework.cloud.aws.context.config.support has been deprecated
[WARNING] /C:/Users/jstupar/my_spring_cloud_aws/spring-cloud-aws/spring-cloud-aws-context/src/main/java/org/springframework/cloud/aws/context/config/annotation/ContextRegionConfigurationRegistrar.java:[26,67] org.springframework.cloud.aws.context.config.support.ContextConfigurationUtils in org.springframework.cloud.aws.context.config.support has been deprecated
[WARNING] /C:/Users/jstupar/my_spring_cloud_aws/spring-cloud-aws/spring-cloud-aws-context/src/main/java/org/springframework/cloud/aws/context/config/xml/ContextInstanceDataPropertySourceBeanDefinitionParser.java:[27,60] org.springframework.cloud.aws.context.config.support.ContextConfigurationUtils in org.springframework.cloud.aws.context.config.support has been deprecated
[WARNING] /C:/Users/jstupar/my_spring_cloud_aws/spring-cloud-aws/spring-cloud-aws-context/src/main/java/org/springframework/cloud/aws/context/config/xml/ContextInstanceDataPropertySourceBeanDefinitionParser.java:[31,60] org.springframework.cloud.aws.core.config.xml.XmlWebserviceConfigurationUtils in org.springframework.cloud.aws.core.config.xml has been deprecated
[WARNING] /C:/Users/jstupar/my_spring_cloud_aws/spring-cloud-aws/spring-cloud-aws-context/src/main/java/org/springframework/cloud/aws/cache/config/xml/CacheBeanDefinitionParser.java:[36,60] org.springframework.cloud.aws.core.config.xml.XmlWebserviceConfigurationUtils in org.springframework.cloud.aws.core.config.xml has been deprecated
[WARNING] /C:/Users/jstupar/my_spring_cloud_aws/spring-cloud-aws/spring-cloud-aws-context/src/main/java/org/springframework/cloud/aws/context/config/xml/StackConfigurationBeanDefinitionParser.java:[32,60] org.springframework.cloud.aws.core.config.xml.XmlWebserviceConfigurationUtils in org.springframework.cloud.aws.core.config.xml has been deprecated
[WARNING] /C:/Users/jstupar/my_spring_cloud_aws/spring-cloud-aws/spring-cloud-aws-context/src/main/java/org/springframework/cloud/aws/context/annotation/OnMissingAwsCloudEnvironmentCondition.java:[26,60] org.springframework.cloud.aws.context.annotation.OnAwsCloudEnvironmentCondition in org.springframework.cloud.aws.context.annotation has been deprecated
[INFO]
[INFO] --- maven-resources-plugin:3.1.0:testResources (default-testResources) @ spring-cloud-aws-context ---
[INFO] Using 'UTF-8' encoding to copy filtered resources.
[INFO] Copying 47 resources
[INFO]
[INFO] --- maven-compiler-plugin:3.8.1:testCompile (default-testCompile) @ spring-cloud-aws-context ---
[INFO] Changes detected - recompiling the module!
[INFO] Compiling 30 source files to C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-context\target\test-classes
[WARNING] /C:/Users/jstupar/my_spring_cloud_aws/spring-cloud-aws/spring-cloud-aws-context/src/test/java/org/springframework/cloud/aws/context/config/annotation/ContextInstanceDataConfigurationTest.java:[125,10] org.springframework.cloud.aws.context.config.annotation.EnableContextInstanceData in org.springframework.cloud.aws.context.config.annotation has been deprecated
[WARNING] /C:/Users/jstupar/my_spring_cloud_aws/spring-cloud-aws/spring-cloud-aws-context/src/test/java/org/springframework/cloud/aws/context/config/annotation/ContextInstanceDataConfigurationTest.java:[131,10] org.springframework.cloud.aws.context.config.annotation.EnableContextInstanceData in org.springframework.cloud.aws.context.config.annotation has been deprecated
[WARNING] /C:/Users/jstupar/my_spring_cloud_aws/spring-cloud-aws/spring-cloud-aws-context/src/test/java/org/springframework/cloud/aws/context/config/annotation/ContextInstanceDataConfigurationTest.java:[137,10] org.springframework.cloud.aws.context.config.annotation.EnableContextInstanceData in org.springframework.cloud.aws.context.config.annotation has been deprecated
[WARNING] /C:/Users/jstupar/my_spring_cloud_aws/spring-cloud-aws/spring-cloud-aws-context/src/test/java/org/springframework/cloud/aws/context/config/annotation/ContextRegionConfigurationRegistrarTest.java:[154,10] org.springframework.cloud.aws.context.config.annotation.EnableContextRegion in org.springframework.cloud.aws.context.config.annotation has been deprecated
[WARNING] /C:/Users/jstupar/my_spring_cloud_aws/spring-cloud-aws/spring-cloud-aws-context/src/test/java/org/springframework/cloud/aws/context/config/annotation/ContextRegionConfigurationRegistrarTest.java:[160,10] org.springframework.cloud.aws.context.config.annotation.EnableContextRegion in org.springframework.cloud.aws.context.config.annotation has been deprecated
[WARNING] /C:/Users/jstupar/my_spring_cloud_aws/spring-cloud-aws/spring-cloud-aws-context/src/test/java/org/springframework/cloud/aws/context/config/annotation/ContextRegionConfigurationRegistrarTest.java:[166,10] org.springframework.cloud.aws.context.config.annotation.EnableContextRegion in org.springframework.cloud.aws.context.config.annotation has been deprecated
[WARNING] /C:/Users/jstupar/my_spring_cloud_aws/spring-cloud-aws/spring-cloud-aws-context/src/test/java/org/springframework/cloud/aws/context/config/annotation/ContextRegionConfigurationRegistrarTest.java:[172,10] org.springframework.cloud.aws.context.config.annotation.EnableContextRegion in org.springframework.cloud.aws.context.config.annotation has been deprecated
[WARNING] /C:/Users/jstupar/my_spring_cloud_aws/spring-cloud-aws/spring-cloud-aws-context/src/test/java/org/springframework/cloud/aws/context/config/annotation/ContextRegionConfigurationRegistrarTest.java:[183,10] org.springframework.cloud.aws.context.config.annotation.EnableContextRegion in org.springframework.cloud.aws.context.config.annotation has been deprecated
[WARNING] /C:/Users/jstupar/my_spring_cloud_aws/spring-cloud-aws/spring-cloud-aws-context/src/test/java/org/springframework/cloud/aws/context/config/annotation/ContextRegionConfigurationRegistrarTest.java:[189,10] org.springframework.cloud.aws.context.config.annotation.EnableContextRegion in org.springframework.cloud.aws.context.config.annotation has been deprecated
[WARNING] /C:/Users/jstupar/my_spring_cloud_aws/spring-cloud-aws/spring-cloud-aws-context/src/test/java/org/springframework/cloud/aws/context/config/annotation/ContextRegionConfigurationRegistrarTest.java:[195,10] org.springframework.cloud.aws.context.config.annotation.EnableContextRegion in org.springframework.cloud.aws.context.config.annotation has been deprecated
[WARNING] /C:/Users/jstupar/my_spring_cloud_aws/spring-cloud-aws/spring-cloud-aws-context/src/test/java/org/springframework/cloud/aws/context/config/annotation/ContextRegionConfigurationRegistrarTest.java:[201,10] org.springframework.cloud.aws.context.config.annotation.EnableContextRegion in org.springframework.cloud.aws.context.config.annotation has been deprecated
[WARNING] /C:/Users/jstupar/my_spring_cloud_aws/spring-cloud-aws/spring-cloud-aws-context/src/test/java/org/springframework/cloud/aws/context/annotation/OnAwsCloudEnvironmentConditionTest.java:[76,18] org.springframework.cloud.aws.context.annotation.ConditionalOnAwsCloudEnvironment in org.springframework.cloud.aws.context.annotation has been deprecated
[WARNING] /C:/Users/jstupar/my_spring_cloud_aws/spring-cloud-aws/spring-cloud-aws-context/src/test/java/org/springframework/cloud/aws/context/annotation/OnAwsCloudEnvironmentConditionTest.java:[84,10] org.springframework.cloud.aws.context.annotation.ConditionalOnAwsCloudEnvironment in org.springframework.cloud.aws.context.annotation has been deprecated
[WARNING] /C:/Users/jstupar/my_spring_cloud_aws/spring-cloud-aws/spring-cloud-aws-context/src/test/java/org/springframework/cloud/aws/context/config/annotation/ContextCredentialsConfigurationRegistrarTest.java:[276,10] org.springframework.cloud.aws.context.config.annotation.EnableContextCredentials in org.springframework.cloud.aws.context.config.annotation has been deprecated
[WARNING] /C:/Users/jstupar/my_spring_cloud_aws/spring-cloud-aws/spring-cloud-aws-context/src/test/java/org/springframework/cloud/aws/context/config/annotation/ContextCredentialsConfigurationRegistrarTest.java:[281,10] org.springframework.cloud.aws.context.config.annotation.EnableContextCredentials in org.springframework.cloud.aws.context.config.annotation has been deprecated
[WARNING] /C:/Users/jstupar/my_spring_cloud_aws/spring-cloud-aws/spring-cloud-aws-context/src/test/java/org/springframework/cloud/aws/context/config/annotation/ContextCredentialsConfigurationRegistrarTest.java:[286,10] org.springframework.cloud.aws.context.config.annotation.EnableContextCredentials in org.springframework.cloud.aws.context.config.annotation has been deprecated
[WARNING] /C:/Users/jstupar/my_spring_cloud_aws/spring-cloud-aws/spring-cloud-aws-context/src/test/java/org/springframework/cloud/aws/context/config/annotation/ContextCredentialsConfigurationRegistrarTest.java:[291,10] org.springframework.cloud.aws.context.config.annotation.EnableContextCredentials in org.springframework.cloud.aws.context.config.annotation has been deprecated
[WARNING] /C:/Users/jstupar/my_spring_cloud_aws/spring-cloud-aws/spring-cloud-aws-context/src/test/java/org/springframework/cloud/aws/context/config/annotation/ContextCredentialsConfigurationRegistrarTest.java:[296,10] org.springframework.cloud.aws.context.config.annotation.EnableContextCredentials in org.springframework.cloud.aws.context.config.annotation has been deprecated
[WARNING] /C:/Users/jstupar/my_spring_cloud_aws/spring-cloud-aws/spring-cloud-aws-context/src/test/java/org/springframework/cloud/aws/context/config/annotation/ContextCredentialsConfigurationRegistrarTest.java:[301,10] org.springframework.cloud.aws.context.config.annotation.EnableContextCredentials in org.springframework.cloud.aws.context.config.annotation has been deprecated
[WARNING] /C:/Users/jstupar/my_spring_cloud_aws/spring-cloud-aws/spring-cloud-aws-context/src/test/java/org/springframework/cloud/aws/context/config/annotation/ContextCredentialsConfigurationRegistrarTest.java:[306,10] org.springframework.cloud.aws.context.config.annotation.EnableContextCredentials in org.springframework.cloud.aws.context.config.annotation has been deprecated
[WARNING] /C:/Users/jstupar/my_spring_cloud_aws/spring-cloud-aws/spring-cloud-aws-context/src/test/java/org/springframework/cloud/aws/context/config/annotation/ContextCredentialsConfigurationRegistrarTest.java:[311,10] org.springframework.cloud.aws.context.config.annotation.EnableContextCredentials in org.springframework.cloud.aws.context.config.annotation has been deprecated
[WARNING] /C:/Users/jstupar/my_spring_cloud_aws/spring-cloud-aws/spring-cloud-aws-context/src/test/java/org/springframework/cloud/aws/context/config/annotation/ContextCredentialsConfigurationRegistrarTest.java:[317,10] org.springframework.cloud.aws.context.config.annotation.EnableContextCredentials in org.springframework.cloud.aws.context.config.annotation has been deprecated
[WARNING] /C:/Users/jstupar/my_spring_cloud_aws/spring-cloud-aws/spring-cloud-aws-context/src/test/java/org/springframework/cloud/aws/mail/simplemail/SimpleEmailServiceMailSenderTest.java:[45,17] org.springframework.cloud.aws.mail.simplemail.SimpleEmailServiceMailSender in org.springframework.cloud.aws.mail.simplemail has been deprecated
[WARNING] /C:/Users/jstupar/my_spring_cloud_aws/spring-cloud-aws/spring-cloud-aws-context/src/test/java/org/springframework/cloud/aws/mail/simplemail/SimpleEmailServiceMailSenderTest.java:[45,63] org.springframework.cloud.aws.mail.simplemail.SimpleEmailServiceMailSender in org.springframework.cloud.aws.mail.simplemail has been deprecated
[WARNING] /C:/Users/jstupar/my_spring_cloud_aws/spring-cloud-aws/spring-cloud-aws-context/src/test/java/org/springframework/cloud/aws/mail/simplemail/SimpleEmailServiceMailSenderTest.java:[66,17] org.springframework.cloud.aws.mail.simplemail.SimpleEmailServiceMailSender in org.springframework.cloud.aws.mail.simplemail has been deprecated
[WARNING] /C:/Users/jstupar/my_spring_cloud_aws/spring-cloud-aws/spring-cloud-aws-context/src/test/java/org/springframework/cloud/aws/mail/simplemail/SimpleEmailServiceMailSenderTest.java:[66,63] org.springframework.cloud.aws.mail.simplemail.SimpleEmailServiceMailSender in org.springframework.cloud.aws.mail.simplemail has been deprecated
[WARNING] /C:/Users/jstupar/my_spring_cloud_aws/spring-cloud-aws/spring-cloud-aws-context/src/test/java/org/springframework/cloud/aws/mail/simplemail/SimpleEmailServiceMailSenderTest.java:[89,17] org.springframework.cloud.aws.mail.simplemail.SimpleEmailServiceMailSender in org.springframework.cloud.aws.mail.simplemail has been deprecated
[WARNING] /C:/Users/jstupar/my_spring_cloud_aws/spring-cloud-aws/spring-cloud-aws-context/src/test/java/org/springframework/cloud/aws/mail/simplemail/SimpleEmailServiceMailSenderTest.java:[89,63] org.springframework.cloud.aws.mail.simplemail.SimpleEmailServiceMailSender in org.springframework.cloud.aws.mail.simplemail has been deprecated
[WARNING] /C:/Users/jstupar/my_spring_cloud_aws/spring-cloud-aws/spring-cloud-aws-context/src/test/java/org/springframework/cloud/aws/mail/simplemail/SimpleEmailServiceMailSenderTest.java:[101,17] org.springframework.cloud.aws.mail.simplemail.SimpleEmailServiceMailSender in org.springframework.cloud.aws.mail.simplemail has been deprecated
[WARNING] /C:/Users/jstupar/my_spring_cloud_aws/spring-cloud-aws/spring-cloud-aws-context/src/test/java/org/springframework/cloud/aws/mail/simplemail/SimpleEmailServiceMailSenderTest.java:[101,63] org.springframework.cloud.aws.mail.simplemail.SimpleEmailServiceMailSender in org.springframework.cloud.aws.mail.simplemail has been deprecated
[WARNING] /C:/Users/jstupar/my_spring_cloud_aws/spring-cloud-aws/spring-cloud-aws-context/src/test/java/org/springframework/cloud/aws/mail/simplemail/SimpleEmailServiceMailSenderTest.java:[125,17] org.springframework.cloud.aws.mail.simplemail.SimpleEmailServiceMailSender in org.springframework.cloud.aws.mail.simplemail has been deprecated
[WARNING] /C:/Users/jstupar/my_spring_cloud_aws/spring-cloud-aws/spring-cloud-aws-context/src/test/java/org/springframework/cloud/aws/mail/simplemail/SimpleEmailServiceMailSenderTest.java:[125,63] org.springframework.cloud.aws.mail.simplemail.SimpleEmailServiceMailSender in org.springframework.cloud.aws.mail.simplemail has been deprecated
[WARNING] /C:/Users/jstupar/my_spring_cloud_aws/spring-cloud-aws/spring-cloud-aws-context/src/test/java/org/springframework/cloud/aws/context/config/annotation/ContextStackConfigurationTest.java:[90,10] org.springframework.cloud.aws.context.config.annotation.EnableStackConfiguration in org.springframework.cloud.aws.context.config.annotation has been deprecated
[WARNING] /C:/Users/jstupar/my_spring_cloud_aws/spring-cloud-aws/spring-cloud-aws-context/src/test/java/org/springframework/cloud/aws/context/config/annotation/ContextStackConfigurationTest.java:[109,10] org.springframework.cloud.aws.context.config.annotation.EnableStackConfiguration in org.springframework.cloud.aws.context.config.annotation has been deprecated
[WARNING] /C:/Users/jstupar/my_spring_cloud_aws/spring-cloud-aws/spring-cloud-aws-context/src/test/java/org/springframework/cloud/aws/mail/simplemail/SimpleEmailServiceJavaMailSenderTest.java:[62,49] org.springframework.cloud.aws.mail.simplemail.SimpleEmailServiceJavaMailSender in org.springframework.cloud.aws.mail.simplemail has been deprecated
[WARNING] /C:/Users/jstupar/my_spring_cloud_aws/spring-cloud-aws/spring-cloud-aws-context/src/test/java/org/springframework/cloud/aws/mail/simplemail/SimpleEmailServiceJavaMailSenderTest.java:[78,17] org.springframework.cloud.aws.mail.simplemail.SimpleEmailServiceJavaMailSender in org.springframework.cloud.aws.mail.simplemail has been deprecated
[WARNING] /C:/Users/jstupar/my_spring_cloud_aws/spring-cloud-aws/spring-cloud-aws-context/src/test/java/org/springframework/cloud/aws/mail/simplemail/SimpleEmailServiceJavaMailSenderTest.java:[78,67] org.springframework.cloud.aws.mail.simplemail.SimpleEmailServiceJavaMailSender in org.springframework.cloud.aws.mail.simplemail has been deprecated
[WARNING] /C:/Users/jstupar/my_spring_cloud_aws/spring-cloud-aws/spring-cloud-aws-context/src/test/java/org/springframework/cloud/aws/mail/simplemail/SimpleEmailServiceJavaMailSenderTest.java:[94,17] org.springframework.cloud.aws.mail.simplemail.SimpleEmailServiceJavaMailSender in org.springframework.cloud.aws.mail.simplemail has been deprecated
[WARNING] /C:/Users/jstupar/my_spring_cloud_aws/spring-cloud-aws/spring-cloud-aws-context/src/test/java/org/springframework/cloud/aws/mail/simplemail/SimpleEmailServiceJavaMailSenderTest.java:[94,67] org.springframework.cloud.aws.mail.simplemail.SimpleEmailServiceJavaMailSender in org.springframework.cloud.aws.mail.simplemail has been deprecated
[WARNING] /C:/Users/jstupar/my_spring_cloud_aws/spring-cloud-aws/spring-cloud-aws-context/src/test/java/org/springframework/cloud/aws/mail/simplemail/SimpleEmailServiceJavaMailSenderTest.java:[107,17] org.springframework.cloud.aws.mail.simplemail.SimpleEmailServiceJavaMailSender in org.springframework.cloud.aws.mail.simplemail has been deprecated
[WARNING] /C:/Users/jstupar/my_spring_cloud_aws/spring-cloud-aws/spring-cloud-aws-context/src/test/java/org/springframework/cloud/aws/mail/simplemail/SimpleEmailServiceJavaMailSenderTest.java:[107,67] org.springframework.cloud.aws.mail.simplemail.SimpleEmailServiceJavaMailSender in org.springframework.cloud.aws.mail.simplemail has been deprecated
[WARNING] /C:/Users/jstupar/my_spring_cloud_aws/spring-cloud-aws/spring-cloud-aws-context/src/test/java/org/springframework/cloud/aws/mail/simplemail/SimpleEmailServiceJavaMailSenderTest.java:[121,17] org.springframework.cloud.aws.mail.simplemail.SimpleEmailServiceJavaMailSender in org.springframework.cloud.aws.mail.simplemail has been deprecated
[WARNING] /C:/Users/jstupar/my_spring_cloud_aws/spring-cloud-aws/spring-cloud-aws-context/src/test/java/org/springframework/cloud/aws/mail/simplemail/SimpleEmailServiceJavaMailSenderTest.java:[121,67] org.springframework.cloud.aws.mail.simplemail.SimpleEmailServiceJavaMailSender in org.springframework.cloud.aws.mail.simplemail has been deprecated
[WARNING] /C:/Users/jstupar/my_spring_cloud_aws/spring-cloud-aws/spring-cloud-aws-context/src/test/java/org/springframework/cloud/aws/mail/simplemail/SimpleEmailServiceJavaMailSenderTest.java:[134,49] org.springframework.cloud.aws.mail.simplemail.SimpleEmailServiceJavaMailSender in org.springframework.cloud.aws.mail.simplemail has been deprecated
[WARNING] /C:/Users/jstupar/my_spring_cloud_aws/spring-cloud-aws/spring-cloud-aws-context/src/test/java/org/springframework/cloud/aws/mail/simplemail/SimpleEmailServiceJavaMailSenderTest.java:[151,49] org.springframework.cloud.aws.mail.simplemail.SimpleEmailServiceJavaMailSender in org.springframework.cloud.aws.mail.simplemail has been deprecated
[WARNING] /C:/Users/jstupar/my_spring_cloud_aws/spring-cloud-aws/spring-cloud-aws-context/src/test/java/org/springframework/cloud/aws/mail/simplemail/SimpleEmailServiceJavaMailSenderTest.java:[163,49] org.springframework.cloud.aws.mail.simplemail.SimpleEmailServiceJavaMailSender in org.springframework.cloud.aws.mail.simplemail has been deprecated
[WARNING] /C:/Users/jstupar/my_spring_cloud_aws/spring-cloud-aws/spring-cloud-aws-context/src/test/java/org/springframework/cloud/aws/mail/simplemail/SimpleEmailServiceJavaMailSenderTest.java:[175,49] org.springframework.cloud.aws.mail.simplemail.SimpleEmailServiceJavaMailSender in org.springframework.cloud.aws.mail.simplemail has been deprecated
[WARNING] /C:/Users/jstupar/my_spring_cloud_aws/spring-cloud-aws/spring-cloud-aws-context/src/test/java/org/springframework/cloud/aws/mail/simplemail/SimpleEmailServiceJavaMailSenderTest.java:[201,49] org.springframework.cloud.aws.mail.simplemail.SimpleEmailServiceJavaMailSender in org.springframework.cloud.aws.mail.simplemail has been deprecated
[WARNING] /C:/Users/jstupar/my_spring_cloud_aws/spring-cloud-aws/spring-cloud-aws-context/src/test/java/org/springframework/cloud/aws/mail/simplemail/SimpleEmailServiceJavaMailSenderTest.java:[238,49] org.springframework.cloud.aws.mail.simplemail.SimpleEmailServiceJavaMailSender in org.springframework.cloud.aws.mail.simplemail has been deprecated
[WARNING] /C:/Users/jstupar/my_spring_cloud_aws/spring-cloud-aws/spring-cloud-aws-context/src/test/java/org/springframework/cloud/aws/mail/simplemail/SimpleEmailServiceJavaMailSenderTest.java:[258,49] org.springframework.cloud.aws.mail.simplemail.SimpleEmailServiceJavaMailSender in org.springframework.cloud.aws.mail.simplemail has been deprecated
[WARNING] /C:/Users/jstupar/my_spring_cloud_aws/spring-cloud-aws/spring-cloud-aws-context/src/test/java/org/springframework/cloud/aws/mail/simplemail/SimpleEmailServiceJavaMailSenderTest.java:[279,49] org.springframework.cloud.aws.mail.simplemail.SimpleEmailServiceJavaMailSender in org.springframework.cloud.aws.mail.simplemail has been deprecated
[WARNING] /C:/Users/jstupar/my_spring_cloud_aws/spring-cloud-aws/spring-cloud-aws-context/src/test/java/org/springframework/cloud/aws/context/config/xml/ContextRegionBeanDefinitionParserTest.java:[44,42] org.springframework.cloud.aws.context.config.xml.ContextRegionBeanDefinitionParser in org.springframework.cloud.aws.context.config.xml has been deprecated
[WARNING] /C:/Users/jstupar/my_spring_cloud_aws/spring-cloud-aws/spring-cloud-aws-context/src/test/java/org/springframework/cloud/aws/context/config/xml/ContextRegionBeanDefinitionParserTest.java:[60,42] org.springframework.cloud.aws.context.config.xml.ContextRegionBeanDefinitionParser in org.springframework.cloud.aws.context.config.xml has been deprecated
[WARNING] /C:/Users/jstupar/my_spring_cloud_aws/spring-cloud-aws/spring-cloud-aws-context/src/test/java/org/springframework/cloud/aws/context/config/xml/ContextRegionBeanDefinitionParserTest.java:[76,42] org.springframework.cloud.aws.context.config.xml.ContextRegionBeanDefinitionParser in org.springframework.cloud.aws.context.config.xml has been deprecated
[WARNING] /C:/Users/jstupar/my_spring_cloud_aws/spring-cloud-aws/spring-cloud-aws-context/src/test/java/org/springframework/cloud/aws/context/config/xml/ContextRegionBeanDefinitionParserTest.java:[91,42] org.springframework.cloud.aws.context.config.xml.ContextRegionBeanDefinitionParser in org.springframework.cloud.aws.context.config.xml has been deprecated
[WARNING] /C:/Users/jstupar/my_spring_cloud_aws/spring-cloud-aws/spring-cloud-aws-context/src/test/java/org/springframework/cloud/aws/context/config/xml/ContextRegionBeanDefinitionParserTest.java:[106,42] org.springframework.cloud.aws.context.config.xml.ContextRegionBeanDefinitionParser in org.springframework.cloud.aws.context.config.xml has been deprecated
[INFO]
[INFO] --- maven-surefire-plugin:2.22.2:test (default-test) @ spring-cloud-aws-context ---
[INFO]
[INFO] -------------------------------------------------------
[INFO]  T E S T S
[INFO] -------------------------------------------------------
[INFO] Running org.springframework.cloud.aws.cache.config.annotation.ElastiCacheCachingConfigurationTest
12:32:01.562 [main] INFO  c.t.jmemcached.MemCacheDaemon - Listening on 0.0.0.0:14622
12:32:01.636 [main] WARN  o.s.c.a.cache.ElastiCacheFactoryBean - Cache cluster is not available now. Connection may fail during cache access. Current status is null
12:32:01.678 [main] INFO  n.spy.memcached.MemcachedConnection - Added {QA sa=/127.0.0.1:14622, #Rops=0, #Wops=0, #iq=0, topRop=null, topWop=null, toWrite=0, interested=0} to connect queue
12:32:01.681 [main] WARN  o.s.c.a.cache.ElastiCacheFactoryBean - Cache cluster is not available now. Connection may fail during cache access. Current status is null
12:32:01.691 [main] WARN  o.s.c.a.cache.ElastiCacheFactoryBean - Cache cluster is not available now. Connection may fail during cache access. Current status is null
12:32:01.691 [main] WARN  o.s.c.a.cache.ElastiCacheFactoryBean - Cache cluster is not available now. Connection may fail during cache access. Current status is null
12:32:01.775 [New I/O server worker #1-1] INFO  c.t.j.p.MemcachedCommandHandler - VERSION
12:32:01.779 [Memcached IO over {MemcachedConnection to /127.0.0.1:14622} - SHUTTING DOWN (informed client)] INFO  n.spy.memcached.MemcachedConnection - Shut down memcached client
12:32:01.813 [main] WARN  o.s.c.a.cache.ElastiCacheFactoryBean - Cache cluster is not available now. Connection may fail during cache access. Current status is null
12:32:01.815 [main] INFO  n.spy.memcached.MemcachedConnection - Added {QA sa=/127.0.0.1:14622, #Rops=0, #Wops=0, #iq=0, topRop=null, topWop=null, toWrite=0, interested=0} to connect queue
12:32:01.816 [main] WARN  o.s.c.a.cache.ElastiCacheFactoryBean - Cache cluster is not available now. Connection may fail during cache access. Current status is null
12:32:01.817 [main] WARN  o.s.c.a.cache.ElastiCacheFactoryBean - Cache cluster is not available now. Connection may fail during cache access. Current status is null
12:32:01.817 [main] WARN  o.s.c.a.cache.ElastiCacheFactoryBean - Cache cluster is not available now. Connection may fail during cache access. Current status is null
12:32:01.818 [New I/O server worker #1-2] INFO  c.t.j.p.MemcachedCommandHandler - VERSION
12:32:01.819 [Memcached IO over {MemcachedConnection to /127.0.0.1:14622} - SHUTTING DOWN (informed client)] INFO  n.spy.memcached.MemcachedConnection - Shut down memcached client
12:32:01.847 [main] WARN  o.s.c.a.cache.ElastiCacheFactoryBean - Cache cluster is not available now. Connection may fail during cache access. Current status is null
12:32:01.849 [main] INFO  n.spy.memcached.MemcachedConnection - Added {QA sa=/127.0.0.1:14622, #Rops=0, #Wops=0, #iq=0, topRop=null, topWop=null, toWrite=0, interested=0} to connect queue
12:32:01.850 [main] WARN  o.s.c.a.cache.ElastiCacheFactoryBean - Cache cluster is not available now. Connection may fail during cache access. Current status is null
12:32:01.851 [main] WARN  o.s.c.a.cache.ElastiCacheFactoryBean - Cache cluster is not available now. Connection may fail during cache access. Current status is null
12:32:01.851 [main] WARN  o.s.c.a.cache.ElastiCacheFactoryBean - Cache cluster is not available now. Connection may fail during cache access. Current status is null
12:32:01.852 [New I/O server worker #1-3] INFO  c.t.j.p.MemcachedCommandHandler - VERSION
12:32:01.853 [Memcached IO over {MemcachedConnection to /127.0.0.1:14622} - SHUTTING DOWN (informed client)] INFO  n.spy.memcached.MemcachedConnection - Shut down memcached client
12:32:01.883 [main] WARN  o.s.c.a.cache.ElastiCacheFactoryBean - Cache cluster is not available now. Connection may fail during cache access. Current status is null
12:32:01.885 [main] INFO  n.spy.memcached.MemcachedConnection - Added {QA sa=/127.0.0.1:14622, #Rops=0, #Wops=0, #iq=0, topRop=null, topWop=null, toWrite=0, interested=0} to connect queue
12:32:01.887 [main] WARN  o.s.c.a.cache.ElastiCacheFactoryBean - Cache cluster is not available now. Connection may fail during cache access. Current status is null
12:32:01.887 [main] WARN  o.s.c.a.cache.ElastiCacheFactoryBean - Cache cluster is not available now. Connection may fail during cache access. Current status is null
12:32:01.887 [main] WARN  o.s.c.a.cache.ElastiCacheFactoryBean - Cache cluster is not available now. Connection may fail during cache access. Current status is null
12:32:01.889 [New I/O server worker #1-4] INFO  c.t.j.p.MemcachedCommandHandler - VERSION
12:32:01.890 [Memcached IO over {MemcachedConnection to /127.0.0.1:14622} - SHUTTING DOWN (informed client)] INFO  n.spy.memcached.MemcachedConnection - Shut down memcached client
12:32:01.920 [main] WARN  o.s.c.a.cache.ElastiCacheFactoryBean - Cache cluster is not available now. Connection may fail during cache access. Current status is null
12:32:01.921 [main] INFO  n.spy.memcached.MemcachedConnection - Added {QA sa=/127.0.0.1:14622, #Rops=0, #Wops=0, #iq=0, topRop=null, topWop=null, toWrite=0, interested=0} to connect queue
12:32:01.923 [main] WARN  o.s.c.a.cache.ElastiCacheFactoryBean - Cache cluster is not available now. Connection may fail during cache access. Current status is null
12:32:01.924 [main] WARN  o.s.c.a.cache.ElastiCacheFactoryBean - Cache cluster is not available now. Connection may fail during cache access. Current status is null
12:32:01.924 [main] WARN  o.s.c.a.cache.ElastiCacheFactoryBean - Cache cluster is not available now. Connection may fail during cache access. Current status is null
12:32:01.926 [New I/O server worker #1-5] INFO  c.t.j.p.MemcachedCommandHandler - VERSION
12:32:01.927 [Memcached IO over {MemcachedConnection to /127.0.0.1:14622} - SHUTTING DOWN (informed client)] INFO  n.spy.memcached.MemcachedConnection - Shut down memcached client
[INFO] Tests run: 5, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 2.249 s - in org.springframework.cloud.aws.cache.config.annotation.ElastiCacheCachingConfigurationTest
[INFO] Running org.springframework.cloud.aws.cache.config.xml.CacheBeanDefinitionParserTest
12:32:02.089 [main] INFO  n.spy.memcached.MemcachedConnection - Added {QA sa=/127.0.0.1:14622, #Rops=0, #Wops=0, #iq=0, topRop=null, topWop=null, toWrite=0, interested=0} to connect queue
12:32:02.103 [New I/O server worker #1-6] INFO  c.t.j.p.MemcachedCommandHandler - SET com.thimbleware.jmemcached.Key@20125
12:32:04.123 [New I/O server worker #1-6] INFO  c.t.j.p.MemcachedCommandHandler - GET com.thimbleware.jmemcached.Key@20125
12:32:04.247 [main] INFO  n.spy.memcached.MemcachedConnection - Added {QA sa=/127.0.0.1:14622, #Rops=0, #Wops=0, #iq=0, topRop=null, topWop=null, toWrite=0, interested=0} to connect queue
12:32:04.250 [New I/O server worker #1-7] INFO  c.t.j.p.MemcachedCommandHandler - SET com.thimbleware.jmemcached.Key@20125
12:32:04.253 [New I/O server worker #1-7] INFO  c.t.j.p.MemcachedCommandHandler - DELETE com.thimbleware.jmemcached.Key@20125
12:32:04.312 [main] INFO  n.spy.memcached.MemcachedConnection - Added {QA sa=/127.0.0.1:14622, #Rops=0, #Wops=0, #iq=0, topRop=null, topWop=null, toWrite=0, interested=0} to connect queue
12:32:04.317 [New I/O server worker #1-8] INFO  c.t.j.p.MemcachedCommandHandler - SET com.thimbleware.jmemcached.Key@20125
12:32:04.318 [New I/O server worker #1-8] INFO  c.t.j.p.MemcachedCommandHandler - DELETE com.thimbleware.jmemcached.Key@20125
12:32:04.353 [main] INFO  n.spy.memcached.MemcachedConnection - Added {QA sa=/127.0.0.1:14622, #Rops=0, #Wops=0, #iq=0, topRop=null, topWop=null, toWrite=0, interested=0} to connect queue
12:32:04.354 [main] WARN  n.spy.memcached.MemcachedConnection - Could not redistribute to another node, retrying primary node for foo.
12:32:04.355 [New I/O server worker #1-9] INFO  c.t.j.p.MemcachedCommandHandler - SET com.thimbleware.jmemcached.Key@20125
12:32:04.355 [New I/O server worker #1-9] INFO  c.t.j.p.MemcachedCommandHandler - DELETE com.thimbleware.jmemcached.Key@20125
12:32:04.381 [main] INFO  n.spy.memcached.MemcachedConnection - Added {QA sa=/127.0.0.1:14622, #Rops=0, #Wops=0, #iq=0, topRop=null, topWop=null, toWrite=0, interested=0} to connect queue
12:32:04.384 [main] WARN  n.spy.memcached.MemcachedConnection - Could not redistribute to another node, retrying primary node for foo.
12:32:04.385 [New I/O server worker #1-10] INFO  c.t.j.p.MemcachedCommandHandler - SET com.thimbleware.jmemcached.Key@20125
12:32:04.386 [New I/O server worker #1-10] INFO  c.t.j.p.MemcachedCommandHandler - DELETE com.thimbleware.jmemcached.Key@20125
12:32:04.430 [main] INFO  n.spy.memcached.MemcachedConnection - Added {QA sa=/127.0.0.1:14622, #Rops=0, #Wops=0, #iq=0, topRop=null, topWop=null, toWrite=0, interested=0} to connect queue
12:32:04.432 [main] WARN  n.spy.memcached.MemcachedConnection - Could not redistribute to another node, retrying primary node for foo.
12:32:04.433 [New I/O server worker #1-11] INFO  c.t.j.p.MemcachedCommandHandler - SET com.thimbleware.jmemcached.Key@20125
12:32:04.434 [New I/O server worker #1-11] INFO  c.t.j.p.MemcachedCommandHandler - DELETE com.thimbleware.jmemcached.Key@20125
12:32:04.435 [main] INFO  c.t.jmemcached.MemCacheDaemon - terminating daemon; closing all channels
12:32:04.441 [main] INFO  c.t.jmemcached.MemCacheDaemon - channels closed, freeing cache storage
12:32:04.452 [main] INFO  c.t.jmemcached.MemCacheDaemon - successfully shut down
[INFO] Tests run: 7, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 2.513 s - in org.springframework.cloud.aws.cache.config.xml.CacheBeanDefinitionParserTest
[INFO] Running org.springframework.cloud.aws.cache.config.xml.CacheSchemaWithoutVersionTest
[INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.013 s - in org.springframework.cloud.aws.cache.config.xml.CacheSchemaWithoutVersionTest
[INFO] Running org.springframework.cloud.aws.cache.ElastiCacheFactoryBeanTest
12:32:04.647 [main] WARN  o.s.c.a.cache.ElastiCacheFactoryBean - Cache cluster is not available now. Connection may fail during cache access. Current status is null
[INFO] Tests run: 3, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.166 s - in org.springframework.cloud.aws.cache.ElastiCacheFactoryBeanTest
[INFO] Running org.springframework.cloud.aws.cache.memcached.MemcachedCacheFactoryTest
12:32:04.653 [main] INFO  c.t.jmemcached.MemCacheDaemon - Listening on 0.0.0.0:24075
12:32:04.654 [main] INFO  n.spy.memcached.MemcachedConnection - Added {QA sa=/127.0.0.1:24075, #Rops=0, #Wops=0, #iq=0, topRop=null, topWop=null, toWrite=0, interested=0} to connect queue
12:32:04.655 [main] WARN  n.spy.memcached.MemcachedConnection - Could not redistribute to another node, retrying primary node for testWithTimeOut.
12:32:04.657 [New I/O server worker #2-1] INFO  c.t.j.p.MemcachedCommandHandler - SET com.thimbleware.jmemcached.Key@b6de645e
12:32:06.662 [New I/O server worker #2-1] INFO  c.t.j.p.MemcachedCommandHandler - GET com.thimbleware.jmemcached.Key@b6de645e
12:32:06.663 [New I/O server worker #2-1] INFO  c.t.j.p.MemcachedCommandHandler - VERSION
12:32:06.664 [Memcached IO over {MemcachedConnection to /127.0.0.1:24075} - SHUTTING DOWN (informed client)] INFO  n.spy.memcached.MemcachedConnection - Shut down memcached client
12:32:06.666 [main] INFO  n.spy.memcached.MemcachedConnection - Added {QA sa=/127.0.0.1:24075, #Rops=0, #Wops=0, #iq=0, topRop=null, topWop=null, toWrite=0, interested=0} to connect queue
12:32:06.668 [main] WARN  n.spy.memcached.MemcachedConnection - Could not redistribute to another node, retrying primary node for test.
12:32:06.669 [New I/O server worker #2-2] INFO  c.t.j.p.MemcachedCommandHandler - SET com.thimbleware.jmemcached.Key@74657393
12:32:06.669 [New I/O server worker #2-2] INFO  c.t.j.p.MemcachedCommandHandler - GET com.thimbleware.jmemcached.Key@74657393
12:32:06.673 [New I/O server worker #2-2] INFO  c.t.j.p.MemcachedCommandHandler - FLUSH_ALL
12:32:06.681 [New I/O server worker #2-2] INFO  c.t.j.p.MemcachedCommandHandler - VERSION
12:32:06.681 [Memcached IO over {MemcachedConnection to /127.0.0.1:24075} - SHUTTING DOWN (informed client)] INFO  n.spy.memcached.MemcachedConnection - Shut down memcached client
[INFO] Tests run: 2, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 2.029 s - in org.springframework.cloud.aws.cache.memcached.MemcachedCacheFactoryTest
[INFO] Running org.springframework.cloud.aws.cache.memcached.SimpleSpringMemcachedTest
[INFO] Tests run: 26, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.09 s - in org.springframework.cloud.aws.cache.memcached.SimpleSpringMemcachedTest
[INFO] Running org.springframework.cloud.aws.cache.redis.RedisCacheFactoryTest
[INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.196 s - in org.springframework.cloud.aws.cache.redis.RedisCacheFactoryTest
[INFO] Running org.springframework.cloud.aws.context.annotation.OnAwsCloudEnvironmentConditionTest
[INFO] Tests run: 4, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.876 s - in org.springframework.cloud.aws.context.annotation.OnAwsCloudEnvironmentConditionTest
[INFO] Running org.springframework.cloud.aws.context.annotation.OnMissingAmazonClientConditionTest
[INFO] Tests run: 2, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.223 s - in org.springframework.cloud.aws.context.annotation.OnMissingAmazonClientConditionTest
[INFO] Running org.springframework.cloud.aws.context.config.AmazonEc2InstanceDataPropertySourcePostProcessorTest
12:32:08.137 [main] WARN  o.s.c.a.c.c.AmazonEc2InstanceDataPropertySourcePostProcessor - Environment is not of type 'org.springframework.core.env.ConfigurableEnvironment' property source with instance data is not available
[INFO] Tests run: 2, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.027 s - in org.springframework.cloud.aws.context.config.AmazonEc2InstanceDataPropertySourcePostProcessorTest
[INFO] Running org.springframework.cloud.aws.context.config.annotation.ContextCredentialsConfigurationRegistrarTest
[INFO] Tests run: 9, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.21 s - in org.springframework.cloud.aws.context.config.annotation.ContextCredentialsConfigurationRegistrarTest
[INFO] Running org.springframework.cloud.aws.context.config.annotation.ContextInstanceDataConfigurationTest
[INFO] Tests run: 4, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 30.698 s - in org.springframework.cloud.aws.context.config.annotation.ContextInstanceDataConfigurationTest
[INFO] Running org.springframework.cloud.aws.context.config.annotation.ContextRegionConfigurationRegistrarTest
12:32:39.224 [main] WARN  o.s.c.a.AnnotationConfigApplicationContext - Exception encountered during context initialization - cancelling refresh attempt: org.springframework.beans.factory.BeanCreationException: Error creating bean with name 'regionProvider': Bean instantiation via constructor failed; nested exception is org.springframework.beans.BeanInstantiationException: Failed to instantiate [org.springframework.cloud.aws.core.region.StaticRegionProvider]: Constructor threw exception; nested exception is java.lang.IllegalArgumentException: The region 'eu-wast-1' is not a valid region!
[INFO] Tests run: 8, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.165 s - in org.springframework.cloud.aws.context.config.annotation.ContextRegionConfigurationRegistrarTest
[INFO] Running org.springframework.cloud.aws.context.config.annotation.ContextResourceLoaderConfigurationTest
[INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 1.939 s - in org.springframework.cloud.aws.context.config.annotation.ContextResourceLoaderConfigurationTest
[INFO] Running org.springframework.cloud.aws.context.config.annotation.ContextStackConfigurationTest
[INFO] Tests run: 2, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 10.379 s - in org.springframework.cloud.aws.context.config.annotation.ContextStackConfigurationTest
[INFO] Running org.springframework.cloud.aws.context.config.xml.ContextCredentialsBeanDefinitionParserTest
[INFO] Tests run: 8, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.286 s - in org.springframework.cloud.aws.context.config.xml.ContextCredentialsBeanDefinitionParserTest
[INFO] Running org.springframework.cloud.aws.context.config.xml.ContextInstanceDataPropertySourceBeanDefinitionParserTest
[INFO] Tests run: 5, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 34.027 s - in org.springframework.cloud.aws.context.config.xml.ContextInstanceDataPropertySourceBeanDefinitionParserTest
[INFO] Running org.springframework.cloud.aws.context.config.xml.ContextRegionBeanDefinitionParserTest
[INFO] Tests run: 8, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.2 s - in org.springframework.cloud.aws.context.config.xml.ContextRegionBeanDefinitionParserTest
[INFO] Running org.springframework.cloud.aws.context.config.xml.ContextResourceLoaderBeanDefinitionParserTest
12:33:26.330 [main] INFO  o.s.s.c.ThreadPoolTaskExecutor - Initializing ExecutorService
[INFO] Tests run: 5, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.27 s - in org.springframework.cloud.aws.context.config.xml.ContextResourceLoaderBeanDefinitionParserTest
[INFO] Running org.springframework.cloud.aws.context.config.xml.ContextSchemaWithoutVersionTest
[INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.014 s - in org.springframework.cloud.aws.context.config.xml.ContextSchemaWithoutVersionTest
[INFO] Running org.springframework.cloud.aws.context.config.xml.GlobalBeanDefinitionUtilsTest
[INFO] Tests run: 5, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.001 s - in org.springframework.cloud.aws.context.config.xml.GlobalBeanDefinitionUtilsTest
[INFO] Running org.springframework.cloud.aws.context.config.xml.StackConfigurationBeanDefinitionParserTest
[INFO] Tests run: 9, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 21.111 s - in org.springframework.cloud.aws.context.config.xml.StackConfigurationBeanDefinitionParserTest
[INFO] Running org.springframework.cloud.aws.context.support.io.SimpleStorageProtocolResolverConfigurerIntegrationTest
12:33:47.642 [main] INFO  o.s.t.c.s.AbstractContextLoader - Could not detect default resource locations for test class [org.springframework.cloud.aws.context.support.io.SimpleStorageProtocolResolverConfigurerIntegrationTest]: no resource found for suffixes {-context.xml}.
12:33:47.653 [main] INFO  o.s.t.c.s.AbstractDelegatingSmartContextLoader - AnnotationConfigContextLoader detected default configuration classes for context configuration [ContextConfigurationAttributes@2f60e66a declaringClass = 'org.springframework.cloud.aws.context.support.io.SimpleStorageProtocolResolverConfigurerIntegrationTest', classes = '{class org.springframework.cloud.aws.context.support.io.SimpleStorageProtocolResolverConfigurerIntegrationTest$Config}', locations = '{}', inheritLocations = true, initializers = '{}', inheritInitializers = true, name = [null], contextLoaderClass = 'org.springframework.test.context.ContextLoader'].
12:33:47.706 [main] INFO  o.s.t.c.s.DefaultTestContextBootstrapper - Loaded default TestExecutionListener class names from location [META-INF/spring.factories]: [org.springframework.test.context.web.ServletTestExecutionListener, org.springframework.test.context.support.DirtiesContextBeforeModesTestExecutionListener, org.springframework.test.context.support.DependencyInjectionTestExecutionListener, org.springframework.test.context.support.DirtiesContextTestExecutionListener, org.springframework.test.context.transaction.TransactionalTestExecutionListener, org.springframework.test.context.jdbc.SqlScriptsTestExecutionListener, org.springframework.test.context.event.EventPublishingTestExecutionListener, org.springframework.boot.test.mock.mockito.MockitoTestExecutionListener, org.springframework.boot.test.mock.mockito.ResetMocksTestExecutionListener, org.springframework.boot.test.autoconfigure.restdocs.RestDocsTestExecutionListener, org.springframework.boot.test.autoconfigure.web.client.MockRestServiceServerResetTestExecutionListener, org.springframework.boot.test.autoconfigure.web.servlet.MockMvcPrintOnlyOnFailureTestExecutionListener, org.springframework.boot.test.autoconfigure.web.servlet.WebDriverTestExecutionListener, org.springframework.boot.test.autoconfigure.webservices.client.MockWebServiceServerTestExecutionListener]
12:33:47.728 [main] INFO  o.s.t.c.s.DefaultTestContextBootstrapper - Using TestExecutionListeners: [org.springframework.test.context.support.DirtiesContextBeforeModesTestExecutionListener@4fbc516f, org.springframework.boot.test.mock.mockito.MockitoTestExecutionListener@1acc768, org.springframework.test.context.support.DependencyInjectionTestExecutionListener@25765a49, org.springframework.test.context.support.DirtiesContextTestExecutionListener@38caad07, org.springframework.test.context.transaction.TransactionalTestExecutionListener@15d0b458, org.springframework.test.context.jdbc.SqlScriptsTestExecutionListener@72a0a60d, org.springframework.test.context.event.EventPublishingTestExecutionListener@65930e02, org.springframework.boot.test.mock.mockito.ResetMocksTestExecutionListener@85c3522, org.springframework.boot.test.autoconfigure.restdocs.RestDocsTestExecutionListener@18be3205, org.springframework.boot.test.autoconfigure.web.client.MockRestServiceServerResetTestExecutionListener@6fd97fd1, org.springframework.boot.test.autoconfigure.web.servlet.MockMvcPrintOnlyOnFailureTestExecutionListener@12c78f36, org.springframework.boot.test.autoconfigure.web.servlet.WebDriverTestExecutionListener@7bdb4d69, org.springframework.boot.test.autoconfigure.webservices.client.MockWebServiceServerTestExecutionListener@129c760d]
[INFO] Tests run: 3, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.367 s - in org.springframework.cloud.aws.context.support.io.SimpleStorageProtocolResolverConfigurerIntegrationTest
[INFO] Running org.springframework.cloud.aws.context.support.io.SimpleStorageProtocolResolverConfigurerTest
[INFO] Tests run: 4, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.014 s - in org.springframework.cloud.aws.context.support.io.SimpleStorageProtocolResolverConfigurerTest
[INFO] Running org.springframework.cloud.aws.mail.config.xml.MailSchemaWithoutVersionTest
[INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.025 s - in org.springframework.cloud.aws.mail.config.xml.MailSchemaWithoutVersionTest
[INFO] Running org.springframework.cloud.aws.mail.config.xml.SimpleEmailServiceBeanDefinitionParserTest
[INFO] Tests run: 4, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.191 s - in org.springframework.cloud.aws.mail.config.xml.SimpleEmailServiceBeanDefinitionParserTest
[INFO] Running org.springframework.cloud.aws.mail.simplemail.SimpleEmailServiceJavaMailSenderTest
[INFO] Tests run: 13, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.335 s - in org.springframework.cloud.aws.mail.simplemail.SimpleEmailServiceJavaMailSenderTest
[INFO] Running org.springframework.cloud.aws.mail.simplemail.SimpleEmailServiceMailSenderTest
[INFO] Tests run: 5, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.006 s - in org.springframework.cloud.aws.mail.simplemail.SimpleEmailServiceMailSenderTest
[INFO]
[INFO] Results:
[INFO]
[INFO] Tests run: 148, Failures: 0, Errors: 0, Skipped: 0
[INFO]
[INFO]
[INFO] --- maven-jar-plugin:3.2.0:jar (default-jar) @ spring-cloud-aws-context ---
[INFO] Building jar: C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-context\target\spring-cloud-aws-context-3.0.0-SNAPSHOT.jar
[INFO]
[INFO] --- maven-javadoc-plugin:3.2.0:jar (javadoc) @ spring-cloud-aws-context ---
[INFO] No previous run data found, generating javadoc.
[INFO]
Loading source file C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-context\src\main\java\org\springframework\cloud\aws\cache\AbstractCacheFactory.java...
Loading source file C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-context\src\main\java\org\springframework\cloud\aws\cache\CacheFactory.java...
Loading source file C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-context\src\main\java\org\springframework\cloud\aws\cache\config\annotation\CacheClusterConfig.java...
Loading source file C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-context\src\main\java\org\springframework\cloud\aws\cache\config\annotation\ElastiCacheCacheConfigurer.java...
Loading source file C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-context\src\main\java\org\springframework\cloud\aws\cache\config\annotation\ElastiCacheCachingConfiguration.java...
Loading source file C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-context\src\main\java\org\springframework\cloud\aws\cache\config\annotation\EnableElastiCache.java...
Loading source file C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-context\src\main\java\org\springframework\cloud\aws\cache\config\xml\CacheBeanDefinitionParser.java...
Loading source file C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-context\src\main\java\org\springframework\cloud\aws\cache\config\xml\CacheNamespaceHandler.java...
Loading source file C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-context\src\main\java\org\springframework\cloud\aws\cache\ElastiCacheFactoryBean.java...
Loading source file C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-context\src\main\java\org\springframework\cloud\aws\cache\memcached\MemcachedCacheFactory.java...
Loading source file C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-context\src\main\java\org\springframework\cloud\aws\cache\memcached\SimpleSpringMemcached.java...
Loading source file C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-context\src\main\java\org\springframework\cloud\aws\cache\redis\RedisCacheFactory.java...
Loading source file C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-context\src\main\java\org\springframework\cloud\aws\context\annotation\ConditionalOnAwsCloudEnvironment.java...
Loading source file C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-context\src\main\java\org\springframework\cloud\aws\context\annotation\ConditionalOnClass.java...
Loading source file C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-context\src\main\java\org\springframework\cloud\aws\context\annotation\ConditionalOnMissingAmazonClient.java...
Loading source file C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-context\src\main\java\org\springframework\cloud\aws\context\annotation\ConditionalOnMissingAwsCloudEnvironment.java...
Loading source file C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-context\src\main\java\org\springframework\cloud\aws\context\annotation\OnAwsCloudEnvironmentCondition.java...
Loading source file C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-context\src\main\java\org\springframework\cloud\aws\context\annotation\OnClassCondition.java...
Loading source file C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-context\src\main\java\org\springframework\cloud\aws\context\annotation\OnMissingAmazonClientCondition.java...
Loading source file C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-context\src\main\java\org\springframework\cloud\aws\context\annotation\OnMissingAwsCloudEnvironmentCondition.java...
Loading source file C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-context\src\main\java\org\springframework\cloud\aws\context\config\AmazonEc2InstanceDataPropertySourcePostProcessor.java...
Loading source file C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-context\src\main\java\org\springframework\cloud\aws\context\config\annotation\ContextCredentialsConfigurationRegistrar.java...
Loading source file C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-context\src\main\java\org\springframework\cloud\aws\context\config\annotation\ContextDefaultConfigurationRegistrar.java...
Loading source file C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-context\src\main\java\org\springframework\cloud\aws\context\config\annotation\ContextInstanceDataConfiguration.java...
Loading source file C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-context\src\main\java\org\springframework\cloud\aws\context\config\annotation\ContextRegionConfigurationRegistrar.java...
Loading source file C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-context\src\main\java\org\springframework\cloud\aws\context\config\annotation\ContextResourceLoaderConfiguration.java...
Loading source file C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-context\src\main\java\org\springframework\cloud\aws\context\config\annotation\ContextStackConfiguration.java...
Loading source file C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-context\src\main\java\org\springframework\cloud\aws\context\config\annotation\EnableContextCredentials.java...
Loading source file C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-context\src\main\java\org\springframework\cloud\aws\context\config\annotation\EnableContextInstanceData.java...
Loading source file C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-context\src\main\java\org\springframework\cloud\aws\context\config\annotation\EnableContextRegion.java...
Loading source file C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-context\src\main\java\org\springframework\cloud\aws\context\config\annotation\EnableContextResourceLoader.java...
Loading source file C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-context\src\main\java\org\springframework\cloud\aws\context\config\annotation\EnableStackConfiguration.java...
Loading source file C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-context\src\main\java\org\springframework\cloud\aws\context\config\support\ContextConfigurationUtils.java...
Loading source file C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-context\src\main\java\org\springframework\cloud\aws\context\config\xml\ContextCredentialsBeanDefinitionParser.java...
Loading source file C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-context\src\main\java\org\springframework\cloud\aws\context\config\xml\ContextInstanceDataPropertySourceBeanDefinitionParser.java...
Loading source file C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-context\src\main\java\org\springframework\cloud\aws\context\config\xml\ContextNamespaceHandler.java...
Loading source file C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-context\src\main\java\org\springframework\cloud\aws\context\config\xml\ContextRegionBeanDefinitionParser.java...
Loading source file C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-context\src\main\java\org\springframework\cloud\aws\context\config\xml\ContextResourceLoaderBeanDefinitionParser.java...
Loading source file C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-context\src\main\java\org\springframework\cloud\aws\context\config\xml\GlobalBeanDefinitionUtils.java...
Loading source file C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-context\src\main\java\org\springframework\cloud\aws\context\config\xml\StackConfigurationBeanDefinitionParser.java...
Loading source file C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-context\src\main\java\org\springframework\cloud\aws\context\support\env\AwsCloudEnvironmentCheckUtils.java...
Loading source file C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-context\src\main\java\org\springframework\cloud\aws\context\support\io\SimpleStorageProtocolResolverConfigurer.java...
Loading source file C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-context\src\main\java\org\springframework\cloud\aws\mail\config\xml\MailNamespaceHandler.java...
Loading source file C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-context\src\main\java\org\springframework\cloud\aws\mail\config\xml\SimpleEmailServiceBeanDefinitionParser.java...
Loading source file C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-context\src\main\java\org\springframework\cloud\aws\mail\simplemail\SimpleEmailServiceJavaMailSender.java...
Loading source file C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-context\src\main\java\org\springframework\cloud\aws\mail\simplemail\SimpleEmailServiceMailSender.java...
Constructing Javadoc information...
Standard Doclet version 1.8.0_291
Building tree for all the packages and classes...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-context\target\apidocs\org\springframework\cloud\aws\cache\AbstractCacheFactory.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-context\target\apidocs\org\springframework\cloud\aws\cache\CacheFactory.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-context\target\apidocs\org\springframework\cloud\aws\cache\ElastiCacheFactoryBean.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-context\target\apidocs\org\springframework\cloud\aws\context\support\io\SimpleStorageProtocolResolverConfigurer.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-context\target\apidocs\org\springframework\cloud\aws\cache\redis\RedisCacheFactory.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-context\target\apidocs\org\springframework\cloud\aws\context\config\AmazonEc2InstanceDataPropertySourcePostProcessor.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-context\target\apidocs\org\springframework\cloud\aws\context\annotation\ConditionalOnAwsCloudEnvironment.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-context\target\apidocs\org\springframework\cloud\aws\context\annotation\ConditionalOnClass.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-context\target\apidocs\org\springframework\cloud\aws\context\annotation\ConditionalOnMissingAmazonClient.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-context\target\apidocs\org\springframework\cloud\aws\context\annotation\ConditionalOnMissingAwsCloudEnvironment.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-context\target\apidocs\org\springframework\cloud\aws\context\annotation\OnAwsCloudEnvironmentCondition.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-context\target\apidocs\org\springframework\cloud\aws\context\annotation\OnClassCondition.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-context\target\apidocs\org\springframework\cloud\aws\context\annotation\OnMissingAmazonClientCondition.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-context\target\apidocs\org\springframework\cloud\aws\context\annotation\OnMissingAwsCloudEnvironmentCondition.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-context\target\apidocs\org\springframework\cloud\aws\context\support\env\AwsCloudEnvironmentCheckUtils.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-context\target\apidocs\org\springframework\cloud\aws\context\config\support\ContextConfigurationUtils.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-context\target\apidocs\org\springframework\cloud\aws\mail\config\xml\MailNamespaceHandler.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-context\target\apidocs\org\springframework\cloud\aws\cache\config\xml\CacheNamespaceHandler.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-context\target\apidocs\org\springframework\cloud\aws\context\config\annotation\ContextCredentialsConfigurationRegistrar.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-context\target\apidocs\org\springframework\cloud\aws\context\config\annotation\ContextDefaultConfigurationRegistrar.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-context\target\apidocs\org\springframework\cloud\aws\context\config\annotation\ContextInstanceDataConfiguration.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-context\target\apidocs\org\springframework\cloud\aws\context\config\annotation\ContextRegionConfigurationRegistrar.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-context\target\apidocs\org\springframework\cloud\aws\context\config\annotation\ContextResourceLoaderConfiguration.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-context\target\apidocs\org\springframework\cloud\aws\context\config\annotation\ContextResourceLoaderConfiguration.Registrar.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-context\target\apidocs\org\springframework\cloud\aws\context\config\annotation\ContextStackConfiguration.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-context\target\apidocs\org\springframework\cloud\aws\context\config\annotation\EnableContextCredentials.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-context\target\apidocs\org\springframework\cloud\aws\context\config\annotation\EnableContextInstanceData.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-context\target\apidocs\org\springframework\cloud\aws\context\config\annotation\EnableContextRegion.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-context\target\apidocs\org\springframework\cloud\aws\context\config\annotation\EnableContextResourceLoader.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-context\target\apidocs\org\springframework\cloud\aws\context\config\annotation\EnableStackConfiguration.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-context\target\apidocs\org\springframework\cloud\aws\cache\config\annotation\CacheClusterConfig.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-context\target\apidocs\org\springframework\cloud\aws\cache\config\annotation\ElastiCacheCacheConfigurer.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-context\target\apidocs\org\springframework\cloud\aws\cache\config\annotation\ElastiCacheCachingConfiguration.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-context\target\apidocs\org\springframework\cloud\aws\cache\config\annotation\EnableElastiCache.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-context\target\apidocs\org\springframework\cloud\aws\mail\simplemail\SimpleEmailServiceJavaMailSender.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-context\target\apidocs\org\springframework\cloud\aws\mail\simplemail\SimpleEmailServiceMailSender.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-context\target\apidocs\org\springframework\cloud\aws\cache\memcached\MemcachedCacheFactory.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-context\target\apidocs\org\springframework\cloud\aws\cache\memcached\SimpleSpringMemcached.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-context\target\apidocs\org\springframework\cloud\aws\context\config\xml\ContextNamespaceHandler.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-context\target\apidocs\org\springframework\cloud\aws\context\config\xml\ContextRegionBeanDefinitionParser.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-context\target\apidocs\org\springframework\cloud\aws\context\config\xml\ContextResourceLoaderBeanDefinitionParser.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-context\target\apidocs\org\springframework\cloud\aws\context\config\xml\GlobalBeanDefinitionUtils.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-context\target\apidocs\overview-frame.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-context\target\apidocs\org\springframework\cloud\aws\cache\package-frame.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-context\target\apidocs\org\springframework\cloud\aws\cache\package-summary.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-context\target\apidocs\org\springframework\cloud\aws\cache\package-tree.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-context\target\apidocs\org\springframework\cloud\aws\cache\config\annotation\package-frame.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-context\target\apidocs\org\springframework\cloud\aws\cache\config\annotation\package-summary.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-context\target\apidocs\org\springframework\cloud\aws\cache\config\annotation\package-tree.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-context\target\apidocs\org\springframework\cloud\aws\cache\config\xml\package-frame.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-context\target\apidocs\org\springframework\cloud\aws\cache\config\xml\package-summary.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-context\target\apidocs\org\springframework\cloud\aws\cache\config\xml\package-tree.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-context\target\apidocs\org\springframework\cloud\aws\cache\memcached\package-frame.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-context\target\apidocs\org\springframework\cloud\aws\cache\memcached\package-summary.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-context\target\apidocs\org\springframework\cloud\aws\cache\memcached\package-tree.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-context\target\apidocs\org\springframework\cloud\aws\cache\redis\package-frame.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-context\target\apidocs\org\springframework\cloud\aws\cache\redis\package-summary.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-context\target\apidocs\org\springframework\cloud\aws\cache\redis\package-tree.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-context\target\apidocs\org\springframework\cloud\aws\context\annotation\package-frame.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-context\target\apidocs\org\springframework\cloud\aws\context\annotation\package-summary.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-context\target\apidocs\org\springframework\cloud\aws\context\annotation\package-tree.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-context\target\apidocs\org\springframework\cloud\aws\context\config\package-frame.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-context\target\apidocs\org\springframework\cloud\aws\context\config\package-summary.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-context\target\apidocs\org\springframework\cloud\aws\context\config\package-tree.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-context\target\apidocs\org\springframework\cloud\aws\context\config\annotation\package-frame.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-context\target\apidocs\org\springframework\cloud\aws\context\config\annotation\package-summary.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-context\target\apidocs\org\springframework\cloud\aws\context\config\annotation\package-tree.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-context\target\apidocs\org\springframework\cloud\aws\context\config\support\package-frame.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-context\target\apidocs\org\springframework\cloud\aws\context\config\support\package-summary.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-context\target\apidocs\org\springframework\cloud\aws\context\config\support\package-tree.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-context\target\apidocs\org\springframework\cloud\aws\context\config\xml\package-frame.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-context\target\apidocs\org\springframework\cloud\aws\context\config\xml\package-summary.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-context\target\apidocs\org\springframework\cloud\aws\context\config\xml\package-tree.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-context\target\apidocs\org\springframework\cloud\aws\context\support\env\package-frame.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-context\target\apidocs\org\springframework\cloud\aws\context\support\env\package-summary.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-context\target\apidocs\org\springframework\cloud\aws\context\support\env\package-tree.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-context\target\apidocs\org\springframework\cloud\aws\context\support\io\package-frame.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-context\target\apidocs\org\springframework\cloud\aws\context\support\io\package-summary.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-context\target\apidocs\org\springframework\cloud\aws\context\support\io\package-tree.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-context\target\apidocs\org\springframework\cloud\aws\mail\config\xml\package-frame.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-context\target\apidocs\org\springframework\cloud\aws\mail\config\xml\package-summary.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-context\target\apidocs\org\springframework\cloud\aws\mail\config\xml\package-tree.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-context\target\apidocs\org\springframework\cloud\aws\mail\simplemail\package-frame.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-context\target\apidocs\org\springframework\cloud\aws\mail\simplemail\package-summary.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-context\target\apidocs\org\springframework\cloud\aws\mail\simplemail\package-tree.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-context\target\apidocs\constant-values.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-context\target\apidocs\org\springframework\cloud\aws\cache\class-use\AbstractCacheFactory.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-context\target\apidocs\org\springframework\cloud\aws\cache\class-use\CacheFactory.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-context\target\apidocs\org\springframework\cloud\aws\cache\config\annotation\class-use\CacheClusterConfig.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-context\target\apidocs\org\springframework\cloud\aws\cache\config\annotation\class-use\ElastiCacheCacheConfigurer.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-context\target\apidocs\org\springframework\cloud\aws\cache\config\annotation\class-use\ElastiCacheCachingConfiguration.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-context\target\apidocs\org\springframework\cloud\aws\cache\config\annotation\class-use\EnableElastiCache.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-context\target\apidocs\org\springframework\cloud\aws\cache\config\xml\class-use\CacheNamespaceHandler.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-context\target\apidocs\org\springframework\cloud\aws\cache\class-use\ElastiCacheFactoryBean.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-context\target\apidocs\org\springframework\cloud\aws\cache\memcached\class-use\MemcachedCacheFactory.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-context\target\apidocs\org\springframework\cloud\aws\cache\memcached\class-use\SimpleSpringMemcached.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-context\target\apidocs\org\springframework\cloud\aws\cache\redis\class-use\RedisCacheFactory.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-context\target\apidocs\org\springframework\cloud\aws\context\annotation\class-use\ConditionalOnAwsCloudEnvironment.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-context\target\apidocs\org\springframework\cloud\aws\context\annotation\class-use\ConditionalOnClass.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-context\target\apidocs\org\springframework\cloud\aws\context\annotation\class-use\ConditionalOnMissingAmazonClient.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-context\target\apidocs\org\springframework\cloud\aws\context\annotation\class-use\ConditionalOnMissingAwsCloudEnvironment.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-context\target\apidocs\org\springframework\cloud\aws\context\annotation\class-use\OnAwsCloudEnvironmentCondition.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-context\target\apidocs\org\springframework\cloud\aws\context\annotation\class-use\OnClassCondition.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-context\target\apidocs\org\springframework\cloud\aws\context\annotation\class-use\OnMissingAmazonClientCondition.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-context\target\apidocs\org\springframework\cloud\aws\context\annotation\class-use\OnMissingAwsCloudEnvironmentCondition.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-context\target\apidocs\org\springframework\cloud\aws\context\config\class-use\AmazonEc2InstanceDataPropertySourcePostProcessor.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-context\target\apidocs\org\springframework\cloud\aws\context\config\annotation\class-use\ContextCredentialsConfigurationRegistrar.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-context\target\apidocs\org\springframework\cloud\aws\context\config\annotation\class-use\ContextDefaultConfigurationRegistrar.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-context\target\apidocs\org\springframework\cloud\aws\context\config\annotation\class-use\ContextInstanceDataConfiguration.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-context\target\apidocs\org\springframework\cloud\aws\context\config\annotation\class-use\ContextRegionConfigurationRegistrar.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-context\target\apidocs\org\springframework\cloud\aws\context\config\annotation\class-use\ContextResourceLoaderConfiguration.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-context\target\apidocs\org\springframework\cloud\aws\context\config\annotation\class-use\ContextResourceLoaderConfiguration.Registrar.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-context\target\apidocs\org\springframework\cloud\aws\context\config\annotation\class-use\ContextStackConfiguration.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-context\target\apidocs\org\springframework\cloud\aws\context\config\annotation\class-use\EnableContextCredentials.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-context\target\apidocs\org\springframework\cloud\aws\context\config\annotation\class-use\EnableContextInstanceData.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-context\target\apidocs\org\springframework\cloud\aws\context\config\annotation\class-use\EnableContextRegion.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-context\target\apidocs\org\springframework\cloud\aws\context\config\annotation\class-use\EnableContextResourceLoader.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-context\target\apidocs\org\springframework\cloud\aws\context\config\annotation\class-use\EnableStackConfiguration.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-context\target\apidocs\org\springframework\cloud\aws\context\config\support\class-use\ContextConfigurationUtils.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-context\target\apidocs\org\springframework\cloud\aws\context\config\xml\class-use\ContextNamespaceHandler.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-context\target\apidocs\org\springframework\cloud\aws\context\config\xml\class-use\ContextRegionBeanDefinitionParser.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-context\target\apidocs\org\springframework\cloud\aws\context\config\xml\class-use\ContextResourceLoaderBeanDefinitionParser.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-context\target\apidocs\org\springframework\cloud\aws\context\config\xml\class-use\GlobalBeanDefinitionUtils.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-context\target\apidocs\org\springframework\cloud\aws\context\support\env\class-use\AwsCloudEnvironmentCheckUtils.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-context\target\apidocs\org\springframework\cloud\aws\context\support\io\class-use\SimpleStorageProtocolResolverConfigurer.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-context\target\apidocs\org\springframework\cloud\aws\mail\config\xml\class-use\MailNamespaceHandler.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-context\target\apidocs\org\springframework\cloud\aws\mail\simplemail\class-use\SimpleEmailServiceJavaMailSender.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-context\target\apidocs\org\springframework\cloud\aws\mail\simplemail\class-use\SimpleEmailServiceMailSender.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-context\target\apidocs\org\springframework\cloud\aws\cache\package-use.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-context\target\apidocs\org\springframework\cloud\aws\cache\config\annotation\package-use.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-context\target\apidocs\org\springframework\cloud\aws\cache\config\xml\package-use.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-context\target\apidocs\org\springframework\cloud\aws\cache\memcached\package-use.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-context\target\apidocs\org\springframework\cloud\aws\cache\redis\package-use.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-context\target\apidocs\org\springframework\cloud\aws\context\annotation\package-use.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-context\target\apidocs\org\springframework\cloud\aws\context\config\package-use.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-context\target\apidocs\org\springframework\cloud\aws\context\config\annotation\package-use.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-context\target\apidocs\org\springframework\cloud\aws\context\config\support\package-use.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-context\target\apidocs\org\springframework\cloud\aws\context\config\xml\package-use.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-context\target\apidocs\org\springframework\cloud\aws\context\support\env\package-use.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-context\target\apidocs\org\springframework\cloud\aws\context\support\io\package-use.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-context\target\apidocs\org\springframework\cloud\aws\mail\config\xml\package-use.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-context\target\apidocs\org\springframework\cloud\aws\mail\simplemail\package-use.html...
Building index for all the packages and classes...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-context\target\apidocs\overview-tree.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-context\target\apidocs\index-all.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-context\target\apidocs\deprecated-list.html...
Building index for all classes...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-context\target\apidocs\allclasses-frame.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-context\target\apidocs\allclasses-noframe.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-context\target\apidocs\index.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-context\target\apidocs\overview-summary.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-context\target\apidocs\help-doc.html...
[INFO] Building jar: C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-context\target\spring-cloud-aws-context-3.0.0-SNAPSHOT-javadoc.jar
[INFO]
[INFO] >>> maven-source-plugin:3.2.1:jar (attach-sources) > generate-sources @ spring-cloud-aws-context >>>
[INFO]
[INFO] --- maven-checkstyle-plugin:3.1.0:check (checkstyle-validation) @ spring-cloud-aws-context ---
[INFO] Starting audit...
Audit done.
[INFO]
[INFO] --- maven-checkstyle-plugin:3.1.0:check (no-http-checkstyle-validation) @ spring-cloud-aws-context ---
[INFO]
[INFO] --- spring-javaformat-maven-plugin:0.0.25:validate (default) @ spring-cloud-aws-context ---
[INFO]
[INFO] --- spring-javaformat-maven-plugin:0.0.25:apply (default) @ spring-cloud-aws-context ---
[INFO]
[INFO] <<< maven-source-plugin:3.2.1:jar (attach-sources) < generate-sources @ spring-cloud-aws-context <<<
[INFO]
[INFO]
[INFO] --- maven-source-plugin:3.2.1:jar (attach-sources) @ spring-cloud-aws-context ---
[INFO] Building jar: C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-context\target\spring-cloud-aws-context-3.0.0-SNAPSHOT-sources.jar
[INFO]
[INFO] ----------< org.springframework.cloud:spring-cloud-aws-jdbc >-----------
[INFO] Building Spring Cloud AWS JDBC 3.0.0-SNAPSHOT                     [5/18]
[INFO] --------------------------------[ jar ]---------------------------------
Downloading from spring-milestones: https://repo.spring.io/libs-milestone-local/org/springframework/spring-jdbc/5.3.1/spring-jdbc-5.3.1.pom
Downloading from spring-releases: https://repo.spring.io/release/org/springframework/spring-jdbc/5.3.1/spring-jdbc-5.3.1.pom
Downloaded from spring-releases: https://repo.spring.io/release/org/springframework/spring-jdbc/5.3.1/spring-jdbc-5.3.1.pom (2.4 kB at 3.7 kB/s)
Downloading from spring-milestones: https://repo.spring.io/libs-milestone-local/org/apache/tomcat/tomcat-jdbc/9.0.39/tomcat-jdbc-9.0.39.pom
Downloading from spring-releases: https://repo.spring.io/release/org/apache/tomcat/tomcat-jdbc/9.0.39/tomcat-jdbc-9.0.39.pom
Downloading from spring-plugins: https://repo.spring.io/plugins/org/apache/tomcat/tomcat-jdbc/9.0.39/tomcat-jdbc-9.0.39.pom
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/tomcat/tomcat-jdbc/9.0.39/tomcat-jdbc-9.0.39.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/tomcat/tomcat-jdbc/9.0.39/tomcat-jdbc-9.0.39.pom (1.8 kB at 8.9 kB/s)
Downloading from spring-milestones: https://repo.spring.io/libs-milestone-local/org/apache/tomcat/tomcat-juli/9.0.39/tomcat-juli-9.0.39.pom
Downloading from spring-releases: https://repo.spring.io/release/org/apache/tomcat/tomcat-juli/9.0.39/tomcat-juli-9.0.39.pom
Downloading from spring-plugins: https://repo.spring.io/plugins/org/apache/tomcat/tomcat-juli/9.0.39/tomcat-juli-9.0.39.pom
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/tomcat/tomcat-juli/9.0.39/tomcat-juli-9.0.39.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/tomcat/tomcat-juli/9.0.39/tomcat-juli-9.0.39.pom (1.5 kB at 19 kB/s)
Downloading from spring-milestones: https://repo.spring.io/libs-milestone-local/org/springframework/retry/spring-retry/1.3.0/spring-retry-1.3.0.pom
Downloading from spring-releases: https://repo.spring.io/release/org/springframework/retry/spring-retry/1.3.0/spring-retry-1.3.0.pom
Downloaded from spring-releases: https://repo.spring.io/release/org/springframework/retry/spring-retry/1.3.0/spring-retry-1.3.0.pom (11 kB at 17 kB/s)
Downloading from spring-milestones: https://repo.spring.io/libs-milestone-local/com/amazonaws/aws-java-sdk-rds/1.11.907/aws-java-sdk-rds-1.11.907.pom
Downloading from spring-releases: https://repo.spring.io/release/com/amazonaws/aws-java-sdk-rds/1.11.907/aws-java-sdk-rds-1.11.907.pom
Downloading from spring-plugins: https://repo.spring.io/plugins/com/amazonaws/aws-java-sdk-rds/1.11.907/aws-java-sdk-rds-1.11.907.pom
Downloading from central: https://repo.maven.apache.org/maven2/com/amazonaws/aws-java-sdk-rds/1.11.907/aws-java-sdk-rds-1.11.907.pom
Downloaded from central: https://repo.maven.apache.org/maven2/com/amazonaws/aws-java-sdk-rds/1.11.907/aws-java-sdk-rds-1.11.907.pom (3.6 kB at 12 kB/s)
Downloading from spring-milestones: https://repo.spring.io/libs-milestone-local/com/amazonaws/aws-java-sdk-iam/1.11.907/aws-java-sdk-iam-1.11.907.pom
Downloading from spring-releases: https://repo.spring.io/release/com/amazonaws/aws-java-sdk-iam/1.11.907/aws-java-sdk-iam-1.11.907.pom
Downloading from spring-plugins: https://repo.spring.io/plugins/com/amazonaws/aws-java-sdk-iam/1.11.907/aws-java-sdk-iam-1.11.907.pom
Downloading from central: https://repo.maven.apache.org/maven2/com/amazonaws/aws-java-sdk-iam/1.11.907/aws-java-sdk-iam-1.11.907.pom
Downloaded from central: https://repo.maven.apache.org/maven2/com/amazonaws/aws-java-sdk-iam/1.11.907/aws-java-sdk-iam-1.11.907.pom (3.6 kB at 12 kB/s)
Downloading from spring-milestones: https://repo.spring.io/libs-milestone-local/org/apache/tomcat/extras/tomcat-extras-juli-adapters/8.0.33/tomcat-extras-juli-adapters-8.0.33.pom
Downloading from spring-releases: https://repo.spring.io/release/org/apache/tomcat/extras/tomcat-extras-juli-adapters/8.0.33/tomcat-extras-juli-adapters-8.0.33.pom
Downloading from spring-plugins: https://repo.spring.io/plugins/org/apache/tomcat/extras/tomcat-extras-juli-adapters/8.0.33/tomcat-extras-juli-adapters-8.0.33.pom
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/tomcat/extras/tomcat-extras-juli-adapters/8.0.33/tomcat-extras-juli-adapters-8.0.33.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/tomcat/extras/tomcat-extras-juli-adapters/8.0.33/tomcat-extras-juli-adapters-8.0.33.pom (1.8 kB at 6.1 kB/s)
Downloading from spring-milestones: https://repo.spring.io/libs-milestone-local/org/apache/tomcat/extras/tomcat-extras-juli/8.0.33/tomcat-extras-juli-8.0.33.pom
Downloading from spring-releases: https://repo.spring.io/release/org/apache/tomcat/extras/tomcat-extras-juli/8.0.33/tomcat-extras-juli-8.0.33.pom
Downloading from spring-plugins: https://repo.spring.io/plugins/org/apache/tomcat/extras/tomcat-extras-juli/8.0.33/tomcat-extras-juli-8.0.33.pom
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/tomcat/extras/tomcat-extras-juli/8.0.33/tomcat-extras-juli-8.0.33.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/tomcat/extras/tomcat-extras-juli/8.0.33/tomcat-extras-juli-8.0.33.pom (1.4 kB at 4.3 kB/s)
Downloading from spring-milestones: https://repo.spring.io/libs-milestone-local/org/springframework/spring-jdbc/5.3.1/spring-jdbc-5.3.1.jar
Downloading from spring-milestones: https://repo.spring.io/libs-milestone-local/org/apache/tomcat/tomcat-juli/9.0.39/tomcat-juli-9.0.39.jar
Downloading from spring-milestones: https://repo.spring.io/libs-milestone-local/com/amazonaws/aws-java-sdk-rds/1.11.907/aws-java-sdk-rds-1.11.907.jar
Downloading from spring-milestones: https://repo.spring.io/libs-milestone-local/org/springframework/retry/spring-retry/1.3.0/spring-retry-1.3.0.jar
Downloading from spring-milestones: https://repo.spring.io/libs-milestone-local/org/apache/tomcat/tomcat-jdbc/9.0.39/tomcat-jdbc-9.0.39.jar
Downloading from spring-milestones: https://repo.spring.io/libs-milestone-local/com/amazonaws/aws-java-sdk-iam/1.11.907/aws-java-sdk-iam-1.11.907.jar
Downloading from spring-milestones: https://repo.spring.io/libs-milestone-local/org/apache/tomcat/extras/tomcat-extras-juli-adapters/8.0.33/tomcat-extras-juli-adapters-8.0.33.jar
Downloading from spring-milestones: https://repo.spring.io/libs-milestone-local/org/apache/tomcat/extras/tomcat-extras-juli/8.0.33/tomcat-extras-juli-8.0.33.jar
Downloading from spring-releases: https://repo.spring.io/release/org/springframework/spring-jdbc/5.3.1/spring-jdbc-5.3.1.jar
Downloading from spring-releases: https://repo.spring.io/release/org/springframework/retry/spring-retry/1.3.0/spring-retry-1.3.0.jar
Downloading from spring-releases: https://repo.spring.io/release/org/apache/tomcat/tomcat-juli/9.0.39/tomcat-juli-9.0.39.jar
Downloading from spring-releases: https://repo.spring.io/release/org/apache/tomcat/tomcat-jdbc/9.0.39/tomcat-jdbc-9.0.39.jar
Downloading from spring-releases: https://repo.spring.io/release/com/amazonaws/aws-java-sdk-rds/1.11.907/aws-java-sdk-rds-1.11.907.jar
Downloading from spring-releases: https://repo.spring.io/release/com/amazonaws/aws-java-sdk-iam/1.11.907/aws-java-sdk-iam-1.11.907.jar
Downloading from spring-releases: https://repo.spring.io/release/org/apache/tomcat/extras/tomcat-extras-juli/8.0.33/tomcat-extras-juli-8.0.33.jar
Downloading from spring-releases: https://repo.spring.io/release/org/apache/tomcat/extras/tomcat-extras-juli-adapters/8.0.33/tomcat-extras-juli-adapters-8.0.33.jar
Downloaded from spring-releases: https://repo.spring.io/release/org/springframework/retry/spring-retry/1.3.0/spring-retry-1.3.0.jar (140 kB at 69 kB/s)
Downloaded from spring-releases: https://repo.spring.io/release/org/springframework/spring-jdbc/5.3.1/spring-jdbc-5.3.1.jar (417 kB at 97 kB/s)
Downloading from spring-plugins: https://repo.spring.io/plugins/org/apache/tomcat/tomcat-jdbc/9.0.39/tomcat-jdbc-9.0.39.jar
Downloading from spring-plugins: https://repo.spring.io/plugins/com/amazonaws/aws-java-sdk-iam/1.11.907/aws-java-sdk-iam-1.11.907.jar
Downloading from spring-plugins: https://repo.spring.io/plugins/com/amazonaws/aws-java-sdk-rds/1.11.907/aws-java-sdk-rds-1.11.907.jar
Downloading from spring-plugins: https://repo.spring.io/plugins/org/apache/tomcat/tomcat-juli/9.0.39/tomcat-juli-9.0.39.jar
Downloading from spring-plugins: https://repo.spring.io/plugins/org/apache/tomcat/extras/tomcat-extras-juli-adapters/8.0.33/tomcat-extras-juli-adapters-8.0.33.jar
Downloading from spring-plugins: https://repo.spring.io/plugins/org/apache/tomcat/extras/tomcat-extras-juli/8.0.33/tomcat-extras-juli-8.0.33.jar
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/tomcat/tomcat-jdbc/9.0.39/tomcat-jdbc-9.0.39.jar
Downloading from central: https://repo.maven.apache.org/maven2/com/amazonaws/aws-java-sdk-iam/1.11.907/aws-java-sdk-iam-1.11.907.jar
Downloading from central: https://repo.maven.apache.org/maven2/com/amazonaws/aws-java-sdk-rds/1.11.907/aws-java-sdk-rds-1.11.907.jar
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/tomcat/tomcat-juli/9.0.39/tomcat-juli-9.0.39.jar
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/tomcat/extras/tomcat-extras-juli-adapters/8.0.33/tomcat-extras-juli-adapters-8.0.33.jar
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/tomcat/tomcat-jdbc/9.0.39/tomcat-jdbc-9.0.39.jar (150 kB at 592 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/tomcat/extras/tomcat-extras-juli/8.0.33/tomcat-extras-juli-8.0.33.jar
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/tomcat/tomcat-juli/9.0.39/tomcat-juli-9.0.39.jar (50 kB at 186 kB/s)
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/tomcat/extras/tomcat-extras-juli-adapters/8.0.33/tomcat-extras-juli-adapters-8.0.33.jar (22 kB at 52 kB/s)
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/tomcat/extras/tomcat-extras-juli/8.0.33/tomcat-extras-juli-8.0.33.jar (78 kB at 100 kB/s)
Downloaded from central: https://repo.maven.apache.org/maven2/com/amazonaws/aws-java-sdk-iam/1.11.907/aws-java-sdk-iam-1.11.907.jar (1.4 MB at 681 kB/s)
Downloaded from central: https://repo.maven.apache.org/maven2/com/amazonaws/aws-java-sdk-rds/1.11.907/aws-java-sdk-rds-1.11.907.jar (1.7 MB at 588 kB/s)
[INFO]
[INFO] --- maven-clean-plugin:2.5:clean (default-clean) @ spring-cloud-aws-jdbc ---
[INFO]
[INFO] --- maven-checkstyle-plugin:3.1.0:check (checkstyle-validation) @ spring-cloud-aws-jdbc ---
[INFO] Starting audit...
Audit done.
[INFO]
[INFO] --- maven-checkstyle-plugin:3.1.0:check (no-http-checkstyle-validation) @ spring-cloud-aws-jdbc ---
[INFO]
[INFO] --- spring-javaformat-maven-plugin:0.0.25:validate (default) @ spring-cloud-aws-jdbc ---
[INFO]
[INFO] --- spring-javaformat-maven-plugin:0.0.25:apply (default) @ spring-cloud-aws-jdbc ---
[INFO]
[INFO] --- maven-resources-plugin:3.1.0:resources (default-resources) @ spring-cloud-aws-jdbc ---
[INFO] Using 'UTF-8' encoding to copy filtered resources.
[INFO] Copying 0 resource
[INFO] Copying 4 resources
[INFO]
[INFO] --- maven-compiler-plugin:3.8.1:compile (default-compile) @ spring-cloud-aws-jdbc ---
[INFO] Changes detected - recompiling the module!
[INFO] Compiling 23 source files to C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-jdbc\target\classes
[WARNING] /C:/Users/jstupar/my_spring_cloud_aws/spring-cloud-aws/spring-cloud-aws-jdbc/src/main/java/org/springframework/cloud/aws/jdbc/config/xml/AmazonRdsRetryInterceptorBeanDefinitionParser.java:[33,60] org.springframework.cloud.aws.core.config.xml.XmlWebserviceConfigurationUtils in org.springframework.cloud.aws.core.config.xml has been deprecated
[WARNING] /C:/Users/jstupar/my_spring_cloud_aws/spring-cloud-aws/spring-cloud-aws-jdbc/src/main/java/org/springframework/cloud/aws/jdbc/config/xml/AmazonRdsDataSourceBeanDefinitionParser.java:[39,60] org.springframework.cloud.aws.core.config.xml.XmlWebserviceConfigurationUtils in org.springframework.cloud.aws.core.config.xml has been deprecated
[INFO]
[INFO] --- maven-resources-plugin:3.1.0:testResources (default-testResources) @ spring-cloud-aws-jdbc ---
[INFO] Using 'UTF-8' encoding to copy filtered resources.
[INFO] Copying 19 resources
[INFO]
[INFO] --- maven-compiler-plugin:3.8.1:testCompile (default-testCompile) @ spring-cloud-aws-jdbc ---
[INFO] Changes detected - recompiling the module!
[INFO] Compiling 14 source files to C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-jdbc\target\test-classes
[INFO]
[INFO] --- maven-surefire-plugin:2.22.2:test (default-test) @ spring-cloud-aws-jdbc ---
[INFO]
[INFO] -------------------------------------------------------
[INFO]  T E S T S
[INFO] -------------------------------------------------------
[INFO] Running org.springframework.cloud.aws.jdbc.config.annotation.AmazonRdsInstanceConfigurationTest
Loading class `com.mysql.jdbc.Driver'. This is deprecated. The new driver class is `com.mysql.cj.jdbc.Driver'. The driver is automatically registered via the SPI and manual loading of the driver class is generally unnecessary.
Feb 19, 2022 12:34:21 PM org.apache.tomcat.jdbc.pool.ConnectionPool init
SEVERE: Unable to create initial connections of pool.
java.sql.SQLException: Access denied for user 'admin'@'localhost' (using password: YES)
        at com.mysql.cj.jdbc.exceptions.SQLError.createSQLException(SQLError.java:129)
        at com.mysql.cj.jdbc.exceptions.SQLError.createSQLException(SQLError.java:97)
        at com.mysql.cj.jdbc.exceptions.SQLExceptionsMapping.translateException(SQLExceptionsMapping.java:122)
        at com.mysql.cj.jdbc.ConnectionImpl.createNewIO(ConnectionImpl.java:836)
        at com.mysql.cj.jdbc.ConnectionImpl.<init>(ConnectionImpl.java:456)
        at com.mysql.cj.jdbc.ConnectionImpl.getInstance(ConnectionImpl.java:246)
        at com.mysql.cj.jdbc.NonRegisteringDriver.connect(NonRegisteringDriver.java:198)
        at org.apache.tomcat.jdbc.pool.PooledConnection.connectUsingDriver(PooledConnection.java:319)
        at org.apache.tomcat.jdbc.pool.PooledConnection.connect(PooledConnection.java:212)
        at org.apache.tomcat.jdbc.pool.ConnectionPool.createConnection(ConnectionPool.java:744)
        at org.apache.tomcat.jdbc.pool.ConnectionPool.borrowConnection(ConnectionPool.java:676)
        at org.apache.tomcat.jdbc.pool.ConnectionPool.init(ConnectionPool.java:483)
        at org.apache.tomcat.jdbc.pool.ConnectionPool.<init>(ConnectionPool.java:154)
        at org.apache.tomcat.jdbc.pool.DataSourceProxy.pCreatePool(DataSourceProxy.java:118)
        at org.apache.tomcat.jdbc.pool.DataSourceProxy.createPool(DataSourceProxy.java:107)
        at org.apache.tomcat.jdbc.pool.DataSourceProxy.getConnection(DataSourceProxy.java:131)
        at org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource.getConnection(AbstractRoutingDataSource.java:194)
        at org.springframework.jdbc.datasource.LazyConnectionDataSourceProxy.afterPropertiesSet(LazyConnectionDataSourceProxy.java:164)
        at org.springframework.jdbc.datasource.LazyConnectionDataSourceProxy.<init>(LazyConnectionDataSourceProxy.java:108)
        at org.springframework.cloud.aws.jdbc.rds.AmazonRdsReadReplicaAwareDataSourceFactoryBean.createInstance(AmazonRdsReadReplicaAwareDataSourceFactoryBean.java:94)
        at org.springframework.cloud.aws.jdbc.rds.AmazonRdsReadReplicaAwareDataSourceFactoryBean.createInstance(AmazonRdsReadReplicaAwareDataSourceFactoryBean.java:37)
        at org.springframework.beans.factory.config.AbstractFactoryBean.afterPropertiesSet(AbstractFactoryBean.java:142)
        at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.invokeInitMethods(AbstractAutowireCapableBeanFactory.java:1847)
        at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.initializeBean(AbstractAutowireCapableBeanFactory.java:1784)
        at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.doCreateBean(AbstractAutowireCapableBeanFactory.java:609)
        at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.createBean(AbstractAutowireCapableBeanFactory.java:531)
        at org.springframework.beans.factory.support.AbstractBeanFactory.lambda$doGetBean$0(AbstractBeanFactory.java:335)
        at org.springframework.beans.factory.support.DefaultSingletonBeanRegistry.getSingleton(DefaultSingletonBeanRegistry.java:234)
        at org.springframework.beans.factory.support.AbstractBeanFactory.doGetBean(AbstractBeanFactory.java:333)
        at org.springframework.beans.factory.support.AbstractBeanFactory.getBean(AbstractBeanFactory.java:208)
        at org.springframework.beans.factory.support.DefaultListableBeanFactory.preInstantiateSingletons(DefaultListableBeanFactory.java:925)
        at org.springframework.context.support.AbstractApplicationContext.finishBeanFactoryInitialization(AbstractApplicationContext.java:925)
        at org.springframework.context.support.AbstractApplicationContext.refresh(AbstractApplicationContext.java:588)
        at org.springframework.context.annotation.AnnotationConfigApplicationContext.<init>(AnnotationConfigApplicationContext.java:93)
        at org.springframework.cloud.aws.jdbc.config.annotation.AmazonRdsInstanceConfigurationTest.configureBean_withDefaultClientSpecifiedAndReadReplica_configuresFactoryBeanWithReadReplicaEnabled(AmazonRdsInstanceConfigurationTest.java:160)
        at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
        at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
        at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
        at java.lang.reflect.Method.invoke(Method.java:498)
        at org.junit.platform.commons.util.ReflectionUtils.invokeMethod(ReflectionUtils.java:688)
        at org.junit.jupiter.engine.execution.MethodInvocation.proceed(MethodInvocation.java:60)
        at org.junit.jupiter.engine.execution.InvocationInterceptorChain$ValidatingInvocation.proceed(InvocationInterceptorChain.java:131)
        at org.junit.jupiter.engine.extension.TimeoutExtension.intercept(TimeoutExtension.java:149)
        at org.junit.jupiter.engine.extension.TimeoutExtension.interceptTestableMethod(TimeoutExtension.java:140)
        at org.junit.jupiter.engine.extension.TimeoutExtension.interceptTestMethod(TimeoutExtension.java:84)
        at org.junit.jupiter.engine.execution.ExecutableInvoker$ReflectiveInterceptorCall.lambda$ofVoidMethod$0(ExecutableInvoker.java:115)
        at org.junit.jupiter.engine.execution.ExecutableInvoker.lambda$invoke$0(ExecutableInvoker.java:105)
        at org.junit.jupiter.engine.execution.InvocationInterceptorChain$InterceptedInvocation.proceed(InvocationInterceptorChain.java:106)
        at org.junit.jupiter.engine.execution.InvocationInterceptorChain.proceed(InvocationInterceptorChain.java:64)
        at org.junit.jupiter.engine.execution.InvocationInterceptorChain.chainAndInvoke(InvocationInterceptorChain.java:45)
        at org.junit.jupiter.engine.execution.InvocationInterceptorChain.invoke(InvocationInterceptorChain.java:37)
        at org.junit.jupiter.engine.execution.ExecutableInvoker.invoke(ExecutableInvoker.java:104)
        at org.junit.jupiter.engine.execution.ExecutableInvoker.invoke(ExecutableInvoker.java:98)
        at org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.lambda$invokeTestMethod$6(TestMethodTestDescriptor.java:210)
        at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
        at org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.invokeTestMethod(TestMethodTestDescriptor.java:206)
        at org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.execute(TestMethodTestDescriptor.java:131)
        at org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.execute(TestMethodTestDescriptor.java:65)
        at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$5(NodeTestTask.java:139)
        at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
        at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$7(NodeTestTask.java:129)
        at org.junit.platform.engine.support.hierarchical.Node.around(Node.java:137)
        at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$8(NodeTestTask.java:127)
        at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
        at org.junit.platform.engine.support.hierarchical.NodeTestTask.executeRecursively(NodeTestTask.java:126)
        at org.junit.platform.engine.support.hierarchical.NodeTestTask.execute(NodeTestTask.java:84)
        at java.util.ArrayList.forEach(ArrayList.java:1259)
        at org.junit.platform.engine.support.hierarchical.SameThreadHierarchicalTestExecutorService.invokeAll(SameThreadHierarchicalTestExecutorService.java:38)
        at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$5(NodeTestTask.java:143)
        at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
        at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$7(NodeTestTask.java:129)
        at org.junit.platform.engine.support.hierarchical.Node.around(Node.java:137)
        at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$8(NodeTestTask.java:127)
        at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
        at org.junit.platform.engine.support.hierarchical.NodeTestTask.executeRecursively(NodeTestTask.java:126)
        at org.junit.platform.engine.support.hierarchical.NodeTestTask.execute(NodeTestTask.java:84)
        at java.util.ArrayList.forEach(ArrayList.java:1259)
        at org.junit.platform.engine.support.hierarchical.SameThreadHierarchicalTestExecutorService.invokeAll(SameThreadHierarchicalTestExecutorService.java:38)
        at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$5(NodeTestTask.java:143)
        at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
        at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$7(NodeTestTask.java:129)
        at org.junit.platform.engine.support.hierarchical.Node.around(Node.java:137)
        at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$8(NodeTestTask.java:127)
        at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
        at org.junit.platform.engine.support.hierarchical.NodeTestTask.executeRecursively(NodeTestTask.java:126)
        at org.junit.platform.engine.support.hierarchical.NodeTestTask.execute(NodeTestTask.java:84)
        at org.junit.platform.engine.support.hierarchical.SameThreadHierarchicalTestExecutorService.submit(SameThreadHierarchicalTestExecutorService.java:32)
        at org.junit.platform.engine.support.hierarchical.HierarchicalTestExecutor.execute(HierarchicalTestExecutor.java:57)
        at org.junit.platform.engine.support.hierarchical.HierarchicalTestEngine.execute(HierarchicalTestEngine.java:51)
        at org.junit.platform.launcher.core.DefaultLauncher.execute(DefaultLauncher.java:220)
        at org.junit.platform.launcher.core.DefaultLauncher.lambda$execute$6(DefaultLauncher.java:188)
        at org.junit.platform.launcher.core.DefaultLauncher.withInterceptedStreams(DefaultLauncher.java:202)
        at org.junit.platform.launcher.core.DefaultLauncher.execute(DefaultLauncher.java:181)
        at org.junit.platform.launcher.core.DefaultLauncher.execute(DefaultLauncher.java:128)
        at org.apache.maven.surefire.junitplatform.JUnitPlatformProvider.invokeAllTests(JUnitPlatformProvider.java:150)
        at org.apache.maven.surefire.junitplatform.JUnitPlatformProvider.invoke(JUnitPlatformProvider.java:124)
        at org.apache.maven.surefire.booter.ForkedBooter.invokeProviderInSameClassLoader(ForkedBooter.java:384)
        at org.apache.maven.surefire.booter.ForkedBooter.runSuitesInProcess(ForkedBooter.java:345)
        at org.apache.maven.surefire.booter.ForkedBooter.execute(ForkedBooter.java:126)
        at org.apache.maven.surefire.booter.ForkedBooter.main(ForkedBooter.java:418)

[INFO] Tests run: 6, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 3.231 s - in org.springframework.cloud.aws.jdbc.config.annotation.AmazonRdsInstanceConfigurationTest
[INFO] Running org.springframework.cloud.aws.jdbc.config.xml.AmazonRdsDataSourceBeanDefinitionParserTest
[INFO] Tests run: 11, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 1.22 s - in org.springframework.cloud.aws.jdbc.config.xml.AmazonRdsDataSourceBeanDefinitionParserTest
[INFO] Running org.springframework.cloud.aws.jdbc.config.xml.AmazonRdsRetryInterceptorBeanDefinitionParserTest
[INFO] Tests run: 6, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.268 s - in org.springframework.cloud.aws.jdbc.config.xml.AmazonRdsRetryInterceptorBeanDefinitionParserTest
[INFO] Running org.springframework.cloud.aws.jdbc.config.xml.JdbcSchemaWithoutVersionTest
[INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.013 s - in org.springframework.cloud.aws.jdbc.config.xml.JdbcSchemaWithoutVersionTest
[INFO] Running org.springframework.cloud.aws.jdbc.datasource.ReadOnlyRoutingDataSourceTest
[INFO] Tests run: 4, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.057 s - in org.springframework.cloud.aws.jdbc.datasource.ReadOnlyRoutingDataSourceTest
[INFO] Running org.springframework.cloud.aws.jdbc.datasource.support.MapBasedDatabasePlatformSupportTest
[INFO] Tests run: 5, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.001 s - in org.springframework.cloud.aws.jdbc.datasource.support.MapBasedDatabasePlatformSupportTest
[INFO] Running org.springframework.cloud.aws.jdbc.datasource.TomcatJdbcDataSourceFactoryTest
[INFO] Tests run: 6, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.013 s - in org.springframework.cloud.aws.jdbc.datasource.TomcatJdbcDataSourceFactoryTest
[INFO] Running org.springframework.cloud.aws.jdbc.rds.AmazonRdsDataSourceFactoryBeanTest
[INFO] Tests run: 5, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.026 s - in org.springframework.cloud.aws.jdbc.rds.AmazonRdsDataSourceFactoryBeanTest
[INFO] Running org.springframework.cloud.aws.jdbc.rds.AmazonRdsDataSourceUserTagsFactoryBeanTest
[INFO] Tests run: 3, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.002 s - in org.springframework.cloud.aws.jdbc.rds.AmazonRdsDataSourceUserTagsFactoryBeanTest
[INFO] Running org.springframework.cloud.aws.jdbc.rds.AmazonRdsReadReplicaAwareDataSourceFactoryBeanTest
[INFO] Tests run: 2, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.001 s - in org.springframework.cloud.aws.jdbc.rds.AmazonRdsReadReplicaAwareDataSourceFactoryBeanTest
[INFO] Running org.springframework.cloud.aws.jdbc.retry.DatabaseInstanceStatusRetryPolicyTest
[INFO] Tests run: 5, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0 s - in org.springframework.cloud.aws.jdbc.retry.DatabaseInstanceStatusRetryPolicyTest
[INFO] Running org.springframework.cloud.aws.jdbc.retry.RdbmsRetryOperationsInterceptorTest
[INFO] Tests run: 3, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.025 s - in org.springframework.cloud.aws.jdbc.retry.RdbmsRetryOperationsInterceptorTest
[INFO] Running org.springframework.cloud.aws.jdbc.retry.SqlRetryPolicyTest
[INFO] Tests run: 4, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.001 s - in org.springframework.cloud.aws.jdbc.retry.SqlRetryPolicyTest
[INFO]
[INFO] Results:
[INFO]
[INFO] Tests run: 61, Failures: 0, Errors: 0, Skipped: 0
[INFO]
[INFO]
[INFO] --- maven-jar-plugin:3.2.0:jar (default-jar) @ spring-cloud-aws-jdbc ---
[INFO] Building jar: C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-jdbc\target\spring-cloud-aws-jdbc-3.0.0-SNAPSHOT.jar
[INFO]
[INFO] --- maven-javadoc-plugin:3.2.0:jar (javadoc) @ spring-cloud-aws-jdbc ---
[INFO] No previous run data found, generating javadoc.
[INFO]
Loading source file C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-jdbc\src\main\java\org\springframework\cloud\aws\jdbc\config\annotation\AmazonRdsInstanceConfiguration.java...
Loading source file C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-jdbc\src\main\java\org\springframework\cloud\aws\jdbc\config\annotation\EnableRdsInstance.java...
Loading source file C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-jdbc\src\main\java\org\springframework\cloud\aws\jdbc\config\annotation\RdsInstanceConfigurer.java...
Loading source file C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-jdbc\src\main\java\org\springframework\cloud\aws\jdbc\config\annotation\RdsInstanceConfigurerBeanPostProcessor.java...
Loading source file C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-jdbc\src\main\java\org\springframework\cloud\aws\jdbc\config\xml\AmazonRdsDataSourceBeanDefinitionParser.java...
Loading source file C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-jdbc\src\main\java\org\springframework\cloud\aws\jdbc\config\xml\AmazonRdsRetryInterceptorBeanDefinitionParser.java...
Loading source file C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-jdbc\src\main\java\org\springframework\cloud\aws\jdbc\config\xml\JdbcNamespaceHandler.java...
Loading source file C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-jdbc\src\main\java\org\springframework\cloud\aws\jdbc\datasource\DataSourceFactory.java...
Loading source file C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-jdbc\src\main\java\org\springframework\cloud\aws\jdbc\datasource\DataSourceInformation.java...
Loading source file C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-jdbc\src\main\java\org\springframework\cloud\aws\jdbc\datasource\ReadOnlyRoutingDataSource.java...
Loading source file C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-jdbc\src\main\java\org\springframework\cloud\aws\jdbc\datasource\support\DatabasePlatformSupport.java...
Loading source file C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-jdbc\src\main\java\org\springframework\cloud\aws\jdbc\datasource\support\DatabaseType.java...
Loading source file C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-jdbc\src\main\java\org\springframework\cloud\aws\jdbc\datasource\support\MapBasedDatabasePlatformSupport.java...
Loading source file C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-jdbc\src\main\java\org\springframework\cloud\aws\jdbc\datasource\support\StaticDatabasePlatformSupport.java...
Loading source file C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-jdbc\src\main\java\org\springframework\cloud\aws\jdbc\datasource\TomcatJdbcDataSourceFactory.java...
Loading source file C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-jdbc\src\main\java\org\springframework\cloud\aws\jdbc\rds\AmazonRdsDataSourceFactoryBean.java...
Loading source file C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-jdbc\src\main\java\org\springframework\cloud\aws\jdbc\rds\AmazonRdsDataSourceUserTagsFactoryBean.java...
Loading source file C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-jdbc\src\main\java\org\springframework\cloud\aws\jdbc\rds\AmazonRdsReadReplicaAwareDataSourceFactoryBean.java...
Loading source file C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-jdbc\src\main\java\org\springframework\cloud\aws\jdbc\retry\DatabaseInstanceStatusRetryPolicy.java...
Loading source file C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-jdbc\src\main\java\org\springframework\cloud\aws\jdbc\retry\InstanceStatus.java...
Loading source file C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-jdbc\src\main\java\org\springframework\cloud\aws\jdbc\retry\JdbcRetryException.java...
Loading source file C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-jdbc\src\main\java\org\springframework\cloud\aws\jdbc\retry\RdbmsRetryOperationsInterceptor.java...
Loading source file C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-jdbc\src\main\java\org\springframework\cloud\aws\jdbc\retry\SqlRetryPolicy.java...
Constructing Javadoc information...
Standard Doclet version 1.8.0_291
Building tree for all the packages and classes...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-jdbc\target\apidocs\org\springframework\cloud\aws\jdbc\datasource\DataSourceFactory.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-jdbc\target\apidocs\org\springframework\cloud\aws\jdbc\datasource\DataSourceInformation.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-jdbc\target\apidocs\org\springframework\cloud\aws\jdbc\datasource\ReadOnlyRoutingDataSource.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-jdbc\target\apidocs\org\springframework\cloud\aws\jdbc\datasource\TomcatJdbcDataSourceFactory.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-jdbc\target\apidocs\org\springframework\cloud\aws\jdbc\datasource\support\DatabasePlatformSupport.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-jdbc\target\apidocs\org\springframework\cloud\aws\jdbc\datasource\support\DatabaseType.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-jdbc\target\apidocs\org\springframework\cloud\aws\jdbc\datasource\support\MapBasedDatabasePlatformSupport.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-jdbc\target\apidocs\org\springframework\cloud\aws\jdbc\datasource\support\StaticDatabasePlatformSupport.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-jdbc\target\apidocs\org\springframework\cloud\aws\jdbc\rds\AmazonRdsDataSourceFactoryBean.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-jdbc\target\apidocs\org\springframework\cloud\aws\jdbc\rds\AmazonRdsDataSourceUserTagsFactoryBean.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-jdbc\target\apidocs\org\springframework\cloud\aws\jdbc\rds\AmazonRdsReadReplicaAwareDataSourceFactoryBean.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-jdbc\target\apidocs\org\springframework\cloud\aws\jdbc\retry\DatabaseInstanceStatusRetryPolicy.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-jdbc\target\apidocs\org\springframework\cloud\aws\jdbc\retry\InstanceStatus.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-jdbc\target\apidocs\org\springframework\cloud\aws\jdbc\retry\JdbcRetryException.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-jdbc\target\apidocs\org\springframework\cloud\aws\jdbc\retry\RdbmsRetryOperationsInterceptor.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-jdbc\target\apidocs\org\springframework\cloud\aws\jdbc\retry\SqlRetryPolicy.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-jdbc\target\apidocs\org\springframework\cloud\aws\jdbc\config\xml\JdbcNamespaceHandler.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-jdbc\target\apidocs\org\springframework\cloud\aws\jdbc\config\annotation\AmazonRdsInstanceConfiguration.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-jdbc\target\apidocs\org\springframework\cloud\aws\jdbc\config\annotation\AmazonRdsInstanceConfiguration.AbstractRegistrar.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-jdbc\target\apidocs\org\springframework\cloud\aws\jdbc\config\annotation\AmazonRdsInstanceConfiguration.Registrar.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-jdbc\target\apidocs\org\springframework\cloud\aws\jdbc\config\annotation\EnableRdsInstance.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-jdbc\target\apidocs\org\springframework\cloud\aws\jdbc\config\annotation\RdsInstanceConfigurer.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-jdbc\target\apidocs\org\springframework\cloud\aws\jdbc\config\annotation\RdsInstanceConfigurerBeanPostProcessor.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-jdbc\target\apidocs\overview-frame.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-jdbc\target\apidocs\org\springframework\cloud\aws\jdbc\config\annotation\package-frame.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-jdbc\target\apidocs\org\springframework\cloud\aws\jdbc\config\annotation\package-summary.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-jdbc\target\apidocs\org\springframework\cloud\aws\jdbc\config\annotation\package-tree.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-jdbc\target\apidocs\org\springframework\cloud\aws\jdbc\config\xml\package-frame.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-jdbc\target\apidocs\org\springframework\cloud\aws\jdbc\config\xml\package-summary.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-jdbc\target\apidocs\org\springframework\cloud\aws\jdbc\config\xml\package-tree.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-jdbc\target\apidocs\org\springframework\cloud\aws\jdbc\datasource\package-frame.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-jdbc\target\apidocs\org\springframework\cloud\aws\jdbc\datasource\package-summary.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-jdbc\target\apidocs\org\springframework\cloud\aws\jdbc\datasource\package-tree.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-jdbc\target\apidocs\org\springframework\cloud\aws\jdbc\datasource\support\package-frame.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-jdbc\target\apidocs\org\springframework\cloud\aws\jdbc\datasource\support\package-summary.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-jdbc\target\apidocs\org\springframework\cloud\aws\jdbc\datasource\support\package-tree.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-jdbc\target\apidocs\org\springframework\cloud\aws\jdbc\rds\package-frame.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-jdbc\target\apidocs\org\springframework\cloud\aws\jdbc\rds\package-summary.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-jdbc\target\apidocs\org\springframework\cloud\aws\jdbc\rds\package-tree.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-jdbc\target\apidocs\org\springframework\cloud\aws\jdbc\retry\package-frame.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-jdbc\target\apidocs\org\springframework\cloud\aws\jdbc\retry\package-summary.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-jdbc\target\apidocs\org\springframework\cloud\aws\jdbc\retry\package-tree.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-jdbc\target\apidocs\constant-values.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-jdbc\target\apidocs\serialized-form.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-jdbc\target\apidocs\org\springframework\cloud\aws\jdbc\config\annotation\class-use\AmazonRdsInstanceConfiguration.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-jdbc\target\apidocs\org\springframework\cloud\aws\jdbc\config\annotation\class-use\AmazonRdsInstanceConfiguration.AbstractRegistrar.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-jdbc\target\apidocs\org\springframework\cloud\aws\jdbc\config\annotation\class-use\AmazonRdsInstanceConfiguration.Registrar.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-jdbc\target\apidocs\org\springframework\cloud\aws\jdbc\config\annotation\class-use\EnableRdsInstance.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-jdbc\target\apidocs\org\springframework\cloud\aws\jdbc\config\annotation\class-use\RdsInstanceConfigurer.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-jdbc\target\apidocs\org\springframework\cloud\aws\jdbc\config\annotation\class-use\RdsInstanceConfigurerBeanPostProcessor.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-jdbc\target\apidocs\org\springframework\cloud\aws\jdbc\config\xml\class-use\JdbcNamespaceHandler.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-jdbc\target\apidocs\org\springframework\cloud\aws\jdbc\datasource\class-use\DataSourceFactory.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-jdbc\target\apidocs\org\springframework\cloud\aws\jdbc\datasource\class-use\DataSourceInformation.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-jdbc\target\apidocs\org\springframework\cloud\aws\jdbc\datasource\class-use\ReadOnlyRoutingDataSource.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-jdbc\target\apidocs\org\springframework\cloud\aws\jdbc\datasource\support\class-use\DatabasePlatformSupport.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-jdbc\target\apidocs\org\springframework\cloud\aws\jdbc\datasource\support\class-use\DatabaseType.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-jdbc\target\apidocs\org\springframework\cloud\aws\jdbc\datasource\support\class-use\MapBasedDatabasePlatformSupport.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-jdbc\target\apidocs\org\springframework\cloud\aws\jdbc\datasource\support\class-use\StaticDatabasePlatformSupport.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-jdbc\target\apidocs\org\springframework\cloud\aws\jdbc\datasource\class-use\TomcatJdbcDataSourceFactory.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-jdbc\target\apidocs\org\springframework\cloud\aws\jdbc\rds\class-use\AmazonRdsDataSourceFactoryBean.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-jdbc\target\apidocs\org\springframework\cloud\aws\jdbc\rds\class-use\AmazonRdsDataSourceUserTagsFactoryBean.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-jdbc\target\apidocs\org\springframework\cloud\aws\jdbc\rds\class-use\AmazonRdsReadReplicaAwareDataSourceFactoryBean.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-jdbc\target\apidocs\org\springframework\cloud\aws\jdbc\retry\class-use\DatabaseInstanceStatusRetryPolicy.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-jdbc\target\apidocs\org\springframework\cloud\aws\jdbc\retry\class-use\InstanceStatus.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-jdbc\target\apidocs\org\springframework\cloud\aws\jdbc\retry\class-use\JdbcRetryException.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-jdbc\target\apidocs\org\springframework\cloud\aws\jdbc\retry\class-use\RdbmsRetryOperationsInterceptor.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-jdbc\target\apidocs\org\springframework\cloud\aws\jdbc\retry\class-use\SqlRetryPolicy.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-jdbc\target\apidocs\org\springframework\cloud\aws\jdbc\config\annotation\package-use.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-jdbc\target\apidocs\org\springframework\cloud\aws\jdbc\config\xml\package-use.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-jdbc\target\apidocs\org\springframework\cloud\aws\jdbc\datasource\package-use.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-jdbc\target\apidocs\org\springframework\cloud\aws\jdbc\datasource\support\package-use.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-jdbc\target\apidocs\org\springframework\cloud\aws\jdbc\rds\package-use.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-jdbc\target\apidocs\org\springframework\cloud\aws\jdbc\retry\package-use.html...
Building index for all the packages and classes...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-jdbc\target\apidocs\overview-tree.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-jdbc\target\apidocs\index-all.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-jdbc\target\apidocs\deprecated-list.html...
Building index for all classes...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-jdbc\target\apidocs\allclasses-frame.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-jdbc\target\apidocs\allclasses-noframe.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-jdbc\target\apidocs\index.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-jdbc\target\apidocs\overview-summary.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-jdbc\target\apidocs\help-doc.html...
[INFO] Building jar: C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-jdbc\target\spring-cloud-aws-jdbc-3.0.0-SNAPSHOT-javadoc.jar
[INFO]
[INFO] >>> maven-source-plugin:3.2.1:jar (attach-sources) > generate-sources @ spring-cloud-aws-jdbc >>>
[INFO]
[INFO] --- maven-checkstyle-plugin:3.1.0:check (checkstyle-validation) @ spring-cloud-aws-jdbc ---
[INFO] Starting audit...
Audit done.
[INFO]
[INFO] --- maven-checkstyle-plugin:3.1.0:check (no-http-checkstyle-validation) @ spring-cloud-aws-jdbc ---
[INFO]
[INFO] --- spring-javaformat-maven-plugin:0.0.25:validate (default) @ spring-cloud-aws-jdbc ---
[INFO]
[INFO] --- spring-javaformat-maven-plugin:0.0.25:apply (default) @ spring-cloud-aws-jdbc ---
[INFO]
[INFO] <<< maven-source-plugin:3.2.1:jar (attach-sources) < generate-sources @ spring-cloud-aws-jdbc <<<
[INFO]
[INFO]
[INFO] --- maven-source-plugin:3.2.1:jar (attach-sources) @ spring-cloud-aws-jdbc ---
[INFO] Building jar: C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-jdbc\target\spring-cloud-aws-jdbc-3.0.0-SNAPSHOT-sources.jar
[INFO]
[INFO] --------< org.springframework.cloud:spring-cloud-aws-messaging >--------
[INFO] Building Spring Cloud AWS Messaging 3.0.0-SNAPSHOT                [6/18]
[INFO] --------------------------------[ jar ]---------------------------------
Downloading from spring-milestones: https://repo.spring.io/libs-milestone-local/com/amazonaws/aws-java-sdk-sns/1.11.907/aws-java-sdk-sns-1.11.907.pom
Downloading from spring-releases: https://repo.spring.io/release/com/amazonaws/aws-java-sdk-sns/1.11.907/aws-java-sdk-sns-1.11.907.pom
Downloading from spring-plugins: https://repo.spring.io/plugins/com/amazonaws/aws-java-sdk-sns/1.11.907/aws-java-sdk-sns-1.11.907.pom
Downloading from central: https://repo.maven.apache.org/maven2/com/amazonaws/aws-java-sdk-sns/1.11.907/aws-java-sdk-sns-1.11.907.pom
Downloaded from central: https://repo.maven.apache.org/maven2/com/amazonaws/aws-java-sdk-sns/1.11.907/aws-java-sdk-sns-1.11.907.pom (3.8 kB at 47 kB/s)
Downloading from spring-milestones: https://repo.spring.io/libs-milestone-local/com/amazonaws/aws-java-sdk-sqs/1.11.907/aws-java-sdk-sqs-1.11.907.pom
Downloading from spring-releases: https://repo.spring.io/release/com/amazonaws/aws-java-sdk-sqs/1.11.907/aws-java-sdk-sqs-1.11.907.pom
Downloading from spring-plugins: https://repo.spring.io/plugins/com/amazonaws/aws-java-sdk-sqs/1.11.907/aws-java-sdk-sqs-1.11.907.pom
Downloading from central: https://repo.maven.apache.org/maven2/com/amazonaws/aws-java-sdk-sqs/1.11.907/aws-java-sdk-sqs-1.11.907.pom
Downloaded from central: https://repo.maven.apache.org/maven2/com/amazonaws/aws-java-sdk-sqs/1.11.907/aws-java-sdk-sqs-1.11.907.pom (3.5 kB at 18 kB/s)
Downloading from spring-milestones: https://repo.spring.io/libs-milestone-local/org/springframework/spring-messaging/5.3.1/spring-messaging-5.3.1.pom
Downloading from spring-releases: https://repo.spring.io/release/org/springframework/spring-messaging/5.3.1/spring-messaging-5.3.1.pom
Downloaded from spring-releases: https://repo.spring.io/release/org/springframework/spring-messaging/5.3.1/spring-messaging-5.3.1.pom (2.2 kB at 5.4 kB/s)
Downloading from spring-milestones: https://repo.spring.io/libs-milestone-local/org/springframework/spring-web/5.3.1/spring-web-5.3.1.pom
Downloading from spring-releases: https://repo.spring.io/release/org/springframework/spring-web/5.3.1/spring-web-5.3.1.pom
Downloaded from spring-releases: https://repo.spring.io/release/org/springframework/spring-web/5.3.1/spring-web-5.3.1.pom (2.2 kB at 4.2 kB/s)
Downloading from spring-milestones: https://repo.spring.io/libs-milestone-local/org/springframework/spring-webmvc/5.3.1/spring-webmvc-5.3.1.pom
Downloading from spring-releases: https://repo.spring.io/release/org/springframework/spring-webmvc/5.3.1/spring-webmvc-5.3.1.pom
Downloaded from spring-releases: https://repo.spring.io/release/org/springframework/spring-webmvc/5.3.1/spring-webmvc-5.3.1.pom (2.9 kB at 6.9 kB/s)
Downloading from spring-milestones: https://repo.spring.io/libs-milestone-local/com/amazonaws/aws-java-sdk-sns/1.11.907/aws-java-sdk-sns-1.11.907.jar
Downloading from spring-milestones: https://repo.spring.io/libs-milestone-local/org/springframework/spring-webmvc/5.3.1/spring-webmvc-5.3.1.jar
Downloading from spring-milestones: https://repo.spring.io/libs-milestone-local/org/springframework/spring-web/5.3.1/spring-web-5.3.1.jar
Downloading from spring-milestones: https://repo.spring.io/libs-milestone-local/org/springframework/spring-messaging/5.3.1/spring-messaging-5.3.1.jar
Downloading from spring-milestones: https://repo.spring.io/libs-milestone-local/com/amazonaws/aws-java-sdk-sqs/1.11.907/aws-java-sdk-sqs-1.11.907.jar
Downloading from spring-releases: https://repo.spring.io/release/com/amazonaws/aws-java-sdk-sns/1.11.907/aws-java-sdk-sns-1.11.907.jar
Downloading from spring-releases: https://repo.spring.io/release/org/springframework/spring-webmvc/5.3.1/spring-webmvc-5.3.1.jar
Downloading from spring-releases: https://repo.spring.io/release/org/springframework/spring-web/5.3.1/spring-web-5.3.1.jar
Downloading from spring-releases: https://repo.spring.io/release/org/springframework/spring-messaging/5.3.1/spring-messaging-5.3.1.jar
Downloading from spring-releases: https://repo.spring.io/release/com/amazonaws/aws-java-sdk-sqs/1.11.907/aws-java-sdk-sqs-1.11.907.jar
Downloaded from spring-releases: https://repo.spring.io/release/org/springframework/spring-messaging/5.3.1/spring-messaging-5.3.1.jar (553 kB at 212 kB/s)
Downloaded from spring-releases: https://repo.spring.io/release/org/springframework/spring-webmvc/5.3.1/spring-webmvc-5.3.1.jar (990 kB at 169 kB/s)
Downloaded from spring-releases: https://repo.spring.io/release/org/springframework/spring-web/5.3.1/spring-web-5.3.1.jar (1.5 MB at 182 kB/s)
Downloading from spring-plugins: https://repo.spring.io/plugins/com/amazonaws/aws-java-sdk-sns/1.11.907/aws-java-sdk-sns-1.11.907.jar
Downloading from spring-plugins: https://repo.spring.io/plugins/com/amazonaws/aws-java-sdk-sqs/1.11.907/aws-java-sdk-sqs-1.11.907.jar
Downloading from central: https://repo.maven.apache.org/maven2/com/amazonaws/aws-java-sdk-sns/1.11.907/aws-java-sdk-sns-1.11.907.jar
Downloading from central: https://repo.maven.apache.org/maven2/com/amazonaws/aws-java-sdk-sqs/1.11.907/aws-java-sdk-sqs-1.11.907.jar
Downloaded from central: https://repo.maven.apache.org/maven2/com/amazonaws/aws-java-sdk-sqs/1.11.907/aws-java-sdk-sqs-1.11.907.jar (325 kB at 419 kB/s)
Downloaded from central: https://repo.maven.apache.org/maven2/com/amazonaws/aws-java-sdk-sns/1.11.907/aws-java-sdk-sns-1.11.907.jar (370 kB at 442 kB/s)
[INFO]
[INFO] --- maven-clean-plugin:2.5:clean (default-clean) @ spring-cloud-aws-messaging ---
[INFO]
[INFO] --- maven-checkstyle-plugin:3.1.0:check (checkstyle-validation) @ spring-cloud-aws-messaging ---
[INFO] Starting audit...
Audit done.
[INFO]
[INFO] --- maven-checkstyle-plugin:3.1.0:check (no-http-checkstyle-validation) @ spring-cloud-aws-messaging ---
[INFO]
[INFO] --- spring-javaformat-maven-plugin:0.0.25:validate (default) @ spring-cloud-aws-messaging ---
[INFO]
[INFO] --- spring-javaformat-maven-plugin:0.0.25:apply (default) @ spring-cloud-aws-messaging ---
[INFO]
[INFO] --- maven-resources-plugin:3.1.0:resources (default-resources) @ spring-cloud-aws-messaging ---
[INFO] Using 'UTF-8' encoding to copy filtered resources.
[INFO] Copying 0 resource
[INFO] Copying 4 resources
[INFO]
[INFO] --- maven-compiler-plugin:3.8.1:compile (default-compile) @ spring-cloud-aws-messaging ---
[INFO] Changes detected - recompiling the module!
[INFO] Compiling 56 source files to C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-messaging\target\classes
[WARNING] /C:/Users/jstupar/my_spring_cloud_aws/spring-cloud-aws/spring-cloud-aws-messaging/src/main/java/org/springframework/cloud/aws/messaging/config/xml/BufferedSqsClientBeanDefinitionUtils.java:[24,53] org.springframework.cloud.aws.core.config.xml.XmlWebserviceConfigurationUtils in org.springframework.cloud.aws.core.config.xml has been deprecated
[WARNING] /C:/Users/jstupar/my_spring_cloud_aws/spring-cloud-aws/spring-cloud-aws-messaging/src/main/java/org/springframework/cloud/aws/messaging/listener/QueueMessageHandler.java:[52,64] org.springframework.messaging.handler.annotation.support.PayloadArgumentResolver in org.springframework.messaging.handler.annotation.support has been deprecated
[WARNING] /C:/Users/jstupar/my_spring_cloud_aws/spring-cloud-aws/spring-cloud-aws-messaging/src/main/java/org/springframework/cloud/aws/messaging/config/xml/QueueMessagingTemplateBeanDefinitionParser.java:[28,65] org.springframework.cloud.aws.messaging.config.xml.BufferedSqsClientBeanDefinitionUtils in org.springframework.cloud.aws.messaging.config.xml has been deprecated
[WARNING] /C:/Users/jstupar/my_spring_cloud_aws/spring-cloud-aws/spring-cloud-aws-messaging/src/main/java/org/springframework/cloud/aws/messaging/config/xml/NotificationMessagingTemplateBeanDefinitionParser.java:[28,60] org.springframework.cloud.aws.core.config.xml.XmlWebserviceConfigurationUtils in org.springframework.cloud.aws.core.config.xml has been deprecated
[WARNING] /C:/Users/jstupar/my_spring_cloud_aws/spring-cloud-aws/spring-cloud-aws-messaging/src/main/java/org/springframework/cloud/aws/messaging/config/xml/AnnotationDrivenQueueListenerBeanDefinitionParser.java:[37,65] org.springframework.cloud.aws.messaging.config.xml.BufferedSqsClientBeanDefinitionUtils in org.springframework.cloud.aws.messaging.config.xml has been deprecated
[WARNING] /C:/Users/jstupar/my_spring_cloud_aws/spring-cloud-aws/spring-cloud-aws-messaging/src/main/java/org/springframework/cloud/aws/messaging/config/xml/SqsAsyncClientBeanDefinitionParser.java:[28,60] org.springframework.cloud.aws.core.config.xml.XmlWebserviceConfigurationUtils in org.springframework.cloud.aws.core.config.xml has been deprecated
[WARNING] /C:/Users/jstupar/my_spring_cloud_aws/spring-cloud-aws/spring-cloud-aws-messaging/src/main/java/org/springframework/cloud/aws/messaging/config/xml/NotificationArgumentResolverBeanDefinitionParser.java:[25,60] org.springframework.cloud.aws.core.config.xml.XmlWebserviceConfigurationUtils in org.springframework.cloud.aws.core.config.xml has been deprecated
[WARNING] /C:/Users/jstupar/my_spring_cloud_aws/spring-cloud-aws/spring-cloud-aws-messaging/src/main/java/org/springframework/cloud/aws/messaging/listener/QueueMessageHandler.java:[116,35] org.springframework.messaging.handler.annotation.support.PayloadArgumentResolver in org.springframework.messaging.handler.annotation.support has been deprecated
[WARNING] /C:/Users/jstupar/my_spring_cloud_aws/spring-cloud-aws/spring-cloud-aws-messaging/src/main/java/org/springframework/cloud/aws/messaging/endpoint/NotificationMessageHandlerMethodArgumentResolver.java:[92,47] HttpMessageNotReadableException(java.lang.String,java.lang.Throwable) in org.springframework.http.converter.HttpMessageNotReadableException has been deprecated
[WARNING] /C:/Users/jstupar/my_spring_cloud_aws/spring-cloud-aws/spring-cloud-aws-messaging/src/main/java/org/springframework/cloud/aws/messaging/endpoint/NotificationMessageHandlerMethodArgumentResolver.java:[98,23] HttpMessageNotReadableException(java.lang.String) in org.springframework.http.converter.HttpMessageNotReadableException has been deprecated
[INFO]
[INFO] --- maven-resources-plugin:3.1.0:testResources (default-testResources) @ spring-cloud-aws-messaging ---
[INFO] Using 'UTF-8' encoding to copy filtered resources.
[INFO] Copying 42 resources
[INFO]
[INFO] --- maven-compiler-plugin:3.8.1:testCompile (default-testCompile) @ spring-cloud-aws-messaging ---
[INFO] Changes detected - recompiling the module!
[INFO] Compiling 36 source files to C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-messaging\target\test-classes
[WARNING] /C:/Users/jstupar/my_spring_cloud_aws/spring-cloud-aws/spring-cloud-aws-messaging/src/test/java/org/springframework/cloud/aws/messaging/config/annotation/SqsConfigurationTest.java:[32,63] org.springframework.cloud.aws.context.config.annotation.EnableContextRegion in org.springframework.cloud.aws.context.config.annotation has been deprecated
[WARNING] /C:/Users/jstupar/my_spring_cloud_aws/spring-cloud-aws/spring-cloud-aws-messaging/src/test/java/org/springframework/cloud/aws/messaging/endpoint/NotificationEndpointControllerTest.java:[26,65] org.springframework.cloud.aws.messaging.config.annotation.EnableSns in org.springframework.cloud.aws.messaging.config.annotation has been deprecated
[WARNING] /C:/Users/jstupar/my_spring_cloud_aws/spring-cloud-aws/spring-cloud-aws-messaging/src/test/java/org/springframework/cloud/aws/messaging/endpoint/ComplexNotificationEndpointControllerTest.java:[26,65] org.springframework.cloud.aws.messaging.config.annotation.EnableSns in org.springframework.cloud.aws.messaging.config.annotation has been deprecated
[WARNING] /C:/Users/jstupar/my_spring_cloud_aws/spring-cloud-aws/spring-cloud-aws-messaging/src/test/java/org/springframework/cloud/aws/messaging/listener/SimpleMessageListenerContainerTest.java:[53,65] org.springframework.cloud.aws.messaging.config.annotation.EnableSqs in org.springframework.cloud.aws.messaging.config.annotation has been deprecated
[WARNING] /C:/Users/jstupar/my_spring_cloud_aws/spring-cloud-aws/spring-cloud-aws-messaging/src/test/java/org/springframework/cloud/aws/messaging/config/annotation/SnsConfigurationTest.java:[28,63] org.springframework.cloud.aws.context.config.annotation.EnableContextRegion in org.springframework.cloud.aws.context.config.annotation has been deprecated
[WARNING] /C:/Users/jstupar/my_spring_cloud_aws/spring-cloud-aws/spring-cloud-aws-messaging/src/test/java/org/springframework/cloud/aws/messaging/config/annotation/SqsConfigurationTest.java:[226,106] unchecked cast
  required: java.util.List<org.springframework.messaging.converter.MessageConverter>
  found:    java.lang.Object
[WARNING] /C:/Users/jstupar/my_spring_cloud_aws/spring-cloud-aws/spring-cloud-aws-messaging/src/test/java/org/springframework/cloud/aws/messaging/config/annotation/SqsConfigurationTest.java:[264,10] org.springframework.cloud.aws.messaging.config.annotation.EnableSqs in org.springframework.cloud.aws.messaging.config.annotation has been deprecated
[WARNING] /C:/Users/jstupar/my_spring_cloud_aws/spring-cloud-aws/spring-cloud-aws-messaging/src/test/java/org/springframework/cloud/aws/messaging/config/annotation/SqsConfigurationTest.java:[275,10] org.springframework.cloud.aws.messaging.config.annotation.EnableSqs in org.springframework.cloud.aws.messaging.config.annotation has been deprecated
[WARNING] /C:/Users/jstupar/my_spring_cloud_aws/spring-cloud-aws/spring-cloud-aws-messaging/src/test/java/org/springframework/cloud/aws/messaging/config/annotation/SqsConfigurationTest.java:[293,10] org.springframework.cloud.aws.messaging.config.annotation.EnableSqs in org.springframework.cloud.aws.messaging.config.annotation has been deprecated
[WARNING] /C:/Users/jstupar/my_spring_cloud_aws/spring-cloud-aws/spring-cloud-aws-messaging/src/test/java/org/springframework/cloud/aws/messaging/config/annotation/SqsConfigurationTest.java:[320,10] org.springframework.cloud.aws.messaging.config.annotation.EnableSqs in org.springframework.cloud.aws.messaging.config.annotation has been deprecated
[WARNING] /C:/Users/jstupar/my_spring_cloud_aws/spring-cloud-aws/spring-cloud-aws-messaging/src/test/java/org/springframework/cloud/aws/messaging/config/annotation/SqsConfigurationTest.java:[347,10] org.springframework.cloud.aws.messaging.config.annotation.EnableSqs in org.springframework.cloud.aws.messaging.config.annotation has been deprecated
[WARNING] /C:/Users/jstupar/my_spring_cloud_aws/spring-cloud-aws/spring-cloud-aws-messaging/src/test/java/org/springframework/cloud/aws/messaging/config/annotation/SqsConfigurationTest.java:[405,10] org.springframework.cloud.aws.messaging.config.annotation.EnableSqs in org.springframework.cloud.aws.messaging.config.annotation has been deprecated
[WARNING] /C:/Users/jstupar/my_spring_cloud_aws/spring-cloud-aws/spring-cloud-aws-messaging/src/test/java/org/springframework/cloud/aws/messaging/config/annotation/SqsConfigurationTest.java:[422,10] org.springframework.cloud.aws.messaging.config.annotation.EnableSqs in org.springframework.cloud.aws.messaging.config.annotation has been deprecated
[WARNING] /C:/Users/jstupar/my_spring_cloud_aws/spring-cloud-aws/spring-cloud-aws-messaging/src/test/java/org/springframework/cloud/aws/messaging/config/annotation/SqsConfigurationTest.java:[428,10] org.springframework.cloud.aws.messaging.config.annotation.EnableSqs in org.springframework.cloud.aws.messaging.config.annotation has been deprecated
[WARNING] /C:/Users/jstupar/my_spring_cloud_aws/spring-cloud-aws/spring-cloud-aws-messaging/src/test/java/org/springframework/cloud/aws/messaging/config/annotation/SqsConfigurationTest.java:[429,10] org.springframework.cloud.aws.context.config.annotation.EnableContextRegion in org.springframework.cloud.aws.context.config.annotation has been deprecated
[WARNING] /C:/Users/jstupar/my_spring_cloud_aws/spring-cloud-aws/spring-cloud-aws-messaging/src/test/java/org/springframework/cloud/aws/messaging/config/annotation/SqsConfigurationTest.java:[435,10] org.springframework.cloud.aws.messaging.config.annotation.EnableSqs in org.springframework.cloud.aws.messaging.config.annotation has been deprecated
[WARNING] /C:/Users/jstupar/my_spring_cloud_aws/spring-cloud-aws/spring-cloud-aws-messaging/src/test/java/org/springframework/cloud/aws/messaging/config/annotation/SqsConfigurationTest.java:[436,10] org.springframework.cloud.aws.context.config.annotation.EnableContextRegion in org.springframework.cloud.aws.context.config.annotation has been deprecated
[WARNING] /C:/Users/jstupar/my_spring_cloud_aws/spring-cloud-aws/spring-cloud-aws-messaging/src/test/java/org/springframework/cloud/aws/messaging/endpoint/NotificationEndpointControllerTest.java:[124,10] org.springframework.cloud.aws.messaging.config.annotation.EnableSns in org.springframework.cloud.aws.messaging.config.annotation has been deprecated
[WARNING] /C:/Users/jstupar/my_spring_cloud_aws/spring-cloud-aws/spring-cloud-aws-messaging/src/test/java/org/springframework/cloud/aws/messaging/endpoint/ComplexNotificationEndpointControllerTest.java:[147,10] org.springframework.cloud.aws.messaging.config.annotation.EnableSns in org.springframework.cloud.aws.messaging.config.annotation has been deprecated
[WARNING] /C:/Users/jstupar/my_spring_cloud_aws/spring-cloud-aws/spring-cloud-aws-messaging/src/test/java/org/springframework/cloud/aws/messaging/listener/SimpleMessageListenerContainerTest.java:[137,17] initMocks(java.lang.Object) in org.mockito.MockitoAnnotations has been deprecated
[WARNING] /C:/Users/jstupar/my_spring_cloud_aws/spring-cloud-aws/spring-cloud-aws-messaging/src/test/java/org/springframework/cloud/aws/messaging/listener/SimpleMessageListenerContainerTest.java:[554,57] unchecked method invocation: method deleteMessageAsync in interface com.amazonaws.services.sqs.AmazonSQSAsync is applied to given types
  required: com.amazonaws.services.sqs.model.DeleteMessageRequest,com.amazonaws.handlers.AsyncHandler<com.amazonaws.services.sqs.model.DeleteMessageRequest,com.amazonaws.services.sqs.model.DeleteMessageResult>
  found: com.amazonaws.services.sqs.model.DeleteMessageRequest,com.amazonaws.handlers.AsyncHandler
[WARNING] /C:/Users/jstupar/my_spring_cloud_aws/spring-cloud-aws/spring-cloud-aws-messaging/src/test/java/org/springframework/cloud/aws/messaging/listener/SimpleMessageListenerContainerTest.java:[556,55] unchecked conversion
  required: com.amazonaws.handlers.AsyncHandler<com.amazonaws.services.sqs.model.DeleteMessageRequest,com.amazonaws.services.sqs.model.DeleteMessageResult>
  found:    com.amazonaws.handlers.AsyncHandler
[WARNING] /C:/Users/jstupar/my_spring_cloud_aws/spring-cloud-aws/spring-cloud-aws-messaging/src/test/java/org/springframework/cloud/aws/messaging/listener/SimpleMessageListenerContainerTest.java:[606,52] unchecked method invocation: method deleteMessageAsync in interface com.amazonaws.services.sqs.AmazonSQSAsync is applied to given types
  required: com.amazonaws.services.sqs.model.DeleteMessageRequest,com.amazonaws.handlers.AsyncHandler<com.amazonaws.services.sqs.model.DeleteMessageRequest,com.amazonaws.services.sqs.model.DeleteMessageResult>
  found: com.amazonaws.services.sqs.model.DeleteMessageRequest,com.amazonaws.handlers.AsyncHandler
[WARNING] /C:/Users/jstupar/my_spring_cloud_aws/spring-cloud-aws/spring-cloud-aws-messaging/src/test/java/org/springframework/cloud/aws/messaging/listener/SimpleMessageListenerContainerTest.java:[609,71] unchecked conversion
  required: com.amazonaws.handlers.AsyncHandler<com.amazonaws.services.sqs.model.DeleteMessageRequest,com.amazonaws.services.sqs.model.DeleteMessageResult>
  found:    com.amazonaws.handlers.AsyncHandler
[WARNING] /C:/Users/jstupar/my_spring_cloud_aws/spring-cloud-aws/spring-cloud-aws-messaging/src/test/java/org/springframework/cloud/aws/messaging/listener/SimpleMessageListenerContainerTest.java:[659,52] unchecked method invocation: method deleteMessageAsync in interface com.amazonaws.services.sqs.AmazonSQSAsync is applied to given types
  required: com.amazonaws.services.sqs.model.DeleteMessageRequest,com.amazonaws.handlers.AsyncHandler<com.amazonaws.services.sqs.model.DeleteMessageRequest,com.amazonaws.services.sqs.model.DeleteMessageResult>
  found: com.amazonaws.services.sqs.model.DeleteMessageRequest,com.amazonaws.handlers.AsyncHandler
[WARNING] /C:/Users/jstupar/my_spring_cloud_aws/spring-cloud-aws/spring-cloud-aws-messaging/src/test/java/org/springframework/cloud/aws/messaging/listener/SimpleMessageListenerContainerTest.java:[662,71] unchecked conversion
  required: com.amazonaws.handlers.AsyncHandler<com.amazonaws.services.sqs.model.DeleteMessageRequest,com.amazonaws.services.sqs.model.DeleteMessageResult>
  found:    com.amazonaws.handlers.AsyncHandler
[WARNING] /C:/Users/jstupar/my_spring_cloud_aws/spring-cloud-aws/spring-cloud-aws-messaging/src/test/java/org/springframework/cloud/aws/messaging/listener/SimpleMessageListenerContainerTest.java:[768,52] unchecked method invocation: method deleteMessageAsync in interface com.amazonaws.services.sqs.AmazonSQSAsync is applied to given types
  required: com.amazonaws.services.sqs.model.DeleteMessageRequest,com.amazonaws.handlers.AsyncHandler<com.amazonaws.services.sqs.model.DeleteMessageRequest,com.amazonaws.services.sqs.model.DeleteMessageResult>
  found: com.amazonaws.services.sqs.model.DeleteMessageRequest,com.amazonaws.handlers.AsyncHandler
[WARNING] /C:/Users/jstupar/my_spring_cloud_aws/spring-cloud-aws/spring-cloud-aws-messaging/src/test/java/org/springframework/cloud/aws/messaging/listener/SimpleMessageListenerContainerTest.java:[771,71] unchecked conversion
  required: com.amazonaws.handlers.AsyncHandler<com.amazonaws.services.sqs.model.DeleteMessageRequest,com.amazonaws.services.sqs.model.DeleteMessageResult>
  found:    com.amazonaws.handlers.AsyncHandler
[WARNING] /C:/Users/jstupar/my_spring_cloud_aws/spring-cloud-aws/spring-cloud-aws-messaging/src/test/java/org/springframework/cloud/aws/messaging/listener/SimpleMessageListenerContainerTest.java:[777,52] unchecked method invocation: method deleteMessageAsync in interface com.amazonaws.services.sqs.AmazonSQSAsync is applied to given types
  required: com.amazonaws.services.sqs.model.DeleteMessageRequest,com.amazonaws.handlers.AsyncHandler<com.amazonaws.services.sqs.model.DeleteMessageRequest,com.amazonaws.services.sqs.model.DeleteMessageResult>
  found: com.amazonaws.services.sqs.model.DeleteMessageRequest,com.amazonaws.handlers.AsyncHandler
[WARNING] /C:/Users/jstupar/my_spring_cloud_aws/spring-cloud-aws/spring-cloud-aws-messaging/src/test/java/org/springframework/cloud/aws/messaging/listener/SimpleMessageListenerContainerTest.java:[780,71] unchecked conversion
  required: com.amazonaws.handlers.AsyncHandler<com.amazonaws.services.sqs.model.DeleteMessageRequest,com.amazonaws.services.sqs.model.DeleteMessageResult>
  found:    com.amazonaws.handlers.AsyncHandler
[WARNING] /C:/Users/jstupar/my_spring_cloud_aws/spring-cloud-aws/spring-cloud-aws-messaging/src/test/java/org/springframework/cloud/aws/messaging/listener/SimpleMessageListenerContainerTest.java:[892,57] unchecked method invocation: method deleteMessageAsync in interface com.amazonaws.services.sqs.AmazonSQSAsync is applied to given types
  required: com.amazonaws.services.sqs.model.DeleteMessageRequest,com.amazonaws.handlers.AsyncHandler<com.amazonaws.services.sqs.model.DeleteMessageRequest,com.amazonaws.services.sqs.model.DeleteMessageResult>
  found: com.amazonaws.services.sqs.model.DeleteMessageRequest,com.amazonaws.handlers.AsyncHandler
[WARNING] /C:/Users/jstupar/my_spring_cloud_aws/spring-cloud-aws/spring-cloud-aws-messaging/src/test/java/org/springframework/cloud/aws/messaging/listener/SimpleMessageListenerContainerTest.java:[894,36] unchecked conversion
  required: com.amazonaws.handlers.AsyncHandler<com.amazonaws.services.sqs.model.DeleteMessageRequest,com.amazonaws.services.sqs.model.DeleteMessageResult>
  found:    com.amazonaws.handlers.AsyncHandler
[WARNING] /C:/Users/jstupar/my_spring_cloud_aws/spring-cloud-aws/spring-cloud-aws-messaging/src/test/java/org/springframework/cloud/aws/messaging/listener/SimpleMessageListenerContainerTest.java:[895,57] unchecked method invocation: method deleteMessageAsync in interface com.amazonaws.services.sqs.AmazonSQSAsync is applied to given types
  required: com.amazonaws.services.sqs.model.DeleteMessageRequest,com.amazonaws.handlers.AsyncHandler<com.amazonaws.services.sqs.model.DeleteMessageRequest,com.amazonaws.services.sqs.model.DeleteMessageResult>
  found: com.amazonaws.services.sqs.model.DeleteMessageRequest,com.amazonaws.handlers.AsyncHandler
[WARNING] /C:/Users/jstupar/my_spring_cloud_aws/spring-cloud-aws/spring-cloud-aws-messaging/src/test/java/org/springframework/cloud/aws/messaging/listener/SimpleMessageListenerContainerTest.java:[897,36] unchecked conversion
  required: com.amazonaws.handlers.AsyncHandler<com.amazonaws.services.sqs.model.DeleteMessageRequest,com.amazonaws.services.sqs.model.DeleteMessageResult>
  found:    com.amazonaws.handlers.AsyncHandler
[WARNING] /C:/Users/jstupar/my_spring_cloud_aws/spring-cloud-aws/spring-cloud-aws-messaging/src/test/java/org/springframework/cloud/aws/messaging/listener/SimpleMessageListenerContainerTest.java:[898,57] unchecked method invocation: method deleteMessageAsync in interface com.amazonaws.services.sqs.AmazonSQSAsync is applied to given types
  required: com.amazonaws.services.sqs.model.DeleteMessageRequest,com.amazonaws.handlers.AsyncHandler<com.amazonaws.services.sqs.model.DeleteMessageRequest,com.amazonaws.services.sqs.model.DeleteMessageResult>
  found: com.amazonaws.services.sqs.model.DeleteMessageRequest,com.amazonaws.handlers.AsyncHandler
[WARNING] /C:/Users/jstupar/my_spring_cloud_aws/spring-cloud-aws/spring-cloud-aws-messaging/src/test/java/org/springframework/cloud/aws/messaging/listener/SimpleMessageListenerContainerTest.java:[900,36] unchecked conversion
  required: com.amazonaws.handlers.AsyncHandler<com.amazonaws.services.sqs.model.DeleteMessageRequest,com.amazonaws.services.sqs.model.DeleteMessageResult>
  found:    com.amazonaws.handlers.AsyncHandler
[WARNING] /C:/Users/jstupar/my_spring_cloud_aws/spring-cloud-aws/spring-cloud-aws-messaging/src/test/java/org/springframework/cloud/aws/messaging/listener/SimpleMessageListenerContainerTest.java:[901,56] unchecked method invocation: method deleteMessageAsync in interface com.amazonaws.services.sqs.AmazonSQSAsync is applied to given types
  required: com.amazonaws.services.sqs.model.DeleteMessageRequest,com.amazonaws.handlers.AsyncHandler<com.amazonaws.services.sqs.model.DeleteMessageRequest,com.amazonaws.services.sqs.model.DeleteMessageResult>
  found: com.amazonaws.services.sqs.model.DeleteMessageRequest,com.amazonaws.handlers.AsyncHandler
[WARNING] /C:/Users/jstupar/my_spring_cloud_aws/spring-cloud-aws/spring-cloud-aws-messaging/src/test/java/org/springframework/cloud/aws/messaging/listener/SimpleMessageListenerContainerTest.java:[903,36] unchecked conversion
  required: com.amazonaws.handlers.AsyncHandler<com.amazonaws.services.sqs.model.DeleteMessageRequest,com.amazonaws.services.sqs.model.DeleteMessageResult>
  found:    com.amazonaws.handlers.AsyncHandler
[WARNING] /C:/Users/jstupar/my_spring_cloud_aws/spring-cloud-aws/spring-cloud-aws-messaging/src/test/java/org/springframework/cloud/aws/messaging/listener/SimpleMessageListenerContainerTest.java:[904,57] unchecked method invocation: method deleteMessageAsync in interface com.amazonaws.services.sqs.AmazonSQSAsync is applied to given types
  required: com.amazonaws.services.sqs.model.DeleteMessageRequest,com.amazonaws.handlers.AsyncHandler<com.amazonaws.services.sqs.model.DeleteMessageRequest,com.amazonaws.services.sqs.model.DeleteMessageResult>
  found: com.amazonaws.services.sqs.model.DeleteMessageRequest,com.amazonaws.handlers.AsyncHandler
[WARNING] /C:/Users/jstupar/my_spring_cloud_aws/spring-cloud-aws/spring-cloud-aws-messaging/src/test/java/org/springframework/cloud/aws/messaging/listener/SimpleMessageListenerContainerTest.java:[906,36] unchecked conversion
  required: com.amazonaws.handlers.AsyncHandler<com.amazonaws.services.sqs.model.DeleteMessageRequest,com.amazonaws.services.sqs.model.DeleteMessageResult>
  found:    com.amazonaws.handlers.AsyncHandler
[WARNING] /C:/Users/jstupar/my_spring_cloud_aws/spring-cloud-aws/spring-cloud-aws-messaging/src/test/java/org/springframework/cloud/aws/messaging/listener/SimpleMessageListenerContainerTest.java:[907,56] unchecked method invocation: method deleteMessageAsync in interface com.amazonaws.services.sqs.AmazonSQSAsync is applied to given types
  required: com.amazonaws.services.sqs.model.DeleteMessageRequest,com.amazonaws.handlers.AsyncHandler<com.amazonaws.services.sqs.model.DeleteMessageRequest,com.amazonaws.services.sqs.model.DeleteMessageResult>
  found: com.amazonaws.services.sqs.model.DeleteMessageRequest,com.amazonaws.handlers.AsyncHandler
[WARNING] /C:/Users/jstupar/my_spring_cloud_aws/spring-cloud-aws/spring-cloud-aws-messaging/src/test/java/org/springframework/cloud/aws/messaging/listener/SimpleMessageListenerContainerTest.java:[909,36] unchecked conversion
  required: com.amazonaws.handlers.AsyncHandler<com.amazonaws.services.sqs.model.DeleteMessageRequest,com.amazonaws.services.sqs.model.DeleteMessageResult>
  found:    com.amazonaws.handlers.AsyncHandler
[WARNING] /C:/Users/jstupar/my_spring_cloud_aws/spring-cloud-aws/spring-cloud-aws-messaging/src/test/java/org/springframework/cloud/aws/messaging/listener/SimpleMessageListenerContainerTest.java:[910,56] unchecked method invocation: method deleteMessageAsync in interface com.amazonaws.services.sqs.AmazonSQSAsync is applied to given types
  required: com.amazonaws.services.sqs.model.DeleteMessageRequest,com.amazonaws.handlers.AsyncHandler<com.amazonaws.services.sqs.model.DeleteMessageRequest,com.amazonaws.services.sqs.model.DeleteMessageResult>
  found: com.amazonaws.services.sqs.model.DeleteMessageRequest,com.amazonaws.handlers.AsyncHandler
[WARNING] /C:/Users/jstupar/my_spring_cloud_aws/spring-cloud-aws/spring-cloud-aws-messaging/src/test/java/org/springframework/cloud/aws/messaging/listener/SimpleMessageListenerContainerTest.java:[912,36] unchecked conversion
  required: com.amazonaws.handlers.AsyncHandler<com.amazonaws.services.sqs.model.DeleteMessageRequest,com.amazonaws.services.sqs.model.DeleteMessageResult>
  found:    com.amazonaws.handlers.AsyncHandler
[WARNING] /C:/Users/jstupar/my_spring_cloud_aws/spring-cloud-aws/spring-cloud-aws-messaging/src/test/java/org/springframework/cloud/aws/messaging/listener/SimpleMessageListenerContainerTest.java:[913,56] unchecked method invocation: method deleteMessageAsync in interface com.amazonaws.services.sqs.AmazonSQSAsync is applied to given types
  required: com.amazonaws.services.sqs.model.DeleteMessageRequest,com.amazonaws.handlers.AsyncHandler<com.amazonaws.services.sqs.model.DeleteMessageRequest,com.amazonaws.services.sqs.model.DeleteMessageResult>
  found: com.amazonaws.services.sqs.model.DeleteMessageRequest,com.amazonaws.handlers.AsyncHandler
[WARNING] /C:/Users/jstupar/my_spring_cloud_aws/spring-cloud-aws/spring-cloud-aws-messaging/src/test/java/org/springframework/cloud/aws/messaging/listener/SimpleMessageListenerContainerTest.java:[915,36] unchecked conversion
  required: com.amazonaws.handlers.AsyncHandler<com.amazonaws.services.sqs.model.DeleteMessageRequest,com.amazonaws.services.sqs.model.DeleteMessageResult>
  found:    com.amazonaws.handlers.AsyncHandler
[WARNING] /C:/Users/jstupar/my_spring_cloud_aws/spring-cloud-aws/spring-cloud-aws-messaging/src/test/java/org/springframework/cloud/aws/messaging/listener/SimpleMessageListenerContainerTest.java:[1343,10] org.springframework.cloud.aws.messaging.config.annotation.EnableSqs in org.springframework.cloud.aws.messaging.config.annotation has been deprecated
[WARNING] /C:/Users/jstupar/my_spring_cloud_aws/spring-cloud-aws/spring-cloud-aws-messaging/src/test/java/org/springframework/cloud/aws/messaging/config/annotation/SnsConfigurationTest.java:[133,10] org.springframework.cloud.aws.messaging.config.annotation.EnableSns in org.springframework.cloud.aws.messaging.config.annotation has been deprecated
[WARNING] /C:/Users/jstupar/my_spring_cloud_aws/spring-cloud-aws/spring-cloud-aws-messaging/src/test/java/org/springframework/cloud/aws/messaging/config/annotation/SnsConfigurationTest.java:[139,10] org.springframework.cloud.aws.messaging.config.annotation.EnableSns in org.springframework.cloud.aws.messaging.config.annotation has been deprecated
[WARNING] /C:/Users/jstupar/my_spring_cloud_aws/spring-cloud-aws/spring-cloud-aws-messaging/src/test/java/org/springframework/cloud/aws/messaging/config/annotation/SnsConfigurationTest.java:[152,10] org.springframework.cloud.aws.messaging.config.annotation.EnableSns in org.springframework.cloud.aws.messaging.config.annotation has been deprecated
[WARNING] /C:/Users/jstupar/my_spring_cloud_aws/spring-cloud-aws/spring-cloud-aws-messaging/src/test/java/org/springframework/cloud/aws/messaging/config/annotation/SnsConfigurationTest.java:[165,10] org.springframework.cloud.aws.context.config.annotation.EnableContextRegion in org.springframework.cloud.aws.context.config.annotation has been deprecated
[WARNING] /C:/Users/jstupar/my_spring_cloud_aws/spring-cloud-aws/spring-cloud-aws-messaging/src/test/java/org/springframework/cloud/aws/messaging/config/annotation/SnsConfigurationTest.java:[166,10] org.springframework.cloud.aws.messaging.config.annotation.EnableSns in org.springframework.cloud.aws.messaging.config.annotation has been deprecated
[INFO]
[INFO] --- maven-surefire-plugin:2.22.2:test (default-test) @ spring-cloud-aws-messaging ---
[INFO]
[INFO] -------------------------------------------------------
[INFO]  T E S T S
[INFO] -------------------------------------------------------
[INFO] Running org.springframework.cloud.aws.messaging.config.annotation.SnsConfigurationTest
[INFO] Tests run: 4, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 3.384 s - in org.springframework.cloud.aws.messaging.config.annotation.SnsConfigurationTest
[INFO] Running org.springframework.cloud.aws.messaging.config.annotation.SqsConfigurationTest
[INFO] Tests run: 10, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.555 s - in org.springframework.cloud.aws.messaging.config.annotation.SqsConfigurationTest
[INFO] Running org.springframework.cloud.aws.messaging.config.xml.AnnotationDrivenQueueListenerBeanDefinitionParserTest
[INFO] Tests run: 12, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.497 s - in org.springframework.cloud.aws.messaging.config.xml.AnnotationDrivenQueueListenerBeanDefinitionParserTest
[INFO] Running org.springframework.cloud.aws.messaging.config.xml.MessagingSchemaWithoutSchemaTest
[INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.008 s - in org.springframework.cloud.aws.messaging.config.xml.MessagingSchemaWithoutSchemaTest
[INFO] Running org.springframework.cloud.aws.messaging.config.xml.NotificationArgumentResolverBeanDefinitionParserTest
[INFO] Tests run: 4, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.144 s - in org.springframework.cloud.aws.messaging.config.xml.NotificationArgumentResolverBeanDefinitionParserTest
[INFO] Running org.springframework.cloud.aws.messaging.config.xml.NotificationMessagingTemplateBeanDefinitionParserTest
[INFO] Tests run: 5, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.095 s - in org.springframework.cloud.aws.messaging.config.xml.NotificationMessagingTemplateBeanDefinitionParserTest
[INFO] Running org.springframework.cloud.aws.messaging.config.xml.QueueMessagingTemplateBeanDefinitionParserTest
[INFO] Tests run: 7, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.134 s - in org.springframework.cloud.aws.messaging.config.xml.QueueMessagingTemplateBeanDefinitionParserTest
[INFO] Running org.springframework.cloud.aws.messaging.config.xml.SqsAsyncClientBeanDefinitionParserTest
[INFO] Tests run: 5, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.098 s - in org.springframework.cloud.aws.messaging.config.xml.SqsAsyncClientBeanDefinitionParserTest
[INFO] Running org.springframework.cloud.aws.messaging.core.NotificationMessagingTemplateTest
[INFO] Tests run: 4, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.047 s - in org.springframework.cloud.aws.messaging.core.NotificationMessagingTemplateTest
[INFO] Running org.springframework.cloud.aws.messaging.core.QueueMessageChannelTest
[INFO] Tests run: 26, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.048 s - in org.springframework.cloud.aws.messaging.core.QueueMessageChannelTest
[INFO] Running org.springframework.cloud.aws.messaging.core.QueueMessageUtilsTest
[INFO] Tests run: 23, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.065 s - in org.springframework.cloud.aws.messaging.core.QueueMessageUtilsTest
[INFO] Running org.springframework.cloud.aws.messaging.core.QueueMessagingTemplateTest
[INFO] Tests run: 12, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.023 s - in org.springframework.cloud.aws.messaging.core.QueueMessagingTemplateTest
[INFO] Running org.springframework.cloud.aws.messaging.core.TopicMessageChannelTest
[INFO] Tests run: 7, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0 s - in org.springframework.cloud.aws.messaging.core.TopicMessageChannelTest
[INFO] Running org.springframework.cloud.aws.messaging.endpoint.BaseNotificationMessageHandlerMethodArgumentResolverTest
[INFO] Tests run: 2, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.02 s - in org.springframework.cloud.aws.messaging.endpoint.BaseNotificationMessageHandlerMethodArgumentResolverTest
[INFO] Running org.springframework.cloud.aws.messaging.endpoint.ComplexNotificationEndpointControllerTest
[INFO] Tests run: 4, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.342 s - in org.springframework.cloud.aws.messaging.endpoint.ComplexNotificationEndpointControllerTest
[INFO] Running org.springframework.cloud.aws.messaging.endpoint.config.NotificationHandlerMethodArgumentResolverFactoryBeanTest
[INFO] Tests run: 3, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0 s - in org.springframework.cloud.aws.messaging.endpoint.config.NotificationHandlerMethodArgumentResolverFactoryBeanTest
[INFO] Running org.springframework.cloud.aws.messaging.endpoint.NotificationEndpointControllerTest
[INFO] Tests run: 3, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.058 s - in org.springframework.cloud.aws.messaging.endpoint.NotificationEndpointControllerTest
[INFO] Running org.springframework.cloud.aws.messaging.endpoint.NotificationMessageHandlerMethodArgumentResolverTest
[INFO] Tests run: 3, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0 s - in org.springframework.cloud.aws.messaging.endpoint.NotificationMessageHandlerMethodArgumentResolverTest
[INFO] Running org.springframework.cloud.aws.messaging.endpoint.NotificationStatusHandlerMethodArgumentResolverTest
[INFO] Tests run: 2, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.001 s - in org.springframework.cloud.aws.messaging.endpoint.NotificationStatusHandlerMethodArgumentResolverTest
[INFO] Running org.springframework.cloud.aws.messaging.endpoint.NotificationSubjectHandlerMethodArgumentResolverTest
[INFO] Tests run: 3, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.001 s - in org.springframework.cloud.aws.messaging.endpoint.NotificationSubjectHandlerMethodArgumentResolverTest
[INFO] Running org.springframework.cloud.aws.messaging.listener.MessageListenerContainerTest
[INFO] Tests run: 20, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.124 s - in org.springframework.cloud.aws.messaging.listener.MessageListenerContainerTest
[INFO] Running org.springframework.cloud.aws.messaging.listener.QueueMessageHandlerTest
12:34:58.667 [main] ERROR o.s.c.a.m.l.QueueMessageHandler - An exception occurred while invoking the handler method
java.lang.RuntimeException: test exception
        at org.springframework.cloud.aws.messaging.listener.QueueMessageHandlerTest$SqsListenerWithoutMessageExceptionHandler.receive(QueueMessageHandlerTest.java:659)
        at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
        at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
        at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
        at java.lang.reflect.Method.invoke(Method.java:498)
        at org.springframework.messaging.handler.invocation.InvocableHandlerMethod.doInvoke(InvocableHandlerMethod.java:171)
        at org.springframework.messaging.handler.invocation.InvocableHandlerMethod.invoke(InvocableHandlerMethod.java:120)
        at org.springframework.messaging.handler.invocation.AbstractMethodMessageHandler.handleMatch(AbstractMethodMessageHandler.java:565)
        at org.springframework.messaging.handler.invocation.AbstractMethodMessageHandler.handleMessageInternal(AbstractMethodMessageHandler.java:520)
        at org.springframework.messaging.handler.invocation.AbstractMethodMessageHandler.handleMessage(AbstractMethodMessageHandler.java:454)
        at org.springframework.cloud.aws.messaging.listener.QueueMessageHandlerTest.lambda$processHandlerMethodException_invocableHandlerMethodNotAvailable_errorMustBeLogged$3(QueueMessageHandlerTest.java:609)
        at org.assertj.core.api.ThrowableAssert.catchThrowable(ThrowableAssert.java:62)
        at org.assertj.core.api.AssertionsForClassTypes.catchThrowable(AssertionsForClassTypes.java:877)
        at org.assertj.core.api.Assertions.catchThrowable(Assertions.java:1306)
        at org.assertj.core.api.Assertions.assertThatThrownBy(Assertions.java:1178)
        at org.springframework.cloud.aws.messaging.listener.QueueMessageHandlerTest.processHandlerMethodException_invocableHandlerMethodNotAvailable_errorMustBeLogged(QueueMessageHandlerTest.java:609)
        at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
        at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
        at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
        at java.lang.reflect.Method.invoke(Method.java:498)
        at org.junit.platform.commons.util.ReflectionUtils.invokeMethod(ReflectionUtils.java:688)
        at org.junit.jupiter.engine.execution.MethodInvocation.proceed(MethodInvocation.java:60)
        at org.junit.jupiter.engine.execution.InvocationInterceptorChain$ValidatingInvocation.proceed(InvocationInterceptorChain.java:131)
        at org.junit.jupiter.engine.extension.TimeoutExtension.intercept(TimeoutExtension.java:149)
        at org.junit.jupiter.engine.extension.TimeoutExtension.interceptTestableMethod(TimeoutExtension.java:140)
        at org.junit.jupiter.engine.extension.TimeoutExtension.interceptTestMethod(TimeoutExtension.java:84)
        at org.junit.jupiter.engine.execution.ExecutableInvoker$ReflectiveInterceptorCall.lambda$ofVoidMethod$0(ExecutableInvoker.java:115)
        at org.junit.jupiter.engine.execution.ExecutableInvoker.lambda$invoke$0(ExecutableInvoker.java:105)
        at org.junit.jupiter.engine.execution.InvocationInterceptorChain$InterceptedInvocation.proceed(InvocationInterceptorChain.java:106)
        at org.junit.jupiter.engine.execution.InvocationInterceptorChain.proceed(InvocationInterceptorChain.java:64)
        at org.junit.jupiter.engine.execution.InvocationInterceptorChain.chainAndInvoke(InvocationInterceptorChain.java:45)
        at org.junit.jupiter.engine.execution.InvocationInterceptorChain.invoke(InvocationInterceptorChain.java:37)
        at org.junit.jupiter.engine.execution.ExecutableInvoker.invoke(ExecutableInvoker.java:104)
        at org.junit.jupiter.engine.execution.ExecutableInvoker.invoke(ExecutableInvoker.java:98)
        at org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.lambda$invokeTestMethod$6(TestMethodTestDescriptor.java:210)
        at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
        at org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.invokeTestMethod(TestMethodTestDescriptor.java:206)
        at org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.execute(TestMethodTestDescriptor.java:131)
        at org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.execute(TestMethodTestDescriptor.java:65)
        at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$5(NodeTestTask.java:139)
        at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
        at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$7(NodeTestTask.java:129)
        at org.junit.platform.engine.support.hierarchical.Node.around(Node.java:137)
        at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$8(NodeTestTask.java:127)
        at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
        at org.junit.platform.engine.support.hierarchical.NodeTestTask.executeRecursively(NodeTestTask.java:126)
        at org.junit.platform.engine.support.hierarchical.NodeTestTask.execute(NodeTestTask.java:84)
        at java.util.ArrayList.forEach(ArrayList.java:1259)
        at org.junit.platform.engine.support.hierarchical.SameThreadHierarchicalTestExecutorService.invokeAll(SameThreadHierarchicalTestExecutorService.java:38)
        at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$5(NodeTestTask.java:143)
        at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
        at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$7(NodeTestTask.java:129)
        at org.junit.platform.engine.support.hierarchical.Node.around(Node.java:137)
        at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$8(NodeTestTask.java:127)
        at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
        at org.junit.platform.engine.support.hierarchical.NodeTestTask.executeRecursively(NodeTestTask.java:126)
        at org.junit.platform.engine.support.hierarchical.NodeTestTask.execute(NodeTestTask.java:84)
        at java.util.ArrayList.forEach(ArrayList.java:1259)
        at org.junit.platform.engine.support.hierarchical.SameThreadHierarchicalTestExecutorService.invokeAll(SameThreadHierarchicalTestExecutorService.java:38)
        at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$5(NodeTestTask.java:143)
        at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
        at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$7(NodeTestTask.java:129)
        at org.junit.platform.engine.support.hierarchical.Node.around(Node.java:137)
        at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$8(NodeTestTask.java:127)
        at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
        at org.junit.platform.engine.support.hierarchical.NodeTestTask.executeRecursively(NodeTestTask.java:126)
        at org.junit.platform.engine.support.hierarchical.NodeTestTask.execute(NodeTestTask.java:84)
        at org.junit.platform.engine.support.hierarchical.SameThreadHierarchicalTestExecutorService.submit(SameThreadHierarchicalTestExecutorService.java:32)
        at org.junit.platform.engine.support.hierarchical.HierarchicalTestExecutor.execute(HierarchicalTestExecutor.java:57)
        at org.junit.platform.engine.support.hierarchical.HierarchicalTestEngine.execute(HierarchicalTestEngine.java:51)
        at org.junit.platform.launcher.core.DefaultLauncher.execute(DefaultLauncher.java:220)
        at org.junit.platform.launcher.core.DefaultLauncher.lambda$execute$6(DefaultLauncher.java:188)
        at org.junit.platform.launcher.core.DefaultLauncher.withInterceptedStreams(DefaultLauncher.java:202)
        at org.junit.platform.launcher.core.DefaultLauncher.execute(DefaultLauncher.java:181)
        at org.junit.platform.launcher.core.DefaultLauncher.execute(DefaultLauncher.java:128)
        at org.apache.maven.surefire.junitplatform.JUnitPlatformProvider.invokeAllTests(JUnitPlatformProvider.java:150)
        at org.apache.maven.surefire.junitplatform.JUnitPlatformProvider.invoke(JUnitPlatformProvider.java:124)
        at org.apache.maven.surefire.booter.ForkedBooter.invokeProviderInSameClassLoader(ForkedBooter.java:384)
        at org.apache.maven.surefire.booter.ForkedBooter.runSuitesInProcess(ForkedBooter.java:345)
        at org.apache.maven.surefire.booter.ForkedBooter.execute(ForkedBooter.java:126)
        at org.apache.maven.surefire.booter.ForkedBooter.main(ForkedBooter.java:418)
12:34:58.743 [main] WARN  o.s.c.a.m.l.QueueMessageHandler - Listener method 'receive' in type 'org.springframework.cloud.aws.messaging.listener.QueueMessageHandlerTest$SqsListenerDeletionPolicyNeverNoAcknowledgment' has deletion policy 'NEVER' but does not have a parameter of type Acknowledgment.
[INFO] Tests run: 21, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.271 s - in org.springframework.cloud.aws.messaging.listener.QueueMessageHandlerTest
[INFO] Running org.springframework.cloud.aws.messaging.listener.SendToHandlerMethodReturnValueHandlerTest
[INFO] Tests run: 9, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.004 s - in org.springframework.cloud.aws.messaging.listener.SendToHandlerMethodReturnValueHandlerTest
[INFO] Running org.springframework.cloud.aws.messaging.listener.SimpleMessageListenerContainerTest
[INFO] Tests run: 28, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 1.507 s - in org.springframework.cloud.aws.messaging.listener.SimpleMessageListenerContainerTest
[INFO] Running org.springframework.cloud.aws.messaging.listener.support.AcknowledgmentHandlerMethodArgumentResolverTest
[INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.001 s - in org.springframework.cloud.aws.messaging.listener.support.AcknowledgmentHandlerMethodArgumentResolverTest
[INFO] Running org.springframework.cloud.aws.messaging.listener.support.VisibilityHandlerMethodArgumentResolverTest
[INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0 s - in org.springframework.cloud.aws.messaging.listener.support.VisibilityHandlerMethodArgumentResolverTest
[INFO] Running org.springframework.cloud.aws.messaging.support.converter.NotificationRequestConverterTest
[INFO] Tests run: 9, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.004 s - in org.springframework.cloud.aws.messaging.support.converter.NotificationRequestConverterTest
[INFO] Running org.springframework.cloud.aws.messaging.support.converter.ObjectMessageConverterTest
[INFO] Tests run: 5, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.005 s - in org.springframework.cloud.aws.messaging.support.converter.ObjectMessageConverterTest
[INFO] Running org.springframework.cloud.aws.messaging.support.destination.DynamicQueueUrlDestinationResolverTest
[INFO] Tests run: 8, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.027 s - in org.springframework.cloud.aws.messaging.support.destination.DynamicQueueUrlDestinationResolverTest
[INFO] Running org.springframework.cloud.aws.messaging.support.destination.DynamicTopicDestinationResolverTest
[INFO] Tests run: 7, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.006 s - in org.springframework.cloud.aws.messaging.support.destination.DynamicTopicDestinationResolverTest
[INFO] Running org.springframework.cloud.aws.messaging.support.NotificationMessageArgumentResolverTest
[INFO] Tests run: 4, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.001 s - in org.springframework.cloud.aws.messaging.support.NotificationMessageArgumentResolverTest
[INFO] Running org.springframework.cloud.aws.messaging.support.NotificationSubjectArgumentResolverTest
[INFO] Tests run: 4, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.001 s - in org.springframework.cloud.aws.messaging.support.NotificationSubjectArgumentResolverTest
[INFO]
[INFO] Results:
[INFO]
[INFO] Tests run: 257, Failures: 0, Errors: 0, Skipped: 0
[INFO]
[INFO]
[INFO] --- maven-jar-plugin:3.2.0:jar (default-jar) @ spring-cloud-aws-messaging ---
[INFO] Building jar: C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-messaging\target\spring-cloud-aws-messaging-3.0.0-SNAPSHOT.jar
[INFO]
[INFO] --- maven-javadoc-plugin:3.2.0:jar (javadoc) @ spring-cloud-aws-messaging ---
[INFO] No previous run data found, generating javadoc.
[INFO]
Loading source file C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-messaging\src\main\java\org\springframework\cloud\aws\messaging\config\annotation\EnableSns.java...
Loading source file C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-messaging\src\main\java\org\springframework\cloud\aws\messaging\config\annotation\EnableSqs.java...
Loading source file C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-messaging\src\main\java\org\springframework\cloud\aws\messaging\config\annotation\NotificationMessage.java...
Loading source file C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-messaging\src\main\java\org\springframework\cloud\aws\messaging\config\annotation\NotificationSubject.java...
Loading source file C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-messaging\src\main\java\org\springframework\cloud\aws\messaging\config\annotation\SnsConfiguration.java...
Loading source file C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-messaging\src\main\java\org\springframework\cloud\aws\messaging\config\annotation\SnsWebConfiguration.java...
Loading source file C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-messaging\src\main\java\org\springframework\cloud\aws\messaging\config\annotation\SqsClientConfiguration.java...
Loading source file C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-messaging\src\main\java\org\springframework\cloud\aws\messaging\config\annotation\SqsConfiguration.java...
Loading source file C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-messaging\src\main\java\org\springframework\cloud\aws\messaging\config\QueueMessageHandlerFactory.java...
Loading source file C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-messaging\src\main\java\org\springframework\cloud\aws\messaging\config\SimpleMessageListenerContainerFactory.java...
Loading source file C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-messaging\src\main\java\org\springframework\cloud\aws\messaging\config\xml\AnnotationDrivenQueueListenerBeanDefinitionParser.java...
Loading source file C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-messaging\src\main\java\org\springframework\cloud\aws\messaging\config\xml\BufferedSqsClientBeanDefinitionUtils.java...
Loading source file C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-messaging\src\main\java\org\springframework\cloud\aws\messaging\config\xml\MessagingNamespaceHandler.java...
Loading source file C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-messaging\src\main\java\org\springframework\cloud\aws\messaging\config\xml\NotificationArgumentResolverBeanDefinitionParser.java...
Loading source file C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-messaging\src\main\java\org\springframework\cloud\aws\messaging\config\xml\NotificationMessagingTemplateBeanDefinitionParser.java...
Loading source file C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-messaging\src\main\java\org\springframework\cloud\aws\messaging\config\xml\QueueMessagingTemplateBeanDefinitionParser.java...
Loading source file C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-messaging\src\main\java\org\springframework\cloud\aws\messaging\config\xml\SqsAsyncClientBeanDefinitionParser.java...
Loading source file C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-messaging\src\main\java\org\springframework\cloud\aws\messaging\core\MessageAttributeDataTypes.java...
Loading source file C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-messaging\src\main\java\org\springframework\cloud\aws\messaging\core\NotificationMessagingTemplate.java...
Loading source file C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-messaging\src\main\java\org\springframework\cloud\aws\messaging\core\QueueMessageChannel.java...
Loading source file C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-messaging\src\main\java\org\springframework\cloud\aws\messaging\core\QueueMessageUtils.java...
Loading source file C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-messaging\src\main\java\org\springframework\cloud\aws\messaging\core\QueueMessagingTemplate.java...
Loading source file C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-messaging\src\main\java\org\springframework\cloud\aws\messaging\core\SqsMessageHeaders.java...
Loading source file C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-messaging\src\main\java\org\springframework\cloud\aws\messaging\core\support\AbstractMessageChannelMessagingSendingTemplate.java...
Loading source file C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-messaging\src\main\java\org\springframework\cloud\aws\messaging\core\TopicMessageChannel.java...
Loading source file C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-messaging\src\main\java\org\springframework\cloud\aws\messaging\endpoint\AbstractNotificationMessageHandlerMethodArgumentResolver.java...
Loading source file C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-messaging\src\main\java\org\springframework\cloud\aws\messaging\endpoint\annotation\NotificationMessageMapping.java...
Loading source file C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-messaging\src\main\java\org\springframework\cloud\aws\messaging\endpoint\annotation\NotificationSubscriptionMapping.java...
Loading source file C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-messaging\src\main\java\org\springframework\cloud\aws\messaging\endpoint\annotation\NotificationUnsubscribeConfirmationMapping.java...
Loading source file C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-messaging\src\main\java\org\springframework\cloud\aws\messaging\endpoint\config\NotificationHandlerMethodArgumentResolverConfigurationUtils.java...
Loading source file C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-messaging\src\main\java\org\springframework\cloud\aws\messaging\endpoint\config\NotificationHandlerMethodArgumentResolverFactoryBean.java...
Loading source file C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-messaging\src\main\java\org\springframework\cloud\aws\messaging\endpoint\NotificationMessageHandlerMethodArgumentResolver.java...
Loading source file C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-messaging\src\main\java\org\springframework\cloud\aws\messaging\endpoint\NotificationStatus.java...
Loading source file C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-messaging\src\main\java\org\springframework\cloud\aws\messaging\endpoint\NotificationStatusHandlerMethodArgumentResolver.java...
Loading source file C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-messaging\src\main\java\org\springframework\cloud\aws\messaging\endpoint\NotificationSubjectHandlerMethodArgumentResolver.java...
Loading source file C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-messaging\src\main\java\org\springframework\cloud\aws\messaging\listener\AbstractMessageListenerContainer.java...
Loading source file C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-messaging\src\main\java\org\springframework\cloud\aws\messaging\listener\Acknowledgment.java...
Loading source file C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-messaging\src\main\java\org\springframework\cloud\aws\messaging\listener\annotation\SqsListener.java...
Loading source file C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-messaging\src\main\java\org\springframework\cloud\aws\messaging\listener\DeleteMessageHandler.java...
Loading source file C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-messaging\src\main\java\org\springframework\cloud\aws\messaging\listener\QueueMessageAcknowledgment.java...
Loading source file C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-messaging\src\main\java\org\springframework\cloud\aws\messaging\listener\QueueMessageHandler.java...
Loading source file C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-messaging\src\main\java\org\springframework\cloud\aws\messaging\listener\QueueMessageVisibility.java...
Loading source file C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-messaging\src\main\java\org\springframework\cloud\aws\messaging\listener\SendToHandlerMethodReturnValueHandler.java...
Loading source file C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-messaging\src\main\java\org\springframework\cloud\aws\messaging\listener\SimpleMessageListenerContainer.java...
Loading source file C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-messaging\src\main\java\org\springframework\cloud\aws\messaging\listener\SqsMessageDeletionPolicy.java...
Loading source file C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-messaging\src\main\java\org\springframework\cloud\aws\messaging\listener\SqsMessageMethodArgumentResolver.java...
Loading source file C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-messaging\src\main\java\org\springframework\cloud\aws\messaging\listener\support\AcknowledgmentHandlerMethodArgumentResolver.java...
Loading source file C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-messaging\src\main\java\org\springframework\cloud\aws\messaging\listener\support\VisibilityHandlerMethodArgumentResolver.java...
Loading source file C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-messaging\src\main\java\org\springframework\cloud\aws\messaging\listener\Visibility.java...
Loading source file C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-messaging\src\main\java\org\springframework\cloud\aws\messaging\support\converter\NotificationRequestConverter.java...
Loading source file C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-messaging\src\main\java\org\springframework\cloud\aws\messaging\support\converter\ObjectMessageConverter.java...
Loading source file C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-messaging\src\main\java\org\springframework\cloud\aws\messaging\support\destination\DynamicQueueUrlDestinationResolver.java...
Loading source file C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-messaging\src\main\java\org\springframework\cloud\aws\messaging\support\destination\DynamicTopicDestinationResolver.java...
Loading source file C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-messaging\src\main\java\org\springframework\cloud\aws\messaging\support\NotificationMessageArgumentResolver.java...
Loading source file C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-messaging\src\main\java\org\springframework\cloud\aws\messaging\support\NotificationSubjectArgumentResolver.java...
Loading source file C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-messaging\src\main\java\org\springframework\cloud\aws\messaging\support\SqsHeadersMethodArgumentResolver.java...
Constructing Javadoc information...
Standard Doclet version 1.8.0_291
Building tree for all the packages and classes...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-messaging\target\apidocs\org\springframework\cloud\aws\messaging\config\QueueMessageHandlerFactory.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-messaging\target\apidocs\org\springframework\cloud\aws\messaging\config\SimpleMessageListenerContainerFactory.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-messaging\target\apidocs\org\springframework\cloud\aws\messaging\support\destination\DynamicQueueUrlDestinationResolver.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-messaging\target\apidocs\org\springframework\cloud\aws\messaging\support\destination\DynamicTopicDestinationResolver.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-messaging\target\apidocs\org\springframework\cloud\aws\messaging\listener\Acknowledgment.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-messaging\target\apidocs\org\springframework\cloud\aws\messaging\listener\QueueMessageAcknowledgment.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-messaging\target\apidocs\org\springframework\cloud\aws\messaging\listener\QueueMessageHandler.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-messaging\target\apidocs\org\springframework\cloud\aws\messaging\listener\QueueMessageHandler.MappingInformation.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-messaging\target\apidocs\org\springframework\cloud\aws\messaging\listener\QueueMessageVisibility.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-messaging\target\apidocs\org\springframework\cloud\aws\messaging\listener\SendToHandlerMethodReturnValueHandler.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-messaging\target\apidocs\org\springframework\cloud\aws\messaging\listener\SimpleMessageListenerContainer.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-messaging\target\apidocs\org\springframework\cloud\aws\messaging\listener\SqsMessageDeletionPolicy.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-messaging\target\apidocs\org\springframework\cloud\aws\messaging\listener\SqsMessageMethodArgumentResolver.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-messaging\target\apidocs\org\springframework\cloud\aws\messaging\listener\Visibility.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-messaging\target\apidocs\org\springframework\cloud\aws\messaging\core\MessageAttributeDataTypes.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-messaging\target\apidocs\org\springframework\cloud\aws\messaging\core\NotificationMessagingTemplate.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-messaging\target\apidocs\org\springframework\cloud\aws\messaging\core\QueueMessageChannel.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-messaging\target\apidocs\org\springframework\cloud\aws\messaging\core\QueueMessageUtils.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-messaging\target\apidocs\org\springframework\cloud\aws\messaging\core\QueueMessagingTemplate.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-messaging\target\apidocs\org\springframework\cloud\aws\messaging\core\SqsMessageHeaders.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-messaging\target\apidocs\org\springframework\cloud\aws\messaging\core\TopicMessageChannel.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-messaging\target\apidocs\org\springframework\cloud\aws\messaging\endpoint\AbstractNotificationMessageHandlerMethodArgumentResolver.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-messaging\target\apidocs\org\springframework\cloud\aws\messaging\endpoint\NotificationMessageHandlerMethodArgumentResolver.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-messaging\target\apidocs\org\springframework\cloud\aws\messaging\endpoint\NotificationStatus.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-messaging\target\apidocs\org\springframework\cloud\aws\messaging\endpoint\NotificationStatusHandlerMethodArgumentResolver.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-messaging\target\apidocs\org\springframework\cloud\aws\messaging\endpoint\NotificationSubjectHandlerMethodArgumentResolver.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-messaging\target\apidocs\org\springframework\cloud\aws\messaging\endpoint\annotation\NotificationMessageMapping.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-messaging\target\apidocs\org\springframework\cloud\aws\messaging\endpoint\annotation\NotificationSubscriptionMapping.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-messaging\target\apidocs\org\springframework\cloud\aws\messaging\endpoint\annotation\NotificationUnsubscribeConfirmationMapping.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-messaging\target\apidocs\org\springframework\cloud\aws\messaging\support\converter\NotificationRequestConverter.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-messaging\target\apidocs\org\springframework\cloud\aws\messaging\support\converter\NotificationRequestConverter.NotificationRequest.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-messaging\target\apidocs\org\springframework\cloud\aws\messaging\support\converter\ObjectMessageConverter.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-messaging\target\apidocs\org\springframework\cloud\aws\messaging\config\xml\AnnotationDrivenQueueListenerBeanDefinitionParser.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-messaging\target\apidocs\org\springframework\cloud\aws\messaging\config\xml\BufferedSqsClientBeanDefinitionUtils.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-messaging\target\apidocs\org\springframework\cloud\aws\messaging\config\xml\MessagingNamespaceHandler.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-messaging\target\apidocs\org\springframework\cloud\aws\messaging\config\xml\NotificationMessagingTemplateBeanDefinitionParser.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-messaging\target\apidocs\org\springframework\cloud\aws\messaging\config\xml\QueueMessagingTemplateBeanDefinitionParser.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-messaging\target\apidocs\org\springframework\cloud\aws\messaging\config\xml\SqsAsyncClientBeanDefinitionParser.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-messaging\target\apidocs\org\springframework\cloud\aws\messaging\endpoint\config\NotificationHandlerMethodArgumentResolverConfigurationUtils.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-messaging\target\apidocs\org\springframework\cloud\aws\messaging\endpoint\config\NotificationHandlerMethodArgumentResolverFactoryBean.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-messaging\target\apidocs\org\springframework\cloud\aws\messaging\listener\support\AcknowledgmentHandlerMethodArgumentResolver.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-messaging\target\apidocs\org\springframework\cloud\aws\messaging\listener\support\VisibilityHandlerMethodArgumentResolver.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-messaging\target\apidocs\org\springframework\cloud\aws\messaging\listener\annotation\SqsListener.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-messaging\target\apidocs\org\springframework\cloud\aws\messaging\support\NotificationMessageArgumentResolver.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-messaging\target\apidocs\org\springframework\cloud\aws\messaging\support\NotificationSubjectArgumentResolver.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-messaging\target\apidocs\org\springframework\cloud\aws\messaging\support\SqsHeadersMethodArgumentResolver.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-messaging\target\apidocs\org\springframework\cloud\aws\messaging\config\annotation\EnableSns.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-messaging\target\apidocs\org\springframework\cloud\aws\messaging\config\annotation\EnableSqs.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-messaging\target\apidocs\org\springframework\cloud\aws\messaging\config\annotation\NotificationMessage.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-messaging\target\apidocs\org\springframework\cloud\aws\messaging\config\annotation\NotificationSubject.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-messaging\target\apidocs\org\springframework\cloud\aws\messaging\config\annotation\SnsConfiguration.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-messaging\target\apidocs\org\springframework\cloud\aws\messaging\config\annotation\SnsWebConfiguration.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-messaging\target\apidocs\org\springframework\cloud\aws\messaging\config\annotation\SqsClientConfiguration.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-messaging\target\apidocs\org\springframework\cloud\aws\messaging\config\annotation\SqsConfiguration.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-messaging\target\apidocs\org\springframework\cloud\aws\messaging\core\support\AbstractMessageChannelMessagingSendingTemplate.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-messaging\target\apidocs\overview-frame.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-messaging\target\apidocs\org\springframework\cloud\aws\messaging\config\package-frame.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-messaging\target\apidocs\org\springframework\cloud\aws\messaging\config\package-summary.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-messaging\target\apidocs\org\springframework\cloud\aws\messaging\config\package-tree.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-messaging\target\apidocs\org\springframework\cloud\aws\messaging\config\annotation\package-frame.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-messaging\target\apidocs\org\springframework\cloud\aws\messaging\config\annotation\package-summary.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-messaging\target\apidocs\org\springframework\cloud\aws\messaging\config\annotation\package-tree.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-messaging\target\apidocs\org\springframework\cloud\aws\messaging\config\xml\package-frame.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-messaging\target\apidocs\org\springframework\cloud\aws\messaging\config\xml\package-summary.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-messaging\target\apidocs\org\springframework\cloud\aws\messaging\config\xml\package-tree.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-messaging\target\apidocs\org\springframework\cloud\aws\messaging\core\package-frame.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-messaging\target\apidocs\org\springframework\cloud\aws\messaging\core\package-summary.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-messaging\target\apidocs\org\springframework\cloud\aws\messaging\core\package-tree.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-messaging\target\apidocs\org\springframework\cloud\aws\messaging\core\support\package-frame.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-messaging\target\apidocs\org\springframework\cloud\aws\messaging\core\support\package-summary.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-messaging\target\apidocs\org\springframework\cloud\aws\messaging\core\support\package-tree.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-messaging\target\apidocs\org\springframework\cloud\aws\messaging\endpoint\package-frame.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-messaging\target\apidocs\org\springframework\cloud\aws\messaging\endpoint\package-summary.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-messaging\target\apidocs\org\springframework\cloud\aws\messaging\endpoint\package-tree.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-messaging\target\apidocs\org\springframework\cloud\aws\messaging\endpoint\annotation\package-frame.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-messaging\target\apidocs\org\springframework\cloud\aws\messaging\endpoint\annotation\package-summary.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-messaging\target\apidocs\org\springframework\cloud\aws\messaging\endpoint\annotation\package-tree.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-messaging\target\apidocs\org\springframework\cloud\aws\messaging\endpoint\config\package-frame.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-messaging\target\apidocs\org\springframework\cloud\aws\messaging\endpoint\config\package-summary.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-messaging\target\apidocs\org\springframework\cloud\aws\messaging\endpoint\config\package-tree.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-messaging\target\apidocs\org\springframework\cloud\aws\messaging\listener\package-frame.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-messaging\target\apidocs\org\springframework\cloud\aws\messaging\listener\package-summary.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-messaging\target\apidocs\org\springframework\cloud\aws\messaging\listener\package-tree.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-messaging\target\apidocs\org\springframework\cloud\aws\messaging\listener\annotation\package-frame.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-messaging\target\apidocs\org\springframework\cloud\aws\messaging\listener\annotation\package-summary.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-messaging\target\apidocs\org\springframework\cloud\aws\messaging\listener\annotation\package-tree.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-messaging\target\apidocs\org\springframework\cloud\aws\messaging\listener\support\package-frame.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-messaging\target\apidocs\org\springframework\cloud\aws\messaging\listener\support\package-summary.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-messaging\target\apidocs\org\springframework\cloud\aws\messaging\listener\support\package-tree.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-messaging\target\apidocs\org\springframework\cloud\aws\messaging\support\package-frame.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-messaging\target\apidocs\org\springframework\cloud\aws\messaging\support\package-summary.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-messaging\target\apidocs\org\springframework\cloud\aws\messaging\support\package-tree.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-messaging\target\apidocs\org\springframework\cloud\aws\messaging\support\converter\package-frame.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-messaging\target\apidocs\org\springframework\cloud\aws\messaging\support\converter\package-summary.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-messaging\target\apidocs\org\springframework\cloud\aws\messaging\support\converter\package-tree.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-messaging\target\apidocs\org\springframework\cloud\aws\messaging\support\destination\package-frame.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-messaging\target\apidocs\org\springframework\cloud\aws\messaging\support\destination\package-summary.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-messaging\target\apidocs\org\springframework\cloud\aws\messaging\support\destination\package-tree.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-messaging\target\apidocs\constant-values.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-messaging\target\apidocs\serialized-form.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-messaging\target\apidocs\org\springframework\cloud\aws\messaging\config\annotation\class-use\EnableSns.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-messaging\target\apidocs\org\springframework\cloud\aws\messaging\config\annotation\class-use\EnableSqs.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-messaging\target\apidocs\org\springframework\cloud\aws\messaging\config\annotation\class-use\NotificationMessage.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-messaging\target\apidocs\org\springframework\cloud\aws\messaging\config\annotation\class-use\NotificationSubject.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-messaging\target\apidocs\org\springframework\cloud\aws\messaging\config\annotation\class-use\SnsConfiguration.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-messaging\target\apidocs\org\springframework\cloud\aws\messaging\config\annotation\class-use\SnsWebConfiguration.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-messaging\target\apidocs\org\springframework\cloud\aws\messaging\config\annotation\class-use\SqsClientConfiguration.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-messaging\target\apidocs\org\springframework\cloud\aws\messaging\config\annotation\class-use\SqsConfiguration.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-messaging\target\apidocs\org\springframework\cloud\aws\messaging\config\class-use\QueueMessageHandlerFactory.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-messaging\target\apidocs\org\springframework\cloud\aws\messaging\config\class-use\SimpleMessageListenerContainerFactory.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-messaging\target\apidocs\org\springframework\cloud\aws\messaging\config\xml\class-use\AnnotationDrivenQueueListenerBeanDefinitionParser.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-messaging\target\apidocs\org\springframework\cloud\aws\messaging\config\xml\class-use\BufferedSqsClientBeanDefinitionUtils.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-messaging\target\apidocs\org\springframework\cloud\aws\messaging\config\xml\class-use\MessagingNamespaceHandler.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-messaging\target\apidocs\org\springframework\cloud\aws\messaging\config\xml\class-use\NotificationMessagingTemplateBeanDefinitionParser.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-messaging\target\apidocs\org\springframework\cloud\aws\messaging\config\xml\class-use\QueueMessagingTemplateBeanDefinitionParser.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-messaging\target\apidocs\org\springframework\cloud\aws\messaging\config\xml\class-use\SqsAsyncClientBeanDefinitionParser.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-messaging\target\apidocs\org\springframework\cloud\aws\messaging\core\class-use\MessageAttributeDataTypes.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-messaging\target\apidocs\org\springframework\cloud\aws\messaging\core\class-use\NotificationMessagingTemplate.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-messaging\target\apidocs\org\springframework\cloud\aws\messaging\core\class-use\QueueMessageChannel.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-messaging\target\apidocs\org\springframework\cloud\aws\messaging\core\class-use\QueueMessageUtils.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-messaging\target\apidocs\org\springframework\cloud\aws\messaging\core\class-use\QueueMessagingTemplate.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-messaging\target\apidocs\org\springframework\cloud\aws\messaging\core\class-use\SqsMessageHeaders.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-messaging\target\apidocs\org\springframework\cloud\aws\messaging\core\support\class-use\AbstractMessageChannelMessagingSendingTemplate.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-messaging\target\apidocs\org\springframework\cloud\aws\messaging\core\class-use\TopicMessageChannel.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-messaging\target\apidocs\org\springframework\cloud\aws\messaging\endpoint\class-use\AbstractNotificationMessageHandlerMethodArgumentResolver.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-messaging\target\apidocs\org\springframework\cloud\aws\messaging\endpoint\annotation\class-use\NotificationMessageMapping.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-messaging\target\apidocs\org\springframework\cloud\aws\messaging\endpoint\annotation\class-use\NotificationSubscriptionMapping.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-messaging\target\apidocs\org\springframework\cloud\aws\messaging\endpoint\annotation\class-use\NotificationUnsubscribeConfirmationMapping.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-messaging\target\apidocs\org\springframework\cloud\aws\messaging\endpoint\config\class-use\NotificationHandlerMethodArgumentResolverConfigurationUtils.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-messaging\target\apidocs\org\springframework\cloud\aws\messaging\endpoint\config\class-use\NotificationHandlerMethodArgumentResolverFactoryBean.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-messaging\target\apidocs\org\springframework\cloud\aws\messaging\endpoint\class-use\NotificationMessageHandlerMethodArgumentResolver.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-messaging\target\apidocs\org\springframework\cloud\aws\messaging\endpoint\class-use\NotificationStatus.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-messaging\target\apidocs\org\springframework\cloud\aws\messaging\endpoint\class-use\NotificationStatusHandlerMethodArgumentResolver.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-messaging\target\apidocs\org\springframework\cloud\aws\messaging\endpoint\class-use\NotificationSubjectHandlerMethodArgumentResolver.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-messaging\target\apidocs\org\springframework\cloud\aws\messaging\listener\class-use\Acknowledgment.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-messaging\target\apidocs\org\springframework\cloud\aws\messaging\listener\annotation\class-use\SqsListener.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-messaging\target\apidocs\org\springframework\cloud\aws\messaging\listener\class-use\QueueMessageAcknowledgment.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-messaging\target\apidocs\org\springframework\cloud\aws\messaging\listener\class-use\QueueMessageHandler.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-messaging\target\apidocs\org\springframework\cloud\aws\messaging\listener\class-use\QueueMessageHandler.MappingInformation.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-messaging\target\apidocs\org\springframework\cloud\aws\messaging\listener\class-use\QueueMessageVisibility.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-messaging\target\apidocs\org\springframework\cloud\aws\messaging\listener\class-use\SendToHandlerMethodReturnValueHandler.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-messaging\target\apidocs\org\springframework\cloud\aws\messaging\listener\class-use\SimpleMessageListenerContainer.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-messaging\target\apidocs\org\springframework\cloud\aws\messaging\listener\class-use\SqsMessageDeletionPolicy.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-messaging\target\apidocs\org\springframework\cloud\aws\messaging\listener\class-use\SqsMessageMethodArgumentResolver.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-messaging\target\apidocs\org\springframework\cloud\aws\messaging\listener\support\class-use\AcknowledgmentHandlerMethodArgumentResolver.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-messaging\target\apidocs\org\springframework\cloud\aws\messaging\listener\support\class-use\VisibilityHandlerMethodArgumentResolver.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-messaging\target\apidocs\org\springframework\cloud\aws\messaging\listener\class-use\Visibility.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-messaging\target\apidocs\org\springframework\cloud\aws\messaging\support\converter\class-use\NotificationRequestConverter.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-messaging\target\apidocs\org\springframework\cloud\aws\messaging\support\converter\class-use\NotificationRequestConverter.NotificationRequest.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-messaging\target\apidocs\org\springframework\cloud\aws\messaging\support\converter\class-use\ObjectMessageConverter.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-messaging\target\apidocs\org\springframework\cloud\aws\messaging\support\destination\class-use\DynamicQueueUrlDestinationResolver.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-messaging\target\apidocs\org\springframework\cloud\aws\messaging\support\destination\class-use\DynamicTopicDestinationResolver.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-messaging\target\apidocs\org\springframework\cloud\aws\messaging\support\class-use\NotificationMessageArgumentResolver.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-messaging\target\apidocs\org\springframework\cloud\aws\messaging\support\class-use\NotificationSubjectArgumentResolver.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-messaging\target\apidocs\org\springframework\cloud\aws\messaging\support\class-use\SqsHeadersMethodArgumentResolver.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-messaging\target\apidocs\org\springframework\cloud\aws\messaging\config\package-use.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-messaging\target\apidocs\org\springframework\cloud\aws\messaging\config\annotation\package-use.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-messaging\target\apidocs\org\springframework\cloud\aws\messaging\config\xml\package-use.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-messaging\target\apidocs\org\springframework\cloud\aws\messaging\core\package-use.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-messaging\target\apidocs\org\springframework\cloud\aws\messaging\core\support\package-use.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-messaging\target\apidocs\org\springframework\cloud\aws\messaging\endpoint\package-use.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-messaging\target\apidocs\org\springframework\cloud\aws\messaging\endpoint\annotation\package-use.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-messaging\target\apidocs\org\springframework\cloud\aws\messaging\endpoint\config\package-use.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-messaging\target\apidocs\org\springframework\cloud\aws\messaging\listener\package-use.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-messaging\target\apidocs\org\springframework\cloud\aws\messaging\listener\annotation\package-use.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-messaging\target\apidocs\org\springframework\cloud\aws\messaging\listener\support\package-use.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-messaging\target\apidocs\org\springframework\cloud\aws\messaging\support\package-use.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-messaging\target\apidocs\org\springframework\cloud\aws\messaging\support\converter\package-use.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-messaging\target\apidocs\org\springframework\cloud\aws\messaging\support\destination\package-use.html...
Building index for all the packages and classes...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-messaging\target\apidocs\overview-tree.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-messaging\target\apidocs\index-all.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-messaging\target\apidocs\deprecated-list.html...
Building index for all classes...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-messaging\target\apidocs\allclasses-frame.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-messaging\target\apidocs\allclasses-noframe.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-messaging\target\apidocs\index.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-messaging\target\apidocs\overview-summary.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-messaging\target\apidocs\help-doc.html...
[INFO] Building jar: C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-messaging\target\spring-cloud-aws-messaging-3.0.0-SNAPSHOT-javadoc.jar
[INFO]
[INFO] >>> maven-source-plugin:3.2.1:jar (attach-sources) > generate-sources @ spring-cloud-aws-messaging >>>
[INFO]
[INFO] --- maven-checkstyle-plugin:3.1.0:check (checkstyle-validation) @ spring-cloud-aws-messaging ---
[INFO] Starting audit...
Audit done.
[INFO]
[INFO] --- maven-checkstyle-plugin:3.1.0:check (no-http-checkstyle-validation) @ spring-cloud-aws-messaging ---
[INFO]
[INFO] --- spring-javaformat-maven-plugin:0.0.25:validate (default) @ spring-cloud-aws-messaging ---
[INFO]
[INFO] --- spring-javaformat-maven-plugin:0.0.25:apply (default) @ spring-cloud-aws-messaging ---
[INFO]
[INFO] <<< maven-source-plugin:3.2.1:jar (attach-sources) < generate-sources @ spring-cloud-aws-messaging <<<
[INFO]
[INFO]
[INFO] --- maven-source-plugin:3.2.1:jar (attach-sources) @ spring-cloud-aws-messaging ---
[INFO] Building jar: C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-messaging\target\spring-cloud-aws-messaging-3.0.0-SNAPSHOT-sources.jar
[INFO]
[INFO] --< org.springframework.cloud:spring-cloud-aws-parameter-store-config >--
[INFO] Building Spring Cloud AWS Parameter Store Configuration 3.0.0-SNAPSHOT [7/18]
[INFO] --------------------------------[ jar ]---------------------------------
Downloading from spring-milestones: https://repo.spring.io/libs-milestone-local/org/springframework/cloud/spring-cloud-context/3.0.0-RC1/spring-cloud-context-3.0.0-RC1.pom
Downloaded from spring-milestones: https://repo.spring.io/libs-milestone-local/org/springframework/cloud/spring-cloud-context/3.0.0-RC1/spring-cloud-context-3.0.0-RC1.pom (6.1 kB at 16 kB/s)
Downloading from spring-milestones: https://repo.spring.io/libs-milestone-local/org/springframework/cloud/spring-cloud-commons-parent/3.0.0-RC1/spring-cloud-commons-parent-3.0.0-RC1.pom
Downloaded from spring-milestones: https://repo.spring.io/libs-milestone-local/org/springframework/cloud/spring-cloud-commons-parent/3.0.0-RC1/spring-cloud-commons-parent-3.0.0-RC1.pom (4.5 kB at 8.8 kB/s)
Downloading from spring-milestones: https://repo.spring.io/libs-milestone-local/org/springframework/security/spring-security-crypto/5.4.1/spring-security-crypto-5.4.1.pom
Downloading from spring-releases: https://repo.spring.io/release/org/springframework/security/spring-security-crypto/5.4.1/spring-security-crypto-5.4.1.pom
Downloaded from spring-releases: https://repo.spring.io/release/org/springframework/security/spring-security-crypto/5.4.1/spring-security-crypto-5.4.1.pom (2.6 kB at 6.4 kB/s)
Downloading from spring-milestones: https://repo.spring.io/libs-milestone-local/com/amazonaws/aws-java-sdk-ssm/1.11.907/aws-java-sdk-ssm-1.11.907.pom
Downloading from spring-releases: https://repo.spring.io/release/com/amazonaws/aws-java-sdk-ssm/1.11.907/aws-java-sdk-ssm-1.11.907.pom
Downloading from spring-plugins: https://repo.spring.io/plugins/com/amazonaws/aws-java-sdk-ssm/1.11.907/aws-java-sdk-ssm-1.11.907.pom
Downloading from central: https://repo.maven.apache.org/maven2/com/amazonaws/aws-java-sdk-ssm/1.11.907/aws-java-sdk-ssm-1.11.907.pom
Downloaded from central: https://repo.maven.apache.org/maven2/com/amazonaws/aws-java-sdk-ssm/1.11.907/aws-java-sdk-ssm-1.11.907.pom (3.6 kB at 13 kB/s)
Downloading from spring-milestones: https://repo.spring.io/libs-milestone-local/org/springframework/boot/spring-boot-configuration-processor/2.4.0/spring-boot-configuration-processor-2.4.0.pom
Downloading from spring-releases: https://repo.spring.io/release/org/springframework/boot/spring-boot-configuration-processor/2.4.0/spring-boot-configuration-processor-2.4.0.pom
Downloaded from spring-releases: https://repo.spring.io/release/org/springframework/boot/spring-boot-configuration-processor/2.4.0/spring-boot-configuration-processor-2.4.0.pom (1.9 kB at 5.1 kB/s)
Downloading from spring-milestones: https://repo.spring.io/libs-milestone-local/org/springframework/cloud/spring-cloud-context/3.0.0-RC1/spring-cloud-context-3.0.0-RC1.jar
Downloading from spring-milestones: https://repo.spring.io/libs-milestone-local/org/springframework/boot/spring-boot-configuration-processor/2.4.0/spring-boot-configuration-processor-2.4.0.jar
Downloading from spring-milestones: https://repo.spring.io/libs-milestone-local/com/amazonaws/aws-java-sdk-ssm/1.11.907/aws-java-sdk-ssm-1.11.907.jar
Downloading from spring-milestones: https://repo.spring.io/libs-milestone-local/org/springframework/security/spring-security-crypto/5.4.1/spring-security-crypto-5.4.1.jar
Downloaded from spring-milestones: https://repo.spring.io/libs-milestone-local/org/springframework/cloud/spring-cloud-context/3.0.0-RC1/spring-cloud-context-3.0.0-RC1.jar (140 kB at 139 kB/s)
Downloading from spring-releases: https://repo.spring.io/release/org/springframework/security/spring-security-crypto/5.4.1/spring-security-crypto-5.4.1.jar
Downloading from spring-releases: https://repo.spring.io/release/org/springframework/boot/spring-boot-configuration-processor/2.4.0/spring-boot-configuration-processor-2.4.0.jar
Downloading from spring-releases: https://repo.spring.io/release/com/amazonaws/aws-java-sdk-ssm/1.11.907/aws-java-sdk-ssm-1.11.907.jar
Downloaded from spring-releases: https://repo.spring.io/release/org/springframework/security/spring-security-crypto/5.4.1/spring-security-crypto-5.4.1.jar (80 kB at 105 kB/s)
Downloaded from spring-releases: https://repo.spring.io/release/org/springframework/boot/spring-boot-configuration-processor/2.4.0/spring-boot-configuration-processor-2.4.0.jar (118 kB at 120 kB/s)
Downloading from spring-plugins: https://repo.spring.io/plugins/com/amazonaws/aws-java-sdk-ssm/1.11.907/aws-java-sdk-ssm-1.11.907.jar
Downloading from central: https://repo.maven.apache.org/maven2/com/amazonaws/aws-java-sdk-ssm/1.11.907/aws-java-sdk-ssm-1.11.907.jar
Downloaded from central: https://repo.maven.apache.org/maven2/com/amazonaws/aws-java-sdk-ssm/1.11.907/aws-java-sdk-ssm-1.11.907.jar (2.6 MB at 971 kB/s)
[INFO]
[INFO] --- maven-clean-plugin:2.5:clean (default-clean) @ spring-cloud-aws-parameter-store-config ---
[INFO]
[INFO] --- maven-checkstyle-plugin:3.1.0:check (checkstyle-validation) @ spring-cloud-aws-parameter-store-config ---
[INFO] Starting audit...
Audit done.
[INFO]
[INFO] --- maven-checkstyle-plugin:3.1.0:check (no-http-checkstyle-validation) @ spring-cloud-aws-parameter-store-config ---
[INFO]
[INFO] --- spring-javaformat-maven-plugin:0.0.25:validate (default) @ spring-cloud-aws-parameter-store-config ---
[INFO]
[INFO] --- spring-javaformat-maven-plugin:0.0.25:apply (default) @ spring-cloud-aws-parameter-store-config ---
[INFO]
[INFO] --- maven-resources-plugin:3.1.0:resources (default-resources) @ spring-cloud-aws-parameter-store-config ---
[INFO] Using 'UTF-8' encoding to copy filtered resources.
[INFO] skip non existing resourceDirectory C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-parameter-store-config\src\main\resources
[INFO] skip non existing resourceDirectory C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-parameter-store-config\src\main\resources
[INFO]
[INFO] --- maven-compiler-plugin:3.8.1:compile (default-compile) @ spring-cloud-aws-parameter-store-config ---
[INFO] Changes detected - recompiling the module!
[INFO] Compiling 4 source files to C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-parameter-store-config\target\classes
[INFO]
[INFO] --- maven-resources-plugin:3.1.0:testResources (default-testResources) @ spring-cloud-aws-parameter-store-config ---
[INFO] Using 'UTF-8' encoding to copy filtered resources.
[INFO] skip non existing resourceDirectory C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-parameter-store-config\src\test\resources
[INFO]
[INFO] --- maven-compiler-plugin:3.8.1:testCompile (default-testCompile) @ spring-cloud-aws-parameter-store-config ---
[INFO] Changes detected - recompiling the module!
[INFO] Compiling 3 source files to C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-parameter-store-config\target\test-classes
[INFO]
[INFO] --- maven-surefire-plugin:2.22.2:test (default-test) @ spring-cloud-aws-parameter-store-config ---
[INFO]
[INFO] -------------------------------------------------------
[INFO]  T E S T S
[INFO] -------------------------------------------------------
[INFO] Running org.springframework.cloud.aws.paramstore.AwsParamStorePropertiesTest
[INFO] Tests run: 8, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.268 s - in org.springframework.cloud.aws.paramstore.AwsParamStorePropertiesTest
[INFO] Running org.springframework.cloud.aws.paramstore.AwsParamStorePropertySourceLocatorTest
12:35:19.403 [main] DEBUG org.springframework.mock.env.MockEnvironment - Activating profiles [test]
12:35:19.408 [main] INFO org.springframework.cloud.aws.paramstore.AwsParamStorePropertySourceLocator - Loading property from AWS Parameter Store with name: application/messaging-service_test/, optional: false
12:35:19.413 [main] DEBUG org.springframework.cloud.aws.paramstore.AwsParamStorePropertySource - Populating property retrieved from AWS Parameter Store: .config.myservice.key3
12:35:19.414 [main] DEBUG org.springframework.cloud.aws.paramstore.AwsParamStorePropertySource - Populating property retrieved from AWS Parameter Store: .config.myservice.key4
12:35:19.415 [main] INFO org.springframework.cloud.aws.paramstore.AwsParamStorePropertySourceLocator - Loading property from AWS Parameter Store with name: application/messaging-service/, optional: false
12:35:19.415 [main] DEBUG org.springframework.cloud.aws.paramstore.AwsParamStorePropertySource - Populating property retrieved from AWS Parameter Store: .config.myservice.key3
12:35:19.415 [main] DEBUG org.springframework.cloud.aws.paramstore.AwsParamStorePropertySource - Populating property retrieved from AWS Parameter Store: .config.myservice.key4
12:35:19.415 [main] INFO org.springframework.cloud.aws.paramstore.AwsParamStorePropertySourceLocator - Loading property from AWS Parameter Store with name: application/application_test/, optional: false
12:35:19.415 [main] DEBUG org.springframework.cloud.aws.paramstore.AwsParamStorePropertySource - Populating property retrieved from AWS Parameter Store: .config.myservice.key3
12:35:19.415 [main] DEBUG org.springframework.cloud.aws.paramstore.AwsParamStorePropertySource - Populating property retrieved from AWS Parameter Store: .config.myservice.key4
12:35:19.415 [main] INFO org.springframework.cloud.aws.paramstore.AwsParamStorePropertySourceLocator - Loading property from AWS Parameter Store with name: application/application/, optional: false
12:35:19.415 [main] DEBUG org.springframework.cloud.aws.paramstore.AwsParamStorePropertySource - Populating property retrieved from AWS Parameter Store: .config.myservice.key3
12:35:19.415 [main] DEBUG org.springframework.cloud.aws.paramstore.AwsParamStorePropertySource - Populating property retrieved from AWS Parameter Store: .config.myservice.key4
12:35:19.418 [main] DEBUG org.springframework.mock.env.MockEnvironment - Activating profiles [test]
12:35:19.418 [main] INFO org.springframework.cloud.aws.paramstore.AwsParamStorePropertySourceLocator - Loading property from AWS Parameter Store with name: application/messaging-service_test/, optional: false
12:35:19.418 [main] DEBUG org.springframework.cloud.aws.paramstore.AwsParamStorePropertySource - Populating property retrieved from AWS Parameter Store: .config.myservice.key3
12:35:19.418 [main] DEBUG org.springframework.cloud.aws.paramstore.AwsParamStorePropertySource - Populating property retrieved from AWS Parameter Store: .config.myservice.key4
12:35:19.418 [main] INFO org.springframework.cloud.aws.paramstore.AwsParamStorePropertySourceLocator - Loading property from AWS Parameter Store with name: application/messaging-service/, optional: false
12:35:19.418 [main] DEBUG org.springframework.cloud.aws.paramstore.AwsParamStorePropertySource - Populating property retrieved from AWS Parameter Store: .config.myservice.key3
12:35:19.418 [main] DEBUG org.springframework.cloud.aws.paramstore.AwsParamStorePropertySource - Populating property retrieved from AWS Parameter Store: .config.myservice.key4
12:35:19.418 [main] INFO org.springframework.cloud.aws.paramstore.AwsParamStorePropertySourceLocator - Loading property from AWS Parameter Store with name: application/application_test/, optional: false
12:35:19.418 [main] DEBUG org.springframework.cloud.aws.paramstore.AwsParamStorePropertySource - Populating property retrieved from AWS Parameter Store: .config.myservice.key3
12:35:19.418 [main] DEBUG org.springframework.cloud.aws.paramstore.AwsParamStorePropertySource - Populating property retrieved from AWS Parameter Store: .config.myservice.key4
12:35:19.419 [main] INFO org.springframework.cloud.aws.paramstore.AwsParamStorePropertySourceLocator - Loading property from AWS Parameter Store with name: application/application/, optional: false
12:35:19.419 [main] DEBUG org.springframework.cloud.aws.paramstore.AwsParamStorePropertySource - Populating property retrieved from AWS Parameter Store: .config.myservice.key3
12:35:19.419 [main] DEBUG org.springframework.cloud.aws.paramstore.AwsParamStorePropertySource - Populating property retrieved from AWS Parameter Store: .config.myservice.key4
12:35:19.422 [main] INFO org.springframework.cloud.aws.paramstore.AwsParamStorePropertySourceLocator - Loading property from AWS Parameter Store with name: /config/null/, optional: false
12:35:19.425 [main] INFO org.springframework.cloud.aws.paramstore.AwsParamStorePropertySourceLocator - Loading property from AWS Parameter Store with name: /config/null/, optional: true
12:35:19.425 [main] WARN org.springframework.cloud.aws.paramstore.AwsParamStorePropertySourceLocator - Unable to load AWS parameter from /config/null/. null
12:35:19.425 [main] INFO org.springframework.cloud.aws.paramstore.AwsParamStorePropertySourceLocator - Loading property from AWS Parameter Store with name: /config/application/, optional: true
12:35:19.426 [main] WARN org.springframework.cloud.aws.paramstore.AwsParamStorePropertySourceLocator - Unable to load AWS parameter from /config/application/. null
12:35:19.428 [main] DEBUG org.springframework.mock.env.MockEnvironment - Activating profiles [test]
12:35:19.429 [main] INFO org.springframework.cloud.aws.paramstore.AwsParamStorePropertySourceLocator - Loading property from AWS Parameter Store with name: application/application_test/, optional: false
12:35:19.429 [main] DEBUG org.springframework.cloud.aws.paramstore.AwsParamStorePropertySource - Populating property retrieved from AWS Parameter Store: .config.myservice.key3
12:35:19.429 [main] DEBUG org.springframework.cloud.aws.paramstore.AwsParamStorePropertySource - Populating property retrieved from AWS Parameter Store: .config.myservice.key4
12:35:19.429 [main] INFO org.springframework.cloud.aws.paramstore.AwsParamStorePropertySourceLocator - Loading property from AWS Parameter Store with name: application/application/, optional: false
12:35:19.429 [main] DEBUG org.springframework.cloud.aws.paramstore.AwsParamStorePropertySource - Populating property retrieved from AWS Parameter Store: .config.myservice.key3
12:35:19.429 [main] DEBUG org.springframework.cloud.aws.paramstore.AwsParamStorePropertySource - Populating property retrieved from AWS Parameter Store: .config.myservice.key4
[INFO] Tests run: 5, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.648 s - in org.springframework.cloud.aws.paramstore.AwsParamStorePropertySourceLocatorTest
[INFO] Running org.springframework.cloud.aws.paramstore.AwsParamStorePropertySourceTest
12:35:19.432 [main] DEBUG org.springframework.cloud.aws.paramstore.AwsParamStorePropertySource - Populating property retrieved from AWS Parameter Store: key1
12:35:19.432 [main] DEBUG org.springframework.cloud.aws.paramstore.AwsParamStorePropertySource - Populating property retrieved from AWS Parameter Store: key2
12:35:19.432 [main] DEBUG org.springframework.cloud.aws.paramstore.AwsParamStorePropertySource - Populating property retrieved from AWS Parameter Store: key3
12:35:19.432 [main] DEBUG org.springframework.cloud.aws.paramstore.AwsParamStorePropertySource - Populating property retrieved from AWS Parameter Store: key4
[INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.016 s - in org.springframework.cloud.aws.paramstore.AwsParamStorePropertySourceTest
[INFO]
[INFO] Results:
[INFO]
[INFO] Tests run: 14, Failures: 0, Errors: 0, Skipped: 0
[INFO]
[INFO]
[INFO] --- maven-jar-plugin:3.2.0:jar (default-jar) @ spring-cloud-aws-parameter-store-config ---
[INFO] Building jar: C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-parameter-store-config\target\spring-cloud-aws-parameter-store-config-3.0.0-SNAPSHOT.jar
[INFO]
[INFO] --- maven-javadoc-plugin:3.2.0:jar (javadoc) @ spring-cloud-aws-parameter-store-config ---
[INFO] No previous run data found, generating javadoc.
[INFO]
Loading source file C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-parameter-store-config\src\main\java\org\springframework\cloud\aws\paramstore\AwsParamStoreProperties.java...
Loading source file C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-parameter-store-config\src\main\java\org\springframework\cloud\aws\paramstore\AwsParamStorePropertySource.java...
Loading source file C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-parameter-store-config\src\main\java\org\springframework\cloud\aws\paramstore\AwsParamStorePropertySourceLocator.java...
Loading source file C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-parameter-store-config\src\main\java\org\springframework\cloud\aws\paramstore\AwsParamStorePropertySources.java...
Constructing Javadoc information...
Standard Doclet version 1.8.0_291
Building tree for all the packages and classes...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-parameter-store-config\target\apidocs\org\springframework\cloud\aws\paramstore\AwsParamStoreProperties.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-parameter-store-config\target\apidocs\org\springframework\cloud\aws\paramstore\AwsParamStorePropertySource.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-parameter-store-config\target\apidocs\org\springframework\cloud\aws\paramstore\AwsParamStorePropertySourceLocator.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-parameter-store-config\target\apidocs\org\springframework\cloud\aws\paramstore\AwsParamStorePropertySources.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-parameter-store-config\target\apidocs\org\springframework\cloud\aws\paramstore\package-frame.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-parameter-store-config\target\apidocs\org\springframework\cloud\aws\paramstore\package-summary.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-parameter-store-config\target\apidocs\org\springframework\cloud\aws\paramstore\package-tree.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-parameter-store-config\target\apidocs\constant-values.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-parameter-store-config\target\apidocs\org\springframework\cloud\aws\paramstore\class-use\AwsParamStoreProperties.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-parameter-store-config\target\apidocs\org\springframework\cloud\aws\paramstore\class-use\AwsParamStorePropertySource.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-parameter-store-config\target\apidocs\org\springframework\cloud\aws\paramstore\class-use\AwsParamStorePropertySourceLocator.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-parameter-store-config\target\apidocs\org\springframework\cloud\aws\paramstore\class-use\AwsParamStorePropertySources.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-parameter-store-config\target\apidocs\org\springframework\cloud\aws\paramstore\package-use.html...
Building index for all the packages and classes...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-parameter-store-config\target\apidocs\overview-tree.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-parameter-store-config\target\apidocs\index-all.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-parameter-store-config\target\apidocs\deprecated-list.html...
Building index for all classes...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-parameter-store-config\target\apidocs\allclasses-frame.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-parameter-store-config\target\apidocs\allclasses-noframe.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-parameter-store-config\target\apidocs\index.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-parameter-store-config\target\apidocs\help-doc.html...
[INFO] Building jar: C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-parameter-store-config\target\spring-cloud-aws-parameter-store-config-3.0.0-SNAPSHOT-javadoc.jar
[INFO]
[INFO] >>> maven-source-plugin:3.2.1:jar (attach-sources) > generate-sources @ spring-cloud-aws-parameter-store-config >>>
[INFO]
[INFO] --- maven-checkstyle-plugin:3.1.0:check (checkstyle-validation) @ spring-cloud-aws-parameter-store-config ---
[INFO] Starting audit...
Audit done.
[INFO]
[INFO] --- maven-checkstyle-plugin:3.1.0:check (no-http-checkstyle-validation) @ spring-cloud-aws-parameter-store-config ---
[INFO]
[INFO] --- spring-javaformat-maven-plugin:0.0.25:validate (default) @ spring-cloud-aws-parameter-store-config ---
[INFO]
[INFO] --- spring-javaformat-maven-plugin:0.0.25:apply (default) @ spring-cloud-aws-parameter-store-config ---
[INFO]
[INFO] <<< maven-source-plugin:3.2.1:jar (attach-sources) < generate-sources @ spring-cloud-aws-parameter-store-config <<<
[INFO]
[INFO]
[INFO] --- maven-source-plugin:3.2.1:jar (attach-sources) @ spring-cloud-aws-parameter-store-config ---
[INFO] Building jar: C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-parameter-store-config\target\spring-cloud-aws-parameter-store-config-3.0.0-SNAPSHOT-sources.jar
[INFO]
[INFO] -----------< org.springframework.cloud:spring-cloud-aws-ses >-----------
[INFO] Building Spring Cloud AWS SimpleEmail 3.0.0-SNAPSHOT              [8/18]
[INFO] --------------------------------[ jar ]---------------------------------
[INFO]
[INFO] --- maven-clean-plugin:2.5:clean (default-clean) @ spring-cloud-aws-ses ---
[INFO]
[INFO] --- maven-checkstyle-plugin:3.1.0:check (checkstyle-validation) @ spring-cloud-aws-ses ---
[INFO] Starting audit...
Audit done.
[INFO]
[INFO] --- maven-checkstyle-plugin:3.1.0:check (no-http-checkstyle-validation) @ spring-cloud-aws-ses ---
[INFO]
[INFO] --- spring-javaformat-maven-plugin:0.0.25:validate (default) @ spring-cloud-aws-ses ---
[INFO]
[INFO] --- spring-javaformat-maven-plugin:0.0.25:apply (default) @ spring-cloud-aws-ses ---
[INFO]
[INFO] --- maven-resources-plugin:3.1.0:resources (default-resources) @ spring-cloud-aws-ses ---
[INFO] Using 'UTF-8' encoding to copy filtered resources.
[INFO] skip non existing resourceDirectory C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-ses\src\main\resources
[INFO] skip non existing resourceDirectory C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-ses\src\main\resources
[INFO]
[INFO] --- maven-compiler-plugin:3.8.1:compile (default-compile) @ spring-cloud-aws-ses ---
[INFO] Changes detected - recompiling the module!
[INFO] Compiling 2 source files to C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-ses\target\classes
[INFO]
[INFO] --- maven-resources-plugin:3.1.0:testResources (default-testResources) @ spring-cloud-aws-ses ---
[INFO] Using 'UTF-8' encoding to copy filtered resources.
[INFO] skip non existing resourceDirectory C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-ses\src\test\resources
[INFO]
[INFO] --- maven-compiler-plugin:3.8.1:testCompile (default-testCompile) @ spring-cloud-aws-ses ---
[INFO] Changes detected - recompiling the module!
[INFO] Compiling 2 source files to C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-ses\target\test-classes
[WARNING] /C:/Users/jstupar/my_spring_cloud_aws/spring-cloud-aws/spring-cloud-aws-ses/src/test/java/org/springframework/cloud/aws/ses/SimpleEmailServiceJavaMailSenderTest.java:[40,53] org.springframework.cloud.aws.mail.simplemail.SimpleEmailServiceJavaMailSender in org.springframework.cloud.aws.mail.simplemail has been deprecated
[WARNING] /C:/Users/jstupar/my_spring_cloud_aws/spring-cloud-aws/spring-cloud-aws-ses/src/test/java/org/springframework/cloud/aws/ses/SimpleEmailServiceMailSenderTest.java:[27,53] org.springframework.cloud.aws.mail.simplemail.SimpleEmailServiceMailSender in org.springframework.cloud.aws.mail.simplemail has been deprecated
[WARNING] /C:/Users/jstupar/my_spring_cloud_aws/spring-cloud-aws/spring-cloud-aws-ses/src/test/java/org/springframework/cloud/aws/ses/SimpleEmailServiceJavaMailSenderTest.java:[63,49] org.springframework.cloud.aws.mail.simplemail.SimpleEmailServiceJavaMailSender in org.springframework.cloud.aws.mail.simplemail has been deprecated
[WARNING] /C:/Users/jstupar/my_spring_cloud_aws/spring-cloud-aws/spring-cloud-aws-ses/src/test/java/org/springframework/cloud/aws/ses/SimpleEmailServiceJavaMailSenderTest.java:[79,17] org.springframework.cloud.aws.mail.simplemail.SimpleEmailServiceJavaMailSender in org.springframework.cloud.aws.mail.simplemail has been deprecated
[WARNING] /C:/Users/jstupar/my_spring_cloud_aws/spring-cloud-aws/spring-cloud-aws-ses/src/test/java/org/springframework/cloud/aws/ses/SimpleEmailServiceJavaMailSenderTest.java:[79,67] org.springframework.cloud.aws.mail.simplemail.SimpleEmailServiceJavaMailSender in org.springframework.cloud.aws.mail.simplemail has been deprecated
[WARNING] /C:/Users/jstupar/my_spring_cloud_aws/spring-cloud-aws/spring-cloud-aws-ses/src/test/java/org/springframework/cloud/aws/ses/SimpleEmailServiceJavaMailSenderTest.java:[95,17] org.springframework.cloud.aws.mail.simplemail.SimpleEmailServiceJavaMailSender in org.springframework.cloud.aws.mail.simplemail has been deprecated
[WARNING] /C:/Users/jstupar/my_spring_cloud_aws/spring-cloud-aws/spring-cloud-aws-ses/src/test/java/org/springframework/cloud/aws/ses/SimpleEmailServiceJavaMailSenderTest.java:[95,67] org.springframework.cloud.aws.mail.simplemail.SimpleEmailServiceJavaMailSender in org.springframework.cloud.aws.mail.simplemail has been deprecated
[WARNING] /C:/Users/jstupar/my_spring_cloud_aws/spring-cloud-aws/spring-cloud-aws-ses/src/test/java/org/springframework/cloud/aws/ses/SimpleEmailServiceJavaMailSenderTest.java:[108,17] org.springframework.cloud.aws.mail.simplemail.SimpleEmailServiceJavaMailSender in org.springframework.cloud.aws.mail.simplemail has been deprecated
[WARNING] /C:/Users/jstupar/my_spring_cloud_aws/spring-cloud-aws/spring-cloud-aws-ses/src/test/java/org/springframework/cloud/aws/ses/SimpleEmailServiceJavaMailSenderTest.java:[108,67] org.springframework.cloud.aws.mail.simplemail.SimpleEmailServiceJavaMailSender in org.springframework.cloud.aws.mail.simplemail has been deprecated
[WARNING] /C:/Users/jstupar/my_spring_cloud_aws/spring-cloud-aws/spring-cloud-aws-ses/src/test/java/org/springframework/cloud/aws/ses/SimpleEmailServiceJavaMailSenderTest.java:[122,17] org.springframework.cloud.aws.mail.simplemail.SimpleEmailServiceJavaMailSender in org.springframework.cloud.aws.mail.simplemail has been deprecated
[WARNING] /C:/Users/jstupar/my_spring_cloud_aws/spring-cloud-aws/spring-cloud-aws-ses/src/test/java/org/springframework/cloud/aws/ses/SimpleEmailServiceJavaMailSenderTest.java:[122,67] org.springframework.cloud.aws.mail.simplemail.SimpleEmailServiceJavaMailSender in org.springframework.cloud.aws.mail.simplemail has been deprecated
[WARNING] /C:/Users/jstupar/my_spring_cloud_aws/spring-cloud-aws/spring-cloud-aws-ses/src/test/java/org/springframework/cloud/aws/ses/SimpleEmailServiceJavaMailSenderTest.java:[135,49] org.springframework.cloud.aws.mail.simplemail.SimpleEmailServiceJavaMailSender in org.springframework.cloud.aws.mail.simplemail has been deprecated
[WARNING] /C:/Users/jstupar/my_spring_cloud_aws/spring-cloud-aws/spring-cloud-aws-ses/src/test/java/org/springframework/cloud/aws/ses/SimpleEmailServiceJavaMailSenderTest.java:[152,49] org.springframework.cloud.aws.mail.simplemail.SimpleEmailServiceJavaMailSender in org.springframework.cloud.aws.mail.simplemail has been deprecated
[WARNING] /C:/Users/jstupar/my_spring_cloud_aws/spring-cloud-aws/spring-cloud-aws-ses/src/test/java/org/springframework/cloud/aws/ses/SimpleEmailServiceJavaMailSenderTest.java:[164,49] org.springframework.cloud.aws.mail.simplemail.SimpleEmailServiceJavaMailSender in org.springframework.cloud.aws.mail.simplemail has been deprecated
[WARNING] /C:/Users/jstupar/my_spring_cloud_aws/spring-cloud-aws/spring-cloud-aws-ses/src/test/java/org/springframework/cloud/aws/ses/SimpleEmailServiceJavaMailSenderTest.java:[176,49] org.springframework.cloud.aws.mail.simplemail.SimpleEmailServiceJavaMailSender in org.springframework.cloud.aws.mail.simplemail has been deprecated
[WARNING] /C:/Users/jstupar/my_spring_cloud_aws/spring-cloud-aws/spring-cloud-aws-ses/src/test/java/org/springframework/cloud/aws/ses/SimpleEmailServiceJavaMailSenderTest.java:[202,49] org.springframework.cloud.aws.mail.simplemail.SimpleEmailServiceJavaMailSender in org.springframework.cloud.aws.mail.simplemail has been deprecated
[WARNING] /C:/Users/jstupar/my_spring_cloud_aws/spring-cloud-aws/spring-cloud-aws-ses/src/test/java/org/springframework/cloud/aws/ses/SimpleEmailServiceJavaMailSenderTest.java:[239,49] org.springframework.cloud.aws.mail.simplemail.SimpleEmailServiceJavaMailSender in org.springframework.cloud.aws.mail.simplemail has been deprecated
[WARNING] /C:/Users/jstupar/my_spring_cloud_aws/spring-cloud-aws/spring-cloud-aws-ses/src/test/java/org/springframework/cloud/aws/ses/SimpleEmailServiceJavaMailSenderTest.java:[259,49] org.springframework.cloud.aws.mail.simplemail.SimpleEmailServiceJavaMailSender in org.springframework.cloud.aws.mail.simplemail has been deprecated
[WARNING] /C:/Users/jstupar/my_spring_cloud_aws/spring-cloud-aws/spring-cloud-aws-ses/src/test/java/org/springframework/cloud/aws/ses/SimpleEmailServiceJavaMailSenderTest.java:[280,49] org.springframework.cloud.aws.mail.simplemail.SimpleEmailServiceJavaMailSender in org.springframework.cloud.aws.mail.simplemail has been deprecated
[WARNING] /C:/Users/jstupar/my_spring_cloud_aws/spring-cloud-aws/spring-cloud-aws-ses/src/test/java/org/springframework/cloud/aws/ses/SimpleEmailServiceMailSenderTest.java:[46,62] org.springframework.cloud.aws.mail.simplemail.SimpleEmailServiceMailSender in org.springframework.cloud.aws.mail.simplemail has been deprecated
[WARNING] /C:/Users/jstupar/my_spring_cloud_aws/spring-cloud-aws/spring-cloud-aws-ses/src/test/java/org/springframework/cloud/aws/ses/SimpleEmailServiceMailSenderTest.java:[46,154] org.springframework.cloud.aws.mail.simplemail.SimpleEmailServiceMailSender in org.springframework.cloud.aws.mail.simplemail has been deprecated
[WARNING] /C:/Users/jstupar/my_spring_cloud_aws/spring-cloud-aws/spring-cloud-aws-ses/src/test/java/org/springframework/cloud/aws/ses/SimpleEmailServiceMailSenderTest.java:[68,62] org.springframework.cloud.aws.mail.simplemail.SimpleEmailServiceMailSender in org.springframework.cloud.aws.mail.simplemail has been deprecated
[WARNING] /C:/Users/jstupar/my_spring_cloud_aws/spring-cloud-aws/spring-cloud-aws-ses/src/test/java/org/springframework/cloud/aws/ses/SimpleEmailServiceMailSenderTest.java:[68,154] org.springframework.cloud.aws.mail.simplemail.SimpleEmailServiceMailSender in org.springframework.cloud.aws.mail.simplemail has been deprecated
[WARNING] /C:/Users/jstupar/my_spring_cloud_aws/spring-cloud-aws/spring-cloud-aws-ses/src/test/java/org/springframework/cloud/aws/ses/SimpleEmailServiceMailSenderTest.java:[92,62] org.springframework.cloud.aws.mail.simplemail.SimpleEmailServiceMailSender in org.springframework.cloud.aws.mail.simplemail has been deprecated
[WARNING] /C:/Users/jstupar/my_spring_cloud_aws/spring-cloud-aws/spring-cloud-aws-ses/src/test/java/org/springframework/cloud/aws/ses/SimpleEmailServiceMailSenderTest.java:[92,154] org.springframework.cloud.aws.mail.simplemail.SimpleEmailServiceMailSender in org.springframework.cloud.aws.mail.simplemail has been deprecated
[WARNING] /C:/Users/jstupar/my_spring_cloud_aws/spring-cloud-aws/spring-cloud-aws-ses/src/test/java/org/springframework/cloud/aws/ses/SimpleEmailServiceMailSenderTest.java:[105,62] org.springframework.cloud.aws.mail.simplemail.SimpleEmailServiceMailSender in org.springframework.cloud.aws.mail.simplemail has been deprecated
[WARNING] /C:/Users/jstupar/my_spring_cloud_aws/spring-cloud-aws/spring-cloud-aws-ses/src/test/java/org/springframework/cloud/aws/ses/SimpleEmailServiceMailSenderTest.java:[105,154] org.springframework.cloud.aws.mail.simplemail.SimpleEmailServiceMailSender in org.springframework.cloud.aws.mail.simplemail has been deprecated
[WARNING] /C:/Users/jstupar/my_spring_cloud_aws/spring-cloud-aws/spring-cloud-aws-ses/src/test/java/org/springframework/cloud/aws/ses/SimpleEmailServiceMailSenderTest.java:[130,62] org.springframework.cloud.aws.mail.simplemail.SimpleEmailServiceMailSender in org.springframework.cloud.aws.mail.simplemail has been deprecated
[WARNING] /C:/Users/jstupar/my_spring_cloud_aws/spring-cloud-aws/spring-cloud-aws-ses/src/test/java/org/springframework/cloud/aws/ses/SimpleEmailServiceMailSenderTest.java:[130,109] org.springframework.cloud.aws.mail.simplemail.SimpleEmailServiceMailSender in org.springframework.cloud.aws.mail.simplemail has been deprecated
[INFO]
[INFO] --- maven-surefire-plugin:2.22.2:test (default-test) @ spring-cloud-aws-ses ---
[INFO]
[INFO] -------------------------------------------------------
[INFO]  T E S T S
[INFO] -------------------------------------------------------
[INFO] Running org.springframework.cloud.aws.ses.SimpleEmailServiceJavaMailSenderTest
12:35:24.072 [main] DEBUG org.springframework.cloud.aws.mail.simplemail.SimpleEmailServiceMailSender - Message with id: 123 successfully send
12:35:24.189 [main] DEBUG org.springframework.cloud.aws.mail.simplemail.SimpleEmailServiceMailSender - Message with id: null successfully send
12:35:24.190 [main] DEBUG org.springframework.cloud.aws.mail.simplemail.SimpleEmailServiceMailSender - Message with id: null successfully send
12:35:24.237 [main] DEBUG org.springframework.cloud.aws.mail.simplemail.SimpleEmailServiceMailSender - Message with id: 123 successfully send
12:35:24.253 [main] DEBUG org.springframework.cloud.aws.mail.simplemail.SimpleEmailServiceMailSender - Message with id: 123 successfully send
12:35:24.253 [main] DEBUG org.springframework.cloud.aws.mail.simplemail.SimpleEmailServiceMailSender - Message with id: 123 successfully send
12:35:24.276 [main] DEBUG org.springframework.cloud.aws.mail.simplemail.SimpleEmailServiceMailSender - Message with id: 123 successfully send
[INFO] Tests run: 13, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.915 s - in org.springframework.cloud.aws.ses.SimpleEmailServiceJavaMailSenderTest
[INFO] Running org.springframework.cloud.aws.ses.SimpleEmailServiceMailSenderTest
12:35:24.293 [main] DEBUG org.springframework.cloud.aws.mail.simplemail.SimpleEmailServiceMailSender - Message with id: 123 successfully send
12:35:24.293 [main] DEBUG org.springframework.cloud.aws.mail.simplemail.SimpleEmailServiceMailSender - Message with id: 123 successfully send
12:35:24.294 [main] DEBUG org.springframework.cloud.aws.mail.simplemail.SimpleEmailServiceMailSender - Message with id: null successfully send
12:35:24.297 [main] DEBUG org.springframework.cloud.aws.mail.simplemail.SimpleEmailServiceMailSender - Message with id: null successfully send
12:35:24.298 [main] DEBUG org.springframework.cloud.aws.mail.simplemail.SimpleEmailServiceMailSender - Message with id: 123 successfully send
12:35:24.301 [main] DEBUG org.springframework.cloud.aws.mail.simplemail.SimpleEmailServiceMailSender - Message with id: 123 successfully send
[INFO] Tests run: 5, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.008 s - in org.springframework.cloud.aws.ses.SimpleEmailServiceMailSenderTest
[INFO]
[INFO] Results:
[INFO]
[INFO] Tests run: 18, Failures: 0, Errors: 0, Skipped: 0
[INFO]
[INFO]
[INFO] --- maven-jar-plugin:3.2.0:jar (default-jar) @ spring-cloud-aws-ses ---
[INFO] Building jar: C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-ses\target\spring-cloud-aws-ses-3.0.0-SNAPSHOT.jar
[INFO]
[INFO] --- maven-javadoc-plugin:3.2.0:jar (javadoc) @ spring-cloud-aws-ses ---
[INFO] No previous run data found, generating javadoc.
[INFO]
Loading source file C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-ses\src\main\java\org\springframework\cloud\aws\ses\SimpleEmailServiceJavaMailSender.java...
Loading source file C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-ses\src\main\java\org\springframework\cloud\aws\ses\SimpleEmailServiceMailSender.java...
Constructing Javadoc information...
Standard Doclet version 1.8.0_291
Building tree for all the packages and classes...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-ses\target\apidocs\org\springframework\cloud\aws\ses\SimpleEmailServiceJavaMailSender.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-ses\target\apidocs\org\springframework\cloud\aws\ses\SimpleEmailServiceMailSender.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-ses\target\apidocs\org\springframework\cloud\aws\ses\package-frame.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-ses\target\apidocs\org\springframework\cloud\aws\ses\package-summary.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-ses\target\apidocs\org\springframework\cloud\aws\ses\package-tree.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-ses\target\apidocs\constant-values.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-ses\target\apidocs\org\springframework\cloud\aws\ses\class-use\SimpleEmailServiceJavaMailSender.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-ses\target\apidocs\org\springframework\cloud\aws\ses\class-use\SimpleEmailServiceMailSender.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-ses\target\apidocs\org\springframework\cloud\aws\ses\package-use.html...
Building index for all the packages and classes...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-ses\target\apidocs\overview-tree.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-ses\target\apidocs\index-all.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-ses\target\apidocs\deprecated-list.html...
Building index for all classes...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-ses\target\apidocs\allclasses-frame.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-ses\target\apidocs\allclasses-noframe.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-ses\target\apidocs\index.html...
Generating C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-ses\target\apidocs\help-doc.html...
[INFO] Building jar: C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-ses\target\spring-cloud-aws-ses-3.0.0-SNAPSHOT-javadoc.jar
[INFO]
[INFO] >>> maven-source-plugin:3.2.1:jar (attach-sources) > generate-sources @ spring-cloud-aws-ses >>>
[INFO]
[INFO] --- maven-checkstyle-plugin:3.1.0:check (checkstyle-validation) @ spring-cloud-aws-ses ---
[INFO] Starting audit...
Audit done.
[INFO]
[INFO] --- maven-checkstyle-plugin:3.1.0:check (no-http-checkstyle-validation) @ spring-cloud-aws-ses ---
[INFO]
[INFO] --- spring-javaformat-maven-plugin:0.0.25:validate (default) @ spring-cloud-aws-ses ---
[INFO]
[INFO] --- spring-javaformat-maven-plugin:0.0.25:apply (default) @ spring-cloud-aws-ses ---
[INFO]
[INFO] <<< maven-source-plugin:3.2.1:jar (attach-sources) < generate-sources @ spring-cloud-aws-ses <<<
[INFO]
[INFO]
[INFO] --- maven-source-plugin:3.2.1:jar (attach-sources) @ spring-cloud-aws-ses ---
[INFO] Building jar: C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-ses\target\spring-cloud-aws-ses-3.0.0-SNAPSHOT-sources.jar
[INFO]
[INFO] ------< org.springframework.cloud:spring-cloud-aws-autoconfigure >------
[INFO] Building Spring Cloud AWS Autoconfigure 3.0.0-SNAPSHOT            [9/18]
[INFO] --------------------------------[ jar ]---------------------------------
Downloading from spring-milestones: https://repo.spring.io/libs-milestone-local/org/springframework/boot/spring-boot-actuator-autoconfigure/2.4.0/spring-boot-actuator-autoconfigure-2.4.0.pom
Downloading from spring-releases: https://repo.spring.io/release/org/springframework/boot/spring-boot-actuator-autoconfigure/2.4.0/spring-boot-actuator-autoconfigure-2.4.0.pom
Downloaded from spring-releases: https://repo.spring.io/release/org/springframework/boot/spring-boot-actuator-autoconfigure/2.4.0/spring-boot-actuator-autoconfigure-2.4.0.pom (2.9 kB at 8.5 kB/s)
Downloading from spring-milestones: https://repo.spring.io/libs-milestone-local/org/springframework/boot/spring-boot-actuator/2.4.0/spring-boot-actuator-2.4.0.pom
Downloading from spring-releases: https://repo.spring.io/release/org/springframework/boot/spring-boot-actuator/2.4.0/spring-boot-actuator-2.4.0.pom
Downloaded from spring-releases: https://repo.spring.io/release/org/springframework/boot/spring-boot-actuator/2.4.0/spring-boot-actuator-2.4.0.pom (2.1 kB at 7.2 kB/s)
Downloading from spring-milestones: https://repo.spring.io/libs-milestone-local/org/springframework/security/spring-security-config/5.4.1/spring-security-config-5.4.1.pom
Downloading from spring-releases: https://repo.spring.io/release/org/springframework/security/spring-security-config/5.4.1/spring-security-config-5.4.1.pom
Downloaded from spring-releases: https://repo.spring.io/release/org/springframework/security/spring-security-config/5.4.1/spring-security-config-5.4.1.pom (17 kB at 33 kB/s)
Downloading from spring-milestones: https://repo.spring.io/libs-milestone-local/org/springframework/security/spring-security-core/5.4.1/spring-security-core-5.4.1.pom
Downloading from spring-releases: https://repo.spring.io/release/org/springframework/security/spring-security-core/5.4.1/spring-security-core-5.4.1.pom
Downloaded from spring-releases: https://repo.spring.io/release/org/springframework/security/spring-security-core/5.4.1/spring-security-core-5.4.1.pom (6.8 kB at 22 kB/s)
Downloading from spring-milestones: https://repo.spring.io/libs-milestone-local/org/springframework/security/spring-security-oauth2-jose/5.4.1/spring-security-oauth2-jose-5.4.1.pom
Downloading from spring-releases: https://repo.spring.io/release/org/springframework/security/spring-security-oauth2-jose/5.4.1/spring-security-oauth2-jose-5.4.1.pom
Downloaded from spring-releases: https://repo.spring.io/release/org/springframework/security/spring-security-oauth2-jose/5.4.1/spring-security-oauth2-jose-5.4.1.pom (5.4 kB at 13 kB/s)
Downloading from spring-milestones: https://repo.spring.io/libs-milestone-local/com/nimbusds/nimbus-jose-jwt/9.1.2/nimbus-jose-jwt-9.1.2.pom
Downloading from spring-releases: https://repo.spring.io/release/com/nimbusds/nimbus-jose-jwt/9.1.2/nimbus-jose-jwt-9.1.2.pom
Downloading from spring-plugins: https://repo.spring.io/plugins/com/nimbusds/nimbus-jose-jwt/9.1.2/nimbus-jose-jwt-9.1.2.pom
Downloading from central: https://repo.maven.apache.org/maven2/com/nimbusds/nimbus-jose-jwt/9.1.2/nimbus-jose-jwt-9.1.2.pom
Downloaded from central: https://repo.maven.apache.org/maven2/com/nimbusds/nimbus-jose-jwt/9.1.2/nimbus-jose-jwt-9.1.2.pom (10 kB at 100 kB/s)
Downloading from spring-milestones: https://repo.spring.io/libs-milestone-local/com/github/stephenc/jcip/jcip-annotations/1.0-1/jcip-annotations-1.0-1.pom
Downloading from spring-releases: https://repo.spring.io/release/com/github/stephenc/jcip/jcip-annotations/1.0-1/jcip-annotations-1.0-1.pom
Downloading from spring-plugins: https://repo.spring.io/plugins/com/github/stephenc/jcip/jcip-annotations/1.0-1/jcip-annotations-1.0-1.pom
Downloading from central: https://repo.maven.apache.org/maven2/com/github/stephenc/jcip/jcip-annotations/1.0-1/jcip-annotations-1.0-1.pom
Downloaded from central: https://repo.maven.apache.org/maven2/com/github/stephenc/jcip/jcip-annotations/1.0-1/jcip-annotations-1.0-1.pom (5.4 kB at 70 kB/s)
Downloading from spring-milestones: https://repo.spring.io/libs-milestone-local/org/springframework/security/spring-security-oauth2-core/5.4.1/spring-security-oauth2-core-5.4.1.pom
Downloading from spring-releases: https://repo.spring.io/release/org/springframework/security/spring-security-oauth2-core/5.4.1/spring-security-oauth2-core-5.4.1.pom
Downloaded from spring-releases: https://repo.spring.io/release/org/springframework/security/spring-security-oauth2-core/5.4.1/spring-security-oauth2-core-5.4.1.pom (4.9 kB at 9.6 kB/s)
Downloading from spring-milestones: https://repo.spring.io/libs-milestone-local/org/springframework/security/spring-security-oauth2-resource-server/5.4.1/spring-security-oauth2-resource-server-5.4.1.pom
Downloading from spring-releases: https://repo.spring.io/release/org/springframework/security/spring-security-oauth2-resource-server/5.4.1/spring-security-oauth2-resource-server-5.4.1.pom
Downloaded from spring-releases: https://repo.spring.io/release/org/springframework/security/spring-security-oauth2-resource-server/5.4.1/spring-security-oauth2-resource-server-5.4.1.pom (5.3 kB at 12 kB/s)
Downloading from spring-milestones: https://repo.spring.io/libs-milestone-local/org/springframework/security/spring-security-web/5.4.1/spring-security-web-5.4.1.pom
Downloading from spring-releases: https://repo.spring.io/release/org/springframework/security/spring-security-web/5.4.1/spring-security-web-5.4.1.pom
Downloaded from spring-releases: https://repo.spring.io/release/org/springframework/security/spring-security-web/5.4.1/spring-security-web-5.4.1.pom (7.8 kB at 19 kB/s)
Downloading from spring-milestones: https://repo.spring.io/libs-milestone-local/io/micrometer/micrometer-registry-cloudwatch/1.6.1/micrometer-registry-cloudwatch-1.6.1.pom
Downloading from spring-releases: https://repo.spring.io/release/io/micrometer/micrometer-registry-cloudwatch/1.6.1/micrometer-registry-cloudwatch-1.6.1.pom
Downloaded from spring-releases: https://repo.spring.io/release/io/micrometer/micrometer-registry-cloudwatch/1.6.1/micrometer-registry-cloudwatch-1.6.1.pom (3.3 kB at 8.6 kB/s)
Downloading from spring-milestones: https://repo.spring.io/libs-milestone-local/io/micrometer/micrometer-core/1.6.1/micrometer-core-1.6.1.pom
Downloading from spring-releases: https://repo.spring.io/release/io/micrometer/micrometer-core/1.6.1/micrometer-core-1.6.1.pom
Downloaded from spring-releases: https://repo.spring.io/release/io/micrometer/micrometer-core/1.6.1/micrometer-core-1.6.1.pom (8.2 kB at 20 kB/s)
Downloading from spring-milestones: https://repo.spring.io/libs-milestone-local/com/amazonaws/aws-java-sdk-cloudwatch/1.11.907/aws-java-sdk-cloudwatch-1.11.907.pom
Downloading from spring-releases: https://repo.spring.io/release/com/amazonaws/aws-java-sdk-cloudwatch/1.11.907/aws-java-sdk-cloudwatch-1.11.907.pom
Downloading from spring-plugins: https://repo.spring.io/plugins/com/amazonaws/aws-java-sdk-cloudwatch/1.11.907/aws-java-sdk-cloudwatch-1.11.907.pom
Downloading from central: https://repo.maven.apache.org/maven2/com/amazonaws/aws-java-sdk-cloudwatch/1.11.907/aws-java-sdk-cloudwatch-1.11.907.pom
Downloaded from central: https://repo.maven.apache.org/maven2/com/amazonaws/aws-java-sdk-cloudwatch/1.11.907/aws-java-sdk-cloudwatch-1.11.907.pom (3.6 kB at 9.2 kB/s)
Downloading from spring-milestones: https://repo.spring.io/libs-milestone-local/org/springframework/boot/spring-boot-autoconfigure-processor/2.4.0/spring-boot-autoconfigure-processor-2.4.0.pom
Downloading from spring-releases: https://repo.spring.io/release/org/springframework/boot/spring-boot-autoconfigure-processor/2.4.0/spring-boot-autoconfigure-processor-2.4.0.pom
Downloaded from spring-releases: https://repo.spring.io/release/org/springframework/boot/spring-boot-autoconfigure-processor/2.4.0/spring-boot-autoconfigure-processor-2.4.0.pom (1.9 kB at 5.7 kB/s)
Downloading from spring-milestones: https://repo.spring.io/libs-milestone-local/org/springframework/boot/spring-boot-actuator-autoconfigure/2.4.0/spring-boot-actuator-autoconfigure-2.4.0.jar
Downloading from spring-milestones: https://repo.spring.io/libs-milestone-local/org/springframework/security/spring-security-oauth2-jose/5.4.1/spring-security-oauth2-jose-5.4.1.jar
Downloading from spring-milestones: https://repo.spring.io/libs-milestone-local/org/springframework/security/spring-security-core/5.4.1/spring-security-core-5.4.1.jar
Downloading from spring-milestones: https://repo.spring.io/libs-milestone-local/org/springframework/security/spring-security-config/5.4.1/spring-security-config-5.4.1.jar
Downloading from spring-milestones: https://repo.spring.io/libs-milestone-local/org/springframework/boot/spring-boot-actuator/2.4.0/spring-boot-actuator-2.4.0.jar
Downloading from spring-milestones: https://repo.spring.io/libs-milestone-local/com/nimbusds/nimbus-jose-jwt/9.1.2/nimbus-jose-jwt-9.1.2.jar
Downloading from spring-milestones: https://repo.spring.io/libs-milestone-local/com/github/stephenc/jcip/jcip-annotations/1.0-1/jcip-annotations-1.0-1.jar
Downloading from spring-milestones: https://repo.spring.io/libs-milestone-local/org/springframework/security/spring-security-oauth2-core/5.4.1/spring-security-oauth2-core-5.4.1.jar
Downloading from spring-milestones: https://repo.spring.io/libs-milestone-local/org/springframework/security/spring-security-oauth2-resource-server/5.4.1/spring-security-oauth2-resource-server-5.4.1.jar
Downloading from spring-milestones: https://repo.spring.io/libs-milestone-local/org/springframework/security/spring-security-web/5.4.1/spring-security-web-5.4.1.jar
Downloading from spring-milestones: https://repo.spring.io/libs-milestone-local/io/micrometer/micrometer-registry-cloudwatch/1.6.1/micrometer-registry-cloudwatch-1.6.1.jar
Downloading from spring-milestones: https://repo.spring.io/libs-milestone-local/io/micrometer/micrometer-core/1.6.1/micrometer-core-1.6.1.jar
Downloading from spring-milestones: https://repo.spring.io/libs-milestone-local/com/amazonaws/aws-java-sdk-cloudwatch/1.11.907/aws-java-sdk-cloudwatch-1.11.907.jar
Downloading from spring-milestones: https://repo.spring.io/libs-milestone-local/org/springframework/boot/spring-boot-autoconfigure-processor/2.4.0/spring-boot-autoconfigure-processor-2.4.0.jar
Downloading from spring-releases: https://repo.spring.io/release/org/springframework/boot/spring-boot-actuator-autoconfigure/2.4.0/spring-boot-actuator-autoconfigure-2.4.0.jar
Downloading from spring-releases: https://repo.spring.io/release/org/springframework/security/spring-security-oauth2-jose/5.4.1/spring-security-oauth2-jose-5.4.1.jar
Downloading from spring-releases: https://repo.spring.io/release/org/springframework/security/spring-security-core/5.4.1/spring-security-core-5.4.1.jar
Downloading from spring-releases: https://repo.spring.io/release/org/springframework/security/spring-security-config/5.4.1/spring-security-config-5.4.1.jar
Downloading from spring-releases: https://repo.spring.io/release/org/springframework/boot/spring-boot-actuator/2.4.0/spring-boot-actuator-2.4.0.jar
Downloaded from spring-releases: https://repo.spring.io/release/org/springframework/security/spring-security-oauth2-jose/5.4.1/spring-security-oauth2-jose-5.4.1.jar (67 kB at 45 kB/s)
Downloading from spring-releases: https://repo.spring.io/release/com/nimbusds/nimbus-jose-jwt/9.1.2/nimbus-jose-jwt-9.1.2.jar
Downloading from spring-releases: https://repo.spring.io/release/com/github/stephenc/jcip/jcip-annotations/1.0-1/jcip-annotations-1.0-1.jar
Downloading from spring-releases: https://repo.spring.io/release/org/springframework/security/spring-security-oauth2-core/5.4.1/spring-security-oauth2-core-5.4.1.jar
Downloaded from spring-releases: https://repo.spring.io/release/org/springframework/boot/spring-boot-actuator/2.4.0/spring-boot-actuator-2.4.0.jar (592 kB at 231 kB/s)
Downloading from spring-releases: https://repo.spring.io/release/org/springframework/security/spring-security-oauth2-resource-server/5.4.1/spring-security-oauth2-resource-server-5.4.1.jar
Downloaded from spring-releases: https://repo.spring.io/release/org/springframework/security/spring-security-oauth2-core/5.4.1/spring-security-oauth2-core-5.4.1.jar (88 kB at 31 kB/s)
Downloading from spring-releases: https://repo.spring.io/release/org/springframework/security/spring-security-web/5.4.1/spring-security-web-5.4.1.jar
Downloaded from spring-releases: https://repo.spring.io/release/org/springframework/security/spring-security-oauth2-resource-server/5.4.1/spring-security-oauth2-resource-server-5.4.1.jar (78 kB at 26 kB/s)
Downloading from spring-releases: https://repo.spring.io/release/io/micrometer/micrometer-registry-cloudwatch/1.6.1/micrometer-registry-cloudwatch-1.6.1.jar
Downloaded from spring-releases: https://repo.spring.io/release/io/micrometer/micrometer-registry-cloudwatch/1.6.1/micrometer-registry-cloudwatch-1.6.1.jar (21 kB at 6.1 kB/s)
Downloading from spring-releases: https://repo.spring.io/release/io/micrometer/micrometer-core/1.6.1/micrometer-core-1.6.1.jar
Downloaded from spring-releases: https://repo.spring.io/release/io/micrometer/micrometer-core/1.6.1/micrometer-core-1.6.1.jar (610 kB at 128 kB/s)
Downloading from spring-releases: https://repo.spring.io/release/com/amazonaws/aws-java-sdk-cloudwatch/1.11.907/aws-java-sdk-cloudwatch-1.11.907.jar
Downloading from spring-releases: https://repo.spring.io/release/org/springframework/boot/spring-boot-autoconfigure-processor/2.4.0/spring-boot-autoconfigure-processor-2.4.0.jar
Downloaded from spring-releases: https://repo.spring.io/release/org/springframework/security/spring-security-core/5.4.1/spring-security-core-5.4.1.jar (449 kB at 90 kB/s)
Downloaded from spring-releases: https://repo.spring.io/release/org/springframework/boot/spring-boot-actuator-autoconfigure/2.4.0/spring-boot-actuator-autoconfigure-2.4.0.jar (517 kB at 103 kB/s)
Downloaded from spring-releases: https://repo.spring.io/release/org/springframework/boot/spring-boot-autoconfigure-processor/2.4.0/spring-boot-autoconfigure-processor-2.4.0.jar (19 kB at 3.6 kB/s)
Downloaded from spring-releases: https://repo.spring.io/release/org/springframework/security/spring-security-web/5.4.1/spring-security-web-5.4.1.jar (606 kB at 102 kB/s)
Downloaded from spring-releases: https://repo.spring.io/release/org/springframework/security/spring-security-config/5.4.1/spring-security-config-5.4.1.jar (1.2 MB at 190 kB/s)
Downloading from spring-plugins: https://repo.spring.io/plugins/com/nimbusds/nimbus-jose-jwt/9.1.2/nimbus-jose-jwt-9.1.2.jar
Downloading from spring-plugins: https://repo.spring.io/plugins/com/amazonaws/aws-java-sdk-cloudwatch/1.11.907/aws-java-sdk-cloudwatch-1.11.907.jar
Downloading from spring-plugins: https://repo.spring.io/plugins/com/github/stephenc/jcip/jcip-annotations/1.0-1/jcip-annotations-1.0-1.jar
Downloading from central: https://repo.maven.apache.org/maven2/com/nimbusds/nimbus-jose-jwt/9.1.2/nimbus-jose-jwt-9.1.2.jar
Downloading from central: https://repo.maven.apache.org/maven2/com/amazonaws/aws-java-sdk-cloudwatch/1.11.907/aws-java-sdk-cloudwatch-1.11.907.jar
Downloading from central: https://repo.maven.apache.org/maven2/com/github/stephenc/jcip/jcip-annotations/1.0-1/jcip-annotations-1.0-1.jar
Downloaded from central: https://repo.maven.apache.org/maven2/com/github/stephenc/jcip/jcip-annotations/1.0-1/jcip-annotations-1.0-1.jar (4.7 kB at 45 kB/s)
Downloaded from central: https://repo.maven.apache.org/maven2/com/nimbusds/nimbus-jose-jwt/9.1.2/nimbus-jose-jwt-9.1.2.jar (433 kB at 855 kB/s)
Downloaded from central: https://repo.maven.apache.org/maven2/com/amazonaws/aws-java-sdk-cloudwatch/1.11.907/aws-java-sdk-cloudwatch-1.11.907.jar (417 kB at 458 kB/s)
[INFO]
[INFO] --- maven-clean-plugin:2.5:clean (default-clean) @ spring-cloud-aws-autoconfigure ---
[INFO]
[INFO] --- maven-checkstyle-plugin:3.1.0:check (checkstyle-validation) @ spring-cloud-aws-autoconfigure ---
[INFO] Starting audit...
Audit done.
[INFO]
[INFO] --- maven-checkstyle-plugin:3.1.0:check (no-http-checkstyle-validation) @ spring-cloud-aws-autoconfigure ---
[INFO]
[INFO] --- spring-javaformat-maven-plugin:0.0.25:validate (default) @ spring-cloud-aws-autoconfigure ---
[INFO]
[INFO] --- spring-javaformat-maven-plugin:0.0.25:apply (default) @ spring-cloud-aws-autoconfigure ---
[INFO]
[INFO] --- maven-resources-plugin:3.1.0:resources (default-resources) @ spring-cloud-aws-autoconfigure ---
[INFO] Using 'UTF-8' encoding to copy filtered resources.
[INFO] Copying 0 resource
[INFO] Copying 2 resources
[INFO]
[INFO] --- maven-compiler-plugin:3.8.1:compile (default-compile) @ spring-cloud-aws-autoconfigure ---
[INFO] Changes detected - recompiling the module!
[INFO] Compiling 29 source files to C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-autoconfigure\target\classes
[WARNING] /C:/Users/jstupar/my_spring_cloud_aws/spring-cloud-aws/spring-cloud-aws-autoconfigure/src/main/java/org/springframework/cloud/aws/autoconfigure/metrics/CloudWatchPropertiesConfigAdapter.java:[19,32] io.micrometer.cloudwatch.CloudWatchConfig in io.micrometer.cloudwatch has been deprecated
[WARNING] /C:/Users/jstupar/my_spring_cloud_aws/spring-cloud-aws/spring-cloud-aws-autoconfigure/src/main/java/org/springframework/cloud/aws/autoconfigure/jdbc/AmazonRdsDatabaseAutoConfiguration.java:[31,60] org.springframework.cloud.aws.jdbc.config.annotation.AmazonRdsInstanceConfiguration in org.springframework.cloud.aws.jdbc.config.annotation has been deprecated
[WARNING] /C:/Users/jstupar/my_spring_cloud_aws/spring-cloud-aws/spring-cloud-aws-autoconfigure/src/main/java/org/springframework/cloud/aws/autoconfigure/context/ContextInstanceDataAutoConfiguration.java:[29,67] org.springframework.cloud.aws.context.config.support.ContextConfigurationUtils in org.springframework.cloud.aws.context.config.support has been deprecated
[WARNING] /C:/Users/jstupar/my_spring_cloud_aws/spring-cloud-aws/spring-cloud-aws-autoconfigure/src/main/java/org/springframework/cloud/aws/autoconfigure/context/ContextRegionProviderAutoConfiguration.java:[35,67] org.springframework.cloud.aws.context.config.support.ContextConfigurationUtils in org.springframework.cloud.aws.context.config.support has been deprecated
[WARNING] /C:/Users/jstupar/my_spring_cloud_aws/spring-cloud-aws/spring-cloud-aws-autoconfigure/src/main/java/org/springframework/cloud/aws/autoconfigure/mail/SimpleEmailAutoConfiguration.java:[42,53] org.springframework.cloud.aws.mail.simplemail.SimpleEmailServiceJavaMailSender in org.springframework.cloud.aws.mail.simplemail has been deprecated
[WARNING] /C:/Users/jstupar/my_spring_cloud_aws/spring-cloud-aws/spring-cloud-aws-autoconfigure/src/main/java/org/springframework/cloud/aws/autoconfigure/mail/SimpleEmailAutoConfiguration.java:[43,53] org.springframework.cloud.aws.mail.simplemail.SimpleEmailServiceMailSender in org.springframework.cloud.aws.mail.simplemail has been deprecated
[WARNING] /C:/Users/jstupar/my_spring_cloud_aws/spring-cloud-aws/spring-cloud-aws-autoconfigure/src/main/java/org/springframework/cloud/aws/autoconfigure/metrics/CloudWatchExportAutoConfiguration.java:[25,32] io.micrometer.cloudwatch.CloudWatchConfig in io.micrometer.cloudwatch has been deprecated
[WARNING] /C:/Users/jstupar/my_spring_cloud_aws/spring-cloud-aws/spring-cloud-aws-autoconfigure/src/main/java/org/springframework/cloud/aws/autoconfigure/metrics/CloudWatchExportAutoConfiguration.java:[26,32] io.micrometer.cloudwatch.CloudWatchMeterRegistry in io.micrometer.cloudwatch has been deprecated
[WARNING] /C:/Users/jstupar/my_spring_cloud_aws/spring-cloud-aws/spring-cloud-aws-autoconfigure/src/main/java/org/springframework/cloud/aws/autoconfigure/metrics/CloudWatchPropertiesConfigAdapter.java:[19,32] io.micrometer.cloudwatch.CloudWatchConfig in io.micrometer.cloudwatch has been deprecated
[WARNING] /C:/Users/jstupar/my_spring_cloud_aws/spring-cloud-aws/spring-cloud-aws-autoconfigure/src/main/java/org/springframework/cloud/aws/autoconfigure/jdbc/AmazonRdsDatabaseAutoConfiguration.java:[31,60] org.springframework.cloud.aws.jdbc.config.annotation.AmazonRdsInstanceConfiguration in org.springframework.cloud.aws.jdbc.config.annotation has been deprecated
[WARNING] /C:/Users/jstupar/my_spring_cloud_aws/spring-cloud-aws/spring-cloud-aws-autoconfigure/src/main/java/org/springframework/cloud/aws/autoconfigure/context/ContextInstanceDataAutoConfiguration.java:[29,67] org.springframework.cloud.aws.context.config.support.ContextConfigurationUtils in org.springframework.cloud.aws.context.config.support has been deprecated
[WARNING] /C:/Users/jstupar/my_spring_cloud_aws/spring-cloud-aws/spring-cloud-aws-autoconfigure/src/main/java/org/springframework/cloud/aws/autoconfigure/context/ContextRegionProviderAutoConfiguration.java:[35,67] org.springframework.cloud.aws.context.config.support.ContextConfigurationUtils in org.springframework.cloud.aws.context.config.support has been deprecated
[WARNING] /C:/Users/jstupar/my_spring_cloud_aws/spring-cloud-aws/spring-cloud-aws-autoconfigure/src/main/java/org/springframework/cloud/aws/autoconfigure/mail/SimpleEmailAutoConfiguration.java:[42,53] org.springframework.cloud.aws.mail.simplemail.SimpleEmailServiceJavaMailSender in org.springframework.cloud.aws.mail.simplemail has been deprecated
[WARNING] /C:/Users/jstupar/my_spring_cloud_aws/spring-cloud-aws/spring-cloud-aws-autoconfigure/src/main/java/org/springframework/cloud/aws/autoconfigure/mail/SimpleEmailAutoConfiguration.java:[43,53] org.springframework.cloud.aws.mail.simplemail.SimpleEmailServiceMailSender in org.springframework.cloud.aws.mail.simplemail has been deprecated
[WARNING] /C:/Users/jstupar/my_spring_cloud_aws/spring-cloud-aws/spring-cloud-aws-autoconfigure/src/main/java/org/springframework/cloud/aws/autoconfigure/metrics/CloudWatchExportAutoConfiguration.java:[25,32] io.micrometer.cloudwatch.CloudWatchConfig in io.micrometer.cloudwatch has been deprecated
[WARNING] /C:/Users/jstupar/my_spring_cloud_aws/spring-cloud-aws/spring-cloud-aws-autoconfigure/src/main/java/org/springframework/cloud/aws/autoconfigure/metrics/CloudWatchExportAutoConfiguration.java:[26,32] io.micrometer.cloudwatch.CloudWatchMeterRegistry in io.micrometer.cloudwatch has been deprecated
[WARNING] /C:/Users/jstupar/my_spring_cloud_aws/spring-cloud-aws/spring-cloud-aws-autoconfigure/src/main/java/org/springframework/cloud/aws/autoconfigure/metrics/CloudWatchPropertiesConfigAdapter.java:[19,32] io.micrometer.cloudwatch.CloudWatchConfig in io.micrometer.cloudwatch has been deprecated
[WARNING] /C:/Users/jstupar/my_spring_cloud_aws/spring-cloud-aws/spring-cloud-aws-autoconfigure/src/main/java/org/springframework/cloud/aws/autoconfigure/jdbc/AmazonRdsDatabaseAutoConfiguration.java:[31,60] org.springframework.cloud.aws.jdbc.config.annotation.AmazonRdsInstanceConfiguration in org.springframework.cloud.aws.jdbc.config.annotation has been deprecated
[WARNING] /C:/Users/jstupar/my_spring_cloud_aws/spring-cloud-aws/spring-cloud-aws-autoconfigure/src/main/java/org/springframework/cloud/aws/autoconfigure/context/ContextInstanceDataAutoConfiguration.java:[29,67] org.springframework.cloud.aws.context.config.support.ContextConfigurationUtils in org.springframework.cloud.aws.context.config.support has been deprecated
[WARNING] /C:/Users/jstupar/my_spring_cloud_aws/spring-cloud-aws/spring-cloud-aws-autoconfigure/src/main/java/org/springframework/cloud/aws/autoconfigure/context/ContextRegionProviderAutoConfiguration.java:[35,67] org.springframework.cloud.aws.context.config.support.ContextConfigurationUtils in org.springframework.cloud.aws.context.config.support has been deprecated
[WARNING] /C:/Users/jstupar/my_spring_cloud_aws/spring-cloud-aws/spring-cloud-aws-autoconfigure/src/main/java/org/springframework/cloud/aws/autoconfigure/mail/SimpleEmailAutoConfiguration.java:[42,53] org.springframework.cloud.aws.mail.simplemail.SimpleEmailServiceJavaMailSender in org.springframework.cloud.aws.mail.simplemail has been deprecated
[WARNING] /C:/Users/jstupar/my_spring_cloud_aws/spring-cloud-aws/spring-cloud-aws-autoconfigure/src/main/java/org/springframework/cloud/aws/autoconfigure/mail/SimpleEmailAutoConfiguration.java:[43,53] org.springframework.cloud.aws.mail.simplemail.SimpleEmailServiceMailSender in org.springframework.cloud.aws.mail.simplemail has been deprecated
[WARNING] /C:/Users/jstupar/my_spring_cloud_aws/spring-cloud-aws/spring-cloud-aws-autoconfigure/src/main/java/org/springframework/cloud/aws/autoconfigure/metrics/CloudWatchExportAutoConfiguration.java:[25,32] io.micrometer.cloudwatch.CloudWatchConfig in io.micrometer.cloudwatch has been deprecated
[WARNING] /C:/Users/jstupar/my_spring_cloud_aws/spring-cloud-aws/spring-cloud-aws-autoconfigure/src/main/java/org/springframework/cloud/aws/autoconfigure/metrics/CloudWatchExportAutoConfiguration.java:[26,32] io.micrometer.cloudwatch.CloudWatchMeterRegistry in io.micrometer.cloudwatch has been deprecated
[WARNING] /C:/Users/jstupar/my_spring_cloud_aws/spring-cloud-aws/spring-cloud-aws-autoconfigure/src/main/java/org/springframework/cloud/aws/autoconfigure/metrics/CloudWatchPropertiesConfigAdapter.java:[31,28] io.micrometer.cloudwatch.CloudWatchConfig in io.micrometer.cloudwatch has been deprecated
[WARNING] /C:/Users/jstupar/my_spring_cloud_aws/spring-cloud-aws/spring-cloud-aws-autoconfigure/src/main/java/org/springframework/cloud/aws/autoconfigure/metrics/CloudWatchPropertiesConfigAdapter.java:[39,64] io.micrometer.cloudwatch.CloudWatchConfig in io.micrometer.cloudwatch has been deprecated
[WARNING] /C:/Users/jstupar/my_spring_cloud_aws/spring-cloud-aws/spring-cloud-aws-autoconfigure/src/main/java/org/springframework/cloud/aws/autoconfigure/metrics/CloudWatchPropertiesConfigAdapter.java:[44,64] io.micrometer.cloudwatch.CloudWatchConfig in io.micrometer.cloudwatch has been deprecated
[WARNING] /C:/Users/jstupar/my_spring_cloud_aws/spring-cloud-aws/spring-cloud-aws-autoconfigure/src/main/java/org/springframework/cloud/aws/autoconfigure/jdbc/AmazonRdsDatabaseAutoConfiguration.java:[58,27] org.springframework.cloud.aws.jdbc.config.annotation.AmazonRdsInstanceConfiguration in org.springframework.cloud.aws.jdbc.config.annotation has been deprecated
[WARNING] /C:/Users/jstupar/my_spring_cloud_aws/spring-cloud-aws/spring-cloud-aws-autoconfigure/src/main/java/org/springframework/cloud/aws/autoconfigure/mail/SesAutoConfiguration.java:[61,22] org.springframework.cloud.aws.autoconfigure.mail.SimpleEmailAutoConfiguration in org.springframework.cloud.aws.autoconfigure.mail has been deprecated
[WARNING] /C:/Users/jstupar/my_spring_cloud_aws/spring-cloud-aws/spring-cloud-aws-autoconfigure/src/main/java/org/springframework/cloud/aws/autoconfigure/metrics/CloudWatchExportAutoConfiguration.java:[66,23] io.micrometer.cloudwatch.CloudWatchMeterRegistry in io.micrometer.cloudwatch has been deprecated
[WARNING] /C:/Users/jstupar/my_spring_cloud_aws/spring-cloud-aws/spring-cloud-aws-autoconfigure/src/main/java/org/springframework/cloud/aws/autoconfigure/metrics/CloudWatchExportAutoConfiguration.java:[88,16] io.micrometer.cloudwatch.CloudWatchMeterRegistry in io.micrometer.cloudwatch has been deprecated
[WARNING] /C:/Users/jstupar/my_spring_cloud_aws/spring-cloud-aws/spring-cloud-aws-autoconfigure/src/main/java/org/springframework/cloud/aws/autoconfigure/metrics/CloudWatchExportAutoConfiguration.java:[88,64] io.micrometer.cloudwatch.CloudWatchConfig in io.micrometer.cloudwatch has been deprecated
[WARNING] /C:/Users/jstupar/my_spring_cloud_aws/spring-cloud-aws/spring-cloud-aws-autoconfigure/src/main/java/org/springframework/cloud/aws/autoconfigure/metrics/CloudWatchExportAutoConfiguration.java:[90,28] io.micrometer.cloudwatch.CloudWatchMeterRegistry in io.micrometer.cloudwatch has been deprecated
[WARNING] /C:/Users/jstupar/my_spring_cloud_aws/spring-cloud-aws/spring-cloud-aws-autoconfigure/src/main/java/org/springframework/cloud/aws/autoconfigure/metrics/CloudWatchExportAutoConfiguration.java:[106,16] io.micrometer.cloudwatch.CloudWatchConfig in io.micrometer.cloudwatch has been deprecated
[INFO]
[INFO] --- maven-resources-plugin:3.1.0:testResources (default-testResources) @ spring-cloud-aws-autoconfigure ---
[INFO] Using 'UTF-8' encoding to copy filtered resources.
[INFO] Copying 2 resources
[INFO]
[INFO] --- maven-compiler-plugin:3.8.1:testCompile (default-testCompile) @ spring-cloud-aws-autoconfigure ---
[INFO] Changes detected - recompiling the module!
[INFO] Compiling 19 source files to C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-autoconfigure\target\test-classes
[WARNING] /C:/Users/jstupar/my_spring_cloud_aws/spring-cloud-aws/spring-cloud-aws-autoconfigure/src/test/java/org/springframework/cloud/aws/autoconfigure/metrics/CloudWatchExportAutoConfigurationTest.java:[24,32] io.micrometer.cloudwatch.CloudWatchConfig in io.micrometer.cloudwatch has been deprecated
[WARNING] /C:/Users/jstupar/my_spring_cloud_aws/spring-cloud-aws/spring-cloud-aws-autoconfigure/src/test/java/org/springframework/cloud/aws/autoconfigure/metrics/CloudWatchExportAutoConfigurationTest.java:[25,32] io.micrometer.cloudwatch.CloudWatchMeterRegistry in io.micrometer.cloudwatch has been deprecated
[WARNING] /C:/Users/jstupar/my_spring_cloud_aws/spring-cloud-aws/spring-cloud-aws-autoconfigure/src/test/java/org/springframework/cloud/aws/autoconfigure/context/ContextRegionProviderAutoConfigurationTest.java:[25,60] org.springframework.cloud.aws.context.config.support.ContextConfigurationUtils in org.springframework.cloud.aws.context.config.support has been deprecated
[WARNING] /C:/Users/jstupar/my_spring_cloud_aws/spring-cloud-aws/spring-cloud-aws-autoconfigure/src/test/java/org/springframework/cloud/aws/autoconfigure/metrics/CloudWatchExportAutoConfigurationTest.java:[24,32] io.micrometer.cloudwatch.CloudWatchConfig in io.micrometer.cloudwatch has been deprecated
[WARNING] /C:/Users/jstupar/my_spring_cloud_aws/spring-cloud-aws/spring-cloud-aws-autoconfigure/src/test/java/org/springframework/cloud/aws/autoconfigure/metrics/CloudWatchExportAutoConfigurationTest.java:[25,32] io.micrometer.cloudwatch.CloudWatchMeterRegistry in io.micrometer.cloudwatch has been deprecated
[WARNING] /C:/Users/jstupar/my_spring_cloud_aws/spring-cloud-aws/spring-cloud-aws-autoconfigure/src/test/java/org/springframework/cloud/aws/autoconfigure/context/ContextRegionProviderAutoConfigurationTest.java:[25,60] org.springframework.cloud.aws.context.config.support.ContextConfigurationUtils in org.springframework.cloud.aws.context.config.support has been deprecated
[WARNING] /C:/Users/jstupar/my_spring_cloud_aws/spring-cloud-aws/spring-cloud-aws-autoconfigure/src/test/java/org/springframework/cloud/aws/autoconfigure/metrics/CloudWatchExportAutoConfigurationTest.java:[24,32] io.micrometer.cloudwatch.CloudWatchConfig in io.micrometer.cloudwatch has been deprecated
[WARNING] /C:/Users/jstupar/my_spring_cloud_aws/spring-cloud-aws/spring-cloud-aws-autoconfigure/src/test/java/org/springframework/cloud/aws/autoconfigure/metrics/CloudWatchExportAutoConfigurationTest.java:[25,32] io.micrometer.cloudwatch.CloudWatchMeterRegistry in io.micrometer.cloudwatch has been deprecated
[WARNING] /C:/Users/jstupar/my_spring_cloud_aws/spring-cloud-aws/spring-cloud-aws-autoconfigure/src/test/java/org/springframework/cloud/aws/autoconfigure/context/ContextRegionProviderAutoConfigurationTest.java:[25,60] org.springframework.cloud.aws.context.config.support.ContextConfigurationUtils in org.springframework.cloud.aws.context.config.support has been deprecated
[WARNING] /C:/Users/jstupar/my_spring_cloud_aws/spring-cloud-aws/spring-cloud-aws-autoconfigure/src/test/java/org/springframework/cloud/aws/autoconfigure/messaging/SqsAutoConfigurationTest.java:[244,50] unchecked cast
  required: java.util.List<org.springframework.messaging.converter.MessageConverter>
  found:    java.lang.Object
[WARNING] /C:/Users/jstupar/my_spring_cloud_aws/spring-cloud-aws/spring-cloud-aws-autoconfigure/src/test/java/org/springframework/cloud/aws/autoconfigure/metrics/CloudWatchExportAutoConfigurationTest.java:[53,83] io.micrometer.cloudwatch.CloudWatchMeterRegistry in io.micrometer.cloudwatch has been deprecated
[WARNING] /C:/Users/jstupar/my_spring_cloud_aws/spring-cloud-aws/spring-cloud-aws-autoconfigure/src/test/java/org/springframework/cloud/aws/autoconfigure/metrics/CloudWatchExportAutoConfigurationTest.java:[59,25] io.micrometer.cloudwatch.CloudWatchMeterRegistry in io.micrometer.cloudwatch has been deprecated
[WARNING] /C:/Users/jstupar/my_spring_cloud_aws/spring-cloud-aws/spring-cloud-aws-autoconfigure/src/test/java/org/springframework/cloud/aws/autoconfigure/metrics/CloudWatchExportAutoConfigurationTest.java:[59,83] io.micrometer.cloudwatch.CloudWatchMeterRegistry in io.micrometer.cloudwatch has been deprecated
[WARNING] /C:/Users/jstupar/my_spring_cloud_aws/spring-cloud-aws/spring-cloud-aws-autoconfigure/src/test/java/org/springframework/cloud/aws/autoconfigure/metrics/CloudWatchExportAutoConfigurationTest.java:[62,25] io.micrometer.cloudwatch.CloudWatchConfig in io.micrometer.cloudwatch has been deprecated
[WARNING] /C:/Users/jstupar/my_spring_cloud_aws/spring-cloud-aws/spring-cloud-aws-autoconfigure/src/test/java/org/springframework/cloud/aws/autoconfigure/metrics/CloudWatchExportAutoConfigurationTest.java:[62,77] io.micrometer.cloudwatch.CloudWatchConfig in io.micrometer.cloudwatch has been deprecated
[WARNING] /C:/Users/jstupar/my_spring_cloud_aws/spring-cloud-aws/spring-cloud-aws-autoconfigure/src/test/java/org/springframework/cloud/aws/autoconfigure/metrics/CloudWatchExportAutoConfigurationTest.java:[84,41] io.micrometer.cloudwatch.CloudWatchMeterRegistry in io.micrometer.cloudwatch has been deprecated
[WARNING] /C:/Users/jstupar/my_spring_cloud_aws/spring-cloud-aws/spring-cloud-aws-autoconfigure/src/test/java/org/springframework/cloud/aws/autoconfigure/metrics/CloudWatchExportAutoConfigurationTest.java:[84,99] io.micrometer.cloudwatch.CloudWatchMeterRegistry in io.micrometer.cloudwatch has been deprecated
[WARNING] /C:/Users/jstupar/my_spring_cloud_aws/spring-cloud-aws/spring-cloud-aws-autoconfigure/src/test/java/org/springframework/cloud/aws/autoconfigure/metrics/CloudWatchExportAutoConfigurationTest.java:[87,41] io.micrometer.cloudwatch.CloudWatchConfig in io.micrometer.cloudwatch has been deprecated
[WARNING] /C:/Users/jstupar/my_spring_cloud_aws/spring-cloud-aws/spring-cloud-aws-autoconfigure/src/test/java/org/springframework/cloud/aws/autoconfigure/metrics/CloudWatchExportAutoConfigurationTest.java:[87,93] io.micrometer.cloudwatch.CloudWatchConfig in io.micrometer.cloudwatch has been deprecated
[WARNING] /C:/Users/jstupar/my_spring_cloud_aws/spring-cloud-aws/spring-cloud-aws-autoconfigure/src/test/java/org/springframework/cloud/aws/autoconfigure/context/ContextRegionProviderAutoConfigurationTest.java:[80,30] org.springframework.cloud.aws.context.config.support.ContextConfigurationUtils in org.springframework.cloud.aws.context.config.support has been deprecated
[WARNING] /C:/Users/jstupar/my_spring_cloud_aws/spring-cloud-aws/spring-cloud-aws-autoconfigure/src/test/java/org/springframework/cloud/aws/autoconfigure/mail/SimpleEmailAutoConfigurationTest.java:[39,66] org.springframework.cloud.aws.autoconfigure.mail.SimpleEmailAutoConfiguration in org.springframework.cloud.aws.autoconfigure.mail has been deprecated
[WARNING] /C:/Users/jstupar/my_spring_cloud_aws/spring-cloud-aws/spring-cloud-aws-autoconfigure/src/test/java/org/springframework/cloud/aws/autoconfigure/mail/SesAutoConfigurationTest.java:[97,99] org.springframework.cloud.aws.autoconfigure.mail.SimpleEmailAutoConfiguration in org.springframework.cloud.aws.autoconfigure.mail has been deprecated
[INFO]
[INFO] --- maven-surefire-plugin:2.22.2:test (default-test) @ spring-cloud-aws-autoconfigure ---
[INFO]
[INFO] -------------------------------------------------------
[INFO]  T E S T S
[INFO] -------------------------------------------------------
[INFO] Running org.springframework.cloud.aws.autoconfigure.cache.ElastiCacheAutoConfigurationTest
12:35:53.010 [main] INFO  c.t.jmemcached.MemCacheDaemon - Listening on 0.0.0.0:11033
12:35:53.032 [main] WARN  o.s.c.a.cache.ElastiCacheFactoryBean - Cache cluster is not available now. Connection may fail during cache access. Current status is null
12:35:53.061 [main] INFO  n.spy.memcached.MemcachedConnection - Added {QA sa=/127.0.0.1:11033, #Rops=0, #Wops=0, #iq=0, topRop=null, topWop=null, toWrite=0, interested=0} to connect queue
12:35:53.064 [main] WARN  o.s.c.a.cache.ElastiCacheFactoryBean - Cache cluster is not available now. Connection may fail during cache access. Current status is null
12:35:53.081 [New I/O server worker #1-1] INFO  c.t.j.p.MemcachedCommandHandler - VERSION
12:35:53.085 [Memcached IO over {MemcachedConnection to /127.0.0.1:11033} - SHUTTING DOWN (informed client)] INFO  n.spy.memcached.MemcachedConnection - Shut down memcached client
12:35:53.130 [main] WARN  o.s.c.a.cache.ElastiCacheFactoryBean - Cache cluster is not available now. Connection may fail during cache access. Current status is null
12:35:53.131 [main] INFO  n.spy.memcached.MemcachedConnection - Added {QA sa=/127.0.0.1:11033, #Rops=0, #Wops=0, #iq=0, topRop=null, topWop=null, toWrite=0, interested=0} to connect queue
12:35:53.133 [main] WARN  o.s.c.a.cache.ElastiCacheFactoryBean - Cache cluster is not available now. Connection may fail during cache access. Current status is null
12:35:53.134 [New I/O server worker #1-2] INFO  c.t.j.p.MemcachedCommandHandler - VERSION
12:35:53.134 [Memcached IO over {MemcachedConnection to /127.0.0.1:11033} - SHUTTING DOWN (informed client)] INFO  n.spy.memcached.MemcachedConnection - Shut down memcached client
12:35:53.168 [main] WARN  o.s.c.a.cache.ElastiCacheFactoryBean - Cache cluster is not available now. Connection may fail during cache access. Current status is null
12:35:53.170 [main] INFO  n.spy.memcached.MemcachedConnection - Added {QA sa=/127.0.0.1:11033, #Rops=0, #Wops=0, #iq=0, topRop=null, topWop=null, toWrite=0, interested=0} to connect queue
12:35:53.171 [main] WARN  o.s.c.a.cache.ElastiCacheFactoryBean - Cache cluster is not available now. Connection may fail during cache access. Current status is null
12:35:53.182 [New I/O server worker #1-3] INFO  c.t.j.p.MemcachedCommandHandler - VERSION
12:35:53.184 [Memcached IO over {MemcachedConnection to /127.0.0.1:11033} - SHUTTING DOWN (informed client)] INFO  n.spy.memcached.MemcachedConnection - Shut down memcached client
12:35:53.243 [main] WARN  o.s.c.a.cache.ElastiCacheFactoryBean - Cache cluster is not available now. Connection may fail during cache access. Current status is null
12:35:53.245 [main] INFO  n.spy.memcached.MemcachedConnection - Added {QA sa=/127.0.0.1:11033, #Rops=0, #Wops=0, #iq=0, topRop=null, topWop=null, toWrite=0, interested=0} to connect queue
12:35:53.246 [main] WARN  o.s.c.a.cache.ElastiCacheFactoryBean - Cache cluster is not available now. Connection may fail during cache access. Current status is null
12:35:53.248 [New I/O server worker #1-4] INFO  c.t.j.p.MemcachedCommandHandler - VERSION
12:35:53.250 [Memcached IO over {MemcachedConnection to /127.0.0.1:11033} - SHUTTING DOWN (informed client)] INFO  n.spy.memcached.MemcachedConnection - Shut down memcached client
12:35:53.279 [main] WARN  o.s.c.a.cache.ElastiCacheFactoryBean - Cache cluster is not available now. Connection may fail during cache access. Current status is null
12:35:53.280 [main] INFO  n.spy.memcached.MemcachedConnection - Added {QA sa=/127.0.0.1:11033, #Rops=0, #Wops=0, #iq=0, topRop=null, topWop=null, toWrite=0, interested=0} to connect queue
12:35:53.282 [main] WARN  o.s.c.a.cache.ElastiCacheFactoryBean - Cache cluster is not available now. Connection may fail during cache access. Current status is null
12:35:53.286 [New I/O server worker #1-5] INFO  c.t.j.p.MemcachedCommandHandler - VERSION
12:35:53.288 [Memcached IO over {MemcachedConnection to /127.0.0.1:11033} - SHUTTING DOWN (informed client)] INFO  n.spy.memcached.MemcachedConnection - Shut down memcached client
12:35:53.547 [main] WARN  o.s.c.a.cache.ElastiCacheFactoryBean - Cache cluster is not available now. Connection may fail during cache access. Current status is null
12:35:53.549 [main] INFO  n.spy.memcached.MemcachedConnection - Added {QA sa=/127.0.0.1:11033, #Rops=0, #Wops=0, #iq=0, topRop=null, topWop=null, toWrite=0, interested=0} to connect queue
12:35:53.552 [main] WARN  o.s.c.a.cache.ElastiCacheFactoryBean - Cache cluster is not available now. Connection may fail during cache access. Current status is null
12:35:53.554 [New I/O server worker #1-6] INFO  c.t.j.p.MemcachedCommandHandler - VERSION
12:35:53.556 [Memcached IO over {MemcachedConnection to /127.0.0.1:11033} - SHUTTING DOWN (informed client)] INFO  n.spy.memcached.MemcachedConnection - Shut down memcached client
[INFO] Tests run: 13, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 3.758 s - in org.springframework.cloud.aws.autoconfigure.cache.ElastiCacheAutoConfigurationTest
[INFO] Running org.springframework.cloud.aws.autoconfigure.context.ContextCredentialsAutoConfigurationTest
[INFO] Tests run: 7, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.109 s - in org.springframework.cloud.aws.autoconfigure.context.ContextCredentialsAutoConfigurationTest
[INFO] Running org.springframework.cloud.aws.autoconfigure.context.ContextInstanceDataAutoConfigurationTest
[ERROR] Tests run: 7, Failures: 3, Errors: 0, Skipped: 0, Time elapsed: 0.201 s <<< FAILURE! - in org.springframework.cloud.aws.autoconfigure.context.ContextInstanceDataAutoConfigurationTest
[ERROR] customValueSeparator_createInstanceDataResolverThatResolvesWithCustomValueSeparator  Time elapsed: 0.13 s  <<< FAILURE!
org.opentest4j.AssertionFailedError:

Expecting:
 <"C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-autoconfigure">
to be equal to:
 <"d">
but was not.
        at org.springframework.cloud.aws.autoconfigure.context.ContextInstanceDataAutoConfigurationTest.lambda$customValueSeparator_createInstanceDataResolverThatResolvesWithCustomValueSeparator$1(ContextInstanceDataAutoConfigurationTest.java:82)
        at org.springframework.cloud.aws.autoconfigure.context.ContextInstanceDataAutoConfigurationTest.customValueSeparator_createInstanceDataResolverThatResolvesWithCustomValueSeparator(ContextInstanceDataAutoConfigurationTest.java:80)

[ERROR] customAttributeSeparator_createInstanceDataResolverThatResolvesWithCustomAttribute  Time elapsed: 0.015 s  <<< FAILURE!
org.opentest4j.AssertionFailedError:

Expecting:
 <null>
to be equal to:
 <"b">
but was not.
        at org.springframework.cloud.aws.autoconfigure.context.ContextInstanceDataAutoConfigurationTest.lambda$customAttributeSeparator_createInstanceDataResolverThatResolvesWithCustomAttribute$2(ContextInstanceDataAutoConfigurationTest.java:100)
        at org.springframework.cloud.aws.autoconfigure.context.ContextInstanceDataAutoConfigurationTest.customAttributeSeparator_createInstanceDataResolverThatResolvesWithCustomAttribute(ContextInstanceDataAutoConfigurationTest.java:99)

[ERROR] createInstanceDataResolverThatResolvesWithDefaultAttributes  Time elapsed: 0.015 s  <<< FAILURE!
org.opentest4j.AssertionFailedError:

Expecting:
 <null>
to be equal to:
 <"b">
but was not.
        at org.springframework.cloud.aws.autoconfigure.context.ContextInstanceDataAutoConfigurationTest.lambda$createInstanceDataResolverThatResolvesWithDefaultAttributes$0(ContextInstanceDataAutoConfigurationTest.java:61)
        at org.springframework.cloud.aws.autoconfigure.context.ContextInstanceDataAutoConfigurationTest.createInstanceDataResolverThatResolvesWithDefaultAttributes(ContextInstanceDataAutoConfigurationTest.java:60)

[INFO] Running org.springframework.cloud.aws.autoconfigure.context.ContextRegionProviderAutoConfigurationTest
[INFO] Tests run: 4, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.035 s - in org.springframework.cloud.aws.autoconfigure.context.ContextRegionProviderAutoConfigurationTest
[INFO] Running org.springframework.cloud.aws.autoconfigure.context.ContextResourceLoaderAutoConfigurationTest
12:35:54.024 [main] INFO  o.s.s.c.ThreadPoolTaskExecutor - Initializing ExecutorService '(inner bean)#1ff15a50'
12:35:54.239 [main] INFO  o.s.s.c.ThreadPoolTaskExecutor - Shutting down ExecutorService '(inner bean)#1ff15a50'
[INFO] Tests run: 7, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.363 s - in org.springframework.cloud.aws.autoconfigure.context.ContextResourceLoaderAutoConfigurationTest
[INFO] Running org.springframework.cloud.aws.autoconfigure.context.ContextStackAutoConfigurationTest
12:35:54.557 [main] WARN  o.s.c.a.AnnotationConfigApplicationContext - Exception encountered during context initialization - cancelling refresh attempt: org.springframework.beans.factory.BeanCreationException: Error creating bean with name 'autoDetectingStackNameProvider' defined in org.springframework.cloud.aws.autoconfigure.context.ContextStackAutoConfiguration: Bean instantiation via factory method failed; nested exception is org.springframework.beans.BeanInstantiationException: Failed to instantiate [org.springframework.cloud.aws.core.env.stack.config.StackNameProvider]: Factory method 'autoDetectingStackNameProvider' threw exception; nested exception is java.lang.IllegalStateException: No stack resources found in stack for EC2 instance 'testInstanceId'
[ERROR] Tests run: 6, Failures: 0, Errors: 1, Skipped: 0, Time elapsed: 0.212 s <<< FAILURE! - in org.springframework.cloud.aws.autoconfigure.context.ContextStackAutoConfigurationTest
[ERROR] stackRegistry_autoConfigurationEnabled_returnsAutoConfiguredStackRegistry  Time elapsed: 0.026 s  <<< ERROR!
java.lang.IllegalStateException: Unstarted application context org.springframework.boot.test.context.assertj.AssertableApplicationContext[startupFailure=org.springframework.beans.factory.BeanCreationException] failed to start
        at org.springframework.cloud.aws.autoconfigure.context.ContextStackAutoConfigurationTest.lambda$stackRegistry_autoConfigurationEnabled_returnsAutoConfiguredStackRegistry$0(ContextStackAutoConfigurationTest.java:70)
        at org.springframework.cloud.aws.autoconfigure.context.ContextStackAutoConfigurationTest.stackRegistry_autoConfigurationEnabled_returnsAutoConfiguredStackRegistry(ContextStackAutoConfigurationTest.java:70)
Caused by: org.springframework.beans.factory.BeanCreationException: Error creating bean with name 'autoDetectingStackNameProvider' defined in org.springframework.cloud.aws.autoconfigure.context.ContextStackAutoConfiguration: Bean instantiation via factory method failed; nested exception is org.springframework.beans.BeanInstantiationException: Failed to instantiate [org.springframework.cloud.aws.core.env.stack.config.StackNameProvider]: Factory method 'autoDetectingStackNameProvider' threw exception; nested exception is java.lang.IllegalStateException: No stack resources found in stack for EC2 instance 'testInstanceId'
        at org.springframework.cloud.aws.autoconfigure.context.ContextStackAutoConfigurationTest.stackRegistry_autoConfigurationEnabled_returnsAutoConfiguredStackRegistry(ContextStackAutoConfigurationTest.java:70)
Caused by: org.springframework.beans.BeanInstantiationException: Failed to instantiate [org.springframework.cloud.aws.core.env.stack.config.StackNameProvider]: Factory method 'autoDetectingStackNameProvider' threw exception; nested exception is java.lang.IllegalStateException: No stack resources found in stack for EC2 instance 'testInstanceId'
        at org.springframework.cloud.aws.autoconfigure.context.ContextStackAutoConfigurationTest.stackRegistry_autoConfigurationEnabled_returnsAutoConfiguredStackRegistry(ContextStackAutoConfigurationTest.java:70)
Caused by: java.lang.IllegalStateException: No stack resources found in stack for EC2 instance 'testInstanceId'
        at org.springframework.cloud.aws.autoconfigure.context.ContextStackAutoConfigurationTest.stackRegistry_autoConfigurationEnabled_returnsAutoConfiguredStackRegistry(ContextStackAutoConfigurationTest.java:70)

[INFO] Running org.springframework.cloud.aws.autoconfigure.context.properties.AwsCredentialsPropertiesTest
[INFO] Tests run: 5, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0 s - in org.springframework.cloud.aws.autoconfigure.context.properties.AwsCredentialsPropertiesTest
[INFO] Running org.springframework.cloud.aws.autoconfigure.context.properties.AwsRegionPropertiesTest
[INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.001 s - in org.springframework.cloud.aws.autoconfigure.context.properties.AwsRegionPropertiesTest
[INFO] Running org.springframework.cloud.aws.autoconfigure.context.properties.AwsS3ResourceLoaderPropertiesTest
[INFO] Tests run: 3, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.001 s - in org.springframework.cloud.aws.autoconfigure.context.properties.AwsS3ResourceLoaderPropertiesTest
[INFO] Running org.springframework.cloud.aws.autoconfigure.jdbc.AmazonRdsDatabaseAutoConfigurationTest
12:35:54.615 [main] INFO  o.s.c.s.PostProcessorRegistrationDelegate$BeanPostProcessorChecker - Bean 'amazonRdsDatabaseAutoConfigurationTest.ApplicationConfigurationWithoutReadReplica' of type [org.springframework.cloud.aws.autoconfigure.jdbc.AmazonRdsDatabaseAutoConfigurationTest$ApplicationConfigurationWithoutReadReplica] is not eligible for getting processed by all BeanPostProcessors (for example: not eligible for auto-proxying)
12:35:55.036 [main] INFO  o.s.c.s.PostProcessorRegistrationDelegate$BeanPostProcessorChecker - Bean 'amazonRDS' of type [com.amazonaws.services.rds.AmazonRDSClient$MockitoMock$1422368443] is not eligible for getting processed by all BeanPostProcessors (for example: not eligible for auto-proxying)
12:35:55.100 [main] INFO  o.s.c.s.PostProcessorRegistrationDelegate$BeanPostProcessorChecker - Bean 'amazonRdsDatabaseAutoConfigurationTest.ApplicationConfigurationWithMultipleDatabases' of type [org.springframework.cloud.aws.autoconfigure.jdbc.AmazonRdsDatabaseAutoConfigurationTest$ApplicationConfigurationWithMultipleDatabases] is not eligible for getting processed by all BeanPostProcessors (for example: not eligible for auto-proxying)
12:35:55.104 [main] INFO  o.s.c.s.PostProcessorRegistrationDelegate$BeanPostProcessorChecker - Bean 'amazonRDS' of type [com.amazonaws.services.rds.AmazonRDSClient$MockitoMock$1422368443] is not eligible for getting processed by all BeanPostProcessors (for example: not eligible for auto-proxying)
12:35:55.131 [main] INFO  o.s.c.s.PostProcessorRegistrationDelegate$BeanPostProcessorChecker - Bean 'amazonRdsDatabaseAutoConfigurationTest.ApplicationConfigurationWithoutReadReplica' of type [org.springframework.cloud.aws.autoconfigure.jdbc.AmazonRdsDatabaseAutoConfigurationTest$ApplicationConfigurationWithoutReadReplica] is not eligible for getting processed by all BeanPostProcessors (for example: not eligible for auto-proxying)
12:35:55.136 [main] INFO  o.s.c.s.PostProcessorRegistrationDelegate$BeanPostProcessorChecker - Bean 'amazonRDS' of type [com.amazonaws.services.rds.AmazonRDSClient$MockitoMock$1422368443] is not eligible for getting processed by all BeanPostProcessors (for example: not eligible for auto-proxying)
12:35:55.137 [main] INFO  o.s.c.s.PostProcessorRegistrationDelegate$BeanPostProcessorChecker - Bean 'amazonRdsDatabaseAutoConfigurationTest.CustomRdsInstanceConfigurer' of type [org.springframework.cloud.aws.autoconfigure.jdbc.AmazonRdsDatabaseAutoConfigurationTest$CustomRdsInstanceConfigurer] is not eligible for getting processed by all BeanPostProcessors (for example: not eligible for auto-proxying)
12:35:55.137 [main] INFO  o.s.c.s.PostProcessorRegistrationDelegate$BeanPostProcessorChecker - Bean 'instanceConfigurer' of type [org.springframework.cloud.aws.autoconfigure.jdbc.AmazonRdsDatabaseAutoConfigurationTest$CustomRdsInstanceConfigurer$$Lambda$559/927690291] is not eligible for getting processed by all BeanPostProcessors (for example: not eligible for auto-proxying)
12:35:55.270 [main] INFO  o.s.c.s.PostProcessorRegistrationDelegate$BeanPostProcessorChecker - Bean 'amazonRdsDatabaseAutoConfigurationTest.ApplicationConfigurationWithReadReplica' of type [org.springframework.cloud.aws.autoconfigure.jdbc.AmazonRdsDatabaseAutoConfigurationTest$ApplicationConfigurationWithReadReplica] is not eligible for getting processed by all BeanPostProcessors (for example: not eligible for auto-proxying)
12:35:55.275 [main] INFO  o.s.c.s.PostProcessorRegistrationDelegate$BeanPostProcessorChecker - Bean 'amazonRDS' of type [com.amazonaws.services.rds.AmazonRDSClient$MockitoMock$1422368443] is not eligible for getting processed by all BeanPostProcessors (for example: not eligible for auto-proxying)
Loading class `com.mysql.jdbc.Driver'. This is deprecated. The new driver class is `com.mysql.cj.jdbc.Driver'. The driver is automatically registered via the SPI and manual loading of the driver class is generally unnecessary.
Feb 19, 2022 12:35:55 PM org.apache.tomcat.jdbc.pool.ConnectionPool init
SEVERE: Unable to create initial connections of pool.
java.sql.SQLException: Access denied for user 'admin'@'localhost' (using password: YES)
        at com.mysql.cj.jdbc.exceptions.SQLError.createSQLException(SQLError.java:129)
        at com.mysql.cj.jdbc.exceptions.SQLError.createSQLException(SQLError.java:97)
        at com.mysql.cj.jdbc.exceptions.SQLExceptionsMapping.translateException(SQLExceptionsMapping.java:122)
        at com.mysql.cj.jdbc.ConnectionImpl.createNewIO(ConnectionImpl.java:836)
        at com.mysql.cj.jdbc.ConnectionImpl.<init>(ConnectionImpl.java:456)
        at com.mysql.cj.jdbc.ConnectionImpl.getInstance(ConnectionImpl.java:246)
        at com.mysql.cj.jdbc.NonRegisteringDriver.connect(NonRegisteringDriver.java:198)
        at org.apache.tomcat.jdbc.pool.PooledConnection.connectUsingDriver(PooledConnection.java:319)
        at org.apache.tomcat.jdbc.pool.PooledConnection.connect(PooledConnection.java:212)
        at org.apache.tomcat.jdbc.pool.ConnectionPool.createConnection(ConnectionPool.java:744)
        at org.apache.tomcat.jdbc.pool.ConnectionPool.borrowConnection(ConnectionPool.java:676)
        at org.apache.tomcat.jdbc.pool.ConnectionPool.init(ConnectionPool.java:483)
        at org.apache.tomcat.jdbc.pool.ConnectionPool.<init>(ConnectionPool.java:154)
        at org.apache.tomcat.jdbc.pool.DataSourceProxy.pCreatePool(DataSourceProxy.java:118)
        at org.apache.tomcat.jdbc.pool.DataSourceProxy.createPool(DataSourceProxy.java:107)
        at org.apache.tomcat.jdbc.pool.DataSourceProxy.getConnection(DataSourceProxy.java:131)
        at org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource.getConnection(AbstractRoutingDataSource.java:194)
        at org.springframework.jdbc.datasource.LazyConnectionDataSourceProxy.afterPropertiesSet(LazyConnectionDataSourceProxy.java:164)
        at org.springframework.jdbc.datasource.LazyConnectionDataSourceProxy.<init>(LazyConnectionDataSourceProxy.java:108)
        at org.springframework.cloud.aws.jdbc.rds.AmazonRdsReadReplicaAwareDataSourceFactoryBean.createInstance(AmazonRdsReadReplicaAwareDataSourceFactoryBean.java:94)
        at org.springframework.cloud.aws.jdbc.rds.AmazonRdsReadReplicaAwareDataSourceFactoryBean.createInstance(AmazonRdsReadReplicaAwareDataSourceFactoryBean.java:37)
        at org.springframework.beans.factory.config.AbstractFactoryBean.afterPropertiesSet(AbstractFactoryBean.java:142)
        at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.invokeInitMethods(AbstractAutowireCapableBeanFactory.java:1847)
        at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.initializeBean(AbstractAutowireCapableBeanFactory.java:1784)
        at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.doCreateBean(AbstractAutowireCapableBeanFactory.java:609)
        at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.createBean(AbstractAutowireCapableBeanFactory.java:531)
        at org.springframework.beans.factory.support.AbstractBeanFactory.lambda$doGetBean$0(AbstractBeanFactory.java:335)
        at org.springframework.beans.factory.support.DefaultSingletonBeanRegistry.getSingleton(DefaultSingletonBeanRegistry.java:234)
        at org.springframework.beans.factory.support.AbstractBeanFactory.doGetBean(AbstractBeanFactory.java:333)
        at org.springframework.beans.factory.support.AbstractBeanFactory.getBean(AbstractBeanFactory.java:208)
        at org.springframework.beans.factory.support.DefaultListableBeanFactory.preInstantiateSingletons(DefaultListableBeanFactory.java:925)
        at org.springframework.context.support.AbstractApplicationContext.finishBeanFactoryInitialization(AbstractApplicationContext.java:925)
        at org.springframework.context.support.AbstractApplicationContext.refresh(AbstractApplicationContext.java:588)
        at org.springframework.boot.test.context.runner.AbstractApplicationContextRunner.configureContext(AbstractApplicationContextRunner.java:447)
        at org.springframework.boot.test.context.runner.AbstractApplicationContextRunner.createAndLoadContext(AbstractApplicationContextRunner.java:423)
        at org.springframework.boot.test.context.assertj.AssertProviderApplicationContextInvocationHandler.getContextOrStartupFailure(AssertProviderApplicationContextInvocationHandler.java:61)
        at org.springframework.boot.test.context.assertj.AssertProviderApplicationContextInvocationHandler.<init>(AssertProviderApplicationContextInvocationHandler.java:48)
        at org.springframework.boot.test.context.assertj.ApplicationContextAssertProvider.get(ApplicationContextAssertProvider.java:112)
        at org.springframework.boot.test.context.runner.AbstractApplicationContextRunner.createAssertableContext(AbstractApplicationContextRunner.java:412)
        at org.springframework.boot.test.context.runner.AbstractApplicationContextRunner.lambda$null$0(AbstractApplicationContextRunner.java:382)
        at org.springframework.boot.test.util.TestPropertyValues.applyToSystemProperties(TestPropertyValues.java:175)
        at org.springframework.boot.test.context.runner.AbstractApplicationContextRunner.lambda$run$1(AbstractApplicationContextRunner.java:381)
        at org.springframework.boot.test.context.runner.AbstractApplicationContextRunner.withContextClassLoader(AbstractApplicationContextRunner.java:392)
        at org.springframework.boot.test.context.runner.AbstractApplicationContextRunner.run(AbstractApplicationContextRunner.java:381)
        at org.springframework.cloud.aws.autoconfigure.jdbc.AmazonRdsDatabaseAutoConfigurationTest.configureBean_withDefaultClientSpecifiedAndReadReplica_configuresFactoryBeanWithReadReplicaEnabled(AmazonRdsDatabaseAutoConfigurationTest.java:121)
        at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
        at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
        at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
        at java.lang.reflect.Method.invoke(Method.java:498)
        at org.junit.platform.commons.util.ReflectionUtils.invokeMethod(ReflectionUtils.java:688)
        at org.junit.jupiter.engine.execution.MethodInvocation.proceed(MethodInvocation.java:60)
        at org.junit.jupiter.engine.execution.InvocationInterceptorChain$ValidatingInvocation.proceed(InvocationInterceptorChain.java:131)
        at org.junit.jupiter.engine.extension.TimeoutExtension.intercept(TimeoutExtension.java:149)
        at org.junit.jupiter.engine.extension.TimeoutExtension.interceptTestableMethod(TimeoutExtension.java:140)
        at org.junit.jupiter.engine.extension.TimeoutExtension.interceptTestMethod(TimeoutExtension.java:84)
        at org.junit.jupiter.engine.execution.ExecutableInvoker$ReflectiveInterceptorCall.lambda$ofVoidMethod$0(ExecutableInvoker.java:115)
        at org.junit.jupiter.engine.execution.ExecutableInvoker.lambda$invoke$0(ExecutableInvoker.java:105)
        at org.junit.jupiter.engine.execution.InvocationInterceptorChain$InterceptedInvocation.proceed(InvocationInterceptorChain.java:106)
        at org.junit.jupiter.engine.execution.InvocationInterceptorChain.proceed(InvocationInterceptorChain.java:64)
        at org.junit.jupiter.engine.execution.InvocationInterceptorChain.chainAndInvoke(InvocationInterceptorChain.java:45)
        at org.junit.jupiter.engine.execution.InvocationInterceptorChain.invoke(InvocationInterceptorChain.java:37)
        at org.junit.jupiter.engine.execution.ExecutableInvoker.invoke(ExecutableInvoker.java:104)
        at org.junit.jupiter.engine.execution.ExecutableInvoker.invoke(ExecutableInvoker.java:98)
        at org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.lambda$invokeTestMethod$6(TestMethodTestDescriptor.java:210)
        at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
        at org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.invokeTestMethod(TestMethodTestDescriptor.java:206)
        at org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.execute(TestMethodTestDescriptor.java:131)
        at org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.execute(TestMethodTestDescriptor.java:65)
        at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$5(NodeTestTask.java:139)
        at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
        at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$7(NodeTestTask.java:129)
        at org.junit.platform.engine.support.hierarchical.Node.around(Node.java:137)
        at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$8(NodeTestTask.java:127)
        at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
        at org.junit.platform.engine.support.hierarchical.NodeTestTask.executeRecursively(NodeTestTask.java:126)
        at org.junit.platform.engine.support.hierarchical.NodeTestTask.execute(NodeTestTask.java:84)
        at java.util.ArrayList.forEach(ArrayList.java:1259)
        at org.junit.platform.engine.support.hierarchical.SameThreadHierarchicalTestExecutorService.invokeAll(SameThreadHierarchicalTestExecutorService.java:38)
        at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$5(NodeTestTask.java:143)
        at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
        at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$7(NodeTestTask.java:129)
        at org.junit.platform.engine.support.hierarchical.Node.around(Node.java:137)
        at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$8(NodeTestTask.java:127)
        at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
        at org.junit.platform.engine.support.hierarchical.NodeTestTask.executeRecursively(NodeTestTask.java:126)
        at org.junit.platform.engine.support.hierarchical.NodeTestTask.execute(NodeTestTask.java:84)
        at java.util.ArrayList.forEach(ArrayList.java:1259)
        at org.junit.platform.engine.support.hierarchical.SameThreadHierarchicalTestExecutorService.invokeAll(SameThreadHierarchicalTestExecutorService.java:38)
        at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$5(NodeTestTask.java:143)
        at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
        at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$7(NodeTestTask.java:129)
        at org.junit.platform.engine.support.hierarchical.Node.around(Node.java:137)
        at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$8(NodeTestTask.java:127)
        at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
        at org.junit.platform.engine.support.hierarchical.NodeTestTask.executeRecursively(NodeTestTask.java:126)
        at org.junit.platform.engine.support.hierarchical.NodeTestTask.execute(NodeTestTask.java:84)
        at org.junit.platform.engine.support.hierarchical.SameThreadHierarchicalTestExecutorService.submit(SameThreadHierarchicalTestExecutorService.java:32)
        at org.junit.platform.engine.support.hierarchical.HierarchicalTestExecutor.execute(HierarchicalTestExecutor.java:57)
        at org.junit.platform.engine.support.hierarchical.HierarchicalTestEngine.execute(HierarchicalTestEngine.java:51)
        at org.junit.platform.launcher.core.DefaultLauncher.execute(DefaultLauncher.java:220)
        at org.junit.platform.launcher.core.DefaultLauncher.lambda$execute$6(DefaultLauncher.java:188)
        at org.junit.platform.launcher.core.DefaultLauncher.withInterceptedStreams(DefaultLauncher.java:202)
        at org.junit.platform.launcher.core.DefaultLauncher.execute(DefaultLauncher.java:181)
        at org.junit.platform.launcher.core.DefaultLauncher.execute(DefaultLauncher.java:128)
        at org.apache.maven.surefire.junitplatform.JUnitPlatformProvider.invokeAllTests(JUnitPlatformProvider.java:150)
        at org.apache.maven.surefire.junitplatform.JUnitPlatformProvider.invoke(JUnitPlatformProvider.java:124)
        at org.apache.maven.surefire.booter.ForkedBooter.invokeProviderInSameClassLoader(ForkedBooter.java:384)
        at org.apache.maven.surefire.booter.ForkedBooter.runSuitesInProcess(ForkedBooter.java:345)
        at org.apache.maven.surefire.booter.ForkedBooter.execute(ForkedBooter.java:126)
        at org.apache.maven.surefire.booter.ForkedBooter.main(ForkedBooter.java:418)

12:35:55.744 [main] INFO  o.s.c.s.PostProcessorRegistrationDelegate$BeanPostProcessorChecker - Bean 'amazonRdsDatabaseAutoConfigurationTest.ApplicationConfigurationWithoutReadReplica' of type [org.springframework.cloud.aws.autoconfigure.jdbc.AmazonRdsDatabaseAutoConfigurationTest$ApplicationConfigurationWithoutReadReplica] is not eligible for getting processed by all BeanPostProcessors (for example: not eligible for auto-proxying)
12:35:55.746 [main] INFO  o.s.c.s.PostProcessorRegistrationDelegate$BeanPostProcessorChecker - Bean 'amazonRDS' of type [com.amazonaws.services.rds.AmazonRDSClient$MockitoMock$1422368443] is not eligible for getting processed by all BeanPostProcessors (for example: not eligible for auto-proxying)
[INFO] Tests run: 13, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 1.236 s - in org.springframework.cloud.aws.autoconfigure.jdbc.AmazonRdsDatabaseAutoConfigurationTest
[INFO] Running org.springframework.cloud.aws.autoconfigure.mail.SesAutoConfigurationTest
[INFO] Tests run: 9, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.322 s - in org.springframework.cloud.aws.autoconfigure.mail.SesAutoConfigurationTest
[INFO] Running org.springframework.cloud.aws.autoconfigure.mail.SimpleEmailAutoConfigurationTest
[INFO] Tests run: 7, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.133 s - in org.springframework.cloud.aws.autoconfigure.mail.SimpleEmailAutoConfigurationTest
[INFO] Running org.springframework.cloud.aws.autoconfigure.messaging.SnsAutoConfigurationTest
[INFO] Tests run: 10, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.713 s - in org.springframework.cloud.aws.autoconfigure.messaging.SnsAutoConfigurationTest
[INFO] Running org.springframework.cloud.aws.autoconfigure.messaging.SqsAutoConfigurationTest
12:35:57.180 [main] INFO  o.s.s.c.ThreadPoolTaskExecutor - Initializing ExecutorService
12:35:57.193 [main] INFO  o.s.s.c.ThreadPoolTaskExecutor - Shutting down ExecutorService
12:35:57.300 [main] INFO  o.s.s.c.ThreadPoolTaskExecutor - Initializing ExecutorService
12:35:57.302 [main] INFO  o.s.s.c.ThreadPoolTaskExecutor - Shutting down ExecutorService
12:35:57.342 [main] INFO  o.s.s.c.ThreadPoolTaskExecutor - Initializing ExecutorService
12:35:57.344 [main] INFO  o.s.s.c.ThreadPoolTaskExecutor - Shutting down ExecutorService
12:35:57.363 [main] INFO  o.s.s.c.ThreadPoolTaskExecutor - Initializing ExecutorService
12:35:57.365 [main] INFO  o.s.s.c.ThreadPoolTaskExecutor - Shutting down ExecutorService
12:35:57.387 [main] INFO  o.s.s.c.ThreadPoolTaskExecutor - Initializing ExecutorService
12:35:57.389 [main] INFO  o.s.s.c.ThreadPoolTaskExecutor - Shutting down ExecutorService
12:35:57.427 [main] INFO  o.s.s.c.ThreadPoolTaskExecutor - Initializing ExecutorService
12:35:57.434 [main] INFO  o.s.s.c.ThreadPoolTaskExecutor - Shutting down ExecutorService
12:35:57.453 [main] INFO  o.s.s.c.ThreadPoolTaskExecutor - Initializing ExecutorService
12:35:57.454 [main] INFO  o.s.s.c.ThreadPoolTaskExecutor - Shutting down ExecutorService
12:35:57.642 [main] INFO  o.s.s.c.ThreadPoolTaskExecutor - Initializing ExecutorService
12:35:57.643 [main] INFO  o.s.s.c.ThreadPoolTaskExecutor - Shutting down ExecutorService
12:35:57.661 [main] INFO  o.s.s.c.ThreadPoolTaskExecutor - Initializing ExecutorService
12:35:57.663 [main] INFO  o.s.s.c.ThreadPoolTaskExecutor - Shutting down ExecutorService
12:35:57.682 [main] INFO  o.s.s.c.ThreadPoolTaskExecutor - Initializing ExecutorService
12:35:57.684 [main] INFO  o.s.s.c.ThreadPoolTaskExecutor - Shutting down ExecutorService
12:35:57.706 [main] INFO  o.s.s.c.ThreadPoolTaskExecutor - Initializing ExecutorService
12:35:57.707 [main] INFO  o.s.s.c.ThreadPoolTaskExecutor - Shutting down ExecutorService
12:35:57.725 [main] INFO  o.s.s.c.ThreadPoolTaskExecutor - Initializing ExecutorService
12:35:57.727 [main] INFO  o.s.s.c.ThreadPoolTaskExecutor - Shutting down ExecutorService
12:35:57.750 [main] INFO  o.s.s.c.ThreadPoolTaskExecutor - Initializing ExecutorService
12:35:57.751 [main] INFO  o.s.s.c.ThreadPoolTaskExecutor - Shutting down ExecutorService
12:35:57.770 [main] INFO  o.s.s.c.ThreadPoolTaskExecutor - Initializing ExecutorService
12:35:57.771 [main] INFO  o.s.s.c.ThreadPoolTaskExecutor - Shutting down ExecutorService
12:35:57.815 [main] INFO  o.s.s.c.ThreadPoolTaskExecutor - Initializing ExecutorService
12:35:57.817 [main] INFO  o.s.s.c.ThreadPoolTaskExecutor - Shutting down ExecutorService
12:35:57.840 [main] INFO  o.s.s.c.ThreadPoolTaskExecutor - Initializing ExecutorService
12:35:57.842 [main] INFO  o.s.s.c.ThreadPoolTaskExecutor - Shutting down ExecutorService
12:35:57.870 [main] INFO  o.s.s.c.ThreadPoolTaskExecutor - Initializing ExecutorService
12:35:57.872 [main] INFO  o.s.s.c.ThreadPoolTaskExecutor - Shutting down ExecutorService
[INFO] Tests run: 19, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.819 s - in org.springframework.cloud.aws.autoconfigure.messaging.SqsAutoConfigurationTest
[INFO] Running org.springframework.cloud.aws.autoconfigure.metrics.CloudWatchExportAutoConfigurationTest
12:35:58.015 [main] INFO  i.m.c.i.push.PushMeterRegistry - publishing metrics for CloudWatchMeterRegistry every 1m
12:35:58.073 [main] INFO  i.m.c.i.push.PushMeterRegistry - publishing metrics for CloudWatchMeterRegistry every 1m
12:35:58.102 [main] INFO  i.m.c.i.push.PushMeterRegistry - publishing metrics for CloudWatchMeterRegistry every 1m
12:35:58.130 [main] INFO  i.m.c.i.push.PushMeterRegistry - publishing metrics for CloudWatchMeterRegistry every 1m
12:35:58.156 [main] INFO  i.m.c.i.push.PushMeterRegistry - publishing metrics for CloudWatchMeterRegistry every 1m
12:35:58.183 [main] INFO  i.m.c.i.push.PushMeterRegistry - publishing metrics for CloudWatchMeterRegistry every 1m
[INFO] Tests run: 7, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.303 s - in org.springframework.cloud.aws.autoconfigure.metrics.CloudWatchExportAutoConfigurationTest
[INFO] Running org.springframework.cloud.aws.autoconfigure.metrics.CloudWatchPropertiesTest
[INFO] Tests run: 2, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.009 s - in org.springframework.cloud.aws.autoconfigure.metrics.CloudWatchPropertiesTest
[INFO] Running org.springframework.cloud.aws.autoconfigure.security.CognitoAuthenticationAutoConfigurationTest
[INFO] Tests run: 2, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.125 s - in org.springframework.cloud.aws.autoconfigure.security.CognitoAuthenticationAutoConfigurationTest
[INFO]
[INFO] Results:
[INFO]
[ERROR] Failures:
[ERROR]   ContextInstanceDataAutoConfigurationTest.createInstanceDataResolverThatResolvesWithDefaultAttributes:60->lambda$createInstanceDataResolverThatResolvesWithDefaultAttributes$0:61
Expecting:
 <null>
to be equal to:
 <"b">
but was not.
[ERROR]   ContextInstanceDataAutoConfigurationTest.customAttributeSeparator_createInstanceDataResolverThatResolvesWithCustomAttribute:99->lambda$customAttributeSeparator_createInstanceDataResolverThatResolvesWithCustomAttribute$2:100
Expecting:
 <null>
to be equal to:
 <"b">
but was not.
[ERROR]   ContextInstanceDataAutoConfigurationTest.customValueSeparator_createInstanceDataResolverThatResolvesWithCustomValueSeparator:80->lambda$customValueSeparator_createInstanceDataResolverThatResolvesWithCustomValueSeparator$1:82
Expecting:
 <"C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-autoconfigure">
to be equal to:
 <"d">
but was not.
[ERROR] Errors:
[ERROR]   ContextStackAutoConfigurationTest.stackRegistry_autoConfigurationEnabled_returnsAutoConfiguredStackRegistry:70->lambda$stackRegistry_autoConfigurationEnabled_returnsAutoConfiguredStackRegistry$0:70 ▒ IllegalState
[INFO]
[ERROR] Tests run: 122, Failures: 3, Errors: 1, Skipped: 0
[INFO]
[INFO] ------------------------------------------------------------------------
[INFO] Reactor Summary for Spring Cloud AWS 3.0.0-SNAPSHOT:
[INFO]
[INFO] Spring Cloud AWS Dependencies ...................... SUCCESS [  0.091 s]
[INFO] Spring Cloud AWS ................................... SUCCESS [02:21 min]
[INFO] Spring Cloud AWS Core .............................. SUCCESS [01:08 min]
[INFO] Spring Cloud AWS Context ........................... SUCCESS [02:31 min]
[INFO] Spring Cloud AWS JDBC .............................. SUCCESS [ 33.122 s]
[INFO] Spring Cloud AWS Messaging ......................... SUCCESS [ 40.565 s]
[INFO] Spring Cloud AWS Parameter Store Configuration ..... SUCCESS [ 13.079 s]
[INFO] Spring Cloud AWS SimpleEmail ....................... SUCCESS [  4.770 s]
[INFO] Spring Cloud AWS Autoconfigure ..................... FAILURE [ 32.266 s]
[INFO] Spring Cloud AWS Secrets Manager Configuration ..... SKIPPED
[INFO] Spring Cloud AWS Starter ........................... SKIPPED
[INFO] Spring Cloud AWS JDBC Starter ...................... SKIPPED
[INFO] Spring Cloud AWS Messaging Starter ................. SKIPPED
[INFO] Spring Cloud AWS Parameter Store Configuration Starter SKIPPED
[INFO] Spring Cloud AWS Secrets Manager Configuration Starter SKIPPED
[INFO] Spring Cloud AWS SES Starter ....................... SKIPPED
[INFO] Spring Cloud AWS Integration Tests ................. SKIPPED
[INFO] Spring Cloud AWS Docs .............................. SKIPPED
[INFO] ------------------------------------------------------------------------
[INFO] BUILD FAILURE
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  08:28 min
[INFO] Finished at: 2022-02-19T12:35:58+01:00
[INFO] ------------------------------------------------------------------------
[ERROR] Failed to execute goal org.apache.maven.plugins:maven-surefire-plugin:2.22.2:test (default-test) on project spring-cloud-aws-autoconfigure: There are test failures.
[ERROR]
[ERROR] Please refer to C:\Users\jstupar\my_spring_cloud_aws\spring-cloud-aws\spring-cloud-aws-autoconfigure\target\surefire-reports for the individual test results.
[ERROR] Please refer to dump files (if any exist) [date].dump, [date]-jvmRun[N].dump and [date].dumpstream.
[ERROR] -> [Help 1]
[ERROR]
[ERROR] To see the full stack trace of the errors, re-run Maven with the -e switch.
[ERROR] Re-run Maven using the -X switch to enable full debug logging.
[ERROR]
[ERROR] For more information about the errors and possible solutions, please read the following articles:
[ERROR] [Help 1] http://cwiki.apache.org/confluence/display/MAVEN/MojoFailureException
[ERROR]
[ERROR] After correcting the problems, you can resume the build with the command
[ERROR]   mvn <args> -rf :spring-cloud-aws-autoconfigure

jstupar@SRB2NF69C3 MINGW64 ~/my_spring_cloud_aws/spring-cloud-aws (main)
$ cd spring-cloud-aws/
