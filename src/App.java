import gestion.*;

public class App {
    public static void main(String[] args) {
        // 1. Instanciamos nuestras dos clases
        FlamencoArchivo miArchivo = new FlamencoArchivo();
        GestorFlamenco miGestor = new GestorFlamenco();

        // 2. Creamos el archivo físico si no existe
        miArchivo.crearArchivo();

        // 3. Añadimos frases a la MEMORIA (ArrayList y HashMap)
        miGestor.añadirFrase("El cante jondo es el llanto de la guitarra.");
        miGestor.añadirFrase("Camarón que se duerme, se lo lleva la corriente.");
        miGestor.añadirFrase("El flamenco no se canta, se llora.");

        // 4. Mostramos las frases desde el HashMap para ver sus IDs
        miGestor.mostrarFrasesConId();

        // 5. Ahora sí, bajamos las frases de la memoria al FICHERO
        miGestor.guardarAlFichero(miArchivo);

        // 6. Leemos el archivo para comprobar que se ha escrito de verdad
        miArchivo.leerArchivo();
    }
}
