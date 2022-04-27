package ie.tudublin;

import processing.data.TableRow;
import javazoom.jl.player.PlayerApplet;
import processing.core.PApplet;

public class Nematode
{
    private String name;
    private float length;
    private boolean limbs;
    private String gender;
    private boolean eyes;

    public Nematode(String name, float length, boolean limbs, String string, boolean eyes)
    {
        this.name = name;
        this.length = length;
        this.limbs = limbs;
        this.gender = string;
        this.eyes = eyes;
    }


    public Nematode(TableRow tr)
    {
        this(
            tr.getString("name"), 
            tr.getFloat("length"),
            tr.getInt("limbs") == 1,  
            tr.getString("gender"),
            tr.getInt("eyes") == 1
        );
    }

    public String toString()
    {
        return "Nematode eyes " + eyes + ", gender " + gender + ", length " + length + ", limbs " + limbs + ", name "
                + name + "";
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public float getLength()
    {
        return length;
    }

    public void setLength(float length)
    {
        this.length = length;
    }

    public boolean isLimbs()
    {
        return limbs;
    }

    public void setLimbs(boolean limbs)
    {
        this.limbs = limbs;
    }

    public String getGender()
    {
        return gender;
    }

    public void setGender(String gender)
    {
        this.gender = gender;
    }

    public boolean isEyes()
    {
        return eyes;
    }

    public void setEyes(boolean eyes)
    {
        this.eyes = eyes;
    }

    public void render(NematodeVisualiser pa, float c)
    {
        pa.background(0);
        int nemaSize = 30;
        int sizeOfText = 10;
        pa.fill(255);
    
        pa.textAlign(PApplet.CENTER, PApplet.CENTER);
        pa.text(name, pa.width/2, (pa.height/2 - (length/2 * nemaSize) - (sizeOfText * 3)));

        pa.strokeWeight(2);
        pa.stroke(255);
        pa.noFill();

        // circle creation for nematode
        for(int circles = 0; circles < length; circles++)
        {
            pa.stroke(c, 255, 255);
            pa.strokeWeight(5);
            pa.pushMatrix();
            pa.translate(pa.width/2, (pa.height/2 - (length/2 * nemaSize)) + (nemaSize * circles));
            pa.circle(0, 0, nemaSize);



            pa.popMatrix();
        }

        
    }
}