package com.murphy.skrshop.user.service;

import com.murphy.skrshop.common.core.vo.BasicResultVO;
import com.murphy.skrshop.common.user.dto.UserRegistryDTO;


/**
 * @Description:
 * @Author:murphy
 * @Date:2023/6/15 22:25
 **/
public interface IUserService {
    /**
     * 注册
     * @return
     */
    BasicResultVO registry(UserRegistryDTO userRegistryDTO);
}
