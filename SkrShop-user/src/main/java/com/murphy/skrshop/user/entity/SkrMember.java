package com.murphy.skrshop.user.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;

/**
 * <p>
 * 账户信息
 * </p>
 *
 * @author murphy
 * @since 2023-06-15
 */
@TableName("skr_member")
public class SkrMember implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 用户id
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 账号id
     */
    private Integer uid;

    /**
     * 昵称
     */
    private String nickname;

    /**
     * 头像(相对路径)
     */
    private String avatar;

    /**
     * 性别
     */
    private String gender;

    /**
     * 角色 0:普通用户 1:vip
     */
    private Integer role;

    /**
     * 创建时间
     */
    private Integer createAt;

    /**
     * 更新时间
     */
    private Integer updateAt;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Integer getRole() {
        return role;
    }

    public void setRole(Integer role) {
        this.role = role;
    }

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
        return "SkrMember{" +
        "id=" + id +
        ", uid=" + uid +
        ", nickname=" + nickname +
        ", avatar=" + avatar +
        ", gender=" + gender +
        ", role=" + role +
        ", createAt=" + createAt +
        ", updateAt=" + updateAt +
        "}";
    }
}
