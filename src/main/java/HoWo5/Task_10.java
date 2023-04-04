package HoWo5;


import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Task_10 {
    public static String scanner(String text){
        Scanner in = new Scanner(System.in);
        System.out.println(text);
        return  in.next();
    }
    public static String addUser(){
        return scanner("Input user name: ");
    }
    public static String [] addNumbers(){
        String numberList = Arrays.toString(new String[]{});
        while (true){
            String telephone = scanner("input user phone number: ");
            numberList += telephone;
            if (scanner("Want to add another number? input 'no' to stop").equalsIgnoreCase("no")){
                break;
            }
        }
        return new String[]{numberList};
    }
    public static HashMap<String, String[]> telephoneBook(){
        HashMap<String, String[]> teleBook = new HashMap<>();
        while (true){
            teleBook.put(addUser(),addNumbers());
            if (scanner("Wand to add another user? input 'no' to stop").equalsIgnoreCase("no")){
                break;
            }
        }
        return teleBook;
    }
    public static void main(String[] args) {
        HashMap<String, String[]> myPhoneBook = telephoneBook();

        for (Map.Entry entry : myPhoneBook.entrySet()) {
            System.out.println(entry.getValue()+" "+ entry.getKey());
        }
    }
}
