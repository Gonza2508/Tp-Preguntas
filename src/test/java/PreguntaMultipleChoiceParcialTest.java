import EstrategiaCorreccion.*;
import Pregunta.*;
import Respuesta.*;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PreguntaMultipleChoiceParcialTest {
    @Test
    public void test01SeRespondeCorrectamenteUnaPreguntaMultipleChoiseParcial() {
        //Arrange
        int puntajeEsperado = 2;
        Opcion opcion1 = new Opcion(1);
        Opcion opcion2 = new Opcion(2);
        Opcion opcion3 = new Opcion(3);
        ArrayList<Opcion> opciones = new ArrayList<>();
        opciones.add(opcion1);
        opciones.add(opcion2);
        opciones.add(opcion3);
        ArrayList<Opcion> opcionesCorrectas = new ArrayList<>();
        opcionesCorrectas.add(opcion1);
        opcionesCorrectas.add(opcion2);
        Respuesta respuestaCorrecta = new RespuestaMultipleOpcion(opcionesCorrectas);
        EstrategiaCorreccion estrategia = new Parcial();
        PreguntaUnicaRespuesta preguntaMultipleChoice = new Multiplechoice(opciones, estrategia, respuestaCorrecta);

        //Act
        preguntaMultipleChoice.agregarOpcionARespuestaJugador(1);
        preguntaMultipleChoice.agregarOpcionARespuestaJugador(2);
        preguntaMultipleChoice.corregirRespuesta();
        int puntajeObtenido = preguntaMultipleChoice.manejarPuntaje();

        //Assert
        assertEquals(puntajeEsperado, puntajeObtenido);
    }

    @Test
    public void test02SeRespondeIncorrectamenteUnaPreguntaMultipleChoiseParcial() {
        //Arrange
        int puntajeEsperado = 0;
        Opcion opcion1 = new Opcion(1);
        Opcion opcion2 = new Opcion(2);
        Opcion opcion3 = new Opcion(3);
        ArrayList<Opcion> opciones = new ArrayList<>();
        opciones.add(opcion1);
        opciones.add(opcion2);
        opciones.add(opcion3);
        ArrayList<Opcion> opcionesCorrectas = new ArrayList<>();
        opcionesCorrectas.add(opcion1);
        opcionesCorrectas.add(opcion2);
        Respuesta respuestaCorrecta = new RespuestaMultipleOpcion(opcionesCorrectas);
        EstrategiaCorreccion estrategia = new Parcial();
        PreguntaUnicaRespuesta preguntaMultipleChoice = new Multiplechoice(opciones, estrategia, respuestaCorrecta);

        //Act
        preguntaMultipleChoice.agregarOpcionARespuestaJugador(1);
        preguntaMultipleChoice.agregarOpcionARespuestaJugador(3);
        preguntaMultipleChoice.corregirRespuesta();
        int puntajeObtenido = preguntaMultipleChoice.manejarPuntaje();

        //Assert
        assertEquals(puntajeEsperado, puntajeObtenido);
    }

    @Test
    public void test03NoSeRespondeTodasLasOpcionesCorrectasEnUnMultipleChoiceParcial() {
        //Arrange
        int puntajeEsperado = 1;
        Opcion opcion1 = new Opcion(1);
        Opcion opcion2 = new Opcion(2);
        Opcion opcion3 = new Opcion(3);
        ArrayList<Opcion> opciones = new ArrayList<>();
        opciones.add(opcion1);
        opciones.add(opcion2);
        opciones.add(opcion3);
        ArrayList<Opcion> opcionesCorrectas = new ArrayList<>();
        opcionesCorrectas.add(opcion1);
        opcionesCorrectas.add(opcion2);
        Respuesta respuestaCorrecta = new RespuestaMultipleOpcion(opcionesCorrectas);
        EstrategiaCorreccion estrategia = new Parcial();
        PreguntaUnicaRespuesta preguntaMultipleChoice = new Multiplechoice(opciones, estrategia, respuestaCorrecta);

        //Act
        preguntaMultipleChoice.agregarOpcionARespuestaJugador(1);
        preguntaMultipleChoice.corregirRespuesta();
        int puntajeObtenido = preguntaMultipleChoice.manejarPuntaje();

        //Assert
        assertEquals(puntajeEsperado, puntajeObtenido);
    }

    @Test
    public void test04SeSeleccionanOpcionesDeMasEnUnMultipleChoiceParcial() {
        //Arrange
        int puntajeEsperado = 0;
        Opcion opcion1 = new Opcion(1);
        Opcion opcion2 = new Opcion(2);
        Opcion opcion3 = new Opcion(3);
        ArrayList<Opcion> opciones = new ArrayList<>();
        opciones.add(opcion1);
        opciones.add(opcion2);
        opciones.add(opcion3);
        ArrayList<Opcion> opcionesCorrectas = new ArrayList<>();
        opcionesCorrectas.add(opcion1);
        Respuesta respuestaCorrecta = new RespuestaMultipleOpcion(opcionesCorrectas);
        EstrategiaCorreccion estrategia = new Parcial();
        PreguntaUnicaRespuesta preguntaMultipleChoice = new Multiplechoice(opciones, estrategia, respuestaCorrecta);

        //Act
        preguntaMultipleChoice.agregarOpcionARespuestaJugador(2);
        preguntaMultipleChoice.agregarOpcionARespuestaJugador(3);
        preguntaMultipleChoice.corregirRespuesta();
        int puntajeObtenido = preguntaMultipleChoice.manejarPuntaje();

        //Assert
        assertEquals(puntajeEsperado, puntajeObtenido);
    }

    @Test
    public void test05NoSeSeleccionaNingunaOpcionEnUnMultipleChoiceParcial() {
        //Arrange
        int puntajeEsperado = 0;
        Opcion opcion1 = new Opcion(1);
        Opcion opcion2 = new Opcion(2);
        Opcion opcion3 = new Opcion(3);
        ArrayList<Opcion> opciones = new ArrayList<>();
        opciones.add(opcion1);
        opciones.add(opcion2);
        opciones.add(opcion3);
        ArrayList<Opcion> opcionesCorrectas = new ArrayList<>();
        opcionesCorrectas.add(opcion1);
        opcionesCorrectas.add(opcion2);
        Respuesta respuestaCorrecta = new RespuestaMultipleOpcion(opcionesCorrectas);
        EstrategiaCorreccion estrategia = new Parcial();
        PreguntaUnicaRespuesta preguntaMultipleChoice = new Multiplechoice(opciones, estrategia, respuestaCorrecta);

        //Act
        preguntaMultipleChoice.corregirRespuesta();
        int puntajeObtenido = preguntaMultipleChoice.manejarPuntaje();

        //Assert
        assertEquals(puntajeEsperado, puntajeObtenido);
    }
}
