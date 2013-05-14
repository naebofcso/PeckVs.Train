package com.peckVsTrain.OneDirectionCoders;


import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JComponent;

 
public class Chicken extends JComponent implements KeyListener
{
private int row;
private int col;
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
	}

	@Override
	public void keyTyped(KeyEvent e) 
	{}

	@Override
	public void keyPressed(KeyEvent e) 
	{
		if(e.getKeyCode() == KeyEvent.VK_UP)
		{
			
		}
		if(e.getKeyCode() == KeyEvent.VK_DOWN)
		{
			
		}
		if(e.getKeyCode() == KeyEvent.VK_LEFT)
		{
			
		}
		if(e.getKeyCode() == KeyEvent.VK_RIGHT)
		{
			
		}
	}

	@Override
	public void keyReleased(KeyEvent e) 
	{}
	public void getEggColor()
	{
		
	}
}

