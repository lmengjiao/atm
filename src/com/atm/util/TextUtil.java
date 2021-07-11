package com.atm.util;
//文本信息的工具类 以后修改文本信息直接来这个工具类
public class TextUtil {
    //static修饰的方法 1.可以直接被类名.方法名()调用 2.在内存中只有一份，其他修改，它会跟着修改
    //static静态代码块适用于界面场景的提前加载 例王者中峡谷的轮廓永远优先英雄的出现

    /*static{
        //这就叫静态代码块
    }*/
    public static void welcome() {
        //欢迎语
        System.out.println("*****************************************");
        System.out.println("*****************ATM取款机****************");
        System.out.println("*************欢迎您使用ATM取款机************");
        System.out.println("*****************************************");
    }

    //一级选择
    public static void oneoption(){
        System.out.println("*****************************************");
        System.out.println("********请输入你想要的操作类型：*********");
        System.out.println("********1.余额查询        2.取款*********");
        System.out.println("********3.转账            4.存款*********");
        System.out.println("********5.退卡                  *********");
        System.out.println("*****************************************");
    }
}
