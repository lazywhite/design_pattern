package main

import "fmt"

/*
构造一个包含其它对象的复杂对象时， 不自己实例对象，而在外部组装对象，然后传递进来
 */

type House struct{
	Door
	Window
}
type Door interface{
	OpenDoor()
}

type WoodDoor struct{
}

type IronDoor struct{
}

type Window interface {
	OpenWindow()
}

type GlassWindow struct{}
type PlasticWindow struct{}

func (g *GlassWindow) OpenWindow(){

	fmt.Println("open glass window")
}
func (p *PlasticWindow) OpenWindow(){
	fmt.Println("open plastic window")
}

func (w *WoodDoor) OpenDoor(){
	fmt.Println("open wood door")
}
func (I *IronDoor) OpenDoor(){
	fmt.Println("open iron door")
}



func NewHourse(door Door, window Window) *House{
	house := &House{
		Door: door,
		Window: window,
	}
	return house
}

func main(){
	door := new(IronDoor)
	window := new(PlasticWindow)
	house := NewHourse(door, window)
	house.OpenDoor()
	house.OpenWindow()
}