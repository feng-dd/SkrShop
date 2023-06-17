package com.murphy.skrshop.user.controller;

import com.murphy.skrshop.common.core.vo.BasicResultVO;
import com.murphy.skrshop.common.user.dto.UserRegistryDTO;
import com.murphy.skrshop.common.user.mapper.UserRegistryConvertMapper;
import com.murphy.skrshop.common.user.vo.UserRegistryRequestVO;
import com.murphy.skrshop.user.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * @Description:用户应用层接口
 * @Author:murphy
 * @Date:2023/6/15
 **/
@RestController
@RequestMapping(value = "/user")
public class UserController {

    @Autowired
    private IUserService userService;

    @PostMapping(value = "/registry")
    public BasicResultVO registry(@RequestBody @Validated UserRegistryRequestVO requestVO){
        /**
         * 1.校验参数
         * 2.转换DTO
         * 3.进行注册
         */

        UserRegistryDTO userRegistryDTO = UserRegistryConvertMapper.mapper.voConvertDto(requestVO);
        return userService.registry(userRegistryDTO);
    }

}
