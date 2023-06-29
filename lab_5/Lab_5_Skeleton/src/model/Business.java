/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author twmut
 */
public class Business {

    MasterOrderList masterOrderList;
    SupplierDirectory supplierDirectory;

    public Business() {

        masterOrderList = new MasterOrderList();
        supplierDirectory = new SupplierDirectory();

    }

    public MasterOrderList getMasterOrderList() {
        return masterOrderList;
    }

    public SupplierDirectory getSupplierDirectory() {
        return supplierDirectory;
    }

}
