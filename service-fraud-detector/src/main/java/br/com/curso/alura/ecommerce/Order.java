package br.com.curso.alura.ecommerce;

import java.math.BigDecimal;

public class Order {

    private final String useId, orderId;
    private final BigDecimal amount;

    public Order(String useId, String orderId, BigDecimal amount) {
        this.useId = useId;
        this.orderId = orderId;
        this.amount = amount;
    }
}
