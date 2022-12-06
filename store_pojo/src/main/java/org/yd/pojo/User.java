package org.yd.pojo;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.stereotype.Component;

/**
 * 用户实体类
 * 表结构如下：
 * CREATE TABLE t_user (
 * 	uid INT AUTO_INCREMENT COMMENT '用户id',
 * 	username VARCHAR(20) NOT NULL UNIQUE COMMENT '用户名',
 * 	password CHAR(32) NOT NULL COMMENT '密码',
 * 	salt CHAR(36) COMMENT '盐值',
 * 	phone VARCHAR(20) COMMENT '电话号码',
 * 	email VARCHAR(30) COMMENT '电子邮箱',
 * 	gender INT COMMENT '性别:0-女，1-男',
 * 	avatar VARCHAR(50) COMMENT '头像',
 * 	is_delete INT COMMENT '是否删除：0-未删除，1-已删除',
 * 	created_user VARCHAR(20) COMMENT '日志-创建人',
 * 	created_time DATETIME COMMENT '日志-创建时间',
 * 	modified_user VARCHAR(20) COMMENT '日志-最后修改执行人',
 * 	modified_time DATETIME COMMENT '日志-最后修改时间',
 * 	PRIMARY KEY (uid)
 * ) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
 */
@Data
@EqualsAndHashCode(callSuper = true)
@TableName("t_user")
public class User extends Base {

    @TableId
    private Integer uid; //用户id
    private String username; //用户名
    private String password; //密码
    private String salt; //盐值
    private String phone; //电话号码
    private String email; //电子邮箱
    private Integer gender; //性别:0-女，1-男
    private String avatar; //头像
    private Integer isDelete; //是否删除：0-未删除，1-已删除
}
