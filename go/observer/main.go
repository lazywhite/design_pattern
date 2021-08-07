package main

import (
	"fmt"
	"time"
)

type Producer struct{
	Pipe chan struct{}
}
type Consumer struct{
	Name string
}

type Watcher struct{
	Producer *Producer
	Consumers []*Consumer
	Pipe chan struct{}
}

func (c *Consumer) Update(){
	fmt.Printf("%s updated\n", c.Name)
}

func (p *Producer) Notify(){
	var i = 1
	for{
		if i >3{
			close(p.Pipe)
			break
		}
		p.Pipe <- struct{}{}
		i+=1
		time.Sleep(1 * time.Second)
	}
}

func (w *Watcher) AddProducer(producer *Producer){
	pipe := make(chan struct{})
	producer.Pipe = pipe
	w.Producer = producer
	w.Pipe = pipe
}

func (w *Watcher) AddConsumers(c ...*Consumer){
	w.Consumers = append(w.Consumers, c...)
}

func (w *Watcher) Watch(){
	for{
		_, ok := <-w.Pipe
		if !ok{
			break
		}

		//<-w.Pipe
		for _, c := range w.Consumers{
			 c.Update()
		}
	}
}

func main(){
	c1 := &Consumer{Name: "bob"}
	c2 := &Consumer{Name: "alice"}
	c3 := &Consumer{Name: "ada"}
	p := new(Producer)

	w := new(Watcher)
	w.AddProducer(p)
	w.AddConsumers(c1, c2, c3)
	fmt.Println(w.Consumers)
	go w.Watch()
	go p.Notify()

	select{}
}