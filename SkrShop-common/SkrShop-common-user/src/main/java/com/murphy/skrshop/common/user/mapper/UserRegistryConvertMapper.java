package com.murphy.skrshop.common.user.mapper;
import com.murphy.skrshop.common.user.dto.UserRegistryDTO;
import com.murphy.skrshop.common.user.vo.UserRegistryRequestVO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

/**
 * @Description:转换类
 * @Author:murphy
 * @Date:2023/6/16 08:34
 **/
@Mapper
public interface UserRegistryConvertMapper {

    UserRegistryConvertMapper mapper = Mappers.getMapper(UserRegistryConvertMapper.class);

    UserRegistryDTO voConvertDto(UserRegistryRequestVO vo);
}
