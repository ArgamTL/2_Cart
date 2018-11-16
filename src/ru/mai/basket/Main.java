package ru.mai.basket;

public class Main {
    public static void main(String[] args) {

        Cart products = new Cart();
        products.addProduct("TV SET", 10);
        products.addProduct("TV SET", 5);
        products.addProduct("TV SET", 5);

        products.addProduct("Camera", 3);
        products.addProduct("LapTop", 5);
        products.addProduct("Monitor", 5);

        //products.removeProduct("TV SET");
        System.out.println(products.getProducts());
        System.out.println(products.getProductQuantity("TV SET"));
        products.updateProductQuantity("TV SET", 4);
        assert products.getProductQuantity("TV SET") == 8 : "Failure";
        System.out.println(products.getProductQuantity("TV SET"));



    }
}