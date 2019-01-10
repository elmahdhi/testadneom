package com.partition.sublists;

import com.partition.sublists.implementation.PartitionSubList;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class PartitionSubListTest {

    List<Integer> integerListOne;
    List<Integer> integerListTwo;
    List<Integer> integerListThree;
    Partition partition;

    @Before
    public void setUp() throws Exception {
        partition = new PartitionSubList();
        integerListOne = Arrays.asList(1);
        integerListTwo = Arrays.asList(1,2);
        integerListThree = Arrays.asList(1,2,3,4,5);
    }

    /**
     * test list empty
     */
    @Test
    public void whenListIsEmptyThenReturnSubListsEmpty(){
        List<List<Integer>> subLists = partition.getSubLists(null, 0);
        assertNull(subLists);
    }


    /**
     * test list when size equal to one and size of list is one
     */
    @Test
    public void whenSizeEqualToOneThenReturnSubListsOfSizeOne(){
        List<List<Integer>> subLists = partition.getSubLists(integerListOne, 1);
        assertEquals(1, subLists.size());
    }

    /**
     * test list when size equal two and size of list is two
     */
    @Test
    public void whenSizeEqualToOneThenReturnSubListsOfSizeTwo(){
        List<List<Integer>> subLists = partition.getSubLists(integerListTwo, 1);
        assertEquals(2, subLists.size());
    }

    /**
     * test list when size equal two and size of list is five
     */
    @Test
    public void whenSizeEqualToTwoThenReturnSubListsOfSizeThree(){
        List<List<Integer>> subLists = partition.getSubLists(integerListThree, 2);
        assertEquals(3, subLists.size());
    }

    /**
     * test list when size equal three and size of list is five
     */
    @Test
    public void whenSizeEqualToThreeThenReturnSubListsOfSizeTwo(){
        List<List<Integer>> subLists = partition.getSubLists(integerListThree, 3);
        assertEquals(2, subLists.size());
    }

    /**
     * test list when size equal one and size of list is five
     */
    @Test
    public void whenSizeEqualToOneThenReturnSubListsOfSizeFive(){
        List<List<Integer>> subLists = partition.getSubLists(integerListThree, 1);
        assertEquals(5, subLists.size());
    }
}
