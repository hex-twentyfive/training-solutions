package week14d03;

import java.util.*;

public class ClassNotebook {

    private List<Student> students;

    public ClassNotebook(List<Student> students) {
        this.students = students;
    }

    public List<Student> sortNotebook() {
        List<Student> orderedStudents = new ArrayList<>(students);
        Collections.sort(orderedStudents);
        return orderedStudents;
    }

    public List<Student> sortNotebookByComparator() {
        Comparator<Student> studentComparator = new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getName().compareTo(o2.getName());
            }
        };
        List<Student> orderedList = new ArrayList<>(students);
        Collections.sort(orderedList, studentComparator);
        return orderedList;
    }

    public List<Student> getStudents() {
        return students;
    }

}