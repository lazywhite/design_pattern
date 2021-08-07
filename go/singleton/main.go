package main

import (
	"fmt"
)

type Singleton struct {
}

var instance *Singleton = nil

/*
//hungery mode
func init(){

    instance = new(Singleton)
}
*/

//lazy mode
func GetInstance() *Singleton {
	if instance == nil {
		instance = new(Singleton)
	}
	return instance
}

func main() {
	s1 := GetInstance()
	s2 := GetInstance()

	fmt.Println(s1 == s2)

}
