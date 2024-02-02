package org.example;
import java.io.*;
import java.util.Arrays;

public class AppData{
    private String[] headers;
    private int [][] data;

    public AppData(String[] headers, int[][] data){
        this.headers = headers;
        this.data = data;
    }

    public String[] getHeaders(){
        return headers;
    }

    public void setHeaders(String[] headers){
        this.headers = headers;
    }

    public int[][] getData(){
        return data;
    }

    public void setData(int[][] data){
        this.data = data;
    }

    public static void save(AppData appData, String file) {
         PrintWriter writer = null;
        try {
            writer = new PrintWriter(new FileWriter(file));
            writer.println(String.join(";", appData.getHeaders()));

            int rows = appData.getData().length;
            int columns = appData.getHeaders().length;

            for (int i = 0; i < rows; i++) {
                StringBuilder rowBuilder = new StringBuilder();
                for (int j = 0; j < columns; j++) {
                    if (j > 0) {
                        rowBuilder.append(";");
                    }
                    rowBuilder.append(appData.getData()[i][j]);
                }
                writer.println(rowBuilder.toString());
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (writer != null) {
                writer.close();
            }
        }
    }


    public static AppData load(String file) {
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader(file));
            String headersLine = reader.readLine();
            String[] headers = headersLine.split(";");
            int columns = headers.length;
            long rows = reader.lines().count();
            reader.close();
            reader = new BufferedReader(new FileReader(file));
            reader.readLine();
            int numRows = (int) rows;
            int[][] data = new int[numRows][columns];
            for (int i = 0; i < numRows; i++) {
                String line = reader.readLine();
                String[] values = line.split(";");
                for (int j = 0; j < columns; j++) {
                    data[i][j] = Integer.parseInt(values[j]);
                }
            }
            return new AppData(headers, data);
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        } finally {
            try {
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}