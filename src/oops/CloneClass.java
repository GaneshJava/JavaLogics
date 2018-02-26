/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package oops;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Ganesh
 */
public class CloneClass {
   
    private int id;
    private String name;

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }
    
public static void main(String args[])    {
    CloneClass obj = new CloneClass();
    CloneClass obj2 = new CloneClass();
    obj.toString();
        try {
            obj = (CloneClass)obj.clone();
            System.out.println("obj-"+obj);
            if(obj==obj2){
                System.out.println("obj==obj2");
            }
            if(obj.equals(obj2)){
                System.out.println("obj.equals(obj2)");
            }
        } catch (CloneNotSupportedException ex) {
            System.out.println("Exception occur..");
            Logger.getLogger(CloneClass.class.getName()).log(Level.SEVERE, null, ex);
        }
    
}
    
}
