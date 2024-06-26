package com.yttt.service;

import com.yttt.pojo.UserAddress;

import java.util.List;

public interface UserService {

    /**
     * 根据用户ID返回地址
     * @param userId
     * @return
     */
    public List<UserAddress> getUserAddressList(String userId);
}
