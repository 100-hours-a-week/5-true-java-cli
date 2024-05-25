package com.flowerstore;

import com.flowerstore.model.*;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Main 클래스는 사용자와의 상호작용을 처리하는 메인 클래스
 * 사용자의 입력을 받아 꽃 주문을 처리
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // 사용자 입력을 받기 위한 Scanner 객체 생성

        try {
            // 시작 인사말을 출력
            System.out.println("안녕하세요! 트루 꽃가게에 오신걸 환영합니다😊");

            // 꽃 종류 선택
            System.out.println("원하는 꽃을 골라주세요 (1: 🌹장미🌹, 2: 🌷튤립🌷, 3: 🌻해바라기🌻, 4: 🌼하이신스🌼): ");
            int flowerChoice = scanner.nextInt(); // 사용자로부터 꽃 종류를 입력받음
            String flowerType = switch (flowerChoice) { // 사용자가 선택한 번호에 따라 꽃 종류를 설정
                case 1 -> "장미"; // 선택된 번호가 1인 경우 "장미"로 설정
                case 2 -> "튤립"; // 선택된 번호가 2인 경우 "튤립"으로 설정
                case 3 -> "해바라기"; // 선택된 번호가 3인 경우 "해바라기"로 설정
                case 4 -> "하이신스"; // 선택된 번호가 4인 경우 "하이신스"로 설정
                default -> throw new IllegalArgumentException("잘못된 입력입니다"); // 예상하지 못한 값이 입력된 경우 예외를 던짐
            };

            // 다발 또는 송이 선택
            System.out.println("다발이면 1, 송이면 2를 입력하세요: ");
            boolean isBouquet = scanner.nextInt() == 1; // 다발 여부를 사용자로부터 입력받음. 1이면 다발(true), 2면 송이(false)

            // 수량 입력
            System.out.println("수량을 입력하세요: ");
            int quantity = scanner.nextInt(); // 꽃의 수량을 사용자로부터 입력받음
            if (quantity <= 0) { // 유효성 검사: 수량이 0보다 작거나 같으면 예외를 던짐
                throw new IllegalArgumentException("수량은 0보다 큰 자연수여야 합니다.");
            }

            // Flower 객체를 생성하여 flower 변수에 저장
            Flower flower = new Flower(flowerType, quantity, isBouquet);

            // 쇼핑백 또는 바구니 선택
            System.out.println("쇼핑백이면 1, 바구니면 2를 입력하세요: ");
            String packagingType = scanner.nextInt() == 1 ? "쇼핑백" : "바구니"; // 포장 유형을 사용자로부터 입력받음. 1이면 "쇼핑백", 2면 "바구니"

            // 포장 추가 여부
            System.out.println("포장을 추가하시겠습니까? (Y/N): ");
            boolean isPackaged = scanner.next().equalsIgnoreCase("Y"); // 포장 추가 여부를 사용자로부터 입력받음. Y이면 true, N이면 false
            String packagingDetail = "";

            if (isPackaged) { // 포장을 추가하는 경우
                System.out.println("편지지면 1, 꽃말 카드면 2를 입력하세요: ");
                packagingDetail = scanner.nextInt() == 1 ? "편지지" : "꽃말 카드"; // 포장 세부 사항을 사용자로부터 입력받음. 1이면 "편지지", 2면 "꽃말 카드"
            }

            // Order 객체를 생성하여 order 변수에 저장
            Order order = new Order(flower, packagingType, isPackaged, packagingDetail);

            // 주문 정보 출력
            System.out.println("트루 꽃가게를 이용해 주셔서 감사합니다! 🌸향기로운 하루 되세요🌸");

            // 주문 정보를 출력
            System.out.println("주문 정보: " + order);

        } catch (InputMismatchException e) { // 숫자가 아닌 문자가 입력되면 예외 처리
            System.out.println("잘못된 입력입니다. 자연수를 입력해주세요."); // 예외 발생 시 사용자에게 잘못된 입력임을 알림
        } catch (IllegalArgumentException e) { // 보기에 없는 값을 입력하면 예외 처림
            System.out.println(e.getMessage()); // 예외 발생 시 예외 메시지를 출력하여 사용자에게 알림
        } finally {
            scanner.close();
        }
    }
}
