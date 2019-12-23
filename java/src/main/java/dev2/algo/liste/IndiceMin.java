package dev2.algo.liste;

import java.util.ArrayList;
import java.util.List;

public class IndiceMin {

    public static List<Integer> indicesMinimum(int[] tab) {
        List<Integer> indicesMin;
        Integer min;
        min = tab[0];
        indicesMin = new ArrayList<>();
        indicesMin.add(0);
        for (int i = 1; i < tab.length; i++) {
            if (tab[i] == min) {
                indicesMin.add(i);
            } else if (tab[i] < min) {
                indicesMin.clear();
                indicesMin.add(i);
                min = tab[i];
            }
        }
        return indicesMin;
    }
    
    public static void main(String[] args) {
        int[] tab = {12,7,9,7,3,12,5,3,9};
        System.out.println(indicesMinimum(tab));
    }
}
