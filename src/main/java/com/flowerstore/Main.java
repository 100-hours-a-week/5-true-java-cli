package com.flowerstore;

import com.flowerstore.model.*;

import java.util.Scanner;

/**
 * Main 클래스는 사용자와의 상호작용을 처리하는 메인 클래스입니다.
 * 사용자의 입력을 받아 꽃 주문을 처리합니다.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("안녕하세요! 트루 꽃가게에 오신걸 환영합니다\uD83D\uDE0A");

        // 꽃 종류 선택
        System.out.println("원하는 꽃을 골라주세요 (1: \uD83C\uDF39장미\uD83C\uDF39, 2: \uD83C\uDF37튤립\uD83C\uDF37, 3: \uD83C\uDF3B해바라기\uD83C\uDF3B, 4: \uD83E\uDEBB하이신스\uD83E\uDEBB): ");
        int flowerChoice = scanner.nextInt();
        String flowerType = switch (flowerChoice) {
            case 1 -> "장미";
            case 2 -> "튤립";
            case 3 -> "해바라기";
            case 4 -> "하이신스";
            default -> throw new IllegalArgumentException("잘못된 선택입니다.");
        };

        // 다발 또는 송이 선택
        System.out.println("다발이면 1, 송이면 2를 입력하세요: ");
        boolean isBouquet = scanner.nextInt() == 1;

        // 수량 입력
        System.out.println("수량을 입력하세요: ");
        int quantity = scanner.nextInt();

        Flower flower = new Flower(flowerType, quantity, isBouquet);

        // 쇼핑백 또는 바구니 선택
        System.out.println("쇼핑백이면 1, 바구니면 2를 입력하세요: ");
        String packagingType = scanner.nextInt() == 1 ? "쇼핑백" : "바구니";

        // 포장 추가 여부
        System.out.println("포장을 추가하시겠습니까? (Y/N): ");
        boolean isPackaged = scanner.next().equalsIgnoreCase("Y");
        String packagingDetail = "";

        if (isPackaged) {
            System.out.println("편지지면 1, 꽃말 카드면 2를 입력하세요: ");
            packagingDetail = scanner.nextInt() == 1 ? "편지지" : "꽃말 카드";
        }

        Order order = new Order(flower, packagingType, isPackaged, packagingDetail);

        // 주문 정보 출력
        System.out.println("트루 꽃가게를 이용해 주셔서 감사합니다! \uD83C\uDF38향기로운 하루 되세요\uD83C\uDF38");

        System.out.println("주문 정보: " + order);
    }
}
