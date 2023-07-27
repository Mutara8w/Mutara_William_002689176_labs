/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ecosystem.Geographies;

/**
 *
 * @author twmut
 */
public class Country {

    private final int COUNTRY_ID;
    private String countryName;
    private int countryPopulation;
    private static int count = 1;

    public Country() {
        this.COUNTRY_ID = ++count;
    }

    public int getCOUNTRY_ID() {
        return COUNTRY_ID;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public int getCountryPopulation() {
        return countryPopulation;
    }

    public void setCountryPopulation(int countryPopulation) {
        this.countryPopulation = countryPopulation;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int aCount) {
        count = aCount;
    }

}
