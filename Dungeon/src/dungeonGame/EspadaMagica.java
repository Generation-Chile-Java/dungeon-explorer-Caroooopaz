package dungeonGame;

public class EspadaMagica implements ObjetoDelJuego {
    private int bonusAtaque;

    public EspadaMagica(int bonusAtaque) {
        this.bonusAtaque = bonusAtaque;
    }

    @Override
    public void aplicarEfecto(Jugador jugador) {
        jugador.mejorarAtaque(bonusAtaque);
    }

    @Override
    public String obtenerNombre() {
        return "⚔️ Espada Encantada (+" + bonusAtaque + " ataque)";
    }

    @Override
    public String obtenerDescripcion() {
        return "Una hoja forjada con magia ancestral que corta como el viento";
    }
}