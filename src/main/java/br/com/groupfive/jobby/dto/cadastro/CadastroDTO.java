package br.com.groupfive.jobby.dto.cadastro;

import br.com.groupfive.jobby.model.Cadastro;

import java.time.LocalDate;
import java.time.ZoneId;

public record CadastroDTO(
        Integer id,
        String nome,
        String cpf,
        String sexo,
        LocalDate dataNascimento,
        Long telefone,
        String email,
        Long numeroCelularProfissional,
        Boolean isWhatsProfissional,
        Long numeroCelularPessoal,
        Boolean isWhatsPessoal,
        Double pretensaoMin,
        Double pretensaoMax
) {
    public static CadastroDTO fromModel(Cadastro cadastro) {
        return new CadastroDTO(
            cadastro.getIdCadastro(),
            cadastro.getNome(),
            cadastro.getCpf(),
            cadastro.getSexo().name(),
            cadastro.getDataNascimento()
                .toInstant()
                .atZone(ZoneId.systemDefault())
                .toLocalDate(),
            cadastro.getTelefone(),
            cadastro.getEmail(),
            cadastro.getCelularProfissional().getNumero(),
            cadastro.getCelularProfissional().isWhatsapp(),
            cadastro.getCelularPessoal().getNumero(),
            cadastro.getCelularPessoal().isWhatsapp(),
            cadastro.getPretencaoSalarial().getValorMinimo(),
            cadastro.getPretencaoSalarial().getValorMaximo()
        );
    }
}