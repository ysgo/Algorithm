def solution(s):
    length = len(s)
    s_type = s.isdecimal()
    print(length)
    print(s_type)
    if (length == 4 or length == 6) and s_type == True:
        answer = True
    else:
        answer = False
    return answer

def solution_short(s):
    return s.isdigit() and len(s) in (4, 6)

def solution_regex(s):
    import re
    return bool(re.match("^(\d{4}|\d{6})$", s))

s1 = "a234"     # false
s2 = "1234"     # true
print(f'Solution1 : {solution(s1)}')
print(f'Solution2 : {solution(s2)}')
print(f'Solution_short : {solution(s1)}')
print(f'Solution_regex : {solution(s2)}')