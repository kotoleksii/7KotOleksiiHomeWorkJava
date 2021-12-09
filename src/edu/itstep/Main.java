package edu.itstep;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        List<Human> humans = DataBase.getHumans();

        Map<String, List<Human>> humansMap = new HashMap<>();
        for (Human human : humans) {
            String key = human.getSpeciality().name();
            if (humansMap.get(key) == null) {
                humansMap.put(key, new ArrayList<>());
            }
            humansMap.get(key).add(human);
        }

        Set<String> groupedHumansKeySet = humansMap.keySet();
        for (String speciality : groupedHumansKeySet) {
            List<Human> humanList = humansMap.get(speciality);
            System.out.println(speciality);
            for (Human human : humanList) {
                System.out.println(human);
            }
        }
    }
}
