package com.project.naebang.entity;

import lombok.Builder;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.security.Timestamp;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Entity
@Data
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String userid;
    private String password;
    private String username;
    private String email;
    private String roles;

    // 추후 필요할 시 privider 생성
//    private String provider;
//    private String providerId;

    @CreationTimestamp
    private Timestamp createDate;

    @Builder
    public User(int id, String userid, String password, String username, String email, Timestamp createDate) {
        this.id = id;
        this.userid = userid;
        this.password = password;
        this.username = username;
        this.email = email;
        this.createDate = createDate;
    }


    public List<String> getRoleList(){
        if (this.roles.length() > 0) {
            return Arrays.asList(this.roles.split(","));
        }
        return new ArrayList<>();
    }
}
