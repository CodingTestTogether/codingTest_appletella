#최소, 최대

N = int(input())
numList = list(input().split(" "))
max = int(numList[0])
min = int(numList[0])
for i in range(1, N):
    if(int(numList[i]) > max):
        max = int(numList[i])
    if(int(numList[i]) < min):
        min = int(numList[i])
print(min, max)
