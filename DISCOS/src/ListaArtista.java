import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

public class ListaArtista {
    private List<Artista> artistas;

    public ListaArtista() {
        this.artistas = new ArrayList<>();
    }

    public List<Artista> getArtistas() {
        return artistas;
    }

    public void adicionarArtista(Artista artista) {
        artistas.add(artista);
        System.out.println("Artista adicionado a lista : " + artista.nome);
    }

    public void removerArtista(String nome) {
        Iterator<Artista> iterator = artistas.iterator();
        boolean removido = false;

        while (iterator.hasNext()) {
            Artista artista = iterator.next();

            if (artista.nome.trim().equalsIgnoreCase(nome.trim())) {
                iterator.remove();
                removido = true;
                System.out.println("Artista removido da lista: " + artista.nome);
                break;
            }
        }

        if (!removido) {
            System.out.println("Artista não encontrado no lista.");
        }
    }

    public void exibirListaArtista() {
        if (artistas.isEmpty()) {
            System.out.println("Lista vazia.");
        } else {
            System.out.println("Lista dos artistas:");
            for (Artista artista : artistas) {
                System.out.println(artista);
            }
        }
    }

}