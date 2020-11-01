def solution(participant, completion):
	answer = ''
	player = {}
	for i in range(len(participant)):
		name = participant[i]
		if name in player:
			player[name] = player.get(name) + 1
		else:
			player[name] = 0
	for i in range(len(completion)):
		name = completion[i]
		if player.get(name) == 0:
			del(player[name])
		else:
			player[name] = player.get(name) - 1
	for i in player.keys():
		answer = i
	return answer

# python library Collections.Counter() 사용하면 자동으로 key에 대한 개수 세줌
def solution1(participant, completion):
	import collections
	answer = collections.Counter(participant) - collections.Counter(completion)
	return list(answer.keys())[0]

# sort 사용하여 비교후 값 반환
def solution2(participant, completion):
	participant.sort()
	completion.sort()
	for i in range(len(completion)):
		if participant[i] != completion[i]:
			return participant[i]
	return participant[len(participant) - 1]

participant = ['leo', 'kiki', 'eden']
completion = ['eden', 'kiki']
print(f'Solution : {solution(participant, completion)}')
print(f'Solution2 : {solution1(participant, completion)}')
print(f'Solution3 : {solution2(participant, completion)}')