package intromethods;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TodoListMain {

    public static void main(String[] args) {

        TodoList test = new TodoList();

        test.addTodo("Cleaning");
        test.addTodo("Cooking");
        test.addTodo("Washing");
        test.addTodo("Scattering");

        test.finishTodos("Cleaning");
        System.out.println(test.todosToFinish());
        System.out.println("Number of tasks performed: " + test.numberOfFinishedTodos());
        List<String> didIt = new ArrayList<>();
        didIt = Arrays.asList("Washing", "Scattering");
        test.finishAllTodos(didIt);

        System.out.println("Number of tasks performed: " + test.numberOfFinishedTodos());
        System.out.println(test.toString());
    }

}

