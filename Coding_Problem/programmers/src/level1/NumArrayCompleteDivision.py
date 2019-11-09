def solution(arr, divisor):
	answer = []
	for i in arr:
		if i % divisor == 0:
			answer.append(i)
	if len(answer) == 0:
		answer.append(-1)
	answer.sort()
	return answer

def solution2(arr, divisor):
	arr = [x for x in arr if x % divisor == 0]
	arr.sort()
	return arr if len(arr) != 0 else [-1]

arr = [5, 9, 7, 10]		# [5, 10]
divisor = 5
arr2 = [2, 36, 1, 3]	# [1, 2, 3, 36]
divisor2 = 1
arr3 = [3,2,6]			# [-1]
divisor3 = 10
print(f'Solution1 : {solution(arr, divisor)}')
print(f'Solution2 : {solution(arr2, divisor2)}')
print(f'Solution3 : {solution2(arr3, divisor3)}')