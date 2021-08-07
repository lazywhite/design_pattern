package main

import "fmt"

/*
向一个对象添加新功能，而不改变原有对象

将新功能抽象出来， 来装饰原对象, 而不用重写对象方法

1. 装饰器接受一个对象，返回一个新对象
2. 新对象的使用跟原对象一样
*/

type Shape interface {
	Draw()
}
type Circle struct {
	Info string
}

func (r *Circle) Draw() {
	fmt.Println("a circle")
}

type RedBorder struct {
	Shape Shape
}

func (f *RedBorder) Draw() {
	f.Shape.Draw()
	fmt.Println("red border")
}

type Padding struct {
	Shape Shape
}

func (p *Padding) Draw() {
	p.Shape.Draw()
	fmt.Println("padding 10 px")
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
	c.Draw()

	rbc := NewRedBorder(c)
	rbc.Draw()

	pc := NewPadding(c)
	pc.Draw()

	pbc := NewPadding(rbc)
	pbc.Draw()
}
