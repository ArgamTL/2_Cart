package ru.mai.basket;

import ru.mai.basket.Basket;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

public class Cart implements Basket {

    private Map<String, Integer> products = new HashMap<>();

    @Override
    public void addProduct(String product, int quantity) {
		if ( (!product.isEmpty()) && (quantity > 0) ){
		    if(this.products.containsKey(product)){
			    this.products.put(product, products.get(product) + quantity);
		    } else {
                this.products.put(product, quantity);
		    }
	    } else {
            throw new IllegalArgumentException("Product " + product + " can't be empty or less than zero");
        }

    }

    @Override
    public void removeProduct(String product) {
        if(!product.isEmpty() && this.products.containsKey(product)) {
            this.products.remove(product);
        } else {
            throw new IllegalArgumentException("Product " + product + " нет в корзине");
        }
    }

    @Override
    public int getProductQuantity(String product) {
        if (!product.isEmpty() && this.products.containsKey(product)) {
            return this.products.get(product);
        } else {
            throw new IllegalArgumentException("Product " + product + " нет в корзине");
        }
    }

    @Override
    public void updateProductQuantity(String product, int quantity) {
        if((!product.isEmpty() && this.products.containsKey(product)) && (quantity > 0)) {
            this.products.put(product, quantity);
        } else {
            throw new IllegalArgumentException("Product can't be empty or less than zero");
        }
    }

    @Override
    public List<String> getProducts() {
        return new ArrayList<String>(products.keySet());
    }
}