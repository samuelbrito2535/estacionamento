package com.mballem.demo_park_api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository<Usuario> extends JpaRepository<Usuario, Long> {

}
