package com.atm.demo;

import com.atm.entity.Customer;
import com.atm.util.TextUtil;

import java.util.List;
import java.util.Scanner;

public class AtmMain {

    private static String id; //成员变量
    private static String pwd;

    public static void main(String[] args) {
        //测试客户端的数据
        CustomerDemo customerDamo = CustomerDemo.getInstance();
        List<Customer> customerList = customerDamo.getCustomerList();
        /*for (Customer customer : customerList) {
            System.out.println("customer = " + customer);
        }*/
        //欢迎语句
        TextUtil.welcome();
        //输入账号密码
        int i=0;
        while (i<5) {
            dowrite();
            //校验角色 验证卡号和密码
            docheckpwd(id,pwd);
            i++;
        }
    }

    //校验角色 验证账号密码
    private static void docheckpwd(String id,String pwd) {
        //根据长度校验角色
        if (id.length()==8) {

        }
    }

    //输入账号密码
    private static void dowrite() {
        System.out.println("请输入卡号");
        Scanner scanner = new Scanner(System.in);
        //nextLine可以读取空格 next不能读取空格
        id = scanner.nextLine();
        System.out.println("id = " + id);
        System.out.println("请输入密码");
        pwd = scanner.nextLine();
        System.out.println("pwd = " + pwd);
    }


}
