package com.application.userregister.service.impl;

import com.application.userregister.domain.ToDoEntity;
import com.application.userregister.model.TodoRequest;
import com.application.userregister.model.TodoResponse;
import com.application.userregister.repository.TodoRepository;
import com.application.userregister.service.TodoService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class TodoServiceImpl implements TodoService {
    // DI(의존성)주입 방식
    // 스프링 빈은 static 대신 빈 컨테이너를 이용한 싱글톤 방식을 사용하기 때문에 (단, 1개의 객체만 존재한다는 의미)
    // 의존성 주입받는 필드는 싱글톤으로 생성된 오직 단1개의 객체만 존재함으로 기본적으로 다 this를 통해 명시해줄 필요는 없다.
    // 1. 생성자 주입방식 지향
    private final TodoRepository todoRepository;

    public TodoResponse add(TodoRequest req) {
        ToDoEntity toDoEntity = new ToDoEntity();
        toDoEntity.setTitle(req.getTitle());
        toDoEntity.setOrder(req.getOrder());
        toDoEntity.setCompleted(req.getCompleted());
        // this를 사용해 해당 클래스에 객체를 사용한다고 명시를 해주는게 표면적으로 좋다
        return  new TodoResponse(this.todoRepository.save(toDoEntity));
    }

    public TodoResponse searchById(Long id) {
        ToDoEntity req = this.todoRepository.findById(id)
                .orElseThrow(()-> new ResponseStatusException(HttpStatus.NOT_FOUND));
        return  new TodoResponse(req);
    };

    public List<TodoResponse> searchAll() {
        List<ToDoEntity> req = this.todoRepository.findAll();
        List<TodoResponse> rep = req.stream()
                .map(TodoResponse::new)
                .collect(Collectors.toList());
        return rep;
    }

    ;
    private ToDoEntity searchTodoEntity(Long id) {
        return this.todoRepository.findById(id)
                .orElseThrow(()-> new ResponseStatusException(HttpStatus.NOT_FOUND));
    }

    public TodoResponse updateById(Long id, TodoRequest req) {
        ToDoEntity toDoEntity = this.searchTodoEntity(id);
        if (req.getTitle() !=  null) {
            toDoEntity.setTitle(req.getTitle());
        }
        if (req.getOrder() != null) {
            toDoEntity.setOrder(req.getOrder());
        }
        if (req.getCompleted() != null) {
            toDoEntity.setCompleted(req.getCompleted());
        }
        return new TodoResponse(this.todoRepository.save(toDoEntity));
    };

    public void deletedById(Long id) {
        this.todoRepository.deleteById(id);
    };
    public void deletedByAll() {
        this.todoRepository.deleteAll();
    }
}
