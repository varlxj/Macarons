# 关于Macarons
刚好在看groovy，想到平时经常有些小项目，需要快速完成，对于性能，扩展之类要求不高，也不想用那些大块头的框架，借着学习Groovy的机会，写一个小小的半成品平台，把常用的平台功能完成，需要时填充一些专用功能就能完成了。至于为什么叫Macarons，仅仅是因为我觉得比较好吃而已...

# 为什么用groovy
灵活，编码速度快，从JAVA转groovy学习成本低，groovy编译好了还是JAVA

# 环境
* JDK 8
* Eclipse Mars
* Groovy 2.4
* Maven 3.3.3

# Eclipse下的Groovy支持
如果不需要Eclipse支持的话，在pom文件中，已经加入了groovy的编译插件支持，通过mvn install可以直接生成项目

建议查看[官方IDE支持](http://www.groovy-lang.org/ides.html)

1. 安装[Groovy/Grails Tool Suite](http://spring.io/tools) 非必须，但推荐安装
2. 安装[groovy-eclipse](https://github.com/groovy/groovy-eclipse)，页面中有具体介绍，在线安装地址见[wiki](https://github.com/groovy/groovy-eclipse/wiki)

安装速度都比较慢，电信用户比较容易失败，没有VPN之类的，建议早晨安装，否则做好蛋疼的准备

## 改用IDEA了
IDEA对Groovy的支持相当的好，不用折腾
