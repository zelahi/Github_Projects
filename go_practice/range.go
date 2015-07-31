package main

import "fmt"

func main() {

	//sum all the numbers in an array
	nums := []int{2, 3, 4}
	sum := 0
	for _, num := range nums {
		sum += num
	}
	fmt.Println("sum:", sum)

	//indicies in array
	for i, num := range nums {
		if num == 3 {
			fmt.Println("index:", i)
		}
	}

	//iterate over a map using range
	kvs := map[string]string{"a": "apple", "b":"banana"}
	for k, v := range kvs {
		fmt.Printf("%s -> %s\n", k, v)
	}

	//iterate over Unicode code points
	for i, c := range "go" {
		fmt.Println(i, c)
	}
}
