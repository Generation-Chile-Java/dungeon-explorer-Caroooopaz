package dungeonGame;

import java.util.Random;

public class SalaVacia implements Sala {
    private String[] eventos = {
            "🌫️ Una brisa misteriosa susurra secretos ancestrales...",
            "🕯️ Antorchas mágicas se encienden a tu paso, iluminando símbolos extraños...",
            "👻 Sombras danzan en las paredes, pero no representan peligro alguno...",
            "🔮 Un orbe cristalino flota en el centro, emanando una luz reconfortante...",
            "📿 Grabados antiguos cuentan la historia de héroes olvidados..."
    };

    @Override
    public void visitar(Jugador jugador) {
        Random random = new Random();
        String evento = eventos[random.nextInt(eventos.length)];

        System.out.println("🌙 Has entrado en una cámara serena y misteriosa...");
        System.out.println(evento);
        System.out.println("🧘‍♂️ Puedes descansar aquí con seguridad y planear tu próximo movimiento.");

        // Pequeña posibilidad de encontrar algo
        if (random.nextInt(4) == 0) { // 25% de probabilidad
            System.out.println("🔍 ¡Espera! Algo brilla en el suelo...");
            jugador.agregarMonedas(random.nextInt(8) + 2);
        }
    }

    @Override
    public String obtenerTitulo() {
        return "🏛️ CÁMARA DE MEDITACIÓN 🏛️";
    }

    @Override
    public String obtenerDescripcion() {
        return "🌫️ Una sala pacífica donde el tiempo parece detenerse... 🕊️";
    }
}