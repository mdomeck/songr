## songr

- Once you clone the repo...
- windows machine sudo service postgresql start
- update application properties with your username, password
- `./gradlew bootRun` in the terminal to run app
- Then go to localhost:8080
- localhost:8080/capitalize/hello
- localhost:8080/album

 
 #### dependencies
 - This dependency is used by the application.
      
       	implementation 'org.springframework.boot:spring-boot-starter-thymeleaf'
       	implementation 'org.springframework.boot:spring-boot-starter-web'
       	developmentOnly 'org.springframework.boot:spring-boot-devtools'
       	testImplementation('org.springframework.boot:spring-boot-starter-test'
   
 - Use JUnit test framework
       
       testImplementation 'junit:junit:4.12'
        
       
#### functionality

- Spring App that will load hello world on home page. 
- Will capitalize on /capitalize route
- localhost:8080/album has 3 albums listed.