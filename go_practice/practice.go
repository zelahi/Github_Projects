package main

import "fmt"
import "math"

const constant string = "constant"

func main() {
	//Standard Hello World
	fmt.Println("hello world")

	//Variables
	var word string = "hello"
	fmt.Println(word)

	var num, value = 2,3
	fmt.Println(num,value)

	//Constants
	fmt.Println(constant)

	const n = 900000

	fmt.Println(int64(n))

	fmt.Println(math.Sin(n))

	//For loops
	for j := 7; j <= 9; j++ {
		fmt.Println(j)
	}

	//Arrays
	a[4] = 100
	fmt.Println("set: ", a)
	fmt.Println("get: ", a[4])

	fmt.Println("len: ", len(a)) 
	
	var twoD [2][3]int
	for i := 0; i < 2; i++{
		for j := 0; j < 3; j++ {
			twoD[i][j] = i + j
		}
	}

	fmt.Println("2d: ", twoD)
	
}
