package com.peckVsTrain.OneDirectionCoders;

import javax.swing.ImageIcon;
import javax.swing.JComponent;
import javax.swing.JLabel;

public class Train extends JComponent
{
	private int speed;
	private String[] trainURLs = new String[] {"","",""};
	private JLabel trainLabel;
	public Train(int initialSpeed)
	{
		speed = initialSpeed;
		ImageIcon trainImage = new ImageIcon(trainURLs[(int) (Math.random()*trainURLs.length)]);
		trainLabel = new JLabel("", trainImage, JLabel.CENTER);
	}
	public void incrementSpeed()
	{
		speed++;
	}
	public JLabel getImage()
	{
		return trainLabel;
	}
}
