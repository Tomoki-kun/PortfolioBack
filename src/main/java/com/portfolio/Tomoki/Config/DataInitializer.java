
package com.portfolio.Tomoki.Config;

import com.portfolio.Tomoki.Security.Entity.Rol;
import com.portfolio.Tomoki.Security.Entity.Usuario;
import com.portfolio.Tomoki.Security.Enums.RolNombre;
import com.portfolio.Tomoki.Security.Repository.IRolRepository;
import com.portfolio.Tomoki.Security.Repository.IusuarioRepository;
import com.portfolio.Tomoki.Security.Service.RolService;
import com.portfolio.Tomoki.Security.Service.UsuarioService;
import java.util.HashSet;
import java.util.Set;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataInitializer implements CommandLineRunner {

    @Autowired
    RolService rolService;
    @Autowired
    UsuarioService usuarioService;

    @Override
    public void run(String... args) throws Exception {
        Set<Rol> roles = new HashSet<>();
        Usuario usuario2 = new Usuario("user", "user", "user@user.com", "user");
        Usuario usuario1 = new Usuario("admin", "admin", "admin@admin.com", "admin");
        roles.add(rolService.getByRolNombre(RolNombre.ROLE_USER).get());
        usuario1.setRoles(roles);
        roles.add(rolService.getByRolNombre(RolNombre.ROLE_ADMIN).get());
        usuario2.setRoles(roles);
        usuarioService.save(usuario1);
        usuarioService.save(usuario2);

    }
}
