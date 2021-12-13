/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cuatroa.retodos.repository.crud;


import com.cuatroa.retodos.model.Laptop;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;
import java.util.Optional;

public interface LaptopCrudRepository extends MongoRepository<Laptop, Integer> {
    //Para seleccionar el producto con id maximo // Para que en el front el id se cree solo
    Optional<Laptop> findTopByOrderByIdDesc();
    public List<Laptop> findByPriceLessThanEqual(double precio);
}
