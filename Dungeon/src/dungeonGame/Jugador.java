package dungeonGame;

import java.util.ArrayList;

public class Jugador {

    // ATRIBUTOS (COSAS QUE EL JUGADOR TIENE)
    private String nombre;
    private int vidas;
    private int monedas;
    private int ataque;
    private int defensa;
    private ArrayList<ObjetoDelJuego> inventario;

    // CONSTRUCTOR
    public Jugador(String nombre, int vidasIniciales) {
        this.nombre = nombre;
        this.vidas = vidasIniciales;
        this.monedas = 0;
        this.ataque = 2; // Ataque base
        this.defensa = 1; // Defensa base
        this.inventario = new ArrayList<>();
        System.out.println("🚪✨ " + nombre + " el Valiente ha cruzado el umbral de la mazmorra ancestral con " + vidasIniciales + " corazones de vida! ⚡💫");
        System.out.println("🗡️ Tu espada brilla con " + ataque + " puntos de ataque y tu armadura te otorga " + defensa + " puntos de defensa! 🛡️");
    }

    // MÉTODOS
    public void recibirDanio(int cantidad) {
        int danioReal = Math.max(1, cantidad - this.defensa); // La defensa reduce el daño
        this.vidas -= danioReal;
        if (this.vidas < 0) {
            this.vidas = 0;
        }
        if (danioReal < cantidad) {
            System.out.println("🛡️ ¡Tu armadura absorbe " + (cantidad - danioReal) + " puntos de daño!");
        }
        System.out.println("💥⚡ ¡" + this.nombre + " recibe " + danioReal + " de daño devastador! ❤️‍🩹 Vida restante: " + this.vidas + "/10");

        if (this.vidas <= 2) {
            System.out.println("🚨 ¡PELIGRO CRÍTICO! Tu corazón late débilmente... 💔");
        }
    }

    public void curar(int cantidad) {
        int vidaAnterior = this.vidas;
        this.vidas = Math.min(10, this.vidas + cantidad); // Máximo 10 vidas
        int curado = this.vidas - vidaAnterior;
        System.out.println("💚✨ ¡Una cálida energía restaura " + curado + " puntos de vida! Vida actual: " + this.vidas + "/10 🌟");
    }

    public void agregarMonedas(int cantidad) {
        this.monedas += cantidad;
        System.out.println("💰🎉 ¡Has ganado " + cantidad + " monedas de oro! Total: " + this.monedas + " 💎");
    }

    public void mejorarAtaque(int cantidad) {
        this.ataque += cantidad;
        System.out.println("⚔️🔥 ¡Tu espada se fortalece! Ataque aumentado a " + this.ataque + " puntos! 💪");
    }

    public void mejorarDefensa(int cantidad) {
        this.defensa += cantidad;
        System.out.println("🛡️✨ ¡Tu armadura se endurece! Defensa aumentada a " + this.defensa + " puntos! 🔰");
    }

    public void recogerObjeto(ObjetoDelJuego objeto) {
        this.inventario.add(objeto);
        System.out.println("🎒✨ " + this.nombre + " ha encontrado " + objeto.obtenerNombre() + " y lo guarda cuidadosamente! 🌟");
        objeto.aplicarEfecto(this); // Aplica el efecto del objeto automáticamente
    }

    public boolean estaVivo() {
        return this.vidas > 0;
    }

    public void mostrarEstado() {
        System.out.println("\n🛡️═══════════════════════════════════════════");
        System.out.println("🏰 ESTADO DEL HÉROE: " + this.nombre.toUpperCase() + " 🏰");
        System.out.println("🛡️═══════════════════════════════════════════");

        // Barra de vida visual
        System.out.print("❤️ VIDA: ");
        for (int i = 0; i < 10; i++) {
            if (i < this.vidas) {
                System.out.print("💖");
            } else {
                System.out.print("🖤");
            }
        }
        System.out.println(" (" + this.vidas + "/10)");

        System.out.println("⚔️ ATAQUE: " + this.ataque + " puntos 🗡️");
        System.out.println("🛡️ DEFENSA: " + this.defensa + " puntos 🔰");
        System.out.println("💰 MONEDAS: " + this.monedas + " monedas de oro 💎");

        System.out.print("🎒 INVENTARIO MÁGICO: ");
        if (inventario.isEmpty()) {
            System.out.println("Vacío como el eco de una caverna... 👻");
        } else {
            System.out.println();
            for (int i = 0; i < inventario.size(); i++) {
                System.out.println("   🔹 " + inventario.get(i).obtenerNombre());
            }
        }
        System.out.println("🛡️═══════════════════════════════════════════\n");
    }

    public String obtenerNombre() {
        return this.nombre;
    }

    public int obtenerAtaque() {
        return this.ataque;
    }
}