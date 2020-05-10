package entity;

/**
 * Created by d.hvozdetskyi on 2020-05-10.
 */
public class Boots extends Product {
    protected int size;
    protected boolean isNaturalSkin;
    public Boots(Long id, String name, double price, float weight, String color, int count, int size, boolean isNaturalSkin){
        super(id, name, price, weight, color, count);
        this.size = size;
        this.isNaturalSkin = isNaturalSkin;
    }
    public int getSize(){
        return size;
    }
    public boolean getIsNaturalSkin(){
        return isNaturalSkin;
    }
    public String toString(){
        return "Object Boots: extends " + super.toString() + "; size = " + getSize() + " isNaturalSkin = " + getIsNaturalSkin();
    }

}
