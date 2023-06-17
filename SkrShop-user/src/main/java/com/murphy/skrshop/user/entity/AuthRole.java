package com.murphy.skrshop.user.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;

/**
 * <p>
 * 员工角色
 * </p>
 *
 * @author murphy
 * @since 2023-06-15
 */
@TableName("auth_role")
public class AuthRole implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 自增id
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 角色名称
     */
    private String name;

    /**
     * 角描述
     */
    private String desc;

    /**
     * 权限集合 多个值,号隔开
     */
    private String authItemSet;

    /**
     * 创建时间
     */
    private Integer createAt;

    /**
     * 创建人staff_id
     */
    private Integer createBy;

    /**
     * 更新时间
     */
    private Integer updateAt;

    /**
     * 修改人staff_id
     */
    private Integer updateBy;

    /**
     * 状态 1:enable, 0:disable, -1:deleted
     */
    private Boolean status;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getAuthItemSet() {
        return authItemSet;
    }

    public void setAuthItemSet(String authItemSet) {
        this.authItemSet = authItemSet;
    }

    public Integer getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Integer createAt) {
        this.createAt = createAt;
    }

    public Integer getCreateBy() {
        return createBy;
    }

    public void setCreateBy(Integer createBy) {
        this.createBy = createBy;
    }

    public Integer getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(Integer updateAt) {
        this.updateAt = updateAt;
    }

    public Integer getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(Integer updateBy) {
        this.updateBy = updateBy;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "AuthRole{" +
        "id=" + id +
        ", name=" + name +
        ", desc=" + desc +
        ", authItemSet=" + authItemSet +
        ", createAt=" + createAt +
        ", createBy=" + createBy +
        ", updateAt=" + updateAt +
        ", updateBy=" + updateBy +
        ", status=" + status +
        "}";
    }
}
