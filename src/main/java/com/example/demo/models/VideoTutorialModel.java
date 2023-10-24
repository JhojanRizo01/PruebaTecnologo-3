package com.example.demo.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
/*
 * Clase con los atributos de la tabla videotutorial
 * */

@Entity
@Table(name = "videotutorial")
public class VideoTutorialModel {
	@Id
    private  int idvideotutorial;
    private String descripcion;
    private String titulo;
    private String fecha;

   
    
    public int getIdvideotutorial() {
		return idvideotutorial;
	}
	public void setIdvideotutorial(int idvideotutorial) {
		this.idvideotutorial = idvideotutorial;
	}
	public String getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getFecha() {
        return fecha;
    }
    public void setFecha(String fecha) {
        this.fecha = fecha;
    } 


}
