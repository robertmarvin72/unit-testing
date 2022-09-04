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

        Item item = new Item(1, "Test", 10, 120);

        itemRepository.save(item);

        System.out.println("Started in Bootstrap");
        System.out.println("Number of items: " + itemRepository.count());
    }
}
