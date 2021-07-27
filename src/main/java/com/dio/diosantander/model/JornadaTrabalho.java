package com.dio.diosantander.model;

import lombok.*;
import org.hibernate.envers.Audited;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Getter //Anotação Lombok para geração automatica dos metodos Get
@Setter //Anotação Lombok para geração automatica dos metodos Set
@AllArgsConstructor //Anotação Lombok para geração automatica do construtor com todos os argumentos
@NoArgsConstructor //Anotação Lombok para geração automatica do construtor sem nenhum argumento
@EqualsAndHashCode //Anotação Lombok para geração automatica dos metodos Equals e HashCode
@Builder
@Entity
@Audited
public class JornadaTrabalho {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String descricao;
}
