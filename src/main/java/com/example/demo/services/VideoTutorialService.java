package com.example.demo.services;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.models.VideoTutorialModel;
import com.example.demo.repositories.VideoTutorialRepository;

/*
 * Clase encargada de ejecutar la lógica de la aplicación
 * */

@Service
public class VideoTutorialService {
	@Autowired
	VideoTutorialRepository videoTutorialRepository;
	
	//Método para consultar todos los videos de la BD
	public ArrayList<VideoTutorialModel> obtenerVideos(){
		return (ArrayList<VideoTutorialModel>)videoTutorialRepository.findAll();
	}

	//Método para guardar un video en la BD
	public  VideoTutorialModel guardarVideo(VideoTutorialModel video) {
		return videoTutorialRepository.save(video);
	}
	
	//Método para 
	public Optional<VideoTutorialModel> obtenerPorId(Integer idvideotutorial){
		return videoTutorialRepository.findById(idvideotutorial);
	}
	
	public ArrayList<VideoTutorialModel> obenerPorIdVideo(Integer idvideotutorial){
		return  videoTutorialRepository.findByIdvideotutorial(idvideotutorial);
	}
	
	public boolean eliminarvideo(Integer idvideotutorial) {
		try {
			videoTutorialRepository.deleteById(idvideotutorial);
			return true;
		}catch(Exception err) {
			return false;
		}
	}
	
}
