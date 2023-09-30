/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import model.Country;
import controller.ManageEastAsiaCountries;
import java.util.ArrayList;

/**
 *
 * @author lekha
 */
public class Main {
    public static void main(String[] args) {
      ArrayList<Country> lc = new ArrayList<>();
      ManageEastAsiaCountries mn = new ManageEastAsiaCountries();
        //loop until user want to exist
        while (true) {
            int choice = mn.menu();
            switch (choice) {
                case 1:
                    mn.inputCountry(lc);
                    break;
                case 2:
                    mn.printCountry(lc);
                    break;
                case 3:
                    mn.searchByName(lc);
                    break;
                case 4:
                    mn.printCountrySorted(lc);
                    break;
                case 5:
                    return;
            }
        }
    }
}

