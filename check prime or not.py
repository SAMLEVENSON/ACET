def main():


    num = int(input("Enter a number: "))

    if num > 1:
     for i in range(2,num):
       if (num % i) == 0:
           print("YES")
           break
       else:
        print("NO")

    else:
        print("NO")

if __name__ == '__main__':
    main()
