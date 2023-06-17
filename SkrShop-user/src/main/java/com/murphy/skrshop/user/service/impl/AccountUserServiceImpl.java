package com.murphy.skrshop.user.service.impl;

import com.murphy.skrshop.user.entity.AccountUser;
import com.murphy.skrshop.user.mapper.AccountUserMapper;
import com.murphy.skrshop.user.service.AccountUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 账户 服务实现类
 * </p>
 *
 * @author murphy
 * @since 2023-06-15
 */
@Service
public class AccountUserServiceImpl extends ServiceImpl<AccountUserMapper, AccountUser> implements AccountUserService {

}
