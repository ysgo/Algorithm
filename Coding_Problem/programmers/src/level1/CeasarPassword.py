def solution(s, n):
	answer = ''
	for i in range(len(s)):
		if s[i] == ' ':
			answer += ' '
		else:
			num = ord(s[i])
			if num >= 65 and num <= 90:
				if num + n > 90:
					answer += chr(num + n - 26)
				else:
					answer += chr(num + n)
			elif num >= 97 and num <= 122:
				if num + n > 122:
					answer += chr(num + n - 26)
				else:
					answer += chr(num + n)
	return answer

def solution1(s, n):
	s = list(s)
	for i in range(len(s)):
		if s[i].isupper():
			s[i] = chr((ord(s[i]) - ord('A') + n) % 26 + ord('A'))
		elif s[i].islower():
			s[i] = chr((ord(s[i]) - ord('a') + n) % 26 + ord('a'))
	return ''.join(s)

s = ['AB', 'z', 'a B z']	# BC, a, e F d
n = [1, 1, 4]
for index, value in enumerate(s):
	print(f'Solution1 - {index+1} : {solution(s[index],n[index])}')
	print(f'Solution2 - {index+1} : {solution1(s[index],n[index])}')
