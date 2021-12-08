package edu.itstep;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        List<Human> humans = DataBase.getHumans();
        //сгруппировать людей по специальностям в разные коллекции
        //заранее не знаем сколько у нас специальностей
        //хранить в map(ключ-специальность, значение-список из human)

//        Map<Speciality, List<Human>> map = humans.
//                stream().
//                collect(Collectors.groupingBy(Human::getSpeciality));
//
//        map.forEach(((speciality, group) -> {
//            System.out.println(speciality);
//            group.forEach(System.out::println);
//        }));

        // імперативно
//        TODO

    }
}
