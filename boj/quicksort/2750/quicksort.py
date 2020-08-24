'''
백준 2750번
N개의 수가 주어졌을 때 이를 오름차순으로 정렬하는 문제
첫째 줄에 수의 개수 N(1 ≤ N ≤ 1,000)이 주어진다.
둘째 줄부터 N개의 줄에는 숫자가 주어진다. 이 수는 절댓값이 1,000보다 작거나 같은 정수이다. 수는 중복되지 않는다.
첫째 줄부터 N개의 줄에 오름차순으로 정렬한 결과를 한 줄에 하나씩 출력한다.
'''

# 퀵 정렬로 문제 풀기, 파이썬 사용

def partition(list, begin, end): # pivot을 반환하여 부분집합으로 분할하는 함수
    pivot = (begin + end) // 2
    L = begin
    R = end

    while L < R:
        while list[L] < list[pivot] and L < R: L += 1
        while list[R] >= list[pivot] and L < R: R -= 1
        if L < R:
            list[L], list[R] = list[R], list[L]
            if L == pivot: pivot = R #L이 pivot과 만난 경우 pivot의 값이 R의 값과 바뀌었기 때문에 pivot을 R의 위치로 변경한다.
    list[R], list[pivot] = list[pivot], list[R]
    return R
    
def quicksort(list, begin, end):
    if begin < end:
        p = partition(list, begin, end)
        quicksort(list, begin, p-1) # 피봇의 왼쪽 부분집합에 퀵정렬
        quicksort(list, p + 1, end) # 피봇의 오른쪽 부분집합에 퀵정렬


nums = []

for i in range(int(input())) : nums.append(int(input()))

quicksort(nums, 0, len(nums) - 1)

for x in nums: print(x)


