def solution(s):
	answer = ''
	strList = s.split(' ')
	for i in strList:
		for j in range(len(i)):
			if j % 2 == 0:
				answer += i[j].upper()
			else:
				answer += i[j].lower()
		answer += ' '
	answer = answer[:-1]
	return answer

def solution1(s):
	return ' '.join(map(lambda x: ''.join([a.lower() if i % 2 else a.upper() for i, a in enumerate(x)]), s.split(' ')))

s = 'try hello world'	# TrY HeLlO WoRlD
print(f'Solution : {solution(s)}')
print(f'Solution1 : {solution1(s)}')
