/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core.controllers.utils;

/**
 *
 * @author Carlos Ruidiaz M
 */
public class Round {
    public static double roundToThreeDecimalPlaces(double value) {
        String stringValue = Double.toString(value);
        String[] parts = stringValue.split("\\.");
        if (parts.length == 2 && parts[1].length() > 3) {
            parts[1] = parts[1].substring(0, 3);
            stringValue = parts[0] + "." + parts[1];
        }
        return Double.parseDouble(stringValue);
    }
}
