/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

/**
 *
 * @author lekha
 */
public class Main {

    public static void main(String[] args) {
        Manager mn = new Manager();
        while (true) {
            int choice = mn.menu();
            switch (choice) {
                case 1:
                    mn.superlativeEquation();
                    break;
                case 2:
                    mn.quadraticEquation();
                    break;
                case 3:
                    return;
            }
        }
    }
}
