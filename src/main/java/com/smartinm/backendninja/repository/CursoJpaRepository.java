package com.smartinm.backendninja.repository;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.smartinm.backendninja.entity.Curso;

@Repository("cursoJpaRepository")
public interface CursoJpaRepository extends JpaRepository<Curso, Serializable> {
	
	public abstract Curso findById(int id);
	public abstract List<Curso> findAll();
	public abstract List<Curso> findByIdAndPrecio(int id, int precio);
	public abstract List<Curso> findByNombreOrPrecio(String nombre,int precio);

}
