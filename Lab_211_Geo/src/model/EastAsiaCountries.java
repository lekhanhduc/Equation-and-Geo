/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author lekha
 */
public class EastAsiaCountries {
    protected String countryCode;
    protected String countryName;
    protected float countryArea;

    public EastAsiaCountries() {
    }

    public EastAsiaCountries(String countryCode, String countryName, float countryArea) {
        this.countryCode = countryCode;
        this.countryName = countryName;
        this.countryArea = countryArea;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public double getCountryArea() {
        return countryArea;
    }

    public void setCountryArea(float countryArea) {
        this.countryArea = countryArea;
    }

    public void display() {

    }
}

