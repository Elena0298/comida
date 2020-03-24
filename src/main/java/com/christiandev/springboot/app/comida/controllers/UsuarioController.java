package com.christiandev.springboot.app.comida.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.christiandev.springboot.app.comida.entities.Usuario;
import com.christiandev.springboot.app.comida.facades.IUsuarioService;

@RestController
public class UsuarioController {
	
	@Autowired
	IUsuarioService usuarioService;
	
	@GetMapping("getUsuarioPorId/{id}")
	public Usuario getUsuarioPorId(@PathVariable("id") Long id) {
		Usuario usuario = usuarioService.findById(id).orElse(new Usuario());
		return usuario;
	}
	
	
	@PostMapping("crearUsuario")
	public Usuario crearUsuario(@RequestBody Usuario usuario) {
		Usuario usuarioCreado = usuarioService.save(usuario);
		return usuarioCreado;
	}
}
