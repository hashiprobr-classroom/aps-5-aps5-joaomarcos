package br.edu.insper.desagil.pi.freela;

public class DataHorario extends Momento {
    private int hora;
    private int minuto;
    private Data data;

    //Construtor
    public DataHorario(Data data) {
        this.hora = 0;
        this.minuto = 0;
        this.data = data;
    }
    //Metodos
    public void atualiza(int novaHora, int novoMinuto) {
        this.hora = (int) ajusta(0,23,novaHora);
        this.minuto = (int) ajusta(0,59,novoMinuto);
    }

    @Override
    public int minutos() {
        return data.minutos() + hora * 60 + minuto;
    }

    //Get e Set
    public int getHora() {
        return hora;
    }
    public int getMinuto() {
        return minuto;
    }
    public Data getData() {
        return data;
    }
    public void setData(Data data) {
        this.data = data;
    }
}
