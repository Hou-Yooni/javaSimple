package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //RestController跟Component 註解一樣 都可以創建一個Bean
public class MyController {

    @Autowired
//    @Qualifier("canonPrinter")
    private Printer printer;   //定義Printer變數 叫 printer

    @RequestMapping("/test")
    public String test() {
        printer.print("Hello World");
        return  "Hello World";
    }
}
