#알람시계

time = input().split(' ')
H = int(time[0])
M = int(time[1])

if(M - 45 < 0):
    if(H != 0):
        print(H-1, M - 45 +60)
    else:
        print(23, M - 45 +60)
else:
    print(H, M - 45)
    


