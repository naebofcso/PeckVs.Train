package com.peckVsTrain.OneDirectionCoders;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;

import javax.swing.ImageIcon;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MyWindow extends JComponent 
{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private final int DEFAULT_WIDTH;
	private final int DEFAULT_HEIGHT;
	private final double SCALING_FACTOR;
	private JFrame frame;
	private final Dimension DEFAULT_SIZE;
	private Dimension currentSize;
	private JPanel contentArea;
	private int[] xCoords; //x coordinates for images that need to be pre-loaded onto the screen//
	private int[] yCoords;//y coordinates for images that need to be pre-loaded onto the screen//
	
	public MyWindow()
	{
		super();
		DEFAULT_WIDTH = 1280;
		DEFAULT_HEIGHT = 750;
		DEFAULT_SIZE = new Dimension(DEFAULT_WIDTH, DEFAULT_HEIGHT);
		SCALING_FACTOR = 0.8;
		currentSize = null;
		initialize();
		setLayout(null);
	}
	
	/*------------------------------------------------------------------------------

	@name       initialize - initializes the window elements
	                                                                              */
	                                                                             /**
	            Initializes window elements

	@return     null

	@param      null     
	                                                                              */
	//------------------------------------------------------------------------------
	public void initialize()
	{
		frame = new JFrame();
		if(compareDim(PeckUtils.getScreenSize(), DEFAULT_SIZE) <=0)
		{
			Dimension modSize = new Dimension(
			(int) (DEFAULT_WIDTH *SCALING_FACTOR), (int) (DEFAULT_HEIGHT *SCALING_FACTOR));
			frame.setPreferredSize(modSize);
			currentSize = modSize;
		}
		else
		{
			frame.setPreferredSize(DEFAULT_SIZE);
			currentSize = DEFAULT_SIZE;
		}
		frame.setTitle("Peck Vs. Train");
		contentArea = new JPanel();
		contentArea.setBackground(Color.black);
		contentArea.setName(frame.getRootPane().getName() + ".contentArea");
		contentArea.setLayout(null);
		frame.setContentPane(contentArea);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setLocation(0, 0);
		frame.setVisible(true);
	}
	
	/*------------------------------------------------------------------------------

	@name       main - main method
	                                                                              */
	                                                                             /**
	            main

	@return     null

	@param      null     
	                                                                              */
	//------------------------------------------------------------------------------
	public static void main(String [] args)
	{
		
	}
	
	/*------------------------------------------------------------------------------

	@name       add - adds specfic component
	                                                                              */
	                                                                             /**
	            adds component to window

	@return     null

	@param      Chicken object     
	                                                                              */
	//------------------------------------------------------------------------------
	public void add(Chicken chicken)
	{
		for(int i = 0; i < chicken.getImageArray().length; i++)
		{
			contentArea.add(chicken.getImageArray()[i]);
		}
	}
	
	/*------------------------------------------------------------------------------

	@name       add - adds specfic component
	                                                                              */
	                                                                             /**
	            adds component to window

	@return     null

	@param      Train object     
	                                                                              */
	//------------------------------------------------------------------------------
	public void add(Train train)
	{
		contentArea.add(train.getImage());
	}
	
	/*------------------------------------------------------------------------------

	@name       add - adds specfic component
	                                                                              */
	                                                                             /**
	            adds component to window

	@return     null

	@param      Egg object     
	                                                                              */
	//------------------------------------------------------------------------------
	public void add(Egg egg)
	{
		contentArea.add(egg.getImage());
	}
	
	public void add(Button button)
	{
		contentArea.add(button.getImage());
	}
	
	/*------------------------------------------------------------------------------

	@name       addImages - adds background images
	                                                                              */
	                                                                             /**
	            adds background images

	@return     null

	@param      Array of different JLabel images     
	                                                                              */
	//------------------------------------------------------------------------------
	public void addImages(JLabel[] images)
	{
		for(int i = 0; i < images.length; i++)
		{
			contentArea.add(images[i], BorderLayout.CENTER);
			images[i].setLocation(xCoords[i], yCoords[i]);
		}
    }
	
	public void add(JLabel label)
	{
		frame.add(label);
	}
	
	
	/*------------------------------------------------------------------------------

	@name       setVisible - makes window visible
	                                                                              */
	                                                                             /**
	            makes window visible

	@return     null

	@param      Boolean that is true or false 
	                                                                              */
	//------------------------------------------------------------------------------
	 public void setVisible(boolean isVisible)
	 {
		 frame.setVisible(isVisible);
	 }
	 
	 /*------------------------------------------------------------------------------

		@name       getScalingFactor - returns scaling factor
		                                                                              */
		                                                                             /**
		            returns scaling factor

		@return     double of the scaling factor

		@param      null     
		                                                                              */
		//------------------------------------------------------------------------------
	 public double getScalingFactor()
	 {
		 return SCALING_FACTOR;
	 }
	 /*------------------------------------------------------------------------------

		@name       getDefaultWidth - returns default width
		                                                                              */
		                                                                             /**
		            returns default width

		@return     returns an int of the default width

		@param      null    
		                                                                              */
		//------------------------------------------------------------------------------
	 public int getDefaultWidth()
	 {
		 return DEFAULT_WIDTH;
	 }
	 /*------------------------------------------------------------------------------

		@name       getDefaultHeight - returns default height
		                                                                              */
		                                                                             /**
		            returns default height

		@return     int of the default height

		@param      null     
		                                                                              */
		//------------------------------------------------------------------------------
	 public int getDefaultHeight()
	 {
		 return DEFAULT_HEIGHT;
	 }
	 
	 /*------------------------------------------------------------------------------

		@name       compareDim - compares two input dimensions
		                                                                              */
		                                                                             /**
		            compares two dimensions by looking at their x and y sizes

		@return     1 if the first is bigger, 0 if they are the same, -1 if the first is
					smaller.

		@param      Two valid dimensions dim1 and dim2     
		                                                                              */
		//------------------------------------------------------------------------------
	 public int compareDim(Dimension dim1, Dimension dim2)
	 {
		 if(dim1.height < dim2.height || dim1.width < dim2.width)
		 {
			 return -1;
		 }
		 if(dim1.height > dim2.height || dim1.width < dim2.width)
		 {
			 return 1;
		 }
		 else
		 {
			 return 0;
		 }
	 }
	
	 public Dimension getSize()
	 {
		 return currentSize;
	 }
	 
	public JFrame getFrame()
	{
		return frame;
	}
	}

