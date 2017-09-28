/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

/**
 *
 * @author User
 */
public class StarProgram {
    public static void main(String[] args) {
        
        int i,j,k;
        for( i=0; i<=5; i++)
        {
           
            for(j=0;i<=i;j++)
            {
                for( k=1; k<=5; k++ )
                {
                    if(i==j)
                    {
                       System.out.println("*"); 
                    }
                    else
                    {
                        System.out.println(" "); 
                    }
                }
                 System.out.println(" ");
            }
           
            System.out.println("\t");
        }
       
    }
}
    
    
    
    
