def solution(a, b):
    answer = 0
    if a > b:
    	tmp = a
    	a = b
    	b = tmp
    for i in range(a,b+1):
    	answer += i
    return answer

def adder(a,b):
	if a > b: a, b = b, a
	return sum(range(a, b+1))

def adder2(a,b):
	return (abs(a-b)+1)*(a+b)//2

a = 3
b = 5
print(f'Solution : {solution(a, b)}')
print(adder(a, b))
print(adder2(a, b))

