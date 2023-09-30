/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import model.Country;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author lekha
 */
public class ManageEastAsiaCountries {
     private final  Scanner in = new Scanner(System.in);
    
    //display menu
    public int menu(){
        System.out.println("1. Input the information of 11 countries in East Asia");
        System.out.println("2. Display the information of country you've just input");
        System.out.println("3. Search the information of country by user-entered name");
        System.out.println("4. Display the information of countries sorted name in ascending");
        System.out.println("5. Exit");
        System.out.print("Enter your choice: ");
        int choice = checkInputIntLimit(1, 5);
        return choice;
    }

    //check user input number limit
    public int checkInputIntLimit(int min, int max) {
        //loop until user input correct
        while (true) {
            try {
                int result = Integer.parseInt(in.nextLine().trim());
                if (result < min || result > max) {
                    throw new NumberFormatException();
                    
                }
                return result;
            } catch (NumberFormatException e) {
                System.err.println("Please input number in rage [" + min + ", " + max + "]");
                System.out.print("Enter again: ");
            }
        }
    }

    //check user input string
    public String checkInputString() {
        //loop until user input correct
        while (true) {
            String result = in.nextLine().trim();
            if (result.isEmpty()) {
                System.err.println("Not empty");
                System.out.print("Enter again: ");
            } else {
                return result;
            }
        }
    }

    //check user input double limit
    public  float checkInputFloat() {
        //loop until user input correct
        while (true) {
            try {
                float result = Float.parseFloat(in.nextLine());
                return result;
            } catch (NumberFormatException e) {
                System.err.println("Please input number double");
                System.out.print("Enter again: ");
            }
        }
    }

    //allow user input infomation of contries
    public  void inputCountry(ArrayList<Country> lc) {
        System.out.print("Enter code of contry: ");
        String countryCode = checkInputString();
        //check code contry exist or not
        if (!checkCountryExist(lc, countryCode)) {
            System.err.println("Country exist.");
            return;
        }
        System.out.print("Enter name of contry: ");
        String countryName = checkInputString();
        System.out.print("Enter total area: ");
        float countryArea = checkInputFloat();
        System.out.print("Enter terrain of contry: ");
        String countryTerrain = checkInputString();
        lc.add(new Country(countryTerrain, countryCode, countryName, countryArea));
        System.err.println("Add successful.");
    }

    //display infomation of country
    public  void printCountry(ArrayList<Country> lc) {
        System.out.printf("%-10s%-25s%-20s%-25s\n", "ID", "Name", "Total Area",
                "Terrain");
        for (Country country : lc) {
            country.display();
        }
    }

    //display infomation sort name in ascending
    public  void printCountrySorted(ArrayList<Country> lc) {
        Collections.sort(lc);
        System.out.printf("%-10s%-25s%-20s%-25s\n", "ID", "Name", "Total Area",
                "Terrain");
        for (Country country : lc) {
            country.display();
        }
    }

    //allow user search infomation contry by name
    public  void searchByName(ArrayList<Country> lc) {
        System.out.print("Enter the name you want to search for: ");
        String countryName = checkInputString();
        System.out.printf("%-10s%-25s%-20s%-25s\n", "ID", "Name", "Total Area",
                "Terrain");
        for (Country country : lc) {
            if (country.getCountryName().equalsIgnoreCase(countryName)) {
                country.display();
            }
        }
    }

    //check country exist by code
    public  boolean checkCountryExist(ArrayList<Country> lc, String countryCode) {
        for (Country country : lc) {
            if (country.getCountryCode().equalsIgnoreCase(countryCode)) {
                return false;
            }
        }
        return true;
    }
    
}

