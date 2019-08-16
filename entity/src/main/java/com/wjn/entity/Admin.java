package com.wjn.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "c_admin")
public class Admin implements Serializable {
    @Id
    @Column(name = "admin_id")
    private String id;
    private String username;
    private String password;
    private String salt;
}
