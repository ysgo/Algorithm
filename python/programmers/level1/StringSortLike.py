def solution(strings, n):
	answer = []
	for i in range(len(strings)):
		answer.append(strings[i][n] + strings[i])
	answer.sort()
	for i in range(len(strings)):
		answer[i] = answer[i][1:]
	return answer

def strange_sort(strings, n):
	return sorted(sorted(strings), key=lambda x: x[n])

def strange_sort2(strings, n):
    def sortkey(x):
        return x[n]
    strings.sort(key=sortkey)
    return strings

strings = ["sun", "bed", "car"]
n = 1
strings2 = ["abce", "abcd", "cdx"]
n2 = 2
print(f'Solution1 : {solution(strings, n)}')
print(f'Solution2 : {solution(strings2, n2)}')
print(f'Solution3 : {strange_sort(strings2, n2)}')