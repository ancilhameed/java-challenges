
package com.learn.java.puzzles;

import java.util.*;

public class UtopiaKingProblem {

    public static Map<String,Integer> map = new HashMap<>();
    public static String founder;
    public static List<String> claimants = new ArrayList<>();
    public static int MAX = 0;
    public static String mostWorthyChild;

    // sets the relations details by blood percentage of parents and child and assigns max value of blood to child
    public static void relationDetails(String child, String parent1, String parent2) {
        int worth ;
        
        if(map.get(parent1) != null && map.get(parent2) != null) {
        	 worth = ( map.get(parent1) + map.get(parent2) )/2;
        }else if(map.get(parent1) != null) {
       	 worth = map.get(parent1) /2 ;
        }else if(map.get(parent2) != null) {
          	 worth = map.get(parent2) /2 ;
           }else {
        	   worth = 0;
           }
        
        if(parent1.equals(founder)){
            assignParentShare(parent2);
        }
        map.put(child,worth);
        mostWorthyChild = mostWorthyChild(child, worth);
    }

    // calculates and stores the most worthy child
    public static String mostWorthyChild(String child, int worth) {
        if (worth>MAX) {
            MAX = worth;
            mostWorthyChild = child;
        }
        return mostWorthyChild;
    }

    // if the parent is not a founder then assigns the other parent with 0 percent blood
    public static void assignParentShare(String name) {
        if(!map.containsKey(name)) {
            map.put(name,0);
        }
    }

    // static arraylist to populate claimants
    public static void populateClaimants(String name) {
        claimants.add(name);
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int N = input.nextInt();
        int M = input.nextInt();

        founder = input.nextLine();
        map.put(founder,100);

        for (int i=0; i<N; i++) {
            String child = input.next();
            String parent1 = input.next();
            String parent2 = input.next();
            relationDetails(child, parent1, parent2);
        }

        for (int j=0; j<M; j++) {
            String name = input.nextLine();
            populateClaimants(name);
        }

        if (claimants.contains(mostWorthyChild)) {
            System.out.println(mostWorthyChild);
        }else {
            System.out.println("No claimants found!!");

        }
        input.close();

    }
}

