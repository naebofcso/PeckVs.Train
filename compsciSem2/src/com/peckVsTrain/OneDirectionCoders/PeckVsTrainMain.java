package com.peckVsTrain.OneDirectionCoders;

import java.awt.BorderLayout;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class PeckVsTrainMain 
{
	private static String[] myURLs; //holds all of the file URLs in order to load all of the images easily//
	private static JLabel[] myImages;
	private static Egg[] eggsList;
	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		MyWindow mainWindow = new MyWindow();
		loadImages(myURLs); 
		mainWindow.addImages(myImages);
		initializeEggs();
		Chicken myChick = new Chicken();
		mainWindow.add(myChick.getImage());
		myChick.getImage().setLocation(0,0);
		mainWindow.setVisible(true);
	}
	
	public static JLabel[] loadImages(String[] URLs)
	{
		myImages = new JLabel[URLs.length];
		for(int i = 0; i < URLs.length; i++)
		{
			ImageIcon image = new ImageIcon(URLs[i]);
			JLabel label = new JLabel("", image, JLabel.CENTER);
			myImages[i] = label;
		}
		return myImages;
	}
	public static void initializeEggs()
	{
		eggsList = new Egg[20];
		for(int i = 0; i < eggsList.length; i++)
		{
			if(i < 10)
			{
				eggsList[i] = new Egg("White", "Normal");
			}
			if(i >= 10 && i < 15)
			{
				eggsList[i] = new Egg("Green", "Multiplier");
			}
			if(i >= 15 && i < 18)
			{
				eggsList[i] = new Egg("Black", "Death");
			}
			if(i >=18)
			{
				eggsList[i] = new Egg("Gold", "Life");
			}
		}
	}

}
