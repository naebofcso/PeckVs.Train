package com.peckVsTrain.OneDirectionCoders;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Button implements MouseListener
{
	private String buttonName;
	private boolean activated;
	
	public Button(String name)
	{
		buttonName = name;
		activated = false;
		ImageIcon testIcon = new ImageIcon("Resources/pause button.png");
		JLabel buttonLabel = new JLabel("", testIcon, JLabel.CENTER);
		buttonLabel.setSize(testIcon.getIconWidth(), testIcon.getIconHeight());
		buttonLabel.addMouseListener(this);
	}

	@Override
	public void mouseClicked(MouseEvent e) 
	{
		activated = !activated;
		System.out.println(activated);
	}

	@Override
	public void mousePressed(MouseEvent e) 
	{
		
	}

	@Override
	public void mouseReleased(MouseEvent e){}

	@Override
	public void mouseEntered(MouseEvent e) {}

	@Override
	public void mouseExited(MouseEvent e) {}
	
	public boolean getActivated()
	{
		return activated;
	}
	
	public String getName()
	{
		return buttonName;
	}

}
