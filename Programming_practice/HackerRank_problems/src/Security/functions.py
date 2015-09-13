# Problem: Complete the function that takes input x and returns xr, where xr is
#           the remainder of x when divided by 11
def function(x):
    return x % 11

# Problem: complete the function which takes x as input and return x2
def function_ii(x):
    return x*x

# Problem: Determine if a function is a bijection
def bijective_functions(num, values):
    for x in range(0, len(values)):
        if x == num:
            print 'YES'
            return True
    print 'NO'
    return False

if __name__ == '__main__':
    num = int(sys.stdin.readline())
    values = raw_input().split()
    bijective_functions(num, values)
    main()
