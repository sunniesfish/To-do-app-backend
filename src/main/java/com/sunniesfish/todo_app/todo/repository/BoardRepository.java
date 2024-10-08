package com.sunniesfish.todo_app.todo.repository;

import com.sunniesfish.todo_app.todo.entity.Board;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface BoardRepository extends JpaRepository<Board, Long> {

    List<Board> findAllByUsernameOrderByOrderIndexAsc(String username);
    Optional<Board> findByUsernameOrderByOrderIndexDesc (String username);
    void deleteAllByUsername(String username);
}
