/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core.controllers.utils;

/**
 *
 * @author Carlos Ruidiaz M
 */
public class Decimalchecker {
    public static boolean hasMoreThanThreeDecimalPlaces(String value) {
        String[] parts = value.split("\\.");
        return parts.length == 2 && parts[1].length() > 3;
    }
}
