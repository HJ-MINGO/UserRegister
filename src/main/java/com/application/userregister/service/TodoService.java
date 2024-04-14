package com.application.userregister.service;

import com.application.userregister.domain.ToDoEntity;
import com.application.userregister.model.TodoRequest;
import com.application.userregister.model.TodoResponse;

import java.util.List;

public interface TodoService {
    /**
     *  인터페이스의 모든 메소드는 암시적으로 public 또는 abstract(하지만 메소드는 final은 아님)
     *  Error :
     *  1. public static final int test_01;        // final선언후 초기화를 시키지 않음
     *  2. protected final int test_02 = 10;       // 'protected' 는 인터페이스에서 사용할수 없음
     *  3. private static final int test_03 = 10;  // 'private' 는 인터페이스에서 사용할수 없음
     *
     *  useCase :
     *  1. int test_01 = 10;
     *  2. static int test_02 = 10;                // Modifier 'static' is redundant for interface fields
     *  3. final int test_03 = 10;                 // Modifier 'final' is redundant for interface fields
     *  4. public static int test_04 = 10;         // Modifier 'public' is redundant for interface fields, Modifier 'static' is redundant for interface fields
     *  5. public final int test_05 = 10;          // Modifier 'public' is redundant for interface fields, Modifier 'final' is redundant for interface fields
     *  6. public static final int test_06 = 10;   // Modifier 'public' is redundant for interface fields, Modifier 'static' is redundant for interface fields, Modifier 'final' is redundant for interface fields
     *
     *  인터페이스의 모든 필드는 암시적으로 public,static 또는 final이다. 생략하면 public,static 또는 final 타입이 자동으로 붙는다
     *  Error : 
     *  1. private void mTest_01();    // Modifier 'private' not allowed here
     *  2. protected void mTest_02();  // Modifier 'protected' not allowed here
     *  3. void mTest_03() { }         // Interface abstract methods cannot have body
     *
     *  useCase : public,abstract,final 생략가능
     *  1. int test_01 = 10;
     *  2. static int test_02 = 10;                // Modifier 'static' is redundant for interface fields
     *  3. final int test_03 = 10;                 // Modifier 'final' is redundant for interface fields
     *  4. public static int test_04 = 10;         // Modifier 'public' is redundant for interface fields, Modifier 'static' is redundant for interface fields
     *  5. public final int test_05 = 10;          // Modifier 'public' is redundant for interface fields, Modifier 'final' is redundant for interface fields
     *  6. public static final int test_06 = 10;   // Modifier 'public' is redundant for interface fields, Modifier 'static' is redundant for interface fields, Modifier 'final' is redundant for interface fields
     *  7. void mTest_03();
     *  8. abstract void mTest_02();               // Modifier 'abstract' is redundant for interface methods
     *  9. public abstract void mTest_01();        // Modifier 'public' is redundant for interface methods, Modifier 'abstract' is redundant for interface methods
     *
     * */
    TodoResponse add(TodoRequest req);

    TodoResponse searchById(Long id);

    List<TodoResponse> searchAll();

    TodoResponse updateById(Long id,TodoRequest req);

    void deletedById(Long id);
}
