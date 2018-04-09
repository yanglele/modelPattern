package com.decorate.javaIO;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * Desc:InputStream为被装饰基类，FileInputStream、FilterInputStream均继承自InputStream
 * FilterInputStream为被装饰类；FilterInputStream为装饰类基类，其他类需要继承此类
 * Author:yl
 * Email:yangle06@anjuke.com
 * data:2018/3/24
 * version:
 * update:
 */

public class LowerCaseInputStream extends FilterInputStream {
    /**
     * Creates a <code>FilterInputStream</code>
     * by assigning the  argument <code>in</code>
     * to the field <code>this.in</code> so as
     * to remember it for later use.
     *
     * @param in the underlying input stream, or <code>null</code> if
     *           this instance is to be created without an underlying stream.
     */
    protected LowerCaseInputStream(InputStream in) {
        super(in);
    }

    @Override
    public int read() throws IOException {
        int c = super.read();
        return c == -1 ? c : Character.toLowerCase(c);
    }

    @Override
    public int read(byte[] b, int off, int len) throws IOException {
        int result = super.read(b,off,len);
        for(int i = off ;i<off+result;i++){
            b[i] = (byte) Character.toLowerCase((char) b[i]);
        }
        return result;
    }
}
