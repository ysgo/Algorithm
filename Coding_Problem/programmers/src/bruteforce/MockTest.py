def solution(answers):
	first = [1, 2, 3, 4, 5]
	second = [2, 1, 2, 3, 2, 4, 2, 5]
	third = [3, 3, 1, 1, 2, 2, 4, 4, 5, 5]
	cnt = [0 for i in range(3)]
	for i in range(len(answers)):
		if answers[i] == first[i%5]:
			cnt[0] += 1
		if answers[i] == second[i%8]:
			cnt[1] += 1
		if answers[i] == third[i%10]:
			cnt[2] += 1
	maxNum = max(cnt)
	arr = []
	for i in range(len(cnt)):
		if cnt[i] == maxNum:
			arr.append(i)
	answer = [0 for i in range(len(arr))]
	for i in range(len(arr)):
		answer[i] = arr[i]+1

	# for idx, s in enumerate(cnt):
	# 	if s == max(cnt):
	# 		answer.append(idx + 1)
	return answer

def solution1(answers):
	p = [[1, 2, 3, 4, 5],
         [2, 1, 2, 3, 2, 4, 2, 5],
         [3, 3, 1, 1, 2, 2, 4, 4, 5, 5]]
	s = [0] * len(p)
	for q, a in enumerate(answers):
		for i, v in enumerate(p):
			if a == v[q % len(v)]:
				s[i] += 1
	return [i + 1 for i, v in enumerate(s) if v == max(s)]

answers = [1, 2, 3, 4, 5]
answers1 = [1, 3, 2, 4, 2]
print(f'Solution : {solution(answers)}')
print(f'Solution1 : {solution(answers1)}')
print(f'Solution2 : {solution1(answers1)}')