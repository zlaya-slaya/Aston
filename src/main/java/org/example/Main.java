package org.example;
import java.util.Arrays;


public class Main {
    public static void main(String[] args) {
        String[][] array = {{"546", "664", "3", "47"},
                            {"52", "56", "743", "998"},
                            {"766", "164", "114", "12"},
                            {"135", "14", "15", "1226"}};

        try {
            System.out.println(calculateSumArray(array));
        } catch (MyArraySizeException | MyArrayDataException e) {
            System.out.println(e.getMessage());
        }
    }


    public static int calculateSumArray(String[][] array) throws MyArraySizeException, MyArrayDataException {
        int row = 4;
        int column = 4;
        if (array.length != row || array[0].length != column)
            throw new MyArraySizeException("Ошибка в размере массива: ожидаемый размер 4х4");

        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                try {
                    sum += Integer.parseInt(array[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException("Неверный формат данных в ячейке: [" + i + "][" + j + "]");
                }
            }
        }
        return sum;
    }
}





