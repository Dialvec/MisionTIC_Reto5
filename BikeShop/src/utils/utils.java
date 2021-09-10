/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

/**
 *
 * @author Dialvec
 */
public final class utils {

    /**
     *
     * @param userInput
     * @return
     */
    public static String JTextFieldToSearchQuery(String userInput){
        String filtered; //SQL Wildcard in case teh jTextField is not filled
        
         filtered = ( userInput.isBlank() )? "%": "%" + userInput + "%";
        
        return filtered;
    }
    
    public static int JPasswordFieldToSearchQuery(int userInput){
        int filtered; //SQL Wildcard in case teh jTextField is not filled
        
        filtered = (userInput != 0 )? userInput : 0;
        
        return filtered;
    }
    
}
