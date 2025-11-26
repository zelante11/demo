package com.example.demo;

import com.example.demo.entity.Carro;
import com.example.demo.repository.CarroRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class CarroRepositoryTest {

    @Autowired
    private CarroRepository repository;

    @Test
    void inserirCarro() {
        Carro c = new Carro();
        c.setMarca("Honda");
        c.setModelo("Civic");
        c.setAnoFabricacao(2022);
        c.setAnoModelo(2023);
        c.setValor(150000.0);

        repository.save(c);
    }
}