package HoWo6;

public class Laptop {
    String brand;  // марка ноутбука
    String model;  // модель ноутбука
    String color;  // цвет ноутбука
    double screenSize;  // размер экрана в дюймах
    String processor;  // тип процессора
    int RAM;  // объем оперативной памяти в Гб
    int storage;  // объем накопителя в Гб
    boolean used;  // флаг, указывающий на то, является ли ноутбук б/у
    double price;  // цена ноутбука

    public Laptop( // конструктор класса
                   String brand, String model, String color,
                   double screenSize, String processor, int RAM,
                   int storage, boolean used, double price) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.screenSize = screenSize;
        this.processor = processor;
        this.RAM = RAM;
        this.storage = storage;
        this.used = used;
        this.price = price;
    }

    public double getDiscount() { // получение скидки
        return used ? 0.1 * price : 0.0;
    }

    public double getPriceWithDiscount() { // цена со скидкой
        return price - getDiscount();
    }
    public void printInfo() { // полный вывод инф. о продукте
        System.out.printf("%s %s, %s, %.1f\" screen, %s, %d GB RAM, %d GB storage, %s, $%.2f (%.0f%% discount)%n",
                brand, model, color, screenSize, processor, RAM, storage, used ? "used" : "new", getPriceWithDiscount(), getDiscount() * 100);
    }
}