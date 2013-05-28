package com.peckVsTrain.OneDirectionCoders;

import javax.swing.ImageIcon;
import javax.swing.JComponent;
import javax.swing.JLabel;



public class Egg extends JComponent
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String eggColor;
	private String eggProperty;
	private JLabel eggImage;
	private int row;
	private int col;
	private String[] eggImageURLs = new String[]{"Egg_Point.png", "Egg_ScoreX15.png", "Egg_Hurt.png", 
			" Egg_Life.png", "Egg_Invincibility.png", "Egg_Shrink.png", "Egg_Speed.png"};
	private InvisibleGrid myGrid;
	
	public Egg(String inputColor, String property, InvisibleGrid grid)
	{
		myGrid = grid;
		eggColor = inputColor;
		eggProperty = property;
		initializeImage(eggColor);
	}
	
	/*------------------------------------------------------------------------------

	@name       getColor - getColor
	                                                                              */
	                                                                             /**
	            returns the color of the egg

	@return     String containing the color of the egg

	@param      null     
	                                                                              */
	//------------------------------------------------------------------------------
	public String getColor()
	{
		return eggColor;
	}
	
	/*------------------------------------------------------------------------------

	@name       getProperty - getProperty
	                                                                              */
	                                                                             /**
	            returns the property of the egg based on its color

	@return     String containing the egg's property

	@param      null     
	                                                                              */
	//------------------------------------------------------------------------------
	public String getProperty()
	{
		return eggProperty;
	}
	
	/*------------------------------------------------------------------------------

	@name       initializeImage - initializes the egg image
	                                                                              */
	                                                                             /**
	            initializes the egg's image to match its color and property

	@return     null

	@param      String with the egg's color     
	                                                                              */
	//------------------------------------------------------------------------------
	public void initializeImage(String color)
	{
		ImageIcon eggIcon = null;
		if(color.equals("white") || color.equals("White"))
		{
			eggIcon = new ImageIcon(eggImageURLs[0]);
		}
		if(color.equals("green") || color.equals("Green"))
		{
			eggIcon = new ImageIcon(eggImageURLs[1]);
		}
		if(color.equals("black") || color.equals("Black"))
		{
			eggIcon = new ImageIcon(eggImageURLs[2]);
		}
		if(color.equals("orange") || color.equals("Orange"))
		{
			eggIcon = new ImageIcon(eggImageURLs[3]);
		}
		if(color.equals("gold") || color.equals("Gold"))
		{
			eggIcon = new ImageIcon(eggImageURLs[4]);
		}
		if(color.equals("pink") || color.equals("Pink"))
		{
			eggIcon = new ImageIcon(eggImageURLs[5]);
		}
		if(color.equals("red") || color.equals("Red"))
		{
			eggIcon = new ImageIcon(eggImageURLs[6]);
		}
		eggImage = new JLabel("", eggIcon, JLabel.CENTER);
	}
	
	/*------------------------------------------------------------------------------

	@name       setLocation - sets Location
	                                                                              */
	                                                                             /**
	            sets the location of the egg's image and modifies the col and row instance 
	            variables to match the current coordinates of the egg.

	@return     null

	@param      null     
	                                                                              */
	//------------------------------------------------------------------------------
	public void setLocation(int x, int y)
	{
		eggImage.setLocation(x, y);
		row = y;
		col = x;
	}
	
	/*------------------------------------------------------------------------------

	@name       getRow - get row
	                                                                              */
	                                                                             /**
	            returns the row that the egg is in.

	@return     int of the row that the egg is in.

	@param      null     
	                                                                              */
	//------------------------------------------------------------------------------
	public int getRow()
	{
		return row;
	}
	

	/*------------------------------------------------------------------------------

	@name       getCol - get col
	                                                                              */
	                                                                             /**
	            returns the col that the egg is in.

	@return     int of the col that the egg is in.

	@param      null     
	                                                                              */
	//------------------------------------------------------------------------------
	public int getCol()
	{
		return col;
	}
	

	/*------------------------------------------------------------------------------

	@name       getImage - get image
	                                                                              */
	                                                                             /**
	            returns the the image associated with the egg so that the image can be
	            manipulated.

	@return     the image associated with the egg instance.

	@param      null     
	                                                                              */
	//------------------------------------------------------------------------------
	public JLabel getImage()
	{
		return eggImage;
	}
}
