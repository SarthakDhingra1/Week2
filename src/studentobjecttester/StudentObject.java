/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentobjecttester;

/**
 *
 * @author sarth
 *Date-31 Jan ,2019
 */
public class StudentObject {
    private String name;
    private int studentId;
    
    private int value;

    /**
     * @return the name
     */
   public StudentObject(){}
    public StudentObject(String name){this.name=name;}
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the studentId
     */
    public int getStudentId() {
        return studentId;
    }

    /**
     * @param studentId the studentId to set
     */
    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }
    
    
    
}
