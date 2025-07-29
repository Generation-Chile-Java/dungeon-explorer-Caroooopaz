package dungeonGame;

public class SalaDelEnemigo implements Sala {
    private int danioDelEnemigo;
    private String tipoEnemigo;

    public SalaDelEnemigo(int danio, String tipo) {
        this.danioDelEnemigo = danio;
        this.tipoEnemigo = tipo;
    }

    @Override
    public void visitar(Jugador jugador) {
        System.out.println("⚔️🔥 ¡COMBATE ÉPICO! 🔥⚔️");
        System.out.println("👹 Un " + tipoEnemigo + " feroz emerge de las sombras con ojos ardientes!");
        System.out.println("🗡️ La batalla es inevitable... ¡Prepárate para luchar!");

        // Simular combate épico
        System.out.println("💥 ¡CLASH! Las armas chocan en un estruendo metálico...");
        try {
            Thread.sleep(1000); // Pausa dramática
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        // El jugador ataca primero
        System.out.println("⚡ ¡Tu espada encuentra su marca! El " + tipoEnemigo + " retrocede...");

        // Luego el enemigo contraataca
        jugador.recibirDanio(danioDelEnemigo);

        if (jugador.estaVivo()) {
            System.out.println("🏆 ¡VICTORIA GLORIOSA! Has derrotado al " + tipoEnemigo + "! 🎉");
            System.out.println("✨ El eco de tu triunfo resuena por los pasillos de la mazmorra...");
        } else {
            System.out.println("💀 El " + tipoEnemigo + " se alza triunfante sobre tu cuerpo inmóvil... ⚰️");
            System.out.println("🌫️ La oscuridad eternal te envuelve...");
        }
    }

    @Override
    public String obtenerTitulo() {
        return "🏛️ CÁMARA DE COMBATE 🏛️";
    }

    @Override
    public String obtenerDescripcion() {
        return "🌪️ Una sala donde el peligro acecha. Huesos blanqueados adornan el suelo... 💀";
    }
}
