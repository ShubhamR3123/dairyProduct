package com.shubhamit.dairy.repository;

import com.shubhamit.dairy.entity.Dairy;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DairyRepository extends JpaRepository<Dairy, Integer> {
   List<Dairy>findByNameContaining(String keyword);

}
