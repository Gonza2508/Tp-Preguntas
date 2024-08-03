import EstrategiaCorreccion.*;
import Pregunta.*;
import Respuesta.*;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PreguntaVerdaderoFalsoClasicoTest {
    @Test
    public void test01SeRespondeCorrectamenteUnaPreguntaVerdaderoFalsoClasico() {
        //Arrange
        int puntajeEsperado = 1;
        Opcion opcion1 = new Opcion(1);
        Opcion opcion2 = new Opcion(2);
        ArrayList<Opcion> opciones = new ArrayList<>();
        opciones.add(opcion1);
        opciones.add(opcion2);
        ArrayList<Opcion> opcionesCorrectas = new ArrayList<>();
        opcionesCorrectas.add(opcion1);
        Respuesta respuestaCorrecta = new RespuestaUnicaOpcion(opcionesCorrectas);
        EstrategiaCorreccion estrategia = new Clasico();
        PreguntaUnicaRespuesta preguntaVerdaderoFalso = new VerdaderoFalso(opciones, estrategia, respuestaCorrecta);

        //Act
        preguntaVerdaderoFalso.agregarOpcionARespuestaJugador(1);
        preguntaVerdaderoFalso.corregirRespuesta();
        int puntajeObtenido = preguntaVerdaderoFalso.manejarPuntaje();

        //Assert
        assertEquals(puntajeEsperado, puntajeObtenido);
    }

    @Test
    public void test02SeRespondeIncorrectamenteUnaPreguntaVerdaderoFalsoClasico() {
        //Arrange
        int puntajeEsperado = 0;
        Opcion opcion1 = new Opcion(1);
        Opcion opcion2 = new Opcion(2);
        ArrayList<Opcion> opciones = new ArrayList<>();
        opciones.add(opcion1);
        opciones.add(opcion2);
        ArrayList<Opcion> opcionesCorrectas = new ArrayList<>();
        opcionesCorrectas.add(opcion1);
        Respuesta respuestaCorrecta = new RespuestaUnicaOpcion(opcionesCorrectas);
        EstrategiaCorreccion estrategia = new Clasico();
        PreguntaUnicaRespuesta preguntaVerdaderoFalso = new VerdaderoFalso(opciones, estrategia, respuestaCorrecta);

        //Act
        preguntaVerdaderoFalso.agregarOpcionARespuestaJugador(2);
        preguntaVerdaderoFalso.corregirRespuesta();
        int puntajeObtenido = preguntaVerdaderoFalso.manejarPuntaje();

        //Assert
        assertEquals(puntajeEsperado, puntajeObtenido);
    }

    @Test
    public void test03NoSeSeleccionaNingunaOpcionEnUnVerdaderoFalsoClasico() {
        //Arrange
        int puntajeEsperado = 0;
        Opcion opcion1 = new Opcion(1);
        Opcion opcion2 = new Opcion(2);
        ArrayList<Opcion> opciones = new ArrayList<>();
        opciones.add(opcion1);
        opciones.add(opcion2);
        ArrayList<Opcion> opcionesCorrectas = new ArrayList<>();
        opcionesCorrectas.add(opcion1);
        Respuesta respuestaCorrecta = new RespuestaUnicaOpcion(opcionesCorrectas);
        EstrategiaCorreccion estrategia = new Clasico();
        PreguntaUnicaRespuesta preguntaVerdaderoFalso = new VerdaderoFalso(opciones, estrategia, respuestaCorrecta);

        //Act
        preguntaVerdaderoFalso.corregirRespuesta();
        int puntajeObtenido = preguntaVerdaderoFalso.manejarPuntaje();

        //Assert
        assertEquals(puntajeEsperado, puntajeObtenido);
    }
}
