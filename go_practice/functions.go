package main

import "fmt"

//adds two integers together
func plus(a int, b int) int {
	return a + b
}

func plusPlus(a, b, c int) int {
	return a + b + c
}

//multiple return values function
func vals() (int, int) {
	return 3, 7
}
//Variadic function - function called with any number of trailing arguments
func sum(nums ...int) {
	fmt.Print(nums, " ")
	total := 0

	for _, num := range nums {
		total += num
	}
	fmt.Println(total)
}

func main() {

	res := plus(1, 2)
	fmt.Println("1 + 2 = ", res)

	res = plusPlus(1, 2, 3)
	fmt.Println("1 + 2 + 3 = ", res)

	//save return values into multiple variables
	a, b := vals()
	fmt.Println(a)
	fmt.Println(b)

	//subset of returned values
	_, c := vals()
	fmt.Println(c)

	//variadic function usage example
	nums := [] int{1, 2, 3, 4}
	sum(nums...)
}
