package com.spartaglobal.collectionexamples;

import java.util.HashSet;
import java.util.Set;

public class ExampleSets {

    private Set <String> newSet = new HashSet<String>();

    public void workingWithOurSet(){
        newSet.add("cheese");
        newSet.add("chicken");
        newSet.add("bread");
    }
    public void printSet(){
        System.out.println(newSet.contains("bread"));

        for(String shoppingItem : newSet){
            System.out.println(shoppingItem);
        }
    }
}
