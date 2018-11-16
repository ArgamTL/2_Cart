package ru.mai.basket;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class CartTest {

    @Test
    public void testAddProduct() {

        // Инициализация
        Cart products = new Cart();

        // действия
        products.addProduct("TV SET", 10);

        // проверка
        Assert.assertEquals(Arrays.asList("TV SET"), products.getProducts());
        Assert.assertEquals(10, products.getProductQuantity("TV SET"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testRemoveProduct() {

        // Инициализация
        Cart products = new Cart();

        // действия
        products.addProduct("TV SET", 10);
        products.removeProduct("TV SET");

        // проверка
        Assert.assertEquals(0, products.getProducts().size());
        Assert.assertEquals(0, products.getProductQuantity("TV SET"));
    }

}
