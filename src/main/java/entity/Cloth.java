package entity;

/**
 * Created by d.hvozdetskyi on 2020-05-10.
 */
public class Cloth extends Product {
    protected String size;
    protected String material;
    public Cloth(Long id, String name, double price, float weight, String color, int count, String size, String material){
        super(id, name, price, weight, color, count);
        this.size = size;
        this.material = material;
    }
    public String getSize(){
        return size;
    }
    public String getMaterial(){
        return material;
    }
    public String toString(){
        return "Object Cloth: extends " + super.toString() + "; size = " + getSize() + " material = " + getMaterial();
    }


}
