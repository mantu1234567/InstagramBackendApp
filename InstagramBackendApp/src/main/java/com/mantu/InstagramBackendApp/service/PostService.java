package com.mantu.InstagramBackendApp.service;

import com.mantu.InstagramBackendApp.model.Post;
import com.mantu.InstagramBackendApp.model.User;
import com.mantu.InstagramBackendApp.repository.IPostRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class PostService {
    @Autowired
    IPostRepo postRepo;

    public String createInstaPost(Post post) {
        if(post != null){
            post.setPostCreatedTimeStamp(LocalDateTime.now());
            post.setPostType(post.getPostType());
            postRepo.save(post);
            return "Post uploaded";
        }
        return "Post can't be updated";
    }

    public String removeInstaPost(Integer postID, User user) {
        Post postOwner = postRepo.findById(postID).orElse(null);
        if(postOwner != null && postOwner.getPostOwner().equals(user)){
            postRepo.deleteById(postID);
            return "Post deleted successfull";
        }else if(postOwner == null) {
            return "Post delete does not exist";
        }else {
            return "Un-Authorised user doest not allow to delete post";
        }
    }

    public boolean isValidPost(Post instaPost) {
        return (instaPost != null && postRepo.existsById(instaPost.getPostId()));
    }
    public Post getPostById(Integer postId) {
        return postRepo.findById(postId).orElse(null);
    }
}