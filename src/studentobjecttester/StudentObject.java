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
public class StudentObject {
    private String name;

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
    
    
    
}
