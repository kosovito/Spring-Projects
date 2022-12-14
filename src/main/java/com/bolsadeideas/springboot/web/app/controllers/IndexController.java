package com.bolsadeideas.springboot.web.app.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bolsadeideas.springboot.web.app.models.Usuario;

@Controller
@RequestMapping("/app")
public class IndexController {
	
	

		@GetMapping({"/index", "/", "", "/home"})
		public String index(Model model) {
			model.addAttribute("titulo", "hola Spring Framework con Model!");
			return "index";
		}
		
		@RequestMapping("/perfil")
		public String perfil(Model model) {
			Usuario usuario = new Usuario();
			usuario.setNombre("Álvaro");
			usuario.setApellido("García");
			usuario.setEmail("alvaro@gmail.com");
			model.addAttribute("usuario", usuario);
			model.addAttribute("titulo", "Perfil del usuario: ".concat(usuario.getNombre()));
			return "perfil";
		}
		@RequestMapping("/listar")
		public String listar(Model model) {
			model.addAttribute("titulo", "Listado de usuarios");
			return "listar";
		}
		
		@ModelAttribute("usuarios")
		public List<Usuario> poblarUsuarios(){
			List<Usuario> usuarios = new ArrayList();
			usuarios.add(new Usuario("Álvaro", "García", "alvaro@gmail.com"));
			usuarios.add(new Usuario("John", "Doe", "john@gmail.com"));
			usuarios.add(new Usuario("Jane", "Doe", "jane@gmail.com"));
			usuarios.add(new Usuario("Paco", "Perez", "paco@gmail.com"));
			return usuarios;
		}
}
