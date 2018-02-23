def main():
    a=int(input("Enter the First Digit:"))
    b=int(input("Enter the Second Digit"))
    for num in range(a,b + 1):
     if num > 1:
       for i in range(2,num):
           if (num % i) == 0:
               break
       else:
            print(num)
if __name__ == '__main__':
    main()
