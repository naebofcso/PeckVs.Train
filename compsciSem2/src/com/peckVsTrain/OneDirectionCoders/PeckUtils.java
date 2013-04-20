package com.peckVsTrain.OneDirectionCoders;

import java.awt.Dimension;
import java.awt.Toolkit;

public class PeckUtils 
{
	public static Dimension getScreenSize()
	{
		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
		return dim;
	}
	public static int getScreenWidth()
	{
		return getScreenSize().width;
	}
	public static int getScreenHeight()
	{
		return getScreenSize().height;
	}
}
