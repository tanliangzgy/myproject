package com.jxd.emp.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.jxd.emp.mapper.IUserMapper;
import com.jxd.emp.model.Users;
import com.jxd.emp.service.IUserService;
import org.springframework.stereotype.Service;

/**
 * @ClassName UserServiceImpl
 * @Description TODO
 * @Author tanliang
 * @Date 2020/10/23
 * @Version 1.0
 */

@Service
public class UserServiceImpl extends ServiceImpl<IUserMapper,Users> implements IUserService {
}
