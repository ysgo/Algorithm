def solution(a, b):
    answer = ''
    day = ['FRI','SAT','SUN','MON','TUE','WED','THU']
    count = 0
    m = [31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31]
    for i in range(0, a-1):
        count += m[i]
    answer = day[((count+b)%len(day))-1]
    return answer

def getDayName(a,b):
    months = [31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31]
    days = ['FRI', 'SAT', 'SUN', 'MON', 'TUE', 'WED', 'THU']
    return days[(sum(months[:a-1])+b-1)%7]

def getDayLibrary(a,b):
    import datetime
    t = 'MON TUE WED THU FRI SAT SUN'.split()
    return t[datetime.datetime(2016, a, b).weekday()]

a = 5
b = 24
print(f'Solution : {solution(a,b)}')
print(f'Solution2 : {getDayName(a,b)}')
print(f'Solution3 : {getDayLibrary(a,b)}')