package com.partition.sublists.implementation;

import com.partition.sublists.Partition;

import java.util.ArrayList;
import java.util.List;

public class PartitionSubList implements Partition {


    public List<List<Integer>> getSubLists(List<Integer> integerList, int size) {
        if(integerList != null && !integerList.isEmpty()) {
            List<List<Integer>> subLists = new ArrayList<List<Integer>>();
            return getRecursiveSubLists(integerList, size, subLists);
        }
        return null;
    }

    private List<List<Integer>> getRecursiveSubLists(List<Integer> integerList, int size, List<List<Integer>> subLists) {
        if (integerList.size() > size) {
            subLists.add(integerList.subList(0, size));
            List<Integer> newIntegerList = integerList.subList(size, integerList.size());
            getRecursiveSubLists(newIntegerList, size, subLists);
        } else {
            subLists.add(integerList);
        }
        return subLists;
    }
}
