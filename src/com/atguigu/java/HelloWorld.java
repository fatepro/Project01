package com.atguigu.java;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;

public class HelloWorld {



    public static void main(String[] args) {
        //region Description
        System.out.println("Hello World,你好世界");
        System.out.println("Hello World,你好世界");
         ArrayList arrayList = new ArrayList();
        //endregion

        hoo();
    }

    public static void hoo(){
        int num = 10;
        try {
            FileInputStream fis = new FileInputStream("hello.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
