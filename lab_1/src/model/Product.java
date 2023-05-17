/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author mandalore
 */
public class Product {

    private String name;
    private String description;
    private String availability;
    private String price;

    public Product() {
//        this.name = name;
//        this.description = description;
//        this.availability = availability;
//        this.price = price;
    }
    
    public Product(String name, String description, String availability, String price) {
        this.name = name;
        this.description = description;
        this.availability = availability;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getAvailability() {
        return availability;
    }

    public String getPrice() {
        return price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setAvailability(String availability) {
        this.availability = availability;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}
