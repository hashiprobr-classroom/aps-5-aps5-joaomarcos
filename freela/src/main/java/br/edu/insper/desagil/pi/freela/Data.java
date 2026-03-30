package br.edu.insper.desagil.pi.freela;

import java.util.HashMap;
import java.util.Map;

public class Data extends Momento{
    private int ano;
    private int mes;
    private int dia;
    private Map<Integer, Integer> limite;

    //Construtor
    public Data() {
        this.ano = 1970;
        this.mes = 1;
        this.dia = 1;
        Map<Integer, Integer> limite = new HashMap<>();
        limite.put(1, 31);
        limite.put(2, 28);
        limite.put(3, 31);
        limite.put(4, 30);
        limite.put(5, 31);
        limite.put(6, 30);
        limite.put(7, 31);
        limite.put(8, 31);
        limite.put(9, 30);
        limite.put(10, 31);
        limite.put(11, 30);
        limite.put(12, 31);
        this.limite = limite;
    }

    //Metodos
    public void atualiza(int novoAno, int novoMes, int novoDia) {
        this.ano = (int) ajusta(1970, 2070, novoAno);
        this.mes = (int) ajusta(1,12,novoMes);
        this.dia = (int) ajusta(1, limite.get(mes), novoDia);
    }

    @Override
    public int minutos() {
        int dias = (ano - 1970) * 365;

        for (int i = 1; i < mes; i++) {
            dias += limite.get(i);
        }
        dias += dia - 1;

        return dias * 24 * 60;
    }

    //Get e Set
    public int getAno() {
        return ano;
    }
    public int getMes() {
        return mes;
    }
    public int getDia() {
        return dia;
    }
}
