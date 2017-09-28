/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package starprogramming;

/**
 *
 * @author User
 */
public class PrintOneToNine {
 
    
    
    public static void main(String[] args) {
        
        int i,j,k, spacecounter = 4,  starcounter=1;
        for(i=0; i <=5; i++)
        {
            for( j=1; j<=spacecounter; j++ )
            {
                System.out.println();
            }
            for(k=0;k<=starcounter;k++)
            {
                System.out.print("*" );
            }
            spacecounter--;
             starcounter=starcounter+2;
            }
        
                System.out.print("");
        }
    }


