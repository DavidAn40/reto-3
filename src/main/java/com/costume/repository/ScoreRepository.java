/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.costume.repository;

import com.costume.model.Score;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author hugog
 */
public interface ScoreRepository extends CrudRepository<Score, Integer> {
    
}
