/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import javax.swing.ImageIcon;

/**
 *
 * @author Rushabh
 */
public class Product {

    private String name;
    private int price;
    private final int id;

    public void setLogoImage(ImageIcon logoImage) {
        this.logoImage = logoImage;
    }
    private ImageIcon logoImage;

    private final ArrayList<Feature> features;

    private static int count = 0;

    public Product() {
        count++;
        id = count;
        features = new ArrayList<>();
    }

    public static int getCount() {
        return count;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public ArrayList<Feature> getFeatures() {
        return features;
    }

    public ImageIcon getLogoImage() {
        return logoImage;
    }

    /**
     *
     * @return
     */
    @Override
    public String toString() {
        return name;
    }

    public Feature addNewFeature() {
        Feature f = new Feature();
        features.add(f);
        return f;
    }

}
