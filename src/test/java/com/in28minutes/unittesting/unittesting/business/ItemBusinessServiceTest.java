package com.in28minutes.unittesting.unittesting.business;

import com.in28minutes.unittesting.unittesting.data.SomeDataService;
import com.in28minutes.unittesting.unittesting.model.Item;
import com.in28minutes.unittesting.unittesting.repositories.ItemRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class ItemBusinessServiceTest {

    @InjectMocks
    private ItemBusinessService business;
    @Mock
    private ItemRepository itemRepositoryMock;

    @Test
    public void calculateSumUsingDataService_basic() {

        when(itemRepositoryMock.findAll()).thenReturn(Arrays.asList(
                new Item(1, "item1", 10, 10),
                new Item(2, "item3", 20, 20)));
        assertEquals(100, business.retrieveAllItems().get(0).getValue());
        assertEquals(400, business.retrieveAllItems().get(1).getValue());
    }
}
