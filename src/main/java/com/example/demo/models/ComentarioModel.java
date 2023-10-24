package com.example.demo.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

/*
 * Clase con los atributos de la tabla comentario
 * */

@Entity
@Table(name= "comentario")
public class ComentarioModel {
	@Id
    private String idcomentario;
    private String descripcion;
    private String estudiante;
    private int fk_videotutorial;

 
    public String getIdcomentario() {
		return idcomentario;
	}
	public void setIdcomentario(String idcomentario) {
		this.idcomentario = idcomentario;
	}
	public String getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public String getEstudiante() {
        return estudiante;
    }
    public void setEstudiante(String estudiante) {
        this.estudiante = estudiante;
    }
	public int getFk_videotutorial() {
		return fk_videotutorial;
	}
	public void setFk_videotutorial(int fk_videotutorial) {
		this.fk_videotutorial = fk_videotutorial;
	}
  
    


}
