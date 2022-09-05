package com.in28minutes.unittesting.unittesting.bootstrap;

import com.in28minutes.unittesting.unittesting.model.Item;
import com.in28minutes.unittesting.unittesting.repositories.ItemRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootStrapData implements CommandLineRunner {

    private final ItemRepository itemRepository;

    public BootStrapData(ItemRepository itemRepository) {
        this.itemRepository = itemRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        Item item1 = new Item(10001, "Item1", 10, 20);
        Item item2 = new Item(10002, "Item2", 5, 10);
        Item item3 = new Item(10003, "Item3", 15, 2);

        itemRepository.save(item1);
        itemRepository.save(item2);
        itemRepository.save(item3);

        System.out.println("Started in Bootstrap");
        System.out.println("Number of items: " + itemRepository.count());
    }
}
