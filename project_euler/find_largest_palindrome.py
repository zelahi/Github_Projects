from itertools import product

def is_palindrome(num):
    return str(num) == str(num)[::-1]

multiples = ( (a, b) for a, b in product(xrange(100,999), repeat=2) if is_palindrome(a*b) )
print max(multiples, key=lambda (a,b): a*b)
# (913, 993)
