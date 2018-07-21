package com.pp.entity;

import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.Email;

public class Author {
    private Integer id;

    @Pattern(regexp="^\\w{4,30}$",message="用户名为4-30个字类字符")
    private String username;

    @Pattern(regexp="^\\s{6,30}$",message="密码为6-30个非空字符")
    private String password;

    @Pattern(regexp="^((1[3,5,8][0-9])|(14[5,7])|(17[0,6,7,8])|(19[7]))\\\\d{8}$",message="手机号格式有误")
    private String phone;

    @Email(message="邮箱格式有误")
    private String email;

    private String address;

    public Author() {
		// TODO Auto-generated constructor stub
	}
    
    public Author(String username, String password) {
		// TODO Auto-generated constructor stub
    	this.username = username;
    	this.password = password;
	}
    
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }
}