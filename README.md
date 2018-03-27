# 设计模式代码


## 设计和模式

软件设计的核心是抽象，抽象贯穿整个软件设计过程，不同的职责站在不同的层次和角度进行抽象。而模式是对同类型问题的一种抽象和高度概括。

设计模式是应对需求频繁变化带来的负面影响，其中心思想就是解耦，减少模块间的依赖，使各模块可以独立变化。`解耦是目的，抽象是解耦的方式和手段。`

## 设计模式原则

- 单一职责原则 `一个类仅有一个引起它变化的原因`
- 里氏替换原则 `子类替换基类时，原有程序不用更改`
- 依赖倒置原则 `抽象不应该依赖于细节，细节应当依赖于抽象（要针对接口编程，而不是针对实现编程）`
- 接口隔离原则 `接口应该尽量小和单一`
- 开闭原则 `对于扩展是开放的，对于修改是封闭的`
- 迪米特原则 `一个对象应当尽可能少的去了解其他对象`

原则是对具体设计模式的抽象（又见抽象），其实就是面向对象设计的日常原则。值得一提的是，无论设计模式还是原则，只是作为一个指导参考，不必非要死搬硬套，合理就好。

## 如何学习设计模式


`学习技术，还是偏向于从全局到局部，再深入到细节，这样才不会迷失。`


要理解设计模式，首先要理解抽象，再理解设计原则，然后结合项目经验找到软件设计的痛点，最后深入设计模式细节。

另外，设计模式是演变过来的，不是出生那天就固定了，所以了解模式的演变对理解设计模式更有意义。

学习设计模式需要的基础知识：

```
1. 熟悉面向对象的概念
2. 熟悉接口、泛化、多态、继承、组合等概念
3. 对抽象、依赖、解耦的概念有过独立思考
4. 对设计模式原则有所了解
```

具体学习方式：

```
1. 了解设计模式分类，每种分类解决什么类型的问题
2. 先学习基础的、简单的设计模式，再学习其他演变的模式
3. 将所有设计模式熔炉，抽象化、理论化
```

如何在项目中实战：

```
1. 寻找项目中的业务变化点
2. 思考如果对频繁变化点进行抽象封装
3. 对比自己的实现与经典设计模式有何差异
```

学习顺序（从简单到复杂）：

```
1. 单例模式
2. 工厂方法、模板方法
3. 抽象工厂
4. 观察者
5. 代理
6. 中介者、原型
7. 状态、策略
8. 外观
9. 适配器
```

书籍推荐只有两本：`Head First设计模式`和`设计模式（GOF）`，其他书籍不看也罢，看了也许还会起误导作用。两本书的顺序是初学看`Head First设计模式`，如果有底子直接看`设计模式（GOF）`。


## 目录

[创建型设计模式](https://github.com/xuwening/designPattern/tree/master/designPattern/src/com/designPattern/creational)

- [抽象工厂](https://github.com/xuwening/designPattern/tree/master/designPattern/src/com/designPattern/creational/abstractFactory)

- [生成器](https://github.com/xuwening/designPattern/tree/master/designPattern/src/com/designPattern/creational/Builder)

- [工厂方法](https://github.com/xuwening/designPattern/tree/master/designPattern/src/com/designPattern/creational/factoryMethod)

- [原型](https://github.com/xuwening/designPattern/tree/master/designPattern/src/com/designPattern/creational/Prototype)

- [单件](https://github.com/xuwening/designPattern/tree/master/designPattern/src/com/designPattern/creational/Singleton)

[结构型设计模式](https://github.com/xuwening/designPattern/tree/master/designPattern/src/com/designPattern/structual)

- [适配器](https://github.com/xuwening/designPattern/tree/master/designPattern/src/com/designPattern/structual/adapter)

- [桥接](https://github.com/xuwening/designPattern/tree/master/designPattern/src/com/designPattern/structual/bridge)

- [组合](https://github.com/xuwening/designPattern/tree/master/designPattern/src/com/designPattern/structual/composite)

- [装饰](https://github.com/xuwening/designPattern/tree/master/designPattern/src/com/designPattern/structual/decorator)

- [外观](https://github.com/xuwening/designPattern/tree/master/designPattern/src/com/designPattern/structual/facade)

- [享元](https://github.com/xuwening/designPattern/tree/master/designPattern/src/com/designPattern/structual/flyweight)

- [代理](https://github.com/xuwening/designPattern/tree/master/designPattern/src/com/designPattern/structual/proxy)

[行为型设计模式](https://github.com/xuwening/designPattern/tree/master/designPattern/src/com/designPattern/behavioral)

- [责任链](https://github.com/xuwening/designPattern/tree/master/designPattern/src/com/designPattern/behavioral/chainOfResponsibility)

- [命令](https://github.com/xuwening/designPattern/tree/master/designPattern/src/com/designPattern/behavioral/command)

- [解释器](https://github.com/xuwening/designPattern/tree/master/designPattern/src/com/designPattern/behavioral/interpreter)

- [迭代器](https://github.com/xuwening/designPattern/tree/master/designPattern/src/com/designPattern/behavioral/iterator)

- [中介者](https://github.com/xuwening/designPattern/tree/master/designPattern/src/com/designPattern/behavioral/mediator)

- [备忘录](https://github.com/xuwening/designPattern/tree/master/designPattern/src/com/designPattern/behavioral/memento)

- [观察者](https://github.com/xuwening/designPattern/tree/master/designPattern/src/com/designPattern/behavioral/observer)

- [状态](https://github.com/xuwening/designPattern/tree/master/designPattern/src/com/designPattern/behavioral/state)

- [策略](https://github.com/xuwening/designPattern/tree/master/designPattern/src/com/designPattern/behavioral/strategy)

- [模板方法](https://github.com/xuwening/designPattern/tree/master/designPattern/src/com/designPattern/behavioral/templeteMethod)

- [访问者](https://github.com/xuwening/designPattern/tree/master/designPattern/src/com/designPattern/behavioral/visitor)

## 结尾


设计模式很不好讲，为了简化设计模式的理解，尽量将 demo 裁剪的简单直接。因此有的示例无法充分说明该设计模式的威力（以学习目的为主）。

另外一个头疼的问题是很难找到合适的示例，要么例子和设计模式不紧密，要么需要很多代码才能表述清楚。示例的选择大致来源三处：
		
		四人帮的设计模式示例
		head first 设计模式示例
		网上搜索
		



