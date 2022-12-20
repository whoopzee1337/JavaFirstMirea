package ru.mirea.task16;

import java.util.HashMap;
import java.util.LinkedList;

import static ru.mirea.task16.Order.addMenu;

public class StartProgramm {
    public static void main(String[] args) {
        InternetOrder internetOrder = new InternetOrder();
        Order.addMenu(new Dish(1000, "Мясо на гриле", "Жареное на гриле мясо"));
        Order.addMenu(new Drink(10, "Газировка, сладкая"));
        Order.addMenu(new Drink(2000, "Рибай"));

        LinkedList<Item> items = internetOrder.getSorted();
        for (int i = 0; i < items.size(); i++) {
            System.out.println(items.get(i));
        }

        OrderManager orderManager1 = new OrderManager();
        orderManager1.addMenu(new Dish(1900, "Стейк из индейки"), "Верхние поля");
        orderManager1.addMenu(new Dish(1500, "Пирожные с заварным кремом"), "Римская улица");
        orderManager1.addMenu(new Dish(26000, "Набор роллов"), "Площадь Ильича");

        HashMap<String, Item> listAddress = orderManager1.getListAddress();
        for (String key : listAddress.keySet()) {
            System.out.println(listAddress.get(key).getOpis() + " - " + listAddress.get(key).getPrice() + ", адрес: " + key);
        }

        new GUIR().setVisible(true);
    }
}