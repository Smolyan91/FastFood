package com.fastfood.domain;

import java.io.Serializable;

/**
 * Created by Администратор on 07.02.2017.
 */
public  abstract class Payment implements Serializable {

    private static final long serialVersionUID = 1L;
    private float amount;

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }
}
