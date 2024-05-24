/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core.controllers;

/**
 *
 * @author USER
 */
import calculator.Calculator;
import core.models.Operation;
import core.models.storage.History;

public class DivideController {
    private final Calculator calculator;
    private final History history;

    public DivideController(History history) {
        this.calculator = new Calculator();
        this.history = history;
    }

    public double divide(double number1, double number2) {
        double result = calculator.divide(number1, number2);
        history.addOperation(new Operation(number1, number2, "/", result) {
            @Override
            public double calculate() {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }
        });
        return result;
    }
}
