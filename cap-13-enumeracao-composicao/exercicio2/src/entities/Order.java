package entities;

import entities.enums.OrderStatus;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {
    private Date moment;
    private OrderStatus status;

    private Client client;
    private List<OrderItem> orderItems = new ArrayList<>();

    public Order(Date moment, OrderStatus status, Client client) {
        this.moment = moment;
        this.status = status;
        this.client = client;
    }

    public String getMoment() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy hh:MM:ss");

        return sdf.format(moment);
    }

    public void setMoment(Date moment) {
        this.moment = moment;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public List<OrderItem> getOrderItems() {
        return orderItems;
    }

    public void addItem(OrderItem item){
        orderItems.add(item);
    }

    public void removeItem(OrderItem item){
        orderItems.remove(item);
    }

    public Double total(){
        double sum = 0;
        for(OrderItem item: orderItems){
            sum += item.subTotal();
        }

        return sum;
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Order Summary: \n");
        sb.append("Order moment: ");
        sb.append(getMoment());
        sb.append("\nOrder status: ");
        sb.append(getStatus());
        sb.append("\nClient: ");
        sb.append(getClient().getName());
        sb.append(" (" + getClient().getBirthDate() + ") - ");
        sb.append(getClient().getEmail());
        sb.append("\nOrder items: \n");
        for(OrderItem item : orderItems){
            sb.append(item.getProduct().getName() + " $");
            sb.append(String.format("%.2f", item.getProduct().getPrice()));
            sb.append(", Quantity: " + item.getQuantity() + ", Subtotal: $");
            sb.append(String.format("%.2f", item.subTotal()) + "\n");
        }
        sb.append("\nTotal price: $" + String.format("%.2f",total()));

        return sb.toString();
    }
}
