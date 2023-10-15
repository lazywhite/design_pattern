package main

import (
	"fmt"
)

/*
1. client无需自己初始化特定类 而是委托给Factory进行初始化
2. 根据传入参数的不同，Factory可以像工厂一样创建出不同的object
*/

type Shape interface {
	Draw()
}

type Circle struct {
}
type Square struct {
}

func (c *Circle) Draw() {
	fmt.Println("a circle")
}
func (c *Square) Draw() {
	fmt.Println("a square")
}

type Factory struct {
}

// 此处使用字符串来决定shape, 也可以用int
// func (f *Factory) GetShape(type int) Shape {
func (f *Factory) GetShape(shape string) Shape {
	var s Shape
	switch shape {
	case "circle":
		s = new(Circle)
	case "square":
		s = new(Square)
	default:
		fmt.Println("no supported")
		s = nil
	}
	return s
}

func main() {
	c := new(Factory)
	s1 := c.GetShape("circle")
	s1.Draw()
	s2 := c.GetShape("square")
	s2.Draw()

}
