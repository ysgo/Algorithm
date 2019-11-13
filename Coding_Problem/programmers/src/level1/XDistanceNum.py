def solution(x, n):
    answer = []
    for i in range(1, n+1):
        answer.append(x*i)
    return answer


def solution1(x, n):
    return [i * x + x for i in range(n)]


x = [2, 4, -4]
n = [5, 3, 2]
for index, value in enumerate(x):
    print(f'Solution : {solution(x[index], n[index])}')
    print(f'Solution1 : {solution1(x[index], n[index])}')
