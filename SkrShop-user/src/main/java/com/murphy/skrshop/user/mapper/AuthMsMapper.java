package com.murphy.skrshop.user.mapper;

import com.murphy.skrshop.user.entity.AuthMs;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 * 系统map(登记目前存在的后台系统信息) Mapper 接口
 * </p>
 *
 * @author murphy
 * @since 2023-06-15
 */
@Mapper
public interface AuthMsMapper extends BaseMapper<AuthMs> {

}
