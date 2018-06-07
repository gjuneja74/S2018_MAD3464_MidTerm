/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package c0738093_midterm_mad3464;

/**
 *
 * @author macstudent
 */
public class Initials {

    private String String1;
    public void initials(String s)
        {
            this.String1= s;
            String temp;
            char t;
            String[] split = s.split(" ",2);
            for (int i=0; i<split.length; i++)
            {   
                temp =split[i];
                t=temp.charAt(0);
                
                System.out.println("initialized String: " + (split[i].charAt(0))+ ".");
            }   
    
}};
