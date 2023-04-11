package com.nt.sbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component("wmg")
public class WishMessageGenerator {

    // Has-A property
    private LocalDateTime dateTime;

    public WishMessageGenerator()
    {
        System.out.println("WishMessageGenerator : 0-Param Constructor");
    }


    @Autowired
    public void setDateTime(LocalDateTime dateTime)
    {
        System.out.println("WishMessageGenerator : setDateTime");
        this.dateTime = dateTime;
    }

    // B.method
    public String generateWishMessage(String user)
    {
        System.out.println("WishMessageGenerator : generateWishMessage");
        // get the current hour of the day as 24 hours format
        int hour = dateTime.getHour();

        if(hour < 12) return "Good Morning :: " + user;
        else if(hour < 16) return "Good Afternoon :: " + user;
        else if(hour < 20) return "Good Evening ::" + user;
        else return "Good Night ::" + user;
    }
}
