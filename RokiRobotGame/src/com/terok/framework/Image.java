package com.terok.framework;

import com.terok.framework.Graphics.ImageFormat;

public interface Image {
	public int getWidth();
    public int getHeight();
    public ImageFormat getFormat();
    public void dispose();

}
