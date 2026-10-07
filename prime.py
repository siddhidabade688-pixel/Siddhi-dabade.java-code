for num in range(2,51):
    prime = 1
    for i in range (2,num):
        if num % 1==0:
            prime = 0
            break
        if prime == 1:
            print(num)
