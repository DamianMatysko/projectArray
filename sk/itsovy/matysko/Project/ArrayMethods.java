package sk.itsovy.matysko.Project;

import java.util.Random;

public interface ArrayMethods {

    public double getAverageValue();
    public int min();
    public int max();
    public int min2();//
    public int max2();//
    public void generateValues(int a, int b); //ab hranice od do
    public boolean contains(int value);
    public int countOfValues(int value);
    public int countOfEvenNumber();
    public void incrementValues();
    public void sort(boolean asc);
    public void addItem(int newValue);
    public void addItem(int newValue, int position);
    public int coppy();
    public int getItem(int position);


}
