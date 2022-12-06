package org.yd.pojo;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * 包含所有表中共有的公共字段
 * 作为所有实体类的基类存在
 */
@Data
public class Base implements Serializable {
    private String createdUser; //日志-创建人
    private Date createdTime; //日志-创建时间
    private String modifiedUser; //日志-最后修改执行人
    private Date modifiedTime; //日志-最后修改时间
}
