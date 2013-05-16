package com.peckVsTrain.OneDirectionCoders;


import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.ImageIcon;
import javax.swing.JComponent;
import javax.swing.JLabel;

 
public class Chicken extends JComponent implements KeyListener
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
private PeckVsTrainMain main;
//Needs instance variables for its various states using booleans to modify//
//its behavior//
/**
	 * @param args
	 */
	
	public Chicken(int x, int y, PeckVsTrainMain myApp)
	{
		addKeyListener(this);
		main = myApp;
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

	@Override
	public void keyTyped(KeyEvent e) 
	{}

	@Override
	/*------------------------------------------------------------------------------

	@name       keyPressed - key pressed
	                                                                              */
	                                                                             /**
	            Handles what the chicken should do when one of the arrow keys is pressed.

	@return     null

	@param      null     
	                                                                              */
	//------------------------------------------------------------------------------
	public void keyPressed(KeyEvent e) 
	{
		if(e.getKeyCode() == KeyEvent.VK_UP && row > 0)
		{
			main.remove(currentChickLabel);
			currentChickLabel = chickLabels[0];
			setLocation(col, row+1);
			row = row +1;
			System.out.println("up");
		}
		if(e.getKeyCode() == KeyEvent.VK_DOWN && row < 720)
		{
			currentChickLabel = chickLabels[1];
			setLocation(col, row-1);
			row = row -1;
		}
		if(e.getKeyCode() == KeyEvent.VK_LEFT && col > 0)
		{
			currentChickLabel = chickLabels[2];
			setLocation(col-1, row);
			col = col -1;
		}
		if(e.getKeyCode() == KeyEvent.VK_RIGHT && col < 1280)
		{
			currentChickLabel = chickLabels[3];
			setLocation(col+1, row);
			col = col + 1;
		}
	}
	
	@Override
	public void keyReleased(KeyEvent e) 
	{}
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
	
}