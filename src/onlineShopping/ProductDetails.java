package onlineShopping;

import java.util.Date;
import java.util.Scanner;

public class ProductDetails {
    Scanner sc= new Scanner(System.in);
    private static int nextProductId = 100;
    int productId;
    String productName;
    String productDescription;
    Long price;
    Date createdAt;
    Date modifyAt;
    Long inStock;

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }

    public Long getInStock() {
        return inStock;
    }

    public void setInStock(Long inStock) {
        this.inStock = inStock;
    }

    ProductDetails(String productName, String productDescription, Long price, Long inStock) {
        this.productId = nextProductId++;
        this.productName = productName;
        this.productDescription = productDescription;
        this.price = price;
        this.inStock = inStock;
        this.updateProductDates();
    }

    public void updateProductDates() {
        this.createdAt = new Date();
        this.modifyAt = new Date();
    }

    public void updateInventory() {
        System.out.println("Do you want to change the product name");
        if (this.isConfirm()) {
            System.out.println("Enter the new product name");
            String newName = sc.nextLine();
            this.setProductName(newName);
        }
        System.out.println("Do you want to change the Product price");
        if (this.isConfirm()) {
            System.out.println("Enter the new Product price");
            Long newEmail = sc.nextLong();
            this.setPrice(newEmail);
        }
        System.out.println("Do you want to change the stock");
        if (this.isConfirm()) {
            System.out.println("Enter the stock size");
            Long newMobileNumber = sc.nextLong();
            this.setInStock(newMobileNumber);
        }
    }
    public Boolean isConfirm() {
        System.out.println("Are you sure : yes or no");
        String select = sc.nextLine();
        return select.equals("yes");
    }

    @Override
    public String toString() {
        return "ProductDetails" +
                "\nproductId = " + productId +
                ", \nproductName = '" + productName + '\'' +
                ", \nproductDescription = '" + productDescription + '\'' +
                ", \nprice = " + price +
                ", \ncreatedAt = " + createdAt +
                ", \nmodifyAt = " + modifyAt +
                ", \ninStock = " + inStock +
                '\n';
    }
    public String showProductToCustomer(){
        return ", \nproductName = '" + productName + '\'' +
                ", \nproductDescription = '" + productDescription + '\'' +
                ", \nprice = " + price +
                ", \ninStock = " + inStock ;
    }
}
