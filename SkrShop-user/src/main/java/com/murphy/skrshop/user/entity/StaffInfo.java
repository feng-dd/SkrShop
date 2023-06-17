package com.murphy.skrshop.user.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;

/**
 * <p>
 * 员工信息(这里列了大概的信息，多的可以垂直拆表)
 * </p>
 *
 * @author murphy
 * @since 2023-06-15
 */
@TableName("staff_info")
public class StaffInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 员工id
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 账号id
     */
    private Integer uid;

    /**
     * 员工邮箱
     */
    private String email;

    /**
     * 员工手机号
     */
    private String phone;

    /**
     * 员工姓名
     */
    private String name;

    /**
     * 员工昵称
     */
    private String nickname;

    /**
     * 员工头像(相对路径)
     */
    private String avatar;

    /**
     * 员工性别
     */
    private String gender;

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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
        return "StaffInfo{" +
        "id=" + id +
        ", uid=" + uid +
        ", email=" + email +
        ", phone=" + phone +
        ", name=" + name +
        ", nickname=" + nickname +
        ", avatar=" + avatar +
        ", gender=" + gender +
        ", createAt=" + createAt +
        ", updateAt=" + updateAt +
        "}";
    }
}
