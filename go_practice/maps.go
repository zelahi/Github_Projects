package main

import "fmt"

func main() {

	//make an empty map
	m := make(map[string]int)

	//key-value syntax : name[key] = val
	m["k1"] = 7
	m["k2"] = 13

	fmt.Println("map: ", m)

	//get a value for a key
	v1 := m["k1"]
	fmt.Println("v1: ", v1)

	//print length of map
	fmt.Println("len: ", len(m))

	//delete an item from a map
	delete(m, "k2")
	fmt.Println("map: ", m)

	//check if value is in map
	_, prs := m["k2"]
	fmt.Println("prs:", prs)

	//declare + initialize a new map in the same line
	n := map[string]int{"foo": 1, "bar": 2}
	fmt.Println("map:", n)

}
