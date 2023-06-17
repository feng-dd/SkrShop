package com.murphy.skrshop.common.core.entity;

import java.io.Serializable;

/**
 * @Description:实体基类
 *  阿里java开发手册：【强制】表必备三字段：id, create_time, update_time。
 *  说明：
 *  其中 id 必为主键，类型为 bigint unsigned、单表时自增、步长为 1。
 *  create_time, update_time 的类型均为 datetime 类型，前者现在时表示主动式创建，后者过去分词表示被动式更新。
 * @Author:murphy
 * @Date:2023/6/15
 **/
public class BaseEntity implements Serializable {
    /**
     * 创建时间
     */
    private Integer createAt;

    /**
     * 更新时间
     */
    private Integer updateAt;

    public Integer getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Integer createAt) {
        this.createAt = createAt;
    }

    public Integer getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(Integer updateAt) {
        this.updateAt = updateAt;
    }

    @Override
    public String toString() {
        return "BaseEntity{" +
                "createAt=" + createAt +
                ", updateAt=" + updateAt +
                '}';
    }
}
