package com.in28minutes.unittesting.unittesting.datalayer;

import com.in28minutes.unittesting.unittesting.model.Item;
import com.in28minutes.unittesting.unittesting.repositories.ItemRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@RunWith(SpringRunner.class)
@DataJpaTest
public class ItemRepositoryTest {

    @Autowired
    private ItemRepository itemRepository;

    @Test
    public void testFindAll() {
        Item item1 = new Item(10001, "Item1", 10, 20);
        Item item2 = new Item(10002, "Item2", 5, 10);
        Item item3 = new Item(10003, "Item3", 15, 2);

        itemRepository.save(item1);
        itemRepository.save(item2);
        itemRepository.save(item3);

        List<Item> allItems = (List<Item>)itemRepository.findAll();

        assertEquals(3, allItems.size());
    }
}
