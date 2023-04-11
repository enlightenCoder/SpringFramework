package com.nt.client;

import com.nt.sbeans.WishMessageGenerator;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Main {
    public static void main(String[] args)
    {
        FileSystemXmlApplicationContext context = new FileSystemXmlApplicationContext("src/com/nt/cfgs/applicationContext.xml");
        WishMessageGenerator wmg = context.getBean("wmg", WishMessageGenerator.class);
        String result = wmg.generateWishMessage("Raja");
        System.out.println(result);
        // close the ctx container
        context.close();
    }
}