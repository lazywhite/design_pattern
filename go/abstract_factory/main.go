package main

import (
	"fmt"
)

/*
通过类工厂来创造工厂, 再通过工厂来创造实例
*/

type Color interface {
	Fill()
}

type Shape interface {
	Draw()
}

type Circle struct {
}
type Square struct {
}
type Red struct {
}
type Black struct {
}

func (c *Circle) Draw() {
	fmt.Println("a circle")
}
func (s *Square) Draw() {
	fmt.Println("a square")
}

func (r *Red) Fill() {
	fmt.Println("red")
}
func (b *Black) Fill() {
	fmt.Println("black")
}

type Factory interface {
	Get(string) interface{}
}
type ShapeFactory struct {
}
type ColorFactory struct {
}

type AbstractFactory struct {
}

func (a *AbstractFactory) GetFactory(category string) Factory {
	var f Factory
	switch category {
	case "color":
		f = new(ColorFactory)
	case "shape":
		f = new(ShapeFactory)
	}
	return f
}

func (c *ColorFactory) Get(shape string) interface{} {
	var r Color
	switch shape {
	case "red":
		r = new(Red)
	case "black":
		r = new(Black)
	default:
		fmt.Println("no supported")
		r = nil
	}
	return r
}

func (s *ShapeFactory) Get(shape string) interface{} {
	var r Shape
	switch shape {
	case "circle":
		r = new(Circle)
	case "square":
		r = new(Square)
	default:
		fmt.Println("no supported")
		r = nil
	}
	return r
}

func main() {
	af := new(AbstractFactory)
	cf := af.GetFactory("color")
	color := cf.Get("red")

	if v, ok := color.(Color); ok {
		v.Fill()
	}
	sf := af.GetFactory("shape")
	shape := sf.Get("circle")
	if v, ok := shape.(Shape); ok {
		v.Draw()
	}
}
