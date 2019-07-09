# MongoDB与JAVA集成
## 实体类
- @Document(collection="")  
此注解使用在类上，用来指定所对应的mongo集合
## 分页
- mongo分页String类型的skip和limit就可以
- mysql分页必须要Int类型的skip和limit就可以
## mongodb与JAVA集成是，执行insert操作时，mongodb自动生成的ID会在insert之前由驱动建立存在对象中，对象.getId就可以获得insert数据生成的唯一ID