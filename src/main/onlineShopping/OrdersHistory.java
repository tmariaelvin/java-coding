package main.onlineShopping;

import java.util.UUID;

public class OrdersHistory {
    int customerId;

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public State getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(State orderStatus) {
        this.orderStatus = orderStatus;
    }

    String transactionId;
    String orderId;
    Long debitedAmount;
    double reward;

    State orderStatus;

    @Override
    public String toString() {
        return "OrderHistory : ==== " + orderStatus + " ====" +
                "\ncustomerId = " + customerId +
                ",\ntransactionId = '" + transactionId + '\'' +
                ",\norderId = '" + orderId + '\'' +
                ",\ndebitedAmount = " + debitedAmount +
                ",\nreward = " + reward;
    }


    OrdersHistory(int customerId, Long debitedAmount) {
        this.customerId = customerId;
        this.debitedAmount = debitedAmount;
        this.reward = this.setReward(debitedAmount);
        this.orderStatus = State.PROGRESS;
        this.generateOrderId();
    }

    public double setReward(Long amount) {
        long reward = amount / 100;
        long point = amount % 100;
        return reward + (point / 100.0);
    }

    public void generateOrderId() {
        this.orderId = UUID.randomUUID().toString();
        this.transactionId = UUID.randomUUID().toString();
    }
}
