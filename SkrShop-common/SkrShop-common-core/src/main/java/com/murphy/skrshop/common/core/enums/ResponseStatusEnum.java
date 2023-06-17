package com.murphy.skrshop.common.core.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

/**
 * @Description:全局响应状态枚举
 * @Author:murphy
 * @Date:2023/6/15 21:08
 **/
@Getter
@ToString
@AllArgsConstructor
public enum ResponseStatusEnum {
    /**
     * 错误
     */
    ERROR_500("500", "服务器未知错误"),
    ERROR_400("400", "错误请求"),

    /**
     * 方法参数没有校验，内容由输入内容决定
     */
    METHOD_ARGUMENT_NOT_VALID("A00002", ""),
    /**
     * 无法读取获取请求参数
     */
    HTTP_MESSAGE_NOT_READABLE("A00003", "请求参数格式有误"),

    /**
     * OK：操作成功
     */
    SUCCESS("0", "操作成功"),
    FAIL("-1", "操作失败"),

    /**
     * 注册账号
     */
    USER_EXIST_EXCEPTION("10001","存在相同的用户"),
    PHONE_EXIST_EXCEPTION("10002","存在相同的手机号"),
    LOGINACCT_PASSWORD_EXCEPTION("10003","账号或密码错误"),
    ;


    /**
     * 响应状态
     */
    private final String code;
    /**
     * 响应编码
     */
    private final String msg;
}
