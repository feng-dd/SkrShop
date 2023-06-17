package com.murphy.skrshop.user.service.impl;

import com.murphy.skrshop.user.entity.AuthMs;
import com.murphy.skrshop.user.mapper.AuthMsMapper;
import com.murphy.skrshop.user.service.AuthMsService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 系统map(登记目前存在的后台系统信息) 服务实现类
 * </p>
 *
 * @author murphy
 * @since 2023-06-15
 */
@Service
public class AuthMsServiceImpl extends ServiceImpl<AuthMsMapper, AuthMs> implements AuthMsService {

}
