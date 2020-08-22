'''
백준 2750번
N개의 수가 주어졌을 때 이를 오름차순으로 정렬하는 문제
첫째 줄에 수의 개수 N(1 ≤ N ≤ 1,000)이 주어진다.
둘째 줄부터 N개의 줄에는 숫자가 주어진다. 이 수는 절댓값이 1,000보다 작거나 같은 정수이다. 수는 중복되지 않는다.
첫째 줄부터 N개의 줄에 오름차순으로 정렬한 결과를 한 줄에 하나씩 출력한다.
'''

# 삽입 정렬로 문제 풀기, 파이썬 사용

nums = []
length = int(input())
for i in range(length):
    nums.append(int(input()))
    
for i in range(1, length):
    j = i
    while j > 0 and nums[j] < nums[j-1]:
        nums[j-1], nums[j] = nums[j], nums[j-1]
        j = j - 1
        
for x in nums:
    print(x)

