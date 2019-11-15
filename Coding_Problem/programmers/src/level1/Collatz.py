def solution(num):
	answer = 0
	while num != 1:
		answer += 1
		if answer >= 500:
			return -1
		if num % 2 == 0:
			num //= 2
		else:
			num = num * 3 + 1
	return answer

def solution1(num):
	for i in range(500):
		if num == 1:
			return i + 1
		num = num / 2 if num % 2 == 0 else num * 3 + 1
	return -1

num = [6, 16, 626331]	# 8, 4, -1
for i, v in enumerate(num):
	print(f'Solution{i+1} : {solution(v)}')