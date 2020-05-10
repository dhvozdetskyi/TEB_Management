package entity;

/**
 * Created by d.hvozdetskyi on 2020-05-10.
 */
public class Product {
    private Long id;
    protected String productName;
    protected double price;
    protected float weight;
    protected String color;
    protected int productCount;
    public Product(Long id, String name, double price, float weight, String color, int count){
        this.id = id;
        this.productName = name;
        this.price = price;
        this.weight = weight;
        this.color = color;
        this.productCount = count;
    }
    public Long getID(){
        return id;
    }
    public String getName(){
        return productName;
    }
    public String getColor(){
        return color;
    }
    public int getCount(){
        return productCount;
    }
    public void setCount(int count){
        this.productCount = count;
    }
    public double getPrice(){
        return price;
    }
    public void setPrice(double price){
        this.price = price;
    }
    public float getWeight(){
        return weight;
    }
    public String toString(){
        return "Object Product: id = " + getID() + " productName = " + getName() +
               " color = " + getColor() + " price = " + getPrice() + " weight = " + getWeight() + " count = " + getCount();
    }


}
