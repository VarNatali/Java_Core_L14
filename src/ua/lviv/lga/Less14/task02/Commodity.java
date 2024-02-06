package ua.lviv.lga.Less14.task02;

import java.util.List;
import java.util.Scanner;
import java.util.TreeSet;

public class Commodity {
    private String name;
    private int width;
    private int length;
    private int weight;

    public Commodity(String name, int width, int length, int weight) {
        this.name = name;
        this.width = width;
        this.length = length;
        this.weight = weight;
    }

    public Commodity() {

    }

    public String getName() {
        return name;
    }

    public int getWidth() {
        return width;
    }

    public int getLength() {
        return length;
    }

    public int getWeight() {
        return weight;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }


    @Override
    public String toString() {
        return "Commodity{" +
                "name='" + name + '\'' +
                ", width=" + width +
                ", length=" + length +
                ", weight=" + weight +
                '}';
    }


}
