package com.peckVsTrain.OneDirectionCoders;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
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
	private JPanel contentArea;
	private int[] xCoords; //x coordinates for images that need to be pre-loaded onto the screen//
	private int[] yCoords;//y coordinates for images that need to be pre-loaded onto the screen//
	
	public MyWindow()
	{
		super();
		DEFAULT_WIDTH = 1280;
		DEFAULT_HEIGHT = 720;
		DEFAULT_SIZE = new Dimension(DEFAULT_WIDTH, DEFAULT_HEIGHT);
		SCALING_FACTOR = 0.8;
		initialize();
		InvisibleGrid myGrid = new InvisibleGrid();
	}
	public void initialize()
	{
		frame = new JFrame();
		if(compareDim(PeckUtils.getScreenSize(), DEFAULT_SIZE) <=0)
		{
			Dimension modSize = new Dimension((int) (DEFAULT_WIDTH *SCALING_FACTOR), (int) (DEFAULT_HEIGHT *SCALING_FACTOR));
			frame.setPreferredSize(modSize);
		}
		else
		{
			frame.setPreferredSize(DEFAULT_SIZE);
		}
		frame.setTitle("Peck Vs. Train");
		contentArea = new JPanel();
		contentArea.setBackground(Color.white);
		contentArea.setName(frame.getRootPane().getName() + ".contentArea");
		contentArea.setLayout(new FlowLayout(FlowLayout.LEFT));
		frame.setContentPane(contentArea);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setLocation(0, 0);
		frame.setVisible(false);
	}
	public static void main(String [] args)
	{
		MyWindow test = new MyWindow();
		test.setVisible(true);
	}
	public void add(JLabel myLabel)
	{
		super.add(myLabel);
	}
	//Adds objects to the window//
	public void addImages(JLabel[] images)
	{
		for(int i = 0; i < images.length; i++)
		{
			contentArea.add(images[i], BorderLayout.CENTER);
			images[i].setLocation(xCoords[i], yCoords[i]);
		}
    }
	
	 public void setVisible(boolean isVisible)
	 {
		 frame.setVisible(isVisible);
	 }
	 
	 public double getScalingFactor()
	 {
		 return SCALING_FACTOR;
	 }
	 public int getDefaultWidth()
	 {
		 return DEFAULT_WIDTH;
	 }
	 public int getDefaultHeight()
	 {
		 return DEFAULT_HEIGHT;
	 }
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
	}

