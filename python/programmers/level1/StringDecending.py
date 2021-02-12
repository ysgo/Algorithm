def solution(s):
    answer = ''.join(sorted(s, reverse=True))
    return answer

s = "Zbcdefg"   # gfedcbZ
print(f'Solution : {solution(s)}')