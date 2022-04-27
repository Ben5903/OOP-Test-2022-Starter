package ie.tudublin;

import java.util.ArrayList;

import processing.core.PApplet;
import processing.data.Table;
import processing.data.TableRow;

public class NematodeVisualiser extends PApplet
{
	ArrayList<Nematode> nematodes = new ArrayList<Nematode>();
	
	int choice = 0;

	public void keyPressed()
	{		
		if (keyCode == LEFT)
		{
			choice = choice + 1;
		}	
		
		if (keyCode == RIGHT)
		{
			choice = choice - 1;
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
		printNematodes();

	}

	public void printNematodes()
	{
		for (Nematode n:nematodes)
		{
			System.out.println(n);
		}
	}
	
	// load and populate arraylist
	public void loadNematodes()
    {
        Table table = loadTable("nematodes.csv", "header");
        for(TableRow r:table.rows())
        {
            Nematode nema = new Nematode(r);
            nematodes.add(nema);
        }
}

	public void draw()
	{	
		int total = nematodes.size();
		int NemaList = choice & total;
		clear();
		textSize(30);
		textAlign(CENTER);
		String Name = nematodes.get(NemaList).name;
		text(Name, 300, 50);
	}
	

}
