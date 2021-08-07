package main

import "fmt"

/*
this pattern used to create objects made from a bunch of other objects

*/
type Meal struct {
	Items []Item
}

func (m *Meal) GetPrice() float32 {
	var price float32
	for _, v := range m.Items {
		price += v.price()
	}
	return price
}

type Item interface {
	Name() string
	price() float32
}

type VegBurger struct {
}

func (v *VegBurger) price() float32 {
	return 5.02
}
func (v *VegBurger) Name() string {
	return "veg burger"
}

type MeatBurger struct {
}

func (m *MeatBurger) price() float32 {
	return 6.18
}
func (v *MeatBurger) Name() string {
	return "meat burger"
}

type Pepsi struct {
}

func (p *Pepsi) price() float32 {
	return 1.23
}
func (v *Pepsi) Name() string {
	return "pepsi"
}

type Coca struct {
}

func (c *Coca) price() float32 {
	return 2.1
}
func (v *Coca) Name() string {
	return "coca"
}

type MealDealer struct {
}

func (m *MealDealer) prepareVeg() {
	meal := new(Meal)
	burger := new(VegBurger)
	drink := new(Coca)
	meal.Items = append(meal.Items, burger)
	meal.Items = append(meal.Items, drink)

	price := meal.GetPrice()
	fmt.Printf("price is %v\n", price)
}

func (m *MealDealer) prepareMeat() {
	meal := new(Meal)
	burger := new(MeatBurger)
	drink := new(Pepsi)
	meal.Items = append(meal.Items, burger)
	meal.Items = append(meal.Items, drink)

	price := meal.GetPrice()
	fmt.Printf("price is %v\n", price)
}

func main() {
	m := new(MealDealer)
	m.prepareMeat()
	m.prepareVeg()
}
