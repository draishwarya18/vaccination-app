package com.jpa.vaccinationapp.admin.dao;

import com.jpa.vaccinationapp.admin.entity.Admin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AdminRepository extends JpaRepository<Admin, Integer> {
    Optional<Admin> findByEmailIgnoreCase(String Email);
}
