package com.example.springtask7.service;


import com.example.springtask7.model.Shape;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ShapeService {

    private final Shape shape;

    public void getShapeArea(){
        System.out.println("Area of " + shape + " is: " + shape.getArea());
    }
}
