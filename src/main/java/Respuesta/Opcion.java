package Respuesta;

import java.util.Objects;

public class Opcion {
    private final int valor;
    private final String enunciado;

    public Opcion(int valor) {
        this.valor = valor;
        this.enunciado = null;
    }

    public Opcion(int valor, String enunciado) {
        this.valor = valor;
        this.enunciado = enunciado;
    }

    @Override
    public boolean equals(Object o) {
        if(this == o) return true;
        if(o == null ||  getClass() != o.getClass()) return false;
        Opcion opcion = (Opcion) o;
        return valor == opcion.valor;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(valor);
    }

    public int valorNumerico() {
        return this.valor;
    }
}
