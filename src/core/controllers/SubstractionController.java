/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core.controllers;


import core.controllers.utils.Decimalchecker;
import core.controllers.utils.Response;
import core.controllers.utils.Round;
import core.controllers.utils.Status;
import core.models.storage.History;
import core.models.Substraction;
import core.models.Operation;

public class SubstractionController {
    

    
    public static Response substract(String number1, String number2) {
        try{
        if(Decimalchecker.hasMoreThanThreeDecimalPlaces(number1)){
            return new Response("Number 1 must not have more than 3 decimals", Status.BAD_REQUEST);
        }
        if(Decimalchecker.hasMoreThanThreeDecimalPlaces(number2)){
            return new Response("Number 2 must not have more than 3 decimals", Status.BAD_REQUEST);
        }
       
        Double number1doub,number2doub;
        try{
            number1doub= Double.parseDouble(number1);
                 
        }catch(NumberFormatException ex){
            return new Response("Number 1 must be numeric and not empty", Status.BAD_REQUEST);
            
        }
      
        try{
            number2doub= Double.parseDouble(number2);
                 
        }catch(NumberFormatException ex){
            return new Response("Number 2 must be numeric and not empty", Status.BAD_REQUEST); 
        }
        
        
        Operation operation = new Substraction(number1doub, number2doub);
        History history = History.getInstance();
        history.addOperation(operation);
        return new Response("Subtraction successful", Status.OK, operation.getResult());
        } catch (Exception ex) {
            return new Response("Unexpected error", Status.INTERNAL_SERVER_ERROR);
        }
    }
}
