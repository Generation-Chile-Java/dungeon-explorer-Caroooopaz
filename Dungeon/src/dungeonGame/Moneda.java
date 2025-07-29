package dungeonGame;

public class Moneda implements ObjetoDelJuego {
    private int valor;

    public Moneda(int valor) {
        this.valor = valor;
    }

    @Override
    public void aplicarEfecto(Jugador jugador) {
        jugador.agregarMonedas(valor);
    }

    @Override
    public String obtenerNombre() {
        return "💰 Moneda de Oro Ancestral (" + valor + " oro)";
    }

    @Override
    public String obtenerDescripcion() {
        return "Una moneda que brilla con el poder de civilizaciones perdidas";
    }
}