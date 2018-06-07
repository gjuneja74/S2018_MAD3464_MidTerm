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
public class MostFrequent {
  String S="Gaurav";
    char[] array = S.toCharArray();
int count = 1;
int max = 0;
char maxChar = 0;
{
for(int i=1; i<array.length; i++)
{ 
    
    
    if(array[i]==array[i-1]){
        count++;
    } else {
        if(count>max){  
            max=count;
            maxChar=array[i-1];
        }
        count = 1; 
    }
}
if(count>max){
    max=count; 
    maxChar=array[array.length-1];
}
System.out.println("Most Frequent: "+max+", for the character "+maxChar);
    
};
