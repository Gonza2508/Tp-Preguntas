package Pregunta;

import java.util.ArrayList;
import EstrategiaCorreccion.EstrategiaCorreccion;
import Respuesta.*;

public abstract class PreguntaMultipleRespuesta extends Pregunta {
    ArrayList<Respuesta> respuestasCorrectas;
    ArrayList<Respuesta> respuestasJugador;

    public PreguntaMultipleRespuesta(ArrayList<Opcion> opciones,
                                     EstrategiaCorreccion estrategia,
                                     ArrayList<Respuesta> respuestasCorrectas) {
        super(opciones, estrategia);
        this.respuestasCorrectas = respuestasCorrectas;
    }

    public void agregarOpcionARespuestaJugador(Respuesta respuestaJugador, int numeroOpcion) {
        respuestaJugador.agregarOpcion(this.opciones.get(numeroOpcion - 1));
    }

    public abstract void corregirRespuestas(ArrayList<Respuesta> respuestasJugador);

    @Override
    public int asignarPuntajeAlResponderTodoBien() {
        int puntaje = 0;
        for (Respuesta respuesta : respuestasCorrectas) {
            puntaje += this.estrategia.asignarPuntajeAlResponderTodoBien(respuesta);
        }
        return (puntaje/2);
    }

    @Override
    public int asignarPuntajeAlErrarAlguna() {
        int puntaje = 0;
        for (Respuesta respuesta : respuestasCorrectas) {
            puntaje += this.estrategia.asignarPuntajeAlErrarAlguna(respuesta);
        }
        return (puntaje/2);
    }

    @Override
    public int asignarPuntajeAlNoResponderTodoBien() {
        int puntaje = 0;
        for (Respuesta respuesta : respuestasCorrectas) {
            puntaje += this.estrategia.asignarPuntajeAlNoResponderTodoBien(respuesta);
        }
        return (puntaje/2);
    }
}
