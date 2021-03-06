package com.muyiafa.submarine;

import javax.swing.*;

/**
 * 鱼雷潜艇类
 *      是模板 放战舰对象所有公共的属性和行为
 */
public class TorpedoSubmarine extends SeaObject implements EnemyScore{

    TorpedoSubmarine(){
//        width=64;
//        height=20;
//        x=-width;//x坐标负一个图片的宽度，表示在屏幕的左侧外面
//        y=(int)(Math.random()*(479-height-150)+150);//随机Y坐标
//        speed=(int)(Math.random()*(3-1)+1);//随机速度1~3
        super(64,20);
    }

    @Override
    void step() {
        x+=speed;//x向右运动;
    }

    @Override
    public ImageIcon getImage() {
        if (this.isLive()) {//如果当前对象是活着的
            return ImageResources.torpedosubm;//返回鱼雷潜艇图片
        }
        return null;//如果能执行到此处，说明当前对象是死亡状态，返回null
    }
    @Override
    public int getScore() {
        return 10;
    }
}
