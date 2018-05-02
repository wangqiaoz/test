package com.wang.bilaccount.base;

/**
 * Created by huangjie on 2017/11/6.
 * 类名：
 * 说明：Icon
 */

public class Icon {

    public long id;

    public Icon() {
    }

    ;

    public Icon(String icon_name) {
        this.icon_name = icon_name;
    }

    //icon 图标信息
    public int icon_img;

    public int icon_bg;
    //icon 名称
    public String icon_name;
    //icon所在的页码
    public int index;
    //当前Icon的position
    public int position;
    //收入&支出
    public boolean isIncome;

    //类型
    //0 普通 1 我喜欢的 2 我添加的 3添加类别图标
    public int iconType;


}
