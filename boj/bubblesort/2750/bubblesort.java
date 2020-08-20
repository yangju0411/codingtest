/*백준 2750번
N개의 수가 주어졌을 때 이를 오름차순으로 정렬하는 문제
첫째 줄에 수의 개수 N(1 ≤ N ≤ 1,000)이 주어진다.
둘째 줄부터 N개의 줄에는 숫자가 주어진다. 이 수는 절댓값이 1,000보다 작거나 같은 정수이다. 수는 중복되지 않는다.
첫째 줄부터 N개의 줄에 오름차순으로 정렬한 결과를 한 줄에 하나씩 출력한다.*/

// 버블 정렬로 문제 풀기, 자바 사용

import java.util.Scanner;
public class bubblesort {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int[] nums = new int[sc.nextInt()];
        int temp;

        for (int i = 0; i < nums.length; i++) {
            nums[i] = sc.nextInt();
        }

        for (int i = nums.length-1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (nums[j] > nums[j + 1]) { 
                    // 큰 반복 한 번에 가장 큰 수가 가장 뒤로 오게 함
                    temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }
        }

        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }

        sc.close();
    }
}

/* 이 정렬의 시간 복잡도는 n-1개인 i번째 원소를 n-i번 비교하므로 On^2이 된다.