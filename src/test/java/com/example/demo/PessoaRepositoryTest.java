package com.example.demo;

import com.example.demo.entity.Pessoa;
import com.example.demo.repository.PessoaRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class PessoaRepositoryTest {

    @Autowired
    private PessoaRepository repository;

    @Test
    void inserirPessoa() {
        Pessoa p = new Pessoa();
        p.setNome("Gustavo");
        p.setCpf("12345678900");
        p.setAltura(1.75);
        p.setPeso(70.5);

        repository.save(p);
    }
}