https://refactoring.guru/design-patterns/go

## 1. build
如何构造对象
```
factory
abstract factory
singleton
builder: 将复杂对象的构建过程拆分成不同的步骤
prototype: 当创建新对象很昂贵的时候, 直接返回原型对象的copy(实现一个clone() method)
dependency injection(IoC invert of control的一种)
```

## 2. behavior

如何合理调用方法
```
command
mediator
observer
strategy: 
iterator: 允许迭代一个复杂的对象, 而不用暴露其内部细节
visitor: client定义accept(visitor)接口, visitor定义visit(client)接口
chain of responsibility: 将多个handler拼接成单向链表
```
## 3. structure

对象之间的结构关系
```
decorator
adaptor
bridge: object间调用通过bridge(interface), 各部分可独立变化
proxy: 行为, 权限控制, 日志等
facade: 为复杂系统提供简单的接口
flyweight: 用单独的对象存储公共属性, 自身仅引用这个对象, 避免不必要的内存分配
composite: 将多个个体封装成整体, 整体提供跟个体一样的接口
```
