package com.wjn.web;

import com.wjn.entity.Admin;
import com.wjn.service.AdminService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class WebApplicationTests {
    @Autowired
    private AdminService adminService;
    @Test
    public void contextLoads() {
        List<Admin> admins = adminService.queryAdmins();
        for (Admin admin : admins) {
            System.out.println(admin);
        }
    }

}
