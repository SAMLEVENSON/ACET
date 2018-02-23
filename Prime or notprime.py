def main():
    print("To check whether a prime number or not")
    a=int(input("Enter a Number To check:"))
    if a>1:
     for i in range(2,a):
        if(a%i)==0:
            print (a,"is not a prime number")
            break
        else:
            print (a,"is a prime number")
            break
if __name__ == '__main__':
    main()
