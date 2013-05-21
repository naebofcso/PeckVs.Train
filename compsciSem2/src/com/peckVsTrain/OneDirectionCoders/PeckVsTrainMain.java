package com.peckVsTrain.OneDirectionCoders;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class PeckVsTrainMain 

{ 
	private static JLabel[] myImages;
	private static Egg[] eggsList;
	private static Train[] trainsList;
	private static MyWindow mainWindow;
	
	/**
	 * @param args
	 */
	/*------------------------------------------------------------------------------

	@name       main - main method
	                                                                              */
	                                                                             /**
	            sets everything up and runs it

	@return     null

	@param      null     
	                                                                              */
	//------------------------------------------------------------------------------
	public static void main(String[] args) 
	{
		mainWindow = new MyWindow();
		//loadImages(myURLs); 
		//mainWindow.addImages(myImages);
		//initializeEggs();
		initializeTrains();
		InvisibleGrid myGrid = new InvisibleGrid(mainWindow.getSize());
		Chicken myChick = new Chicken(400, 400);
		mainWindow.getFrame().addKeyListener(myChick);
		mainWindow.add(myChick);
		Button myButton = new Button("PauseButton");
		myButton.setLocation(100,100);
		mainWindow.add(myButton);
		mainWindow.setVisible(true);
		System.out.println(myButton.getSize());
	}
	
	/*------------------------------------------------------------------------------

	@name       loadImages - loads the JLabel images
	                                                                              */
	                                                                             /**
	            Loads the image as JLabels from their respective filepaths

	@return     A full JLabel array that has all of the background images in it.

	@param      String array full of the filepaths for the images     
	                                                                              */
	//------------------------------------------------------------------------------
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
	
	/*------------------------------------------------------------------------------

	@name       initializeEggs- initializes the eggs into an array
	                                                                              */
	                                                                             /**
	            creates an array of Egg objects that can be accessed later on.

	@return     null

	@param      null     
	                                                                              */
	//------------------------------------------------------------------------------
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
	
	/*------------------------------------------------------------------------------

	@name       initializeTrains - initializes an array of train objects
	                                                                              */
	                                                                             /**
	            fills an array of Train with Train objects that can be accessed later.

	@return     null

	@param      null     
	                                                                              */
	//------------------------------------------------------------------------------
	public static void initializeTrains()
	{
		trainsList = new Train[10];
		for(int i = 0; i < trainsList.length; i++)
		{
			trainsList[i] = new Train(1);
		}
	}
	public MyWindow getWindow()
	{
		return mainWindow;
	}
	
	
	
	
}
