package com.murphy.skrshop.user.mapper;

import com.murphy.skrshop.user.entity.AuthRoleStaff;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 * 权限角色与员工关系 Mapper 接口
 * </p>
 *
 * @author murphy
 * @since 2023-06-15
 */
@Mapper
public interface AuthRoleStaffMapper extends BaseMapper<AuthRoleStaff> {

}
