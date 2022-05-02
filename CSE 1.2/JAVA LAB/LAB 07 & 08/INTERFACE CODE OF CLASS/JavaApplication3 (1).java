/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication3;

/**
 *
 * @author student
 */
import java.io.IOException;
import java.util.*;
import java.util.ArrayList;
public class JavaApplication3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException, InterruptedException {
        // TODO code application logic here
        
        Language language = new CPP("mycode.cpp","7.0");
        language.runCode();
        //language = new Java("mycode.java","8.0");
        //language.runCode();
            }
    
}
