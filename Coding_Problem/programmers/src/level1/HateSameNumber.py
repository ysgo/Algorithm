def solution(arr):
	answer = []
	prev = -1
	for i in arr:
		if prev != i:
			answer.append(i)
			prev = i
	return answer

def no_continuous(s):
	a = []
	for i in s:
		if a[-1:] == [i]: continue
		a.append(i)
	return a

def no_continuous2(s):
    return [s[i] for i in range(len(s)) if s[i] != s[i+1:i+2]]

arr = [1,1,3,3,0,1,1]	# [1,3,0,1]
arr2 = [4,4,4,3,3]		# [4,3]
print(f'Solution1 : {solution(arr)}')
print(f'Solution2 : {solution(arr2)}')
print(f'Solution3 : {no_continuous(arr)}')