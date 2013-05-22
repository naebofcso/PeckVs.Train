package com.peckVsTrain.OneDirectionCoders;


import java.awt.Dimension;
import java.awt.Point;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

 
public class Chicken implements KeyListener 
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
private int garbageX;
private int garbageY;
private InvisibleGrid myGrid;

/**
	 * @param args
	 */
	
	public Chicken(int x, int y, InvisibleGrid grid)
	{
		col = x;
		row = y;
		myGrid = grid;
		MAX_LIVES = 5;
		MULTIPLIER = 15;
		numLives = 3;
		invincible = false;
		multiplierFifteen = false;
		isSmall = false;
		chickURLs = new String[] {"Resources/chickenup.png", "Resources/chickendown.png", 
								  "Resources/chickenleft.png", "Resources/chickenright.png"};
		initializeLabels();
		currentChickLabel = chickLabels[0];
		setLocation(col, row);
		garbageX = -200;
		garbageY = -200;
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
			chickLabels[i].setSize(144, 144);
			chickLabels[i].setOpaque(false);
			System.out.println(chickLabels[i].getSize());
			if(i > 0)
			{
				chickLabels[i].setLocation(garbageX, garbageY);
				chickLabels[i].setVisible(false);
			}
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
		currentChickLabel.setLocation(myGrid.getXCoords()[x], myGrid.getYCoords()[y]);
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


	@Override
	public void keyTyped(KeyEvent e) 
	{
		
	}


	@Override
	public void keyPressed(KeyEvent e) 
	{
		if(e.getKeyCode() == KeyEvent.VK_UP && row > 0)
		{
			switchLabels(currentChickLabel, chickLabels[0]);
			setLocation(col, row -1);
			row--;
		}
		if(e.getKeyCode() == KeyEvent.VK_DOWN && row < myGrid.getYCoords().length-2)
		{
			switchLabels(currentChickLabel, chickLabels[1]);
			setLocation(col, row + 1);
			row++;
		}
		if(e.getKeyCode() == KeyEvent.VK_LEFT && col > 0)
		{
			switchLabels(currentChickLabel, chickLabels[2]);
			setLocation(col - 1, row);
			col--;
		}
		if(e.getKeyCode() == KeyEvent.VK_RIGHT && col < myGrid.getXCoords().length-2)
		{
			switchLabels(currentChickLabel, chickLabels[3]);
			setLocation(col + 1, row);
			col++;
		}
	}


	@Override
	public void keyReleased(KeyEvent e) 
	{}
	
	public Dimension getSize()
	{
		return currentChickLabel.getSize();
	}
	
	public void switchLabels(JLabel label1, JLabel label2)
	{
		int x = label1.getX();
		int y = label1.getY();
		label1.setLocation(garbageX, garbageY);
		label2.setLocation(x, y);
		currentChickLabel = label2;
		currentChickLabel.setVisible(true);
	}
	
	public JLabel[] getImageArray()
	{
		return chickLabels;
	}
}