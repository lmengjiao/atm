package com.atm.service;

import com.atm.demo.CustomerDemo;
import com.atm.entity.Customer;
import com.atm.util.TextUtil;

import java.util.List;
import java.util.Scanner;

//此类是完成顾客的所有业务
public class CustomerService {
    private List<Customer> customerList;
    private Customer customernow;
    public void checkip(String id,String pwd){
        CustomerDemo customerDamo = CustomerDemo.getInstance();
        customerList = customerDamo.getCustomerList();
        System.out.println("id = " + id);
        System.out.println("pwd = " + pwd);
        for (Customer customer : customerList) {
            if(customer.getId().equals(id)&&customer.getPwd().equals(pwd)){
                customernow=customer;
                System.out.println("欢迎"+customer.getName()+"登录，请注意您的安全");
                TextUtil.oneoption();
                Scanner scanner = new Scanner(System.in);
                String option=scanner.nextLine();
                yioption(option);
            }
        }
    }

    private void yioption(String option) {
        switch (option){
            case "1":
                System.out.println("余额查询");
                doselectmoney();
                goonehome();
                break;
            case "2":
                System.out.println("取款");
                doqukuan();
                goonehome();
                break;
            case "3":
                System.out.println("转账");
                dozhuanzhang();
                goonehome();
                break;
            case "4":
                System.out.println("存款");
                docunkuan();
                goonehome();
                break;
            case "5":
                System.out.println("退卡");
                System.out.println("退卡成功    ");
                break;



        }
    }




    //存款
    private void docunkuan() {
        Scanner sc=new Scanner(System.in);
        double cun=sc.nextDouble();
        System.out.println("请输入您想存款的金额");
        System.out.println("您的账户余额是"+(customernow.getMoney()+cun));
    }

    //转账
    private void dozhuanzhang() {

        System.out.println("请输入对方的卡号");
    }

    //取款
    private void doqukuan() {
        System.out.println("请输入取款金额:");
        System.out.println("*****************************************");
        System.out.println("********请输入你想要的操作类型：*********");
        System.out.println("********1.100           2.200*********");
        System.out.println("********3.300           4.500*********");
        System.out.println("********5.800           6.1000*********");
        System.out.println("********7.2000          8.其他*********");
        System.out.println("*****************************************");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if (a > 0) {
            if(customernow.getMoney()>a){
            if (a == 1) {
                System.out.println("请及时拿走现金100元");
                System.out.println("您的余额是" + (customernow.getMoney() - 100));
            } else if (a == 2) {
                System.out.println("请及时拿走现金200元");
                System.out.println("您的余额是" + (customernow.getMoney() - 200));
            } else if (a == 3) {
                System.out.println("请及时拿走现金300元");
                System.out.println("您的余额是" + (customernow.getMoney() - 300));
            } else if (a == 4) {
                System.out.println("请及时拿走现金500元");
                System.out.println("您的余额是" + (customernow.getMoney() - 500));
            } else if (a == 5) {
                System.out.println("请及时拿走现金800元");
                System.out.println("您的余额是" + (customernow.getMoney() - 800));
            } else if (a == 6) {
                System.out.println("请及时拿走现金1000元");
                System.out.println("您的余额是" + (customernow.getMoney() - 1000));
            } else if (a == 7) {
                System.out.println("请及时拿走现金2000元");
                System.out.println("您的余额是" + (customernow.getMoney() - 2000));
            } else if (a == 8) {
                System.out.println("请输入您的取款金额");
                Double mm=sc.nextDouble();
                System.out.println("请及时拿走现金"+mm+"元");
                System.out.println("您的余额是" + (customernow.getMoney() - mm));
            }
            }else{
                System.out.println("您的余额不足");
            }
            }else{
            System.out.println("请输入正确的金额");
        }
    }

    //查询余额
    private void doselectmoney() {
        double money = customernow.getMoney();
        System.out.println("您的余额是" + money);

    }

    //回到一级菜单
    private void goonehome() {
        TextUtil.oneoption();
        Scanner sc=new Scanner(System.in);
        String option=sc.nextLine();
        System.out.println("op = " + option);
        yioption(option);
    }
}
