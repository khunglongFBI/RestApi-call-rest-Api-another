package com.vsii.rest.rest.dto;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


    public class AccountDTO  {

    private long id;
    private String userName;
    private String password;
    private String address;
    private String fullName;
    private String birthday;
    private boolean isLocked;
    private String role;

    public AccountDTO()  {
    }

        public AccountDTO(long id, String userName, String password, String address, String fullName, String birthday, boolean isLocked, String role) {
            this.id = id;
            this.userName = userName;
            this.password = password;
            this.address = address;
            this.fullName = fullName;
            this.birthday = birthday;
            this.isLocked = isLocked;
            this.role = role;
        }

        public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public boolean isLocked() {
        return isLocked;
    }

    public void setLocked(boolean locked) {
        isLocked = locked;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

        @Override
        public String toString() {
            return "AccountDTO{" +
                    "id=" + id +
                    ", userName='" + userName + '\'' +
                    ", password='" + password + '\'' +
                    ", address='" + address + '\'' +
                    ", fullName='" + fullName + '\'' +
                    ", birthday='" + birthday + '\'' +
                    ", isLocked=" + isLocked +
                    ", role='" + role + '\'' +
                    '}';
        }
    }
