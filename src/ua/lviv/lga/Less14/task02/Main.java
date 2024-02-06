package ua.lviv.lga.Less14.task02;

import java.util.*;

public class Main {
    static void menu() {
        System.out.println();
        System.out.println("Введіть 0 : завершити");
        System.out.println("Введіть 1 :  додати товар");
        System.out.println("Введіть 2 :  видалити товар");
        System.out.println("Введіть 3 :  замінити товар");
        System.out.println("Введіть 4 :  сортувати за назвою");
        System.out.println("Введіть 5 :  сортувати за шириною");
        System.out.println("Введіть 6 :  сортувати за довжиною");
        System.out.println("Введіть 7 :  сортувати за вагою");
        System.out.println("Введіть 8 :  вивести елемент ");
        System.out.println("Введіть 9 :  вивести інформацію про певний товар ");

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Commodity cm = new Commodity();
        GroupOfCommodity group = new GroupOfCommodity();

        List<Commodity> arrList = new ArrayList<Commodity>();

        arrList.add(new Commodity("art07", 15, 25, 12));
        arrList.add(new Commodity("abce02", 7, 2, 28));
        arrList.add(new Commodity("aadr03", 12, 5, 18));
        arrList.add(new Commodity("art01", 23, 4, 41));
        arrList.add(new Commodity("art05", 4, 12, 23));
        arrList.add(new Commodity("art06", 2, 13, 6));


        while (true) {
            menu();
            switch (sc.next()) {
                case "0":
                    System.exit(0);
                    sc.close();
                    break;
                case "1":
                    group.addCommodity(arrList);
                    group.showAll(arrList);

                    break;
                case "2":
                    group.deleteCommodity(arrList);

                    group.showAll(arrList);
                    break;
                case "3":
                    group.replaceElement(arrList);
                    group.showAll(arrList);
                    break;
                case "4":
                    Collections.sort(arrList, new CommoditySortName());

                    group.showAll(arrList);

                    break;
                case "5":
                    Collections.sort(arrList, new CommoditySortWeight());

                    group.showAll(arrList);

                    break;
                case "6":
                    Collections.sort(arrList, new CommoditySortLength());
                    group.showAll(arrList);
                    break;
                case "7":
                    Collections.sort(arrList, new CommoditySortWidth());
                    group.showAll(arrList);

                    break;
                case "8":

                    group.showElement(arrList);

                    break;
                case "9":
                    group.showSeparate(arrList);

                    break;


            }

        }

    }

}
