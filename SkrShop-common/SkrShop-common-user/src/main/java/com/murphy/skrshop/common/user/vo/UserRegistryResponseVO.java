package com.murphy.skrshop.common.user.vo;

import lombok.Builder;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * @Description:注册结果返回VO
 * @Author:murphy
 * @Date:2023/6/15 21:13
 **/
@Accessors(chain = true)
@Data
@Builder
public class UserRegistryResponseVO {

    /**
     * 用户会话标识
     */
    private String token;
    /**
     * 用户会话标识过期时间,0不过期
     */
    private Integer tokenExpire;

    /**
     * 用户名
     */
    private String username;
    /**
     * 用户昵称
     */
    private String nickname;
    /**
     * 用户头像
     */
    private String avatar;
    /**
     * 	用户性别，1:男，0:女，-1:未知
     */
    private Integer gender;

}
