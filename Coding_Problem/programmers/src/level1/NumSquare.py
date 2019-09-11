# 마지막 케이스 실패
def solution(n): 
    x = 1
    while True:
    	x += 1
    	if x*x >= n: break
    if x*x == n:
    	x += 1
    	return x*x
    else:
    	return -1

def solution2(n):
    import math
    num = math.sqrt(n)

    if math.sqrt(n) == int(math.sqrt(n)) :
        return pow(num+1, 2)

    return -1


n = 121
print("answer : {}".format(solution(n)))
print("answer : {}".format(solution2(n)))
n = 3
print("answer : {}".format(solution(n)))
print("answer : {}".format(solution2(n)))