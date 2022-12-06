# Store

一个使用SpringBoot框架开发的商店系统

## 项目分析

1. 项目功能：登录、注册、热销商品、用户管理(密码、个人信息、头像、收获地址)、购物车(展示、添加、删除)、订单模块
2. 开发顺序：注册、登录、用户管理、购物车、商品、订单模块。
3. 某一个模块的开发：
    1. 持久层开发：依据前端页面设计规划相关的SQL语句，以及进行配置
    2. 业务层开发：核心功能控制、业务操作以及异常处理
    3. 控制层开发：接收请求、处理响应
    4. 前端开发：JS、Query、AJAX这些技术连接后台

## 项目环境

1. JDK：1.8以及以上版本
2. maven：3.6.1版本以上
3. 数据库：MySQL，5.1及以上版本
4. 开发平台：idea

## 项目结构

* 本项目使用多模块结构进行开发，具体划分如下：
  * store_pojo：实体类
  * store_dao：持久层
  * store_service：业务层
  * store_web：控制层以及前端代码

## 数据库表结构

### 用户表

```SQL
CREATE TABLE t_user (
	uid INT AUTO_INCREMENT COMMENT '用户id',
	username VARCHAR(20) NOT NULL UNIQUE COMMENT '用户名',
	password CHAR(32) NOT NULL COMMENT '密码',
	salt CHAR(36) COMMENT '盐值',
	phone VARCHAR(20) COMMENT '电话号码',
	email VARCHAR(30) COMMENT '电子邮箱',
	gender INT COMMENT '性别:0-女，1-男',
	avatar VARCHAR(50) COMMENT '头像',
	is_delete INT COMMENT '是否删除：0-未删除，1-已删除',
	created_user VARCHAR(20) COMMENT '日志-创建人',
	created_time DATETIME COMMENT '日志-创建时间',
	modified_user VARCHAR(20) COMMENT '日志-最后修改执行人',
	modified_time DATETIME COMMENT '日志-最后修改时间',
	PRIMARY KEY (uid)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
```