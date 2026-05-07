package br.com.treinaweb.ediaristas.core.repositories;

import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;

import br.com.treinaweb.ediaristas.core.models.Servico;

public interface ServicoRepository extends JpaRepositoryImplementation<Servico, Long> {

}
