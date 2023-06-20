package com.cooweb.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cooweb.dao.UsuarioDao;
import com.cooweb.entity.Usuario;

@RestController
public class UsuarioController {
	
	@Autowired
	UsuarioDao usuarioDao;
	
	@RequestMapping(value="api/usuario")
	public List<Usuario> getUsuario(){
		List<Usuario> user=usuarioDao.obtenerUsuarios();
		return user;
	}
	
	@RequestMapping(value="mensaje")
	public String mensaje() {
		return "Hola";
	}
	
	@RequestMapping(value="persona")
	public List<String> listarPersonas(){
		return List.of("Federico","Franco","José");
	}

	@RequestMapping(value="usuarios")
	public Usuario listarUsuarios(){
		Usuario usuario = new Usuario();
		usuario.setNombre("Federico");
		usuario.setApellido("Blanco");
		usuario.setEmail("federico.mbv@gmail.com");
		usuario.setPassword("1234567");
		usuario.setTelefono("2617000000");
		usuario.setId(1L);
		
		return usuario;
	}
	
	@RequestMapping(value="usuarios/{id}")
	public Usuario getUsuario(@PathVariable Long id){
		Usuario usuario = new Usuario();
		usuario.setNombre("Federico");
		usuario.setApellido("Blanco");
		usuario.setEmail("federico.mbv@gmail.com");
		usuario.setPassword("1234567");
		usuario.setTelefono("2617000000");
		usuario.setId(id);
		
		return usuario;
	}
	
	@RequestMapping(value="usuarios/lista_user")
	public List<Usuario> listar_variosUsuarios(){
		List<Usuario> usuario = new ArrayList<>();
		
		Usuario usuario1 = new Usuario();
		usuario1.setNombre("Federico");
		usuario1.setApellido("Blanco");
		usuario1.setEmail("federico.mbv@gmail.com");
		usuario1.setPassword("1234567");
		usuario1.setTelefono("2617000000");
		usuario1.setId(1L);
		
		Usuario usuario2 = new Usuario();
		usuario2.setNombre("Alfredo");
		usuario2.setApellido("Morán");
		usuario2.setEmail("alfredom@gmail.com");
		usuario2.setPassword("1234567");
		usuario2.setTelefono("2616000000");
		usuario2.setId(2L);
		
		Usuario usuario3 = new Usuario();
		usuario3.setNombre("Lucas");
		usuario3.setApellido("Martinez");
		usuario3.setEmail("lucasm@gmail.com");
		usuario3.setPassword("1234567");
		usuario3.setTelefono("2615000000");
		usuario3.setId(3L);
		
		usuario.add(usuario1);
		usuario.add(usuario2);
		usuario.add(usuario3);

		return usuario;
	}
}
