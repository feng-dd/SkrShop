package com.murphy.skrshop.common.user.vo;
import lombok.Data;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;


/**
 * @Description:注册结果返回VO
 * @Author:murphy
 * @Date:2023/6/15 21:13
 **/
@Data // 每个 get/set 方法，前端传值，后端接收不到
public class UserRegistryRequestVO {

    /**
     * 用户账号
     */
    @NotEmpty(message = "账号不能为空")
    private String username;
    /**
     * 用户邮箱
     */
    private String email;
    /**
     * 用户手机号
     */
    @Length(min = 11, max = 11, message = "部门联系人手机号只能为11位")
    @Pattern(regexp = "^[1][3,4,5,6,7,8,9][0-9]{9}$", message = "部门联系人手机号格式有误")
    private String phone;
    /**
     * 	验证码
     */
    private Integer code;

}
