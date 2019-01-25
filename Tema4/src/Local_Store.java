import java.time.LocalDate;

public class Local_Store {

    public static void localStore (Product product) {
        String errorMessage = checkAndReturnMessage(product);
        if (errorMessage != null) {
            System.out.println("The product could not be processed. " + errorMessage);
        } else {
                product.setQuantity(product.getQuantity() - 1);
                System.out.println("Product processed successfully. " +
                        product.getId() + " updated.");
            }
        }

    private static String checkAndReturnMessage(Product product) {
        if (product.getQuantity() < 1) {
            return " The product is out of Stock";
        }
        if (isExpired(product)) {
            return "The product is expired";
        }
        return null;
    }

    private static boolean isExpired(Product product) {
        if (product instanceof Validity) {
            Validity validity = (Validity) product;
            return LocalDate.now().isAfter(validity.getExpDate());
        }
        return false;
    }
}
