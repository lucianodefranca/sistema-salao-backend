package com.luciano.appsalao.repositories;

import com.luciano.appsalao.entities.Ordem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrdemRepository extends JpaRepository<Ordem, Integer> {
}
