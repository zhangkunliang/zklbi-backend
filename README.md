## 需求分析
    1.智能分析:用户输入目标和原始数据(图表类型)，可以自动生成图表和分析结论
    2.图表管理
    3.图表生成的异步化(消息队列)
    4.对接 AI 能力
## 架构图
- 基础流程
  ![在这里插入图片描述](https://img-blog.csdnimg.cn/direct/f96b44fc61824437beba1abb692e4d8f.png)

- 优化流程（异步化）
  ![在这里插入图片描述](https://img-blog.csdnimg.cn/direct/eee336a4095b4a709a551bd9029dfc48.png)

## 技术栈
### 前端
1. React
2. Umi + Ant Design Pro
3. 可视化开发库( Echarts + HighCharts + AntV)
4. umi openapi 代码生成(自动生成后端调用代码)
### 后端
1. Spring Boot(万用 Java 后端项目模板，快速搭建基础框架，避免重复写代码)
2. MySQL 数据库
3. MyBatis Plus 数据访问框架
4. 消息队列(RabbitMQ)
5. AI 能力(Open Al 接口开发/星球提供现成的 AI 接口)
6. Excel 的上传和数据的解析(Easy Excel)
7. Swagger + Knife4j 项目接囗文档
8. Hutool 工具库
## 智能分析业务开发
### 业务流程
1.用户输入

    i.分析目标
    ii.上传原始数据(excel)
    iii. 更精细话地控制图表:比如图表类型、图表名称等
2.后端校验

    i.校验用户的输入是否合法(比如长度)
    ii.成本控制(次数统计和校验、鉴权等)
3.把处理后的数据输入给 A 模型(调用 AI 接口，星球内部同学可以免费使用 A 接口)，让 A 模型给我们提供图表信息、结论文本

4.图表信息(是一段 json 配置，是一段代码)、结论文本在前端进行展示
### 开发接口
根据用户的输入（文本和文件），最后返回图表信息和结论文本
   
   
   
   


   
