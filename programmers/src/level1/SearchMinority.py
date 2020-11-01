def solution(n):
    num = set(range(2, n+1))
    for i in range(2, n+1):
        if i in num:
            num -= set(range(2*i, n+1, i))
    return len(num)


def solution2(numbers):
    answer = set()
    maximum = 10000000
    prime_lst = [False, False] + [True] * maximum
    for idx, num in enumerate(prime_lst):
    if num:
    k = idx*2
    while k <= maximum:
    prime_lst[k] = False
    k += idx
    for i in range(1, len(numbers)+1):
    perm = permutations(list(numbers), i)
    for i in list(perm):
    num = int("".join(list(i)))
    if prime_lst[num]:
    answer.add(num)
    return len(answer)


n = [10, 5, 11, 25, 26, 44]
for index, value in enumerate(n):
    print(f'Solution{index+1} : {solution(value)}')
