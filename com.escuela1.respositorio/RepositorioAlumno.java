package com.escuela1.repositorio;


	import java.util.List;
	import org.springframework.data.jpa.repository.JpaRepository;
	import org.springframework.data.repository.query.Param;
	import org.springframework.stereotype.Repository;
	import com.escuela1.modelo.Alumno;
	@Repository

	public interface RepositorioAlumno extends JpaRepository<Alumno, Long>{
			
	List<Alumno> findByNombre(@Param("nombre") String name);
			
		


}
