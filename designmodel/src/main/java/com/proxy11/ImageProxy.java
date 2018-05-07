package com.proxy11;

import java.awt.Component;
import java.awt.Graphics;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;

/**
 * Desc:代理类，代理ImageIcon类
 * Author:yl
 * Email:yangle06@anjuke.com
 * data:2018/4/30
 * version:
 * update:
 */

public class ImageProxy implements Icon {

    volatile ImageIcon imageIcon;
    URL imageUrl;
    Thread retrievalThread;
    boolean retrieving = false;//是否已经创建Icon

    public ImageProxy(URL url){
        this.imageUrl = url;
    }

    @Override
    public void paintIcon(Component c, Graphics g, int x, int y) {
        if(imageIcon != null){
            imageIcon.paintIcon(c,g,x,y);
        }else {
            g.drawString("Loading...",x+300,y+190);
        }
        if(!retrieving){
            retrieving = true;
            retrievalThread = new Thread(() -> {
                setImageIcon(new ImageIcon(imageUrl,"CD Cover"));
                c.repaint();
            });
            retrievalThread.start();
        }
    }

    public synchronized void setImageIcon(ImageIcon imageIcon){
        this.imageIcon = imageIcon;
    }

    @Override
    public int getIconWidth() {
        if(imageIcon != null){
            return imageIcon.getIconWidth();
        }else {
            return 800;
        }
    }

    @Override
    public int getIconHeight() {
        if(imageIcon != null){
            return imageIcon.getIconHeight();
        }else {
            return 600;
        }
    }
}
