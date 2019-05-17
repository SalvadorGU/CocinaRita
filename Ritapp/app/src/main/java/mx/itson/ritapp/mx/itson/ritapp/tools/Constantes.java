package mx.itson.ritapp.mx.itson.ritapp.tools;


/**
 * Clase que contiene los códigos usados en "I Wish" para
 * mantener la integridad en las interacciones entre actividades
 * y fragmentos
 */
public class Constantes {
    /**
     * Transición Home -> Detalle
     */
    public static final int CODIGO_DETALLE = 100;

    /**
     * Transición Detalle -> Actualización
     */
    public static final int CODIGO_ACTUALIZACION = 101;
    /**
     * Puerto que utilizas para la conexión.
     * Dejalo en blanco si no has configurado esta carácteristica.
     */
    private static final String PUERTO_HOST = "localhost";
    /**
     * Dirección IP de genymotion o AVD
     */
    private static final String IP = "192.168.0.30";
    /**
     * URLs del Web Service
     */


    public static final String INSERT = "http://" + IP  + "Ritapp/controladores/Usuario/createUsuario.php";

    /**
     * Clave para el valor extra que representa al identificador de una meta
     */
    public static final String EXTRA_ID = "IDEXTRA";

}
