package com.atm.demo;

import com.atm.entity.Customer;

import java.util.ArrayList;
import java.util.List;

public class CustomerDemo {
    private static CustomerDemo ourInstance = new CustomerDemo();
    private List<Customer> customerList; //成员变量 idea中没有全局变量
    public static CustomerDemo getInstance() {
        return ourInstance;
    }

    private CustomerDemo() {
        //在构造方法中初始化数据
        customerList = new ArrayList<>();
        //每循环一次诞生一个customer对象放入到集合当中
        for (int i = 0; i < 10; i++) {
            Customer customer=new Customer();
            customer.setId("520"+i);
            customer.setPwd("123");
            customer.setName("葫芦娃"+i+"号");
            customer.setMoney(10000);
            customer.setPhone("12138"+i);
            customerList.add(customer); //把数据封装进集合
        }
    }

    //成员变量customerList的get,set方法
    public List<Customer> getCustomerList() {
        return customerList;
    }

    public void setCustomerList(List<Customer> customerList) {
        this.customerList = customerList;
    }
}
