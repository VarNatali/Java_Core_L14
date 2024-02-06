package ua.lviv.lga.Less14.task02;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;


public class GroupOfCommodity {

    public void showAll(List cmList) {
        System.out.println("Весь перелік товарів:");
        System.out.println("");
        for (int i = 0; i < cmList.size(); i++) {
            System.out.println(cmList.get(i));
        }

    }

    public void replaceElement(List cmList) {
        Scanner sc = new Scanner(System.in);

        Iterator<Commodity> iterator = cmList.iterator();

        String str;
        System.out.println("Введіть назву товару, який треба замінити");
        str = sc.next();
        int num = -1;

        while (iterator.hasNext()) {
            Commodity next = iterator.next();
            if (next.getName().equalsIgnoreCase(str)) {
                num++;
                System.out.println("Введіть нову назву товару");
                next.setName(sc.next());
                System.out.println("Введіть нову вагу товару");
                next.setWeight(sc.nextInt());

                System.out.println("Введіть нову ширину товару");
                next.setWidth(sc.nextInt());
                System.out.println("Введіть нову довжину товару");
                next.setLength(sc.nextInt());

                System.out.println("Товар замінено з " + str + " на " + next.getName());

            }

        }
        if (num < 0) System.out.println("Не знайдено такого товару.");
    }

    public void addCommodity(List cmList) {
        int num = -1;
        Iterator<Commodity> iterator = cmList.iterator();
        String str;
        Scanner sc2 = new Scanner(System.in);
        Commodity cm = new Commodity();

        System.out.println("Введіть назву товару");
        str = sc2.next();
        num = isExist(iterator, str);
        if (num < 0) {
            cm.setName(str);
            System.out.println("Введіть width товару");
            cm.setWidth(sc2.nextInt());
            System.out.println("Введіть length товару");
            cm.setLength(sc2.nextInt());
            System.out.println("Введіть weight товару");
            cm.setWeight(sc2.nextInt());
            cmList.add(cm);
            System.out.println("Commodity added.");
        } else {
            System.out.println("Товар з точно таким ім*ям вже існує.");
        }

        System.out.println();

    }

    public void showElement(List cmList) {
        Scanner sc = new Scanner(System.in);
        int num = -1;
        System.out.println("Введіть номер товару");
        num = sc.nextInt();
        if (num < 0 || num > cmList.size()) System.out.println("Cтільки товару немає.");
        else System.out.println(cmList.get(num - 1));

    }


    public void deleteCommodity(List cmList) {
        String str;
        Commodity cm = new Commodity();

        Scanner sc = new Scanner(System.in);
        int num = -1;
        System.out.println("Введіть назву товару");
        str = sc.next();

        Iterator<Commodity> iterator = cmList.iterator();

        while (iterator.hasNext()) {
            Commodity next = iterator.next();
            if (next.getName().equalsIgnoreCase(str)) {
                iterator.remove();
                num++;
            }
        }
        if (num < 0) System.out.println("Нема такого товару");

    }


    public void showSeparate(List cmList) {
        Scanner sc2 = new Scanner(System.in);
        String str;
        int num = -1;
        System.out.println("Введіть назву товару");
        str = sc2.next();

        Iterator<Commodity> iterator = cmList.iterator();

        num = isExist(iterator, str);
        if (num < 0) {
            Iterator<Commodity> iterator2 = cmList.iterator();
            System.out.println("Не знайдено такого товару. Спробуйте знайти за вагою.");
            System.out.println("Введіть вагу товару");
            int wg = sc2.nextInt();

            while (iterator2.hasNext()) {
                Commodity next = iterator2.next();
                if (next.getWeight() == wg) {

                    System.out.println(next.toString());
                    num++;
                }
            }
            if (num < 0) System.out.println("Немає товару такої ваги");

        }


    }

    private static int isExist(Iterator<Commodity> iterator, String str) {
        int num = -1;
        while (iterator.hasNext()) {
            Commodity next = iterator.next();
            if (next.getName().equalsIgnoreCase(str)) {
                System.out.println(next.toString());
                num++;
            }
        }

        return num;
    }

}