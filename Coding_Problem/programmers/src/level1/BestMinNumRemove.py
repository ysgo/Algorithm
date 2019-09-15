def solution(arr):
	answer = []
	if len(arr) == 1:
		answer.append(-1)
		return answer
	else:
		arr.remove(min(arr))
	return arr

n = [4, 3, 2, 1]
print("answer : {}".format(solution(n))) # [4,3,2]

n = [10]
print("answer : {}".format(solution(n))) # [-1]