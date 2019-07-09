# MyBatis官方文档 version 3.2.1
## 从XML中构建SqlSessionFactory
- 每个基于MyBaatis的应用都是以一个SqlSessionFactory的实例为核心的。SqlSessionFactory的实例可以通过SqlSessionFactoryBuilder获得。而SqlSessionFactoryBuilder则可以从XML配置文件或一个预先定制的Configuration的实例构建出SqlSessionFactory的实例.
- 从XML文件中构建SqlSessionFactroy的实例非常简单，建议使用类路径下的资源文件进行配置。但是也可以使用任意的输入流（InputStream）实例，包括字符串形式的文件路径胡总和"file://"的URL形式的文件路径来配置。MyBatis包含一个叫做Resources的工具类，它包含一些实用方法，可使从classpath或其他位置加载资源文件更加容易。
```
string resource = "org/mybatis/example/mybatis-config.xml";
InputString inputStream = Resources.getResourecesAsStream(resource);
SqlSessionFactory sqlsessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
```
- XML配置文件包含了对MyBatis系统的核心设置，包含获取数据库连接实例的数据源（DataSource）和决定事务作用域和控制方法的事务管理器（TransactionManger）。XML配置文件的示例如下：
```
<?xml version="1.0" encoding="UTF-8" ?>
<!DOCTYPE configuration
    PUBLIC "-//mybatis.org//DTD Config 3.0//EN"
    "http://mybatis.org/dtd/mybatis-3-config.dtd">

```