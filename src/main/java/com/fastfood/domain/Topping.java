package com.fastfood.domain;

import java.io.Serializable;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Администратор on 07.02.2017.
 */
public enum  Topping implements Serializable{

    COLA,
    JUICE,
    TEA,
    MILK,
    BEER,
    SOUCE,
    VEGETABLES,
    SPOONandCLASS;

    public static List<Topping> asList(){
        Topping[] ali = Topping.values();
        return Arrays.asList(ali);
    }
    @Override
    public String toString() {
        return super.toString();
    }
}
