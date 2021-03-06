package com.zeh.jungle.mq.serialize;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

import com.alibaba.dubbo.common.serialize.ObjectOutput;
import com.alibaba.dubbo.common.utils.Assert;

/**
 * 
 * @author allen
 * @version $Id: NonSerializationObjectOutput.java, v 0.1 2016年3月2日 下午5:11:37 allen Exp $
 */
public class TextSerializationObjectOutput implements ObjectOutput {
    /***/
    private final ObjectOutputStream outputStream;

    /**
     * @param os
     * @throws IOException
     */
    public TextSerializationObjectOutput(OutputStream os) throws IOException {
        this(new ObjectOutputStream(os));
    }

    /**
     * @param out
     */
    protected TextSerializationObjectOutput(ObjectOutputStream out) {
        Assert.notNull(out, "output == null");
        this.outputStream = out;
    }

    /**
     * @return
     */
    protected ObjectOutputStream getObjectOutputStream() {
        return outputStream;
    }

    /** 
     * @see com.alibaba.dubbo.common.serialize.DataOutput#writeBool(boolean)
     */
    @Override
    public void writeBool(boolean v) throws IOException {
        writeUTF(String.valueOf(v));
    }

    /** 
     * @see com.alibaba.dubbo.common.serialize.DataOutput#writeByte(byte)
     */
    @Override
    public void writeByte(byte v) throws IOException {
        writeUTF(String.valueOf(v));
    }

    /** 
     * @see com.alibaba.dubbo.common.serialize.DataOutput#writeShort(short)
     */
    @Override
    public void writeShort(short v) throws IOException {
        writeUTF(String.valueOf(v));
    }

    /** 
     * @see com.alibaba.dubbo.common.serialize.DataOutput#writeInt(int)
     */
    @Override
    public void writeInt(int v) throws IOException {
        writeUTF(String.valueOf(v));
    }

    /** 
     * @see com.alibaba.dubbo.common.serialize.DataOutput#writeLong(long)
     */
    @Override
    public void writeLong(long v) throws IOException {
        writeUTF(String.valueOf(v));
    }

    /** 
     * @see com.alibaba.dubbo.common.serialize.DataOutput#writeFloat(float)
     */
    @Override
    public void writeFloat(float v) throws IOException {
        writeUTF(String.valueOf(v));
    }

    /** 
     * @see com.alibaba.dubbo.common.serialize.DataOutput#writeDouble(double)
     */
    @Override
    public void writeDouble(double v) throws IOException {
        writeUTF(String.valueOf(v));
    }

    /** 
     * @see com.alibaba.dubbo.common.serialize.DataOutput#writeUTF(String)
     */
    @Override
    public void writeUTF(String v) throws IOException {
        outputStream.writeUTF(v.toString());
    }

    /** 
     * @see com.alibaba.dubbo.common.serialize.DataOutput#writeBytes(byte[])
     */
    @Override
    public void writeBytes(byte[] v) throws IOException {
        writeUTF(new String(v, "utf-8"));
    }

    /** 
     * @see com.alibaba.dubbo.common.serialize.DataOutput#writeBytes(byte[], int, int)
     */
    @Override
    public void writeBytes(byte[] v, int off, int len) throws IOException {
        writeUTF(new String(v, off, len, "utf-8"));
    }

    /** 
     * @see com.alibaba.dubbo.common.serialize.DataOutput#flushBuffer()
     */
    @Override
    public void flushBuffer() throws IOException {
        outputStream.flush();
    }

    /** 
     * @see com.alibaba.dubbo.common.serialize.ObjectOutput#writeObject(Object)
     */
    @Override
    public void writeObject(Object obj) throws IOException {
        writeUTF(obj.toString());
    }

}
