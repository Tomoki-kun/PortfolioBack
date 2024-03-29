
package com.portfolio.Tomoki.Security.Service;

import com.portfolio.Tomoki.Security.Entity.Usuario;
import com.portfolio.Tomoki.Security.Repository.IusuarioRepository;
import javax.transaction.Transactional;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class UsuarioService {
    @Autowired
    IusuarioRepository iUsuarioRepository;
    
    public Optional<Usuario> getByNombreUsuario(String nombreUsuario)
    {
        return iUsuarioRepository.findByNombreUsuario(nombreUsuario);
    }
    
    public boolean existsByNombreUsuario(String nombreUsuario)
    {
        return iUsuarioRepository.existsByNombreUsuario(nombreUsuario);
    }
    public boolean existsByEmail(String email)
    {
        return iUsuarioRepository.existsByEmail(email);
    }
    
    public void save(Usuario usuario)
    {
        iUsuarioRepository.save(usuario);
    }
}
