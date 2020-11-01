def solution(n):
    answer = 0
    while True:
    	if n == 0:
    		break
    	else:
    		answer += int(n % 10)
    		n /= 10
    return answer

def solution2(n):
	return sum([int(i) for i in str(n)])

def recur(n):
	if n < 10:
		return n;
	return (n % 10) + recur(n // 10)
	
n = 123
print(solution(n)) ## 6
print(solution2(n))
print("결과 : {}" .format(recur(123)));
n = 987
print(solution(n)) ## 24