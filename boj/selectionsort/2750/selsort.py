"""
백준 2750번
N개의 수가 주어졌을 때 이를 오름차순으로 정렬하는 문제
첫째 줄에 수의 개수 N(1 ≤ N ≤ 1,000)이 주어진다.
둘째 줄부터 N개의 줄에는 숫자가 주어진다. 이 수는 절댓값이 1,000보다 작거나 같은 정수이다. 수는 중복되지 않는다.
첫째 줄부터 N개의 줄에 오름차순으로 정렬한 결과를 한 줄에 하나씩 출력한다.
"""
# 선택 정렬로 문제 풀기, 파이썬 사용
# 자바에서 썼던 형식 그대로 구현

len = int(input()) # 첫째 수 입력 받아 저장
num = []
min, temp = 0, 0 # 최솟값의 인덱스를 저장할 변수 min, 수를 교환할 때 임시로 저장할 변수 temp생성

for i in range(len):
    num.append(int(input())) # 리스트에 수 입력

for i in range(len):
    min = i
    for j in range(i+1, len):
        if num[j] < num[min]:
            min = j # 오름차순이므로 i번 수보다 인덱스가 큰 j번 수들과 비교하여 더 작은 것의 자릿수를 min에 저장함

    temp = num[i]
    num[i] = num[min]
    num[min] = temp # temp를 이용하여 i번 수와 min 수를 교체하였음

for x in num:
    print("%d" %x)