package HoWo4;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class Task_9 {
    public static LinkedList<String> userList(){
        LinkedList<String> list = new LinkedList<>();
        Scanner scan = new Scanner(System.in);
        while (true){
            System.out.println("Input text: ");
            String textInput = scan.nextLine();
            if (textInput.trim().equalsIgnoreCase("print")){
                System.out.println(list);
                continue;
            }
            if (textInput.trim().equalsIgnoreCase("revert")){
                System.out.println("deleting: " + list.get(0));
                list.removeFirst();
                continue;
            }
            if (textInput.equals("exit")) {
                System.out.println("Your list successfully saved");
                System.out.println("goodbye");
                break;
            }
            list.addFirst(textInput);
        }
        return list;
    }

//    !!!Part 2!!!
//    public static LinkedList<String> reversList(LinkedList<String> list){
//        LinkedList<String> revers = new LinkedList<>();
//        for (String s : list) {
//            revers.addFirst(s);
//        }
//        return revers;
////        Collections.reverse(revers);
        }

