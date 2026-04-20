# Task 16: API Gateway Configuration (Spring Cloud Gateway)

## application.yml (API Gateway)
```yaml
server:
  port: 8080

spring:
  cloud:
    gateway:
      routes:
        - id: student-service
          uri: lb://STUDENT-SERVICE
          predicates:
            - Path=/students/**
        - id: academic-service
          uri: lb://ACADEMIC-SERVICE
          predicates:
            - Path=/academic/**

eureka:
  client:
    service-url:
      defaultZone: http://localhost:8761/eureka/
```
