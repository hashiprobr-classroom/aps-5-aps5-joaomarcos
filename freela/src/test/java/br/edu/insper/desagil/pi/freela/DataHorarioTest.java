package br.edu.insper.desagil.pi.freela;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DataHorarioTest {
    private DataHorario dh;

    @BeforeEach
    void setUp() {
        Data d = new Data();
        d.atualiza(1970, 1,1);
        dh = new DataHorario(d);
        dh.atualiza(0,0);
    }

    @Test
    void constroi() {
        assertEquals(0,dh.getHora());
        assertEquals(0,dh.getMinuto());
        assertEquals(0,dh.minutos());
    }

    @Test
    void horarioBaixo() {
        dh.atualiza(-1,-1);
        assertEquals(0,dh.getHora());
        assertEquals(0,dh.getMinuto());
        assertEquals(0,dh.minutos());
    }

    @Test
    void horarioAlto() {
        dh.atualiza(24,60);
        assertEquals(23,dh.getHora());
        assertEquals(59,dh.getMinuto());
        assertEquals(1439,dh.minutos());
    }
}
