import EstrategiaCorreccion.*;
import Pregunta.*;
import Respuesta.*;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PreguntaGroupChoiceClasicoTest {
    @Test
    public void test01SeRespondeCorrectamenteElGrupo1EnUnaPreguntaGroupChoiceClasico() {
        //Arrange
        int puntajeEsperado = 1;
        Opcion opcion1 = new Opcion(1);
        Opcion opcion2 = new Opcion(2);
        Opcion opcion3 = new Opcion(3);
        Opcion opcion4 = new Opcion(4);
        ArrayList<Opcion> opciones = new ArrayList<>();
        opciones.add(opcion1);
        opciones.add(opcion2);
        opciones.add(opcion3);
        opciones.add(opcion4);
        ArrayList<Opcion> opcionesCorrectas1 = new ArrayList<>();
        opcionesCorrectas1.add(opcion1);
        opcionesCorrectas1.add(opcion2);
        ArrayList<Opcion> opcionesCorrectas2 = new ArrayList<>();
        opcionesCorrectas2.add(opcion3);
        opcionesCorrectas2.add(opcion4);
        Respuesta respuestaCorrecta1 = new RespuestaMultipleOpcion(opcionesCorrectas1);
        Respuesta respuestaCorrecta2 = new RespuestaMultipleOpcion(opcionesCorrectas2);
        EstrategiaCorreccion estrategia = new Clasico();
        Pregunta preguntaGroupChoice = new GroupChoice(opciones, estrategia, null);

        //Act
        preguntaGroupChoice.configurarRespuestaCorrecta(respuestaCorrecta1);
        ArrayList<Opcion> opcionesJugador = new ArrayList<>();
        opcionesJugador.add(new Opcion(1));
        opcionesJugador.add(new Opcion(2));
        Respuesta respuestaJugador = new RespuestaMultipleOpcion(opcionesJugador);
        preguntaGroupChoice.corregirRespuesta(respuestaJugador);
        int puntajeObtenido = preguntaGroupChoice.manejarPuntaje();

        //Assert
        assertEquals(puntajeEsperado, puntajeObtenido);
    }

    @Test
    public void test02SeRespondeCorrectamenteElGrupo2EnUnaPreguntaGroupChoiceClasico() {
        //Arrange
        int puntajeEsperado = 1;
        Opcion opcion1 = new Opcion(1);
        Opcion opcion2 = new Opcion(2);
        Opcion opcion3 = new Opcion(3);
        Opcion opcion4 = new Opcion(4);
        ArrayList<Opcion> opciones = new ArrayList<>();
        opciones.add(opcion1);
        opciones.add(opcion2);
        opciones.add(opcion3);
        opciones.add(opcion4);
        ArrayList<Opcion> opcionesCorrectas1 = new ArrayList<>();
        opcionesCorrectas1.add(opcion1);
        opcionesCorrectas1.add(opcion2);
        ArrayList<Opcion> opcionesCorrectas2 = new ArrayList<>();
        opcionesCorrectas2.add(opcion3);
        opcionesCorrectas2.add(opcion4);
        Respuesta respuestaCorrecta1 = new RespuestaMultipleOpcion(opcionesCorrectas1);
        Respuesta respuestaCorrecta2 = new RespuestaMultipleOpcion(opcionesCorrectas2);
        EstrategiaCorreccion estrategia = new Clasico();
        Pregunta preguntaGroupChoice = new GroupChoice(opciones, estrategia, null);

        //Act
        preguntaGroupChoice.configurarRespuestaCorrecta(respuestaCorrecta2);
        ArrayList<Opcion> opcionesJugador = new ArrayList<>();
        opcionesJugador.add(new Opcion(3));
        opcionesJugador.add(new Opcion(4));
        Respuesta respuestaJugador = new RespuestaMultipleOpcion(opcionesJugador);
        preguntaGroupChoice.corregirRespuesta(respuestaJugador);
        int puntajeObtenido = preguntaGroupChoice.manejarPuntaje();

        //Assert
        assertEquals(puntajeEsperado, puntajeObtenido);
    }
}
