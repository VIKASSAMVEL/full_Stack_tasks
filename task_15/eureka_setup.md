# Task 15: Service Registry (Eureka Server) Config

## application.yml (Eureka Server)
```yaml
server:
  port: 8761

eureka:
  client:
    register-with-eureka: false # Don't register itself
    fetch-registry: false
  server:
    wait-time-in-ms-when-sync-empty: 0
```

## Enable Eureka Server (Java)
```java
@SpringBootApplication
@EnableEurekaServer
public class RegistryServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(RegistryServerApplication.class, args);
    }
}
```
