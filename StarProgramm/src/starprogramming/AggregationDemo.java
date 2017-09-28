/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package starprogramming;

public class AggregationDemo {
    
    int id;
    String name;

    AggregationDemo(int id ,String name)
    {
        this.id=id;
        this.name=name;
    }
    
}

class Teacher
{
    String address;
    int RollNo;
    AggregationDemo aggregationDemo;
    
    Teacher(String address,int RollNo,AggregationDemo aggregationDemo)
    {
        this.address=address;
        this.RollNo=RollNo;
       this.aggregationDemo=aggregationDemo;
    }
    
    void show()
    {
        System.out.println("id:" +aggregationDemo.id+ "name:" +aggregationDemo.name);
    }
    
    
    public static void main(String[] args) {
        AggregationDemo aggregationDemo = new AggregationDemo(1,"sonali");
        Teacher t=new Teacher("Mumbai",12,aggregationDemo);
        t.show();
    }
    
}