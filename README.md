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

-




