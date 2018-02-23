def main():
    print("To find the Factorial of a Number")
    a= int(input("Enter the Number:"))
    factorial =1
    for i in range(1,a + 1):
       factorial = factorial*i
    print(factorial)
if __name__ == '__main__':
    main()
