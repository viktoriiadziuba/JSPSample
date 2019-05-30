package com.sample;

import com.sample.model.ClothesType;

import java.util.ArrayList;
import java.util.List;

public class ClothesService {

    public List getAvailableBrands(ClothesType type) {
        List brands = new ArrayList();

        if(type.equals(ClothesType.SHIRT)) {
            brands.add("ZARA");
            brands.add("LOUIS VUITTON");
            brands.add("RALPH LAUREN");
        } else if(type.equals(ClothesType.TROUSERS)) {
            brands.add("Arber");
            brands.add("PRADA");
            brands.add("BURBERRY");
        } else if(type.equals(ClothesType.SHOES)) {
            brands.add("ZARA");
            brands.add("CONVERSE");
            brands.add("VERSACE");
        } else {
            brands.add("No brands available");
        }

        return brands;
    }
}
