package com.IngresosEgresos.Web.repositories;
import com.IngresosEgresos.Web.entities.Empresa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EnterpriseRepository extends JpaRepository<Empresa, Long>{

}
