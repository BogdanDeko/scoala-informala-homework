import java.time.LocalDate;
import java.util.ArrayList;

public class Vegetable_Product extends Product implements Validity {
    private LocalDate expDate;
    private String vitaminList;

    public Vegetable_Product(LocalDate expDate, String id, double price, int quantity, double weight){
        super(id, price, quantity, weight);
        this.expDate = expDate;
    }

    public Vegetable_Product(LocalDate expDate, String id, double price, int quantity, double weight, String vitaminList){
        super(id, price, quantity, weight);
        this.expDate = expDate;
        this.vitaminList = vitaminList;
    }

    public String getVitaminList(){
        return vitaminList;
    }

    public void setVitaminList (String vitaminList){
        this.vitaminList = vitaminList;
    }

    public LocalDate getExpDate(){
        return expDate;
    }

    public void setExpDate(LocalDate expDate){
        this.expDate = expDate;
    }

    public static void main(String[] args) {

        ArrayList<String> alist = new ArrayList<String>();
        alist.add("Leafy and salad vegetables");
        alist.add("Fruits");
        alist.add("Flowers and flower buds");
        alist.add("Podded vegetables");
        alist.add("Bulb and stem vegetables");
        alist.add("Root and tuberous vegetables");
        alist.add("Sea vegetables");
    }
}
