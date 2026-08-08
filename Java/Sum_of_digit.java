# Calculate the sum of digits

number = int(input("Enter a number: "))

number = abs(number)
total_sum = 0

while number > 0:
    total_sum += number % 10
    number //= 10

print("Sum of digits =", total_sum)