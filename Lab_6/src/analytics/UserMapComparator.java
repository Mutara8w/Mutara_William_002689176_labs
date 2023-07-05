/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package analytics;

import java.util.Comparator;
import java.util.HashMap;
import model.User;

/**
 *
 * @author twmut
 */
public class UserMapComparator implements Comparator<User> {

    HashMap<Integer, Integer> userPostMap;
    // boolean desc;

    public UserMapComparator(HashMap<Integer, Integer> postNumbers) {
        this.userPostMap = postNumbers;
        // this.desc = desc;

    }

    @Override
    public int compare(User o1, User o2) {

        Integer val1 = userPostMap.getOrDefault(o1.getId(), 0);
        Integer val2 = userPostMap.getOrDefault(o2.getId(), 0);
        return Integer.compare(val1, val2);

        // return Integer.compare(userPostMap.get(o1.getId()), userPostMap.get(o2.getId()));
    }

}
