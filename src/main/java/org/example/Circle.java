package org.example;

public class Circle implements Shape{
    private double diameter;
    private String fillingColor;
    private String borderColor;

    public Circle(double diameter, String fillingColor, String borderColor){
        this.diameter = diameter;
        this.fillingColor = fillingColor;
        this.borderColor = borderColor;
    }

    public Circle(double diameter){
        this.diameter = diameter;
    }

    public double getDiameter(){
        return diameter;
    }

    public void setDiameter(double diameter){
        this.diameter = diameter;
    }

    public String getFillingColor(){
        return fillingColor;
    }

    public void setFillingColor(String fillingColor){
        this.fillingColor = fillingColor;
    }

    public String getBorderColor(){
        return borderColor;
    }

    public void setBorderColor(String borderColor){
        this.borderColor = borderColor;
    }

    public double calculatePerimeter(){
        return (Math.PI * diameter);
    }

    public double calculateArea(){
        return ((Math.PI * Math.pow(diameter, 2)) / 4);
    }

    public void getAllInfo(){
        System.out.println("Длина окружности:" + calculatePerimeter() + "." +
                " Площадь окружности:" + calculateArea() + "." +
                " Цвет заливки:" + fillingColor + "." + " Цвет фона:" + borderColor + ".");
    }
}
