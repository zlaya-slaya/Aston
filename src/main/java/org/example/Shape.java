package org.example;

public interface Shape {
    default double calculatePerimeter(){
        return 0.0;
    };

    double calculateArea();

    String getFillingColor();

    String getBorderColor();

}
