package com.flowerstore.model;

/**
 * ShoppingBag 클래스는 Product 클래스를 상속받으며,
 * 쇼핑백 또는 바구니를 나타내는 클래스입니다.
 */
public class ShoppingBag extends Product {

    public ShoppingBag(String type) {
        super(type);
    }

    @Override
    public String toString() {
        return "ShoppingBag{" +
                "type='" + getType() + '\'' +
                '}';
    }
}
