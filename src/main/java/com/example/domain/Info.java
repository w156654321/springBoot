package com.example.domain;

/***
 *
 * 描    述：
 *
 * 创 建 者： liudh
 * 创建时间： 2017/5/10 16:42
 * 创建描述：
 *
 */
public class Info {

    private Integer id;
    private String loginName;
    private String passWord;

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
