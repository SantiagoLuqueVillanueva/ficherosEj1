package gestion;
import java.io.*;

public class FlamencoArchivo {
    public void crearArchivo(){
        File archivo = new File("flamenco.txt");

        try {
            if (archivo.createNewFile()) {
                System.out.println("El archivo ha sido creado");
            } else {
                System.out.println("El arvhivo ya existe");
            }
        } catch (IOException e) {
            System.out.println("No se ha podidio crear el archivo");
        }
    }

    public void escribirFrase(String frase){
        try(
            FileWriter tuberia = new FileWriter("flamenco.txt", true);
            BufferedWriter camion = new BufferedWriter(tuberia);
        ){
            camion.write(frase);

            camion.newLine();

            System.out.println("Frase guardada con éxito " + frase);
        } catch (IOException e){
            System.out.println("Error: no se ha podidio escribir en el archivo.");
        }
    }

    public void leerArchivo(){
        try(
            FileReader tuberia = new FileReader("flamenco.txt");
            BufferedReader camion = new BufferedReader(tuberia);
        ) {
            String linea;
            System.out.println("\\n--- Contenido de flamenco.txt ---");

            while ((linea = camion.readLine()) != null) {
                System.out.println(linea);
            }
            System.out.println("---------------------------------");
        } catch (IOException e) {
            System.out.println("Error: no se ha podidio leer el archivo (¿seguro que existe?).");
        }
    }

    public void borrarArchivo(){
        File archivo = new File("flamenco.txt");

        if (archivo.delete()) {
            System.out.println("El archivo ha sido borrado correctamente");
        } else {
            System.out.println("No se ha podidio borrar el archivo (probablemente ya no exísta).");
        }
    }
}
