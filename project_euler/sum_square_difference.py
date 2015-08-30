def calc_sum_of_squares(max):
	sum = 0
	for x in range(1,max + 1):
		sum = sum + pow(x,2)

	print "Sum of the Squares: "
	print  sum

	return sum

def calc_square_of_sum(max):
	sum = 0
	for x in range(1, max + 1):
		sum = sum + x

	print "Square of the Sum:"
 	print pow(sum,2)

	return pow(sum,2)

def calc_difference(max):
	sum_of_squares = calc_sum_of_squares(max) 
	square_of_sums = calc_square_of_sum(max)
	
	print sum_of_squares - square_of_sums
	return difference

print calc_difference(100)

