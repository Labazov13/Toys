package org.example;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Shop {
    ReposytoryFile reposytoryFile;
    private List<Toy> shopToys;

    public Shop(List<Toy> shopToys, ReposytoryFile reposytoryFile1) {
        this.shopToys = shopToys;
        this.reposytoryFile = reposytoryFile1;

    }

    public boolean addToy(Toy toy) throws IOException {
        reposytoryFile.saveAllToys(toy);
        return shopToys.add(toy);
    }
    public void printShop(List<Toy> shopToys){
        for(Toy t : shopToys){
            System.out.println(t);
        }
    }
}
