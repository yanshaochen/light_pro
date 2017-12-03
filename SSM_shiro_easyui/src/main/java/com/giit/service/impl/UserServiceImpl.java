package com.giit.service.impl;

import com.giit.dao.IUserInfoDao;
import com.giit.service.IUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("userService")
public class UserServiceImpl implements IUserService {
    @Resource(name = "IUserInfoDao")
    private IUserInfoDao userInfoDao;
}
