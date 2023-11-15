package com.vector.music.service.impl;

import com.vector.music.dao.AdminMapper;
import com.vector.music.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 管理员Service实现类
 */
@Service
public class AdminServiceImpl implements AdminService {

    /**
     * 注入AdminMapper一边直接调用
     */
    @Autowired
    private AdminMapper adminMapper;
    /**
     * 验证密码是否正确
     *
     * @param username
     * @param password
     */
    @Override
    public boolean verifyPassword(String username, String password) {

        return adminMapper.verifyPassword(username, password)>0;
    }
}
