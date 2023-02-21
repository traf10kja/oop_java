package hw_1;

import hw_1.Chocolate;

import java.io.PrintStream;
import java.sql.Date;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        VendingMachine machine = new VendingMachine();
        machine.addProduct(new Product("Lays", 100.0));
        machine.addProduct(new Product("Mars", 70.0));
        machine.addProduct(new Product("Twix", 70.99));
        machine.addProduct(new Product("Алёнка", 90.0));
        machine.addProduct(new Product("Колокольчик", 85.0));
        machine.addProduct(new Perishable("Молоко Бурёнка", 85.0, new Date(2023, 1, 25)));
        machine.addProduct(new Perishable("Молоко Коровка", 85.0, new Date(2023, 1, 25)));
        machine.addProduct(new Perishable("Молоко Василёк", 85.0, new Date(2023, 1, 25)));

        machine.addProduct(new Chocolate("Milka", 85.0, 35));
        machine.addProduct(new Chocolate("Dark", 150.0, 87));

        System.out.println(machine);
        System.out.println("__________________________________");
        System.out.println(machine.findProduct("Молоко"));
        System.out.println(machine.findProduct("Алёнка"));
        System.out.println(machine.findProduct("Пиво"));
        System.out.println("__________________________________");
        PrintStream var10000 = System.out;
        Product var10001 = machine.sellProduct((Product)machine.findProduct("Twix").get(0));
        var10000.println("продан: " + var10001);
        System.out.println("__________________________________");
        System.out.println(machine);
    }
}