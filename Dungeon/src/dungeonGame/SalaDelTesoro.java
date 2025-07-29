package dungeonGame;

import java.util.Random;

public class SalaDelTesoro implements Sala {
    private ObjetoDelJuego tesoro;
    private boolean yaExplorada;

    public SalaDelTesoro(ObjetoDelJuego tesoro) {
        this.tesoro = tesoro;
        this.yaExplorada = false;
    }

    @Override
    public void visitar(Jugador jugador) {
        if (yaExplorada) {
            System.out.println("🕳️ Esta cámara del tesoro ya ha sido saqueada... Solo quedan ecos del pasado. 👻");
            return;
        }

        System.out.println("💎✨ ¡CÁMARA DEL TESORO DESCUBIERTA! ✨💎");
        System.out.println("🌟 Rayos dorados de luz danzan desde un cofre ancestral...");
        System.out.println("🗝️ Con manos temblorosas, abres el cofre misterioso...");

        try {
            Thread.sleep(1500); // Suspense dramático
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        System.out.println("🎆 ¡EUREKA! Has descubierto: " + tesoro.obtenerNombre() + "! 🎆");
        System.out.println("📜 " + tesoro.obtenerDescripcion());

        jugador.recogerObjeto(tesoro);
        yaExplorada = true;

        // Posibilidad de tesoro adicional
        Random random = new Random();
        if (random.nextInt(3) == 0) { // 33% de probabilidad
            System.out.println("🔍 ¡Momento! Hay algo más escondido en el cofre...");
            jugador.agregarMonedas(random.nextInt(15) + 5);
        }
    }

    @Override
    public String obtenerTitulo() {
        return yaExplorada ? "🏛️ CÁMARA SAQUEADA 🏛️" : "🏛️ CÁMARA DEL TESORO 🏛️";
    }

    @Override
    public String obtenerDescripcion() {
        return yaExplorada ?
                "💨 Una sala vacía donde una vez brillaron tesoros legendarios..." :
                "✨ Destellos dorados filtran desde las grietas. Algo valioso te espera... 💰";
    }
}
