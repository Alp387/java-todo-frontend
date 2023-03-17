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
    public List<ToDo> listAllToDoTasks(){
return toDoService.listAllToDos();
    }
//
//    @GetMapping("/board/doing")
//    public List<ToDo> listAllDoingTasks(){
//        return null;
//    }
//    @GetMapping ("/board/done")
//    public List<ToDo> listAllDoneTasks(){
//        return null;
//    }

    @PostMapping
    public void addTodo(@RequestBody String description){
        toDoService.addToDo(description);


    }
    @GetMapping("{id}")
    public ToDo getToDoById(@PathVariable String id){
        return toDoService.getToDoById(id);
    }

}
