public class LogicaCombate {

    public static void main(String[] args) {
        // JUGADOR
        double vidaJugador = 25.0;
        double vidaMax = 100.0;
        double pct = (vidaJugador / vidaMax) * 100;
        String estado;

        if (pct <= 0) estado = "MUERTO";
        else if (pct <= 25) estado = "CRITICO";
        else if (pct <= 50) estado = "HERIDO";
        else if (pct <= 75) estado = "ESTABLE";
        else estado = "SALUDABLE";

        System.out.println("JUGADOR ");
        System.out.println("Vida: " + vidaJugador + " (" + pct + "%)");
        System.out.println("Estado: " + estado);

        // COMBATE
        int vidaEnemigo = 40;
        int ataqueBase = 35;
        int nivelJugador = 6;
        int bonificacion = (nivelJugador >= 5) ? 10 : 0; 

        int danoTotal = ataqueBase + bonificacion;
        int vidaRestanteEnemigo = vidaEnemigo - danoTotal;

       
        System.out.println("Ataque base: " + ataqueBase + " + Bono: " + bonificacion);
        System.out.println("Daño total infligido: " + danoTotal);

        if (vidaRestanteEnemigo <= 0) {
            System.out.println("Enemigo derrotado +50 XP");
        } else if (vidaRestanteEnemigo <= 20) {
            System.out.println("Enemigo en estado crítico (Vida: " + vidaRestanteEnemigo + ")");
        } else {
            System.out.println("Enemigo resiste. Vida restante: " + vidaRestanteEnemigo);
        }
    }
}