def solution(n):
    answer = ''
    arr = reversed(sorted(list(str(n))))
    for i in arr:
    	answer += i
    return int(answer)

def solution2(n):
    ls = list(str(n))
    ls.sort(reverse = True)
    return int("".join(ls))

n = 118372
print("answer :{}".format(solution(n)))
print("answer :{}".format(solution2(n)))