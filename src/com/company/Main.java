package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Coton> availableCotons = new ArrayList<>(Arrays.asList(new Coton(4, "H134", "blue", "Transporter 112"),
                new Coton(4, "H133", "red", "Transporter 113"),
                new Coton(4, "H132", "yellow", "Transporter 114"),
                new Coton(4, "H131", "green", "Transporter 115")));

        List<Person> people = new ArrayList<>(Arrays.asList(
                new Person("George", 19, true, true),
                new Person("Paul", 19, false, false),
                new Person("Fred", 19, true, false),
                new Person("Daniel", 19, true, false)
                ));


        for (Person person : people) {
            List<Coton> allCotons = person.getCotonsOwned();
            if (person.isLikeCotons() && !person.isHasCotons()) {
                Coton randomCoton = getRandomCoton(availableCotons);
                allCotons.add(randomCoton);
                person.setCotonsOwned(allCotons);
                System.out.printf("Gifted %s with a %s\n", person.getName(), randomCoton.getModel());
            }


        }

    }

    public static Coton getRandomCoton(List<Coton> cotons) {
        // this will return a randome coton based on the available ones.
        return cotons.get((int)(Math.random() * cotons.size()));
    }

}
