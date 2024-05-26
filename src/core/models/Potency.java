/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core.models;

import core.controllers.utils.Round;

/**
 *
 * @author Carlos Ruidiaz M
 */
public class Potency extends Operation {
    
    public Potency(double number1, double number2) {
        super(number1, number2);
        operator = "^";
        result=Round.roundToThreeDecimalPlaces(Math.pow(number1, number2));
    }
    
}
