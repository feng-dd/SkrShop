package com.murphy.skrshop.user.mapper;

import com.murphy.skrshop.user.entity.StaffInfo;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 * 员工信息(这里列了大概的信息，多的可以垂直拆表) Mapper 接口
 * </p>
 *
 * @author murphy
 * @since 2023-06-15
 */
@Mapper
public interface StaffInfoMapper extends BaseMapper<StaffInfo> {

}
