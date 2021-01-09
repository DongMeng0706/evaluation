# evaluation

学生课程评价系统

# 环境搭建
> Mysql+IDEA+springboot+前端layui

> 运行环境使用谷歌浏览器


# 效果图

https://note.youdao.com/ynoteshare1/index.html?id=9cbb766dd957fb39885e3647ebd3af40&type=note

#### 介绍
学生课程评价系统
1.  管理员
2.  老师
3.  学生

#### 软件架构(springboot)
```properties
#server.servlet.path=/evaluation
server.port=8080
# 数据源配置#
spring.datasource.url=jdbc:mysql://localhost:3306/tea_design?useUnicode=true&characterEncoding=UTF-8&serverTimezone=GMT%2B8&useSSL=false
spring.datasource.hikari.username=root
spring.datasource.hikari.password=root
spring.datasource.driver-class-name=com.mysql.jdbc.Driver
spring.datasource.type=com.zaxxer.hikari.HikariDataSource
# mybatis配置
mybatis.type-aliases-package=com.evaluation.entity
mybatis.mapper-locations=classpath*:mappers/*.xml
mybatis.configuration.log-impl=org.apache.ibatis.logging.stdout.StdOutImpl
# freemarker页面配置
spring.mvc.static-path-pattern=/static/**
spring.freemarker.cache=false
spring.freemarker.suffix=.html
spring.freemarker.charset=utf-8
spring.freemarker.check-template-location=true
spring.freemarker.content-type=text/html
spring.freemarker.expose-request-attributes=false
spring.freemarker.expose-session-attributes=false
spring.freemarker.request-context-attribute=request
# 下面这句不加的话http://localhost:8080/swagger-ui.html访问报错404
spring.resources.static-locations=classpath:/static/
# swagger
#swagger.base-package=com.jason.layout
#logging.level.root=debug
#spring.redis.host=39.108.187.144
#spring.redis.port=6379

#spring.devtools.restart.enabled=true
#spring.devtools.restart.exclude=static/**,public/**
#spring.devtools.restart.additional-paths=src/main/java



```

#### 安装教程

```
1、msyql安装：
这里推荐使用phpstudy一键式安装，下载地址：http://phpstudy.php.cn/，否则对于初学者来说安装mysql可能会比较棘手。
之后安装mysql客户端，（客户端记得安装到最后一步的时候去掉其他插件（qq浏览器之类的）安装）。
       
2、maven下载配置
maven下载链接：http://maven.apache.org/download.cgi 
  
解压后修改下maven镜像配置：maven目录-->conf-->settings.xml
加入阿里镜像
  <mirror>
        <id>alimaven</id>
        <name>aliyun maven</name>
        <url>http://maven.aliyun.com/nexus/content/groups/public/</url>
        <mirrorOf>central</mirrorOf>        
      </mirror>
  
3. idea下载（这边建议使用idea，反正你迟早也会接触到）
idea企业版2018.1.4
链接: https://pan.baidu.com/s/1oRw0i1daOmFJ2Qosd3bf6g 密码: xsm2
idea企业版破解license server：http://idea.congm.in/ 或 http://idea.toocruel.net/
```
#### 使用说明

1. 管理员可查看全部......
2. 老师....
