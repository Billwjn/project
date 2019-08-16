package com.wjn.service.impl;

import com.wjn.dao.AdminDao;
import com.wjn.entity.Admin;
import com.wjn.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
@Transactional
public class AdminServiceImpl implements AdminService {
    @Autowired
    private AdminDao adminDao;
    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public List<Admin> queryAdmins() {
        List<Admin> admins = adminDao.selectAll();
        return admins;
    }
}
