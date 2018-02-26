/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package collections;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author Ganesh
 */
public class MAPTest {

    public static void main(String args[]) {
        Map map = new HashMap();
        map.put(1, "Token");
        map.put(2, "FTP");
        map.put(1, "Job");

        Set s= null;
        List l = null;
        
        HashMap m = null;
        Hashtable t = null;
        
        t.elements();
//        m.iterator();
        s.iterator();
        l.iterator();
        
//    map.remove(1);
        String str = (String) map.get(1);
        System.out.println("Value-" + str);
    }
}
