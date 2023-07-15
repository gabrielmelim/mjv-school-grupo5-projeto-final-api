package br.com.groupfive.jobby.controller.interfaces;

import br.com.groupfive.jobby.dto.profissao.CreateProfissaoDTO;
import br.com.groupfive.jobby.dto.profissao.ProfissaoDTO;
import br.com.groupfive.jobby.dto.profissao.UpdateProfissaoDTO;
import org.springframework.http.ResponseEntity;

public interface IProfissaoController<T> {
    ResponseEntity<ProfissaoDTO> findById(T id);
    ResponseEntity<ProfissaoDTO> create(CreateProfissaoDTO createProfissaoDTO);
    ResponseEntity update(UpdateProfissaoDTO updateProfissaoDTO, T id);
    ResponseEntity deleteById(T id);
}
