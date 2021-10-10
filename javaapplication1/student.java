/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import javax.crypto.AEADBadTagException;

/**
 *
 * @author afkda
 */
public class student {

    private String name;
    private String id;
    private String email;
    private String group;

    public student() {
        this.name = "Student";
        this.id = "000";
        this.group = "K62CB";
        this.email = "uet@vnu.edu.vn";
    }

    public student(String name, String id, String email, String group) {
        group = "K62CB";
        this.name = name;
        this.id = id;
        this.email = email;
        this.group = group;
    }

    public student(student s) {
        this.name = s.getName();
        this.id = s.getId();
        this.group = s.getGroup();
        this.email = s.getEmail();

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getInfo() {
        student st = new student();
        st.setName("Nguyen Van An");
        st.setId("17020001");
        st.setGroup("K62CC");
        st.setEmail("17020001@vnu.edu.vn");
        String str = st.getName() + " - " + st.getId() + " - " + st.getGroup() + " - " + st.getEmail();
        return str;
    }

    public static void main(String[] args) {
        // TODO code application logic here
        student st = new student();
        System.out.println(st.getInfo());

    }
}
