package main

import (
	"fmt"
	"github.com/mohae/deepcopy"
)

/*
when it's very expensive to create a new instance, just return a copy of prototype
*/

var _inst *Instance

type Instance struct {
	Name string
}

func NewInstance(name string) *Instance {
	if _inst == nil {
		//a very heavy time/resource consuming task
		_inst = new(Instance)
		_inst.Name = name
		return _inst

	} else {
		newInst := deepcopy.Copy(_inst)
		if v, ok := newInst.(*Instance); ok {
			v.Name = name
			return v
		}
		fmt.Println("failed to create instance")
		return nil
	}
}

func main() {
	inst1 := NewInstance("bob")
	inst2 := NewInstance("alice")
	fmt.Printf("inst1: %v\n", inst1)
	fmt.Printf("inst2: %v\n", inst2)
}
