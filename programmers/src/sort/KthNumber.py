def solution(array, commands):
    answer = []
    for command in commands:
        #print(command)
        start = command[0]-1
        end = command[1]
        cnt = command[2]-1
        answer.append(sorted(array[start:end])[cnt])
    return answer

# Lambda Using function
def solution_best(array, commands):
    return list(map(lambda x: sorted(array[x[0]-1:x[1]])[x[2]-1], commands))

array = [1, 5, 2, 6, 3, 7, 4]
commands = [[2,5,3], [4,4,1], [1,7,3]]
print(f'Solution : {solution(array, commands)}')
print(solution_best(array, commands))