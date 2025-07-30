package dungeonGame;

import java.util.Scanner;
import java.util.Random;

public class JuegoDungeon {
    private Jugador jugador;
    private Sala[][] mapaDungeon;
    private boolean[][] salasExploradas;
    private int salaActualX;
    private int salaActualY;
    private final int MAX_ROWS = 4;
    private final int MAX_COLS = 4;
    private int contadorSalasExploradas;
    private Scanner teclado;
    private Random random;

    public JuegoDungeon() {
        teclado = new Scanner(System.in);
        random = new Random();
        mostrarIntroduccion();
        configurarJugador();
        generarMazmorra();

        salaActualX = 0;
        salaActualY = 0;
        contadorSalasExploradas = 0;
        salasExploradas = new boolean[MAX_ROWS][MAX_COLS];
    }

    private void mostrarIntroduccion() {
        System.out.println("🏰═══════════════════════════════════════════════════════════════🏰");
        System.out.println("🌟                 ¡BIENVENIDO A LA MAZMORRA LEGENDARIA!                🌟");
        System.out.println("🏰═══════════════════════════════════════════════════════════════🏰");
        System.out.println();
        System.out.println("📜 CÓMO JUGAR:");
        System.out.println("🗡️  • Explora una mazmorra de 4x4 llena de peligros y tesoros");
        System.out.println("⚔️  • Lucha contra enemigos feroces y encuentra tesoros legendarios");
        System.out.println("🧭  • Muévete usando: 'arriba', 'abajo', 'izquierda', 'derecha'");
        System.out.println("💰  • Recolecta monedas, armas mágicas y pociones curativas");
        System.out.println("🎯  • OBJETIVO: ¡Sobrevive y explora toda la mazmorra!");
        System.out.println("⚠️   • ¡Cuidado! Cada sala puede ser tu última...");
        System.out.println();
        System.out.println("🌟 ¡Prepárate para la aventura de tu vida! 🌟");
        System.out.println("🏰═══════════════════════════════════════════════════════════════🏰");
        System.out.println();
    }

    private void configurarJugador() {
        System.out.print("🧙‍♂️ Antes de adentrarte en la oscuridad, dime... ¿Cuál es tu nombre, valiente aventurero? ");
        String nombreJugador = teclado.nextLine();

        if (nombreJugador.trim().isEmpty()) {
            nombreJugador = "Héroe Anónimo";
        }

        this.jugador = new Jugador(nombreJugador, 8); // Más vida para mayor diversión
    }

    private void generarMazmorra() {
        mapaDungeon = new Sala[MAX_ROWS][MAX_COLS];

        // Generar salas aleatorias pero balanceadas
        String[] tiposEnemigo = {"Goblin Sanguinario", "Esqueleto Guerrero", "Orco Feroz", "Sombra Maldita"};

        for (int i = 0; i < MAX_ROWS; i++) {
            for (int j = 0; j < MAX_COLS; j++) {
                int tipo = random.nextInt(10);

                if (tipo < 3) { // 30% salas vacías
                    mapaDungeon[i][j] = new SalaVacia();
                } else if (tipo < 6) { // 30% salas de enemigos
                    String enemigo = tiposEnemigo[random.nextInt(tiposEnemigo.length)];
                    mapaDungeon[i][j] = new SalaDelEnemigo(random.nextInt(3) + 1, enemigo);
                } else { // 40% salas de tesoro
                    mapaDungeon[i][j] = generarSalaTesoro();
                }
            }
        }

        // Asegurar que la primera sala sea segura
        mapaDungeon[0][0] = new SalaVacia();
    }

    private SalaDelTesoro generarSalaTesoro() {
        int tipoTesoro = random.nextInt(10);

        if (tipoTesoro < 3) {
            return new SalaDelTesoro(new Moneda(random.nextInt(50) + 25));
        } else if (tipoTesoro < 5) {
            return new SalaDelTesoro(new PocionCuracion(random.nextInt(3) + 2));
        } else if (tipoTesoro < 7) {
            return new SalaDelTesoro(new EspadaMagica(random.nextInt(2) + 1));
        } else if (tipoTesoro < 9) {
            return new SalaDelTesoro(new ArmaduraMagica(random.nextInt(2) + 1));
        } else {
            String[] gemas = {"rubi", "esmeralda", "zafiro"};
            return new SalaDelTesoro(new GemaPoderosa(gemas[random.nextInt(gemas.length)]));
        }
    }

    public void comenzarJuego() {
        System.out.println("🚀🌟 ¡LA AVENTURA ÉPICA DE " + jugador.obtenerNombre().toUpperCase() + " COMIENZA! 🌟🚀");
        System.out.println("🗝️ Las puertas de la mazmorra se abren con un crujido ominoso...");
        System.out.println();

        while (jugador.estaVivo() && contadorSalasExploradas < (MAX_ROWS * MAX_COLS)) {
            Sala salaActual = mapaDungeon[salaActualX][salaActualY];

            if (!salasExploradas[salaActualX][salaActualY]) {
                contadorSalasExploradas++;
                salasExploradas[salaActualX][salaActualY] = true;
            }

            System.out.println("📍═════════════════════════════════════════");
            System.out.println(salaActual.obtenerTitulo());
            System.out.println("🗺️ Ubicación: Sector (" + salaActualX + ", " + salaActualY + ")");
            System.out.println("📋 " + salaActual.obtenerDescripcion());
            System.out.println("📍═════════════════════════════════════════");

            salaActual.visitar(jugador);
            jugador.mostrarEstado();
            mostrarProgreso();

            if (!jugador.estaVivo()) {
                mostrarGameOver();
                break;
            }

            if (contadorSalasExploradas >= (MAX_ROWS * MAX_COLS)) {
                mostrarVictoria();
                break;
            }

            manejarMovimiento();
        }

        teclado.close();
        System.out.println("\n🏁🌟 ¡GRACIAS POR JUGAR LA MAZMORRA LEGENDARIA! 🌟🏁");
    }

    private void mostrarProgreso() {
        int totalSalas = MAX_ROWS * MAX_COLS;
        int porcentaje = (contadorSalasExploradas * 100) / totalSalas;

        System.out.println("🗺️ PROGRESO DE EXPLORACIÓN: " + contadorSalasExploradas + "/" + totalSalas + " salas (" + porcentaje + "%)");

        System.out.print("📊 [");
        int barras = porcentaje / 10;
        for (int i = 0; i < 10; i++) {
            if (i < barras) {
                System.out.print("█");
            } else {
                System.out.print("░");
            }
        }
        System.out.println("] " + porcentaje + "%");
        System.out.println();
    }

    private void manejarMovimiento() {
        System.out.println("🧭 ¿Hacia dónde deseas aventurarte?");
        System.out.println("   ⬆️  'arriba'/'u'   ⬇️  'abajo'/'d'   ⬅️  'izquierda'/'l'  ➡️  'derecha'/'r'");
        System.out.print("   🚪 Escribe tu elección (o 'q' para abandonar la mazmorra): ");

        String input = teclado.nextLine().toLowerCase().trim();

        if (input.equals("q") || input.equals("salir")) {
            System.out.println("🏃‍♂️💨 Has abandonado la mazmorra cobardemente...");
            System.out.println("👻 Los espíritus de la mazmorra susurran tu nombre con desdén...");
            return;
        }

        moverJugador(input);
    }

    private void moverJugador(String direction) {
        int nuevoX = salaActualX;
        int nuevoY = salaActualY;

        switch (direction) {
            case "arriba":
            case "up":
            case "u":
                nuevoX--;
                break;
            case "abajo":
            case "down":
            case "d":
                nuevoX++;
                break;
            case "izquierda":
            case "left":
            case "l":
                nuevoY--;
                break;
            case "derecha":
            case "right":
            case "r":
                nuevoY++;
                break;
            default:
                System.out.println("❌ Comando desconocido. Usa: 'arriba' o 'u', 'abajo' o 'd', 'izquierda'o 'l', 'derecha' o 'r' 🧭");
                return;
        }

        if (nuevoX >= 0 && nuevoX < MAX_ROWS && nuevoY >= 0 && nuevoY < MAX_COLS) {
            salaActualX = nuevoX;
            salaActualY = nuevoY;
            System.out.println("🚶‍♂️✨ Te aventuras hacia la nueva cámara... Los ecos de tus pasos resuenan en la oscuridad. 📍");
            System.out.println();
        } else {
            System.out.println("🧱💥 ¡Un muro de piedra ancestral bloquea tu camino! No puedes avanzar más en esa dirección. 🚧");
            System.out.println();
        }
    }

    private void mostrarGameOver() {
        System.out.println();
        System.out.println("💀☠️💀☠️💀☠️💀☠️💀☠️💀☠️💀☠️💀☠️💀");
        System.out.println("               ⚰️ GAME OVER ⚰️");
        System.out.println("💀☠️💀☠️💀☠️💀☠️💀☠️💀☠️💀☠️💀☠️💀");
        System.out.println();
        System.out.println("🌫️ " + jugador.obtenerNombre() + ", tu historia llega a su fin en las profundidades...");
        System.out.println("👻 Pero las leyendas hablan de héroes que pueden regresar de la muerte...");
        System.out.println("🔄 ¿Te atreverías a intentarlo de nuevo?");
        System.out.println();
    }

    private void mostrarVictoria() {
        System.out.println();
        System.out.println("🎉🏆🎉🏆🎉🏆🎉🏆🎉🏆🎉🏆🎉🏆🎉");
        System.out.println("           👑 ¡VICTORIA ÉPICA! 👑");
        System.out.println("🎉🏆🎉🏆🎉🏆🎉🏆🎉🏆🎉🏆🎉🏆🎉");
        System.out.println();
        System.out.println("🌟 ¡FELICIDADES, " + jugador.obtenerNombre().toUpperCase() + "! 🌟");
        System.out.println("🏰 Has conquistado completamente la Mazmorra Legendaria!");
        System.out.println("📜 Tu nombre será recordado por generaciones de aventureros!");
        System.out.println("💎 Has demostrado ser un verdadero MAESTRO DE MAZMORRAS!");
        System.out.println();
        System.out.println("🎯 ESTADÍSTICAS FINALES:");
        System.out.println("🗺️ Salas exploradas: " + contadorSalasExploradas + "/" + (MAX_ROWS * MAX_COLS));
        System.out.println("❤️ Vida restante: " + jugador.obtenerNombre() + " sobrevivió con honor!");
        System.out.println();
    }

    public static void main(String[] args) {
        System.out.println("🌟 Iniciando el sistema de la mazmorra... 🌟");
        JuegoDungeon juego = new JuegoDungeon();
        juego.comenzarJuego();
    }
}