package by.it.dilkevich.jd01_12;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class TaskB2 {

    static String process(ArrayList<String> peoples) {

        boolean add = false;

        while (peoples.size()> 1) {

            Iterator<String> iterator = peoples.iterator();
            while (iterator.hasNext()) {

                if (iterator.hasNext() && add == false) {
                    iterator.next();
                    add = true;

                } else if (iterator.hasNext() && add == true) {
                    iterator.next();
                    iterator.remove();
                    add = false;
                }
            }
        }
        return peoples.get(0);
    }

    static String process(LinkedList<String> peoples){

        boolean add = false;
        String temp = null;
        Iterator<String> iterator = peoples.iterator();

        while (!peoples.getFirst().equals(peoples.getLast())) {

            if (add == false) {

                temp = peoples.getFirst();
                peoples.removeFirst();
                peoples.addLast(temp);
                add = true;
            } else if (add == true) {

                peoples.removeFirst();
                add = false;
            }
        }
        return peoples.getFirst();
    }

    public static void main(String[] args) {

        List<String> first = new ArrayList<>();
        List<String> second = new LinkedList<>();

        first.add("1");
        first.add("2");
        first.add("3");
        first.add("4");
        first.add("5");
        first.add("6");
        first.add("7");

        second.add("1");
        second.add("2");
        second.add("3");
        second.add("4");
        second.add("5");
        second.add("6");
        second.add("7");

        System.out.println(first);
        System.out.println(second);

        String firstRes = TaskB2.process((ArrayList<String>) first);
        String secondRes = TaskB2.process((LinkedList<String>) second);

        System.out.println(first);
        System.out.println(second);

        System.out.println(firstRes);
        System.out.println(secondRes);

    }
}
