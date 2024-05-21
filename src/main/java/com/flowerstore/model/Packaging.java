package com.flowerstore.model;

/**
 * Packaging 클래스는 Product 클래스를 상속받으며,
 * 추가 포장 옵션을 나타내는 클래스
 */
public class Packaging extends Product {
    private boolean isAdditionalPackaging;
    private String packagingOption;

    public Packaging(String type, boolean isAdditionalPackaging, String packagingOption) {
        super(type);
        this.isAdditionalPackaging = isAdditionalPackaging;
        this.packagingOption = packagingOption;
    }

    // Getter and Setter methods
    public boolean isAdditionalPackaging() {
        return isAdditionalPackaging;
    }

    public void setAdditionalPackaging(boolean additionalPackaging) {
        isAdditionalPackaging = additionalPackaging;
    }

    public String getPackagingOption() {
        return packagingOption;
    }

    public void setPackagingOption(String packagingOption) {
        this.packagingOption = packagingOption;
    }

    @Override
    public String toString() {
        return "Packaging{" +
                "type='" + getType() + '\'' +
                ", isAdditionalPackaging=" + isAdditionalPackaging +
                ", packagingOption='" + packagingOption + '\'' +
                '}';
    }
}
