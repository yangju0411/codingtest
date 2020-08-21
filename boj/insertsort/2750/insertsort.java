/*
백준 2750번
N개의 수가 주어졌을 때 이를 오름차순으로 정렬하는 문제
첫째 줄에 수의 개수 N(1 ≤ N ≤ 1,000)이 주어진다.
둘째 줄부터 N개의 줄에는 숫자가 주어진다. 이 수는 절댓값이 1,000보다 작거나 같은 정수이다. 수는 중복되지 않는다.
첫째 줄부터 N개의 줄에 오름차순으로 정렬한 결과를 한 줄에 하나씩 출력한다.
*/

// 삽입 정렬로 문제 풀기, 자바 사용

import java.util.Scanner;
public class insertsort {
    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);
        int temp, j;

        int [] nums = new int [sc.nextInt()];
        for (int i = 0; i < nums.length; i++) nums[i] = sc.nextInt();

        for (int i = 1; i < nums.length; i++) {
            // 인덱스 < i인 원소들의 집합이 정렬된 집합이고 i보다 크거나 같은 원소들의 집합이 정렬되지 않은 집합이다. 기본적으로 정렬된 집합에 0번 원소를 주고 시작하므로 i의 초기값은 1
            j = i; 
            while (j > 0) {
                if (nums[j-1] <= nums[j]) break; // 앞의 원소보다 크면 while 반복 탈출, 이 부분은 조건문 없이 while에 &를 사용하여 구현 가능할 듯
                else {
                    temp = nums[j-1];
                    nums[j-1] = nums[j];
                    nums[j] = temp;
                }
                j--;
            }
        }

        for (int i = 0; i < nums.length; i++) System.out.println(nums[i]);

        sc.close();

    }
}

// 평균 시간복잡도는 On^2이 된다.