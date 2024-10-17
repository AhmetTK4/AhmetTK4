package com.example.springpojoapp.repository;

import com.example.springpojoapp.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Long> {
}