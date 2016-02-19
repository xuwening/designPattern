# 设计模式代码


## 设计和模式

软件设计的核心是抽象，抽象贯穿整个软件设计过程，站在不同层次和角度进行抽象。而模式是对同类型问题的一种抽象和高度概括。

设计模式是应对需求频繁变化带来的负面影响，其中心思想就是解耦，减少模块间的依赖，使各模块可以独立变化。

## 设计模式原则

- 单一职责原则
- 里氏替换原则
- 依赖倒置原则
- 接口隔离原则
- 开闭原则
- 迪米特原则

原则是对具体设计模式的抽象（又见抽象），其实就是面向对象设计的日常原则。值得一提的是，无论设计模式还是原则，只是作为一个指导参考，不必非要死搬硬套，合理就好。

## 如何学习设计模式

学习技术，还是偏向于从全局到局部，再深入到细节，这样才不会迷失。
要理解设计模式，首先要理解抽象，再理解设计原则，然后结合项目经验找到软件设计的痛点，最后深入设计模式细节。

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

要给员工做设计模式培训，这是个辛苦活儿。公司开发人员大部分是 java 程序员，后台用 java，android 也用 java，所以就采用 java 写 Demo 了，偶是搞 OC 的，java 写的不好不要见笑。

设计模式很不好讲，为了简化设计模式的理解，尽量将 demo 裁剪的简单直接。另外一个头疼的问题是很难找到合适的示例，要么例子和设计模式不紧密，要么需要很多代码才能表述清楚。示例的选择大致来源三处：
		
		四人帮的设计模式示例
		head first 设计模式示例
		网上搜索
		
23种设计模式写出来耗时太多（其实是自己水平有限），好在刚好过年，有得几天空闲，草草写出来后续有时间再精细化吧。




