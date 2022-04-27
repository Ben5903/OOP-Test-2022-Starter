package ie.tudublin;

import java.util.ArrayList;

import processing.core.PApplet;
import processing.data.Table;
import processing.data.TableRow;

public class NematodeVisualiser extends PApplet
{
	ArrayList<Nematode> Nematodes = new ArrayList<Nematode>();
	

	public void keyPressed()
	{		
		if (keyCode == LEFT)
		{
		}		
	}


	public void settings()
	{
		size(800, 800);
	}

	public void setup() 
	{
		colorMode(HSB);
		background(0);
		smooth();				
	}
	
	// load and populate arraylist
	public void loadNematodes()
	{
		// creates table of nematodes
		Table table = loadTable("nematodes.csv", "header");
		
		// itterates through list
		for (TableRow row : table.rows())
		{
			Nematode Nema = new Nematode(row);
			Nematodes.add(Nema);
		}
	}


	public void draw()
	{	
	}
	

}
