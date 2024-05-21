package com.flowerstore.model;

/**
 * Flower 클래스는 꽃의 정보를 관리하는 클래스
 * 꽃의 종류, 수량, 다발 여부를 포함
 */
public class Flower {
    private String type;
    private int quantity;
    private boolean isBouquet;

    public Flower(String type, int quantity, boolean isBouquet) {
        this.type = type;
        this.quantity = quantity;
        this.isBouquet = isBouquet;
    }

    // Getter and Setter methods
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public boolean isBouquet() {
        return isBouquet;
    }

    public void setBouquet(boolean bouquet) {
        isBouquet = bouquet;
    }

    @Override
    public String toString() {
        return "Flower{" +
                "type='" + type + '\'' +
                ", quantity=" + quantity +
                ", isBouquet=" + isBouquet +
                '}';
    }
}
