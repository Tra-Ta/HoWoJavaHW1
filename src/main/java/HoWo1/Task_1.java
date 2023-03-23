package HoWo1;

public class Task_1 {

    public static void main(String[] args) {
        int[] arrRandom = createArray();
        int max = foundMax(arrRandom);
        System.out.println("Maximum number: -> " + max);
        int min = foundMin(arrRandom);
        System.out.println("Minimum number: -> " + min);
    }
    public static int[] createArray() {
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 50);
            System.out.println(array[i] + " ");
        }
        return array;
    }

    public static int foundMax(int[] inputArray) {
        int maxValue = inputArray[0];
        for (int i = 1; i < inputArray.length;i++) {
            if (inputArray[i] > maxValue) {
                maxValue = inputArray[i];
            }
        }
        return maxValue;
    }


    public static int foundMin(int[] inputArray) {
        int minValue = inputArray[0];
        for (int i = 1; i < inputArray.length; i++) {
            if (inputArray[i] < minValue) {
                minValue = inputArray[i];
            }
        }
        return minValue;
    }
}

