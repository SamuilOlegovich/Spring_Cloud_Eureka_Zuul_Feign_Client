package com.epam.deepthought;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class DeepThoughtController implements DeepThought {

    @Override
    @GetMapping("/convert/{hours}")
    public Integer convert(@PathVariable("hours") int hours) {
        int storyPoints = convertFunction(hours);

        System.out.println(hours +" hours in story points would be " + storyPoints);
        System.out.println("\n");
        return storyPoints;
    }

    //region Conversion function
    private int convertFunction(int hours) {
        return hours * 2;
    }
}
