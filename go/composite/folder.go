package main

import "fmt"

type Folder struct {
	components []FileType
	name       string
}

func (f *Folder) search(keyword string) {
	fmt.Printf("Serching recursively for keyword %s in folder %s\n", keyword, f.name)
	for _, composite := range f.components {
		composite.search(keyword)
	}
}

func (f *Folder) add(c FileType) {
	f.components = append(f.components, c)
}
