package com.christiandev.springboot.app.comida.facades;

import java.util.Optional;

import com.christiandev.springboot.app.comida.entities.Usuario;

public interface IUsuarioService {
	public Optional<Usuario> findById(Long id);
	
	public Usuario save(Usuario usuario);
}
