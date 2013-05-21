package com.peckVsTrain.OneDirectionCoders;

import java.awt.Dimension;

public class InvisibleGrid  
{
	private Dimension screenSize;
	private int[] xCoords;
	private int[] yCoords;
	private int[][] grid;
	public InvisibleGrid(Dimension size)
	{
		screenSize = size;
		xCoords = new int[size.width/(size.width/16)];
		yCoords = new int[size.height/(size.height/9)];
		initializeCoords();
	}
	public InvisibleGrid()
	{
		//default constructor//
	}
	
	public void initializeCoords()
	{
		for(int i = 0; i < xCoords.length; i++)
		{
			xCoords[i] = i*screenSize.width/16;
		}
		for(int j = 0; j < yCoords.length; j++)
		{
			yCoords[j] = j*screenSize.height/9;
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
	
