package com.mantu.InstagramBackendApp.repository;

import com.mantu.InstagramBackendApp.model.Follow;
import com.mantu.InstagramBackendApp.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IFollowRepo extends JpaRepository<Follow,Integer> {
    List<Follow> findByCurrentUserAndCurrentUserFollower(User targetUser, User follower);
}
