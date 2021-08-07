package main

import "fmt"

/*
type: 行为

中介者模式, 降低不同对象之间通信的复杂性
 */

type Loaner interface{
	Loan(amount float32)
}

type Borrower interface{
	Borrow(amount float32)
}

type Student struct{
	Money float32
}

type Farmer struct {
	Money float32
}

func (s *Student) Loan(amount float32){
	s.Money += amount
	fmt.Printf("student money: %v\n", s.Money)
}

func (f *Farmer) Loan(amount float32){
	f.Money += amount
	fmt.Printf("farmer money: %v\n", f.Money)
}

type Boss struct{
	Money float32

}


func (b *Boss) Borrow(amount float32){
	b.Money -= amount
	fmt.Printf("boss money: %v\n", b.Money)
}

//公证处
type NotaryOffice struct{
	Loaner Loaner
	Borrower Borrower
}

func (b *NotaryOffice) DoLoan(amount float32){
	b.Loaner.Loan(amount)
	b.Borrower.Borrow(amount)
}

func main(){
	boss := &Boss{ Money: 10000.00}
	s := &Student{Money: 30}
	f := &Farmer{Money: 4208}

	office := &NotaryOffice{}
	office.Borrower = boss
	office.Loaner = s
	office.DoLoan(100)
	office.Loaner = f
	office.DoLoan(100)
}
