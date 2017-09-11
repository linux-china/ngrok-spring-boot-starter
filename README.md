ngrok-spring-boot-start
=========================
Spring boot starter ngrok。

### Usage

* Start local ngrok tunnels ： ngrok start --none

* Add ngrok-spring-boot-starter in your pom.xml:
```xml
          <dependency>
                     <groupId>com.mvnsearch.spring.boot</groupId>
                     <artifactId>ngrok-boot-starter</artifactId>
                     <version>1.0.0-SNAPSHOT</version>
          </dependency>
```
* Open http://localhost:8080/ngrok to get ngrok public url or get url from Spring Boot console. 

### Functions

* ngrok web inspection: http://localhost:4040
* Inspecting your traffic
* Replaying requests

### how it works

The starter to operate ngrok via API(http://127.0.0.1:4040/api/)

### References

* ngrok: https://ngrok.com/

