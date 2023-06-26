package org.example;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        ReposytoryFile reposytoryFile = new ReposytoryFile("toys.txt");
        List <Toy> toysList = new ArrayList<>();
        Shop shopToys = new Shop(toysList, reposytoryFile);
        shopToys.addToy(new Toy(1, "Barbie", 0.2));
        shopToys.addToy(new Toy(2, "Deseptikon", 0.4));
        shopToys.addToy(new Toy(3, "Lamborghini", 0.8));
        shopToys.printShop(toysList);
    }
}