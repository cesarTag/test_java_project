package com.example.demo.service;

import com.example.demo.model.Usuario;
import com.example.demo.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    public List<Usuario> obtenerTodos() {
        return usuarioRepository.findAll();
    }

    public Optional<Usuario> obtenerPorId(Long id) {
        return usuarioRepository.findById(id);
    }

    public Usuario guardar(Usuario usuario) {
        return usuarioRepository.save(usuario);
    }

    public void eliminar(Long id) {
        usuarioRepository.deleteById(id);
    }

    // Método con código típico Java 8 que se puede mejorar
    public List<Usuario> filtrarMayoresDeEdad() {
        List<Usuario> usuarios = usuarioRepository.findAll();
        List<Usuario> mayores = new ArrayList<>();
        
        for (Usuario usuario : usuarios) {
            if (usuario.getEdad() != null && usuario.getEdad() >= 18) {
                mayores.add(usuario);
            }
        }
        
        return mayores;
    }

    // Otro ejemplo con manejo de Optional antiguo
    public String obtenerEmailPorId(Long id) {
        Optional<Usuario> usuario = usuarioRepository.findById(id);
        if (usuario.isPresent()) {
            return usuario.get().getEmail();
        } else {
            return "No encontrado";
        }
    }
}
