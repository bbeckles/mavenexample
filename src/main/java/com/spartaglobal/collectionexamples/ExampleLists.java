package com.spartaglobal.collectionexamples;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ExampleLists {
    private List<String> hobbies = new ArrayList<>();

    public ExampleLists(List<String> hobbies) {
        this.hobbies = hobbies;
        workingWithOurList();
    }

    private void workingWithOurList(){
        hobbies.add("football");
        hobbies.add("boxing");
        hobbies.add("basketball");
    }

    public void printList(){
        System.out.println("we're using the iterator .. ");
        for (Iterator<String> iterator = hobbies.iterator(); iterator.hasNext();){
            String element = iterator.next();
            System.out.println(element);
        }
    }
}
