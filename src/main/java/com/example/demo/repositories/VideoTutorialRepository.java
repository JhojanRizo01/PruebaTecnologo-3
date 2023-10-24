package com.example.demo.repositories;

import java.util.ArrayList;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.models.VideoTutorialModel;

/*
 * Clase encargada de hacer las conexiones con la base de datos
 * */

@Repository

public interface VideoTutorialRepository extends CrudRepository<VideoTutorialModel, Integer>{
    public abstract ArrayList<VideoTutorialModel> findByIdvideotutorial(Integer idvideotutorial);
}
