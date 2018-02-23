
def main():
    print("To check whether an Entered Number is palindrome or Not")
    a = input('Enter the Number you want to check : ')
    if a == str(a)[::-1]:
          print('Yes')
    else:
        print('No')
if __name__ == '__main__':
    main()
