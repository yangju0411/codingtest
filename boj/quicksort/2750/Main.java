/*
백준 2750번
N개의 수가 주어졌을 때 이를 오름차순으로 정렬하는 문제
첫째 줄에 수의 개수 N(1 ≤ N ≤ 1,000)이 주어진다.
둘째 줄부터 N개의 줄에는 숫자가 주어진다. 이 수는 절댓값이 1,000보다 작거나 같은 정수이다. 수는 중복되지 않는다.
첫째 줄부터 N개의 줄에 오름차순으로 정렬한 결과를 한 줄에 하나씩 출력한다.
*/

// 퀵 정렬로 문제 풀기, 자바 사용

import java.util.Scanner;

public class Main {
	public static void qSort(int a[], int begin, int end) {
		if (begin < end) {
			int p = partition(a, begin, end);
			qSort(a, begin, p-1);
			qSort(a, p+1, end);
		}
	}
	
	public static int partition(int a[], int begin, int end) {
		int pivot = (begin + end) / 2;
		int L = begin;
		int R = end;
		int temp;
		while (L < R) {
			while(a[L] < a[pivot] && L < R) L++;
			while(a[R] >= a[pivot] && L < R) R--;
			if (L < R) {
				if (L == pivot) pivot = R;
				temp = a[L];
				a[L] = a[R];
				a[R] = temp;
			}
		}
		temp = a[pivot];
		a[pivot] = a[R];
		a[R] = temp;
		return R;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int [] number = new int [sc.nextInt()];

        for (int i = 0; i < number.length; i++) {
           number[i] = sc.nextInt();
        }
    
        qSort(number, 0, number.length - 1);
    
        for (int i = 0; i < number.length; i++) System.out.println(number[i]);
	}
}