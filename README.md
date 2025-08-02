# 🏰 Mazmorra Legendaria - Juego de Aventuras 🗡️

¡Bienvenido a la **Mazmorra Legendaria**, una aventura épica de texto donde el valor, la estrategia y la suerte determinarán tu destino! ⚔️✨

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white)
![Version](https://img.shields.io/badge/Version-1.0.0-brightgreen?style=for-the-badge)
![Status](https://img.shields.io/badge/Status-Activo-success?style=for-the-badge)

## 📜 Descripción del Juego

Adéntrate en una mazmorra misteriosa llena de **peligros mortales** 💀, **tesoros legendarios** 💎, y **criaturas siniestras** 👹. Como un valiente aventurero, deberás explorar cada rincón de esta mazmorra de 4x4, enfrentarte a enemigos feroces, y recolectar objetos mágicos que aumentarán tu poder.

¿Tendrás lo necesario para conquistar toda la mazmorra y convertirte en una **leyenda**? 🏆

## 🎮 Características del Juego

### ⚔️ **Sistema de Combate Épico**
- 🗡️ **Ataque dinámico** - Mejora tu poder con armas mágicas
- 🛡️ **Sistema de defensa** - La armadura reduce el daño recibido
- 💥 **Combates cinematográficos** con descripciones dramáticas
- 👹 **Enemigos variados**: Goblins, Esqueletos, Orcos y Sombras Malditas

### 🎒 **Inventario Rico y Diverso**
- 💰 **Monedas de Oro Ancestrales** - Acumula riquezas legendarias
- 🧪 **Pociones Curativas Místicas** - Restaura tu vida perdida
- ⚔️ **Espadas Encantadas** - Aumenta tu poder de ataque
- 🛡️ **Armaduras Mágicas** - Fortalece tus defensas
- 💎 **Gemas Legendarias** - Rubíes, Esmeraldas y Zafiros con poderes únicos

### 🗺️ **Exploración Inmersiva**
- 🏰 **Mazmorra 4x4** con 16 salas únicas para explorar
- 🎲 **Generación aleatoria** - Cada partida es una nueva aventura
- 📍 **Sistema de coordenadas** para navegación precisa
- 📊 **Barra de progreso** visual para seguir tu exploración

### 🎭 **Experiencia Narrativa**
- 📖 **Historia inmersiva** con descripciones cinematográficas
- 🌟 **Eventos aleatorios** en salas misteriosas
- ⏸️ **Pausas dramáticas** para crear suspense
- 🎬 **Efectos de sonido textuales** para mayor inmersión

## 🚀 Cómo Empezar

### 📋 **Requisitos del Sistema**
- ☕ Java 8 o superior
- 💻 Terminal o IDE compatible con Java
- 🧠 ¡Mucho valor y estrategia!

### 🛠️ **Instalación**

1. **Clona el repositorio:**
```bash
git clone https://github.com/tu-usuario/mazmorra-legendaria.git
cd mazmorra-legendaria
```

2. **Compila el proyecto:**
```bash
javac -d bin src/dungeonGame/*.java
```

3. **Ejecuta el juego:**
```bash
java -cp bin dungeonGame.JuegoDungeon
```

### 🎯 **Inicio Rápido**

1. 🧙‍♂️ **Ejecuta el juego** y crea tu héroe con un nombre épico
2. 📖 **Lee las instrucciones** que aparecen en pantalla
3. 🧭 **Muévete** usando comandos: `arriba`, `abajo`, `izquierda`, `derecha`
4. ⚔️ **Sobrevive** a los combates y **recolecta** todos los tesoros
5. 🏆 **¡Conquista** toda la mazmorra para ganar!

## 🕹️ Controles del Juego

| Comando | Acción | Emoji |
|---------|--------|-------|
| `arriba` / `up` / `w` | Mover hacia arriba | ⬆️ |
| `abajo` / `down` / `s` | Mover hacia abajo | ⬇️ |
| `izquierda` / `left` / `a` | Mover hacia la izquierda | ⬅️ |
| `derecha` / `right` / `d` | Mover hacia la derecha | ➡️ |
| `q` / `salir` | Abandonar la mazmorra | 🚪 |

## 🏛️ Tipos de Salas

### 🌫️ **Cámara de Meditación**
- 🕊️ Salas pacíficas para descansar
- 🔍 Posibilidad de encontrar monedas ocultas
- 🧘‍♂️ Lugar seguro para planear estrategias

### 💎 **Cámara del Tesoro**
- 🎁 Contienen objetos mágicos valiosos
- ✨ Solo se pueden saquear una vez
- 🎲 Posibilidad de tesoros bonus

### ⚔️ **Cámara de Combate**
- 👹 Enfréntate a enemigos peligrosos
- 💪 Pon a prueba tus habilidades de combate
- 🏆 La victoria te permite continuar

## 🎯 Objetivos del Juego

### 🥇 **Objetivo Principal**
🗺️ **Explorar todas las 16 salas** de la mazmorra sin morir

### 🏆 **Objetivos Secundarios**
- 💰 Acumular la mayor cantidad de monedas posible
- ⚔️ Mejorar tu ataque y defensa al máximo
- 🧪 Usar sabiamente las pociones curativas
- 📊 Completar el 100% de exploración

## 🎲 Mecánicas de Juego

### ⚡ **Sistema de Estadísticas**
- **❤️ Vida**: 8 puntos iniciales (máximo 10)
- **⚔️ Ataque**: 2 puntos iniciales (mejorable)
- **🛡️ Defensa**: 1 punto inicial (mejorable)
- **💰 Monedas**: 0 iniciales (acumulables)

### 🔄 **Progresión del Personaje**
- 🗡️ **Espadas** aumentan permanentemente tu ataque
- 🛡️ **Armaduras** aumentan permanentemente tu defensa
- 🧪 **Pociones** restauran vida instantáneamente
- 💎 **Gemas** otorgan múltiples beneficios

### 🎪 **Eventos Especiales**
- 🌟 Encuentros misteriosos en salas vacías
- 🎁 Tesoros bonus aleatorios
- 💫 Efectos mágicos sorpresa

## 📁 Estructura del Proyecto

```
dungeonGame/
├── 🧙‍♂️ Jugador.java          # Clase principal del héroe
├── 🎮 JuegoDungeon.java       # Motor principal del juego
├── 🏛️ Sala.java              # Interfaz para tipos de salas
├── 🌫️ SalaVacia.java         # Salas de descanso
├── 💎 SalaDelTesoro.java      # Salas con tesoros
├── ⚔️ SalaDelEnemigo.java     # Salas de combate
├── 🎒 ObjetoDelJuego.java     # Interfaz para objetos
├── 💰 Moneda.java             # Monedas de oro
├── 🧪 PocionCuracion.java     # Pociones curativas
├── ⚔️ EspadaMagica.java       # Armas encantadas
├── 🛡️ ArmaduraMagica.java     # Armaduras protectoras
└── 💎 GemaPoderosa.java       # Gemas con poderes especiales
```

## 🎨 Capturas del Juego

### 🚀 **Pantalla de Inicio**
```
🏰═══════════════════════════════════════════════════════════════🏰
🌟                 ¡BIENVENIDO A LA MAZMORRA LEGENDARIA!                🌟
🏰═══════════════════════════════════════════════════════════════🏰

📜 CÓMO JUGAR:
🗡️  • Explora una mazmorra de 4x4 llena de peligros y tesoros
⚔️  • Lucha contra enemigos feroces y encuentra tesoros legendarios
```

### 🛡️ **Estado del Jugador**
```
🛡️═══════════════════════════════════════════
🏰 ESTADO DEL HÉROE: ARTURO EL VALIENTE 🏰
🛡️═══════════════════════════════════════════
❤️ VIDA: 💖💖💖💖💖🖤🖤🖤🖤🖤 (5/10)
⚔️ ATAQUE: 4 puntos 🗡️
🛡️ DEFENSA: 3 puntos 🔰
💰 MONEDAS: 125 monedas de oro 💎
```

## 🛡️ Estrategias y Consejos

### 🧠 **Consejos para Principiantes**
- 🧪 **Usa pociones sabiamente** - Solo cuando tengas poca vida
- 🛡️ **Prioriza la defensa** - Reduce el daño a largo plazo
- 🗺️ **Explora sistemáticamente** - No te pierdas ninguna sala
- 💰 **Recolecta todo** - Nunca sabes qué encontrarás

### ⚔️ **Estrategias Avanzadas**
- 🎯 **Balancea ataque y defensa** según tu estilo de juego
- 🔍 **Memoriza las salas exploradas** para optimizar rutas
- ⚡ **Aprovecha los eventos aleatorios** para obtener ventajas
- 🏆 **Mantén siempre vida alta** antes de enfrentar enemigos

## 🔧 Características Técnicas

### 🏗️ **Patrones de Diseño Implementados**
- 🔄 **Polimorfismo** - Diferentes tipos de salas y objetos
- 🔒 **Encapsulación** - Atributos privados con getters/setters
- 🎭 **Interfaces** - Contratos para objetos y salas
- 🏭 **Composición** - Jugador contiene inventario de objetos

### 💻 **Tecnologías Utilizadas**
- ☕ **Java** - Lenguaje principal
- 🎲 **Random** - Generación aleatoria
- ⏱️ **Threading** - Pausas dramáticas
- 📊 **Collections** - ArrayList para inventario

## 🤝 Contribuciones

¡Las contribuciones son bienvenidas! 🎉

### 🔮 **Ideas para Futuras Mejoras**
- 🏪 **Sistema de tienda** para comprar objetos
- 🐉 **Jefes finales** épicos
- 🗝️ **Sistema de llaves** y puertas cerradas
- 🎵 **Efectos de sonido** reales
- 💾 **Sistema de guardado** de partidas
- 🌍 **Múltiples mazmorras** y niveles
- 👥 **Modo multijugador** cooperativo

### 📝 **Cómo Contribuir**
1. 🍴 Fork el proyecto
2. 🌿 Crea una rama para tu feature (`git checkout -b feature/nueva-funcionalidad`)
3. 💻 Commit tus cambios (`git commit -m 'Agregar nueva funcionalidad épica'`)
4. 📤 Push a la rama (`git push origin feature/nueva-funcionalidad`)
5. 🔄 Abre un Pull Request

## 📄 Licencia

Este proyecto está bajo la Licencia MIT 📋 - mira el archivo [LICENSE.md](LICENSE.md) para más detalles.

## 👨‍💻 Autor

**Tu Nombre** 🧙‍♂️
- 📧 Email: tu.email@ejemplo.com
- 🐱 GitHub: [@tu-usuario](https://github.com/tu-usuario)
- 💼 LinkedIn: [Tu Perfil](https://linkedin.com/in/tu-perfil)

## 🙏 Agradecimientos

- 🎮 **Inspirado en** los clásicos juegos de mazmorras y dragones
- 🎨 **Emojis** que dan vida a la aventura
- 🏛️ **Comunidad Java** por las mejores prácticas
- 🌟 **Jugadores de RPG** que mantienen viva la magia

## 📊 Estadísticas del Proyecto

- 📁 **Archivos**: 12 clases Java
- 📝 **Líneas de código**: ~500 líneas
- 🎯 **Nivel de dificultad**: Intermedio
- ⏱️ **Tiempo de juego**: 5-15 minutos por partida
- 🎲 **Rejugabilidad**: Infinita (mapas aleatorios)

## 🎪 Capturas de Pantalla

### 🌟 **Inicio Épico**
```
🚀🌟 ¡LA AVENTURA ÉPICA DE ARTURO EL VALIENTE COMIENZA! 🌟🚀
🗝️ Las puertas de la mazmorra se abren con un crujido ominoso...
```

### ⚔️ **Combate Intenso**
```
⚔️🔥 ¡COMBATE ÉPICO! 🔥⚔️
👹 Un Orco Feroz emerge de las sombras con ojos ardientes!
💥 ¡CLASH! Las armas chocan en un estruendo metálico...
```

### 🏆 **Victoria Gloriosa**
```
🎉🏆🎉🏆🎉🏆🎉🏆🎉🏆🎉🏆🎉🏆🎉
           👑 ¡VICTORIA ÉPICA! 👑
🌟 ¡FELICIDADES, ARTURO EL VALIENTE! 🌟
```

## 🔗 Enlaces Útiles

- 📚 [Documentación Java](https://docs.oracle.com/javase/)
- 🎮 [Tutorial de Programación de Juegos](https://ejemplo.com)
- 🏰 [Historia de las Mazmorras](https://ejemplo.com)

---

🌟 **¿Te gustó el juego? ¡Dale una estrella al repositorio!** ⭐

🎮 **¡Que comience tu aventura legendaria!** 🗡️✨

---

*Desarrollado con 💜 y mucha ☕ para la comunidad de aventureros*
