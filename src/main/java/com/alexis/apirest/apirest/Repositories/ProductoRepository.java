package com.alexis.apirest.apirest.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.alexis.apirest.apirest.Entities.Producto;

public interface ProductoRepository extends JpaRepository<Producto,Long>{

}
