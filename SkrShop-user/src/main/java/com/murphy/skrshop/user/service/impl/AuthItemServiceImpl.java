package com.murphy.skrshop.user.service.impl;

import com.murphy.skrshop.user.entity.AuthItem;
import com.murphy.skrshop.user.mapper.AuthItemMapper;
import com.murphy.skrshop.user.service.AuthItemService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 系统权限 服务实现类
 * </p>
 *
 * @author murphy
 * @since 2023-06-15
 */
@Service
public class AuthItemServiceImpl extends ServiceImpl<AuthItemMapper, AuthItem> implements AuthItemService {

}
