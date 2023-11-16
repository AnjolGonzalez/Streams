package com.pluralsight.streams;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        List<Person> personList = new ArrayList<>();
        personList.add(new Person("Jake", "Arnett", 25));
        personList.add(new Person("Joshua", "Ramos", 21));
        personList.add(new Person("Randy", "Lopez", 23));
        personList.add(new Person("Christian", "Crites", 18));
        personList.add(new Person("Sing", "Tuttanon", 19));
        personList.add(new Person("Clancy", "Long", 26));
        personList.add(new Person("Abigiel Woldegerima", " ", 21));
        personList.add(new Person("Aleksandr", "Nikitin", 20));
        personList.add(new Person("Caleb", "Howard", 24));
        personList.add(new Person("Desi", "Rorie", 25));
        personList.add(new Person("Ivan", "Taverez", 23));
        personList.add(new Person("Rickey", "Glover", 22));


        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the first or last name:");
        String name = scanner.nextLine();

        for (Person p : personList) {
            if (name.equalsIgnoreCase(p.getLastName()) || name.equalsIgnoreCase(p.getFirstName())) {
                System.out.println(p.getFirstName() + " " +  p.getLastName() + " " +  p.getAge());
            }
        }
        double totalAge = 0;

        for (Person p : personList) {
            totalAge += p.age;
        }
        double averageAge = totalAge / personList.size();

        System.out.println("Average age: " + averageAge);

        Person oldest = personList.get(0);
        //p = person,
        //oldest = oldest person
        for (Person p : personList) {
            if (p.age > oldest.age) {
                oldest = p;
            }
        }
        System.out.println("Oldest: " + oldest.firstName + " " + oldest.lastName +
                ", Age: " + oldest.age);

        Person youngest = personList.get(0);

        for (Person p : personList) {
            if (p.age < youngest.age) {
                youngest = p;
            }
        }

        System.out.println("Youngest: " + youngest.firstName + " " + youngest.lastName +
                ", Age: " + youngest.age);

    }
}
