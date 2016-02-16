package com.designPattern.structual.composite;

import java.util.ArrayList;

/**
 * Created by hongjingjun on 16/2/14.
 */

//意图
//将 对 象 组 合 成 树 形 结 构 以 表 示 “ 部 分 -整 体 ” 的 层 次 结 构
//C o m p o s i t e 使 得 用 户 对 单 个 对 象 和组合对象的使用具有一致性。

public interface Graphic {

    public void draw();
    public void add(Graphic g);
    public void remove(Graphic g);
    public ArrayList<Graphic> getChilds();
}
