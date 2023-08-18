package com.mantu.InstagramBackendApp.repository;

import com.mantu.InstagramBackendApp.model.Admin;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IAdminRepo extends JpaRepository<Admin,Integer> {
}
