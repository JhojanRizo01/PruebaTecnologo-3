package com.example.demo.controllers;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.ComentarioModel;
import com.example.demo.services.ComentarioService;

@RestController
@RequestMapping("/comentario")
public class ComentarioController {
	@Autowired
    ComentarioService comentarioService;
	
	@GetMapping()
	public ArrayList<ComentarioModel> obtenerComentarios(){
		return comentarioService.obtenerComentarios();
	}
	
	@PostMapping()
	public String  guardarComentario(@RequestBody ComentarioModel comentario) {
		boolean okCom = this.comentarioService.guardarComentario(comentario);
		if(okCom) {
			return  "Se guardó comentario con id "+ comentario.getIdcomentario();
		}else {
			return "No pudo guardar comentario con id "+ comentario.getIdcomentario();
		}
	}
	
	@GetMapping(path = "/{idcomentario}")
	public Optional<ComentarioModel> obtenerComentarioPorId(@PathVariable("idcomentario")String idcomentario){
		return  this.comentarioService.obtenerPorId(idcomentario);
	} 
	
	@GetMapping("/query")
	public ArrayList<ComentarioModel> obtenerComentarioPorIdComentario(@RequestParam("idcomentario")String idcomentario){
		return this.comentarioService.obenerPorIdComentario(idcomentario);
	}
	
	@DeleteMapping(path = "/{idcomentario}")
	public String eliminarPorId(@PathVariable("idcomentario") String idcomentario) {
		boolean ok = this.comentarioService.eliminarcomentario(idcomentario);
		if(ok) {
			return  "Se eliminó comentario con id "+ idcomentario;
		}else {
			return "No pudo eliminar comentario con id "+ idcomentario;
		}
	}
}
