def solution(n):
    answer = 0
    for i in range(1,n+1):
    	if n % i == 0:
    		answer += i;
    return answer

def solution2(n):
	return n + sum([i for i in range(1,(n//2)+1) if n % i == 0])
def sumDivisor(n):
    return sum(filter(lambda x: n % x == 0, range(1, n + 1)))

n = 12
print("answer :", solution(n))
print("answer :", solution2(n))

n = 5
print("answer :", solution(n))