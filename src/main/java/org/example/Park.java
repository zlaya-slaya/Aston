package org.example;

public class Park{
     private String namePark;
     private String location;
     private String workingHours;

    public Park(String namePark, String location, String workingHours){
        this.namePark = namePark;
        this.location = location;
        this.workingHours = workingHours;
    }

    public void getParkInfo(){
        System.out.println("Название:" + namePark + " Расположение:" + location + " Время работы:" + workingHours);
    }

    public class Attraction{
        private String nameAttraction;
        private String openingHours;
        private int price;

        public Attraction(String nameAttraction, String openingHours, int price){
            this.nameAttraction = nameAttraction;
            this.openingHours = openingHours;
            this.price = price;
        }

        public void getAttractionInfo(){
            System.out.println("Атракцион:" + nameAttraction + " Часы работы:" + openingHours + " Цена:" + price);
        }
    }
}