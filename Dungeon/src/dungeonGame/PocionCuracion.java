package dungeonGame;

public class PocionCuracion implements ObjetoDelJuego {
    private int cantidadCuracion;

    public PocionCuracion(int cantidadCuracion) {
        this.cantidadCuracion = cantidadCuracion;
    }

    @Override
    public void aplicarEfecto(Jugador jugador) {
        jugador.curar(cantidadCuracion);
    }

    @Override
    public String obtenerNombre() {
        return "🧪 Poción Curativa Mística (+" + cantidadCuracion + " vida)";
    }

    @Override
    public String obtenerDescripcion() {
        return "Un elixir burbujeante que restaura la vitalidad perdida";
    }
}
