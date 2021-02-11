package week14d03;

import org.jetbrains.annotations.NotNull;

import java.util.*;

/*  Készíts egy diák (Student) osztályt melyben egy diák jegyeit tárolod egy Map-ben.
    A map kulcsa a tantárgy, értéke pedig az adott tantárgy jegyeinek listája.
    Ezen felül a diáknak legyen neve, melyet konstruktorban kap meg.
    Legyen benne egy metódus, ami paraméterül vár egy tantárgyat és egy jegyet,
    és beírja a jegyet a megfelelő tantárgyhoz. Készítsd el a ClassNotebook nevű osztályt
    melyben diákok listája található. Ezt konstruktorban kapja meg.
    Készíts egy lekérdező metódust a ClassNoteBook osztályban,
    legyen a neve sortNotebook mely a diákok listáját ABC sorrendben adja vissza.
 */

public class Student implements Comparable<Student> {

    private Map<String, List<Integer>> subjectsAndGrades = new HashMap<>();

    private String name;

    public Student(String name) {
        this.name = name;
    }

    public void enterTheGrade (String subject, int grade) {
        if (!subjectsAndGrades.containsKey(subject)) {
            subjectsAndGrades.put(subject, new ArrayList<>(List.of(grade)));
        } else {
            subjectsAndGrades.get(subject).add(grade);
        }
    }

    @Override
    public int compareTo(@NotNull Student o) {
        return this.name.compareTo(o.name);
    }

    @Override
    public String toString() {
        return "Student{" +
                "subjectsAndGrades=" + subjectsAndGrades +
                ", name='" + name + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public Map<String, List<Integer>> getSubjectsAndGrades() {
        return Map.copyOf(subjectsAndGrades);
    }

}