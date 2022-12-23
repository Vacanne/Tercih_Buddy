/*
Author: Mustafa Can Ince
 */
package com.example.tercihbuddy;

import java.util.List;

public class User {

    public String username, email, pid ;
    public List<String> tercih_listesi_list;

    public User(){

    }
    public User (String username, String email, String pid, List<String> Stringtercih_listesi_list ){
        this.username = username;
        this.pid = pid;
        this.email = email;
        this.tercih_listesi_list = tercih_listesi_list;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid;
    }

    public List<String> getTercih_listesi_list() {
        return tercih_listesi_list;
    }

    public void setTercih_listesi_list(List<String> tercih_listesi_list) {
        this.tercih_listesi_list = tercih_listesi_list;
    }
}
