package com.mantu.InstagramBackendApp.repository;

import com.mantu.InstagramBackendApp.model.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICommentRepo extends JpaRepository<Comment,Integer> {
}
