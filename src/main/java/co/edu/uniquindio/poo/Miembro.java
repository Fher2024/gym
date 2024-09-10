package co.edu.uniquindio.poo;

import java.time.LocalDate;

public class Miembro {
    private String nombre;
    private int edad;
    private String genero;
    private LocalDate fecha;
    private Tipo_membresia tipo_membresia;

    
    public Miembro(String nombre, int edad, String genero, LocalDate fecha, Tipo_membresia tipo_membresia) {
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
        this.fecha = fecha;
        this.tipo_membresia = tipo_membresia;
    }


    public String getNombre() {
        return nombre;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public int getEdad() {
        return edad;
    }


    public void setEdad(int edad) {
        this.edad = edad;
    }


    public String getGenero() {
        return genero;
    }


    public void setGenero(String genero) {
        this.genero = genero;
    }


    public LocalDate getFecha() {
        return fecha;
    }


    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }


    public Tipo_membresia getTipo_membresia() {
        return tipo_membresia;
    }


    public void setTipo_membresia(Tipo_membresia tipo_membresia) {
        this.tipo_membresia = tipo_membresia;
    }


    @Override
    public String toString() {
        return "Miembro [nombre=" + nombre + ", edad=" + edad + ", genero=" + genero + ", fecha=" + fecha
                + ", tipo_membresia=" + tipo_membresia + "]";
    }


    }

    
