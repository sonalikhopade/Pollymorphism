/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package superKeyword;

/**
 *
 * @author User
 */
public class Parent {
    
    
    String name="sonali";
    
    void show()
    {
        System.out.println(name);
    }
}

class Child extends Parent
{
    String name="Smita";
    
    void show()
    {
        System.out.println(name);
        super.show();
    }
    public static void main(String[] args) {
        Child child=new Child();
        child.show();
    }
}
