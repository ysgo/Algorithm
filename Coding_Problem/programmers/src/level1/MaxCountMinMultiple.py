def solution(n, m):
    def gcd(a, b):
        if b==0: return a
        return gcd(b,a%b)
    gc = gcd(n,m)
    return [gc, n*m//gc]

n = 3
m = 12
print("answer : {}".format(solution(n, m)))