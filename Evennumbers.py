def main():
    a=int(input("Enter the First Digit:"))
    b=int(input("Enter the Second Digit"))
    for num in range(a,b + 1):
     if(num%2==0):
        print(num)
if __name__ == '__main__':
    main()
