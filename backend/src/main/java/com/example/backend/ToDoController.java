package com.example.backend;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/todo")
public class ToDoController {
    private final ToDoService toDoService;

    @GetMapping("")
    public List<ToDo> listAllToDoTasks() {
        return toDoService.listAllToDos();
    }

    @PostMapping
    public ToDo addTodo(@RequestBody ToDo todo) {
        return toDoService.addToDo(todo);
    }

    @GetMapping("{id}")
    public String getToDoById(@PathVariable String id) {
        return toDoService.getToDoById(id).description();
    }

    @PutMapping("{id}")
    public ToDo updateToDo(@RequestBody ToDo updatedToDo, @PathVariable String id) {
        return toDoService.update(updatedToDo, id);
    }
}
