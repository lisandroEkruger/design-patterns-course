package com.app.factories;

import com.app.ClothesFactory;
import com.app.products.Shirt;
import com.app.products.Shoe;
import com.app.products.Trousers;
import com.app.products.shirt.SportShirt;
import com.app.products.shoe.SportShoe;
import com.app.products.trousers.SportTrousers;

public class SportClothesFactory implements ClothesFactory {

    @Override
    public Shoe createShoes() {
        return new SportShoe();
    }

    @Override
    public Shirt createShirt() {
        return new SportShirt();
    }

    @Override
    public Trousers createTrousers() {
        return new SportTrousers();
    }
}
