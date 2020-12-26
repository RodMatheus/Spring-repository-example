package com.example.demo.mappers;

import org.springframework.stereotype.Component;

@Component
public class ExampleMapper {
	
	// Gerar DTO imutável para otimizar memória ou configurar o Mapstruct para transformar suas entidades em DTO
	/*public EnderecoDTO toResource(Endereco endereco) {
			return EnderecoDTO.builder()
					.id(endereco.getId())
					.orgaoPartidarioId(endereco.getOrgaoPartidarioId())
					.logradouro(endereco.getLogradouro())
					.complemento(endereco.getComplemento())
					.bairro(endereco.getBairro())
					.uf(endereco.getUf())
					.municipio(endereco.getMunicipio())
					.cep(endereco.getCep())
					.build();
		}*/
	}