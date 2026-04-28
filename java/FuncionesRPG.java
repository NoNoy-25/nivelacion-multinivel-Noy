public class SistemaNivel {

    public static int subirNivel(int xpActual, int xpNecesario, int nivelActual) {
        // Lógica: Verificar si la XP actual alcanza o supera el requisito
        if (xpActual >= xpNecesario) {
            nivelActual++; // Incrementa nivel en 1
            // Nota: El ejercicio pide reiniciar XP a 0
            System.out.println("¡Felicidades! Has alcanzado el nivel " + nivelActual);
            return nivelActual;
        } else {
            // Si no sube, retorna el nivel actual sin cambios
            return nivelActual;
        }
    }

    public static void main(String[] args) {
        // Prueba 1: Sube de nivel
        int nivel1 = subirNivel(110, 100, 3);
        System.out.println("Resultado Prueba 1: " + nivel1); // Retorna 4

        // Prueba 2: No sube
        int nivel2 = subirNivel(80, 100, 3);
        System.out.println("Resultado Prueba 2: " + nivel2); // Retorna 3
    }
}