import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

public class ListaDisco {
    private List<Disco> discos;

    public ListaDisco() {
        this.discos = new ArrayList<>();
    }

    public List<Disco> getDiscos() {
        return discos;
    }

    public void adicionarDisco(Disco disco) {
        discos.add(disco);
        System.out.println("Disco adicionado a lista : " + disco.titulo);
    }

    public void removerDisco(String titulo) {
        Iterator<Disco> iterator = discos.iterator();
        boolean removido = false;

        while (iterator.hasNext()) {
            Disco disco = iterator.next();

            if (disco.titulo.trim().equalsIgnoreCase(titulo.trim())) {
                iterator.remove();
                removido = true;
                System.out.println("Disco removido da lista: " + disco.titulo);
                break;
            }
        }

        if (!removido) {
            System.out.println("Disco não encontrado no lista.");
        }
    }

    public void exibirListaDisco() {
        if (discos.isEmpty()) {
            System.out.println("Lista vazia.");
        } else {
            System.out.println("Lista dos discos:");
            for (Disco disco : discos) {
                System.out.println(disco);
            }
        }
    }

}