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

//Needs instance variables for its various states using booleans to modify//
//its behavior//
/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		 Chicken myChick = new Chicken(); 
	}
	
	public Chicken()
	{
		addKeyListener(this);
		MAX_LIVES = 5;
		MULTIPLIER = 15;
		numLives = 3;
		invincible = false;
		multiplierFifteen = false;
		isSmall = false;
		chickURLs = new String[] {"", "", "", ""};
		initializeLabels();
		currentChickLabel = chickLabels[0];
	}
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
	public void keyPressed(KeyEvent e) 
	{
		if(e.getKeyCode() == KeyEvent.VK_UP && row > 0)
		{
			currentChickLabel = chickLabels[0];
			setLocation(col, row+1);
			row = row +1;
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
	public int getRow()
	{
		return getLocation().x;
	}
	public int getCol()
	{
		return getLocation().y;
	}
	public JLabel getImage()
	{
		return currentChickLabel;
	}
	public void setLocation(int x, int y)
	{
		currentChickLabel.setLocation(x, y);
		row = y;
		col = x;
	}
	
}