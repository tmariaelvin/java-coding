package main.onlineShopping;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OnlineShopping {
    public static List<UsersDetails> userDetails = new ArrayList<>();
    public static List<ProductDetails> productDetails = new ArrayList<>();
    public static List<OrdersHistory> orderHistories = new ArrayList<>();
    public static UsersDetails currentUser = null;
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        createAdminAccount();
        createManagerAccount();
        createCustomerAccount();
        addDefaultInventory();
        appLaunchingPage();
    }

    public static void createAdminAccount() {
        UsersDetails adminUser = new UsersDetails("admin", "admin@gmail.com", "12345", "admin", Privilege.ADMIN);
        userDetails.add(adminUser);
    }

    public static void createManagerAccount() {
        UsersDetails manager = new UsersDetails("elvin", "elvin@gmail.com", "12345", "elvin129z", Privilege.MANAGER);
        userDetails.add(manager);
    }

    public static void createCustomerAccount() {
        UsersDetails customer = new UsersDetails("elvin", "elvin@gmail.com", "12345", "elvin", Privilege.CUSTOMER);
        userDetails.add(customer);
    }

    public static void addDefaultInventory(){
        productDetails.add(new ProductDetails("cake", "Good Cake", 120L, 10L));
        productDetails.add(new ProductDetails("bear", "Good for health", 150L, 5L));
        productDetails.add(new ProductDetails("rum", "Good for cold", 180L, 15L));
    }

    public static void appLaunchingPage() {
        System.out.println("|=================================|");
        System.out.println("|== ONLINE SHOPPING APPLICATION ==|");
        System.out.println("|=================================|");
        System.out.println("1. SignUp\n2. Login");
        int select = sc.nextInt();
        switch (select) {
            case 1 -> signUpAccount();
            case 2 -> userLogIn();
            default -> {
                System.out.println("|== Sorry, Enter the valid number ==|");
                appLaunchingPage();
            }
        }

    }

    public static void signUpAccount() {
        System.out.println("Select Privilege");
        Privilege selectedPrivilege = getSelectedPrivilege();
        Scanner sc1 =new Scanner(System.in);
        System.out.print("Enter the User name : ");
        String name = sc1.nextLine();
        System.out.print("Enter the User Email : ");
        String email = sc1.nextLine();
        System.out.print("Enter the User Mobile number : ");
        String mobileNumber = sc1.nextLine();
        System.out.print("Enter the User Password : ");
        String password = sc1.nextLine();
        UsersDetails signUpUser =new UsersDetails(name, email, mobileNumber, password, selectedPrivilege);
        userDetails.add(signUpUser);
        System.out.println("|=========================|");
        System.out.println("|== Successfully signUp ==|");
        System.out.println("|=========================|");
        appLaunchingPage();
    }

    public static Privilege getSelectedPrivilege() {
        Privilege selectedPrivilege = null;
        System.out.println("1.ADMIN\n2.MANAGER\n3.CUSTOMER");
        int selectedType = sc.nextInt();
        switch (selectedType) {
            case 1 -> selectedPrivilege = Privilege.ADMIN;
            case 2 -> selectedPrivilege = Privilege.MANAGER;
            case 3 -> selectedPrivilege = Privilege.CUSTOMER;
            default -> {
                System.out.println("|== Choose correct Privilege ==|");
                getSelectedPrivilege();
            }
        }
        return selectedPrivilege;
    }

    public static void userLogIn() {
        System.out.println("Chooses the user privilege");
        Privilege selectedPrivilege = getSelectedPrivilege();
        System.out.println("Enter the User Email : ");
        String userEmail = sc.next();
        System.out.println("Enter the User Password : ");
        String userPassword = sc.next();
        currentUser = findUserDetails(selectedPrivilege, userEmail, userPassword);
        if (currentUser == null) {
            System.out.println("|== Sorry, Enter valid email and password ==|");
            userLogIn();
        }
        System.out.println(currentUser.toString());
        showUserOptions(currentUser);
    }

    public static void showUserOptions(UsersDetails currentUser) {
        if (currentUser.getPrivilege() == Privilege.ADMIN) {
            showAdminOptions();
        } else if (currentUser.getPrivilege() == Privilege.MANAGER) {
            showManagerOptions();
        } else {
            showCustomerOptions();
        }
    }
    public static void showAdminOptions() {
        System.out.println("Show following options for admin on successful login:\n1.Change password\n2.Update Profile\n3.Create Manager\n4.Update Manager\n5.Remove Manager\n6.Add inventory\n7.Update Inventory\n8.Remove Inventory\n9.View Inventory\n10.Log out");
        int selectOption = sc.nextInt();
        switch (selectOption) {
            case 1 -> {
                currentUser.changeUserPassword();
                System.out.println("|==================================|");
                System.out.println("|== Successfully password change ==|");
                System.out.println("|==================================|");
                showAdminOptions();
            }
            case 2 -> {
                System.out.println(currentUser.toString());
                currentUser.updateUserProfile();
                System.out.println("|=============================================|");
                System.out.println("|== Successfully update User Profile change ==|");
                System.out.println("|=============================================|");
                showAdminOptions();
            }
            case 3 -> {
                createManagerByAdmin(Privilege.MANAGER);
                System.out.println("|=========================================|");
                System.out.println("|== Successfully create Manager details ==|");
                System.out.println("|=========================================|");
                showAdminOptions();
            }
            case 4 -> {
                UsersDetails selectManger = getManagerProfile(Privilege.MANAGER, 100);
                if (selectManger == null) {
                    System.out.println("|== Enter correct Manger details or No data found ==|");
                } else {
                    selectManger.updateUserProfile();
                    System.out.println("|================================================|");
                    System.out.println("|== Successfully update Manager Profile change ==|");
                    System.out.println("|================================================|");
                    showAdminOptions();
                }
            }
            case 5 -> {
                removeManager();
                System.out.println("|=================================|");
                System.out.println("|== Successfully remove manager ==|");
                System.out.println("|=================================|");
                showAdminOptions();
            }
            case 6 -> {
                addInventory();
                System.out.println("|================================|");
                System.out.println("|== Successfully Add Inventory ==|");
                System.out.println("|================================|");
                showAdminOptions();
            }
            case 7 -> {
                System.out.println("Enter the InventoryId");
                Long inventoryId = sc.nextLong();
                ProductDetails selectedProduct = updateInventory(inventoryId);
                if (selectedProduct != null) {
                    selectedProduct.updateInventory();
                    showAdminOptions();
                }else {
                    System.out.println("|== Sorry Enter the valid InventoryId ==|");
                    showAdminOptions();
                }
            }
            case 8 -> {
                removeInventory();
                System.out.println("|======================================|");
                System.out.println("|== Successfully Removed the product ==|");
                System.out.println("|======================================|");
                showAdminOptions();
            }
            case 9 -> {
                viewAllInventory();
                showAdminOptions();
            }
            case 10 -> logOut();
            default -> {
                System.out.println("|== Sorry, choose any one ==|");
                showAdminOptions();
            }
        }
    }
    public static void showManagerOptions() {
        System.out.println(" A manager account will have following options:\n1.Change password\n2.Update Profile\n3.Add inventory\n4.Update Inventory\n5.Remove Inventory\n6.View Inventory\n7.Log out");
        int selectOption = sc.nextInt();
        switch (selectOption) {
            case 1 -> {
                currentUser.changeUserPassword();
                System.out.println("|==================================|");
                System.out.println("|== Successfully password change ==|");
                System.out.println("|==================================|");
                showManagerOptions();
            }
            case 2 -> {
                System.out.println(currentUser.toString());
                currentUser.updateUserProfile();
                System.out.println("|=============================================|");
                System.out.println("|== Successfully update User Profile change ==|");
                System.out.println("|=============================================|");
                showManagerOptions();
            }
            case 3 -> {
                addInventory();
                System.out.println("|================================|");
                System.out.println("|== Successfully Add Inventory ==|");
                System.out.println("|================================|");
                showManagerOptions();
            }
            case 4 -> {
                System.out.println("Enter the InventoryId");
                Long inventoryId = sc.nextLong();
                ProductDetails selectedProduct = updateInventory(inventoryId);
                if (selectedProduct != null) {
                    selectedProduct.updateInventory();
                    System.out.println("|=========================|");
                    System.out.println("|== Update Successfully ==|");
                    System.out.println("|=========================|");
                    System.out.println(selectedProduct.toString());
                    showManagerOptions();
                }else{
                    System.out.println("|== Sorry, Enter valid inventory Id ==|");
                    showManagerOptions();
                }

            }
            case 5 -> {
                removeInventory();
                System.out.println("|======================================|");
                System.out.println("|== Successfully Removed the product ==|");
                System.out.println("|======================================|");
                showManagerOptions();
            }
            case 6 -> {
                viewAllInventory();
                System.out.println("|======================================|");
                System.out.println("|== Successfully Removed the product ==|");
                System.out.println("|======================================|");
                showManagerOptions();
            }
            case 7 -> logOut();
            default -> {
                System.out.println("Sorry, choose any one");
                showAdminOptions();
            }
        }
    }
    public static void showCustomerOptions() {
        System.out.println("A customer account will have following options :\n1.Change password \n2.Update Profile\n3.View products\n4.Add to Cart\n5.Remove an item from cart\n6.View Cart\n7.Purchase\n8.Cancel Order/ Discard Cart\n9.View purchase history\n10.Add money to wallet\n11.View wallet balance\n12.Redeem reward points\n13.Log out");
        int selectOption = sc.nextInt();
        switch (selectOption) {
            case 1 -> {
                currentUser.changeUserPassword();
                System.out.println("|==================================|");
                System.out.println("|== Successfully password change ==|");
                System.out.println("|==================================|");
                showCustomerOptions();
            }
            case 2 -> {
                System.out.println(currentUser.toString());
                currentUser.updateUserProfile();
                System.out.println("|=============================================|");
                System.out.println("|== Successfully update User Profile change ==|");
                System.out.println("|=============================================|");
                showCustomerOptions();
            }
            case 3 -> {
                showProductList();
                showCustomerOptions();
            }
            case 4 -> {
                addProductByCart();
                showCustomerOptions();
            }
            case 5 -> {
                removeItemFromCart();
                System.out.println("|=======================================|");
                System.out.println("|== Successfully Removed Cart product ==|");
                System.out.println("|=======================================|");
                showCustomerOptions();
            }
            case 6 -> {
                viewCart();
                showCustomerOptions();
            }
            case 7 -> {
                purchaseProductByCart();
                currentUser.cart.removeAllProduct();
                showCustomerOptions();
            }
            case 8 -> {
                System.out.println("Enter the Order details Order ID");
                currentUser.cancelOrder();
                showCustomerOptions();
            }
            case 9 -> {
                currentUser.viewPurchaseHistory();
                showCustomerOptions();
            }
            case 10 -> {
                System.out.println("Enter the Wallet amount");
                long amount = sc.nextLong();
                currentUser.addCustomerWalet(amount);
                showCustomerOptions();
            }
            case 11 -> {
                currentUser.viewWalletBalance();
                showCustomerOptions();
            }
            case 12 -> {
                currentUser.redeemRewardPoints();
                showCustomerOptions();
            }
            case 13 -> logOut();

            default -> {
                System.out.println("|== Sorry, choose any one ==|");
                showAdminOptions();
            }
        }
    }

    //Users Logics
    public static void createManagerByAdmin(Privilege privilege) {
        userDetails.add(new UsersDetails("manager", "manager@gmail.com", "1234", "manager", privilege));
    }
    public static UsersDetails findUserDetails(Privilege selectedPrivilege, String email, String password) {
        for (UsersDetails usersDetail : userDetails) {
            if (usersDetail.getPrivilege().equals(selectedPrivilege) && usersDetail.getEmail().equals(email) && usersDetail.getPassword().equals(usersDetail.encryptedPassword(password))) {
                return usersDetail;
            }
        }
        return null;
    }
    public static UsersDetails getManagerProfile(Privilege privilege, int managerId) {
        for (UsersDetails usersDetail : userDetails) {
            if (usersDetail.getPrivilege().equals(privilege) && usersDetail.getId() == managerId) {
                return usersDetail;
            }
        }
        return null;
    }

    public static void logOut() {
        System.out.println("|=======================================|");
        System.out.println("|===+++++= Successfully Logout =+++++===|");
        System.out.println("|=======================================|");
        appLaunchingPage();
    }

    public static void removeManager() {
        System.out.println("Enter the UserID");
    }

    //Inventory Logic
    public static ProductDetails updateInventory(Long productId) {
        for (ProductDetails productDetail : productDetails) {
            if (productDetail.getProductId() == productId) {
                return productDetail;
            }
        }
        return null;
    }

    public static void viewAllInventory() {
        for (ProductDetails productDetail : productDetails) {
            System.out.println(productDetail.toString());
        }
    }

    public static void removeInventory() {
        System.out.println("Enter the remove Product Id");
        int productId = sc.nextInt();
        productDetails.removeIf(productDetail -> productDetail.getProductId() == productId);
    }

    public static void addInventory() {
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Enter the product name");
        String productName = sc1.nextLine();
        System.out.println("Enter the product Description : ");
        String productDescription = sc1.nextLine();
        System.out.println("Enter the product price : ");
        Long price = sc1.nextLong();
        System.out.println("Enter the product stock : ");
        Long stock = sc1.nextLong();
        productDetails.add(new ProductDetails(productName, productDescription, price, stock));
        System.out.println(productDetails);
    }

    public static void showProductList() {
        if(productDetails.size()==0){
            System.out.println("|==========================|");
            System.out.println("|== NO PRODUCT AVAILABLE ==|");
            System.out.println("|==========================|");
            return;
        }
        System.out.println("|=== SHOW ALL PRODUCTS ===|");
        for (ProductDetails productDetail : productDetails) {
            System.out.print("|----------"+productDetail.productId+"--------------|");
            System.out.println(productDetail.showProductToCustomer());
        }
    }

    public static ProductDetails findProductById(int productId){
        for (ProductDetails productDetail : productDetails) {
            if(productDetail.getProductId() == productId ){
                return productDetail;
            }
        }
        return null;
    }
    public static ProductDetails findProductById(int productId, int productQuantity) {
        for (ProductDetails productDetail : productDetails) {
            if(productDetail.getProductId() == productId && productDetail.getInStock() > productQuantity){
                return productDetail;
            }
        }
        return null;
    }

    public static void addProductByCart(){
        System.out.println("Chooses the Product and Add to cart");
        showProductList();
        System.out.println("Add to Cart Enter Product ID and");
        int productId = sc.nextInt();
        System.out.println("Enter Product quantity");
        int productQuantity = sc.nextInt();
        ProductDetails selectProduct = findProductById(productId,productQuantity);
        if(selectProduct==null){
            System.out.println("|== Sorry, Enter the ProductId and Check the stock ==|");
            addProductByCart();
        }
        currentUser.addToCart(selectProduct,productQuantity);
    }

    //customer Logic

    public static void removeItemFromCart(){
        System.out.println("Enter the Remove product Id");
        int selectProductId = sc.nextInt();
        ProductDetails selectProduct = findProductById(selectProductId);
        if(selectProduct == null){
            System.out.println("|== Sorry, Enter the Valid Product id ==|");
        }
        currentUser.cart.removeSavedProduct(selectProduct);
    }

    public static void viewCart(){
        currentUser.cart.getCartDetails();
    }

    public static void purchaseProductByCart(){
        currentUser.cart.getCartDetails();
        double balance = currentUser.wallet.getBalance();
        if(balance > currentUser.cart.totalPrice){
            System.out.println("Confirm the Order And Pay the Amount to Wallet");
            orderHistories.add(new OrdersHistory(currentUser.id,currentUser.cart.totalPrice));
            currentUser.setOrderHistory(orderHistories);
            System.out.println("|== Successfully Purchase the Order ==|");
            currentUser.wallet.setBalance(balance - currentUser.cart.totalPrice);
            // Rewards points:
            long reward = currentUser.cart.totalPrice / 100;
            long point = currentUser.cart.totalPrice % 100;

            currentUser.wallet.setRewardPoint(reward + (point / 100.0));
            currentUser.cart.setBalance(balance - currentUser.cart.totalPrice);
        }else{
            System.out.println("Please add the wallet amount"+ (currentUser.cart.totalPrice-balance));
            currentUser.addCustomerWalet(currentUser.cart.totalPrice-balance);
        }

    }

}