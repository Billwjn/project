package com.wjn.controller;

import com.wjn.entity.Admin;
import com.wjn.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("admin")
public class AdminController {
    @Autowired
    private AdminService adminService;
    @RequestMapping("query")
    public List<Admin> queryAll(){
        List<Admin> admins = adminService.queryAdmins();
        return admins;
    }
}
