package com.flowerstore.model;

/**
 * Order 클래스는 사용자의 주문 정보를 관리하는 클래스
 * 꽃, 포장 타입, 포장 추가 여부 및 추가 포장 옵션을 포함
 */
public class Order {
    private Flower flower;
    private String packagingType;
    private boolean isPackaged;
    private String packagingDetail;

    public Order(Flower flower, String packagingType, boolean isPackaged, String packagingDetail) {
        this.flower = flower;
        this.packagingType = packagingType;
        this.isPackaged = isPackaged;
        this.packagingDetail = packagingDetail;
    }

    // Getter and Setter methods
    public Flower getFlower() {
        return flower;
    }

    public void setFlower(Flower flower) {
        this.flower = flower;
    }

    public String getPackagingType() {
        return packagingType;
    }

    public void setPackagingType(String packagingType) {
        this.packagingType = packagingType;
    }

    public boolean isPackaged() {
        return isPackaged;
    }

    public void setPackaged(boolean packaged) {
        isPackaged = packaged;
    }

    public String getPackagingDetail() {
        return packagingDetail;
    }

    public void setPackagingDetail(String packagingDetail) {
        this.packagingDetail = packagingDetail;
    }

    @Override
    public String toString() {
        return "Order{" +
                "flower=" + flower +
                ", packagingType='" + packagingType + '\'' +
                ", isPackaged=" + isPackaged +
                ", packagingDetail='" + packagingDetail + '\'' +
                '}';
    }
}
