package com.flowerstore.model;

/**
 * ShoppingBag 클래스는 Product 클래스를 상속받으며,
 * 쇼핑백 또는 바구니를 나타내는 클래스
 */
public class ShoppingBag extends Product {

    // ShoppingBag 객체를 초기화
    public ShoppingBag(String type) {
        super(type); // Product 의 생성자를 호출
    }

    // ShoppingBag 객체으 문자열 표현을 반환
    @Override
    public String toString() {
        return "ShoppingBag{" +
                "type='" + getType() + '\'' + // 상품 유형을 문자열로 반환
                '}';
    }
}
