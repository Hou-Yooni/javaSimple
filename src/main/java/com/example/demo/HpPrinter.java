package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class HpPrinter implements Printer{



//    @Value("${printer.name}")
//    private String name;
//    @Value("${printer.count:20}")
//    private int count;

//    @PostConstruct
//    public void init(){
//        count = 5;
//    }

    @Override
    public void print(String message) {
        System.out.println("Hp印表機:" + message);
//        count--;
//        System.out.println(name + ":" + message);
//        System.out.println("剩餘使用次數" + count);
        //System.out 為我們提供了 PrintStream 類的 out 例項變數。然後我們可以在這個例項變數上呼叫 print() 或 println() 方法
    }
}
