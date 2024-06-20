package vn.edu.likelion.Bai1;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Main -
 *
 * @param
 * @return
 * @throws
 *
 * Giải
 * tạo 1 hashMap
 * kiểm tra map.containsKey()
 */

public class Main {


    /**
     *find Non Duplicate Elment use nestedfor
     * @param s
     * @return
     */
    public String findNonDuplicateElement1(String s) {

        for(int i = 0 ; i < s.length() ; i++) {
            int j;
           for ( j = 0 ; j < s.length() ; j++) {
               if(i!=j && s.charAt(i) == s.charAt(j)) {
                  break;
               }
           }
           if (j == s.length()) {
               return s.substring(i, i+1);
           }
        }
        return "";
    }

    /**
     * Use HashSet to findNonDuplicateElement
     * @param s 
     * @return
     */
    public String findNonDuplicateElement2(String s) {
       Map <String, String> map = new HashMap<>();

        for(int i = 0 ; i < s.length() ; i++) {
            map.put(s.substring(i, i+1), s.substring(i+1, i+2));

            if(map.get(s.substring(i, i+1)) != map.get(s.substring(i, i+2))) {
                return s.substring(i, i+2);
            }
        }
        return null;


    }
    public static void main(String[] args) {
        // String s = "gibblegabbler";
        String s = "HHHHeHHHab";
        System.out.println("The given string is: " + s);
        Main m = new Main();
        m.findNonDuplicateElement2(s);
        System.out.println("The first non repeated character in String is: " + m.findNonDuplicateElement2(s));

    }
}
