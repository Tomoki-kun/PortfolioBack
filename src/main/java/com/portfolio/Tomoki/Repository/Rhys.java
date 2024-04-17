package com.portfolio.Tomoki.Repository;

import com.portfolio.Tomoki.Entity.Hys;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Rhys extends JpaRepository<Hys, Integer>{
    Optional<Hys> findByNombre(String nombre);
    public boolean existsByNombre(String nombre);
}
