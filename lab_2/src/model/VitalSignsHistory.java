/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author william
 */
public class VitalSignsHistory {

    private ArrayList<VitalSigns> history;

    public VitalSignsHistory() {
        this.history = new ArrayList<>();
    }

    public ArrayList<VitalSigns> getHistory() {
        return history;
    }

    public void setHistory(ArrayList<VitalSigns> history) {
        this.history = history;
    }

    public VitalSigns addVitalSigns() {
        VitalSigns newVitals = new VitalSigns();
        history.add(newVitals);
        return newVitals;
    }

    public void deleteVitals(VitalSigns selectedVitals) {
        history.remove(selectedVitals);
    }
}
