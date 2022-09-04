package com.in28minutes.unittesting.unittesting;

import org.springframework.stereotype.Component;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Transient;

@Entity
public class AnotherItem {
    @Id
    @GeneratedValue
    private int theId;
    private String theName;

    public AnotherItem(int id, String name) {
        this.theId = id;
        this.theName = name;

    }

    public AnotherItem() {

    }

    public int getId() {
        return theId;
    }

    public String getName() {
        return theName;
    }

}
