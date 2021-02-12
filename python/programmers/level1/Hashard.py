def solution(x):
	answer = True
	result = 0
	tmp = x
	while tmp != 0:
		result += tmp % 10
		tmp //= 10
	if x % result != 0:
		answer = False
	return answer

def solution1(x):
	s = str(x)
	a = 0
	for i in range(len(s)):
		a += int(s[i])
	return True if x % a == 0 else False

def solution3(x):
	return x % sum([int(c) for c in str(x)]) == 0

arr = [10, 12, 11, 13]
print(f'Solution : {solution(arr[1])}')
print(f'Solution3 : {solution3(arr[1])}')