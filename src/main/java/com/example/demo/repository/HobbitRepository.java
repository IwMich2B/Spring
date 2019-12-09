package com.example.demo.repository;

import com.example.demo.model.Hobbit;
import org.springframework.data.repository.CrudRepository;

public interface HobbitRepository extends CrudRepository<Hobbit,Long> {
    // interfejs dostarcza implementacje którą potrzebujemy do zapisywania elementów w bazie danych
    

}
