#세자리곱셈

num1 = input()
num2 = input()

numList = list(num2)

for i in range(len(numList)):
    result = int(num1) * int(num2[len(numList) -1 - i])
    print(result)

print(int(num1) * int(num2))

