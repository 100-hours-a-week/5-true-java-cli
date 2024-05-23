package com.flowerstore.model;

/**
 * Packaging 클래스는 Product 클래스를 상속받으며,
 * 추가 포장 옵션을 나타내는 클래스
 */
public class Packaging extends Product {
    private boolean isAdditionalPackaging; // 추가 포장 여부를 저장하는 속성
    private String packagingOption; // 포장 옵션을 저장하는 속성

    // Packaging 객체 초기화
    public Packaging(String type, boolean isAdditionalPackaging, String packagingOption) {
        super(type); // Product의 생성자 호출
        this.isAdditionalPackaging = isAdditionalPackaging; // 추가 포장 여부 설정
        this.packagingOption = packagingOption; // 포장 옵션 설정
    }

    // isAdditionalPackaging 속성을 반환
    public boolean isAdditionalPackaging() {
        return isAdditionalPackaging; // 추가 포장 여부 반환
    }

    // isAdditionalPackaging 속성을 설정 (추가 포장 여부 설정)
    public void setAdditionalPackaging(boolean additionalPackaging) {
        isAdditionalPackaging = additionalPackaging; // 추가 포장 여부 설정
    }

    // packagingOption  속성을 반환 (포장 옵션 반환)
    public String getPackagingOption() {
        return packagingOption; //포장 옵션 반환
    }

    // packagingOption 속성을 설정 (포장 옵션 설정)
    public void setPackagingOption(String packagingOption) {
        this.packagingOption = packagingOption; // 포장 옵션 설정
    }

    // Packaging 객체의 문자열 표현을 반환
    @Override
    public String toString() {
        return "Packaging{" +
                "type='" + getType() + '\'' + // 상품 유형을 문자열로 반환
                ", isAdditionalPackaging=" + isAdditionalPackaging + // 추가 포장 여부를 문자열로 반환
                ", packagingOption='" + packagingOption + '\'' + // 포장 옵션을 문자열로 반환
                '}';
    }
}
