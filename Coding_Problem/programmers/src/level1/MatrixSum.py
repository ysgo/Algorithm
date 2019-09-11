def solution(arr1, arr2):
    answer = [[] for i in range(len(arr1))]
    for j in range(len(arr1)):
    	for x in range(len(arr1[j])):
    		answer[j].append(arr1[j][x] + arr2[j][x])
    return answer

def solution2(arr1,arr2):
    answer = [[i + j for i, j in zip(a, b)] for a, b in zip(arr1,arr2)]
    return answer

arr1 = [[1,2], [2,3]]
arr2 = [[3,4], [5,6]]
print("answer : {}".format(solution(arr1, arr2)))
print("answer : {}".format(solution2(arr1, arr2)))