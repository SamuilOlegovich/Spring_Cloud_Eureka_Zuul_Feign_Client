package com.epam.developer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;



@RestController
public class DeveloperController {
    @Autowired
    private DeepThoughtCaller deepThoughtCaller;
    // time generator
    private final int[] time = {1, 2, 4, 8, 16, 80};

    
    @GetMapping("/estimation")
    public String getEstimation() {
        int hours = generateTime();

        System.out.println("I think it would take " + hours + " hours");

        Integer receivedValue = deepThoughtCaller.getStoryPoints(hours);

        String result = "Let it be " + receivedValue + " story points";
        System.out.println(result + "\n");

        return result;
    }


    private int generateTime() {
        return time[new Random().nextInt(time.length)];
    }
}
