package ie.tudublin;

import processing.data.TableRow;

public class Nematode {

    private String name;
    private float length;
    private int limbs;
    private String gender;
    private int eyes;

    @Override
    public String toString() {
        return "Name " + name + ", length" + length + ", limbs" + limbs + ", gender" + gender +", eyes" + eyes + ".";
    }

    //  Nematode constructor 
    public Nematode(String name, float length, int limbs, String gender, int eyes)
    {
        this.name = name;
        this.length = length;
        this.limbs = limbs;
        this.gender = gender;
        this.eyes = eyes;
    }

    // table accessing method
    public Nematode(TableRow tr) {
        this(
            tr.getString("name"),
            tr.getFloat("length"),
            tr.getInt("limbs"),
            tr.getString("gender"),
            tr.getInt("eyes")
        );
    }  



    public enum Gender {
        m, f, h, n
    }


    public String getName() 
    {
        return name;
    }

    public void setName(String name) 
    {
        this.name= name;
    }

    public float getLength(){
        return length;
    }

    public void setLength(int length) 
    {
        this.length = length;
    }

    public int getLimbs()
    {
        return limbs;
    }

    public void setLimbs(int limbs)
    {
        this.limbs = limbs;
    }

    public String getGender()
    {
        return gender;
    }

    public int getEyes()
    {
        return eyes;
    }

    
    
}
