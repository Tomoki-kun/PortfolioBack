
package com.portfolio.Tomoki.Service;

import com.portfolio.Tomoki.Entity.Experiencia;
import com.portfolio.Tomoki.Repository.RExperiencia;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class SExperiencia {
    @Autowired
    RExperiencia rExperiencia;
    
    public List<Experiencia> list()
    {
        return rExperiencia.findAll();
    }
    
    public Optional<Experiencia> getOne (int id)
    {
        return rExperiencia.findById(id);
    }
    
    public Optional<Experiencia> getByNombreExp(String nombreE)
    {
        return rExperiencia.findByNombreExp(nombreE);
    }
    
    public void save(Experiencia exp)
    {
        rExperiencia.save(exp);
    }
    
    public void delete(int id)
    {
        rExperiencia.deleteById(id);
    }
    
    public boolean existsById(int id)
    {
        return rExperiencia.existsById(id);
    }
    
    public boolean existsByNombreExp(String nombreE)
    {
        return rExperiencia.existsByNombreExp(nombreE);
    }
}
