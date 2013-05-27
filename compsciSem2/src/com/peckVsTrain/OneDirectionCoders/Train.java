package com.peckVsTrain.OneDirectionCoders;

import javax.swing.ImageIcon;
import javax.swing.JComponent;
import javax.swing.JLabel;

public class Train extends JComponent
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int speed;
	private String[] trainURLs = new String[] {"Resources/train right copy.png", "Resources/Train_Left.png", 
			"Resources/Train_Right.png"};
	private JLabel trainLabel;
	public Train(int initialSpeed)
	{
		speed = initialSpeed;
		ImageIcon trainImage = new ImageIcon(trainURLs[(int) (Math.random()*trainURLs.length)]);
		trainLabel = new JLabel("", trainImage, JLabel.CENTER);
		trainLabel.setSize(trainImage.getIconWidth(), trainImage.getIconHeight());
	}
	

	/*------------------------------------------------------------------------------

	@name       incrementSpeed - increments speed 
	                                                                              */
	                                                                             /**
	            increases the speed of the individual train

	@return     null

	@param      null     
	                                                                              */
	//------------------------------------------------------------------------------
	public void incrementSpeed()
	{
		speed++;
	}
	

	/*------------------------------------------------------------------------------

	@name       getImage - get image
	                                                                              */
	                                                                             /**
	            returns the image associated with the train

	@return     JLabel image associated with the instance of the train.

	@param      null     
	                                                                              */
	//------------------------------------------------------------------------------
	public JLabel getImage()
	{
		return trainLabel;
	}
	

	/*------------------------------------------------------------------------------

	@name       getSpeed - get speed
	                                                                              */
	                                                                             /**
	            returns the int value of the train's speed.

	@return     int that represents the train's speed.

	@param      null     
	                                                                              */
	//------------------------------------------------------------------------------
	public int getSpeed()
	{
		return speed;
	}
	
	public void setLocation(int x, int y)
	{
		trainLabel.setLocation(x, y);
	}
}
