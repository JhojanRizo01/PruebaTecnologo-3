package com.example.demo.repositories;

import java.util.ArrayList;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.models.ComentarioModel;

@Repository

public interface ComentarioRepository extends CrudRepository<ComentarioModel, String>{
    public abstract ArrayList<ComentarioModel> findByIdcomentario(String idcomentario);
}