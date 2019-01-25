import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author Bogdan
 */

/**
 * This is a Local Store Simulation based on JAVA OOP Implementation.
 * Based on the user input he/ her can input
 * The store has a list of items in stock and each item refers to a product.
 *A product is identified uniquely by ID.
 */

public class Order_Product {
    public static void main(String[] args) {

        System.out.println("\n=== Local Store ===");
        Scanner input = new Scanner(System.in);
        System.out.println("\n1. Create product and add it to stock"
                + "\n2. Sell product"
                + "\n3. Display daily sales report"
                + "\n4. Exit."
                + "\nChose an Option:");

        int selection = input.nextInt();

        if (selection == 1) {
            int type;

            System.out.println("Product type: 1. animal / 2. vegetable");
            type = input.nextInt();
            System.out.println("The product selected with success " +type);

        } else if (selection == 2) {
            int iD;
            double prodQ;

            System.out.println("Enter Product ID: ");
            iD = input.nextInt();

            System.out.println("Enter the quantity: ");
            prodQ = input.nextInt();

            System.out.println("The ID " + iD + " and quantity are " + prodQ);

        } else if (selection == 3) {
            System.out.println("Enter the date using format (yyyy-MM-dd): ");
            int y, M, d;
            y = input.nextInt();
            M = input.nextInt();
            d = input.nextInt();

            String stry = String.format("%02d",y);
            String strM = String.format("%02d",M);
            String strd = String.format("%02d",d);

            System.out.println("The date that you entered is: " + y + " - " + M + " - "+ d);


        } else {
            System.out.println("Have a good day!");
        }
    }
}


//    public static String[] getValidStates(){
//        return validStates;
//    }
//    protected boolean isValidValue(Object value) {
//        if (value instanceof String) {
//            String sValue = (String) value;
//
//            for (int i = 0; i < validStates.length; i++) {
//                if (sValue.equals(validStates[i])) {
//                    return true;
//                }
//            }
//        }
//        return false;
//    }
//
//    protected static final int COLUMN_COUNT = 5;
//    protected static final String[] validStates = {
//            "In Stock", "Place new","Out of Stock"
//    };
//
//    protected Object [][] data = new Object[][]{
//            {"Product ID", validStates[0]},
//            {"Product Type", validStates[0]},
//            {"Quantity", validStates[0]},
//            {"Date order", validStates[0]},
//            {"Product information", validStates[0]}
//    };
//
//    protected static final String[] columnNames ={
//            "ID","Type","Quantity","Date order","Product information"
//    };}
////
////        String[] columnNames = {"Product ID",
////                "Product Type",
////                "Quantity",
////                "Date order",
////                "Product information"};
////
////        String[] Choice1 = {"1. Pig", "2. Cattle", "3. Poultry", "4. Sheep & Goat", "5. Rabbit", "6. Horse", "7. Fish & Seafood"};
////
////        String[] Choice2 = {"1. Leafy and salad vegetables", "2. Fruits", "3. Flowers and flower buds", "4. Podded vegetables",
////                "5. Bulb and stem vegetables", "6. Root and tuberous vegetables", "7. Sea vegetables"};
////
////        JComboBox Choice1 = new JComboBox(Choice1);
////        Choice1.setSelectedIndex(0);
////        Choice1.addActionListener(this);
////
////        JComboBox Choice2 = new JComboBox(Choice2);
////        Choice2.setSelectedIndex(0);
////        Choice2.addActionListener(this);
////    }
////        public Order_Product(){
////            setLayaout(new FlowLayout());
////            setSize(400, 300);
////            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
////
////            Choice1.setSelectedIndex(1);
////            Choice1.addActionListener(this);
////            add(lblText);
////        }
////public void actionPerformed(ActionEvent e){
////            if (e.getSource() == Choice1){
////                JComboBox cb = (JComboBox)e.getSource();
////                String msg - (String)cb.getSelectedItem();
////
////                Switch(msg);{
////                    case "Product information": lblText.setText("This item has a freezing temperature of: -30˚C");
////                        break;
////                    case "Product information": lblText.setText("This item has a freezing temperature of: -20˚C");
////                        break;
////                    case "Product information": lblText.setText("This item has a freezing temperature of -35˚C");
////                        break;
////                    case "Product information": lblText.setText("This item has a freezing temperature of -25˚C");
////                        break;
////                    case "Product information": lblText.setText("This item has a freezing temperature of -15˚C");
////                        break;
////                    case "Product information": lblText.setText("This item has a freezing temperature of -45˚C");
////                        break;
////                    case "Product information": lblText.setText("This item has a freezing temperature of -15˚C");
////                        break;
////                    default: lblText.setText("Please try again.");
////                }
////                Switch(msg){
////                    case "Product information": lblText.setText("This item has a freezing temperature of: -30˚C");
////                        break;
////                    case "Product information": lblText.setText("This item has a freezing temperature of: -20˚C");
////                        break;
////                    case "Product information": lblText.setText("This item has a freezing temperature of -35˚C");
////                        break;
////                    case "Product information": lblText.setText("This item has a freezing temperature of -25˚C");
////                        break;
////                    case "Product information": lblText.setText("This item has a freezing temperature of -15˚C");
////                        break;
////                    case "Product information": lblText.setText("This item has a freezing temperature of -45˚C");
////                        break;
////                    case "Product information": lblText.setText("This item has a freezing temperature of -15˚C");
////                        break;
////                    default: lblText.setText("Please try again.");
////                }
////            }
////        }
////
////        }