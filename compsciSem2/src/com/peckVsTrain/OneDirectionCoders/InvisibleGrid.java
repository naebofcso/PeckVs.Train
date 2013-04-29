package com.peckVsTrain.OneDirectionCoders;

import java.awt.Dimension;




public class InvisibleGrid  
{
	private Dimension screenSize;
	private int [] [] gridLocations;
	
	public InvisibleGrid()
	{
		
	}
	public InvisibleGrid(Dimension screenDim)
	{
		screenSize = screenDim;
		//Modify so that it creates the right number of grid spaces//
		gridLocations = new int [screenSize.width/80] [screenSize.height/80];
	}
	
	public int [] [] intializeGrid(int [] [] myGrid)
	{
		//add the correct pixel values for each square of the grid//
		return myGrid;
	}
  
}
	
