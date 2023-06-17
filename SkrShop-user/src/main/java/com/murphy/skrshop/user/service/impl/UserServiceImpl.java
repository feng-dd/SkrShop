package com.murphy.skrshop.user.service.impl;

import com.murphy.skrshop.common.core.enums.ResponseStatusEnum;
import com.murphy.skrshop.common.core.vo.BasicResultVO;
import com.murphy.skrshop.common.user.dto.UserRegistryDTO;
import com.murphy.skrshop.common.user.vo.UserRegistryResponseVO;
import com.murphy.skrshop.user.service.IUserService;
import org.springframework.stereotype.Service;

/**
 * @Description:
 * @Author:murphy
 * @Date:2023/6/15 22:31
 **/
@Service
public class UserServiceImpl implements IUserService {
    @Override
    public BasicResultVO registry(UserRegistryDTO userRegistryDTO) {

//        try {

            return BasicResultVO.success(UserRegistryResponseVO.builder().build());
//        } catch (PhoneException e) {
//            return BasicResultVO.fail(ResponseStatusEnum.PHONE_EXIST_EXCEPTION, ResponseStatusEnum.PHONE_EXIST_EXCEPTION.getMsg());
//        } catch (UsernameException e) {
//            return BasicResultVO.fail(ResponseStatusEnum.USER_EXIST_EXCEPTION., ResponseStatusEnum.USER_EXIST_EXCEPTION.getMsg());
//        }

    }
}
