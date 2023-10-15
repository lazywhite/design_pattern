package main

import "fmt"

/*
client无法直接访问实体类， 而需要访问代理类
从而对client的行为做控制和优化
*/

var (
	imageCache = map[string]*ImageProxy{}
)

type ImageInterface interface {
	Open(int)
}

type Image struct {
	FileName string
}

func (i *Image) Open(time int) {
	fmt.Printf("image opened: %d\n", time)
}

type ImageProxy struct {
	FileName string
	Image    *Image
}

func (i *ImageProxy) Open(time int) {
	if time > 10 || time < 3 {
		fmt.Println("not permited")
		return
	}
	i.Image.Open(time)
}

// 私有方法，无法直接调用
func newRealImage(filename string) *Image {
	//an expensive task
	return &Image{
		FileName: filename,
	}
}

func NewImage(filename string) *ImageProxy {
	if v, ok := imageCache[filename]; ok {
		fmt.Println("return cached image")
		return v
	}
	img := newRealImage(filename)
	proxy := &ImageProxy{
		FileName: filename,
		Image:    img,
	}
	imageCache[filename] = proxy
	return proxy
}

func main() {
	img := NewImage("dog.png")
	img.Open(30)
	img.Open(3)
	i := NewImage("dog.png")
	i.Open(3)
}

