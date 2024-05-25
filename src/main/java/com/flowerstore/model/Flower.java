package com.flowerstore.model;

/**
 * Flower 클래스는 꽃의 정보를 관리하는 클래스
 * 꽃의 종류, 수량, 다발 여부를 포함
 */
public class Flower {
    private String type; // 꽃의 종류를 저장하는 속성
    private int quantity; // 꽃의 수량을 저장하는 속성
    private boolean isBouquet; // 꽃이 다발인지 여부를 저장하는 속성

    // Flower 객체를 초기화
    public Flower(String type, int quantity, boolean isBouquet) {
        if (quantity <= 0) { //  수량이 0보다 작거나 같으면 예외를 던짐
            throw new IllegalArgumentException("수량은 0보다 큰 자연수여야 합니다.");
        }
        this.type = type; // 꽃의 종류를 설정
        this.quantity = quantity; // 꽃의 수량을 설정
        this.isBouquet = isBouquet; // 꽃이 다발인지 여부를 설정
    }

    // 꽃의 종류를 반환
    public String getType() {
        return type;
    }

    // 꽃의 종류를 설정
    public void setType(String type) {
        this.type = type;
    }

    // 꽃의 수량을 반환
    public int getQuantity() {
        return quantity;
    }

    // 꽃의 수량을 설정
    public void setQuantity(int quantity) {
        if (quantity <= 0) { //수량이 0보다 작거나 같으면 예외를 던짐
            throw new IllegalArgumentException("수량은 0보다 큰 자연수여야 합니다.");
        }
        this.quantity = quantity;
    }

    // 꽃이 다발인지 여부를 반환
    public boolean isBouquet() {
        return isBouquet;
    }

    // 꽃이 다발인지 여부를 설정
    public void setBouquet(boolean bouquet) {
        isBouquet = bouquet;
    }

    // Flower 객체의 문자열 변환
    @Override
    public String toString() {
        return "Flower{" +
                "type='" + type + '\'' +
                ", quantity=" + quantity +
                ", isBouquet=" + isBouquet +
                '}';
    }
}
