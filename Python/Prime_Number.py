number = int(input("Enter a number: "))

if number > 1:
    for i in range(2, number):
        if number % i == 0:
            print(number, "is not a Prime number.")
            break
    else:
        print(number, "is a Prime number.")
else:
    print(number, "is not a Prime number.")