package com.seongmin.diary.persistence.repository;

import com.seongmin.diary.persistence.domain.Shelf;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ShelfRepository extends JpaRepository<Shelf, Long> {

}
