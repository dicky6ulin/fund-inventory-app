package com.enigma.enigpus;

import com.enigma.enigpus.inventory.InventoryServiceImpl;
import com.enigma.enigpus.inventory.Menu;

public class Main {
    public static void main(String[] args) {

        Menu show = new Menu();
        InventoryServiceImpl inventory = new InventoryServiceImpl();
        show.menu(inventory);
    }
}
