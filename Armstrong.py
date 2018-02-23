def main():
   a = int(input("Enter a number: "))
   sum = 0
   temp = a
   while temp > 0:
    digit = temp % 10
    sum += digit ** 3
    temp //= 10
    if a == sum:
       print("yes")
       break
   else:
    print("no")
if __name__ == '__main__':
    main()
