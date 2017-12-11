package com.giit.dao;

import com.giit.entity.UserInfo;

import java.util.List;

public interface IUserInfoDao {
    List<UserInfo> findAllUsers();
}
