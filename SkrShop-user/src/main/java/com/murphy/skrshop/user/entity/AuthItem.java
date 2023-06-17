package com.murphy.skrshop.user.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.murphy.skrshop.common.core.entity.BaseEntity;
import lombok.Data;
import lombok.ToString;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * <p>
 * 系统权限
 * </p>
 *
 * @author murphy
 * @since 2023-06-15
 */
@TableName("auth_item")
@Data
@ToString
@Accessors(chain = true)
public class AuthItem extends BaseEntity {

    /**
     * 自增id
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 系统id
     */
    private Integer msId;

    /**
     * 页面/接口uri
     */
    private String menuId;

    /**
     * 创建人staff_id
     */
    private Integer createBy;

    /**
     * 修改人staff_id
     */
    private Integer updateBy;

    /**
     * 状态 1:enable, 0:disable, -1:deleted
     */
    private Integer status;

}
