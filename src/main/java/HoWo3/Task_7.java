package HoWo3;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Task_7 {

        public static void main(String[] args) {
            ArrayList<Integer> list = new ArrayList<Integer>();
            Random random = new Random();


            for (int i = 0; i < 10; i++) {
                list.add(random.nextInt(100));
            }

            // выводим на экран список
            System.out.println("Список: " + list.toString());

            // находим максимальное и минимальное число, а также среднее арифметическое
            int max = list.get(0);
            int min = list.get(0);
            int sum = 0;

            for (int i = 0; i < list.size(); i++) {
                int number = list.get(i);
                if (number > max) {
                    max = number;
                }
                if (number < min) {
                    min = number;
                }
                sum += number;
            }

            double avg = (double) sum / list.size();

            // выводим результат
            System.out.println("Max Value: " + max);
            System.out.println("Min Value: " + min);
            System.out.println("Arithmetic: " + avg);
        }
    }