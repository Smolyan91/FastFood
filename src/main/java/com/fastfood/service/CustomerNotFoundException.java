package com.fastfood.service;

/**
 * Created by Администратор on 07.02.2017.
 */
@SuppressWarnings("serial")
public class CustomerNotFoundException extends Exception {
    public CustomerNotFoundException() {
    }

    public CustomerNotFoundException(String message) {
        super(message);
    }
}
