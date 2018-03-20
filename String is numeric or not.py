
def main():
    a=(raw_input(""))
    try:
     i = float(a)
    except (ValueError, TypeError):
     print('\nNo')
    else:
        print("Yes")


if __name__ == '__main__':
    main()
