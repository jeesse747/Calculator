/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package core.controllers;

import core.controllers.utils.Response;

/**
 *
 * @author Carlos Ruidiaz M
 */
public interface OperationController {
    public abstract Response execute(String number1,String number2);
}
