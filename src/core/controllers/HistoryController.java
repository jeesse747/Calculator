/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core.controllers;
import core.controllers.utils.Response;
import core.controllers.utils.Status;
import core.models.storage.History;
import core.models.Operation;
import java.util.ArrayList;
import java.util.Collections;

public class HistoryController{
    

    public static Response getHistory() {
        try{
        History history = History.getInstance();

        ArrayList<Operation> operations = history.getOperations();
        if (operations.isEmpty()) {
            return new Response("No history available", Status.NOT_FOUND);
        } else {
            Collections.reverse(operations); // Invertir la lista de operaciones
            return new Response("History retrieved", Status.OK, operations);
            
        }
        } catch (Exception ex) {
            return new Response("Unexpected error", Status.INTERNAL_SERVER_ERROR);
        }
    }
}
