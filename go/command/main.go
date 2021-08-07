package main

import "fmt"

/*
行为(Command)可以像对象一样传递, 行为提供固定接口(Execute)给外界调用
*/

type Command interface {
	Execute(*Computer)
}

type Computer struct {
	Name    string
	Command Command
}

func (c *Computer) SetCommand(cmd Command) {
	c.Command = cmd
}
func (c *Computer) Execute() {
	c.Command.Execute(c)
}

type PlayMusicCommand struct {
}

func (p *PlayMusicCommand) Execute(c *Computer) {
	fmt.Printf("computer %s playing music\n", c.Name)
}

type TurnOffCommand struct {
}

func (p *TurnOffCommand) Execute(c *Computer) {
	fmt.Printf("computer %s turnning off\n", c.Name)
}

func main() {
	c := new(Computer)
	c.Name = "number1"
	pmc := new(PlayMusicCommand)
	c.SetCommand(pmc)
	c.Execute()

	turnoff := new(TurnOffCommand)
	c.SetCommand(turnoff)
	c.Execute()

}
