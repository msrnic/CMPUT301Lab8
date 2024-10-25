package com.example.lab8;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;


//import org.junit.Before;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.NoSuchElementException;

public class CustomListTest {
    private CustomList list;
    /**
     * create a mocklist for my citylist
     * @return
     */
    public CustomList MockCityList(){
        list = new CustomList(null,new ArrayList<>());
        return list;
    }

    /**
     * get the size of the list
     * increase the list by adding a new city
     * check if our current size matches the initial size
     plus one
     */
    @Test
    public void addCityTest(){
        list = MockCityList();
        int listSize = list.getCount();
        list.addCity(new City("Estevan", "SK"));
        assertEquals(list.getCount(),listSize + 1);
    }
    @Test
    public void deleteCityTest(){
        list = MockCityList();
        int listSize = list.getCount();
        City city = new City("London", "ON");
        list.addCity(city);
        assertEquals(list.getCount(),listSize + 1);
        list.deleteCity(city);
        assertEquals(list.getCount(), listSize);
    }
    @Test
    public void countCitiesTest() {
        list = MockCityList();
        City city = new City("London", "ON");
        list.addCity(city);
        int cityCount = list.countCities();
        assertEquals(list.getCount(), cityCount);
    }
    @Test
    public void testHasCity() {
        int newCount;
        list = MockCityList();
        City city = new City("London", "ON");
        list.addCity(city);
        assertTrue(list.getCities().contains(city));
        int oldCount = list.getCount();
        newCount = list.hasCity(city);
        assertEquals(oldCount - 1, newCount);
        assertFalse(list.getCities().contains(city));
    }
}
