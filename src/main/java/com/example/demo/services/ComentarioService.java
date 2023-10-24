package com.example.demo.services;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.models.ComentarioModel;
import com.example.demo.repositories.ComentarioRepository;



@Service

public class ComentarioService {
	@Autowired
	ComentarioRepository comentarioRepository;
	
	//Método para consultar todos los comentarios de la BD
	public ArrayList<ComentarioModel> obtenerComentarios(){
		return (ArrayList<ComentarioModel>)comentarioRepository.findAll();
	}

	/*//Método para guardar un comentario en la BD
	public  ComentarioModel guardarComentario(ComentarioModel comentario) {
		return comentarioRepository.save(comentario);
	}*/
	
	public  boolean guardarComentario(ComentarioModel comentario) {
		try {
			comentarioRepository.save(comentario);
			return true;
		}catch(Exception err){
			return false;
		}
		
	}
	
	//Método para 
	public Optional<ComentarioModel> obtenerPorId(String idcomentario){
		return comentarioRepository.findById(idcomentario);
	}
	
	public ArrayList<ComentarioModel> obenerPorIdComentario(String idcomentario){
		return  comentarioRepository.findByIdcomentario(idcomentario);
	}
	
	public boolean eliminarcomentario(String idcomentario) {
		try {
			comentarioRepository.deleteById(idcomentario);
			return true;
		}catch(Exception err) {
			return false;
		}
	}
}
