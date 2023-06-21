/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

// import ArrayList from java Util
import java.util.ArrayList;

/**
 *
 * @author Rushabh
 */
public class SupplierDirectory {

    private final ArrayList<Supplier> supplierList;

    public SupplierDirectory() {
        supplierList = new ArrayList<>();
    }

    public ArrayList<Supplier> getSupplierList() {
        return supplierList;
    }

    public Supplier addSupplier() {
        Supplier s = new Supplier();
        supplierList.add(s);
        return s;
    }

    public void removeSupplier(Supplier s) {
        supplierList.remove(s);
    }

    public Supplier searchSupplier(String keyWord) {
        for (Supplier s : supplierList) {
            if (keyWord.equals(s.getSupplierName())) {
                return s;
            }
        }
        return null;
    }

}
