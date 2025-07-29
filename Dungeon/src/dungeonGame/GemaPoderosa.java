package dungeonGame;

public class GemaPoderosa implements ObjetoDelJuego {
    private String tipo;

    public GemaPoderosa(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public void aplicarEfecto(Jugador jugador) {
        switch (tipo) {
            case "rubi":
                jugador.mejorarAtaque(1);
                jugador.agregarMonedas(25);
                break;
            case "esmeralda":
                jugador.curar(2);
                jugador.agregarMonedas(30);
                break;
            case "zafiro":
                jugador.mejorarDefensa(1);
                jugador.agregarMonedas(20);
                break;
        }
    }

    @Override
    public String obtenerNombre() {
        String emoji = tipo.equals("rubi") ? "💎" : tipo.equals("esmeralda") ? "💚" : "💙";
        return emoji + " Gema " + tipo.substring(0,1).toUpperCase() + tipo.substring(1) + " Legendaria";
    }

    @Override
    public String obtenerDescripcion() {
        return "Una gema que pulsa con energía mágica y poder ancestral";
    }
}
