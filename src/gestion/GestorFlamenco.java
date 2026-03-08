package gestion;
import java.util.ArrayList;
import java.util.HashMap;

public class GestorFlamenco {
    private ArrayList<String> listaFrases;
    private HashMap<Integer, String> mapaFrases;
    private int idActual;

    public GestorFlamenco(){
        this.listaFrases = new ArrayList<>();
        this.mapaFrases = new HashMap<>();
        this.idActual = 1;
    }

    public void añadirFrase(String frase){
        listaFrases.add(frase);

        mapaFrases.put(idActual, frase);

        System.out.println("Frase añadidida a la memoria con el id " + idActual);

        idActual++;
    }

    public void mostrarFrasesConId(){
        System.out.println("\n--- Frases en Memoria (HashMap) ---");

        for (Integer id : mapaFrases.keySet()) {
            System.out.println("ID " + id + " -> " + mapaFrases.get(id));
        }
    }

    public void guardarAlFichero(FlamencoArchivo archivo){
        System.out.println("\nGuardando frases nuevas en el disco duro...");

        for (String frase : listaFrases) {
            archivo.escribirFrase(frase);
        }

        listaFrases.clear();
        System.out.println("Memoria volcada al fichero correctamente");
    }
}
