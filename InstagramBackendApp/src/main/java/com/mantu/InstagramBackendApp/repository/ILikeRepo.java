package com.mantu.InstagramBackendApp.repository;

import com.mantu.InstagramBackendApp.model.Like;
import com.mantu.InstagramBackendApp.model.Post;
import com.mantu.InstagramBackendApp.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ILikeRepo extends JpaRepository<Like,Integer> {
    List<Like> findFirstByInstaPostAndLiker(Post instaPost, User liker);

    List<Like> findByInstaPost(Post post);
}
