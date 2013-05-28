package com.peckVsTrain.OneDirectionCoders;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class PeckVsTrainMain 

{ 
	private static JLabel[] myImages;
	private static Egg[] eggsList;
	private static Train[] trainsList;
	private static MyWindow mainWindow;
	private static JLabel backgroundLabel;
	private static String trainURL; 
	private static InvisibleGrid myInvisibleGrid;
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
		loadBackground();
		trainsList = initializeTrains(5);
		addTrains(trainsList);
		myInvisibleGrid = new InvisibleGrid();
		initializeEggs(myInvisibleGrid);
		Chicken myChick = new Chicken(3, 3, myInvisibleGrid);
		mainWindow.getFrame().addKeyListener(myChick);
		mainWindow.add(myChick);
		//Button myButton = new Button("PauseButton");
		//myButton.setLocation(100,100);
		//mainWindow.add(myButton);
		mainWindow.add(backgroundLabel);
		System.out.println(backgroundLabel.getSize());
		mainWindow.setVisible(true);
		start();
		//System.out.println(myButton.getSize());
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
	public static void initializeEggs(InvisibleGrid grid)
	{
		eggsList = new Egg[20];
		for(int i = 0; i < eggsList.length; i++)
		{
			if(i < 10)
			{
				eggsList[i] = new Egg("White", "Normal", grid);
			}
			if(i >= 10 && i < 15)
			{
				eggsList[i] = new Egg("Green", "Multiplier", grid);
			}
			if(i >= 15 && i < 18)
			{
				eggsList[i] = new Egg("Black", "Death", grid);
			}
			if(i >=18)
			{
				eggsList[i] = new Egg("Orange", "Life" , grid);
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
	public static Train[] initializeTrains(int numTrains)
	{
		Train[] temp = new Train[numTrains];
		for(int i = 0; i < numTrains; i++)
		{
			if(i%2 == 0)
			{
			temp[i] = new Train(1);
			}
			if(i%2 == 1)
			{
				temp[i] = new Train(-1);
			}
		}
		return temp;
	}
	public MyWindow getWindow()
	{
		return mainWindow;
	}
	
	public static void loadBackground()
	{
		ImageIcon backgroundImage = new ImageIcon("Resources/backgroundddd.jpeg");
		backgroundLabel = new JLabel(backgroundImage);
		//backgroundLabel.setIcon(backgroundImage);
		backgroundLabel.setSize(backgroundImage.getIconWidth(), backgroundImage.getIconHeight());
	}
	
	public static void addTrains(Train[] trains)
	{
		for(int i = 0; i < trains.length; i++)
		{
			if(trains[i].getSpeed() < 0)
			{
				trains[i].setLocation(mainWindow.getWidth(), myInvisibleGrid.getYCoords()[i+1]);
			}
			if(trains[i].getSpeed() > 0)
			{
				trains[i].setLocation(-504, myInvisibleGrid.getYCoords()[i+1]);
			}
			mainWindow.add(trains[i]);
		}
	}
	
	public static void start()
	{
		
	}
	
	public static void reset(Train train)
	{
		
	}
	
	
}
