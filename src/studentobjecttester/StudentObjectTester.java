/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentobjecttester;

/**
 *
 * @author sarth
 */
public class StudentObjectTester {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        StudentObject obj1=new StudentObject("Sarthak");
        StudentObject[] array=new StudentObject[5];
        array[0]=obj1;
        array[1]=new StudentObject("Jatin");
        array[2]=new StudentObject("Humza");
        array[3]=new StudentObject("OutOfNames");
        array[4]=new StudentObject("OutOfNamesAgain");
        
        System.out.println("I dont known anyone here except the first name because its me,lol");
        for(int i=0;i<array.length;i++)
        {System.out.println("Student "+(i+1)+" "+array[i].getName());
        
        }
        
        
    }
    
}
