ch7-spring-mybatis

步骤：
1.新建Maven项目
2.加入Maven依赖：
    1）spring依赖
    2）mybatis依赖
    3）mysql驱动
    4）spring的事务依赖
    5）mybatis和spring集成依赖：mybatis官方体用的，用来在spring项目中创建mybatis的SqlSessionFactory， dao对象的
3. 创建实体类
4. 创建dao接口和mapper文件
5. 创建mybatis主配置文件
6. 创建Service接口和实现类，属性是Dao
7. 创建spring的配置文件：声明mybatis的对象交给spring创建
    1）数据源DataSource
    2）SqlSessionFactory
    3）Dao对象
    4）声明自定义的service
8. 创建测试类，获取Service对象，通过service调用dao完成数据库访问
