package sk.itsovy.matysko.Project;

import java.util.Random;

public class MyArray implements ArrayMethods {
    private int[] arr;
    private int size;

    public int getSize() {
        return size;
    }

    public MyArray(int size) {
        if (size > 0) {
            this.size = size;
            arr = new int[size];

            resetArrayToZero();
        } else {
            error("Incorrect array size:" + size);
        }
    }

    private void resetArrayToZero(int size) {
        for (int i = 0; i < size; i++) {
            arr[i] = 0;
        }
    }

    public MyArray(int[] input) {
        if (size > 0 && (input != null || input.length != 0)) {
            this.arr = input;
            this.size = input.length;
        } else {
            error("Incorrect array size: " + size);
        }
    }


    @Override
    public double getAverageValue() {
        int sum = 0;
        int temp = 0;
        for (int i = 0; i < size; i++) {
            sum += arr[i];
            temp++;
        }
        return (double) sum / temp;
    }

    @Override
    public int min() {
        int min = arr[0];
        for (int i = 1; i < size; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        return min;
    }

    @Override
    public int max() {
        int max = arr[0];
        for (int i = 1; i < size; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        return max;
    }

    @Override
    public int min2() {

        return 0;
    }

    @Override
    public int max2() {
        return 0;
    }

    @Override
    public void generateValues(int a, int b) {
        if (a < b) {
            System.out.println("wrong input!");
            ;
        } else {
            Random rnd = new Random();

            for (int i = 0; i < size; i++) {
                arr[i] = rnd.nextInt((b + a) - 1) + a;
            }
        }
    }

    @Override
    public boolean contains(int value) {
        for (int i = 0; i < size; i++) {
            if (arr[i] == value) {
                return true;
            }
        }
        return false;
    }

    @Override
    public int countOfValues(int value) {
        int count = 0;
        for (int i = 0; i < size; i++) {
            if (arr[i] == value) {
                count++;
            }
        }
        return count;
    }

    @Override
    public int countOfEvenNumber() {
        int count = 0;
        for (int i = 0; i < size; i++) {
            if (arr[i] % 2 == 0) {
                count++;
            }
        }
        return count;
    }

    @Override
    public void incrementValues() {
        for (int i = 0; i < size; i++) {
            arr[i] += 1;
        }
    }

    @Override
    public void sort(boolean asc) {
        if (asc) {
            for (int i = 0; i < size - 1; i++) {
                for (int j = i + 1; j < size; j++) {
                    if (arr[i] > arr[j]) {
                        int temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                    }
                }
            }
        } else {
            for (int i = 0; i < size - 1; i++) {
                for (int j = i + 1; j < size; j++) {
                    if (arr[i] < arr[j]) {
                        int temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                    }
                }
            }
        }
    }

    @Override
    public void addItem(int newValue) {

    }

    @Override
    public void addItem(int newValue, int position) {
        int[] arr2 = new int[size + 1];
        for (int i=0; i<size;i++){
            arr2[i]=arr[i];
        }

        for (int i = position+1; i < (size + 1); i++) {
            arr2[i]=arr2[i-1];
        }
        arr2[position]=newValue;
    }

    @Override
    public int[] coppy() {
        int[] copy = arr.clone();
        return copy;

    }

    @Override
    public int getItem(int position) {
        return arr[position];
    }


    public void error(String message) {
        System.out.println(message);
        System.exit(1);

    }
}