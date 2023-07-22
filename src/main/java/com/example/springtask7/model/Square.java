package com.example.springtask7.model;


import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import java.util.Scanner;

@Component()
//@Profile("!prod")
@ConditionalOnProperty(value = "chosen.shape", havingValue = "square", matchIfMissing = true)
public class Square implements Shape{

    @Override
    public double getArea() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please type a: ");
        int a = scanner.nextInt();
        scanner.close();
        return a*a;
    }

    @Override
    public String toString() {
        return "Square";
    }
}
