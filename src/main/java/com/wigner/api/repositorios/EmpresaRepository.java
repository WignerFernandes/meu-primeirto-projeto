package com.wigner.api.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wigner.api.entities.Empresa;

public interface EmpresaRepository extends JpaRepository<Empresa, Long> {
	
	Empresa findByCnpj(String cnpj);

}
