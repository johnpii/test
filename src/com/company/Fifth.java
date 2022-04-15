package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Fifth {
    // 1
    public static class Phone {
        private int number;
        private String model;
        private int weight;

        Phone(int number, String model, int weight) {
            Phone test = new Phone(222222, "first");
        }

        Phone(int number, String model) {

        }

        Phone() {

        }

        public void receiveCall(String name) {
            System.out.println("Звонит " + name);
        }

        public void receiveCall(String name, int number) {
            System.out.println("Звонит " + name + "\t" + number);
        }

        public void setNumber(int number) {

            this.number = number;

        }

        public void getNumber() {
            System.out.println(number);
        }

        public void setModel(String model) {

            this.model = model;

        }

        public String getModel() {
            return model;
        }

        public void setWeight(int weight) {

            this.weight = weight;

        }

        public int getWeight() {
            return weight;
        }

        public void sendMessage(int... array) {
            for (int a : array) {

                System.out.print(a + "\t");

            }
        }
    }

    // 2
    public static class Person {
        String fullName;
        int age;

        Person() {

        }

        Person(String fullName, int age) {

        }

        public void move() {
            System.out.print("Такой-то  Person говорит");
        }

        public void talk() {
            System.out.print("Такой-то  Person говорит");
        }
    }

    // 3
    public static class Matriz {
        int strok;
        int stolbzov;
        double[][] array1 = new double[strok][stolbzov];

        public double[][] summa(double[][] array2) {
            for (int i = 0; i < array1.length; i++) {
                for (int j = 0; j < array1[i].length; j++) {
                    array1[i][j] = array1[i][j] + array2[i][j];
                }
            }
            return array1;
        }

        public double[][] naChislo(int mnozh) {
            for (int i = 0; i < array1.length; i++) {
                for (int j = 0; j < array1[i].length; j++) {
                    array1[i][j] = array1[i][j] * mnozh;
                }
            }
            return array1;
        }

        public void printResult() {
            for (int i = 0; i < array1.length; i++) {
                for (int j = 0; j < array1[i].length; j++) {
                    System.out.println(" " + array1[i][j]);
                }
                System.out.println();
            }
        }

        public double[][] umnozh(double[][] array2) {
            for (int i = 0; i < array1.length; i++) {
                for (int j = 0; j < array1[i].length; j++) {
                    array1[i][j] = array1[i][j] * array2[i][j];
                }
            }
            return array1;
        }
    }

    // 4
    public static class Book
    {
      String name;
      String author;
    }
    public static class Reader
    {
        String fio;
        int numberbilet;
        String facult;
        String date;
        int telefon;
        public void takeBook(int number)
        {
            System.out.println("Петров В. В. взял" + number +"книги");
        }
        public void takeBook(String... array)
        {
            System.out.print("Петров В. В. взял книги: ");
            for (String a : array) {
                System.out.print(a);
            }
        }
        public void takeBook(Book... array)
        {
            System.out.print("Петров В. В. взял книги: ");
            for (Book a : array) {
                System.out.println(a.name);
            }
        }
        public void returnBook(int number)
        {
            System.out.println("Петров В. В. вернул" + number +"книги");
        }
        public void returnBook(String... array)
        {
            System.out.print("Петров В. В. вернул книги: ");
            for (String a : array) {
                System.out.print(a);
            }
        }
        public void returnBook(Book... array)
        {
            System.out.print("Петров В. В. вернул книги: ");
            for (Book a : array) {
                System.out.println(a.name);
            }
        }
    }
    public static void main(String[] args) {
        // 1
        Phone phone1 = new Phone();
        Phone phone2 = new Phone();
        Phone phone3 = new Phone();
        phone1.number = 342352354;
        phone1.model = "apple";
        phone1.weight = 33;
        phone2.number = 345236745;
        phone2.model = "samsung";
        phone2.weight = 31;
        phone3.number = 354532399;
        phone3.model = "honor";
        phone3.weight = 23;
        System.out.println(phone1.number + "\t" + phone1.model + "\t" + phone1.weight + "\n");
        System.out.println(phone2.number + "\t" + phone2.model + "\t" + phone2.weight + "\n");
        System.out.println(phone3.number + "\t" + phone3.model + "\t" + phone3.weight + "\n");
        phone1.getNumber();
        phone1.receiveCall("Tom");
        phone2.getNumber();
        phone2.receiveCall("John");
        phone3.getNumber();
        phone3.receiveCall("Ben");
        phone1.receiveCall("Ann", 555555);
        // 2
        Person person1 = new Person();
        Person person2 = new Person("Ivanov Ivan Ivanovich", 20);
        // 4
        Reader[] reader = new Reader[3];
    }
}
