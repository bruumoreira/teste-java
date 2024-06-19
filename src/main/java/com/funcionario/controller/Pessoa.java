package com.funcionario.controller;

import java.time.LocalDate;

class Pessoa {
    private String nome;
    private LocalDate dataNascimento;

    public Pessoa(String nome, LocalDate dataNascimento) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
    }

    public String getNome() {
        return nome;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + ", Data Nascimento: " + dataNascimento.getDayOfMonth() + "/" + dataNascimento.getMonthValue() + "/" + dataNascimento.getYear();
    }
}