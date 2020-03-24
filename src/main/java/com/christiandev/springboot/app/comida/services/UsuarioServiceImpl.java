package com.christiandev.springboot.app.comida.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.christiandev.springboot.app.comida.daos.IUsuarioDao;
import com.christiandev.springboot.app.comida.entities.Usuario;
import com.christiandev.springboot.app.comida.facades.IUsuarioService;

@Service
public class UsuarioServiceImpl implements IUsuarioService{

	@Autowired
	IUsuarioDao usuarioDao;
	
	@Override
	public Optional<Usuario> findById(Long id) {
		return usuarioDao.findById(id);
	}

	@Override
	public Usuario save(Usuario usuario) {
		return usuarioDao.save(usuario);
	}

}
