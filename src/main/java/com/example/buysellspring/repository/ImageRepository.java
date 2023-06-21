package com.example.buysellspring.repository;

import com.example.buysellspring.model.Image;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ImageRepository extends JpaRepository<Image, Long> {
}
