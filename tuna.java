package assignment4;

import java.util.ArrayList;
import java.util.Collections;

public class tuna {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i=1; i<50; i++) {
            list.add(new Integer(i));
        }
        Collections.shuffle(list);
        System.out.printf("Taiwan Lottery:\n-------------------\n");
        for (int i=0; i<6; i++) {
            System.out.printf(list.get(i) + " ");
        }
    }
}