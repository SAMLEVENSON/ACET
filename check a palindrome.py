def main():
    nu=int(input("Enter number:"))
    temp=nu
    re=0
    while(nu>0):
     dig=nu%10
     re=re*10+dig
     nu=nu//10
    if(temp==re):
     print("Yes")
    else:
     print("NO")

if __name__ == '__main__':
    main()
