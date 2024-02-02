package org.example;
import java.util.Arrays;


public class Main {
    public static void main(String[] args) {
        String[] headers = {"Value1", "Value2", "Value3"};
        int[][] data = {{100, 200, 300}, {200, 400, 600}, {123, 500, 745}, {123, 345, 456}};

        AppData appData = new AppData(headers, data);

        AppData.save(appData, "data.csv");

        AppData loadedData = AppData.load("data.csv");
            if (loadedData != null) {
            System.out.println(Arrays.toString(loadedData.getHeaders()));
            for (int[] rows : loadedData.getData()) {
                System.out.println(Arrays.toString(rows));
            }
        }
    }
}





