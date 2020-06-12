package com.sandin.learning.springin5steps;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BinarySearchImpl {


    public BinarySearchImpl(SortAlgoritm sortAlgoritm) {
        this.sortAlgoritm = sortAlgoritm;
    }
    @Autowired
    private SortAlgoritm sortAlgoritm;

    public int binarySearch(int [] numbers, int numberToSearchFor){

        int result = sortAlgoritm.sort(numbers, numberToSearchFor);

        System.out.println(result);
        return result;
    }

}
