package com.peckVsTrain.OneDirectionCoders;

import java.awt.Dimension;

public class InvisibleGrid  
{
	private Dimension screenSize;
	private int[] xCoords;
	private int[] yCoords;
	private int[][] grid;
	public InvisibleGrid()
	{
		screenSize = new Dimension(1280, 721);
		xCoords = new int[screenSize.width/(screenSize.width/16)];
		yCoords = new int[7];
		initializeCoords();
	}
	
	public void initializeCoords()
	{
		for(int i = 0; i < xCoords.length; i++)
		{
			xCoords[i] = i*screenSize.width/16;
		}
		for(int j = 0; j < yCoords.length; j++)
		{
			yCoords[j] = j*screenSize.height/7-50 + j*5 + j;
		}
		grid = new int[][] {xCoords, yCoords};
	}
	public int[] getXCoords()
	{
		return xCoords;
	}
	
	public int[] getYCoords()
	{
		return yCoords;
	}
	
	public int[] [] getGrid()
	{
		return grid;
	}
}
	
