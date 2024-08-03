import EstrategiaCorreccion.*;
import Pregunta.*;
import Respuesta.*;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PreguntaOrderedChoiceClasicoTest {
    @Test
    public void test01SeRespondeCorrectamenteUnaPreguntaOrderedChoiceClasico() {
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
        PreguntaUnicaRespuesta preguntaOrderedChoice = new OrderedChoice(opciones, estrategia, respuestaCorrecta);

        //Act
        preguntaOrderedChoice.agregarOpcionARespuestaJugador(1);
        preguntaOrderedChoice.agregarOpcionARespuestaJugador(2);
        preguntaOrderedChoice.corregirRespuesta();
        int puntajeObtenido = preguntaOrderedChoice.manejarPuntaje();

        //Assert
        assertEquals(puntajeEsperado, puntajeObtenido);
    }

    @Test
    public void test02SeRespondeIncorrectamenteUnaPreguntaOrderedChoiceClasico() {
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
        PreguntaUnicaRespuesta preguntaOrderedChoice = new OrderedChoice(opciones, estrategia, respuestaCorrecta);

        //Act
        preguntaOrderedChoice.agregarOpcionARespuestaJugador(2);
        preguntaOrderedChoice.agregarOpcionARespuestaJugador(1);
        preguntaOrderedChoice.corregirRespuesta();
        int puntajeObtenido = preguntaOrderedChoice.manejarPuntaje();

        //Assert
        assertEquals(puntajeEsperado, puntajeObtenido);
    }

    @Test
    public void test03NoSeRespondeTodasLasOpcionesCorrectasEnUnOrderedChoiceClasico() {
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
        PreguntaUnicaRespuesta preguntaOrderedChoice = new OrderedChoice(opciones, estrategia, respuestaCorrecta);

        //Act
        preguntaOrderedChoice.agregarOpcionARespuestaJugador(2);
        preguntaOrderedChoice.corregirRespuesta();
        int puntajeObtenido = preguntaOrderedChoice.manejarPuntaje();

        //Assert
        assertEquals(puntajeEsperado, puntajeObtenido);
    }

    @Test
    public void test04SeSeleccionanOpcionesDeMasEnUnOrderedChoiceClasico() {
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
        PreguntaUnicaRespuesta preguntaOrderedChoice = new OrderedChoice(opciones, estrategia, respuestaCorrecta);

        //Act
        preguntaOrderedChoice.agregarOpcionARespuestaJugador(2);
        preguntaOrderedChoice.agregarOpcionARespuestaJugador(1);
        preguntaOrderedChoice.agregarOpcionARespuestaJugador(3);
        preguntaOrderedChoice.corregirRespuesta();
        int puntajeObtenido = preguntaOrderedChoice.manejarPuntaje();

        //Assert
        assertEquals(puntajeEsperado, puntajeObtenido);
    }

    @Test
    public void test05NoSeSeleccionaNingunaOpcionEnUnOrderedChoiceClasico() {
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
        PreguntaUnicaRespuesta preguntaOrderedChoice = new OrderedChoice(opciones, estrategia, respuestaCorrecta);

        //Act
        preguntaOrderedChoice.corregirRespuesta();
        int puntajeObtenido = preguntaOrderedChoice.manejarPuntaje();

        //Assert
        assertEquals(puntajeEsperado, puntajeObtenido);
    }
}
