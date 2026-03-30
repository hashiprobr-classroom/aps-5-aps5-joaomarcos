package br.edu.insper.desagil.pi.freela;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class TarefaTest {
    private Tarefa t;


    @BeforeEach
    void setUp() {
        int id = 10;
        t = new Tarefa(id);
    }

    @Test
    void constroi() {
        assertEquals(10, t.getId());
        assertEquals("", t.getDescricao());
        assertNull(t.getIncio());
        assertNull(t.getFim());
    }

    @Test
    void mudaDescricao() {
        t.setDescricao("Momentâneo");
        assertEquals("Momentâneo", t.getDescricao());
    }

    @Test
    void momentosValidos() {
        Data d = new Data();

    }
}
