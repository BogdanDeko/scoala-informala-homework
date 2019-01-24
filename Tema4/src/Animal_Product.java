import java.time.LocalDate;
import java.util.ArrayList;

public class Animal_Product extends Product implements Validity {
    private LocalDate expDate;
    private double freezeTemp;

    public Animal_Product (LocalDate expDate, String id, double price, int quantity, double weight){
        super(id, price, quantity, weight);
        this.expDate = expDate;
    }

    public Animal_Product (LocalDate expDate, String id, double price, int quantity, double weight, double freezeTemp){
        super(id, price, quantity, weight);
        this.expDate = expDate;
        this.freezeTemp = freezeTemp;
    }

    public double getFreezeTemp(){
        return freezeTemp;
    }

    public void setFreezeTemp(double freezeTemp){
        this.freezeTemp = freezeTemp;
    }

    public LocalDate getExpDate(){
        return expDate;
    }

    public void setExpDate(LocalDate expDate){
        this.expDate = expDate;
    }

    public static void main(String[] args) {
        ArrayList<String> alist = new ArrayList<>();
            alist.add("Pig");
            alist.add("Cattle");
            alist.add("Poultry");
            alist.add("Sheep & Goat");
            alist.add("Rabbit");
            alist.add("Horse");
            alist.add("Fish & Seafood");
        }
    }
