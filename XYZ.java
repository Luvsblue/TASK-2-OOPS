
public class XYZ {
    public static void main(String[] args) {
        Product[] products = new Product[5];

        products[0] = new Product(1, 10.99, 3);
        products[1] = new Product(2, 5.99, 2);
        products[2] = new Product(3, 7.49, 4);
        products[3] = new Product(4, 12.99, 1);
        products[4] = new Product(5, 8.99, 2);

        int highestPricePid = findHighestPriceProductPid(products);
        System.out.println("Product with the highest price: PID " + highestPricePid);

        double totalAmountSpent = calculateTotalAmountSpent(products);
        System.out.println("Total amount spent on all products: " + totalAmountSpent);
    }

    public static int findHighestPriceProductPid(Product[] products) {
        double highestPrice = products[0].getPrice();
        int highestPricePid = products[0].getPid();

        for (int i = 1; i < products.length; i++) {
            if (products[i].getPrice() > highestPrice) {
                highestPrice = products[i].getPrice();
                highestPricePid = products[i].getPid();
            }
        }

        return highestPricePid;
    }

    public static double calculateTotalAmountSpent(Product[] products) {
        double totalAmount = 0;

        for (int i = 0; i < products.length; i++) {
            totalAmount += products[i].getPrice() * products[i].getQuantity();
        }

        return totalAmount;
    }
}

