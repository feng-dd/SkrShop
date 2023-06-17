package com.murphy.skrshop.user.service.impl;

import com.murphy.skrshop.user.entity.StaffInfo;
import com.murphy.skrshop.user.mapper.StaffInfoMapper;
import com.murphy.skrshop.user.service.StaffInfoService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 员工信息(这里列了大概的信息，多的可以垂直拆表) 服务实现类
 * </p>
 *
 * @author murphy
 * @since 2023-06-15
 */
@Service
public class StaffInfoServiceImpl extends ServiceImpl<StaffInfoMapper, StaffInfo> implements StaffInfoService {

}
