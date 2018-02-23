def main():
    a=int(input("Input: "))
    r=0
    while(a>0):
     b=a%10
     r=r*10+b
     a=a//10
    print("Output:" +repr(r))
 if __name__ == '__main__':
    main()
