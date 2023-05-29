package com.itheima.domain;

public class cust {
    private Integer id;
    private String 	cname;
    private String tel;
    private String birthday;

    @Override
    public String toString() {
        return "cust{" +
                "id=" + id +
                ", cname='" + cname + '\'' +
                ", tel='" + tel + '\'' +
                ", birthday='" + birthday + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }
}
