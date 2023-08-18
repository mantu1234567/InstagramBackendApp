package com.mantu.InstagramBackendApp.repository;

import com.mantu.InstagramBackendApp.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IPostRepo extends JpaRepository<Post,Integer> {
}
