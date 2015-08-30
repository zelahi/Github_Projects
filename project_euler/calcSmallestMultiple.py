from fractions import gcd
from functools import reduce

def lcm(a,b):
	"Calculate the lowest common multiple of two integers"
	return a*b//gcd(a,b)


multiple_one_to_ten = reduce(lcm, range(1,11))
multiple_one_to_twenty = reduce(lcm, range(1,21))

print multiple_one_to_ten
print multiple_one_to_twenty
