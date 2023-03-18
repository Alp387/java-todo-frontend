package com.example.backend;

import org.springframework.stereotype.Repository;

import java.sql.Array;
import java.util.*;

@Repository
public class ToDoRepository {

    Map<String, ToDo> toDoMap = new HashMap<>();

    public List<ToDo> list() {
        return new ArrayList<>(toDoMap.values());
    }

    public ToDo getById(String id) {
        return toDoMap.get(id);
    }


    public ToDo addToDo(ToDo todo) {
        toDoMap.put(todo.id(), todo);
        return todo;
    }

    public ToDo update(ToDo updatedToDo, String id) {
        //String newId = UUID.randomUUID().toString();
        //toDoMap.remove(id);
        toDoMap.put(id, updatedToDo);
        return toDoMap.get(id);

//        toDoMap.put(id,updatedToDo);
//        return toDoMap.get(id);
    }
}
