package com.app.products.shirt;

import com.app.products.Shirt;

public class GalaShirt implements Shirt {

    @Override
    public boolean hasLongSleeves() {
        System.out.println("Camisa de gala -- Tiene mangas largas? -> Si");
        return true;
    }

    @Override
    public boolean hasButtons() {
        System.out.println("Camisa de gala -- Tiene botones? -> Si");
        return true;
    }
}
