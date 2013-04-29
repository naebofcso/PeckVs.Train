package com.peckVsTrain.OneDirectionCoders;

public class PeckVsTrainMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		InvisibleGrid grid = new InvisibleGrid(30,30);
		Chicken peck = new Chicken();
		grid.add(peck);
		
		
	    grid.setVisible(true);

	}

}
