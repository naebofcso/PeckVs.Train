package com.peckVsTrain.OneDirectionCoders;


import java.awt.Point;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.ImageIcon;
import javax.swing.JComponent;
import javax.swing.JLabel;

 
public class Chicken 
{
/**
	 * 
	 */
private static final long serialVersionUID = 1L;
private int score;
private final int MULTIPLIER;
private final int MAX_LIVES;
private int numLives;
private boolean invincible;
private boolean multiplierFifteen;
private boolean isSmall;
private JLabel currentChickLabel;
private JLabel[] chickLabels;
private String[] chickURLs;
private int row;
private int col;
//Needs instance variables for its various states using booleans to modify//
//its behavior//
/**
	 * @param args
	 */
	
	public Chicken(int x, int y)
	{
		col = x;
		row = y;
		MAX_LIVES = 5;
		MULTIPLIER = 15;
		numLives = 3;
		invincible = false;
		multiplierFifteen = false;
		isSmall = false;
		chickURLs = new String[] {"Resources/chickenup.jpeg", "Resources/chickendown.jpeg", 
								  "Resources/chickenleft.jpeg", "Resources/chickenright.jpeg"};
		initializeLabels();
		currentChickLabel = chickLabels[0];
		setLocation(col, row);
	}
	

	/*------------------------------------------------------------------------------

	@name       initializeLabels - initializes the chicken labels
	                                                                              */
	                                                                             /**
	            Fills an array of type JLabel with the up, down, left, and right 
	            JLabel images of the chicken.

	@return     null

	@param      null     
	                                                                              */
	//------------------------------------------------------------------------------
	public void initializeLabels()
	{
		chickLabels = new JLabel[4];
		for(int i = 0; i < chickLabels.length; i++)
		{
			ImageIcon chickImage = new ImageIcon(chickURLs[i]);
			chickLabels[i] = new JLabel("", chickImage, JLabel.CENTER);
		}
	}

	
	public void getEggProperty()
	{
		
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
		return getLocation().x;
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
		return getLocation().y;
	}
	

	/*------------------------------------------------------------------------------

	@name       getImage - get image
	                                                                              */
	                                                                             /**
	            returns the JLabel image that the chicken is associated with.

	@return     JLabel of the image the chicken is associated with.

	@param      null     
	                                                                              */
	//------------------------------------------------------------------------------
	public JLabel getImage()
	{
		return currentChickLabel;
	}
	

	/*------------------------------------------------------------------------------

	@name       setLocation - set location
	                                                                              */
	                                                                             /**
	            sets the location of the image of the chicken on the window.

	@return     null

	@param      null     
	                                                                              */
	//------------------------------------------------------------------------------
	public void setLocation(int x, int y)
	{
		currentChickLabel.setLocation(x, y);
		row = y;
		col = x;
	}
	
	/*------------------------------------------------------------------------------

	@name       getLocation - get location
	                                                                              */
	                                                                             /**
	            gets the location of the image of the chicken on the window.

	@return     point

	@param      null     
	                                                                              */
	//------------------------------------------------------------------------------
	public Point getLocation()
	{
		return currentChickLabel.getLocation();
	}
}