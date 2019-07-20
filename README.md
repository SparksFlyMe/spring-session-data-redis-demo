# spring-session-data-redis-demo
利用springboot、redis实现session共享

在这里在模拟session共享时，同时开启了两个项目，不同端口（通过两个配置文件），来模拟多台服务器。访问多个服务器（即不同端口），然后都是可以从session中获取到值
