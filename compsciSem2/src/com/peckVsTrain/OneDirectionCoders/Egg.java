package com.peckVsTrain.OneDirectionCoders;

import javax.swing.ImageIcon;
import javax.swing.JComponent;
import javax.swing.JLabel;



public class Egg extends JComponent
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String eggColor;
	private String eggProperty;
	private JLabel eggImage;
	private int row;
	private int col;
	private String[] eggImageURLs = new String[]{"", "", "", ""};
	
	public Egg(String inputColor, String property)
	{
		eggColor = inputColor;
		eggProperty = property;
		initializeImage(eggColor);
	}
	public String getColor()
	{
		return eggColor;
	}
	public String getProperty()
	{
		return eggProperty;
	}
	public void initializeImage(String color)
	{
		ImageIcon eggIcon = null;
		if(color.equals("white") || color.equals("White"))
		{
			eggIcon = new ImageIcon(eggImageURLs[0]);
		}
		if(color.equals("green") || color.equals("Green"))
		{
			eggIcon = new ImageIcon(eggImageURLs[1]);
		}
		if(color.equals("black") || color.equals("Black"))
		{
			eggIcon = new ImageIcon(eggImageURLs[2]);
		}
		if(color.equals("gold") || color.equals("Gold"))
		{
			eggIcon = new ImageIcon(eggImageURLs[3]);
		}
		eggImage = new JLabel("", eggIcon, JLabel.CENTER);
	}
	public void setLocation(int x, int y)
	{
		eggImage.setLocation(x, y);
		row = y;
		col = x;
	}
	public int getRow()
	{
		return row;
	}
	public int getCol()
	{
		return col;
	}
	public JLabel getImage()
	{
		return eggImage;
	}
}
