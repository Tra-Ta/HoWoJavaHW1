package HoWo3;

import java.util.Arrays;

public class Task_6 {
    public static void main(String[] args) {
        int[] arrRandom = createArray();
        System.out.println(Arrays.toString(oddCleared(arrRandom)));
    }
    public static int[] createArray() {
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 50);
            System.out.println(array[i] + " ");
        }
        return array;
    }
    public static int[] oddCleared(int[] arrRandom){
        return Arrays.stream(arrRandom)
                .filter(num -> num %2 !=0).toArray();
    }
}
