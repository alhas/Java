package com.alhas;

import java.util.HashMap;
import java.util.Map;

public class MapProgram {

    public static void main(String[] args) {

        Map<String, String> languages = new HashMap<>();
        if (languages.containsKey("Java")) {
            System.out.println("Java already exists");
        } else {
            languages.put("Java", "a compiled high level, object-oriented, platform independent language");
            System.out.println("Java added successfully");
        }
        languages.put("Python", "an interpreted, object-oriented, high-level programing language, with dynamic semantics");
        languages.put("Algol", "an algorithmic language");
        System.out.println(languages.put("BASIC", "Beginners All purposes Symbolic Instruction Code"));
        System.out.println(languages.put("List", "Therein lies madness"));


        if (languages.containsKey("Java ")) {
            System.out.println("Java is already in the map");
        } else {
            languages.put("Java", "this course is about Java");
        }
        System.out.println(languages.put("Java", "this course us about Java"));

      //  languages.remove("Lisp");




        System.out.println("============================================================");



        if(languages.remove("Algol","an algorithmic language")){
            System.out.println("Algol removed");
        }else{
            System.out.println("Algol not removed, key/value pair not found.");
        }

        if(languages.replace("Lisp","Therein lies madness","Functional programing languages with imperative features")){
            System.out.println("Lisp replaced");
        }else{
            System.out.println("Lisp was not replaced.");
        }


        //System.out.println(languages.replace("Scala","this will not be added"));




        for (String key : languages.keySet()) {
            System.out.println(key + " : " + languages.get(key));
        }




    }


}
