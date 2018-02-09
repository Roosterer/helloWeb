# helloWeb
项目描述：用于普通web项目的基础测试，不包含其它web框架
git地址：https://github.com/Roosterer/helloWeb.git

#### 关于工程目录结构

1. src/main/java和src/main/resources都会被编译到WEB-INF/classes下。
2. 和WEB-INF平级文件夹pages放置静态页面，可直接通过浏览器访问。
3. WEB-INF下放置的静态页面不能被浏览器直接访问，只能通过内部跳转。
4. 访问localhost:8080，web.xml没有配置默认页面，默认页面在ROOT根目录下，只能是index.html/index.jsp，其它名称加载不到。


#### 关于web.xml中元素加载顺序

参考：http://www.cnblogs.com/hafiz/p/5715349.html


#### 关于web.xml中元素种类

参考：http://blog.csdn.net/youngstar70/article/details/64534388


#### 我的测试

- 应用参数和初始化参数传入和获取，容器启动即加载实例。

- servlet生命周期，参考：http://www.runoob.com/servlet/servlet-life-cycle.html

- 监听器，过滤器，拦截器区别及使用场景，参考：http://blog.csdn.net/Jintao_Ma/article/details/52972482

把整个项目的流程比作一条河，那么监听器的作用就是能够听到河流里的所有声音，过滤器就是能够过滤出其中的鱼，而拦截器则是拦截其中的部分鱼，并且作标记。
所以当需要监听到项目中的一些信息，并且不需要对流程做更改时，用监听器；
当需要过滤掉其中的部分信息，只留一部分时，就用过滤器；
当需要对其流程进行更改，做相关的记录时用拦截器。

- 监听器：listene域对象中属性的变更的事件监听器就是用来监听 ServletContext, HttpSession, HttpServletRequest 这三个对象中的属性变更信息事件的监听器。
这三个监听器接口分别是ServletContextAttributeListener, HttpSessionAttributeListener 和ServletRequestAttributeListener。

- session和application中存储key value使用场景不同，session针对于浏览器，有过期时间。A浏览器存储一个session，B浏览器获取不到这个key。但application不限制浏览器和时间。

- Servlet 规范中定义了两个特殊的监听器接口"HttpSessionBindingListener和HttpSessionActivationListener"来帮助JavaBean 对象了解自己在Session域中的这些状态 ，实现这两个接口的类不需要 web.xml 文件中进行注册。
实现了HttpSessionBindingListener接口的JavaBean对象可以感知自己被绑定到Session中和 Session中删除的事件
实现了HttpSessionActivationListener接口的JavaBean对象可以感知自己被活化(反序列化)和钝化(序列化)的事件

- 过滤器：详细参考http://blog.csdn.net/dzy21/article/details/51991109

- 过滤器需要实现Filter接口，并在web.xml中配置要过滤的请求路径。

- web.xml中并没有关于拦截器的定义，因为一般拦截器和过滤器都能实现过滤和修改操作，所以可以通用。spring mvc中提供了拦截器的定义。