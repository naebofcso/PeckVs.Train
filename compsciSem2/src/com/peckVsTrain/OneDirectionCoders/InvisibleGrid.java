package com.peckVsTrain.OneDirectionCoders;

import java.awt.Dimension;




public class InvisibleGrid  
{
	private Dimension screenSize;
	private int [] [] gridLocations;
	
	public InvisibleGrid(Dimension Size)
	{
		gridLocations = new int [Size.height/80] [Size.width/80];
		gridLocations = initializeGrid(gridLocations);
	}
	public InvisibleGrid()
	{
		//default constructor//
	}
	
	public int [] [] initializeGrid(int [] [] myGrid)
	{
		//add the correct pixel values for each square of the grid//
		return myGrid;
	}
  
}
	
