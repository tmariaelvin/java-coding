package onlineShopping;

import java.util.HashMap;
import java.util.Map;

public class Cart {
    Map<ProductDetails, Integer> selectedProducts = new HashMap<>();
    Long totalPrice = 0L;
    Long totalQuantity = 0L;
    double balance;

    Cart(ProductDetails productDetail, int quantity, double balance) {
        this.balance = balance;
        this.selectedProducts.put(productDetail, quantity);
        this.bindCartValues();
    }

    public void bindCartValues() {
        this.selectedProducts.forEach((key, value) -> {
            this.totalPrice += key.getPrice() * value;
            this.totalQuantity += value;
        });
    }

    public void removeAllProduct() {
        this.selectedProducts.clear();
        this.totalPrice = 0L;
        this.totalQuantity = 0L;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void removeSavedProduct(ProductDetails selectedProduct) {
        this.selectedProducts.forEach((key, value) -> {
            if (key.getProductId() == selectedProduct.productId) {
                this.selectedProducts.remove(key, value);
            }
        });
        this.bindCartValues();
        this.getCartDetails();
    }

    public void getCartDetails() {
        System.out.println("----Show Cart Details------");
        this.selectedProducts.forEach((key, value) -> System.out.println("Product Details : \n" +
                "Product Name : " + key.getProductName() + '\n' +
                "Product Name : " + key.getPrice() + '\n' +
                "Product Name : " + value + '\n'));
        System.out.println("Cart : " +
                ",\nprice=" + totalPrice +
                ",\nquantity=" + totalQuantity +
                ",\nbalance=" + balance);
    }

}
