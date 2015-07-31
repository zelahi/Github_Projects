package main

import "fmt"

func main() {
	//make an empty slice 
	s := make([]string, 3)
	fmt.Println("emp: ", s)

	//add items to a slice
	s[0] = "a"
	s[1] = "b"
	s[2] = "c"
	fmt.Println("set: ", s)
	fmt.Println("get: ", s[2])

	fmt.Println("len: " , len(s))

	//add items to a slice
	s = append(s, "d")
	s = append(s, "e", "f")
	fmt.Println("apd: ", s)

	//copy one slice into a new slice
	c := make([]string, len(s))
	copy(c, s)
	fmt.Println("cpy: ", c)	

	//slice operator - get a slice of a slice
	l := s[2:5]
	fmt.Println("sl1: ", l)
	
	l = s[:5]
	fmt.Println("sl2: ", l)
	
	l = s[2:]
	fmt.Println("sl3: ", l)

	//declare and initalize a variable for a slice
	t := []string{"g", "h", "i"}
	fmt.Println("dcl: " , t)

	//multi-dimensional slice
	twoD := make([][]int, 3)
	for i := 0; i < 3; i++ {
		innerLen := i + 1
		twoD[i] = make([]int, innerLen)
		for j := 0; j < innerLen; j++ {
			twoD[i][j] = i + j
		}
	}
	fmt.Println("2d: ", twoD)
}
