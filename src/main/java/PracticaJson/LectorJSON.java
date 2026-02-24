package PracticaJson;

import org.json.JSONArray;
import org.json.JSONObject;
import java.nio.file.Files;
import java.nio.file.Paths;

public class LectorJSON {

    public static JSONArray cargarPersonajes(String rutaArchivo) throws Exception {
        // Lee todo el contenido del archivo como texto
        String contenido = new String(Files.readAllBytes(Paths.get(rutaArchivo)));
        // Convierte el texto en un JSONArray
        return new JSONArray(contenido);
    }
}
