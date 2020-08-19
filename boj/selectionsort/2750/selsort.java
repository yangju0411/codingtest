/*
백준 2750번
N개의 수가 주어졌을 때 이를 오름차순으로 정렬하는 문제
첫째 줄에 수의 개수 N(1 ≤ N ≤ 1,000)이 주어진다.
둘째 줄부터 N개의 줄에는 숫자가 주어진다. 이 수는 절댓값이 1,000보다 작거나 같은 정수이다. 수는 중복되지 않는다.
첫째 줄부터 N개의 줄에 오름차순으로 정렬한 결과를 한 줄에 하나씩 출력한다.
*/

//선택 정렬로 문제 풀기, 자바 사용

import java.util.Scanner;
public class selsort {
    public static void main(String args[]) {

        int min, temp; // 가장 작은 수의 인덱스를 저장할 변수와 정렬 시 임시로 수를 저장할 변수 선언

        Scanner sc = new Scanner(System.in); // 스캐너 객체 생성
        int [] number = new int [sc.nextInt()]; // 첫째 줄의 수를 스캐너로 입력받아 해당 크기의 배열 생성
        
        for (int i = 0; i < number.length; i++) {
            number[i] = sc.nextInt(); // 둘째 줄 수부터 배열에 삽입함
        }
        
        for (int i = 0; i < number.length - 1; i++) {
            min = i;
            for (int j = i + 1; j < number.length; j++) {
                if (number[min] > number[j]) min = j; // 오름차순이므로 i번 수보다 인덱스가 큰 j번 수들과 비교하여 더 작은 것의 자릿수를 min에 저장함
            }
            temp = number[i];
            number[i] = number[min];
            number[min] = temp; //temp를 이용하여 i번 수와 min 수를 교체하였음
        }

        for (int i = 0; i < number.length; i++) System.out.println(number[i]);

        sc.close();
    }
}