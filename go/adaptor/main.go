package main

import "fmt"

/*
为client提供统一接口， client只需要操作adaptor，无需直接操作具体的类
*/

type Enemy interface {
	Name() string
}

type Client struct {
}

func (c *Client) Attack(e Enemy) {
	if v, ok := e.(*Adaptor); ok {
		fmt.Printf("client is attacking %s\n", v.Charactor.Name())
		v.BeAttacked()
	} else {
		fmt.Println("adaptor error")
	}
}

type Adaptor struct {
	Charactor Enemy
}

func (a *Adaptor) Name() string {
	name := fmt.Sprintf("a adaptor of %s", a.Charactor.Name())
	return name
}

func (a *Adaptor) BeAttacked() {
	if v, ok := a.Charactor.(*Farmer); ok {
		v.Dead()
	}
	if v, ok := a.Charactor.(*Tank); ok {
		v.Stuck()
	}
}

type Farmer struct {
	ID string
}

func (f *Farmer) Name() string {
	return "Bob"
}
func (f *Farmer) Dead() {
	fmt.Printf("farmer: %s is dead\n", f.Name())
}

type Tank struct {
	ID string
}

func (f *Tank) Name() string {
	return "tank01"
}

func (f *Tank) Stuck() {
	fmt.Printf("tank: %s is stucked\n", f.Name())
}

func main() {
	c := new(Client)
	f := &Farmer{
		ID: "001",
	}
	fa := &Adaptor{
		Charactor: f,
	}
	c.Attack(fa)
	t := &Tank{
		ID: "002",
	}
	ta := &Adaptor{
		Charactor: t,
	}
	c.Attack(ta)
}
