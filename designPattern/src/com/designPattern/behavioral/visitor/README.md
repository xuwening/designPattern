# 访问者模式

## 意图

表示一个作用于某对象结构中的各元素的操作。它使你可以在不改变各元素的类的前提下定义作用于这些元素的新的操作。

## 解析


![](../../../../../img/visitor.png)


这里举例的是标签的解析与处理，比如`text`标签和`video`标签的显示处理就不同，对于所有的标签类型处理会分散到各个标签类中，visitor模式是要把对标签的分散操作集中起来。

```java
public class Visitor {
    public void processText(Text text);
    public void processVideo(Video video);
    public void processImage(Image image);
    public void processButton(Button button);
    //其他标签
    //...
}
```

好了，我们把所有标签的处理行为全部集中到了一起，如果对各标签的处理发生变更，我们仅仅需要修改Visitor类。

下面是标签类的定义，看怎么和Visitor结合起来的：

```java
public class Text {
    public void accept(Visitor visitor) {
        visitor.processText(this);
    }
}

public class Video {
    public void accept(Visitor visitor) {
        visitor.processVideo(this);
    }
}

//其他标签类
//...
```

虽然我们写的是硬编码，但Visitor的意图差不多已经表达出来了，剩下的问题就是进一步抽象，这里就不展开叙述。


## 总结

访问者模式就是把访问集合元素的操作行为抽离出来，从而可以应对元素操作方式的改变。前提条件是集合元素比较稳定，如果集合元素频繁发生变化，访问者模式无法做到适应变化。

还有一点是这里提到集合，也就是说节点比较多时，这个模式才能发挥效用。

