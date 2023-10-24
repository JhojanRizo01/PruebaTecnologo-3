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

import com.example.demo.models.VideoTutorialModel;
import com.example.demo.services.VideoTutorialService;

/*
 * Clase que recibe la petición Web
 * */

@RestController
@RequestMapping("/videoTutorial")
public class VideoTutorialController {
	@Autowired
	VideoTutorialService videoTutorialService;
	

	@GetMapping()
	public ArrayList<VideoTutorialModel> obtenerVideos(){
		return videoTutorialService.obtenerVideos();
	}
	
	@PostMapping()
	public VideoTutorialModel guardarVideo(@RequestBody VideoTutorialModel video) {
		return this.videoTutorialService.guardarVideo(video);
	}
	
	@GetMapping(path = "/{idvideotutorial}")
	public Optional<VideoTutorialModel> obtenerVideoPorId(@PathVariable("idvideotutorial")Integer idvideotutorial){
		return  this.videoTutorialService.obtenerPorId(idvideotutorial);
	} 
	
	@GetMapping("/query")
	public ArrayList<VideoTutorialModel> obtenerVideoPorIdVideo(@RequestParam("idvideotutorial")Integer idvideotutorial){
		return this.videoTutorialService.obenerPorIdVideo(idvideotutorial);
	}
	
	@DeleteMapping(path = "/{idvideotutorial}")
	public String eliminarPorId(@PathVariable("idvideotutorial") Integer idvideotutorial) {
		boolean ok = this.videoTutorialService.eliminarvideo(idvideotutorial);
		if(ok) {
			return  "Se eleimino video con id "+ idvideotutorial;
		}else {
			return "No pudo eliminar video con id "+ idvideotutorial;
		}
	}
}
