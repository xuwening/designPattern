# 结构型模式

## 模式

- [适配器](https://github.com/xuwening/designPattern/tree/master/designPattern/src/com/designPattern/structual/adapter)

- [桥接](https://github.com/xuwening/designPattern/tree/master/designPattern/src/com/designPattern/structual/bridge)

- [组合](https://github.com/xuwening/designPattern/tree/master/designPattern/src/com/designPattern/structual/composite)

- [装饰](https://github.com/xuwening/designPattern/tree/master/designPattern/src/com/designPattern/structual/decorator)

- [外观](https://github.com/xuwening/designPattern/tree/master/designPattern/src/com/designPattern/structual/facade)

- [享元](https://github.com/xuwening/designPattern/tree/master/designPattern/src/com/designPattern/structual/flyweight)

- [代理](https://github.com/xuwening/designPattern/tree/master/designPattern/src/com/designPattern/structual/proxy)


## 解决什么问题

结构型模式是对相关联的对象通过继承或组合建立关联，提供新的功能和运行时改变关联的能力。

## 模式之间的关系

适配器、装饰和代理都具有包裹的目的。

	适配器是用于适配用户的接口，接口会发生改变。
	代理与代理对象之间的接口是一致的，不会改变，目的是为了访问控制行为。
	装饰也不改变接口行为，只是扩展功能，而且扩展的方式不是强依赖。

组合和装饰模式比较像，装饰模式属于组合模式的子集，另外两者目的不同，组合模式是为了解决对象的聚集问题，而装饰模式是为了扩展基础对象的职责。


