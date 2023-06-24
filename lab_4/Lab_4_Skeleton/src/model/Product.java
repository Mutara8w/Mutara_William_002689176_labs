/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import javax.swing.ImageIcon;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Rushabh
 */
public class Product {

    private String name;
    private int price;
    private final int id;
    private Map<Feature, Object> features;

    public void setLogoImage(ImageIcon logoImage) {
        this.logoImage = logoImage;
    }
    private ImageIcon logoImage;

    private static int count = 0;

    public Product() {
        count++;
        id = count;
        features = new HashMap<>();
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

    public ImageIcon getLogoImage() {
        return logoImage;
    }

    public void addFeature(Feature feature, Object value) {
        features.put(feature, value);
    }

    public Object getFeatureValue(Feature feature) {
        return features.get(feature);
    }

    public Map<Feature, Object> getFeatures() {
        return features;
    }

    /**
     *
     * @return
     */
    @Override
    public String toString() {
        return name;
    }

}
