package edu.cibertec.edu.pe.DAWII_CL2_CasasVictor.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import edu.cibertec.edu.pe.DAWII_CL2_CasasVictor.model.bd.Rol;

@Repository
public interface RolRepository extends JpaRepository<Rol, Integer> {

    Rol findByNomrol(String nombrerol);
}
