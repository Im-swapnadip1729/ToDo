package com.rivu;

import java.util.ArrayList;

public class ToDolist {
    ArrayList<String> todoList = new ArrayList<String>();
    // add list item
    public void addItem(String item){
        todoList.add(item);
    }
    //remove list item
    public void removeItem(int index){
        String myItem = todoList.get(index);//for checking purpose
        todoList.remove(index);
    }
    //print list
    public void printTodoList(){
        System.out.println("TODO list consist of: " +todoList.size() +" items");
        for (int i = 0; i < todoList.size(); i++){
            System.out.println("Item "+(i+1)+"."+todoList.get(i));
        }
    }
    // Update the list
    public void updateTodoList(int index, String list){
        todoList.set(index,list);
        System.out.println("Updation complited at position "+(index+1));
    }
//    Search feature
    public String findItem( String search){
        int index = todoList.indexOf(search);
        if (index < 0){
            return null;
        }
        else {
            return todoList.get(index);
        }
    }
}
