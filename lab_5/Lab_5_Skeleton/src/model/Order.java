/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author twmut
 */
public class Order {
    
    ArrayList<OrderItem> itemList;
    
    public Order() {
        this.itemList = new ArrayList<>();
    }
    
    public ArrayList<OrderItem> getItemList() {
        return itemList;
    }
    
    public void addNewOrderItem(Product product, double price, int quantity) {
        OrderItem oi = new OrderItem(product, price, quantity);
        itemList.add(oi);
    }
    
    public OrderItem findProduct(Product product) {
        for (OrderItem oi : this.getItemList()) {
            if (oi.getProduct().equals(product)) {
                return oi;
            }
        }
        return null;
    }
    
    public void deleteItem(OrderItem orderItem) {
        this.itemList.remove(orderItem);
    }
}
