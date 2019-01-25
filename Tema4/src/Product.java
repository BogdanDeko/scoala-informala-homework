import java.util.ArrayList;

public class Product implements Buyable {

    private String id;
    private double price;
    private int quantity;
    private double weight;

    public Product(String id, double price, int quantity, double weight) {
        super();
        this.id = id;
        this.price = price;
        this.quantity = quantity;
        this.weight = weight;
    }

    ArrayList<String> prodType = new ArrayList<String>();

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getPrice(){
        return price;
    }

    public void setPrice(double price){
        this.price = price;
    }

    public int getQuantity(){
        return quantity;
    }

    public void setQuantity(int quantity){
        this.quantity = quantity;
    }

    public double getWeight(){
        return weight;
    }

    public void setWeight(double weight){
        this.weight = weight;
    }
}
