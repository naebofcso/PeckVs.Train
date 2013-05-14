package com.peckVsTrain.OneDirectionCoders;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Train 
{
	private String color;
	private int speed;
	public Train(String inputColor, int initialSpeed)
	{
		color = inputColor;
		speed = initialSpeed;
		ImageIcon trainImage = new ImageIcon("image url here");
		JLabel trainLabel = new JLabel("", trainImage, JLabel.CENTER);
	}
}
