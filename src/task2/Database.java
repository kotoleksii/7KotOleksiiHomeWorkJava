package task2;

import java.util.ArrayList;

public class Database {
    public static ArrayList<User> getUsers() {
        ArrayList<User> arrayList = new ArrayList<>() {{
            add(new User("Andrii Antonov", 22, 'M', "andrii@mail.com", "UA"));
            add(new User("Stephan Curry", 30, 'M', "step@gmail.com", "US"));
            add(new User("Madonna Louise", 63, 'F', "madonna@mail.com", "US"));
            add(new User("Irena Quarpa", 40, 'F', "quarpa@gmail.com", "FR"));

            add(new Employee("First Employee", 17, 'M', "fe@mail.com",
                    "UA", 5000, "java developer", "IT"));
            add(new Employee("Second Employee", 16, 'F', "se@gmail.com",
                    "PL", 8000, "angular developer", "IT"));
            add(new Employee("Third Employee", 29, 'F', "te@gmail.com",
                    "UA", 4000, "designer", "UI"));
            add(new Employee("Fourth Employee", 15, 'M', "fe@gmail.com",
                    "LT", 7000, "php developer", "IT"));
            add(new Employee("Fifth Employee", 22, 'F', "fe@il.com",
                    "UA", 15000, "recruiter", "HR"));
            add(new Employee("Sixth Employee", 20, 'F', "se@mail.com",
                    "UK", 10000, "recruiter", "HR"));
        }};
        return arrayList;
    }
}
