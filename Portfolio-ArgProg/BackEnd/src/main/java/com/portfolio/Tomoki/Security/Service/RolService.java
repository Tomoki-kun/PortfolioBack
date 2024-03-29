
package com.portfolio.Tomoki.Security.Service;

import com.portfolio.Tomoki.Security.Entity.Rol;
import com.portfolio.Tomoki.Security.Enums.RolNombre;
import com.portfolio.Tomoki.Security.Repository.IRolRepository;
import javax.transaction.Transactional;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class RolService {
    @Autowired
    IRolRepository  iRolRepository;
    
    public Optional<Rol> getByRolNombre(RolNombre rolNombre)
    {
        return iRolRepository.findByRolNombre(rolNombre);
    }
    
    public void save(Rol rol)
    {
        iRolRepository.save(rol);
    }
}
