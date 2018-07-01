<h2>swagger简介</h2>
    swagger确实是个好东西，可以跟据业务代码自动生成相关的api接口文档，尤其用于restful风格中的项目，开发人员几乎可以不用专门去维护rest api，这个框架可以自动为你的业务代码生成restfut风格的api，而且还提供相应的测试界面，自动显示json格式的响应。大大方便了后台开发人员与前端的沟通与联调成本。

<h2>springfox-swagger简介</h2>
    签于swagger的强大功能，java开源界大牛spring框架迅速跟上，它充分利用自已的优势，把swagger集成到自己的项目里，整了一个spring-swagger，后来便演变成springfox。springfox本身只是利用自身的aop的特点，通过plug的方式把swagger集成了进来，它本身对业务api的生成，还是依靠swagger来实现。

<h2>springfox大致原理</h2>
    springfox的大致原理就是，在项目启动的过种中，spring上下文在初始化的过程，框架自动跟据配置加载一些swagger相关的bean到当前的上下文中，并自动扫描系统中可能需要生成api文档那些类，并生成相应的信息缓存起来。如果项目MVC控制层用的是springMvc那么会自动扫描所有Controller类，跟据这些Controller类中的方法生成相应的api文档。
