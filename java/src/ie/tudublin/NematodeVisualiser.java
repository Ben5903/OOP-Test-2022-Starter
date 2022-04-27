package ie.tudublin;

import java.util.ArrayList;

import processing.core.PApplet;
import processing.data.Table;
import processing.data.TableRow;
public class NematodeVisualiser extends PApplet
{
	ArrayList<Nematode> nematodes = new ArrayList<Nematode>();

	// created to itterate through nematodes
	int i = 0;

	public void keyPressed()
	{
		switch(keyCode)
		{
			case LEFT:
			{
				i=1-1;
				if(i == -1)
				{
					i = nematodes.size() - 1;
				}
				break;
			}
			case RIGHT:
			{
				i=i+1;
				if(i == nematodes.size())
				{
					i = 0;
				}
				break;
			}	
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
		
		loadNematodes();
		displayNematode();
	}
	

	public void loadNematodes()
	{
		Table table = loadTable("nematodes.csv", "header");

		for (TableRow r:table.rows())
		{
			Nematode n = new Nematode(r);
			nematodes.add(n);
		}
	}

	public void displayNematode()
	{
		for (Nematode n:nematodes)
		{
			println(n);
		}
	}


	public void drawNeamtodes(int index, float c)
	{
		nematodes.get(i).render(this, c);
	}

	
	public void draw()
	{
		drawNeamtodes(i, map(i, 0, nematodes.size(), 0, 255));
	}
}