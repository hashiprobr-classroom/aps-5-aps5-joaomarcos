package br.edu.insper.desagil.pi.freela;

public abstract class Momento {
    //Metodos
    public double ajusta(int min, int max, int valor) {
        if (valor > max) {
            return max;
        }
        if (valor < min) {
            return min;
        }
        else {
            return valor;
        }
    }

    public abstract int minutos();
}
