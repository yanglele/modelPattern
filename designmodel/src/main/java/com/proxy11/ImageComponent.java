package com.proxy11;

import java.awt.Graphics;

import javax.swing.Icon;
import javax.swing.JComponent;

/**
 * Desc:包装ImageIcon的代理，使其能够放到JFrame组件中使用
 * Author:yl
 * Email:yangle06@anjuke.com
 * data:2018/4/30
 * version:
 * update:
 */

public class ImageComponent extends JComponent {
    private Icon icon;

    public ImageComponent(Icon icon){
        this.icon = icon;
    }

    public void setIcon(Icon icon){
        this.icon = icon;
    }

    public void paintComponent(Graphics graphics){
        super.paintComponent(graphics);
        int w = icon.getIconWidth();
        int h = icon.getIconHeight();
        int x = (800 - w)/2;
        int y = (600 - h)/2;
        icon.paintIcon(this,graphics,x,y);
    }
}
