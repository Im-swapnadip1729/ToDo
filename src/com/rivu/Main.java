package com.rivu;

import java.util.Scanner;

public class Main {
    private static Scanner in = new Scanner(System.in);
    private static ToDolist myTodoList = new ToDolist();
    public static void main(String[] args) {

        System.out.println("Hello World");
        int command = 0;
        boolean exit = false;
        printCommand();

        while(!exit){
            System.out.println("Enter Your choice: ");
            command = in.nextInt();
            in.nextLine();

            switch (command){

                case 0:
                    printCommand();
                    break;
                case 1:
                    myTodoList.printTodoList();
                    break;
                case 2:
                    addItem();
                    break;
                case 3:
                    updateTodoList();
                    break;
                case 4:
                    removeItem();
                    break;
                case 5:
                    findItem();
                    break;
                case 6:
                    exit = true;
                    break;
                default:
                    System.out.println("Please enter the value from 0-6 ");
            }
        }
    }
    public static void printCommand(){
        System.out.println("0. Print instruction");
        System.out.println("1. Print To-Do list");
        System.out.println("2. Add item to To-Do list");
        System.out.println("3. Modify items in To-Do");
        System.out.println("4. Remove item from To-Do");
        System.out.println("5. Search item");
        System.out.println("6. Exit");
    }

    public static void addItem(){
        System.out.println("Enter item to be added in To-Do: ");
        myTodoList.addItem(in.nextLine());
    }
    public static void updateTodoList(){
        System.out.println("Enter the item number: ");
        int index = in.nextInt();
        in.nextLine();
        System.out.println("Enter new item to be enter ");
        String myNewItem = in.nextLine();
        myTodoList.updateTodoList(index-1, myNewItem);
    }
    public static void removeItem(){
        System.out.println("Enter the item number to be deleted: ");
        int index = in.nextInt();
        in.nextLine();
        myTodoList.removeItem(index-1);
    }
    public static void findItem(){
        System.out.println("Enter the item to be searched");
        String searchItem = in.nextLine();
        if(myTodoList.findItem(searchItem) == null){
            System.out.println("Item not found in the To-Do");
        }
        else {
            System.out.println(searchItem+ " is found");
        }
    }
}
