package dungeonGame;

public class ArmaduraMagica implements ObjetoDelJuego {
    private int bonusDefensa;

    public ArmaduraMagica(int bonusDefensa) {
        this.bonusDefensa = bonusDefensa;
    }

    @Override
    public void aplicarEfecto(Jugador jugador) {
        jugador.mejorarDefensa(bonusDefensa);
    }

    @Override
    public String obtenerNombre() {
        return "🛡️ Armadura Encantada (+" + bonusDefensa + " defensa)";
    }

    @Override
    public String obtenerDescripcion() {
        return "Una armadura imbuida con protecciones mágicas";
    }
}