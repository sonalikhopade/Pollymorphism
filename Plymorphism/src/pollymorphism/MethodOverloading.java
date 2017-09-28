/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pollymorphism;

/**
 *
 * @author User
 */
public class MethodOverloading {
    void show()
    {
        System.out.println("default method");
    }
    
    void show(int  a)
    {
        System.out.println("parameterised method");
    }
    
    void show(int  a,int b)
    {
        System.out.println(" second parameterised method");
    }
    
    public static void main(String[] args) {
        MethodOverloading  methodoverloading=new MethodOverloading();
        methodoverloading.show(1,2);
        methodoverloading.show(1);
        methodoverloading.show();
    }
}
