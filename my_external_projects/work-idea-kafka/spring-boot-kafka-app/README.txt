==================================  Kafka ====================

1. Start Zookeeper and Kafka
2. yml file is used for application properties
3. REST APis from Postman:
POST
http://localhost:9000/kafka/publish?message=Alphabet

POST
http://localhost:9000/kafka/createUser?userId=1&firstName=Jaca&lastName=Stupar

4. Log on Idea and bellow 5. log on Kafka
"C:\Program Files\Java\jdk1.8.0_241\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2019.3.1\lib\idea_rt.jar=60190:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2019.3.1\bin" -Dfile.encoding=UTF-8 -classpath "C:\Program Files\Java\jdk1.8.0_241\jre\lib\charsets.jar;C:\Program Files\Java\jdk1.8.0_241\jre\lib\deploy.jar;C:\Program Files\Java\jdk1.8.0_241\jre\lib\ext\access-bridge-64.jar;C:\Program Files\Java\jdk1.8.0_241\jre\lib\ext\cldrdata.jar;C:\Program Files\Java\jdk1.8.0_241\jre\lib\ext\dnsns.jar;C:\Program Files\Java\jdk1.8.0_241\jre\lib\ext\jaccess.jar;C:\Program Files\Java\jdk1.8.0_241\jre\lib\ext\jfxrt.jar;C:\Program Files\Java\jdk1.8.0_241\jre\lib\ext\localedata.jar;C:\Program Files\Java\jdk1.8.0_241\jre\lib\ext\nashorn.jar;C:\Program Files\Java\jdk1.8.0_241\jre\lib\ext\sunec.jar;C:\Program Files\Java\jdk1.8.0_241\jre\lib\ext\sunjce_provider.jar;C:\Program Files\Java\jdk1.8.0_241\jre\lib\ext\sunmscapi.jar;C:\Program Files\Java\jdk1.8.0_241\jre\lib\ext\sunpkcs11.jar;C:\Program Files\Java\jdk1.8.0_241\jre\lib\ext\zipfs.jar;C:\Program Files\Java\jdk1.8.0_241\jre\lib\javaws.jar;C:\Program Files\Java\jdk1.8.0_241\jre\lib\jce.jar;C:\Program Files\Java\jdk1.8.0_241\jre\lib\jfr.jar;C:\Program Files\Java\jdk1.8.0_241\jre\lib\jfxswt.jar;C:\Program Files\Java\jdk1.8.0_241\jre\lib\jsse.jar;C:\Program Files\Java\jdk1.8.0_241\jre\lib\management-agent.jar;C:\Program Files\Java\jdk1.8.0_241\jre\lib\plugin.jar;C:\Program Files\Java\jdk1.8.0_241\jre\lib\resources.jar;C:\Program Files\Java\jdk1.8.0_241\jre\lib\rt.jar;E:\work-idea-kafka\spring-boot-kafka-app\target\classes;C:\Users\Jaca\.m2\repository\org\springframework\boot\spring-boot-starter-web\2.3.0.RELEASE\spring-boot-starter-web-2.3.0.RELEASE.jar;C:\Users\Jaca\.m2\repository\org\springframework\boot\spring-boot-starter\2.3.0.RELEASE\spring-boot-starter-2.3.0.RELEASE.jar;C:\Users\Jaca\.m2\repository\org\springframework\boot\spring-boot\2.3.0.RELEASE\spring-boot-2.3.0.RELEASE.jar;C:\Users\Jaca\.m2\repository\org\springframework\boot\spring-boot-autoconfigure\2.3.0.RELEASE\spring-boot-autoconfigure-2.3.0.RELEASE.jar;C:\Users\Jaca\.m2\repository\org\springframework\boot\spring-boot-starter-logging\2.3.0.RELEASE\spring-boot-starter-logging-2.3.0.RELEASE.jar;C:\Users\Jaca\.m2\repository\ch\qos\logback\logback-classic\1.2.3\logback-classic-1.2.3.jar;C:\Users\Jaca\.m2\repository\ch\qos\logback\logback-core\1.2.3\logback-core-1.2.3.jar;C:\Users\Jaca\.m2\repository\org\apache\logging\log4j\log4j-to-slf4j\2.13.2\log4j-to-slf4j-2.13.2.jar;C:\Users\Jaca\.m2\repository\org\apache\logging\log4j\log4j-api\2.13.2\log4j-api-2.13.2.jar;C:\Users\Jaca\.m2\repository\org\slf4j\jul-to-slf4j\1.7.30\jul-to-slf4j-1.7.30.jar;C:\Users\Jaca\.m2\repository\jakarta\annotation\jakarta.annotation-api\1.3.5\jakarta.annotation-api-1.3.5.jar;C:\Users\Jaca\.m2\repository\org\yaml\snakeyaml\1.26\snakeyaml-1.26.jar;C:\Users\Jaca\.m2\repository\org\springframework\boot\spring-boot-starter-json\2.3.0.RELEASE\spring-boot-starter-json-2.3.0.RELEASE.jar;C:\Users\Jaca\.m2\repository\com\fasterxml\jackson\core\jackson-databind\2.11.0\jackson-databind-2.11.0.jar;C:\Users\Jaca\.m2\repository\com\fasterxml\jackson\core\jackson-annotations\2.11.0\jackson-annotations-2.11.0.jar;C:\Users\Jaca\.m2\repository\com\fasterxml\jackson\core\jackson-core\2.11.0\jackson-core-2.11.0.jar;C:\Users\Jaca\.m2\repository\com\fasterxml\jackson\datatype\jackson-datatype-jdk8\2.11.0\jackson-datatype-jdk8-2.11.0.jar;C:\Users\Jaca\.m2\repository\com\fasterxml\jackson\datatype\jackson-datatype-jsr310\2.11.0\jackson-datatype-jsr310-2.11.0.jar;C:\Users\Jaca\.m2\repository\com\fasterxml\jackson\module\jackson-module-parameter-names\2.11.0\jackson-module-parameter-names-2.11.0.jar;C:\Users\Jaca\.m2\repository\org\springframework\boot\spring-boot-starter-tomcat\2.3.0.RELEASE\spring-boot-starter-tomcat-2.3.0.RELEASE.jar;C:\Users\Jaca\.m2\repository\org\apache\tomcat\embed\tomcat-embed-core\9.0.35\tomcat-embed-core-9.0.35.jar;C:\Users\Jaca\.m2\repository\org\glassfish\jakarta.el\3.0.3\jakarta.el-3.0.3.jar;C:\Users\Jaca\.m2\repository\org\apache\tomcat\embed\tomcat-embed-websocket\9.0.35\tomcat-embed-websocket-9.0.35.jar;C:\Users\Jaca\.m2\repository\org\springframework\spring-web\5.2.6.RELEASE\spring-web-5.2.6.RELEASE.jar;C:\Users\Jaca\.m2\repository\org\springframework\spring-beans\5.2.6.RELEASE\spring-beans-5.2.6.RELEASE.jar;C:\Users\Jaca\.m2\repository\org\springframework\spring-webmvc\5.2.6.RELEASE\spring-webmvc-5.2.6.RELEASE.jar;C:\Users\Jaca\.m2\repository\org\springframework\spring-aop\5.2.6.RELEASE\spring-aop-5.2.6.RELEASE.jar;C:\Users\Jaca\.m2\repository\org\springframework\spring-expression\5.2.6.RELEASE\spring-expression-5.2.6.RELEASE.jar;C:\Users\Jaca\.m2\repository\org\springframework\kafka\spring-kafka\2.5.0.RELEASE\spring-kafka-2.5.0.RELEASE.jar;C:\Users\Jaca\.m2\repository\org\springframework\spring-context\5.2.6.RELEASE\spring-context-5.2.6.RELEASE.jar;C:\Users\Jaca\.m2\repository\org\springframework\spring-messaging\5.2.6.RELEASE\spring-messaging-5.2.6.RELEASE.jar;C:\Users\Jaca\.m2\repository\org\springframework\spring-tx\5.2.6.RELEASE\spring-tx-5.2.6.RELEASE.jar;C:\Users\Jaca\.m2\repository\org\springframework\retry\spring-retry\1.2.5.RELEASE\spring-retry-1.2.5.RELEASE.jar;C:\Users\Jaca\.m2\repository\org\apache\kafka\kafka-clients\2.5.0\kafka-clients-2.5.0.jar;C:\Users\Jaca\.m2\repository\com\github\luben\zstd-jni\1.4.4-7\zstd-jni-1.4.4-7.jar;C:\Users\Jaca\.m2\repository\org\lz4\lz4-java\1.7.1\lz4-java-1.7.1.jar;C:\Users\Jaca\.m2\repository\org\xerial\snappy\snappy-java\1.1.7.3\snappy-java-1.1.7.3.jar;C:\Users\Jaca\.m2\repository\org\slf4j\slf4j-api\1.7.30\slf4j-api-1.7.30.jar;C:\Users\Jaca\.m2\repository\org\springframework\spring-core\5.2.6.RELEASE\spring-core-5.2.6.RELEASE.jar;C:\Users\Jaca\.m2\repository\org\springframework\spring-jcl\5.2.6.RELEASE\spring-jcl-5.2.6.RELEASE.jar" com.howtodoinjava.kafka.demo.SpringBootKafkaAppApplication

  .   ____          _            __ _ _
 /\\ / ___'_ __ _ _(_)_ __  __ _ \ \ \ \
( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
 \\/  ___)| |_)| | | | | || (_| |  ) ) ) )
  '  |____| .__|_| |_|_| |_\__, | / / / /
 =========|_|==============|___/=/_/_/_/
 :: Spring Boot ::        (v2.3.0.RELEASE)

2020-08-21 02:21:29.683  INFO 1720 --- [           main] c.h.k.d.SpringBootKafkaAppApplication    : Starting SpringBootKafkaAppApplication on DESKTOP-G102BV9 with PID 1720 (E:\work-idea-kafka\spring-boot-kafka-app\target\classes started by Jaca in E:\work-idea-kafka\spring-boot-kafka-app)
2020-08-21 02:21:29.686  INFO 1720 --- [           main] c.h.k.d.SpringBootKafkaAppApplication    : No active profile set, falling back to default profiles: default
2020-08-21 02:21:32.172  INFO 1720 --- [           main] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat initialized with port(s): 9000 (http)
2020-08-21 02:21:32.184  INFO 1720 --- [           main] o.apache.catalina.core.StandardService   : Starting service [Tomcat]
2020-08-21 02:21:32.184  INFO 1720 --- [           main] org.apache.catalina.core.StandardEngine  : Starting Servlet engine: [Apache Tomcat/9.0.35]
2020-08-21 02:21:32.315  INFO 1720 --- [           main] o.a.c.c.C.[Tomcat].[localhost].[/]       : Initializing Spring embedded WebApplicationContext
2020-08-21 02:21:32.315  INFO 1720 --- [           main] o.s.web.context.ContextLoader            : Root WebApplicationContext: initialization completed in 2528 ms
2020-08-21 02:21:32.640  INFO 1720 --- [           main] o.s.s.concurrent.ThreadPoolTaskExecutor  : Initializing ExecutorService 'applicationTaskExecutor'
2020-08-21 02:21:33.015  INFO 1720 --- [           main] o.a.k.clients.consumer.ConsumerConfig    : ConsumerConfig values:
	allow.auto.create.topics = true
	auto.commit.interval.ms = 5000
	auto.offset.reset = earliest
	bootstrap.servers = [localhost:9092]
	check.crcs = true
	client.dns.lookup = default
	client.id =
	client.rack =
	connections.max.idle.ms = 540000
	default.api.timeout.ms = 60000
	enable.auto.commit = false
	exclude.internal.topics = true
	fetch.max.bytes = 52428800
	fetch.max.wait.ms = 500
	fetch.min.bytes = 1
	group.id = group_id
	group.instance.id = null
	heartbeat.interval.ms = 3000
	interceptor.classes = []
	internal.leave.group.on.close = true
	isolation.level = read_uncommitted
	key.deserializer = class org.apache.kafka.common.serialization.StringDeserializer
	max.partition.fetch.bytes = 1048576
	max.poll.interval.ms = 300000
	max.poll.records = 500
	metadata.max.age.ms = 300000
	metric.reporters = []
	metrics.num.samples = 2
	metrics.recording.level = INFO
	metrics.sample.window.ms = 30000
	partition.assignment.strategy = [class org.apache.kafka.clients.consumer.RangeAssignor]
	receive.buffer.bytes = 65536
	reconnect.backoff.max.ms = 1000
	reconnect.backoff.ms = 50
	request.timeout.ms = 30000
	retry.backoff.ms = 100
	sasl.client.callback.handler.class = null
	sasl.jaas.config = null
	sasl.kerberos.kinit.cmd = /usr/bin/kinit
	sasl.kerberos.min.time.before.relogin = 60000
	sasl.kerberos.service.name = null
	sasl.kerberos.ticket.renew.jitter = 0.05
	sasl.kerberos.ticket.renew.window.factor = 0.8
	sasl.login.callback.handler.class = null
	sasl.login.class = null
	sasl.login.refresh.buffer.seconds = 300
	sasl.login.refresh.min.period.seconds = 60
	sasl.login.refresh.window.factor = 0.8
	sasl.login.refresh.window.jitter = 0.05
	sasl.mechanism = GSSAPI
	security.protocol = PLAINTEXT
	security.providers = null
	send.buffer.bytes = 131072
	session.timeout.ms = 10000
	ssl.cipher.suites = null
	ssl.enabled.protocols = [TLSv1.2]
	ssl.endpoint.identification.algorithm = https
	ssl.key.password = null
	ssl.keymanager.algorithm = SunX509
	ssl.keystore.location = null
	ssl.keystore.password = null
	ssl.keystore.type = JKS
	ssl.protocol = TLSv1.2
	ssl.provider = null
	ssl.secure.random.implementation = null
	ssl.trustmanager.algorithm = PKIX
	ssl.truststore.location = null
	ssl.truststore.password = null
	ssl.truststore.type = JKS
	value.deserializer = class org.springframework.kafka.support.serializer.JsonDeserializer

2020-08-21 02:21:33.204  INFO 1720 --- [           main] o.a.kafka.common.utils.AppInfoParser     : Kafka version: 2.5.0
2020-08-21 02:21:33.206  INFO 1720 --- [           main] o.a.kafka.common.utils.AppInfoParser     : Kafka commitId: 66563e712b0b9f84
2020-08-21 02:21:33.207  INFO 1720 --- [           main] o.a.kafka.common.utils.AppInfoParser     : Kafka startTimeMs: 1597969293202
2020-08-21 02:21:33.210  INFO 1720 --- [           main] o.a.k.clients.consumer.KafkaConsumer     : [Consumer clientId=consumer-group_id-1, groupId=group_id] Subscribed to topic(s): test
2020-08-21 02:21:33.213  INFO 1720 --- [           main] o.s.s.c.ThreadPoolTaskScheduler          : Initializing ExecutorService
2020-08-21 02:21:33.221  INFO 1720 --- [           main] o.a.k.clients.consumer.ConsumerConfig    : ConsumerConfig values:
	allow.auto.create.topics = true
	auto.commit.interval.ms = 5000
	auto.offset.reset = earliest
	bootstrap.servers = [localhost:9092]
	check.crcs = true
	client.dns.lookup = default
	client.id =
	client.rack =
	connections.max.idle.ms = 540000
	default.api.timeout.ms = 60000
	enable.auto.commit = false
	exclude.internal.topics = true
	fetch.max.bytes = 52428800
	fetch.max.wait.ms = 500
	fetch.min.bytes = 1
	group.id = group_id
	group.instance.id = null
	heartbeat.interval.ms = 3000
	interceptor.classes = []
	internal.leave.group.on.close = true
	isolation.level = read_uncommitted
	key.deserializer = class org.apache.kafka.common.serialization.StringDeserializer
	max.partition.fetch.bytes = 1048576
	max.poll.interval.ms = 300000
	max.poll.records = 500
	metadata.max.age.ms = 300000
	metric.reporters = []
	metrics.num.samples = 2
	metrics.recording.level = INFO
	metrics.sample.window.ms = 30000
	partition.assignment.strategy = [class org.apache.kafka.clients.consumer.RangeAssignor]
	receive.buffer.bytes = 65536
	reconnect.backoff.max.ms = 1000
	reconnect.backoff.ms = 50
	request.timeout.ms = 30000
	retry.backoff.ms = 100
	sasl.client.callback.handler.class = null
	sasl.jaas.config = null
	sasl.kerberos.kinit.cmd = /usr/bin/kinit
	sasl.kerberos.min.time.before.relogin = 60000
	sasl.kerberos.service.name = null
	sasl.kerberos.ticket.renew.jitter = 0.05
	sasl.kerberos.ticket.renew.window.factor = 0.8
	sasl.login.callback.handler.class = null
	sasl.login.class = null
	sasl.login.refresh.buffer.seconds = 300
	sasl.login.refresh.min.period.seconds = 60
	sasl.login.refresh.window.factor = 0.8
	sasl.login.refresh.window.jitter = 0.05
	sasl.mechanism = GSSAPI
	security.protocol = PLAINTEXT
	security.providers = null
	send.buffer.bytes = 131072
	session.timeout.ms = 10000
	ssl.cipher.suites = null
	ssl.enabled.protocols = [TLSv1.2]
	ssl.endpoint.identification.algorithm = https
	ssl.key.password = null
	ssl.keymanager.algorithm = SunX509
	ssl.keystore.location = null
	ssl.keystore.password = null
	ssl.keystore.type = JKS
	ssl.protocol = TLSv1.2
	ssl.provider = null
	ssl.secure.random.implementation = null
	ssl.trustmanager.algorithm = PKIX
	ssl.truststore.location = null
	ssl.truststore.password = null
	ssl.truststore.type = JKS
	value.deserializer = class org.springframework.kafka.support.serializer.JsonDeserializer

2020-08-21 02:21:33.243  INFO 1720 --- [           main] o.a.kafka.common.utils.AppInfoParser     : Kafka version: 2.5.0
2020-08-21 02:21:33.243  INFO 1720 --- [           main] o.a.kafka.common.utils.AppInfoParser     : Kafka commitId: 66563e712b0b9f84
2020-08-21 02:21:33.243  INFO 1720 --- [           main] o.a.kafka.common.utils.AppInfoParser     : Kafka startTimeMs: 1597969293243
2020-08-21 02:21:33.243  INFO 1720 --- [           main] o.a.k.clients.consumer.KafkaConsumer     : [Consumer clientId=consumer-group_id-2, groupId=group_id] Subscribed to topic(s): users-log
2020-08-21 02:21:33.244  INFO 1720 --- [           main] o.s.s.c.ThreadPoolTaskScheduler          : Initializing ExecutorService
2020-08-21 02:21:33.278  INFO 1720 --- [           main] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat started on port(s): 9000 (http) with context path ''
2020-08-21 02:21:33.291  INFO 1720 --- [           main] c.h.k.d.SpringBootKafkaAppApplication    : Started SpringBootKafkaAppApplication in 4.134 seconds (JVM running for 4.903)
2020-08-21 02:21:33.770  WARN 1720 --- [ntainer#0-0-C-1] org.apache.kafka.clients.NetworkClient   : [Consumer clientId=consumer-group_id-1, groupId=group_id] Error while fetching metadata with correlation id 2 : {test=LEADER_NOT_AVAILABLE}
2020-08-21 02:21:33.770  WARN 1720 --- [ntainer#1-0-C-1] org.apache.kafka.clients.NetworkClient   : [Consumer clientId=consumer-group_id-2, groupId=group_id] Error while fetching metadata with correlation id 2 : {users-log=LEADER_NOT_AVAILABLE}
2020-08-21 02:21:33.775  INFO 1720 --- [ntainer#1-0-C-1] org.apache.kafka.clients.Metadata        : [Consumer clientId=consumer-group_id-2, groupId=group_id] Cluster ID: fOnF617hQkGInfSSa6vY6g
2020-08-21 02:21:33.775  INFO 1720 --- [ntainer#0-0-C-1] org.apache.kafka.clients.Metadata        : [Consumer clientId=consumer-group_id-1, groupId=group_id] Cluster ID: fOnF617hQkGInfSSa6vY6g
2020-08-21 02:21:33.777  INFO 1720 --- [ntainer#0-0-C-1] o.a.k.c.c.internals.AbstractCoordinator  : [Consumer clientId=consumer-group_id-1, groupId=group_id] Discovered group coordinator DESKTOP-G102BV9:9092 (id: 2147483647 rack: null)
2020-08-21 02:21:33.777  INFO 1720 --- [ntainer#1-0-C-1] o.a.k.c.c.internals.AbstractCoordinator  : [Consumer clientId=consumer-group_id-2, groupId=group_id] Discovered group coordinator DESKTOP-G102BV9:9092 (id: 2147483647 rack: null)
2020-08-21 02:21:33.783  INFO 1720 --- [ntainer#0-0-C-1] o.a.k.c.c.internals.AbstractCoordinator  : [Consumer clientId=consumer-group_id-1, groupId=group_id] (Re-)joining group
2020-08-21 02:21:33.783  INFO 1720 --- [ntainer#1-0-C-1] o.a.k.c.c.internals.AbstractCoordinator  : [Consumer clientId=consumer-group_id-2, groupId=group_id] (Re-)joining group
2020-08-21 02:21:33.820  INFO 1720 --- [ntainer#1-0-C-1] o.a.k.c.c.internals.AbstractCoordinator  : [Consumer clientId=consumer-group_id-2, groupId=group_id] Join group failed with org.apache.kafka.common.errors.MemberIdRequiredException: The group member needs to have a valid member id before actually entering a consumer group
2020-08-21 02:21:33.820  INFO 1720 --- [ntainer#0-0-C-1] o.a.k.c.c.internals.AbstractCoordinator  : [Consumer clientId=consumer-group_id-1, groupId=group_id] Join group failed with org.apache.kafka.common.errors.MemberIdRequiredException: The group member needs to have a valid member id before actually entering a consumer group
2020-08-21 02:21:33.821  INFO 1720 --- [ntainer#1-0-C-1] o.a.k.c.c.internals.AbstractCoordinator  : [Consumer clientId=consumer-group_id-2, groupId=group_id] (Re-)joining group
2020-08-21 02:21:33.821  INFO 1720 --- [ntainer#0-0-C-1] o.a.k.c.c.internals.AbstractCoordinator  : [Consumer clientId=consumer-group_id-1, groupId=group_id] (Re-)joining group
2020-08-21 02:21:33.868  WARN 1720 --- [ntainer#1-0-C-1] org.apache.kafka.clients.NetworkClient   : [Consumer clientId=consumer-group_id-2, groupId=group_id] Error while fetching metadata with correlation id 7 : {test=LEADER_NOT_AVAILABLE, users-log=LEADER_NOT_AVAILABLE}
2020-08-21 02:21:33.871  WARN 1720 --- [ntainer#1-0-C-1] o.a.k.c.c.internals.ConsumerCoordinator  : [Consumer clientId=consumer-group_id-2, groupId=group_id] The following subscribed topics are not assigned to any members: [test, users-log]
2020-08-21 02:21:33.871  INFO 1720 --- [ntainer#1-0-C-1] o.a.k.c.c.internals.ConsumerCoordinator  : [Consumer clientId=consumer-group_id-2, groupId=group_id] Finished assignment for group at generation 1: {consumer-group_id-2-9d7516d5-402d-4a3d-8912-99cc8844b383=Assignment(partitions=[]), consumer-group_id-1-1e1853f4-9f96-46c8-bd8d-005093268342=Assignment(partitions=[])}
2020-08-21 02:21:33.951  INFO 1720 --- [ntainer#0-0-C-1] o.a.k.c.c.internals.AbstractCoordinator  : [Consumer clientId=consumer-group_id-1, groupId=group_id] Successfully joined group with generation 1
2020-08-21 02:21:33.951  INFO 1720 --- [ntainer#1-0-C-1] o.a.k.c.c.internals.AbstractCoordinator  : [Consumer clientId=consumer-group_id-2, groupId=group_id] Successfully joined group with generation 1
2020-08-21 02:21:33.953  INFO 1720 --- [ntainer#1-0-C-1] o.a.k.c.c.internals.ConsumerCoordinator  : [Consumer clientId=consumer-group_id-2, groupId=group_id] Adding newly assigned partitions:
2020-08-21 02:21:33.953  INFO 1720 --- [ntainer#0-0-C-1] o.a.k.c.c.internals.ConsumerCoordinator  : [Consumer clientId=consumer-group_id-1, groupId=group_id] Adding newly assigned partitions:
2020-08-21 02:21:33.954  INFO 1720 --- [ntainer#0-0-C-1] o.s.k.l.KafkaMessageListenerContainer    : group_id: partitions assigned: []
2020-08-21 02:21:33.954  INFO 1720 --- [ntainer#1-0-C-1] o.s.k.l.KafkaMessageListenerContainer    : group_id: partitions assigned: []
2020-08-21 02:21:33.971  INFO 1720 --- [ntainer#1-0-C-1] o.a.k.c.c.internals.ConsumerCoordinator  : [Consumer clientId=consumer-group_id-2, groupId=group_id] Revoke previously assigned partitions
2020-08-21 02:21:33.972  INFO 1720 --- [ntainer#1-0-C-1] o.s.k.l.KafkaMessageListenerContainer    : group_id: partitions revoked: []
2020-08-21 02:21:33.972  INFO 1720 --- [ntainer#1-0-C-1] o.a.k.c.c.internals.AbstractCoordinator  : [Consumer clientId=consumer-group_id-2, groupId=group_id] (Re-)joining group
2020-08-21 02:21:36.959  INFO 1720 --- [ntainer#0-0-C-1] o.a.k.c.c.internals.AbstractCoordinator  : [Consumer clientId=consumer-group_id-1, groupId=group_id] Attempt to heartbeat failed since group is rebalancing
2020-08-21 02:21:36.960  INFO 1720 --- [ntainer#0-0-C-1] o.a.k.c.c.internals.ConsumerCoordinator  : [Consumer clientId=consumer-group_id-1, groupId=group_id] Revoke previously assigned partitions
2020-08-21 02:21:36.960  INFO 1720 --- [ntainer#0-0-C-1] o.s.k.l.KafkaMessageListenerContainer    : group_id: partitions revoked: []
2020-08-21 02:21:36.960  INFO 1720 --- [ntainer#0-0-C-1] o.a.k.c.c.internals.AbstractCoordinator  : [Consumer clientId=consumer-group_id-1, groupId=group_id] (Re-)joining group
2020-08-21 02:21:36.971  INFO 1720 --- [ntainer#1-0-C-1] o.a.k.c.c.internals.ConsumerCoordinator  : [Consumer clientId=consumer-group_id-2, groupId=group_id] Finished assignment for group at generation 2: {consumer-group_id-2-9d7516d5-402d-4a3d-8912-99cc8844b383=Assignment(partitions=[users-log-0]), consumer-group_id-1-1e1853f4-9f96-46c8-bd8d-005093268342=Assignment(partitions=[test-0])}
2020-08-21 02:21:36.977  INFO 1720 --- [ntainer#0-0-C-1] o.a.k.c.c.internals.AbstractCoordinator  : [Consumer clientId=consumer-group_id-1, groupId=group_id] Successfully joined group with generation 2
2020-08-21 02:21:36.978  INFO 1720 --- [ntainer#1-0-C-1] o.a.k.c.c.internals.AbstractCoordinator  : [Consumer clientId=consumer-group_id-2, groupId=group_id] Successfully joined group with generation 2
2020-08-21 02:21:36.981  INFO 1720 --- [ntainer#1-0-C-1] o.a.k.c.c.internals.ConsumerCoordinator  : [Consumer clientId=consumer-group_id-2, groupId=group_id] Adding newly assigned partitions: users-log-0
2020-08-21 02:21:36.981  INFO 1720 --- [ntainer#0-0-C-1] o.a.k.c.c.internals.ConsumerCoordinator  : [Consumer clientId=consumer-group_id-1, groupId=group_id] Adding newly assigned partitions: test-0
2020-08-21 02:21:36.995  INFO 1720 --- [ntainer#1-0-C-1] o.a.k.c.c.internals.ConsumerCoordinator  : [Consumer clientId=consumer-group_id-2, groupId=group_id] Found no committed offset for partition users-log-0
2020-08-21 02:21:36.995  INFO 1720 --- [ntainer#0-0-C-1] o.a.k.c.c.internals.ConsumerCoordinator  : [Consumer clientId=consumer-group_id-1, groupId=group_id] Found no committed offset for partition test-0
2020-08-21 02:21:37.011  INFO 1720 --- [ntainer#0-0-C-1] o.a.k.c.c.internals.SubscriptionState    : [Consumer clientId=consumer-group_id-1, groupId=group_id] Resetting offset for partition test-0 to offset 0.
2020-08-21 02:21:37.011  INFO 1720 --- [ntainer#1-0-C-1] o.a.k.c.c.internals.SubscriptionState    : [Consumer clientId=consumer-group_id-2, groupId=group_id] Resetting offset for partition users-log-0 to offset 0.
2020-08-21 02:21:37.012  INFO 1720 --- [ntainer#1-0-C-1] o.s.k.l.KafkaMessageListenerContainer    : group_id: partitions assigned: [users-log-0]
2020-08-21 02:21:37.012  INFO 1720 --- [ntainer#0-0-C-1] o.s.k.l.KafkaMessageListenerContainer    : group_id: partitions assigned: [test-0]
2020-08-21 02:22:38.812  INFO 1720 --- [nio-9000-exec-2] o.a.c.c.C.[Tomcat].[localhost].[/]       : Initializing Spring DispatcherServlet 'dispatcherServlet'
2020-08-21 02:22:38.812  INFO 1720 --- [nio-9000-exec-2] o.s.web.servlet.DispatcherServlet        : Initializing Servlet 'dispatcherServlet'
2020-08-21 02:22:38.825  INFO 1720 --- [nio-9000-exec-2] o.s.web.servlet.DispatcherServlet        : Completed initialization in 13 ms
2020-08-21 02:22:38.854  WARN 1720 --- [nio-9000-exec-2] .w.s.m.s.DefaultHandlerExceptionResolver : Resolved [org.springframework.web.HttpRequestMethodNotSupportedException: Request method 'GET' not supported]
2020-08-21 02:23:00.681  INFO 1720 --- [nio-9000-exec-4] c.h.k.demo.service.KafKaProducerService  : Message sent -> Alphabet
2020-08-21 02:23:00.689  INFO 1720 --- [nio-9000-exec-4] o.a.k.clients.producer.ProducerConfig    : ProducerConfig values:
	acks = 1
	batch.size = 16384
	bootstrap.servers = [localhost:9092]
	buffer.memory = 33554432
	client.dns.lookup = default
	client.id = producer-1
	compression.type = none
	connections.max.idle.ms = 540000
	delivery.timeout.ms = 120000
	enable.idempotence = false
	interceptor.classes = []
	key.serializer = class org.apache.kafka.common.serialization.StringSerializer
	linger.ms = 0
	max.block.ms = 60000
	max.in.flight.requests.per.connection = 5
	max.request.size = 1048576
	metadata.max.age.ms = 300000
	metadata.max.idle.ms = 300000
	metric.reporters = []
	metrics.num.samples = 2
	metrics.recording.level = INFO
	metrics.sample.window.ms = 30000
	partitioner.class = class org.apache.kafka.clients.producer.internals.DefaultPartitioner
	receive.buffer.bytes = 32768
	reconnect.backoff.max.ms = 1000
	reconnect.backoff.ms = 50
	request.timeout.ms = 30000
	retries = 2147483647
	retry.backoff.ms = 100
	sasl.client.callback.handler.class = null
	sasl.jaas.config = null
	sasl.kerberos.kinit.cmd = /usr/bin/kinit
	sasl.kerberos.min.time.before.relogin = 60000
	sasl.kerberos.service.name = null
	sasl.kerberos.ticket.renew.jitter = 0.05
	sasl.kerberos.ticket.renew.window.factor = 0.8
	sasl.login.callback.handler.class = null
	sasl.login.class = null
	sasl.login.refresh.buffer.seconds = 300
	sasl.login.refresh.min.period.seconds = 60
	sasl.login.refresh.window.factor = 0.8
	sasl.login.refresh.window.jitter = 0.05
	sasl.mechanism = GSSAPI
	security.protocol = PLAINTEXT
	security.providers = null
	send.buffer.bytes = 131072
	ssl.cipher.suites = null
	ssl.enabled.protocols = [TLSv1.2]
	ssl.endpoint.identification.algorithm = https
	ssl.key.password = null
	ssl.keymanager.algorithm = SunX509
	ssl.keystore.location = null
	ssl.keystore.password = null
	ssl.keystore.type = JKS
	ssl.protocol = TLSv1.2
	ssl.provider = null
	ssl.secure.random.implementation = null
	ssl.trustmanager.algorithm = PKIX
	ssl.truststore.location = null
	ssl.truststore.password = null
	ssl.truststore.type = JKS
	transaction.timeout.ms = 60000
	transactional.id = null
	value.serializer = class org.springframework.kafka.support.serializer.JsonSerializer

2020-08-21 02:23:00.728  INFO 1720 --- [nio-9000-exec-4] o.a.kafka.common.utils.AppInfoParser     : Kafka version: 2.5.0
2020-08-21 02:23:00.729  INFO 1720 --- [nio-9000-exec-4] o.a.kafka.common.utils.AppInfoParser     : Kafka commitId: 66563e712b0b9f84
2020-08-21 02:23:00.729  INFO 1720 --- [nio-9000-exec-4] o.a.kafka.common.utils.AppInfoParser     : Kafka startTimeMs: 1597969380728
2020-08-21 02:23:00.742  INFO 1720 --- [ad | producer-1] org.apache.kafka.clients.Metadata        : [Producer clientId=producer-1] Cluster ID: fOnF617hQkGInfSSa6vY6g
2020-08-21 02:23:00.808  INFO 1720 --- [ntainer#0-0-C-1] c.h.k.demo.service.KafKaConsumerService  : Message recieved -> Alphabet
2020-08-21 02:26:34.751  INFO 1720 --- [nio-9000-exec-5] c.h.k.demo.service.KafKaProducerService  : User created -> User [userId=1, firstName=Jaca, lastName=Stupar]
2020-08-21 02:26:34.812  INFO 1720 --- [ntainer#1-0-C-1] c.h.k.demo.service.KafKaConsumerService  : User created -> User [userId=1, firstName=Jaca, lastName=Stupar]

------------------------------------------------------------------------------
5. Kafka terminal log

Microsoft Windows [Version 10.0.18362.1016]
(c) 2019 Microsoft Corporation. All rights reserved.

C:\Users\Jaca>cd ..

C:\Users>cd ..

C:\>cd kafka_2.12-2.6.0

C:\kafka_2.12-2.6.0>.\bin\windows\kafka-server-start.bat .\config\server.properties
[2020-08-21 02:20:23,817] INFO Registered kafka:type=kafka.Log4jController MBean (kafka.utils.Log4jControllerRegistration$)
[2020-08-21 02:20:24,361] INFO Setting -D jdk.tls.rejectClientInitiatedRenegotiation=true to disable client-initiated TLS renegotiation (org.apache.zookeeper.common.X509Util)
[2020-08-21 02:20:24,419] INFO starting (kafka.server.KafkaServer)
[2020-08-21 02:20:24,420] INFO Connecting to zookeeper on localhost:2181 (kafka.server.KafkaServer)
[2020-08-21 02:20:24,440] INFO [ZooKeeperClient Kafka server] Initializing a new session to localhost:2181. (kafka.zookeeper.ZooKeeperClient)
[2020-08-21 02:20:34,884] INFO Client environment:zookeeper.version=3.5.8-f439ca583e70862c3068a1f2a7d4d068eec33315, built on 05/04/2020 15:53 GMT (org.apache.zookeeper.ZooKeeper)
[2020-08-21 02:20:34,887] INFO Client environment:host.name=DESKTOP-G102BV9 (org.apache.zookeeper.ZooKeeper)
[2020-08-21 02:20:34,888] INFO Client environment:java.version=1.8.0_241 (org.apache.zookeeper.ZooKeeper)
[2020-08-21 02:20:34,888] INFO Client environment:java.vendor=Oracle Corporation (org.apache.zookeeper.ZooKeeper)
[2020-08-21 02:20:34,889] INFO Client environment:java.home=C:\Program Files\Java\jdk1.8.0_241\jre (org.apache.zookeeper.ZooKeeper)
[2020-08-21 02:20:34,889] INFO Client environment:java.class.path=C:\kafka_2.12-2.6.0\libs\activation-1.1.1.jar;C:\kafka_2.12-2.6.0\libs\aopalliance-repackaged-2.5.0.jar;C:\kafka_2.12-2.6.0\libs\argparse4j-0.7.0.jar;C:\kafka_2.12-2.6.0\libs\audience-annotations-0.5.0.jar;C:\kafka_2.12-2.6.0\libs\commons-cli-1.4.jar;C:\kafka_2.12-2.6.0\libs\commons-lang3-3.8.1.jar;C:\kafka_2.12-2.6.0\libs\connect-api-2.6.0.jar;C:\kafka_2.12-2.6.0\libs\connect-basic-auth-extension-2.6.0.jar;C:\kafka_2.12-2.6.0\libs\connect-file-2.6.0.jar;C:\kafka_2.12-2.6.0\libs\connect-json-2.6.0.jar;C:\kafka_2.12-2.6.0\libs\connect-mirror-2.6.0.jar;C:\kafka_2.12-2.6.0\libs\connect-mirror-client-2.6.0.jar;C:\kafka_2.12-2.6.0\libs\connect-runtime-2.6.0.jar;C:\kafka_2.12-2.6.0\libs\connect-transforms-2.6.0.jar;C:\kafka_2.12-2.6.0\libs\hk2-api-2.5.0.jar;C:\kafka_2.12-2.6.0\libs\hk2-locator-2.5.0.jar;C:\kafka_2.12-2.6.0\libs\hk2-utils-2.5.0.jar;C:\kafka_2.12-2.6.0\libs\jackson-annotations-2.10.2.jar;C:\kafka_2.12-2.6.0\libs\jackson-core-2.10.2.jar;C:\kafka_2.12-2.6.0\libs\jackson-databind-2.10.2.jar;C:\kafka_2.12-2.6.0\libs\jackson-dataformat-csv-2.10.2.jar;C:\kafka_2.12-2.6.0\libs\jackson-datatype-jdk8-2.10.2.jar;C:\kafka_2.12-2.6.0\libs\jackson-jaxrs-base-2.10.2.jar;C:\kafka_2.12-2.6.0\libs\jackson-jaxrs-json-provider-2.10.2.jar;C:\kafka_2.12-2.6.0\libs\jackson-module-jaxb-annotations-2.10.2.jar;C:\kafka_2.12-2.6.0\libs\jackson-module-paranamer-2.10.2.jar;C:\kafka_2.12-2.6.0\libs\jackson-module-scala_2.12-2.10.2.jar;C:\kafka_2.12-2.6.0\libs\jakarta.activation-api-1.2.1.jar;C:\kafka_2.12-2.6.0\libs\jakarta.annotation-api-1.3.4.jar;C:\kafka_2.12-2.6.0\libs\jakarta.inject-2.5.0.jar;C:\kafka_2.12-2.6.0\libs\jakarta.ws.rs-api-2.1.5.jar;C:\kafka_2.12-2.6.0\libs\jakarta.xml.bind-api-2.3.2.jar;C:\kafka_2.12-2.6.0\libs\javassist-3.22.0-CR2.jar;C:\kafka_2.12-2.6.0\libs\javassist-3.26.0-GA.jar;C:\kafka_2.12-2.6.0\libs\javax.servlet-api-3.1.0.jar;C:\kafka_2.12-2.6.0\libs\javax.ws.rs-api-2.1.1.jar;C:\kafka_2.12-2.6.0\libs\jaxb-api-2.3.0.jar;C:\kafka_2.12-2.6.0\libs\jersey-client-2.28.jar;C:\kafka_2.12-2.6.0\libs\jersey-common-2.28.jar;C:\kafka_2.12-2.6.0\libs\jersey-container-servlet-2.28.jar;C:\kafka_2.12-2.6.0\libs\jersey-container-servlet-core-2.28.jar;C:\kafka_2.12-2.6.0\libs\jersey-hk2-2.28.jar;C:\kafka_2.12-2.6.0\libs\jersey-media-jaxb-2.28.jar;C:\kafka_2.12-2.6.0\libs\jersey-server-2.28.jar;C:\kafka_2.12-2.6.0\libs\jetty-client-9.4.24.v20191120.jar;C:\kafka_2.12-2.6.0\libs\jetty-continuation-9.4.24.v20191120.jar;C:\kafka_2.12-2.6.0\libs\jetty-http-9.4.24.v20191120.jar;C:\kafka_2.12-2.6.0\libs\jetty-io-9.4.24.v20191120.jar;C:\kafka_2.12-2.6.0\libs\jetty-security-9.4.24.v20191120.jar;C:\kafka_2.12-2.6.0\libs\jetty-server-9.4.24.v20191120.jar;C:\kafka_2.12-2.6.0\libs\jetty-servlet-9.4.24.v20191120.jar;C:\kafka_2.12-2.6.0\libs\jetty-servlets-9.4.24.v20191120.jar;C:\kafka_2.12-2.6.0\libs\jetty-util-9.4.24.v20191120.jar;C:\kafka_2.12-2.6.0\libs\jopt-simple-5.0.4.jar;C:\kafka_2.12-2.6.0\libs\kafka-clients-2.6.0.jar;C:\kafka_2.12-2.6.0\libs\kafka-log4j-appender-2.6.0.jar;C:\kafka_2.12-2.6.0\libs\kafka-streams-2.6.0.jar;C:\kafka_2.12-2.6.0\libs\kafka-streams-examples-2.6.0.jar;C:\kafka_2.12-2.6.0\libs\kafka-streams-scala_2.12-2.6.0.jar;C:\kafka_2.12-2.6.0\libs\kafka-streams-test-utils-2.6.0.jar;C:\kafka_2.12-2.6.0\libs\kafka-tools-2.6.0.jar;C:\kafka_2.12-2.6.0\libs\kafka_2.12-2.6.0-javadoc.jar;C:\kafka_2.12-2.6.0\libs\kafka_2.12-2.6.0-javadoc.jar.asc;C:\kafka_2.12-2.6.0\libs\kafka_2.12-2.6.0-scaladoc.jar;C:\kafka_2.12-2.6.0\libs\kafka_2.12-2.6.0-scaladoc.jar.asc;C:\kafka_2.12-2.6.0\libs\kafka_2.12-2.6.0-sources.jar;C:\kafka_2.12-2.6.0\libs\kafka_2.12-2.6.0-sources.jar.asc;C:\kafka_2.12-2.6.0\libs\kafka_2.12-2.6.0-test-sources.jar;C:\kafka_2.12-2.6.0\libs\kafka_2.12-2.6.0-test-sources.jar.asc;C:\kafka_2.12-2.6.0\libs\kafka_2.12-2.6.0-test.jar;C:\kafka_2.12-2.6.0\libs\kafka_2.12-2.6.0-test.jar.asc;C:\kafka_2.12-2.6.0\libs\kafka_2.12-2.6.0.jar;C:\kafka_2.12-2.6.0\libs\kafka_2.12-2.6.0.jar.asc;C:\kafka_2.12-2.6.0\libs\log4j-1.2.17.jar;C:\kafka_2.12-2.6.0\libs\lz4-java-1.7.1.jar;C:\kafka_2.12-2.6.0\libs\maven-artifact-3.6.3.jar;C:\kafka_2.12-2.6.0\libs\metrics-core-2.2.0.jar;C:\kafka_2.12-2.6.0\libs\netty-buffer-4.1.50.Final.jar;C:\kafka_2.12-2.6.0\libs\netty-codec-4.1.50.Final.jar;C:\kafka_2.12-2.6.0\libs\netty-common-4.1.50.Final.jar;C:\kafka_2.12-2.6.0\libs\netty-handler-4.1.50.Final.jar;C:\kafka_2.12-2.6.0\libs\netty-resolver-4.1.50.Final.jar;C:\kafka_2.12-2.6.0\libs\netty-transport-4.1.50.Final.jar;C:\kafka_2.12-2.6.0\libs\netty-transport-native-epoll-4.1.50.Final.jar;C:\kafka_2.12-2.6.0\libs\netty-transport-native-unix-common-4.1.50.Final.jar;C:\kafka_2.12-2.6.0\libs\osgi-resource-locator-1.0.1.jar;C:\kafka_2.12-2.6.0\libs\paranamer-2.8.jar;C:\kafka_2.12-2.6.0\libs\plexus-utils-3.2.1.jar;C:\kafka_2.12-2.6.0\libs\reflections-0.9.12.jar;C:\kafka_2.12-2.6.0\libs\rocksdbjni-5.18.4.jar;C:\kafka_2.12-2.6.0\libs\scala-collection-compat_2.12-2.1.6.jar;C:\kafka_2.12-2.6.0\libs\scala-java8-compat_2.12-0.9.1.jar;C:\kafka_2.12-2.6.0\libs\scala-library-2.12.11.jar;C:\kafka_2.12-2.6.0\libs\scala-logging_2.12-3.9.2.jar;C:\kafka_2.12-2.6.0\libs\scala-reflect-2.12.11.jar;C:\kafka_2.12-2.6.0\libs\slf4j-api-1.7.30.jar;C:\kafka_2.12-2.6.0\libs\slf4j-log4j12-1.7.30.jar;C:\kafka_2.12-2.6.0\libs\snappy-java-1.1.7.3.jar;C:\kafka_2.12-2.6.0\libs\validation-api-2.0.1.Final.jar;C:\kafka_2.12-2.6.0\libs\zookeeper-3.5.8.jar;C:\kafka_2.12-2.6.0\libs\zookeeper-jute-3.5.8.jar;C:\kafka_2.12-2.6.0\libs\zstd-jni-1.4.4-7.jar (org.apache.zookeeper.ZooKeeper)
[2020-08-21 02:20:34,894] INFO Client environment:java.library.path=C:\Program Files\Java\jdk1.8.0_241\bin;C:\Windows\Sun\Java\bin;C:\Windows\system32;C:\Windows;C:\Program Files (x86)\Common Files\Oracle\Java\javapath;C:\app\oraclehomeuser1\product\12.2.0\dbhome_1\bin;C:\Program Files (x86)\Intel\iCLS Client\;C:\Program Files\Intel\iCLS Client\;C:\Windows\system32;C:\Windows;C:\Windows\System32\Wbem;C:\Windows\System32\WindowsPowerShell\v1.0\;C:\Windows\System32\OpenSSH\;C:\Program Files\Intel\WiFi\bin\;C:\Program Files\Common Files\Intel\WirelessCommon\;C:\Program Files (x86)\Intel\Intel(R) Management Engine Components\DAL;C:\Program Files\Intel\Intel(R) Management Engine Components\DAL;C:\Program Files (x86)\Intel\Intel(R) Management Engine Components\IPT;C:\Program Files\Intel\Intel(R) Management Engine Components\IPT;C:\Program Files\Microsoft SQL Server\Client SDK\ODBC\130\Tools\Binn\;C:\Program Files (x86)\Microsoft SQL Server\130\Tools\Binn\;C:\Program Files\Microsoft SQL Server\130\Tools\Binn\;C:\Program Files\Microsoft SQL Server\130\DTS\Binn\;C:\Program Files (x86)\Microsoft SQL Server\150\DTS\Binn\;C:\Program Files\PuTTY\;C:\Program Files\Java\jdk1.8.0_241\bin;E:\apache-maven-3.5.0\bin;C:\Program Files\MySQL\MySQL Server 8.0\bin;C:\Program Files\Git\cmd;C:\Program Files\nodejs\;C:\Program Files (x86)\Yarn\bin\;C:\Program Files\MongoDB\Server\4.2\bin;C:\Program Files\Docker\Docker\resources\bin;C:\ProgramData\DockerDesktop\version-bin;C:\apache-zookeeper-3.6.1-bin\bin;C:\Program Files\MySQL\MySQL Shell 8.0\bin\;C:\Users\Jaca\AppData\Local\Programs\Python\Python38-32\Scripts\;C:\Users\Jaca\AppData\Local\Programs\Python\Python38-32\;C:\Users\Jaca\AppData\Local\Microsoft\WindowsApps;C:\Users\Jaca\AppData\Roaming\npm;C:\Users\Jaca\AppData\Local\Yarn\bin;C:\Users\Jaca\AppData\Local\atom\bin;C:\Users\Jaca\AppData\Local\Programs\Microsoft VS Code\bin;C:\Users\Jaca\AppData\Local\GitHubDesktop\bin;. (org.apache.zookeeper.ZooKeeper)
[2020-08-21 02:20:34,896] INFO Client environment:java.io.tmpdir=C:\Users\Jaca\AppData\Local\Temp\ (org.apache.zookeeper.ZooKeeper)
[2020-08-21 02:20:34,905] INFO Client environment:java.compiler=<NA> (org.apache.zookeeper.ZooKeeper)
[2020-08-21 02:20:34,906] INFO Client environment:os.name=Windows 10 (org.apache.zookeeper.ZooKeeper)
[2020-08-21 02:20:34,906] INFO Client environment:os.arch=amd64 (org.apache.zookeeper.ZooKeeper)
[2020-08-21 02:20:34,907] INFO Client environment:os.version=10.0 (org.apache.zookeeper.ZooKeeper)
[2020-08-21 02:20:34,907] INFO Client environment:user.name=Jaca (org.apache.zookeeper.ZooKeeper)
[2020-08-21 02:20:34,907] INFO Client environment:user.home=C:\Users\Jaca (org.apache.zookeeper.ZooKeeper)
[2020-08-21 02:20:34,908] INFO Client environment:user.dir=C:\kafka_2.12-2.6.0 (org.apache.zookeeper.ZooKeeper)
[2020-08-21 02:20:34,908] INFO Client environment:os.memory.free=976MB (org.apache.zookeeper.ZooKeeper)
[2020-08-21 02:20:34,909] INFO Client environment:os.memory.max=1024MB (org.apache.zookeeper.ZooKeeper)
[2020-08-21 02:20:34,909] INFO Client environment:os.memory.total=1024MB (org.apache.zookeeper.ZooKeeper)
[2020-08-21 02:20:34,919] INFO Initiating client connection, connectString=localhost:2181 sessionTimeout=18000 watcher=kafka.zookeeper.ZooKeeperClient$ZooKeeperClientWatcher$@402bba4f (org.apache.zookeeper.ZooKeeper)
[2020-08-21 02:20:34,963] INFO jute.maxbuffer value is 4194304 Bytes (org.apache.zookeeper.ClientCnxnSocket)
[2020-08-21 02:20:34,995] INFO zookeeper.request.timeout value is 0. feature enabled= (org.apache.zookeeper.ClientCnxn)
[2020-08-21 02:20:35,005] INFO [ZooKeeperClient Kafka server] Waiting until connected. (kafka.zookeeper.ZooKeeperClient)
[2020-08-21 02:20:35,013] INFO Opening socket connection to server localhost/127.0.0.1:2181. Will not attempt to authenticate using SASL (unknown error) (org.apache.zookeeper.ClientCnxn)
[2020-08-21 02:20:35,025] INFO Socket connection established, initiating session, client: /127.0.0.1:60139, server: localhost/127.0.0.1:2181 (org.apache.zookeeper.ClientCnxn)
[2020-08-21 02:20:35,060] INFO Session establishment complete on server localhost/127.0.0.1:2181, sessionid = 0x10001da97790000, negotiated timeout = 18000 (org.apache.zookeeper.ClientCnxn)
[2020-08-21 02:20:35,087] INFO [ZooKeeperClient Kafka server] Connected. (kafka.zookeeper.ZooKeeperClient)
[2020-08-21 02:20:35,414] INFO Cluster ID = fOnF617hQkGInfSSa6vY6g (kafka.server.KafkaServer)
[2020-08-21 02:20:35,494] INFO KafkaConfig values:
        advertised.host.name = null
        advertised.listeners = null
        advertised.port = null
        alter.config.policy.class.name = null
        alter.log.dirs.replication.quota.window.num = 11
        alter.log.dirs.replication.quota.window.size.seconds = 1
        authorizer.class.name =
        auto.create.topics.enable = true
        auto.leader.rebalance.enable = true
        background.threads = 10
        broker.id = 0
        broker.id.generation.enable = true
        broker.rack = null
        client.quota.callback.class = null
        compression.type = producer
        connection.failed.authentication.delay.ms = 100
        connections.max.idle.ms = 600000
        connections.max.reauth.ms = 0
        control.plane.listener.name = null
        controlled.shutdown.enable = true
        controlled.shutdown.max.retries = 3
        controlled.shutdown.retry.backoff.ms = 5000
        controller.socket.timeout.ms = 30000
        create.topic.policy.class.name = null
        default.replication.factor = 1
        delegation.token.expiry.check.interval.ms = 3600000
        delegation.token.expiry.time.ms = 86400000
        delegation.token.master.key = null
        delegation.token.max.lifetime.ms = 604800000
        delete.records.purgatory.purge.interval.requests = 1
        delete.topic.enable = true
        fetch.max.bytes = 57671680
        fetch.purgatory.purge.interval.requests = 1000
        group.initial.rebalance.delay.ms = 0
        group.max.session.timeout.ms = 1800000
        group.max.size = 2147483647
        group.min.session.timeout.ms = 6000
        host.name =
        inter.broker.listener.name = null
        inter.broker.protocol.version = 2.6-IV0
        kafka.metrics.polling.interval.secs = 10
        kafka.metrics.reporters = []
        leader.imbalance.check.interval.seconds = 300
        leader.imbalance.per.broker.percentage = 10
        listener.security.protocol.map = PLAINTEXT:PLAINTEXT,SSL:SSL,SASL_PLAINTEXT:SASL_PLAINTEXT,SASL_SSL:SASL_SSL
        listeners = PLAINTEXT://:9092
        log.cleaner.backoff.ms = 15000
        log.cleaner.dedupe.buffer.size = 134217728
        log.cleaner.delete.retention.ms = 86400000
        log.cleaner.enable = true
        log.cleaner.io.buffer.load.factor = 0.9
        log.cleaner.io.buffer.size = 524288
        log.cleaner.io.max.bytes.per.second = 1.7976931348623157E308
        log.cleaner.max.compaction.lag.ms = 9223372036854775807
        log.cleaner.min.cleanable.ratio = 0.5
        log.cleaner.min.compaction.lag.ms = 0
        log.cleaner.threads = 1
        log.cleanup.policy = [delete]
        log.dir = /tmp/kafka-logs
        log.dirs = C:/kafka_2.12-2.6.0/kafka-test-logs
        log.flush.interval.messages = 9223372036854775807
        log.flush.interval.ms = null
        log.flush.offset.checkpoint.interval.ms = 60000
        log.flush.scheduler.interval.ms = 9223372036854775807
        log.flush.start.offset.checkpoint.interval.ms = 60000
        log.index.interval.bytes = 4096
        log.index.size.max.bytes = 10485760
        log.message.downconversion.enable = true
        log.message.format.version = 2.6-IV0
        log.message.timestamp.difference.max.ms = 9223372036854775807
        log.message.timestamp.type = CreateTime
        log.preallocate = false
        log.retention.bytes = -1
        log.retention.check.interval.ms = 300000
        log.retention.hours = 168
        log.retention.minutes = null
        log.retention.ms = null
        log.roll.hours = 168
        log.roll.jitter.hours = 0
        log.roll.jitter.ms = null
        log.roll.ms = null
        log.segment.bytes = 1073741824
        log.segment.delete.delay.ms = 60000
        max.connections = 2147483647
        max.connections.per.ip = 2147483647
        max.connections.per.ip.overrides =
        max.incremental.fetch.session.cache.slots = 1000
        message.max.bytes = 1048588
        metric.reporters = []
        metrics.num.samples = 2
        metrics.recording.level = INFO
        metrics.sample.window.ms = 30000
        min.insync.replicas = 1
        num.io.threads = 8
        num.network.threads = 3
        num.partitions = 1
        num.recovery.threads.per.data.dir = 1
        num.replica.alter.log.dirs.threads = null
        num.replica.fetchers = 1
        offset.metadata.max.bytes = 4096
        offsets.commit.required.acks = -1
        offsets.commit.timeout.ms = 5000
        offsets.load.buffer.size = 5242880
        offsets.retention.check.interval.ms = 600000
        offsets.retention.minutes = 10080
        offsets.topic.compression.codec = 0
        offsets.topic.num.partitions = 50
        offsets.topic.replication.factor = 1
        offsets.topic.segment.bytes = 104857600
        password.encoder.cipher.algorithm = AES/CBC/PKCS5Padding
        password.encoder.iterations = 4096
        password.encoder.key.length = 128
        password.encoder.keyfactory.algorithm = null
        password.encoder.old.secret = null
        password.encoder.secret = null
        port = 9092
        principal.builder.class = null
        producer.purgatory.purge.interval.requests = 1000
        queued.max.request.bytes = -1
        queued.max.requests = 500
        quota.consumer.default = 9223372036854775807
        quota.producer.default = 9223372036854775807
        quota.window.num = 11
        quota.window.size.seconds = 1
        replica.fetch.backoff.ms = 1000
        replica.fetch.max.bytes = 1048576
        replica.fetch.min.bytes = 1
        replica.fetch.response.max.bytes = 10485760
        replica.fetch.wait.max.ms = 500
        replica.high.watermark.checkpoint.interval.ms = 5000
        replica.lag.time.max.ms = 30000
        replica.selector.class = null
        replica.socket.receive.buffer.bytes = 65536
        replica.socket.timeout.ms = 30000
        replication.quota.window.num = 11
        replication.quota.window.size.seconds = 1
        request.timeout.ms = 30000
        reserved.broker.max.id = 1000
        sasl.client.callback.handler.class = null
        sasl.enabled.mechanisms = [GSSAPI]
        sasl.jaas.config = null
        sasl.kerberos.kinit.cmd = /usr/bin/kinit
        sasl.kerberos.min.time.before.relogin = 60000
        sasl.kerberos.principal.to.local.rules = [DEFAULT]
        sasl.kerberos.service.name = null
        sasl.kerberos.ticket.renew.jitter = 0.05
        sasl.kerberos.ticket.renew.window.factor = 0.8
        sasl.login.callback.handler.class = null
        sasl.login.class = null
        sasl.login.refresh.buffer.seconds = 300
        sasl.login.refresh.min.period.seconds = 60
        sasl.login.refresh.window.factor = 0.8
        sasl.login.refresh.window.jitter = 0.05
        sasl.mechanism.inter.broker.protocol = GSSAPI
        sasl.server.callback.handler.class = null
        security.inter.broker.protocol = PLAINTEXT
        security.providers = null
        socket.receive.buffer.bytes = 102400
        socket.request.max.bytes = 104857600
        socket.send.buffer.bytes = 102400
        ssl.cipher.suites = []
        ssl.client.auth = none
        ssl.enabled.protocols = [TLSv1.2]
        ssl.endpoint.identification.algorithm = https
        ssl.engine.factory.class = null
        ssl.key.password = null
        ssl.keymanager.algorithm = SunX509
        ssl.keystore.location = null
        ssl.keystore.password = null
        ssl.keystore.type = JKS
        ssl.principal.mapping.rules = DEFAULT
        ssl.protocol = TLSv1.2
        ssl.provider = null
        ssl.secure.random.implementation = null
        ssl.trustmanager.algorithm = PKIX
        ssl.truststore.location = null
        ssl.truststore.password = null
        ssl.truststore.type = JKS
        transaction.abort.timed.out.transaction.cleanup.interval.ms = 10000
        transaction.max.timeout.ms = 900000
        transaction.remove.expired.transaction.cleanup.interval.ms = 3600000
        transaction.state.log.load.buffer.size = 5242880
        transaction.state.log.min.isr = 1
        transaction.state.log.num.partitions = 50
        transaction.state.log.replication.factor = 1
        transaction.state.log.segment.bytes = 104857600
        transactional.id.expiration.ms = 604800000
        unclean.leader.election.enable = false
        zookeeper.clientCnxnSocket = null
        zookeeper.connect = localhost:2181
        zookeeper.connection.timeout.ms = 18000
        zookeeper.max.in.flight.requests = 10
        zookeeper.session.timeout.ms = 18000
        zookeeper.set.acl = false
        zookeeper.ssl.cipher.suites = null
        zookeeper.ssl.client.enable = false
        zookeeper.ssl.crl.enable = false
        zookeeper.ssl.enabled.protocols = null
        zookeeper.ssl.endpoint.identification.algorithm = HTTPS
        zookeeper.ssl.keystore.location = null
        zookeeper.ssl.keystore.password = null
        zookeeper.ssl.keystore.type = null
        zookeeper.ssl.ocsp.enable = false
        zookeeper.ssl.protocol = TLSv1.2
        zookeeper.ssl.truststore.location = null
        zookeeper.ssl.truststore.password = null
        zookeeper.ssl.truststore.type = null
        zookeeper.sync.time.ms = 2000
 (kafka.server.KafkaConfig)
[2020-08-21 02:20:35,524] INFO KafkaConfig values:
        advertised.host.name = null
        advertised.listeners = null
        advertised.port = null
        alter.config.policy.class.name = null
        alter.log.dirs.replication.quota.window.num = 11
        alter.log.dirs.replication.quota.window.size.seconds = 1
        authorizer.class.name =
        auto.create.topics.enable = true
        auto.leader.rebalance.enable = true
        background.threads = 10
        broker.id = 0
        broker.id.generation.enable = true
        broker.rack = null
        client.quota.callback.class = null
        compression.type = producer
        connection.failed.authentication.delay.ms = 100
        connections.max.idle.ms = 600000
        connections.max.reauth.ms = 0
        control.plane.listener.name = null
        controlled.shutdown.enable = true
        controlled.shutdown.max.retries = 3
        controlled.shutdown.retry.backoff.ms = 5000
        controller.socket.timeout.ms = 30000
        create.topic.policy.class.name = null
        default.replication.factor = 1
        delegation.token.expiry.check.interval.ms = 3600000
        delegation.token.expiry.time.ms = 86400000
        delegation.token.master.key = null
        delegation.token.max.lifetime.ms = 604800000
        delete.records.purgatory.purge.interval.requests = 1
        delete.topic.enable = true
        fetch.max.bytes = 57671680
        fetch.purgatory.purge.interval.requests = 1000
        group.initial.rebalance.delay.ms = 0
        group.max.session.timeout.ms = 1800000
        group.max.size = 2147483647
        group.min.session.timeout.ms = 6000
        host.name =
        inter.broker.listener.name = null
        inter.broker.protocol.version = 2.6-IV0
        kafka.metrics.polling.interval.secs = 10
        kafka.metrics.reporters = []
        leader.imbalance.check.interval.seconds = 300
        leader.imbalance.per.broker.percentage = 10
        listener.security.protocol.map = PLAINTEXT:PLAINTEXT,SSL:SSL,SASL_PLAINTEXT:SASL_PLAINTEXT,SASL_SSL:SASL_SSL
        listeners = PLAINTEXT://:9092
        log.cleaner.backoff.ms = 15000
        log.cleaner.dedupe.buffer.size = 134217728
        log.cleaner.delete.retention.ms = 86400000
        log.cleaner.enable = true
        log.cleaner.io.buffer.load.factor = 0.9
        log.cleaner.io.buffer.size = 524288
        log.cleaner.io.max.bytes.per.second = 1.7976931348623157E308
        log.cleaner.max.compaction.lag.ms = 9223372036854775807
        log.cleaner.min.cleanable.ratio = 0.5
        log.cleaner.min.compaction.lag.ms = 0
        log.cleaner.threads = 1
        log.cleanup.policy = [delete]
        log.dir = /tmp/kafka-logs
        log.dirs = C:/kafka_2.12-2.6.0/kafka-test-logs
        log.flush.interval.messages = 9223372036854775807
        log.flush.interval.ms = null
        log.flush.offset.checkpoint.interval.ms = 60000
        log.flush.scheduler.interval.ms = 9223372036854775807
        log.flush.start.offset.checkpoint.interval.ms = 60000
        log.index.interval.bytes = 4096
        log.index.size.max.bytes = 10485760
        log.message.downconversion.enable = true
        log.message.format.version = 2.6-IV0
        log.message.timestamp.difference.max.ms = 9223372036854775807
        log.message.timestamp.type = CreateTime
        log.preallocate = false
        log.retention.bytes = -1
        log.retention.check.interval.ms = 300000
        log.retention.hours = 168
        log.retention.minutes = null
        log.retention.ms = null
        log.roll.hours = 168
        log.roll.jitter.hours = 0
        log.roll.jitter.ms = null
        log.roll.ms = null
        log.segment.bytes = 1073741824
        log.segment.delete.delay.ms = 60000
        max.connections = 2147483647
        max.connections.per.ip = 2147483647
        max.connections.per.ip.overrides =
        max.incremental.fetch.session.cache.slots = 1000
        message.max.bytes = 1048588
        metric.reporters = []
        metrics.num.samples = 2
        metrics.recording.level = INFO
        metrics.sample.window.ms = 30000
        min.insync.replicas = 1
        num.io.threads = 8
        num.network.threads = 3
        num.partitions = 1
        num.recovery.threads.per.data.dir = 1
        num.replica.alter.log.dirs.threads = null
        num.replica.fetchers = 1
        offset.metadata.max.bytes = 4096
        offsets.commit.required.acks = -1
        offsets.commit.timeout.ms = 5000
        offsets.load.buffer.size = 5242880
        offsets.retention.check.interval.ms = 600000
        offsets.retention.minutes = 10080
        offsets.topic.compression.codec = 0
        offsets.topic.num.partitions = 50
        offsets.topic.replication.factor = 1
        offsets.topic.segment.bytes = 104857600
        password.encoder.cipher.algorithm = AES/CBC/PKCS5Padding
        password.encoder.iterations = 4096
        password.encoder.key.length = 128
        password.encoder.keyfactory.algorithm = null
        password.encoder.old.secret = null
        password.encoder.secret = null
        port = 9092
        principal.builder.class = null
        producer.purgatory.purge.interval.requests = 1000
        queued.max.request.bytes = -1
        queued.max.requests = 500
        quota.consumer.default = 9223372036854775807
        quota.producer.default = 9223372036854775807
        quota.window.num = 11
        quota.window.size.seconds = 1
        replica.fetch.backoff.ms = 1000
        replica.fetch.max.bytes = 1048576
        replica.fetch.min.bytes = 1
        replica.fetch.response.max.bytes = 10485760
        replica.fetch.wait.max.ms = 500
        replica.high.watermark.checkpoint.interval.ms = 5000
        replica.lag.time.max.ms = 30000
        replica.selector.class = null
        replica.socket.receive.buffer.bytes = 65536
        replica.socket.timeout.ms = 30000
        replication.quota.window.num = 11
        replication.quota.window.size.seconds = 1
        request.timeout.ms = 30000
        reserved.broker.max.id = 1000
        sasl.client.callback.handler.class = null
        sasl.enabled.mechanisms = [GSSAPI]
        sasl.jaas.config = null
        sasl.kerberos.kinit.cmd = /usr/bin/kinit
        sasl.kerberos.min.time.before.relogin = 60000
        sasl.kerberos.principal.to.local.rules = [DEFAULT]
        sasl.kerberos.service.name = null
        sasl.kerberos.ticket.renew.jitter = 0.05
        sasl.kerberos.ticket.renew.window.factor = 0.8
        sasl.login.callback.handler.class = null
        sasl.login.class = null
        sasl.login.refresh.buffer.seconds = 300
        sasl.login.refresh.min.period.seconds = 60
        sasl.login.refresh.window.factor = 0.8
        sasl.login.refresh.window.jitter = 0.05
        sasl.mechanism.inter.broker.protocol = GSSAPI
        sasl.server.callback.handler.class = null
        security.inter.broker.protocol = PLAINTEXT
        security.providers = null
        socket.receive.buffer.bytes = 102400
        socket.request.max.bytes = 104857600
        socket.send.buffer.bytes = 102400
        ssl.cipher.suites = []
        ssl.client.auth = none
        ssl.enabled.protocols = [TLSv1.2]
        ssl.endpoint.identification.algorithm = https
        ssl.engine.factory.class = null
        ssl.key.password = null
        ssl.keymanager.algorithm = SunX509
        ssl.keystore.location = null
        ssl.keystore.password = null
        ssl.keystore.type = JKS
        ssl.principal.mapping.rules = DEFAULT
        ssl.protocol = TLSv1.2
        ssl.provider = null
        ssl.secure.random.implementation = null
        ssl.trustmanager.algorithm = PKIX
        ssl.truststore.location = null
        ssl.truststore.password = null
        ssl.truststore.type = JKS
        transaction.abort.timed.out.transaction.cleanup.interval.ms = 10000
        transaction.max.timeout.ms = 900000
        transaction.remove.expired.transaction.cleanup.interval.ms = 3600000
        transaction.state.log.load.buffer.size = 5242880
        transaction.state.log.min.isr = 1
        transaction.state.log.num.partitions = 50
        transaction.state.log.replication.factor = 1
        transaction.state.log.segment.bytes = 104857600
        transactional.id.expiration.ms = 604800000
        unclean.leader.election.enable = false
        zookeeper.clientCnxnSocket = null
        zookeeper.connect = localhost:2181
        zookeeper.connection.timeout.ms = 18000
        zookeeper.max.in.flight.requests = 10
        zookeeper.session.timeout.ms = 18000
        zookeeper.set.acl = false
        zookeeper.ssl.cipher.suites = null
        zookeeper.ssl.client.enable = false
        zookeeper.ssl.crl.enable = false
        zookeeper.ssl.enabled.protocols = null
        zookeeper.ssl.endpoint.identification.algorithm = HTTPS
        zookeeper.ssl.keystore.location = null
        zookeeper.ssl.keystore.password = null
        zookeeper.ssl.keystore.type = null
        zookeeper.ssl.ocsp.enable = false
        zookeeper.ssl.protocol = TLSv1.2
        zookeeper.ssl.truststore.location = null
        zookeeper.ssl.truststore.password = null
        zookeeper.ssl.truststore.type = null
        zookeeper.sync.time.ms = 2000
 (kafka.server.KafkaConfig)
[2020-08-21 02:20:35,586] INFO [ThrottledChannelReaper-Request]: Starting (kafka.server.ClientQuotaManager$ThrottledChannelReaper)
[2020-08-21 02:20:35,586] INFO [ThrottledChannelReaper-Fetch]: Starting (kafka.server.ClientQuotaManager$ThrottledChannelReaper)
[2020-08-21 02:20:35,586] INFO [ThrottledChannelReaper-Produce]: Starting (kafka.server.ClientQuotaManager$ThrottledChannelReaper)
[2020-08-21 02:20:35,631] INFO Loading logs from log dirs ArrayBuffer(C:\kafka_2.12-2.6.0\kafka-test-logs) (kafka.log.LogManager)
[2020-08-21 02:20:35,654] INFO Skipping recovery for all logs in C:\kafka_2.12-2.6.0\kafka-test-logs since clean shutdown file was found (kafka.log.LogManager)
[2020-08-21 02:20:35,797] INFO [Log partition=reflectoring-1-0, dir=C:\kafka_2.12-2.6.0\kafka-test-logs] Loading producer state till offset 1 with message format version 2 (kafka.log.Log)
[2020-08-21 02:20:35,822] INFO [ProducerStateManager partition=reflectoring-1-0] Loading producer state from snapshot file 'C:\kafka_2.12-2.6.0\kafka-test-logs\reflectoring-1-0\00000000000000000001.snapshot' (kafka.log.ProducerStateManager)
[2020-08-21 02:20:35,843] INFO Completed load of Log(dir=C:\kafka_2.12-2.6.0\kafka-test-logs\reflectoring-1-0, topic=reflectoring-1, partition=0, highWatermark=0, lastStableOffset=0, logStartOffset=0, logEndOffset=1) with 1 segments in 143ms (1/56 loaded in C:\kafka_2.12-2.6.0\kafka-test-logs) (kafka.log.LogManager)
[2020-08-21 02:20:35,856] INFO [Log partition=reflectoring-2-0, dir=C:\kafka_2.12-2.6.0\kafka-test-logs] Loading producer state till offset 2 with message format version 2 (kafka.log.Log)
[2020-08-21 02:20:35,860] INFO [ProducerStateManager partition=reflectoring-2-0] Loading producer state from snapshot file 'C:\kafka_2.12-2.6.0\kafka-test-logs\reflectoring-2-0\00000000000000000002.snapshot' (kafka.log.ProducerStateManager)
[2020-08-21 02:20:35,863] INFO Completed load of Log(dir=C:\kafka_2.12-2.6.0\kafka-test-logs\reflectoring-2-0, topic=reflectoring-2, partition=0, highWatermark=0, lastStableOffset=0, logStartOffset=0, logEndOffset=2) with 1 segments in 18ms (2/56 loaded in C:\kafka_2.12-2.6.0\kafka-test-logs) (kafka.log.LogManager)
[2020-08-21 02:20:35,875] INFO [Log partition=reflectoring-3-0, dir=C:\kafka_2.12-2.6.0\kafka-test-logs] Loading producer state till offset 2 with message format version 2 (kafka.log.Log)
[2020-08-21 02:20:35,879] INFO [ProducerStateManager partition=reflectoring-3-0] Loading producer state from snapshot file 'C:\kafka_2.12-2.6.0\kafka-test-logs\reflectoring-3-0\00000000000000000002.snapshot' (kafka.log.ProducerStateManager)
[2020-08-21 02:20:35,882] INFO Completed load of Log(dir=C:\kafka_2.12-2.6.0\kafka-test-logs\reflectoring-3-0, topic=reflectoring-3, partition=0, highWatermark=0, lastStableOffset=0, logStartOffset=0, logEndOffset=2) with 1 segments in 18ms (3/56 loaded in C:\kafka_2.12-2.6.0\kafka-test-logs) (kafka.log.LogManager)
[2020-08-21 02:20:35,894] INFO [Log partition=reflectoring-bytes-0, dir=C:\kafka_2.12-2.6.0\kafka-test-logs] Loading producer state till offset 1 with message format version 2 (kafka.log.Log)
[2020-08-21 02:20:35,898] INFO [ProducerStateManager partition=reflectoring-bytes-0] Loading producer state from snapshot file 'C:\kafka_2.12-2.6.0\kafka-test-logs\reflectoring-bytes-0\00000000000000000001.snapshot' (kafka.log.ProducerStateManager)
[2020-08-21 02:20:35,901] INFO Completed load of Log(dir=C:\kafka_2.12-2.6.0\kafka-test-logs\reflectoring-bytes-0, topic=reflectoring-bytes, partition=0, highWatermark=0, lastStableOffset=0, logStartOffset=0, logEndOffset=1) with 1 segments in 19ms (4/56 loaded in C:\kafka_2.12-2.6.0\kafka-test-logs) (kafka.log.LogManager)
[2020-08-21 02:20:35,912] INFO [Log partition=reflectoring-others-0, dir=C:\kafka_2.12-2.6.0\kafka-test-logs] Loading producer state till offset 2 with message format version 2 (kafka.log.Log)
[2020-08-21 02:20:35,916] INFO [ProducerStateManager partition=reflectoring-others-0] Loading producer state from snapshot file 'C:\kafka_2.12-2.6.0\kafka-test-logs\reflectoring-others-0\00000000000000000002.snapshot' (kafka.log.ProducerStateManager)
[2020-08-21 02:20:35,920] INFO Completed load of Log(dir=C:\kafka_2.12-2.6.0\kafka-test-logs\reflectoring-others-0, topic=reflectoring-others, partition=0, highWatermark=0, lastStableOffset=0, logStartOffset=0, logEndOffset=2) with 1 segments in 18ms (5/56 loaded in C:\kafka_2.12-2.6.0\kafka-test-logs) (kafka.log.LogManager)
[2020-08-21 02:20:35,931] INFO [Log partition=reflectoring-user-0, dir=C:\kafka_2.12-2.6.0\kafka-test-logs] Loading producer state till offset 2 with message format version 2 (kafka.log.Log)
[2020-08-21 02:20:35,935] INFO [ProducerStateManager partition=reflectoring-user-0] Loading producer state from snapshot file 'C:\kafka_2.12-2.6.0\kafka-test-logs\reflectoring-user-0\00000000000000000002.snapshot' (kafka.log.ProducerStateManager)
[2020-08-21 02:20:35,938] INFO Completed load of Log(dir=C:\kafka_2.12-2.6.0\kafka-test-logs\reflectoring-user-0, topic=reflectoring-user, partition=0, highWatermark=0, lastStableOffset=0, logStartOffset=0, logEndOffset=2) with 1 segments in 18ms (6/56 loaded in C:\kafka_2.12-2.6.0\kafka-test-logs) (kafka.log.LogManager)
[2020-08-21 02:20:35,951] INFO [Log partition=__consumer_offsets-0, dir=C:\kafka_2.12-2.6.0\kafka-test-logs] Loading producer state till offset 0 with message format version 2 (kafka.log.Log)
[2020-08-21 02:20:35,958] INFO Completed load of Log(dir=C:\kafka_2.12-2.6.0\kafka-test-logs\__consumer_offsets-0, topic=__consumer_offsets, partition=0, highWatermark=0, lastStableOffset=0, logStartOffset=0, logEndOffset=0) with 1 segments in 19ms (7/56 loaded in C:\kafka_2.12-2.6.0\kafka-test-logs) (kafka.log.LogManager)
[2020-08-21 02:20:35,969] INFO [Log partition=__consumer_offsets-1, dir=C:\kafka_2.12-2.6.0\kafka-test-logs] Loading producer state till offset 0 with message format version 2 (kafka.log.Log)
[2020-08-21 02:20:35,973] INFO Completed load of Log(dir=C:\kafka_2.12-2.6.0\kafka-test-logs\__consumer_offsets-1, topic=__consumer_offsets, partition=1, highWatermark=0, lastStableOffset=0, logStartOffset=0, logEndOffset=0) with 1 segments in 15ms (8/56 loaded in C:\kafka_2.12-2.6.0\kafka-test-logs) (kafka.log.LogManager)
[2020-08-21 02:20:35,987] INFO [Log partition=__consumer_offsets-10, dir=C:\kafka_2.12-2.6.0\kafka-test-logs] Loading producer state till offset 0 with message format version 2 (kafka.log.Log)
[2020-08-21 02:20:35,990] INFO Completed load of Log(dir=C:\kafka_2.12-2.6.0\kafka-test-logs\__consumer_offsets-10, topic=__consumer_offsets, partition=10, highWatermark=0, lastStableOffset=0, logStartOffset=0, logEndOffset=0) with 1 segments in 15ms (9/56 loaded in C:\kafka_2.12-2.6.0\kafka-test-logs) (kafka.log.LogManager)
[2020-08-21 02:20:36,001] INFO [Log partition=__consumer_offsets-11, dir=C:\kafka_2.12-2.6.0\kafka-test-logs] Loading producer state till offset 0 with message format version 2 (kafka.log.Log)
[2020-08-21 02:20:36,007] INFO Completed load of Log(dir=C:\kafka_2.12-2.6.0\kafka-test-logs\__consumer_offsets-11, topic=__consumer_offsets, partition=11, highWatermark=0, lastStableOffset=0, logStartOffset=0, logEndOffset=0) with 1 segments in 16ms (10/56 loaded in C:\kafka_2.12-2.6.0\kafka-test-logs) (kafka.log.LogManager)
[2020-08-21 02:20:36,018] INFO [Log partition=__consumer_offsets-12, dir=C:\kafka_2.12-2.6.0\kafka-test-logs] Loading producer state till offset 2 with message format version 2 (kafka.log.Log)
[2020-08-21 02:20:36,023] INFO [ProducerStateManager partition=__consumer_offsets-12] Loading producer state from snapshot file 'C:\kafka_2.12-2.6.0\kafka-test-logs\__consumer_offsets-12\00000000000000000002.snapshot' (kafka.log.ProducerStateManager)
[2020-08-21 02:20:36,027] INFO Completed load of Log(dir=C:\kafka_2.12-2.6.0\kafka-test-logs\__consumer_offsets-12, topic=__consumer_offsets, partition=12, highWatermark=0, lastStableOffset=0, logStartOffset=0, logEndOffset=2) with 1 segments in 20ms (11/56 loaded in C:\kafka_2.12-2.6.0\kafka-test-logs) (kafka.log.LogManager)
[2020-08-21 02:20:36,042] INFO [Log partition=__consumer_offsets-13, dir=C:\kafka_2.12-2.6.0\kafka-test-logs] Loading producer state till offset 7 with message format version 2 (kafka.log.Log)
[2020-08-21 02:20:36,047] INFO [ProducerStateManager partition=__consumer_offsets-13] Loading producer state from snapshot file 'C:\kafka_2.12-2.6.0\kafka-test-logs\__consumer_offsets-13\00000000000000000007.snapshot' (kafka.log.ProducerStateManager)
[2020-08-21 02:20:36,051] INFO Completed load of Log(dir=C:\kafka_2.12-2.6.0\kafka-test-logs\__consumer_offsets-13, topic=__consumer_offsets, partition=13, highWatermark=0, lastStableOffset=0, logStartOffset=0, logEndOffset=7) with 1 segments in 24ms (12/56 loaded in C:\kafka_2.12-2.6.0\kafka-test-logs) (kafka.log.LogManager)
[2020-08-21 02:20:36,064] INFO [Log partition=__consumer_offsets-14, dir=C:\kafka_2.12-2.6.0\kafka-test-logs] Loading producer state till offset 0 with message format version 2 (kafka.log.Log)
[2020-08-21 02:20:36,070] INFO Completed load of Log(dir=C:\kafka_2.12-2.6.0\kafka-test-logs\__consumer_offsets-14, topic=__consumer_offsets, partition=14, highWatermark=0, lastStableOffset=0, logStartOffset=0, logEndOffset=0) with 1 segments in 19ms (13/56 loaded in C:\kafka_2.12-2.6.0\kafka-test-logs) (kafka.log.LogManager)
[2020-08-21 02:20:36,083] INFO [Log partition=__consumer_offsets-15, dir=C:\kafka_2.12-2.6.0\kafka-test-logs] Loading producer state till offset 0 with message format version 2 (kafka.log.Log)
[2020-08-21 02:20:36,088] INFO Completed load of Log(dir=C:\kafka_2.12-2.6.0\kafka-test-logs\__consumer_offsets-15, topic=__consumer_offsets, partition=15, highWatermark=0, lastStableOffset=0, logStartOffset=0, logEndOffset=0) with 1 segments in 18ms (14/56 loaded in C:\kafka_2.12-2.6.0\kafka-test-logs) (kafka.log.LogManager)
[2020-08-21 02:20:36,101] INFO [Log partition=__consumer_offsets-16, dir=C:\kafka_2.12-2.6.0\kafka-test-logs] Loading producer state till offset 0 with message format version 2 (kafka.log.Log)
[2020-08-21 02:20:36,106] INFO Completed load of Log(dir=C:\kafka_2.12-2.6.0\kafka-test-logs\__consumer_offsets-16, topic=__consumer_offsets, partition=16, highWatermark=0, lastStableOffset=0, logStartOffset=0, logEndOffset=0) with 1 segments in 18ms (15/56 loaded in C:\kafka_2.12-2.6.0\kafka-test-logs) (kafka.log.LogManager)
[2020-08-21 02:20:36,116] INFO [Log partition=__consumer_offsets-17, dir=C:\kafka_2.12-2.6.0\kafka-test-logs] Loading producer state till offset 0 with message format version 2 (kafka.log.Log)
[2020-08-21 02:20:36,119] INFO Completed load of Log(dir=C:\kafka_2.12-2.6.0\kafka-test-logs\__consumer_offsets-17, topic=__consumer_offsets, partition=17, highWatermark=0, lastStableOffset=0, logStartOffset=0, logEndOffset=0) with 1 segments in 13ms (16/56 loaded in C:\kafka_2.12-2.6.0\kafka-test-logs) (kafka.log.LogManager)
[2020-08-21 02:20:36,129] INFO [Log partition=__consumer_offsets-18, dir=C:\kafka_2.12-2.6.0\kafka-test-logs] Loading producer state till offset 0 with message format version 2 (kafka.log.Log)
[2020-08-21 02:20:36,132] INFO Completed load of Log(dir=C:\kafka_2.12-2.6.0\kafka-test-logs\__consumer_offsets-18, topic=__consumer_offsets, partition=18, highWatermark=0, lastStableOffset=0, logStartOffset=0, logEndOffset=0) with 1 segments in 12ms (17/56 loaded in C:\kafka_2.12-2.6.0\kafka-test-logs) (kafka.log.LogManager)
[2020-08-21 02:20:36,142] INFO [Log partition=__consumer_offsets-19, dir=C:\kafka_2.12-2.6.0\kafka-test-logs] Loading producer state till offset 0 with message format version 2 (kafka.log.Log)
[2020-08-21 02:20:36,146] INFO Completed load of Log(dir=C:\kafka_2.12-2.6.0\kafka-test-logs\__consumer_offsets-19, topic=__consumer_offsets, partition=19, highWatermark=0, lastStableOffset=0, logStartOffset=0, logEndOffset=0) with 1 segments in 13ms (18/56 loaded in C:\kafka_2.12-2.6.0\kafka-test-logs) (kafka.log.LogManager)
[2020-08-21 02:20:36,157] INFO [Log partition=__consumer_offsets-2, dir=C:\kafka_2.12-2.6.0\kafka-test-logs] Loading producer state till offset 0 with message format version 2 (kafka.log.Log)
[2020-08-21 02:20:36,160] INFO Completed load of Log(dir=C:\kafka_2.12-2.6.0\kafka-test-logs\__consumer_offsets-2, topic=__consumer_offsets, partition=2, highWatermark=0, lastStableOffset=0, logStartOffset=0, logEndOffset=0) with 1 segments in 13ms (19/56 loaded in C:\kafka_2.12-2.6.0\kafka-test-logs) (kafka.log.LogManager)
[2020-08-21 02:20:36,171] INFO [Log partition=__consumer_offsets-20, dir=C:\kafka_2.12-2.6.0\kafka-test-logs] Loading producer state till offset 0 with message format version 2 (kafka.log.Log)
[2020-08-21 02:20:36,174] INFO Completed load of Log(dir=C:\kafka_2.12-2.6.0\kafka-test-logs\__consumer_offsets-20, topic=__consumer_offsets, partition=20, highWatermark=0, lastStableOffset=0, logStartOffset=0, logEndOffset=0) with 1 segments in 13ms (20/56 loaded in C:\kafka_2.12-2.6.0\kafka-test-logs) (kafka.log.LogManager)
[2020-08-21 02:20:36,185] INFO [Log partition=__consumer_offsets-21, dir=C:\kafka_2.12-2.6.0\kafka-test-logs] Loading producer state till offset 0 with message format version 2 (kafka.log.Log)
[2020-08-21 02:20:36,188] INFO Completed load of Log(dir=C:\kafka_2.12-2.6.0\kafka-test-logs\__consumer_offsets-21, topic=__consumer_offsets, partition=21, highWatermark=0, lastStableOffset=0, logStartOffset=0, logEndOffset=0) with 1 segments in 13ms (21/56 loaded in C:\kafka_2.12-2.6.0\kafka-test-logs) (kafka.log.LogManager)
[2020-08-21 02:20:36,198] INFO [Log partition=__consumer_offsets-22, dir=C:\kafka_2.12-2.6.0\kafka-test-logs] Loading producer state till offset 0 with message format version 2 (kafka.log.Log)
[2020-08-21 02:20:36,201] INFO Completed load of Log(dir=C:\kafka_2.12-2.6.0\kafka-test-logs\__consumer_offsets-22, topic=__consumer_offsets, partition=22, highWatermark=0, lastStableOffset=0, logStartOffset=0, logEndOffset=0) with 1 segments in 13ms (22/56 loaded in C:\kafka_2.12-2.6.0\kafka-test-logs) (kafka.log.LogManager)
[2020-08-21 02:20:36,211] INFO [Log partition=__consumer_offsets-23, dir=C:\kafka_2.12-2.6.0\kafka-test-logs] Loading producer state till offset 0 with message format version 2 (kafka.log.Log)
[2020-08-21 02:20:36,215] INFO Completed load of Log(dir=C:\kafka_2.12-2.6.0\kafka-test-logs\__consumer_offsets-23, topic=__consumer_offsets, partition=23, highWatermark=0, lastStableOffset=0, logStartOffset=0, logEndOffset=0) with 1 segments in 14ms (23/56 loaded in C:\kafka_2.12-2.6.0\kafka-test-logs) (kafka.log.LogManager)
[2020-08-21 02:20:36,226] INFO [Log partition=__consumer_offsets-24, dir=C:\kafka_2.12-2.6.0\kafka-test-logs] Loading producer state till offset 0 with message format version 2 (kafka.log.Log)
[2020-08-21 02:20:36,230] INFO Completed load of Log(dir=C:\kafka_2.12-2.6.0\kafka-test-logs\__consumer_offsets-24, topic=__consumer_offsets, partition=24, highWatermark=0, lastStableOffset=0, logStartOffset=0, logEndOffset=0) with 1 segments in 14ms (24/56 loaded in C:\kafka_2.12-2.6.0\kafka-test-logs) (kafka.log.LogManager)
[2020-08-21 02:20:36,241] INFO [Log partition=__consumer_offsets-25, dir=C:\kafka_2.12-2.6.0\kafka-test-logs] Loading producer state till offset 4 with message format version 2 (kafka.log.Log)
[2020-08-21 02:20:36,244] INFO [ProducerStateManager partition=__consumer_offsets-25] Loading producer state from snapshot file 'C:\kafka_2.12-2.6.0\kafka-test-logs\__consumer_offsets-25\00000000000000000004.snapshot' (kafka.log.ProducerStateManager)
[2020-08-21 02:20:36,247] INFO Completed load of Log(dir=C:\kafka_2.12-2.6.0\kafka-test-logs\__consumer_offsets-25, topic=__consumer_offsets, partition=25, highWatermark=0, lastStableOffset=0, logStartOffset=0, logEndOffset=4) with 1 segments in 16ms (25/56 loaded in C:\kafka_2.12-2.6.0\kafka-test-logs) (kafka.log.LogManager)
[2020-08-21 02:20:36,259] INFO [Log partition=__consumer_offsets-26, dir=C:\kafka_2.12-2.6.0\kafka-test-logs] Loading producer state till offset 0 with message format version 2 (kafka.log.Log)
[2020-08-21 02:20:36,262] INFO Completed load of Log(dir=C:\kafka_2.12-2.6.0\kafka-test-logs\__consumer_offsets-26, topic=__consumer_offsets, partition=26, highWatermark=0, lastStableOffset=0, logStartOffset=0, logEndOffset=0) with 1 segments in 14ms (26/56 loaded in C:\kafka_2.12-2.6.0\kafka-test-logs) (kafka.log.LogManager)
[2020-08-21 02:20:36,271] INFO [Log partition=__consumer_offsets-27, dir=C:\kafka_2.12-2.6.0\kafka-test-logs] Loading producer state till offset 0 with message format version 2 (kafka.log.Log)
[2020-08-21 02:20:36,275] INFO Completed load of Log(dir=C:\kafka_2.12-2.6.0\kafka-test-logs\__consumer_offsets-27, topic=__consumer_offsets, partition=27, highWatermark=0, lastStableOffset=0, logStartOffset=0, logEndOffset=0) with 1 segments in 13ms (27/56 loaded in C:\kafka_2.12-2.6.0\kafka-test-logs) (kafka.log.LogManager)
[2020-08-21 02:20:36,288] INFO [Log partition=__consumer_offsets-28, dir=C:\kafka_2.12-2.6.0\kafka-test-logs] Loading producer state till offset 0 with message format version 2 (kafka.log.Log)
[2020-08-21 02:20:36,291] INFO Completed load of Log(dir=C:\kafka_2.12-2.6.0\kafka-test-logs\__consumer_offsets-28, topic=__consumer_offsets, partition=28, highWatermark=0, lastStableOffset=0, logStartOffset=0, logEndOffset=0) with 1 segments in 15ms (28/56 loaded in C:\kafka_2.12-2.6.0\kafka-test-logs) (kafka.log.LogManager)
[2020-08-21 02:20:36,301] INFO [Log partition=__consumer_offsets-29, dir=C:\kafka_2.12-2.6.0\kafka-test-logs] Loading producer state till offset 0 with message format version 2 (kafka.log.Log)
[2020-08-21 02:20:36,303] INFO Completed load of Log(dir=C:\kafka_2.12-2.6.0\kafka-test-logs\__consumer_offsets-29, topic=__consumer_offsets, partition=29, highWatermark=0, lastStableOffset=0, logStartOffset=0, logEndOffset=0) with 1 segments in 12ms (29/56 loaded in C:\kafka_2.12-2.6.0\kafka-test-logs) (kafka.log.LogManager)
[2020-08-21 02:20:36,313] INFO [Log partition=__consumer_offsets-3, dir=C:\kafka_2.12-2.6.0\kafka-test-logs] Loading producer state till offset 0 with message format version 2 (kafka.log.Log)
[2020-08-21 02:20:36,316] INFO Completed load of Log(dir=C:\kafka_2.12-2.6.0\kafka-test-logs\__consumer_offsets-3, topic=__consumer_offsets, partition=3, highWatermark=0, lastStableOffset=0, logStartOffset=0, logEndOffset=0) with 1 segments in 12ms (30/56 loaded in C:\kafka_2.12-2.6.0\kafka-test-logs) (kafka.log.LogManager)
[2020-08-21 02:20:36,326] INFO [Log partition=__consumer_offsets-30, dir=C:\kafka_2.12-2.6.0\kafka-test-logs] Loading producer state till offset 0 with message format version 2 (kafka.log.Log)
[2020-08-21 02:20:36,329] INFO Completed load of Log(dir=C:\kafka_2.12-2.6.0\kafka-test-logs\__consumer_offsets-30, topic=__consumer_offsets, partition=30, highWatermark=0, lastStableOffset=0, logStartOffset=0, logEndOffset=0) with 1 segments in 12ms (31/56 loaded in C:\kafka_2.12-2.6.0\kafka-test-logs) (kafka.log.LogManager)
[2020-08-21 02:20:36,340] INFO [Log partition=__consumer_offsets-31, dir=C:\kafka_2.12-2.6.0\kafka-test-logs] Loading producer state till offset 0 with message format version 2 (kafka.log.Log)
[2020-08-21 02:20:36,343] INFO Completed load of Log(dir=C:\kafka_2.12-2.6.0\kafka-test-logs\__consumer_offsets-31, topic=__consumer_offsets, partition=31, highWatermark=0, lastStableOffset=0, logStartOffset=0, logEndOffset=0) with 1 segments in 14ms (32/56 loaded in C:\kafka_2.12-2.6.0\kafka-test-logs) (kafka.log.LogManager)
[2020-08-21 02:20:36,353] INFO [Log partition=__consumer_offsets-32, dir=C:\kafka_2.12-2.6.0\kafka-test-logs] Loading producer state till offset 0 with message format version 2 (kafka.log.Log)
[2020-08-21 02:20:36,356] INFO Completed load of Log(dir=C:\kafka_2.12-2.6.0\kafka-test-logs\__consumer_offsets-32, topic=__consumer_offsets, partition=32, highWatermark=0, lastStableOffset=0, logStartOffset=0, logEndOffset=0) with 1 segments in 13ms (33/56 loaded in C:\kafka_2.12-2.6.0\kafka-test-logs) (kafka.log.LogManager)
[2020-08-21 02:20:36,367] INFO [Log partition=__consumer_offsets-33, dir=C:\kafka_2.12-2.6.0\kafka-test-logs] Loading producer state till offset 0 with message format version 2 (kafka.log.Log)
[2020-08-21 02:20:36,370] INFO Completed load of Log(dir=C:\kafka_2.12-2.6.0\kafka-test-logs\__consumer_offsets-33, topic=__consumer_offsets, partition=33, highWatermark=0, lastStableOffset=0, logStartOffset=0, logEndOffset=0) with 1 segments in 13ms (34/56 loaded in C:\kafka_2.12-2.6.0\kafka-test-logs) (kafka.log.LogManager)
[2020-08-21 02:20:36,380] INFO [Log partition=__consumer_offsets-34, dir=C:\kafka_2.12-2.6.0\kafka-test-logs] Loading producer state till offset 0 with message format version 2 (kafka.log.Log)
[2020-08-21 02:20:36,383] INFO Completed load of Log(dir=C:\kafka_2.12-2.6.0\kafka-test-logs\__consumer_offsets-34, topic=__consumer_offsets, partition=34, highWatermark=0, lastStableOffset=0, logStartOffset=0, logEndOffset=0) with 1 segments in 13ms (35/56 loaded in C:\kafka_2.12-2.6.0\kafka-test-logs) (kafka.log.LogManager)
[2020-08-21 02:20:36,393] INFO [Log partition=__consumer_offsets-35, dir=C:\kafka_2.12-2.6.0\kafka-test-logs] Loading producer state till offset 0 with message format version 2 (kafka.log.Log)
[2020-08-21 02:20:36,396] INFO Completed load of Log(dir=C:\kafka_2.12-2.6.0\kafka-test-logs\__consumer_offsets-35, topic=__consumer_offsets, partition=35, highWatermark=0, lastStableOffset=0, logStartOffset=0, logEndOffset=0) with 1 segments in 13ms (36/56 loaded in C:\kafka_2.12-2.6.0\kafka-test-logs) (kafka.log.LogManager)
[2020-08-21 02:20:36,407] INFO [Log partition=__consumer_offsets-36, dir=C:\kafka_2.12-2.6.0\kafka-test-logs] Loading producer state till offset 0 with message format version 2 (kafka.log.Log)
[2020-08-21 02:20:36,410] INFO Completed load of Log(dir=C:\kafka_2.12-2.6.0\kafka-test-logs\__consumer_offsets-36, topic=__consumer_offsets, partition=36, highWatermark=0, lastStableOffset=0, logStartOffset=0, logEndOffset=0) with 1 segments in 13ms (37/56 loaded in C:\kafka_2.12-2.6.0\kafka-test-logs) (kafka.log.LogManager)
[2020-08-21 02:20:36,420] INFO [Log partition=__consumer_offsets-37, dir=C:\kafka_2.12-2.6.0\kafka-test-logs] Loading producer state till offset 0 with message format version 2 (kafka.log.Log)
[2020-08-21 02:20:36,422] INFO Completed load of Log(dir=C:\kafka_2.12-2.6.0\kafka-test-logs\__consumer_offsets-37, topic=__consumer_offsets, partition=37, highWatermark=0, lastStableOffset=0, logStartOffset=0, logEndOffset=0) with 1 segments in 12ms (38/56 loaded in C:\kafka_2.12-2.6.0\kafka-test-logs) (kafka.log.LogManager)
[2020-08-21 02:20:36,432] INFO [Log partition=__consumer_offsets-38, dir=C:\kafka_2.12-2.6.0\kafka-test-logs] Loading producer state till offset 0 with message format version 2 (kafka.log.Log)
[2020-08-21 02:20:36,435] INFO Completed load of Log(dir=C:\kafka_2.12-2.6.0\kafka-test-logs\__consumer_offsets-38, topic=__consumer_offsets, partition=38, highWatermark=0, lastStableOffset=0, logStartOffset=0, logEndOffset=0) with 1 segments in 12ms (39/56 loaded in C:\kafka_2.12-2.6.0\kafka-test-logs) (kafka.log.LogManager)
[2020-08-21 02:20:36,445] INFO [Log partition=__consumer_offsets-39, dir=C:\kafka_2.12-2.6.0\kafka-test-logs] Loading producer state till offset 0 with message format version 2 (kafka.log.Log)
[2020-08-21 02:20:36,448] INFO Completed load of Log(dir=C:\kafka_2.12-2.6.0\kafka-test-logs\__consumer_offsets-39, topic=__consumer_offsets, partition=39, highWatermark=0, lastStableOffset=0, logStartOffset=0, logEndOffset=0) with 1 segments in 13ms (40/56 loaded in C:\kafka_2.12-2.6.0\kafka-test-logs) (kafka.log.LogManager)
[2020-08-21 02:20:36,461] INFO [Log partition=__consumer_offsets-4, dir=C:\kafka_2.12-2.6.0\kafka-test-logs] Loading producer state till offset 9 with message format version 2 (kafka.log.Log)
[2020-08-21 02:20:36,465] INFO [ProducerStateManager partition=__consumer_offsets-4] Loading producer state from snapshot file 'C:\kafka_2.12-2.6.0\kafka-test-logs\__consumer_offsets-4\00000000000000000009.snapshot' (kafka.log.ProducerStateManager)
[2020-08-21 02:20:36,467] INFO Completed load of Log(dir=C:\kafka_2.12-2.6.0\kafka-test-logs\__consumer_offsets-4, topic=__consumer_offsets, partition=4, highWatermark=0, lastStableOffset=0, logStartOffset=0, logEndOffset=9) with 1 segments in 18ms (41/56 loaded in C:\kafka_2.12-2.6.0\kafka-test-logs) (kafka.log.LogManager)
[2020-08-21 02:20:36,481] INFO [Log partition=__consumer_offsets-40, dir=C:\kafka_2.12-2.6.0\kafka-test-logs] Loading producer state till offset 0 with message format version 2 (kafka.log.Log)
[2020-08-21 02:20:36,484] INFO Completed load of Log(dir=C:\kafka_2.12-2.6.0\kafka-test-logs\__consumer_offsets-40, topic=__consumer_offsets, partition=40, highWatermark=0, lastStableOffset=0, logStartOffset=0, logEndOffset=0) with 1 segments in 17ms (42/56 loaded in C:\kafka_2.12-2.6.0\kafka-test-logs) (kafka.log.LogManager)
[2020-08-21 02:20:36,495] INFO [Log partition=__consumer_offsets-41, dir=C:\kafka_2.12-2.6.0\kafka-test-logs] Loading producer state till offset 0 with message format version 2 (kafka.log.Log)
[2020-08-21 02:20:36,499] INFO Completed load of Log(dir=C:\kafka_2.12-2.6.0\kafka-test-logs\__consumer_offsets-41, topic=__consumer_offsets, partition=41, highWatermark=0, lastStableOffset=0, logStartOffset=0, logEndOffset=0) with 1 segments in 14ms (43/56 loaded in C:\kafka_2.12-2.6.0\kafka-test-logs) (kafka.log.LogManager)
[2020-08-21 02:20:36,509] INFO [Log partition=__consumer_offsets-42, dir=C:\kafka_2.12-2.6.0\kafka-test-logs] Loading producer state till offset 0 with message format version 2 (kafka.log.Log)
[2020-08-21 02:20:36,512] INFO Completed load of Log(dir=C:\kafka_2.12-2.6.0\kafka-test-logs\__consumer_offsets-42, topic=__consumer_offsets, partition=42, highWatermark=0, lastStableOffset=0, logStartOffset=0, logEndOffset=0) with 1 segments in 12ms (44/56 loaded in C:\kafka_2.12-2.6.0\kafka-test-logs) (kafka.log.LogManager)
[2020-08-21 02:20:36,528] INFO [Log partition=__consumer_offsets-43, dir=C:\kafka_2.12-2.6.0\kafka-test-logs] Loading producer state till offset 5 with message format version 2 (kafka.log.Log)
[2020-08-21 02:20:36,531] INFO [ProducerStateManager partition=__consumer_offsets-43] Loading producer state from snapshot file 'C:\kafka_2.12-2.6.0\kafka-test-logs\__consumer_offsets-43\00000000000000000005.snapshot' (kafka.log.ProducerStateManager)
[2020-08-21 02:20:36,534] INFO Completed load of Log(dir=C:\kafka_2.12-2.6.0\kafka-test-logs\__consumer_offsets-43, topic=__consumer_offsets, partition=43, highWatermark=0, lastStableOffset=0, logStartOffset=0, logEndOffset=5) with 1 segments in 21ms (45/56 loaded in C:\kafka_2.12-2.6.0\kafka-test-logs) (kafka.log.LogManager)
[2020-08-21 02:20:36,546] INFO [Log partition=__consumer_offsets-44, dir=C:\kafka_2.12-2.6.0\kafka-test-logs] Loading producer state till offset 0 with message format version 2 (kafka.log.Log)
[2020-08-21 02:20:36,549] INFO Completed load of Log(dir=C:\kafka_2.12-2.6.0\kafka-test-logs\__consumer_offsets-44, topic=__consumer_offsets, partition=44, highWatermark=0, lastStableOffset=0, logStartOffset=0, logEndOffset=0) with 1 segments in 15ms (46/56 loaded in C:\kafka_2.12-2.6.0\kafka-test-logs) (kafka.log.LogManager)
[2020-08-21 02:20:36,560] INFO [Log partition=__consumer_offsets-45, dir=C:\kafka_2.12-2.6.0\kafka-test-logs] Loading producer state till offset 0 with message format version 2 (kafka.log.Log)
[2020-08-21 02:20:36,562] INFO Completed load of Log(dir=C:\kafka_2.12-2.6.0\kafka-test-logs\__consumer_offsets-45, topic=__consumer_offsets, partition=45, highWatermark=0, lastStableOffset=0, logStartOffset=0, logEndOffset=0) with 1 segments in 13ms (47/56 loaded in C:\kafka_2.12-2.6.0\kafka-test-logs) (kafka.log.LogManager)
[2020-08-21 02:20:36,573] INFO [Log partition=__consumer_offsets-46, dir=C:\kafka_2.12-2.6.0\kafka-test-logs] Loading producer state till offset 0 with message format version 2 (kafka.log.Log)
[2020-08-21 02:20:36,576] INFO Completed load of Log(dir=C:\kafka_2.12-2.6.0\kafka-test-logs\__consumer_offsets-46, topic=__consumer_offsets, partition=46, highWatermark=0, lastStableOffset=0, logStartOffset=0, logEndOffset=0) with 1 segments in 14ms (48/56 loaded in C:\kafka_2.12-2.6.0\kafka-test-logs) (kafka.log.LogManager)
[2020-08-21 02:20:36,589] INFO [Log partition=__consumer_offsets-47, dir=C:\kafka_2.12-2.6.0\kafka-test-logs] Loading producer state till offset 0 with message format version 2 (kafka.log.Log)
[2020-08-21 02:20:36,592] INFO Completed load of Log(dir=C:\kafka_2.12-2.6.0\kafka-test-logs\__consumer_offsets-47, topic=__consumer_offsets, partition=47, highWatermark=0, lastStableOffset=0, logStartOffset=0, logEndOffset=0) with 1 segments in 16ms (49/56 loaded in C:\kafka_2.12-2.6.0\kafka-test-logs) (kafka.log.LogManager)
[2020-08-21 02:20:36,603] INFO [Log partition=__consumer_offsets-48, dir=C:\kafka_2.12-2.6.0\kafka-test-logs] Loading producer state till offset 0 with message format version 2 (kafka.log.Log)
[2020-08-21 02:20:36,605] INFO Completed load of Log(dir=C:\kafka_2.12-2.6.0\kafka-test-logs\__consumer_offsets-48, topic=__consumer_offsets, partition=48, highWatermark=0, lastStableOffset=0, logStartOffset=0, logEndOffset=0) with 1 segments in 12ms (50/56 loaded in C:\kafka_2.12-2.6.0\kafka-test-logs) (kafka.log.LogManager)
[2020-08-21 02:20:36,615] INFO [Log partition=__consumer_offsets-49, dir=C:\kafka_2.12-2.6.0\kafka-test-logs] Loading producer state till offset 0 with message format version 2 (kafka.log.Log)
[2020-08-21 02:20:36,619] INFO Completed load of Log(dir=C:\kafka_2.12-2.6.0\kafka-test-logs\__consumer_offsets-49, topic=__consumer_offsets, partition=49, highWatermark=0, lastStableOffset=0, logStartOffset=0, logEndOffset=0) with 1 segments in 13ms (51/56 loaded in C:\kafka_2.12-2.6.0\kafka-test-logs) (kafka.log.LogManager)
[2020-08-21 02:20:36,631] INFO [Log partition=__consumer_offsets-5, dir=C:\kafka_2.12-2.6.0\kafka-test-logs] Loading producer state till offset 0 with message format version 2 (kafka.log.Log)
[2020-08-21 02:20:36,634] INFO Completed load of Log(dir=C:\kafka_2.12-2.6.0\kafka-test-logs\__consumer_offsets-5, topic=__consumer_offsets, partition=5, highWatermark=0, lastStableOffset=0, logStartOffset=0, logEndOffset=0) with 1 segments in 13ms (52/56 loaded in C:\kafka_2.12-2.6.0\kafka-test-logs) (kafka.log.LogManager)
[2020-08-21 02:20:36,645] INFO [Log partition=__consumer_offsets-6, dir=C:\kafka_2.12-2.6.0\kafka-test-logs] Loading producer state till offset 0 with message format version 2 (kafka.log.Log)
[2020-08-21 02:20:36,647] INFO Completed load of Log(dir=C:\kafka_2.12-2.6.0\kafka-test-logs\__consumer_offsets-6, topic=__consumer_offsets, partition=6, highWatermark=0, lastStableOffset=0, logStartOffset=0, logEndOffset=0) with 1 segments in 12ms (53/56 loaded in C:\kafka_2.12-2.6.0\kafka-test-logs) (kafka.log.LogManager)
[2020-08-21 02:20:36,657] INFO [Log partition=__consumer_offsets-7, dir=C:\kafka_2.12-2.6.0\kafka-test-logs] Loading producer state till offset 0 with message format version 2 (kafka.log.Log)
[2020-08-21 02:20:36,661] INFO Completed load of Log(dir=C:\kafka_2.12-2.6.0\kafka-test-logs\__consumer_offsets-7, topic=__consumer_offsets, partition=7, highWatermark=0, lastStableOffset=0, logStartOffset=0, logEndOffset=0) with 1 segments in 13ms (54/56 loaded in C:\kafka_2.12-2.6.0\kafka-test-logs) (kafka.log.LogManager)
[2020-08-21 02:20:36,671] INFO [Log partition=__consumer_offsets-8, dir=C:\kafka_2.12-2.6.0\kafka-test-logs] Loading producer state till offset 0 with message format version 2 (kafka.log.Log)
[2020-08-21 02:20:36,674] INFO Completed load of Log(dir=C:\kafka_2.12-2.6.0\kafka-test-logs\__consumer_offsets-8, topic=__consumer_offsets, partition=8, highWatermark=0, lastStableOffset=0, logStartOffset=0, logEndOffset=0) with 1 segments in 12ms (55/56 loaded in C:\kafka_2.12-2.6.0\kafka-test-logs) (kafka.log.LogManager)
[2020-08-21 02:20:36,685] INFO [Log partition=__consumer_offsets-9, dir=C:\kafka_2.12-2.6.0\kafka-test-logs] Loading producer state till offset 0 with message format version 2 (kafka.log.Log)
[2020-08-21 02:20:36,687] INFO Completed load of Log(dir=C:\kafka_2.12-2.6.0\kafka-test-logs\__consumer_offsets-9, topic=__consumer_offsets, partition=9, highWatermark=0, lastStableOffset=0, logStartOffset=0, logEndOffset=0) with 1 segments in 12ms (56/56 loaded in C:\kafka_2.12-2.6.0\kafka-test-logs) (kafka.log.LogManager)
[2020-08-21 02:20:36,691] INFO Loaded 56 logs in 1040ms. (kafka.log.LogManager)
[2020-08-21 02:20:36,707] INFO Starting log cleanup with a period of 300000 ms. (kafka.log.LogManager)
[2020-08-21 02:20:36,709] INFO Starting log flusher with a default period of 9223372036854775807 ms. (kafka.log.LogManager)
[2020-08-21 02:20:37,149] INFO Awaiting socket connections on 0.0.0.0:9092. (kafka.network.Acceptor)
[2020-08-21 02:20:37,223] INFO [SocketServer brokerId=0] Created data-plane acceptor and processors for endpoint : ListenerName(PLAINTEXT) (kafka.network.SocketServer)
[2020-08-21 02:20:37,247] INFO [ExpirationReaper-0-Produce]: Starting (kafka.server.DelayedOperationPurgatory$ExpiredOperationReaper)
[2020-08-21 02:20:37,250] INFO [ExpirationReaper-0-Fetch]: Starting (kafka.server.DelayedOperationPurgatory$ExpiredOperationReaper)
[2020-08-21 02:20:37,250] INFO [ExpirationReaper-0-ElectLeader]: Starting (kafka.server.DelayedOperationPurgatory$ExpiredOperationReaper)
[2020-08-21 02:20:37,250] INFO [ExpirationReaper-0-DeleteRecords]: Starting (kafka.server.DelayedOperationPurgatory$ExpiredOperationReaper)
[2020-08-21 02:20:37,265] INFO [LogDirFailureHandler]: Starting (kafka.server.ReplicaManager$LogDirFailureHandler)
[2020-08-21 02:20:46,909] INFO Creating /brokers/ids/0 (is it secure? false) (kafka.zk.KafkaZkClient)
[2020-08-21 02:20:46,939] INFO Stat of the created znode at /brokers/ids/0 is: 184,184,1597969246926,1597969246926,1,0,0,72059632393715712,200,0,184
 (kafka.zk.KafkaZkClient)
[2020-08-21 02:20:46,941] INFO Registered broker 0 at path /brokers/ids/0 with addresses: PLAINTEXT://DESKTOP-G102BV9:9092, czxid (broker epoch): 184 (kafka.zk.KafkaZkClient)
[2020-08-21 02:20:47,010] INFO [ExpirationReaper-0-topic]: Starting (kafka.server.DelayedOperationPurgatory$ExpiredOperationReaper)
[2020-08-21 02:20:47,026] INFO [ExpirationReaper-0-Heartbeat]: Starting (kafka.server.DelayedOperationPurgatory$ExpiredOperationReaper)
[2020-08-21 02:20:47,027] INFO [ExpirationReaper-0-Rebalance]: Starting (kafka.server.DelayedOperationPurgatory$ExpiredOperationReaper)
[2020-08-21 02:20:47,080] INFO [GroupCoordinator 0]: Starting up. (kafka.coordinator.group.GroupCoordinator)
[2020-08-21 02:20:47,082] INFO [GroupCoordinator 0]: Startup complete. (kafka.coordinator.group.GroupCoordinator)
[2020-08-21 02:20:47,095] INFO [GroupMetadataManager brokerId=0] Removed 0 expired offsets in 12 milliseconds. (kafka.coordinator.group.GroupMetadataManager)
[2020-08-21 02:20:47,112] INFO [ProducerId Manager 0]: Acquired new producerId block (brokerId:0,blockStartProducerId:1000,blockEndProducerId:1999) by writing to Zk with path version 2 (kafka.coordinator.transaction.ProducerIdManager)
[2020-08-21 02:20:47,160] INFO [TransactionCoordinator id=0] Starting up. (kafka.coordinator.transaction.TransactionCoordinator)
[2020-08-21 02:20:47,164] INFO [Transaction Marker Channel Manager 0]: Starting (kafka.coordinator.transaction.TransactionMarkerChannelManager)
[2020-08-21 02:20:47,164] INFO [TransactionCoordinator id=0] Startup complete. (kafka.coordinator.transaction.TransactionCoordinator)
[2020-08-21 02:20:47,221] INFO [ExpirationReaper-0-AlterAcls]: Starting (kafka.server.DelayedOperationPurgatory$ExpiredOperationReaper)
[2020-08-21 02:20:47,247] INFO [/config/changes-event-process-thread]: Starting (kafka.common.ZkNodeChangeNotificationListener$ChangeEventProcessThread)
[2020-08-21 02:20:47,285] INFO [SocketServer brokerId=0] Starting socket server acceptors and processors (kafka.network.SocketServer)
[2020-08-21 02:20:47,292] INFO [SocketServer brokerId=0] Started data-plane acceptor and processor(s) for endpoint : ListenerName(PLAINTEXT) (kafka.network.SocketServer)
[2020-08-21 02:20:47,293] INFO [SocketServer brokerId=0] Started socket server acceptors and processors (kafka.network.SocketServer)
[2020-08-21 02:20:47,300] INFO Kafka version: 2.6.0 (org.apache.kafka.common.utils.AppInfoParser)
[2020-08-21 02:20:47,302] INFO Kafka commitId: 62abe01bee039651 (org.apache.kafka.common.utils.AppInfoParser)
[2020-08-21 02:20:47,302] INFO Kafka startTimeMs: 1597969247293 (org.apache.kafka.common.utils.AppInfoParser)
[2020-08-21 02:20:47,305] INFO [KafkaServer id=0] started (kafka.server.KafkaServer)
[2020-08-21 02:20:47,427] INFO [ReplicaFetcherManager on broker 0] Removed fetcher for partitions Set(__consumer_offsets-22, __consumer_offsets-30, __consumer_offsets-8, __consumer_offsets-21, __consumer_offsets-4, __consumer_offsets-27, __consumer_offsets-7, __consumer_offsets-9, __consumer_offsets-46, __consumer_offsets-25, __consumer_offsets-35, __consumer_offsets-41, __consumer_offsets-33, __consumer_offsets-23, __consumer_offsets-49, reflectoring-bytes-0, __consumer_offsets-47, __consumer_offsets-16, reflectoring-1-0, __consumer_offsets-28, reflectoring-others-0, __consumer_offsets-31, __consumer_offsets-36, __consumer_offsets-42, __consumer_offsets-3, __consumer_offsets-18, __consumer_offsets-37, __consumer_offsets-15, __consumer_offsets-24, reflectoring-user-0, __consumer_offsets-38, __consumer_offsets-17, __consumer_offsets-48, reflectoring-2-0, __consumer_offsets-19, __consumer_offsets-11, reflectoring-3-0, __consumer_offsets-13, __consumer_offsets-2, __consumer_offsets-43, __consumer_offsets-6, __consumer_offsets-14, __consumer_offsets-20, __consumer_offsets-0, __consumer_offsets-44, __consumer_offsets-39, __consumer_offsets-12, __consumer_offsets-45, __consumer_offsets-1, __consumer_offsets-5, __consumer_offsets-26, __consumer_offsets-29, __consumer_offsets-34, __consumer_offsets-10, __consumer_offsets-32, __consumer_offsets-40) (kafka.server.ReplicaFetcherManager)
[2020-08-21 02:20:47,443] INFO [Partition __consumer_offsets-0 broker=0] Log loaded for partition __consumer_offsets-0 with initial high watermark 0 (kafka.cluster.Partition)
[2020-08-21 02:20:47,457] INFO [Partition reflectoring-user-0 broker=0] Log loaded for partition reflectoring-user-0 with initial high watermark 2 (kafka.cluster.Partition)
[2020-08-21 02:20:47,459] INFO [Partition __consumer_offsets-29 broker=0] Log loaded for partition __consumer_offsets-29 with initial high watermark 0 (kafka.cluster.Partition)
[2020-08-21 02:20:47,465] INFO [Partition __consumer_offsets-48 broker=0] Log loaded for partition __consumer_offsets-48 with initial high watermark 0 (kafka.cluster.Partition)
[2020-08-21 02:20:47,470] INFO [Partition __consumer_offsets-10 broker=0] Log loaded for partition __consumer_offsets-10 with initial high watermark 0 (kafka.cluster.Partition)
[2020-08-21 02:20:47,475] INFO [Partition __consumer_offsets-45 broker=0] Log loaded for partition __consumer_offsets-45 with initial high watermark 0 (kafka.cluster.Partition)
[2020-08-21 02:20:47,484] INFO [Partition __consumer_offsets-26 broker=0] Log loaded for partition __consumer_offsets-26 with initial high watermark 0 (kafka.cluster.Partition)
[2020-08-21 02:20:47,489] INFO [Partition __consumer_offsets-7 broker=0] Log loaded for partition __consumer_offsets-7 with initial high watermark 0 (kafka.cluster.Partition)
[2020-08-21 02:20:47,494] INFO [Partition __consumer_offsets-42 broker=0] Log loaded for partition __consumer_offsets-42 with initial high watermark 0 (kafka.cluster.Partition)
[2020-08-21 02:20:47,502] INFO [Partition __consumer_offsets-4 broker=0] Log loaded for partition __consumer_offsets-4 with initial high watermark 9 (kafka.cluster.Partition)
[2020-08-21 02:20:47,504] INFO [Partition __consumer_offsets-23 broker=0] Log loaded for partition __consumer_offsets-23 with initial high watermark 0 (kafka.cluster.Partition)
[2020-08-21 02:20:47,509] INFO [Partition __consumer_offsets-1 broker=0] Log loaded for partition __consumer_offsets-1 with initial high watermark 0 (kafka.cluster.Partition)
[2020-08-21 02:20:47,514] INFO [Partition __consumer_offsets-39 broker=0] Log loaded for partition __consumer_offsets-39 with initial high watermark 0 (kafka.cluster.Partition)
[2020-08-21 02:20:47,519] INFO [Partition __consumer_offsets-20 broker=0] Log loaded for partition __consumer_offsets-20 with initial high watermark 0 (kafka.cluster.Partition)
[2020-08-21 02:20:47,524] INFO [Partition __consumer_offsets-17 broker=0] Log loaded for partition __consumer_offsets-17 with initial high watermark 0 (kafka.cluster.Partition)
[2020-08-21 02:20:47,529] INFO [Partition __consumer_offsets-36 broker=0] Log loaded for partition __consumer_offsets-36 with initial high watermark 0 (kafka.cluster.Partition)
[2020-08-21 02:20:47,534] INFO [Partition reflectoring-others-0 broker=0] Log loaded for partition reflectoring-others-0 with initial high watermark 2 (kafka.cluster.Partition)
[2020-08-21 02:20:47,534] INFO [Partition __consumer_offsets-14 broker=0] Log loaded for partition __consumer_offsets-14 with initial high watermark 0 (kafka.cluster.Partition)
[2020-08-21 02:20:47,538] INFO [Partition reflectoring-1-0 broker=0] Log loaded for partition reflectoring-1-0 with initial high watermark 1 (kafka.cluster.Partition)
[2020-08-21 02:20:47,540] INFO [Partition __consumer_offsets-33 broker=0] Log loaded for partition __consumer_offsets-33 with initial high watermark 0 (kafka.cluster.Partition)
[2020-08-21 02:20:47,545] INFO [Partition __consumer_offsets-49 broker=0] Log loaded for partition __consumer_offsets-49 with initial high watermark 0 (kafka.cluster.Partition)
[2020-08-21 02:20:47,549] INFO [Partition __consumer_offsets-11 broker=0] Log loaded for partition __consumer_offsets-11 with initial high watermark 0 (kafka.cluster.Partition)
[2020-08-21 02:20:47,553] INFO [Partition __consumer_offsets-30 broker=0] Log loaded for partition __consumer_offsets-30 with initial high watermark 0 (kafka.cluster.Partition)
[2020-08-21 02:20:47,556] INFO [Partition __consumer_offsets-46 broker=0] Log loaded for partition __consumer_offsets-46 with initial high watermark 0 (kafka.cluster.Partition)
[2020-08-21 02:20:47,561] INFO [Partition __consumer_offsets-27 broker=0] Log loaded for partition __consumer_offsets-27 with initial high watermark 0 (kafka.cluster.Partition)
[2020-08-21 02:20:47,565] INFO [Partition __consumer_offsets-8 broker=0] Log loaded for partition __consumer_offsets-8 with initial high watermark 0 (kafka.cluster.Partition)
[2020-08-21 02:20:47,569] INFO [Partition __consumer_offsets-24 broker=0] Log loaded for partition __consumer_offsets-24 with initial high watermark 0 (kafka.cluster.Partition)
[2020-08-21 02:20:47,573] INFO [Partition __consumer_offsets-43 broker=0] Log loaded for partition __consumer_offsets-43 with initial high watermark 5 (kafka.cluster.Partition)
[2020-08-21 02:20:47,574] INFO [Partition __consumer_offsets-5 broker=0] Log loaded for partition __consumer_offsets-5 with initial high watermark 0 (kafka.cluster.Partition)
[2020-08-21 02:20:47,578] INFO [Partition reflectoring-3-0 broker=0] Log loaded for partition reflectoring-3-0 with initial high watermark 2 (kafka.cluster.Partition)
[2020-08-21 02:20:47,579] INFO [Partition __consumer_offsets-21 broker=0] Log loaded for partition __consumer_offsets-21 with initial high watermark 0 (kafka.cluster.Partition)
[2020-08-21 02:20:47,584] INFO [Partition __consumer_offsets-40 broker=0] Log loaded for partition __consumer_offsets-40 with initial high watermark 0 (kafka.cluster.Partition)
[2020-08-21 02:20:47,589] INFO [Partition __consumer_offsets-2 broker=0] Log loaded for partition __consumer_offsets-2 with initial high watermark 0 (kafka.cluster.Partition)
[2020-08-21 02:20:47,596] INFO [Partition __consumer_offsets-37 broker=0] Log loaded for partition __consumer_offsets-37 with initial high watermark 0 (kafka.cluster.Partition)
[2020-08-21 02:20:47,600] INFO [Partition __consumer_offsets-18 broker=0] Log loaded for partition __consumer_offsets-18 with initial high watermark 0 (kafka.cluster.Partition)
[2020-08-21 02:20:47,604] INFO [Partition __consumer_offsets-34 broker=0] Log loaded for partition __consumer_offsets-34 with initial high watermark 0 (kafka.cluster.Partition)
[2020-08-21 02:20:47,609] INFO [Partition __consumer_offsets-15 broker=0] Log loaded for partition __consumer_offsets-15 with initial high watermark 0 (kafka.cluster.Partition)
[2020-08-21 02:20:47,613] INFO [Partition __consumer_offsets-12 broker=0] Log loaded for partition __consumer_offsets-12 with initial high watermark 2 (kafka.cluster.Partition)
[2020-08-21 02:20:47,613] INFO [Partition __consumer_offsets-31 broker=0] Log loaded for partition __consumer_offsets-31 with initial high watermark 0 (kafka.cluster.Partition)
[2020-08-21 02:20:47,618] INFO [Partition __consumer_offsets-9 broker=0] Log loaded for partition __consumer_offsets-9 with initial high watermark 0 (kafka.cluster.Partition)
[2020-08-21 02:20:47,623] INFO [Partition __consumer_offsets-47 broker=0] Log loaded for partition __consumer_offsets-47 with initial high watermark 0 (kafka.cluster.Partition)
[2020-08-21 02:20:47,628] INFO [Partition __consumer_offsets-19 broker=0] Log loaded for partition __consumer_offsets-19 with initial high watermark 0 (kafka.cluster.Partition)
[2020-08-21 02:20:47,633] INFO [Partition __consumer_offsets-28 broker=0] Log loaded for partition __consumer_offsets-28 with initial high watermark 0 (kafka.cluster.Partition)
[2020-08-21 02:20:47,637] INFO [Partition __consumer_offsets-38 broker=0] Log loaded for partition __consumer_offsets-38 with initial high watermark 0 (kafka.cluster.Partition)
[2020-08-21 02:20:47,641] INFO [Partition __consumer_offsets-35 broker=0] Log loaded for partition __consumer_offsets-35 with initial high watermark 0 (kafka.cluster.Partition)
[2020-08-21 02:20:47,645] INFO [Partition reflectoring-bytes-0 broker=0] Log loaded for partition reflectoring-bytes-0 with initial high watermark 1 (kafka.cluster.Partition)
[2020-08-21 02:20:47,646] INFO [Partition __consumer_offsets-6 broker=0] Log loaded for partition __consumer_offsets-6 with initial high watermark 0 (kafka.cluster.Partition)
[2020-08-21 02:20:47,650] INFO [Partition __consumer_offsets-44 broker=0] Log loaded for partition __consumer_offsets-44 with initial high watermark 0 (kafka.cluster.Partition)
[2020-08-21 02:20:47,655] INFO [Partition __consumer_offsets-25 broker=0] Log loaded for partition __consumer_offsets-25 with initial high watermark 4 (kafka.cluster.Partition)
[2020-08-21 02:20:47,655] INFO [Partition __consumer_offsets-16 broker=0] Log loaded for partition __consumer_offsets-16 with initial high watermark 0 (kafka.cluster.Partition)
[2020-08-21 02:20:47,659] INFO [Partition __consumer_offsets-22 broker=0] Log loaded for partition __consumer_offsets-22 with initial high watermark 0 (kafka.cluster.Partition)
[2020-08-21 02:20:47,664] INFO [Partition __consumer_offsets-41 broker=0] Log loaded for partition __consumer_offsets-41 with initial high watermark 0 (kafka.cluster.Partition)
[2020-08-21 02:20:47,668] INFO [Partition reflectoring-2-0 broker=0] Log loaded for partition reflectoring-2-0 with initial high watermark 2 (kafka.cluster.Partition)
[2020-08-21 02:20:47,669] INFO [Partition __consumer_offsets-32 broker=0] Log loaded for partition __consumer_offsets-32 with initial high watermark 0 (kafka.cluster.Partition)
[2020-08-21 02:20:47,673] INFO [Partition __consumer_offsets-3 broker=0] Log loaded for partition __consumer_offsets-3 with initial high watermark 0 (kafka.cluster.Partition)
[2020-08-21 02:20:47,677] INFO [Partition __consumer_offsets-13 broker=0] Log loaded for partition __consumer_offsets-13 with initial high watermark 7 (kafka.cluster.Partition)
[2020-08-21 02:20:47,688] INFO [GroupMetadataManager brokerId=0] Scheduling loading of offsets and group metadata from __consumer_offsets-22 (kafka.coordinator.group.GroupMetadataManager)
[2020-08-21 02:20:47,690] INFO [GroupMetadataManager brokerId=0] Scheduling loading of offsets and group metadata from __consumer_offsets-25 (kafka.coordinator.group.GroupMetadataManager)
[2020-08-21 02:20:47,690] INFO [GroupMetadataManager brokerId=0] Scheduling loading of offsets and group metadata from __consumer_offsets-28 (kafka.coordinator.group.GroupMetadataManager)
[2020-08-21 02:20:47,691] INFO [GroupMetadataManager brokerId=0] Scheduling loading of offsets and group metadata from __consumer_offsets-31 (kafka.coordinator.group.GroupMetadataManager)
[2020-08-21 02:20:47,692] INFO [GroupMetadataManager brokerId=0] Scheduling loading of offsets and group metadata from __consumer_offsets-34 (kafka.coordinator.group.GroupMetadataManager)
[2020-08-21 02:20:47,692] INFO [GroupMetadataManager brokerId=0] Scheduling loading of offsets and group metadata from __consumer_offsets-37 (kafka.coordinator.group.GroupMetadataManager)
[2020-08-21 02:20:47,693] INFO [GroupMetadataManager brokerId=0] Scheduling loading of offsets and group metadata from __consumer_offsets-40 (kafka.coordinator.group.GroupMetadataManager)
[2020-08-21 02:20:47,693] INFO [GroupMetadataManager brokerId=0] Scheduling loading of offsets and group metadata from __consumer_offsets-43 (kafka.coordinator.group.GroupMetadataManager)
[2020-08-21 02:20:47,694] INFO [GroupMetadataManager brokerId=0] Scheduling loading of offsets and group metadata from __consumer_offsets-46 (kafka.coordinator.group.GroupMetadataManager)
[2020-08-21 02:20:47,695] INFO [GroupMetadataManager brokerId=0] Scheduling loading of offsets and group metadata from __consumer_offsets-49 (kafka.coordinator.group.GroupMetadataManager)
[2020-08-21 02:20:47,695] INFO [GroupMetadataManager brokerId=0] Finished loading offsets and group metadata from __consumer_offsets-22 in 5 milliseconds, of which 1 milliseconds was spent in the scheduler. (kafka.coordinator.group.GroupMetadataManager)
[2020-08-21 02:20:47,695] INFO [GroupMetadataManager brokerId=0] Scheduling loading of offsets and group metadata from __consumer_offsets-41 (kafka.coordinator.group.GroupMetadataManager)
[2020-08-21 02:20:47,699] INFO [GroupMetadataManager brokerId=0] Scheduling loading of offsets and group metadata from __consumer_offsets-47 (kafka.coordinator.group.GroupMetadataManager)
[2020-08-21 02:20:47,700] INFO [GroupMetadataManager brokerId=0] Scheduling loading of offsets and group metadata from __consumer_offsets-44 (kafka.coordinator.group.GroupMetadataManager)
[2020-08-21 02:20:47,701] INFO [GroupMetadataManager brokerId=0] Scheduling loading of offsets and group metadata from __consumer_offsets-1 (kafka.coordinator.group.GroupMetadataManager)
[2020-08-21 02:20:47,702] INFO [GroupMetadataManager brokerId=0] Scheduling loading of offsets and group metadata from __consumer_offsets-4 (kafka.coordinator.group.GroupMetadataManager)
[2020-08-21 02:20:47,703] INFO [GroupMetadataManager brokerId=0] Scheduling loading of offsets and group metadata from __consumer_offsets-7 (kafka.coordinator.group.GroupMetadataManager)
[2020-08-21 02:20:47,704] INFO [GroupMetadataManager brokerId=0] Scheduling loading of offsets and group metadata from __consumer_offsets-10 (kafka.coordinator.group.GroupMetadataManager)
[2020-08-21 02:20:47,704] INFO [GroupMetadataManager brokerId=0] Scheduling loading of offsets and group metadata from __consumer_offsets-13 (kafka.coordinator.group.GroupMetadataManager)
[2020-08-21 02:20:47,705] INFO [GroupMetadataManager brokerId=0] Scheduling loading of offsets and group metadata from __consumer_offsets-16 (kafka.coordinator.group.GroupMetadataManager)
[2020-08-21 02:20:47,706] INFO [GroupMetadataManager brokerId=0] Scheduling loading of offsets and group metadata from __consumer_offsets-19 (kafka.coordinator.group.GroupMetadataManager)
[2020-08-21 02:20:47,706] INFO [GroupMetadataManager brokerId=0] Scheduling loading of offsets and group metadata from __consumer_offsets-2 (kafka.coordinator.group.GroupMetadataManager)
[2020-08-21 02:20:47,707] INFO [GroupMetadataManager brokerId=0] Scheduling loading of offsets and group metadata from __consumer_offsets-5 (kafka.coordinator.group.GroupMetadataManager)
[2020-08-21 02:20:47,710] INFO [GroupMetadataManager brokerId=0] Scheduling loading of offsets and group metadata from __consumer_offsets-8 (kafka.coordinator.group.GroupMetadataManager)
[2020-08-21 02:20:47,711] INFO [GroupMetadataManager brokerId=0] Scheduling loading of offsets and group metadata from __consumer_offsets-11 (kafka.coordinator.group.GroupMetadataManager)
[2020-08-21 02:20:47,712] INFO [GroupMetadataManager brokerId=0] Scheduling loading of offsets and group metadata from __consumer_offsets-14 (kafka.coordinator.group.GroupMetadataManager)
[2020-08-21 02:20:47,712] INFO [GroupMetadataManager brokerId=0] Scheduling loading of offsets and group metadata from __consumer_offsets-17 (kafka.coordinator.group.GroupMetadataManager)
[2020-08-21 02:20:47,713] INFO [GroupMetadataManager brokerId=0] Scheduling loading of offsets and group metadata from __consumer_offsets-20 (kafka.coordinator.group.GroupMetadataManager)
[2020-08-21 02:20:47,713] INFO [GroupMetadataManager brokerId=0] Scheduling loading of offsets and group metadata from __consumer_offsets-23 (kafka.coordinator.group.GroupMetadataManager)
[2020-08-21 02:20:47,714] INFO [GroupMetadataManager brokerId=0] Scheduling loading of offsets and group metadata from __consumer_offsets-26 (kafka.coordinator.group.GroupMetadataManager)
[2020-08-21 02:20:47,715] INFO [GroupMetadataManager brokerId=0] Scheduling loading of offsets and group metadata from __consumer_offsets-29 (kafka.coordinator.group.GroupMetadataManager)
[2020-08-21 02:20:47,715] INFO [GroupMetadataManager brokerId=0] Scheduling loading of offsets and group metadata from __consumer_offsets-32 (kafka.coordinator.group.GroupMetadataManager)
[2020-08-21 02:20:47,716] INFO [GroupMetadataManager brokerId=0] Scheduling loading of offsets and group metadata from __consumer_offsets-35 (kafka.coordinator.group.GroupMetadataManager)
[2020-08-21 02:20:47,716] INFO [GroupMetadataManager brokerId=0] Scheduling loading of offsets and group metadata from __consumer_offsets-38 (kafka.coordinator.group.GroupMetadataManager)
[2020-08-21 02:20:47,717] INFO [GroupMetadataManager brokerId=0] Scheduling loading of offsets and group metadata from __consumer_offsets-0 (kafka.coordinator.group.GroupMetadataManager)
[2020-08-21 02:20:47,718] INFO [GroupMetadataManager brokerId=0] Scheduling loading of offsets and group metadata from __consumer_offsets-6 (kafka.coordinator.group.GroupMetadataManager)
[2020-08-21 02:20:47,718] INFO [GroupMetadataManager brokerId=0] Scheduling loading of offsets and group metadata from __consumer_offsets-9 (kafka.coordinator.group.GroupMetadataManager)
[2020-08-21 02:20:47,719] INFO [GroupMetadataManager brokerId=0] Scheduling loading of offsets and group metadata from __consumer_offsets-12 (kafka.coordinator.group.GroupMetadataManager)
[2020-08-21 02:20:47,723] INFO [GroupMetadataManager brokerId=0] Scheduling loading of offsets and group metadata from __consumer_offsets-15 (kafka.coordinator.group.GroupMetadataManager)
[2020-08-21 02:20:47,724] INFO [GroupMetadataManager brokerId=0] Scheduling loading of offsets and group metadata from __consumer_offsets-18 (kafka.coordinator.group.GroupMetadataManager)
[2020-08-21 02:20:47,725] INFO [GroupMetadataManager brokerId=0] Scheduling loading of offsets and group metadata from __consumer_offsets-24 (kafka.coordinator.group.GroupMetadataManager)
[2020-08-21 02:20:47,725] INFO [GroupMetadataManager brokerId=0] Scheduling loading of offsets and group metadata from __consumer_offsets-27 (kafka.coordinator.group.GroupMetadataManager)
[2020-08-21 02:20:47,726] INFO [GroupMetadataManager brokerId=0] Scheduling loading of offsets and group metadata from __consumer_offsets-30 (kafka.coordinator.group.GroupMetadataManager)
[2020-08-21 02:20:47,726] INFO [GroupMetadataManager brokerId=0] Scheduling loading of offsets and group metadata from __consumer_offsets-33 (kafka.coordinator.group.GroupMetadataManager)
[2020-08-21 02:20:47,727] INFO [GroupMetadataManager brokerId=0] Scheduling loading of offsets and group metadata from __consumer_offsets-36 (kafka.coordinator.group.GroupMetadataManager)
[2020-08-21 02:20:47,727] INFO Static member MemberMetadata(memberId=consumer-class-level-3-fcb5b9d3-c9ea-4754-a01c-e082402138f6, groupInstanceId=Some(null), clientId=consumer-class-level-3, clientHost=/192.168.56.1, sessionTimeoutMs=10000, rebalanceTimeoutMs=300000, supportedProtocols=List(range), ).groupInstanceId of group class-level loaded with member id consumer-class-level-3-fcb5b9d3-c9ea-4754-a01c-e082402138f6 at generation 1. (kafka.coordinator.group.GroupMetadata$)
[2020-08-21 02:20:47,727] INFO [GroupMetadataManager brokerId=0] Scheduling loading of offsets and group metadata from __consumer_offsets-39 (kafka.coordinator.group.GroupMetadataManager)
[2020-08-21 02:20:47,728] INFO [GroupMetadataManager brokerId=0] Scheduling loading of offsets and group metadata from __consumer_offsets-42 (kafka.coordinator.group.GroupMetadataManager)
[2020-08-21 02:20:47,729] INFO [GroupMetadataManager brokerId=0] Scheduling loading of offsets and group metadata from __consumer_offsets-45 (kafka.coordinator.group.GroupMetadataManager)
[2020-08-21 02:20:47,730] INFO [GroupMetadataManager brokerId=0] Scheduling loading of offsets and group metadata from __consumer_offsets-48 (kafka.coordinator.group.GroupMetadataManager)
[2020-08-21 02:20:47,730] INFO [GroupMetadataManager brokerId=0] Scheduling loading of offsets and group metadata from __consumer_offsets-21 (kafka.coordinator.group.GroupMetadataManager)
[2020-08-21 02:20:47,731] INFO [GroupMetadataManager brokerId=0] Scheduling loading of offsets and group metadata from __consumer_offsets-3 (kafka.coordinator.group.GroupMetadataManager)
[2020-08-21 02:20:47,735] INFO [GroupCoordinator 0]: Loading group metadata for class-level with generation 2 (kafka.coordinator.group.GroupCoordinator)
[2020-08-21 02:20:47,739] INFO [GroupMetadataManager brokerId=0] Finished loading offsets and group metadata from __consumer_offsets-25 in 49 milliseconds, of which 6 milliseconds was spent in the scheduler. (kafka.coordinator.group.GroupMetadataManager)
[2020-08-21 02:20:47,742] INFO [GroupMetadataManager brokerId=0] Finished loading offsets and group metadata from __consumer_offsets-28 in 51 milliseconds, of which 49 milliseconds was spent in the scheduler. (kafka.coordinator.group.GroupMetadataManager)
[2020-08-21 02:20:47,742] INFO [GroupMetadataManager brokerId=0] Finished loading offsets and group metadata from __consumer_offsets-31 in 50 milliseconds, of which 50 milliseconds was spent in the scheduler. (kafka.coordinator.group.GroupMetadataManager)
[2020-08-21 02:20:47,743] INFO [GroupMetadataManager brokerId=0] Finished loading offsets and group metadata from __consumer_offsets-34 in 51 milliseconds, of which 50 milliseconds was spent in the scheduler. (kafka.coordinator.group.GroupMetadataManager)
[2020-08-21 02:20:47,744] INFO [GroupMetadataManager brokerId=0] Finished loading offsets and group metadata from __consumer_offsets-37 in 51 milliseconds, of which 50 milliseconds was spent in the scheduler. (kafka.coordinator.group.GroupMetadataManager)
[2020-08-21 02:20:47,744] INFO [GroupMetadataManager brokerId=0] Finished loading offsets and group metadata from __consumer_offsets-40 in 51 milliseconds, of which 51 milliseconds was spent in the scheduler. (kafka.coordinator.group.GroupMetadataManager)
[2020-08-21 02:20:47,749] INFO Static member MemberMetadata(memberId=consumer-reflectoring-user-mc-1-6d379283-cbe7-4495-bf0b-1bf294ecc894, groupInstanceId=Some(null), clientId=consumer-reflectoring-user-mc-1, clientHost=/192.168.56.1, sessionTimeoutMs=10000, rebalanceTimeoutMs=300000, supportedProtocols=List(range), ).groupInstanceId of group reflectoring-user-mc loaded with member id consumer-reflectoring-user-mc-1-6d379283-cbe7-4495-bf0b-1bf294ecc894 at generation 1. (kafka.coordinator.group.GroupMetadata$)
[2020-08-21 02:20:47,751] INFO [GroupCoordinator 0]: Loading group metadata for reflectoring-user-mc with generation 2 (kafka.coordinator.group.GroupCoordinator)
[2020-08-21 02:20:47,751] INFO [GroupMetadataManager brokerId=0] Finished loading offsets and group metadata from __consumer_offsets-43 in 57 milliseconds, of which 51 milliseconds was spent in the scheduler. (kafka.coordinator.group.GroupMetadataManager)
[2020-08-21 02:20:47,752] INFO [GroupMetadataManager brokerId=0] Finished loading offsets and group metadata from __consumer_offsets-46 in 58 milliseconds, of which 57 milliseconds was spent in the scheduler. (kafka.coordinator.group.GroupMetadataManager)
[2020-08-21 02:20:47,752] INFO [GroupMetadataManager brokerId=0] Finished loading offsets and group metadata from __consumer_offsets-49 in 57 milliseconds, of which 57 milliseconds was spent in the scheduler. (kafka.coordinator.group.GroupMetadataManager)
[2020-08-21 02:20:47,753] INFO [GroupMetadataManager brokerId=0] Finished loading offsets and group metadata from __consumer_offsets-41 in 54 milliseconds, of which 54 milliseconds was spent in the scheduler. (kafka.coordinator.group.GroupMetadataManager)
[2020-08-21 02:20:47,753] INFO [GroupMetadataManager brokerId=0] Finished loading offsets and group metadata from __consumer_offsets-47 in 53 milliseconds, of which 53 milliseconds was spent in the scheduler. (kafka.coordinator.group.GroupMetadataManager)
[2020-08-21 02:20:47,754] INFO [GroupMetadataManager brokerId=0] Finished loading offsets and group metadata from __consumer_offsets-44 in 53 milliseconds, of which 53 milliseconds was spent in the scheduler. (kafka.coordinator.group.GroupMetadataManager)
[2020-08-21 02:20:47,754] INFO [GroupMetadataManager brokerId=0] Finished loading offsets and group metadata from __consumer_offsets-1 in 52 milliseconds, of which 52 milliseconds was spent in the scheduler. (kafka.coordinator.group.GroupMetadataManager)
[2020-08-21 02:20:47,758] INFO Static member MemberMetadata(memberId=consumer-reflectoring-group-4-8e9f37df-b98a-46c3-921d-13167294bf2b, groupInstanceId=Some(null), clientId=consumer-reflectoring-group-4, clientHost=/192.168.56.1, sessionTimeoutMs=10000, rebalanceTimeoutMs=300000, supportedProtocols=List(range), ).groupInstanceId of group reflectoring-group loaded with member id consumer-reflectoring-group-4-8e9f37df-b98a-46c3-921d-13167294bf2b at generation 1. (kafka.coordinator.group.GroupMetadata$)
[2020-08-21 02:20:47,760] INFO Static member MemberMetadata(memberId=consumer-reflectoring-group-5-b3be721a-a983-4f58-afcf-e335f2d65bad, groupInstanceId=Some(null), clientId=consumer-reflectoring-group-5, clientHost=/192.168.56.1, sessionTimeoutMs=10000, rebalanceTimeoutMs=300000, supportedProtocols=List(range), ).groupInstanceId of group reflectoring-group loaded with member id consumer-reflectoring-group-5-b3be721a-a983-4f58-afcf-e335f2d65bad at generation 1. (kafka.coordinator.group.GroupMetadata$)
[2020-08-21 02:20:47,761] INFO Static member MemberMetadata(memberId=consumer-reflectoring-group-6-03c70454-8bc1-4794-a8c7-54c3f6044542, groupInstanceId=Some(null), clientId=consumer-reflectoring-group-6, clientHost=/192.168.56.1, sessionTimeoutMs=10000, rebalanceTimeoutMs=300000, supportedProtocols=List(range), ).groupInstanceId of group reflectoring-group loaded with member id consumer-reflectoring-group-6-03c70454-8bc1-4794-a8c7-54c3f6044542 at generation 1. (kafka.coordinator.group.GroupMetadata$)
[2020-08-21 02:20:47,763] INFO [GroupCoordinator 0]: Loading group metadata for reflectoring-group with generation 2 (kafka.coordinator.group.GroupCoordinator)
[2020-08-21 02:20:47,764] INFO [GroupMetadataManager brokerId=0] Finished loading offsets and group metadata from __consumer_offsets-4 in 61 milliseconds, of which 52 milliseconds was spent in the scheduler. (kafka.coordinator.group.GroupMetadataManager)
[2020-08-21 02:20:47,765] INFO [GroupMetadataManager brokerId=0] Finished loading offsets and group metadata from __consumer_offsets-7 in 61 milliseconds, of which 61 milliseconds was spent in the scheduler. (kafka.coordinator.group.GroupMetadataManager)
[2020-08-21 02:20:47,765] INFO [GroupMetadataManager brokerId=0] Finished loading offsets and group metadata from __consumer_offsets-10 in 61 milliseconds, of which 61 milliseconds was spent in the scheduler. (kafka.coordinator.group.GroupMetadataManager)
[2020-08-21 02:20:47,769] INFO Static member MemberMetadata(memberId=consumer-reflectoring-group-2-7-fa7dfa2d-b230-4244-9f79-e42437682c9b, groupInstanceId=Some(null), clientId=consumer-reflectoring-group-2-7, clientHost=/192.168.56.1, sessionTimeoutMs=10000, rebalanceTimeoutMs=300000, supportedProtocols=List(range), ).groupInstanceId of group reflectoring-group-2 loaded with member id consumer-reflectoring-group-2-7-fa7dfa2d-b230-4244-9f79-e42437682c9b at generation 1. (kafka.coordinator.group.GroupMetadata$)
[2020-08-21 02:20:47,773] INFO [GroupCoordinator 0]: Loading group metadata for reflectoring-group-2 with generation 2 (kafka.coordinator.group.GroupCoordinator)
[2020-08-21 02:20:47,773] INFO [GroupMetadataManager brokerId=0] Finished loading offsets and group metadata from __consumer_offsets-13 in 68 milliseconds, of which 61 milliseconds was spent in the scheduler. (kafka.coordinator.group.GroupMetadataManager)
[2020-08-21 02:20:47,774] INFO [GroupMetadataManager brokerId=0] Finished loading offsets and group metadata from __consumer_offsets-16 in 68 milliseconds, of which 68 milliseconds was spent in the scheduler. (kafka.coordinator.group.GroupMetadataManager)
[2020-08-21 02:20:47,775] INFO [GroupMetadataManager brokerId=0] Finished loading offsets and group metadata from __consumer_offsets-19 in 69 milliseconds, of which 69 milliseconds was spent in the scheduler. (kafka.coordinator.group.GroupMetadataManager)
[2020-08-21 02:20:47,775] INFO [GroupMetadataManager brokerId=0] Finished loading offsets and group metadata from __consumer_offsets-2 in 68 milliseconds, of which 68 milliseconds was spent in the scheduler. (kafka.coordinator.group.GroupMetadataManager)
[2020-08-21 02:20:47,776] INFO [GroupMetadataManager brokerId=0] Finished loading offsets and group metadata from __consumer_offsets-5 in 66 milliseconds, of which 66 milliseconds was spent in the scheduler. (kafka.coordinator.group.GroupMetadataManager)
[2020-08-21 02:20:47,776] INFO [GroupMetadataManager brokerId=0] Finished loading offsets and group metadata from __consumer_offsets-8 in 65 milliseconds, of which 65 milliseconds was spent in the scheduler. (kafka.coordinator.group.GroupMetadataManager)
[2020-08-21 02:20:47,777] INFO [GroupMetadataManager brokerId=0] Finished loading offsets and group metadata from __consumer_offsets-11 in 65 milliseconds, of which 65 milliseconds was spent in the scheduler. (kafka.coordinator.group.GroupMetadataManager)
[2020-08-21 02:20:47,777] INFO [GroupMetadataManager brokerId=0] Finished loading offsets and group metadata from __consumer_offsets-14 in 65 milliseconds, of which 65 milliseconds was spent in the scheduler. (kafka.coordinator.group.GroupMetadataManager)
[2020-08-21 02:20:47,778] INFO [GroupMetadataManager brokerId=0] Finished loading offsets and group metadata from __consumer_offsets-17 in 65 milliseconds, of which 65 milliseconds was spent in the scheduler. (kafka.coordinator.group.GroupMetadataManager)
[2020-08-21 02:20:47,778] INFO [GroupMetadataManager brokerId=0] Finished loading offsets and group metadata from __consumer_offsets-20 in 65 milliseconds, of which 65 milliseconds was spent in the scheduler. (kafka.coordinator.group.GroupMetadataManager)
[2020-08-21 02:20:47,779] INFO [GroupMetadataManager brokerId=0] Finished loading offsets and group metadata from __consumer_offsets-23 in 65 milliseconds, of which 65 milliseconds was spent in the scheduler. (kafka.coordinator.group.GroupMetadataManager)
[2020-08-21 02:20:47,779] INFO [GroupMetadataManager brokerId=0] Finished loading offsets and group metadata from __consumer_offsets-26 in 64 milliseconds, of which 64 milliseconds was spent in the scheduler. (kafka.coordinator.group.GroupMetadataManager)
[2020-08-21 02:20:47,780] INFO [GroupMetadataManager brokerId=0] Finished loading offsets and group metadata from __consumer_offsets-29 in 65 milliseconds, of which 65 milliseconds was spent in the scheduler. (kafka.coordinator.group.GroupMetadataManager)
[2020-08-21 02:20:47,780] INFO [GroupMetadataManager brokerId=0] Finished loading offsets and group metadata from __consumer_offsets-32 in 64 milliseconds, of which 64 milliseconds was spent in the scheduler. (kafka.coordinator.group.GroupMetadataManager)
[2020-08-21 02:20:47,781] INFO [GroupMetadataManager brokerId=0] Finished loading offsets and group metadata from __consumer_offsets-35 in 65 milliseconds, of which 65 milliseconds was spent in the scheduler. (kafka.coordinator.group.GroupMetadataManager)
[2020-08-21 02:20:47,786] INFO [GroupMetadataManager brokerId=0] Finished loading offsets and group metadata from __consumer_offsets-38 in 68 milliseconds, of which 68 milliseconds was spent in the scheduler. (kafka.coordinator.group.GroupMetadataManager)
[2020-08-21 02:20:47,786] INFO [GroupMetadataManager brokerId=0] Finished loading offsets and group metadata from __consumer_offsets-0 in 69 milliseconds, of which 69 milliseconds was spent in the scheduler. (kafka.coordinator.group.GroupMetadataManager)
[2020-08-21 02:20:47,787] INFO [GroupMetadataManager brokerId=0] Finished loading offsets and group metadata from __consumer_offsets-6 in 69 milliseconds, of which 69 milliseconds was spent in the scheduler. (kafka.coordinator.group.GroupMetadataManager)
[2020-08-21 02:20:47,787] INFO [GroupMetadataManager brokerId=0] Finished loading offsets and group metadata from __consumer_offsets-9 in 68 milliseconds, of which 68 milliseconds was spent in the scheduler. (kafka.coordinator.group.GroupMetadataManager)
[2020-08-21 02:20:47,792] INFO [GroupCoordinator 0]: Loading group metadata for reflectoring-group-3 with generation 0 (kafka.coordinator.group.GroupCoordinator)
[2020-08-21 02:20:47,793] INFO [GroupMetadataManager brokerId=0] Finished loading offsets and group metadata from __consumer_offsets-12 in 69 milliseconds, of which 65 milliseconds was spent in the scheduler. (kafka.coordinator.group.GroupMetadataManager)
[2020-08-21 02:20:47,796] INFO [GroupMetadataManager brokerId=0] Finished loading offsets and group metadata from __consumer_offsets-15 in 72 milliseconds, of which 71 milliseconds was spent in the scheduler. (kafka.coordinator.group.GroupMetadataManager)
[2020-08-21 02:20:47,796] INFO [GroupMetadataManager brokerId=0] Finished loading offsets and group metadata from __consumer_offsets-18 in 72 milliseconds, of which 72 milliseconds was spent in the scheduler. (kafka.coordinator.group.GroupMetadataManager)
[2020-08-21 02:20:47,797] INFO [GroupMetadataManager brokerId=0] Finished loading offsets and group metadata from __consumer_offsets-24 in 72 milliseconds, of which 72 milliseconds was spent in the scheduler. (kafka.coordinator.group.GroupMetadataManager)
[2020-08-21 02:20:47,797] INFO [GroupMetadataManager brokerId=0] Finished loading offsets and group metadata from __consumer_offsets-27 in 72 milliseconds, of which 72 milliseconds was spent in the scheduler. (kafka.coordinator.group.GroupMetadataManager)
[2020-08-21 02:20:47,798] INFO [GroupMetadataManager brokerId=0] Finished loading offsets and group metadata from __consumer_offsets-30 in 72 milliseconds, of which 72 milliseconds was spent in the scheduler. (kafka.coordinator.group.GroupMetadataManager)
[2020-08-21 02:20:47,798] INFO [GroupMetadataManager brokerId=0] Finished loading offsets and group metadata from __consumer_offsets-33 in 71 milliseconds, of which 71 milliseconds was spent in the scheduler. (kafka.coordinator.group.GroupMetadataManager)
[2020-08-21 02:20:47,799] INFO [GroupMetadataManager brokerId=0] Finished loading offsets and group metadata from __consumer_offsets-36 in 72 milliseconds, of which 72 milliseconds was spent in the scheduler. (kafka.coordinator.group.GroupMetadataManager)
[2020-08-21 02:20:47,800] INFO [GroupMetadataManager brokerId=0] Finished loading offsets and group metadata from __consumer_offsets-39 in 72 milliseconds, of which 72 milliseconds was spent in the scheduler. (kafka.coordinator.group.GroupMetadataManager)
[2020-08-21 02:20:47,800] INFO [GroupMetadataManager brokerId=0] Finished loading offsets and group metadata from __consumer_offsets-42 in 71 milliseconds, of which 71 milliseconds was spent in the scheduler. (kafka.coordinator.group.GroupMetadataManager)
[2020-08-21 02:20:47,801] INFO [GroupMetadataManager brokerId=0] Finished loading offsets and group metadata from __consumer_offsets-45 in 72 milliseconds, of which 72 milliseconds was spent in the scheduler. (kafka.coordinator.group.GroupMetadataManager)
[2020-08-21 02:20:47,801] INFO [GroupMetadataManager brokerId=0] Finished loading offsets and group metadata from __consumer_offsets-48 in 71 milliseconds, of which 71 milliseconds was spent in the scheduler. (kafka.coordinator.group.GroupMetadataManager)
[2020-08-21 02:20:47,802] INFO [GroupMetadataManager brokerId=0] Finished loading offsets and group metadata from __consumer_offsets-21 in 71 milliseconds, of which 71 milliseconds was spent in the scheduler. (kafka.coordinator.group.GroupMetadataManager)
[2020-08-21 02:20:47,803] INFO [GroupMetadataManager brokerId=0] Finished loading offsets and group metadata from __consumer_offsets-3 in 72 milliseconds, of which 72 milliseconds was spent in the scheduler. (kafka.coordinator.group.GroupMetadataManager)
[2020-08-21 02:21:33,722] INFO Creating topic users-log with configuration {} and initial partition assignment Map(0 -> ArrayBuffer(0)) (kafka.zk.AdminZkClient)
[2020-08-21 02:21:33,722] INFO Creating topic test with configuration {} and initial partition assignment Map(0 -> ArrayBuffer(0)) (kafka.zk.AdminZkClient)
[2020-08-21 02:21:33,752] INFO [KafkaApi-0] Auto creation of topic users-log with 1 partitions and replication factor 1 is successful (kafka.server.KafkaApis)
[2020-08-21 02:21:33,752] INFO [KafkaApi-0] Auto creation of topic test with 1 partitions and replication factor 1 is successful (kafka.server.KafkaApis)
[2020-08-21 02:21:33,806] INFO [ReplicaFetcherManager on broker 0] Removed fetcher for partitions Set(test-0, users-log-0) (kafka.server.ReplicaFetcherManager)
[2020-08-21 02:21:33,818] INFO [Log partition=test-0, dir=C:\kafka_2.12-2.6.0\kafka-test-logs] Loading producer state till offset 0 with message format version 2 (kafka.log.Log)
[2020-08-21 02:21:33,826] INFO Created log for partition test-0 in C:\kafka_2.12-2.6.0\kafka-test-logs\test-0 with properties {compression.type -> producer, message.downconversion.enable -> true, min.insync.replicas -> 1, segment.jitter.ms -> 0, cleanup.policy -> [delete], flush.ms -> 9223372036854775807, segment.bytes -> 1073741824, retention.ms -> 604800000, flush.messages -> 9223372036854775807, message.format.version -> 2.6-IV0, file.delete.delay.ms -> 60000, max.compaction.lag.ms -> 9223372036854775807, max.message.bytes -> 1048588, min.compaction.lag.ms -> 0, message.timestamp.type -> CreateTime, preallocate -> false, min.cleanable.dirty.ratio -> 0.5, index.interval.bytes -> 4096, unclean.leader.election.enable -> false, retention.bytes -> -1, delete.retention.ms -> 86400000, segment.ms -> 604800000, message.timestamp.difference.max.ms -> 9223372036854775807, segment.index.bytes -> 10485760}. (kafka.log.LogManager)
[2020-08-21 02:21:33,828] INFO [GroupCoordinator 0]: Preparing to rebalance group group_id in state PreparingRebalance with old generation 0 (__consumer_offsets-13) (reason: Adding new member consumer-group_id-2-9d7516d5-402d-4a3d-8912-99cc8844b383 with group instance id None) (kafka.coordinator.group.GroupCoordinator)
[2020-08-21 02:21:33,829] INFO [Partition test-0 broker=0] No checkpointed highwatermark is found for partition test-0 (kafka.cluster.Partition)
[2020-08-21 02:21:33,830] INFO [Partition test-0 broker=0] Log loaded for partition test-0 with initial high watermark 0 (kafka.cluster.Partition)
[2020-08-21 02:21:33,840] INFO [GroupCoordinator 0]: Stabilized group group_id generation 1 (__consumer_offsets-13) (kafka.coordinator.group.GroupCoordinator)
[2020-08-21 02:21:33,849] INFO [Log partition=users-log-0, dir=C:\kafka_2.12-2.6.0\kafka-test-logs] Loading producer state till offset 0 with message format version 2 (kafka.log.Log)
[2020-08-21 02:21:33,854] INFO Created log for partition users-log-0 in C:\kafka_2.12-2.6.0\kafka-test-logs\users-log-0 with properties {compression.type -> producer, message.downconversion.enable -> true, min.insync.replicas -> 1, segment.jitter.ms -> 0, cleanup.policy -> [delete], flush.ms -> 9223372036854775807, segment.bytes -> 1073741824, retention.ms -> 604800000, flush.messages -> 9223372036854775807, message.format.version -> 2.6-IV0, file.delete.delay.ms -> 60000, max.compaction.lag.ms -> 9223372036854775807, max.message.bytes -> 1048588, min.compaction.lag.ms -> 0, message.timestamp.type -> CreateTime, preallocate -> false, min.cleanable.dirty.ratio -> 0.5, index.interval.bytes -> 4096, unclean.leader.election.enable -> false, retention.bytes -> -1, delete.retention.ms -> 86400000, segment.ms -> 604800000, message.timestamp.difference.max.ms -> 9223372036854775807, segment.index.bytes -> 10485760}. (kafka.log.LogManager)
[2020-08-21 02:21:33,855] INFO [Partition users-log-0 broker=0] No checkpointed highwatermark is found for partition users-log-0 (kafka.cluster.Partition)
[2020-08-21 02:21:33,856] INFO [Partition users-log-0 broker=0] Log loaded for partition users-log-0 with initial high watermark 0 (kafka.cluster.Partition)
[2020-08-21 02:21:33,873] INFO [GroupCoordinator 0]: Assignment received from leader for group group_id for generation 1 (kafka.coordinator.group.GroupCoordinator)
[2020-08-21 02:21:33,974] INFO [GroupCoordinator 0]: Preparing to rebalance group group_id in state PreparingRebalance with old generation 1 (__consumer_offsets-13) (reason: Updating metadata for member consumer-group_id-2-9d7516d5-402d-4a3d-8912-99cc8844b383) (kafka.coordinator.group.GroupCoordinator)
[2020-08-21 02:21:36,962] INFO [GroupCoordinator 0]: Stabilized group group_id generation 2 (__consumer_offsets-13) (kafka.coordinator.group.GroupCoordinator)
[2020-08-21 02:21:36,972] INFO [GroupCoordinator 0]: Assignment received from leader for group group_id for generation 2 (kafka.coordinator.group.GroupCoordinator)
