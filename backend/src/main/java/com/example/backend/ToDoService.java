package com.example.backend;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class ToDoService {

    private final ToDoRepository toDoRepository;

    public ToDo addToDo(ToDo todo) {
        String id = UUID.randomUUID().toString();
        ToDo newTodo = new ToDo(id, todo.description(), todo.status());
        return toDoRepository.addToDo(newTodo);
    }

    public ToDo getToDoById(String id) {
        return toDoRepository.getById(id);
    }

    public List<ToDo> listAllToDos() {
        return toDoRepository.list();
    }

    public ToDo update(ToDo updatedToDo, String id) {
        return toDoRepository.update(updatedToDo, id);

    }
}
