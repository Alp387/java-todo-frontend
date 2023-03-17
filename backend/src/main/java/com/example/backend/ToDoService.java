package com.example.backend;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ToDoService {

    private final ToDoRepository toDoRepository;

    public void addToDo(String description) {
        toDoRepository.addToDo(description);
    }
    public ToDo getToDoById(String id){
        return toDoRepository.getById(id);
    }

    public List<ToDo> listAllToDos() {
        return toDoRepository.list();
    }
}
