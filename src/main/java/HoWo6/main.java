package HoWo6;

import java.util.ArrayList;

public class main {
    public static void main(String[] args) {

        ArrayList<Laptop> laptops = new ArrayList<>();
        laptops.add(new Laptop("Lenovo", "IdeaPad 3", "Silver", 15.6, "AMD Ryzen 5 3500U", 8, 256, true, 599.99));
        laptops.add(new Laptop("Dell", "Inspiron 15 3000", "Black", 15.6, "Intel Core i3-1115G4", 4, 128, false, 529.99));
        laptops.add(new Laptop("HP", "Pavilion 15", "Gold", 14.0, "AMD Ryzen 7 5700U", 16, 512, false, 1099.99));
        laptops.add(new Laptop("Apple", "MacBook Air", "Space Gray", 13.3, "Apple M1", 8, 256, false, 999.99));
        filterByColor(laptops, "Gold");
//        filterByMinRAM(laptops, 8);
    }
    public static void filterByColor(ArrayList<Laptop> laptops, String value){ //выбор цвета
        laptops.removeIf(laptop -> (!(laptop.color.equals(value))));
        laptops.forEach(Laptop::printInfo);
    }

//    public static void filterByMinRAM(ArrayList<Laptop> laptops, int value){ // выбор обьема RAM
//        laptops.removeIf(laptop -> (laptop.RAM < value));
//        laptops.forEach(Laptop::printInfo);
//    }
}
