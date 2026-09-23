package atividade.model;

public class Certificado {
    Participante participante; // Referência ao participante que recebeu o certificado
    Evento evento;  // Referência ao evento para o qual o certificado foi emitido
    String cargaHoraria;
    String dataEmissao;
    String codigoValidacao;
}
