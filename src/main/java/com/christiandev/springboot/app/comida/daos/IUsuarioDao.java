package com.christiandev.springboot.app.comida.daos;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.christiandev.springboot.app.comida.entities.Usuario;

@Repository
public interface IUsuarioDao extends CrudRepository<Usuario, Long>{

}
