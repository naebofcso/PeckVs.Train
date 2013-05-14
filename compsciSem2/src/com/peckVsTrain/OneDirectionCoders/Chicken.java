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
		ImageIcon chickImage = new ImageIcon("image url here");
		JLabel chickLabel = new JLabel("", chickImage, JLabel.CENTER);
	}

	@Override
	public void keyTyped(KeyEvent e) 
	{}

	@Override
	public void keyPressed(KeyEvent e) 
	{
		if(e.getKeyCode() == KeyEvent.VK_UP)
		{
			System.out.println("up");
		}
		if(e.getKeyCode() == KeyEvent.VK_DOWN)
		{
			System.out.println("down");
		}
		if(e.getKeyCode() == KeyEvent.VK_LEFT)
		{
			System.out.println("left");
		}
		if(e.getKeyCode() == KeyEvent.VK_RIGHT)
		{
			System.out.println("right");
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
	
}

