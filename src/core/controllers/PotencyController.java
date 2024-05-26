/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core.controllers;

import core.controllers.utils.Decimalchecker;
import core.controllers.utils.Response;
import core.controllers.utils.Round;
import core.controllers.utils.Status;

import core.models.Operation;
import core.models.Potency;
import core.models.storage.History;

/**
 *
 * @author Carlos Ruidiaz M
 */
public class PotencyController implements OperationController{

    @Override
    public Response execute(String base, String exponent) {
        try{
        if(Decimalchecker.hasMoreThanThreeDecimalPlaces(base)){
            return new Response("Number 1 must not have more than 3 decimals", Status.BAD_REQUEST);
        }
        if(Decimalchecker.hasMoreThanThreeDecimalPlaces(exponent)){
            return new Response("Number 2 must not have more than 3 decimals", Status.BAD_REQUEST);
        }
       
        Double basedoub, exponentdoub;
        try{
            basedoub= Double.parseDouble(base);
                 
        }catch(NumberFormatException ex){
            return new Response("Number 1 must be numeric and not empty", Status.BAD_REQUEST);
            
        }
        
        
        try{
            exponentdoub= Double.parseDouble(exponent);
                 
        }catch(NumberFormatException ex){
            return new Response("Number 2 must be numeric and not empty", Status.BAD_REQUEST); 
        }
        
        Operation operation = new Potency(basedoub, exponentdoub);
        History history = History.getInstance();
        history.addOperation(operation);
        return new Response("Potency successful", Status.OK, operation.getResult());
        } catch (Exception ex) {
            return new Response("Unexpected error", Status.INTERNAL_SERVER_ERROR);
        }
    }

    
    
    
    
    
}
