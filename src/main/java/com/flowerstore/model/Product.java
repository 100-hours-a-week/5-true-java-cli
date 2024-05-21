package com.flowerstore.model;

/**
 * Product 클래스는 공통 속성을 가진 상위 클래스입니다.
 * 이 클래스는 type 속성을 포함하고 있으며, 모든 제품의 기본 정보를 관리합니다.
 */
public class Product {
    private String type;

    public Product(String type) {
        this.type = type;
    }

    // Getter and Setter methods
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Product{" +
                "type='" + type + '\'' +
                '}';
    }
}
