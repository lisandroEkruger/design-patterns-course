package com.app.factories;

import com.app.ClothesFactory;
import com.app.products.Shirt;
import com.app.products.Shoe;
import com.app.products.Trousers;
import com.app.products.shirt.GalaShirt;
import com.app.products.shoe.GalaShoe;
import com.app.products.trousers.GalaTrousers;

public class GalaClothesFactory implements ClothesFactory {

    @Override
    public Shoe createShoes() {
        return new GalaShoe();
    }

    @Override
    public Shirt createShirt() {
        return new GalaShirt();
    }

    @Override
    public Trousers createTrousers() {
        return new GalaTrousers();
    }
}
