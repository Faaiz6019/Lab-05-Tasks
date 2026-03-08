// union and intersection of two arrays
// sorting of array of string (Amna , Ali , kinza , Hamza Jutt, Babar azam)
// {kya  non static mathod static field ko acess kr skte hen :- yes}
// {jagged array :- number of columns are not fixed in all rows}

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import java.util.*;

public class ClassQuestions {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {4, 5, 6, 7, 8};

        // Union
        Set<Integer> unionSet = new HashSet<>();
        for (int num : arr1) {
            unionSet.add(num);
        }
        for (int num : arr2) {
            unionSet.add(num);
        }
        System.out.println("Union: " + unionSet);

        // Intersection
        Set<Integer> intersectionSet = new HashSet<>();
        for (int num : arr1) {
            intersectionSet.add(num);
        }
        intersectionSet.retainAll(Arrays.asList(4, 5, 6, 7, 8)); // or convert arr2 to list
        System.out.println("Intersection: " + intersectionSet);
    }


}
