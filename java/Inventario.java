import java.util.ArrayList;

public class Inventario {

    public static void main(String[] args) {

        
        ArrayList<String> inventario = new ArrayList<>();
        inventario.add("Espada de hierro");
        inventario.add("Pocion de vida");
        inventario.add("Escudo de madera");
        inventario.add("Llave dorada");

        System.out.println("=== INVENTARIO ===");
        for (int i = 0; i < inventario.size(); i++) {
            System.out.println((i + 1) + ". " + inventario.get(i));
        }

        
        for (String item : inventario) {
            System.out.println("- " + item);
        }

    
        int vidaHero = 80;
        int vidaEnemigo = 60;
        int ronda = 1;

        while (vidaHero > 0 && vidaEnemigo > 0) {
            
            int danoHeroe = 15;
            vidaEnemigo -= danoHeroe;

             
            int danoEnemigo = 10;
            vidaHero -= danoEnemigo;

            System.out.println("Ronda " + ronda + ": Hero=" + vidaHero + " | Enemigo=" + vidaEnemigo);
            ronda++;
        }
        System.out.println(vidaHero > 0 ? "VICTORIA!" : "DERROTA");

        
        int xp = 0;
        int nivel = 1;
        int xpNecesario = 100;
        int[] batallas = {20, 35, 15, 40, 30};

        for (int xpGanado : batallas) {
            xp += xpGanado;

            if (xp >= xpNecesario) {
                nivel++;
                xp -= xpNecesario;
                System.out.println("Nivel " + nivel);
            }
        }
    }
}