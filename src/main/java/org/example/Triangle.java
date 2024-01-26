package org.example;

public class Triangle implements Shape{
    private double side1;
    private double side2;
    private double side3;
    private String fillingColor;
    private String borderColor;

    public Triangle(double side1, double side2, double side3, String fillingColor, String borderColor){
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
        this.fillingColor = fillingColor;
        this.borderColor = borderColor;
    }

    public Triangle(double side1, double side2, double side3){
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double getSide1(){
        return side1;
    }

    public void setSide1(double side1){
        this.side1 = side1;
    }

    public double getSide2(){
        return side2;
    }

    public void setSide2(double side2){
        this.side2 = side2;
    }

    public double getSide3(){
        return side3;
    }

    public void setSide3(double side3){
        this.side3 = side3;
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
        return (side1 + side2 + side3);
    }

    public double calculateArea(){
        double s = (side1 + side2 + side3) / 2;
        double result = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
        return result;
    }

    public void getAllInfo(){
        System.out.println("Периметр треугольника:" + calculatePerimeter() + "." +
                " Площадь треугольника:" + calculateArea() + "." +
                " Цвет заливки:" + fillingColor + "." + " Цвет фона:" + borderColor + ".");
    }
}
