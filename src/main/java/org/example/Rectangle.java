package org.example;

public class Rectangle implements Shape {
    private double length;
    private double width;
    private String fillingColor;
    private String borderColor;

    public Rectangle(double length, double width, String fillingColor, String borderColor){
        this.length = length;
        this.width = width;
        this.fillingColor = fillingColor;
        this.borderColor = borderColor;
    }

    public Rectangle(double length, double width){
        this.length = length;
        this.width = width;
    }

    public double getLength(){
        return length;
    }

    public void setLength(double length){
        this.length = length;
    }

    public double getWidth(){
        return width;
    }

    public void setWidth(double width){
        this.width = width;
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
        return (2 * (length + width));
    }

    public double calculateArea(){
        return (length * width);
    }

    public void getAllInfo(){
        System.out.println("Периметр прямоугольника:" + calculatePerimeter() + "." +
                " Площадь прямоугольника:" + calculateArea() + "." + " Цвет заливки:" + fillingColor + "." +
                " Цвет фона:" + borderColor + ".");
    }

}
