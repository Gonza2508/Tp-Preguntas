import EstrategiaCorreccion.*;
import Pregunta.*;
import Respuesta.*;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PreguntaMultipleChoiceClasicoTest {
    @Test
    public void test01SeRespondeCorrectamenteUnaPreguntaMultipleChoiseClasico() {
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
        EstrategiaCorreccion estrategia = new Clasico();
        PreguntaUnicaRespuesta preguntaMultipleChoice = new Multiplechoice(opciones, estrategia, respuestaCorrecta);

        //Act
        preguntaMultipleChoice.agregarOpcionARespuestaJugador(2);
        preguntaMultipleChoice.agregarOpcionARespuestaJugador(1);
        preguntaMultipleChoice.corregirRespuesta();
        int puntajeObtenido = preguntaMultipleChoice.manejarPuntaje();

        //Assert
        assertEquals(puntajeEsperado, puntajeObtenido);
    }

    @Test
    public void test02SeRespondeIncorrectamenteUnaPreguntaMultipleChoiseClasico() {
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
        EstrategiaCorreccion estrategia = new Clasico();
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
    public void test03NoSeRespondeTodasLasOpcionesCorrectasEnUnMultipleChoiceClasico() {
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
        EstrategiaCorreccion estrategia = new Clasico();
        PreguntaUnicaRespuesta preguntaMultipleChoice = new Multiplechoice(opciones, estrategia, respuestaCorrecta);

        //Act
        preguntaMultipleChoice.agregarOpcionARespuestaJugador(1);
        preguntaMultipleChoice.corregirRespuesta();
        int puntajeObtenido = preguntaMultipleChoice.manejarPuntaje();

        //Assert
        assertEquals(puntajeEsperado, puntajeObtenido);
    }

    @Test
    public void test04SeSeleccionanOpcionesDeMasEnUnMultipleChoiceClasico() {
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
        EstrategiaCorreccion estrategia = new Clasico();
        PreguntaUnicaRespuesta preguntaMultipleChoice = new Multiplechoice(opciones, estrategia, respuestaCorrecta);

        //Act
        preguntaMultipleChoice.agregarOpcionARespuestaJugador(1);
        preguntaMultipleChoice.agregarOpcionARespuestaJugador(2);
        preguntaMultipleChoice.agregarOpcionARespuestaJugador(3);
        preguntaMultipleChoice.corregirRespuesta();
        int puntajeObtenido = preguntaMultipleChoice.manejarPuntaje();

        //Assert
        assertEquals(puntajeEsperado, puntajeObtenido);
    }

    @Test
    public void test05NoSeSeleccionaNingunaOpcionEnUnMultipleChoiceClasico() {
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
        EstrategiaCorreccion estrategia = new Clasico();
        PreguntaUnicaRespuesta preguntaMultipleChoice = new Multiplechoice(opciones, estrategia, respuestaCorrecta);

        //Act
        preguntaMultipleChoice.corregirRespuesta();
        int puntajeObtenido = preguntaMultipleChoice.manejarPuntaje();

        //Assert
        assertEquals(puntajeEsperado, puntajeObtenido);
    }
}
