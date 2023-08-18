package com.mantu.InstagramBackendApp.service;

import com.mantu.InstagramBackendApp.model.Follow;
import com.mantu.InstagramBackendApp.model.User;
import com.mantu.InstagramBackendApp.repository.IFollowRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FollowService {
    @Autowired
    IFollowRepo followRepo;


    public void startFollowing(Follow follow, User follower) {

        follow.setCurrentUserFollower(follower);
        followRepo.save(follow);
    }

    public boolean isFollowAllowed(User targetUser, User follower) {

        List<Follow>followList = followRepo.findByCurrentUserAndCurrentUserFollower(targetUser,follower);

        return followList != null && followList.isEmpty() && !targetUser.equals(follower);
    }

    public Follow findFollowById(Integer followId) {
        return followRepo.findById(followId).orElse(null);
    }

    public void unFlowUser(Follow follow) {

        followRepo.delete(follow);
    }
}
