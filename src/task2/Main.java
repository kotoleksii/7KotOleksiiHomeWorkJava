package task2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // 3. Створити об`єкт класу ArrayList, який зберігає як ексземпляри User, так і екземпляри Employee
        ArrayList<User> arrayList = Database.getUsers();

        // 4. Робота з Arraylist:
        // - Отримати arrayList тільки з користувачами (ексземплярами User, а не Employee);
        getUsersList(arrayList);

        // - Отримати середній вік всіх
        printAverageAgeAll(arrayList);

        // - Отримати середній вік серед неповнолітніх
        printAverageAgeMinors(arrayList);

        // - Отримати середній оклад на відділ
        printAverageSalary(arrayList);

        // - Отримати користувачів у яких пошта "gmail.com";
        System.out.println("\nКористувачі з поштою \"gmail.com\": ");
        // TODO

        // - Отримати електронні скриньки всіх повнолітніх жінок, не старших 30ти, які проживають в Україні та працюють
        System.out.println("\nЕлектронні скриньки працюючих жінок не старших 30ти: ");
        // TODO
    }

    private static void getUsersList(ArrayList<User> arrayList) {
        System.out.println("Тільки Users: ");
        for (User user : arrayList) {
            if (user instanceof Employee == false)
                System.out.println("Name: " + user.getFullName() +
                        ", Age: " + user.getAge() +
                        ", Gender: " + user.getGender() +
                        ", Email: " + user.getEmail() +
                        ", Country: " + user.getResidenceCountry() + ";"
                );
        }
    }

    private static int averageAgeAll(ArrayList<User> arrayList) {
        int avg = 0;

        for (int i = 0; i < arrayList.size(); i++) {
            avg += arrayList.get(i).getAge();
        }
        avg /= arrayList.size();

        return avg;
    }

    private static void printAverageAgeAll(ArrayList<User> arrayList) {
        System.out.println("\nСередній вік Users & Employees: " + averageAgeAll(arrayList) + " років;");
    }

    private static int averageAgeMinors(ArrayList<User> arrayList) {
        int avg = 0;

        ArrayList<User> temp = (ArrayList<User>) arrayList.clone();
        temp.removeIf(s -> s.getAge() >= 18);

        for (int i = 0; i < temp.size(); i++) {
            avg += temp.get(i).getAge();
        }
        avg /= temp.size();

        return avg;
    }

    private static void printAverageAgeMinors(ArrayList<User> arrayList) {
        System.out.println("Середній вік серед неповнолітніх: " + averageAgeMinors(arrayList) + " років;");
    }

    private static int averageSalary(ArrayList<User> arrayList, String department) {
        int avg = 0;
        int size = 0;

        for (int i = 0; i < arrayList.size(); ++i) {
            if (arrayList.get(i) instanceof Employee) {
                Employee temp = (Employee) arrayList.get(i);
                if (temp.getDepartment().contains(department)) {
                    avg += temp.getSalary();
                    ++size;
                }
            }
        }
        avg /= size;

        return avg;
    }

    private static void printAverageSalary(ArrayList<User> arrayList) {
        String[] departments = new String[]{"IT", "HR", "UI"};

        System.out.println("Середній оклад на відділ: "
                + departments[0] + " - " + averageSalary(arrayList, departments[0]) + "$ \t"
                + departments[1] + " - " + averageSalary(arrayList, departments[1]) + "$ \t"
                + departments[2] + " - " + averageSalary(arrayList, departments[2]) + "$ \t"
        );
    }
}
