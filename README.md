# springboot-redis
### redis安装
> brew install reids </br>
reids-server </br>
redis-cli

### pom.xml文件中添加依赖
```
<dependency>
  <groupId>org.springframework.boot</groupId>
  <artifactId>spring-boot-starter-data-redis</artifactId>
</dependency>
```

### application.yml中加上Redis数据源配置
```
  spring: 
  redis:
      host: localhost
      port:6379       
      password:      
      database: 1     
      pool:           
        max-active :8 
        max-wait: -1  
        max-idle: 500 
```

### 创建RedisDao类，通过@Repository注解注入Spring Ioc容器，通过RedisTemplate来访问Redis
