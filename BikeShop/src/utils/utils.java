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
     * @param defaultFill
     * @return
     */
    public static String filterJTextField(String userInput, String defaultFill){
        String filtered = "%"; //SQL Wildcard in case teh jTextField is not filled
        
        if( !userInput.trim().equals(defaultFill) ) filtered = userInput;
        
        return filtered;
    }
}
