package com.peckVsTrain.OneDirectionCoders;


import java.awt.GridLayout;
import javax.swing.JButton;

public class InvisibleGrid extends MyWindow 
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * @param args
	 */
	MyWindow myWindow = new MyWindow();
	
	
	
	
	public InvisibleGrid(int width, int length)
	{
	
	myWindow.setLayout(new GridLayout (width, length));
	//myWindow.pack();
	myWindow.setVisible(true); 
	JButton [][] grid = new JButton[width][length];
	
		for (int i = 0; i <grid.length; i ++)
		{
			for (int k = 0; k <grid.length; k ++)
			{
			grid[i][k] = new JButton("("+i+", "+k+")");
			myWindow.add(grid[i][k]);
			}
		}
	
	
	
	}
	
	public void setLocation(int i, int j) 
	{
	}
	
	public void add(Chicken peck)
	{
		add(myWindow, peck);
	}
	
	
	public static void main(String[] args) 
	{
		 new InvisibleGrid(30,30);

	}

	
  
}
	
