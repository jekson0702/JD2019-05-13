package by.it.aadamovich.jd01_12;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class TaskA1 {

    private List<Integer> grades = new ArrayList<>();

    private void clearBad(List<Integer> grades) {

        Iterator<Integer> iterator = grades.iterator();
        while (iterator.hasNext()) {
            if (iterator.next() < 4) iterator.remove();
        }
    }

    public static void main(String[] args) {

        TaskA1 task = new TaskA1();
        Random random = new Random();

        for (int i = 0; i < 25; i++)
            task.grades.add(random.nextInt(10) + 1);

        System.out.println(task.grades);
        task.clearBad(task.grades);
        System.out.println(task.grades);
    }
}
