/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ismael
 */
public class Week2Example {
    public static void main(String []args)
    {
        Student[] list = new Student[5]; //array of object declaration
        Student s1 = new Student();
        s1.setName("John");
        s1.setAge(21);
        System.out.println(s1);
        System.out.println("Hello World, I made a change!");
    }  
}
