//******  Controller  ***********************************

   @GetMapping("/users")
    public ResponseEntity<List<User>> getAllUsers() {
        return ResponseEntity.ok().body(userService.getUsers());
    }

    @GetMapping("/users/{id}")
    public ResponseEntity<User> getUserByIdPathVar(@PathVariable String id) {
        return ResponseEntity.ok().body(userService.getUserById(id));

    }

    @PostMapping("/users")
    public ResponseEntity<User> createUser(@RequestBody User user) {
        return ResponseEntity.ok(userService.saveUser(user));
    }
	
//********  Service  ***********************************

    public void deleteStudentById(String id) {
        findStudentById(id)
                .ifPresentOrElse(s -> {
                    System.out.println("Student deleted: " + s.getId());
                    repository.deleteById(id);
                }, () -> {
                    System.out.println("Student does not exist with id: " + id);
                });
    }
	
	    public User getUserById(String id) {
        return userRepository.findById(id)
            .orElseThrow(() -> new RuntimeException("No user by ID: " + id));
    }
	
//******************   Mongo  **********************************************************************
mongodb can be installed on local computer or with docker-compose
1. docker-compose (from /mongo/demo example:
//--

version:  "3.8"
services:
  mongodb:
    image:  mongo
    container_name: mongodb
    ports:
      - 27017:27017
    volumes:
      - data:/data
    environment:
      - MONGO_INITDB_ROOT_USERNAME=rootuser
      - MONGO_INITDB_ROOT_PASSWORD=rootpass
  mongo-express:
    image: mongo-express
    container_name: mongo-express
    restart: always
    ports:
      - 8088:8081
    environment:
      - ME_CONFIG_MONGODB_ADMINUSERNAME=rootuser
      - ME_CONFIG_MONGODB_ADMINPASSWORD=rootpass
      - ME_CONFIG_MONGODB_SERVER=mongodb
volumes:
  data: {}

networks:
  default:
    name: mongodb_network

//--

2. # Settings for mongodb in application.properties
3. Note - there is mongo-express: http://localhost:27017
	or
	MongoDbCompass sw tool: connect with properties as above
	
	NOTE: While creating dbase you have to create name collection. Dbase cannot be created without it.
	go to dir wth docker-compose.yaml file:
	
4. $ docker compose up

# Settings for mongodb running 
server.port=8080
spring.data.mongodb.host=localhost
spring.data.mongodb.database=api
spring.data.mongodb.port=27017

spring.data.mongodb.authentication-database=admin
spring.data.mongodb.username=rootuser
spring.data.mongodb.password=rootpass