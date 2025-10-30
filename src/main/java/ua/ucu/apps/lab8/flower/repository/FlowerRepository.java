package ua.ucu.apps.lab8.flower.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import ua.ucu.apps.lab8.flower.model.Flower;

public interface FlowerRepository extends JpaRepository<Flower, Integer>{
    
}
