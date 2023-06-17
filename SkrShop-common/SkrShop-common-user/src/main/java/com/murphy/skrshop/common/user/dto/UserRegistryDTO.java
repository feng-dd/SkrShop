package com.murphy.skrshop.common.user.dto;

import lombok.Data;

import java.io.Serializable;

/**
 * @Description:
 * @Author:murphy
 * @Date:2023/6/15 22:29
 **/
@Data
public class UserRegistryDTO implements Serializable {
    /**
     * 用户账号
     */
    private String username;
    /**
     * 用户邮箱
     */
    private String email;
    /**
     * 用户手机号
     */
    private String phone;
    /**
     * 	验证码
     */
    private Integer code;
}
