package com.example.backend;

import org.springframework.stereotype.Repository;

import java.sql.Array;
import java.util.*;

@Repository
public class ToDoRepository {

    Map<String,ToDo> toDoMap= new HashMap<>();

    public List<ToDo> list(){
        return new ArrayList<>(toDoMap.values());
    }
    public ToDo getById(String id){
        return toDoMap.get(id);
    }


    public void addToDo(String description) {
        String id= UUID.randomUUID().toString();
        System.out.println("id created");
        toDoMap.put(id,new ToDo(id,description,ToDoStatus.OPEN));
        System.out.println("toDo created");
    }
}
