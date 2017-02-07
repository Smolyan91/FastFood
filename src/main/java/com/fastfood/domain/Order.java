package com.fastfood.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Администратор on 07.02.2017.
 *
 * Класс Order имеет свойства,хранящие всю необходимую информацию о заказе, включая информацию о клиенте,
 * список заказанных пицц и сведения об оплате.
 */
public class Order implements Serializable{

    //Сам serialVersionUID необходим для динамической проверки возможности десериализации. Если у источника и приемника
    // различные serialVersionUID, то среда выполнения в праве считать, что это разные классы, и поэтому и выбросит
    // InvalidClassExceptions.
    private static final long serialVersionUID = 1L;

    private Customer customer;
    private List<FastFood> fastFoods;
    private Payment payment;

    public Order(){
        fastFoods = new ArrayList<FastFood>();
        customer = new Customer();
    }

    public void addFood(FastFood fastFood){
        fastFoods.add(fastFood);
    }

    public float getTotal(){
        return 0.0f;
    }
    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public List<FastFood> getFastFoods() {
        return fastFoods;
    }

    public void setFastFoods(List<FastFood> fastFoods) {
        this.fastFoods = fastFoods;
    }

    public Payment getPayment() {
        return payment;
    }

    public void setPayment(Payment payment) {
        this.payment = payment;
    }
}
