## 快速开始
1. 引入pom
```xml
<dependency>
    <groupId>com.wd.starter</groupId>
    <artifactId>swagger-spring-boot-starter</artifactId>
    <version>3.0.0-SNAPSHOT</version>
</dependency>
```

2. 在application.yml 中加入如下配置
```yml
swagger:
  host: ${swaggerHost:}
  enabled: ${swaggerEnable:true}
```

3. 添加`@EnableSwagger2Doc`注解
```java
@EnableSwagger2Doc
@SpringBootApplication
public class XxxApplication {
    public static void main(String[] args) {
        SpringApplication.run(XxxApplication.class, args);
    }
}
```

参考：https://github.com/SpringForAll/spring-boot-starter-swagger
