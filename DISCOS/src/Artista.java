import java.util.List;
import java.util.ArrayList;

public class Artista {
    protected String nome;
    protected String generoMusical;
    protected List<Disco> discos;


    public Artista(){
        this.discos = new ArrayList<>();
    }

    public Artista(String nome, String generoMusical) {
        this.nome = nome;
        this.generoMusical = generoMusical;
        this.discos = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }



    public String getGeneroMusical() {
        return generoMusical;
    }

    public void adicionarDisco(Disco disco) {
        discos.add(disco);
    }

    public List<Disco> getDiscos() {
        return discos;
    }

    public String toString() {
        String discosAssociados = "";
        for (Disco disco : discos) {
            discosAssociados += "\n" + disco.getTitulo();
        }
        return "Nome do Artista: " + nome
                + "\nGenero Musical do Artista: " + generoMusical
                + "\nDiscos Associados: " + discosAssociados;
    }
}

