package com.czxy.dao;

import javax.persistence.Table;

/**
 * @author haoannan 169650@qq.com
 * @date 2020/8/12.
 * @infos
 */
@Table(name = "test")
public class Test {

    private String a;
    private String b;
    private String c;
    private String d;
    private String e;
    private String f;
    private String aa;
    private String bb;
    private String cc;

    public static void main(String[] args) {
        int a = 10;
        a++;
        a+=a;
        System.out.println(a);
    }

    public void test01(){
        a="lalal";
        System.out.println(a);
    }

}
