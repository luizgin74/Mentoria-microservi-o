package com.capgemini.mentoria.repository;

import com.capgemini.mentoria.entity.Setting;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SettingRepository extends JpaRepository<Setting, Long> {
}
