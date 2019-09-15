def solution(n):
    answer = list(reversed(str(n)))
    return list(map(int, answer))

def solution2(n):
	return [int(i) for i in str(n)][::-1]


n = 12345
print("answer :", solution(n))
print("결과 : {}".format(solution2(n)))