//
// Copyright (C) 2023 lazywhite <lazywhite@qq.com>
//
// Distributed under terms of the MIT license.
//

package main

import (
	"fmt"
)

/*
	定义了一套行为准则, 将数据与操作进行分离

	不同的vistor都实现visit(data)方法, 里面写具体逻辑
	data对象实现accept(visitor) 方法, 内部调用visitor.visit(data)
*/

type Visitor interface {
	visit(i Information)
}

type JsonVisitor struct{}

func (j JsonVisitor) visit(info Information) {
	fmt.Printf("inside json %v\n", info.Value)
}

type CsvVisitor struct{}

func (j CsvVisitor) visit(info Information) {
	fmt.Printf("inside csv %v\n", info.Value)
}

type Information struct {
	Value int
}

func (i Information) accept(visitor Visitor) {
	visitor.visit(i)
}

func main() {
	i := Information{
		Value: 1,
	}
	v1 := new(JsonVisitor)
	i.accept(v1)
	v2 := new(CsvVisitor)
	i.accept(v2)

}
