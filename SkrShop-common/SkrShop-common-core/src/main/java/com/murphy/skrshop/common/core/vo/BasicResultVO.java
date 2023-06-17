package com.murphy.skrshop.common.core.vo;

import com.murphy.skrshop.common.core.enums.ResponseStatusEnum;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;


/**
 * @Description:统一返回VO
 * @Author:murphy
 * @Date:2023/6/15 21:03
 **/
@Getter
@ToString(callSuper = true)
@NoArgsConstructor
@AllArgsConstructor
public final class BasicResultVO<T>{
    /**
     * 响应状态
     */
    private String status;

    /**
     * 响应编码
     */
    private String msg;

    /**
     * 返回数据
     */
    private T data;

    public BasicResultVO(String status, String msg) {
        this.status = status;
        this.msg = msg;
    }

    public BasicResultVO(ResponseStatusEnum status) {
        this(status, null);
    }

    public BasicResultVO(ResponseStatusEnum status, T data) {
        this(status, status.getMsg(), data);
    }

    public BasicResultVO(ResponseStatusEnum status, String msg, T data) {
        this.status = status.getCode();
        this.msg = msg;
        this.data = data;
    }

    /**
     * @return 默认成功响应
     */
    public static BasicResultVO<Void> success() {
        return new BasicResultVO<>(ResponseStatusEnum.SUCCESS);
    }

    /**
     * 自定义信息的成功响应
     * <p>通常用作插入成功等并显示具体操作通知如: return BasicResultVO.success("发送信息成功")</p>
     *
     * @param msg 信息
     * @return 自定义信息的成功响应
     */
    public static <T> BasicResultVO<T> success(String msg) {
        return new BasicResultVO<>(ResponseStatusEnum.SUCCESS, msg, null);
    }

    /**
     * 带数据的成功响应
     *
     * @param data 数据
     * @return 带数据的成功响应
     */
    public static <T> BasicResultVO<T> success(T data) {
        return new BasicResultVO<>(ResponseStatusEnum.SUCCESS, data);
    }

    /**
     * @return 默认失败响应
     */
    public static <T> BasicResultVO<T> fail() {
        return new BasicResultVO<>(
                ResponseStatusEnum.FAIL,
                ResponseStatusEnum.FAIL.getMsg(),
                null
        );
    }

    /**
     * 自定义错误信息的失败响应
     *
     * @param msg 错误信息
     * @return 自定义错误信息的失败响应
     */
    public static <T> BasicResultVO<T> fail(String msg) {
        return fail(ResponseStatusEnum.FAIL, msg);
    }

    /**
     * 自定义状态的失败响应
     *
     * @param status 状态
     * @return 自定义状态的失败响应
     */
    public static <T> BasicResultVO<T> fail(ResponseStatusEnum status) {
        return fail(status, status.getMsg());
    }

    /**
     * 自定义状态和信息的失败响应
     *
     * @param status 状态
     * @param msg    信息
     * @return 自定义状态和信息的失败响应
     */
    public static <T> BasicResultVO<T> fail(ResponseStatusEnum status, String msg) {
        return new BasicResultVO<>(status, msg, null);
    }

    /**
     * 自定义状态和信息的失败响应
     *
     * @param status 状态
     * @param data 数据
     * @return 带数据的失败响应
     */
    public static <T> BasicResultVO<T> fail(ResponseStatusEnum status, T data) {
        return new BasicResultVO<>(status, data);
    }

    /**
     * 自定义状态和信息的失败响应
     *
     * @param status 状态
     * @param msg    信息
     * @return 自定义状态和信息的失败响应
     */
//    public static <T> BasicResultVO<T> fail(ResponseStatusEnum status, String msg, T data) {
//        return new BasicResultVO<>(status, msg, data);
//    }
}
