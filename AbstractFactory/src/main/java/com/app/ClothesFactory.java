package com.app;

import com.app.products.Shirt;
import com.app.products.Shoe;
import com.app.products.Trousers;

public interface ClothesFactory {

    Shoe createShoes();
    Shirt createShirt();
    Trousers createTrousers();
}
