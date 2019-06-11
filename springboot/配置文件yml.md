# springboot配置文件
## MYSQL数据库连接  
```
spring:
  datasource:
    url: jdbc:mysql://localhost:3306/test1?serverTimezone=UTC&characterEncoding=utf8&useUnicode=true&useSSL=false
    username: root
    password: malei123
    driver-class-name: com.mysql.cj.jdbc.Driver
```
- serverTimezone=UTC  
高版本的mysql需要手动设置时区
- characterEncoding=utf8  
告诉数据库此次连接传输UTF8数据，项目为UTF8 数据库为其他编码，在持久化时会把项目UTF8的数据转换为数据库存储的格式；从数据库取数据同理。项目和数据库都为UTF8的话，可以不写
- useUnicode=true  
首先useUnicode=true是默认值，其次如果指定useUnicode=false，那么就会使用服务端变量character-set-server所指定的值。  
[1] <https://blog.csdn.net/weixin_34357436/article/details/86356920>  
[2] <https://blog.csdn.net/weixin_34414196/article/details/86323378>
- useSSL=false  
就是使用JDBC跟你的数据库连接的时候，你的JDBC版本与MySQL版本不兼容，MySQL的版本更高一些，在连接语句后加上“useSSL=‘true’” ，就可以连接到数据库了。更高版本。

