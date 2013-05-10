package com.peckVsTrain.OneDirectionCoders;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MyWindow extends JComponent 
{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JFrame frame;
	private Dimension size;
	private JPanel contentArea;
	
	public MyWindow()
	{
		super();
		initialize();
	}
	public void initialize()
	{
		frame = new JFrame();
		size = new Dimension(1280, 720);
		frame.setPreferredSize(size);
		frame.setTitle("Peck Vs. Train");
		contentArea = new JPanel();
		contentArea.setBackground(Color.white);
		contentArea.setName(frame.getRootPane().getName() + ".contentArea");
		contentArea.setLayout(new FlowLayout(FlowLayout.LEFT));
		frame.setContentPane(contentArea);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setLocation(0, 0);
		frame.setVisible(true);
	}
	public static void main(String [] args)
	{
		MyWindow test = new MyWindow();
		test.setVisible(true);
	}
	//Adds objects to the window//
	public void add(String URLlocation)
	{
		BufferedImage image = null;
		try 
		  {                
	          image = ImageIO.read(new File(URLlocation));
	       } catch (IOException ex) {
	            // handle exception...
	       }
		paintComponent(null, image);
	    }
	protected void paintComponent(Graphics g, BufferedImage image) {
        super.paintComponent(g);
        g.drawImage(image, 0, 0, null); // see javadoc for more info on the parameters            
    }

	}
