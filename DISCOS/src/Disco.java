public class Disco {
     String titulo;
     double anoLancamento;
     double listaFaixas;

    public Disco(){
    };

    public Disco(String titulo, double anoLancamento, double listaFaixas) {
        this.titulo = titulo;
        this.anoLancamento = anoLancamento;
        this.listaFaixas = listaFaixas;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setListaFaixas(double listaFaixas) {
        this.listaFaixas = listaFaixas;
    }

    public void setAnoLancamento(double anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    public String getTitulo() {
        return titulo;
    }


    public String toString() {
        return "Título: " + titulo
                + "\nData de Lançamento: " + anoLancamento
                + "\nLista de Faixas:" + listaFaixas;

    }

}





