package main

import "fmt"

/*
如果类直接实现某个接口，当接口变化时，所有的类都要同步变化，甚至要实现不需要实现的方法
因此类不直接实现顶层接口, 而是实现桥接接口， 当顶层接口变化时，只改动受影响的类
 */

type  FileSystem interface{
	Read()
	Write()
}

type  NewFileSystem interface{
	Read()
	Write()
	Close()
}
type ReaderWriterBridge struct{

}
func (r *ReaderWriterBridge) Read(){

}
func (r *ReaderWriterBridge) Write(){

}

type MyFS struct{
	ReaderWriterBridge
}

func (m *MyFS) Read(){
	fmt.Println("myfs read")
	m.ReaderWriterBridge.Read()
}
func (m *MyFS) Write(){
	fmt.Println("myfs write")
	m.ReaderWriterBridge.Write()
}
