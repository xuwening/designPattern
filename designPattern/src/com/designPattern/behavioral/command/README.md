# 命令模式

## 意图

将一个请求封装为一个对象，从而使你可用不同的请求对客户进行参数化，对请求排队或记录请求日志，以及支持可撤销的操作。


## 解析


![](../../../../../img/command.png)


命令模式本身不复杂，只是需要和上下文进行依赖操作，所以看着比较复杂。为简单起见，这里不提依赖操作（依赖相关看demo示例）：

假设我们要实现菜单项操作，首先定义一个统一的接口，每个菜单都绑定一个具体的命令，这样用户点击菜单时，统一调用命令的execute方法：

```java
public interface ICommand {

    public void execute();
}
```

```java
//定义一个关灯的操作
public class LightOffCommand implements ICommand {

    //省略构造、初始化操作
    //...

    @Override
    public void execute() {

        light.lightOff();
    }
}
```

```java
//定义一个开灯的操作
public class LightOnCommand implements ICommand {

    //省略构造、初始化操作
    //...

    @Override
    public void execute() {

        light.lightOn();
    }
}
```

假设我们已经把命令和具体菜单项绑定（开灯、关灯），执行用户命令时，可以通用处理：

```java
void onUserAction(ICommand command) {
    command.execute();
}
```

## 总结

命令模式只有一个execute()方法，容易给人造成简单的假象。说起来其实也容易，将命令这种行为从逻辑中抽离出来，单独形成对象，并抽象为接口可以统一调度。

所谓行为模式就是将行为具象化为对象，命令模式就是比较典型的。命令模式也是一种解耦，将操作者和实施者隔离，可以独立变化。




