# 使用MQ有什么优缺点
## 系统可用性降低

大家想想一下，上面的说解耦的场景，本来A系统的哥们要把系统关键数据发送给BC系统的，现在突然加入了一个MQ了，现在BC系统接收数据要通过MQ来接收。

但是大家有没有考虑过一个问题，万一MQ挂了怎么办？这就引出一个问题，加入了MQ之后，系统的可用性是不是就降低了？

因为多了一个风险因素：MQ可能会挂掉。只要MQ挂了，数据没了，系统运行就不对了。

## 系统复杂度提高

本来我的系统通过接口调用一下就能完事的，但是加入一个MQ之后，需要考虑消息重复消费、消息丢失、甚至消息顺序性的问题

为了解决这些问题，又需要引入很多复杂的机制，这样一来是不是系统的复杂度提高了。

## 数据一致性问题

本来好好的，A系统调用BC系统接口，如果BC系统出错了，会抛出异常，返回给A系统让A系统知道，这样的话就可以做回滚操作了

但是使用了MQ之后，A系统发送完消息就完事了，认为成功了。而刚好C系统写数据库的时候失败了，但是A认为C已经成功了？这样一来数据就不一致了。

通过分析引入MQ的优缺点之后，就明白了使用MQ有很多优点，但是会发现它带来的缺点又会需要你做各种额外的系统设计来弥补

最后你可能会发现整个系统复杂了好几倍，所以设计系统的时候要基于这些考虑做出取舍，很多时候你会发现该用的还是要用的。。。

