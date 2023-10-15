package main

import (
	"fmt"
)

/*
通过类工厂来创造工厂, 再通过工厂来创造实例
*/

type Shoes interface {
	getColor() string
}

type Factory interface {
	makeShoes() Shoes
}

type AdidasShoes struct {
	color string
}

func (a AdidasShoes) getColor() string {
	return a.color
}

type NikeShoes struct {
	color string
}

func (a NikeShoes) getColor() string {
	return a.color
}

type AdidasFactory struct{}

func (a AdidasFactory) makeShoes() Shoes {
	return AdidasShoes{
		color: "red",
	}
}

type NikeFactory struct{}

func (a NikeFactory) makeShoes() Shoes {
	return NikeShoes{
		color: "blue",
	}
}

func GetFactory(name string) Factory {
	switch name {
	case "nike":
		return NikeFactory{}
	case "adidas":
		return AdidasFactory{}
	}
	return nil
}

func main() {
	f1 := GetFactory("nike")
	shoes1 := f1.makeShoes()
	fmt.Println(shoes1.getColor())
	f2 := GetFactory("adidas")
	shoes2 := f2.makeShoes()
	fmt.Println(shoes2.getColor())
}
