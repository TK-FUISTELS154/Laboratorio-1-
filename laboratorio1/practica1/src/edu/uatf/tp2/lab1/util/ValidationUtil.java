package edu.uatf.tp2.lab1.util;

/**
 * Clase de utilidades para validaciones.
 * Todos los métodos son estáticos.
 */
public class ValidationUtil {

    public static void requireNonBlank(String value, String fieldName) {
        if (value == null || value.isBlank()) {
            throw new IllegalArgumentException("El campo '" + fieldName + "' no puede estar vacío");
        }
    }

    public static void requirePositive(int value, String fieldName) {
        if (value <= 0) {
            throw new IllegalArgumentException("El campo '" + fieldName + "' debe ser mayor a 0");
        }
    }
}
