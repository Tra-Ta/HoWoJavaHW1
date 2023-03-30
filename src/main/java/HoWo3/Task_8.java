package HoWo3;

import java.util.ArrayList;

public class Task_8 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();

        list.add("abc");
        list.add("123");
        list.add("xyz");
        list.add("456");

        System.out.println("List new: " + list);

        for (int i = 0; i < list.size(); i++) {
            String element = list.get(i);
            try {
                Integer.parseInt(element);
                list.remove(i);
                i--;
            } catch (NumberFormatException e) {
            }
        }


        System.out.println("Result List: " + list);
    }
}

