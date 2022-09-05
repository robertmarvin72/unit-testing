package com.in28minutes.unittesting.unittesting.controller;

import com.in28minutes.unittesting.unittesting.model.Item;
import com.in28minutes.unittesting.unittesting.repositories.ItemRepository;
import org.json.JSONException;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.skyscreamer.jsonassert.JSONAssert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;

import static org.mockito.Mockito.when;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class ItemControllerIT {

    @Autowired
    private TestRestTemplate restTemplate; //Mocking out external dependency. Not good to be dependent on data in db.

    //@MockBean
    //private ItemRepository repository;

    @Test
    public void contextLoads() throws JSONException {
        // Use when here to control what to return from repository.

        String response = this.restTemplate.getForObject("/all-items-from-database", String.class);
        JSONAssert.assertEquals("[{id: 10001}, {id: 10002}, {id: 10003}]", response, false);
    }
}
