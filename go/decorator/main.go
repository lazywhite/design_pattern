package main

import "fmt"

/*
向一个对象添加新功能，而不改变原有对象

将新功能抽象出来， 来装饰原对象, 而不用重写对象方法

1. 装饰器接受一个对象，返回一个新对象
2. 新对象的使用跟原对象一样
*/

type Shape interface {
	Draw() string
}
type Circle struct {
	Info string
}

func (c *Circle) Draw() string {
	return c.Info
}

type RedBorder struct {
	Shape Shape
}

func (f *RedBorder) Draw() string {
	return fmt.Sprintf("red border %s", f.Shape.Draw())
}

type Padding struct {
	Shape Shape
}

func (p *Padding) Draw() string {
	return fmt.Sprintf("padding %s", p.Shape.Draw())
}

func NewRedBorder(s Shape) Shape {
	rb := new(RedBorder)
	rb.Shape = s
	return rb
}

func NewPadding(s Shape) Shape {
	p := new(Padding)
	p.Shape = s
	return p
}

func main() {
	c := new(Circle)
	c.Info = "circle"
	fmt.Println(c.Draw())

	rbc := NewRedBorder(c)
	fmt.Println(rbc.Draw())

	pc := NewPadding(c)
	fmt.Println(pc.Draw())

	pbc := NewPadding(rbc)
	fmt.Println(pbc.Draw())
}
