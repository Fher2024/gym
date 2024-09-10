package co.edu.uniquindio.poo;

import java.util.LinkedList;

public class Gimnasio {

    private String nombre;
    private LinkedList<Miembro> miembros;
    private LinkedList<Entrenador> entrenadores;

    /**
     * Constructor
     */

    public Gimnasio(String nombre) {
        this.nombre = nombre;
        miembros = new LinkedList<>();
        entrenadores = new LinkedList<>();
    }

    /**
     * Metodo para agregar miembro
     */
    public void agregarMiembro(Miembro miembro) {
        if (!verificarMiembro(miembro.getNombre())) {
            miembros.add(miembro);
        }
    }

    /**
     * Metodo para verificar miembro
     */
    public boolean verificarMiembro(String nombre) {
        this.nombre = nombre;
        boolean centinela = false;
        for (Miembro miembro : miembros) {
            if (miembro.getNombre().equals(nombre)) {
                centinela = true;
            }
        }
        return centinela;
    }

    /**
     * Metodo para eliminar miembro
     */

    public void eliminarMiembro(String nombre) {
        for (Miembro miembro : miembros) {
            if (miembro.getNombre().equals(nombre)) {
                miembros.remove(miembro);
                break;
            }
        }
    }

    /**
     * Metodo para agregar entrenador
     */

    public void agregarEntrenador(Entrenador entrenador) {
        if (!verificarEntrenador(entrenador.getCorreo())) {
            entrenadores.add(entrenador);
        }
    }

    /**
     * Metodo para verificar entrenador
     */

    public boolean verificarEntrenador(String correo) {
        boolean centinela = false;
        for (Entrenador entrenador : entrenadores) {
            if (entrenador.getCorreo().equals(correo)) {
                centinela = true;
            }
        }
        return centinela;
    }

    /**
     * Metodo para eliminar entrenador
     */
    public void eliminarEntrenador(String correo) {
        for (Entrenador entrenador : entrenadores) {
            if (entrenador.getCorreo().equals(correo)) {
                entrenadores.remove(entrenador);
                break;
            }
        }

    }

    public void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }

    /**
     * Metodo que muestra los nombres de los miembros de la lista en orden inverso
     */
    public void listaNombresInverso() {
        for (int i = miembros.size() - 1; i >= 0; i--) {
            Miembro miembro = miembros.get(i);
            mostrarMensaje(miembro.getNombre());
        }
    }

    /**
     * Metodo que crea una lista de miembros que son menores de 18 años.
     * 
     * @return Una lista de objetos cuya edad es menor de 18 años.
     */
    public LinkedList<Miembro> obtenerMenoresEdad() {
        LinkedList<Miembro> menores = new LinkedList<>();
        for (Miembro miembro : miembros) {
            if (miembro.getEdad() < 18) {
                menores.add(miembro);
            }
        }
        return menores;
    }

    /**
     * Metodo para calcularPromedioEdad()
     * 
     */

    public static double calcularPromedioEdades(LinkedList<Miembro> miembros) {
        if (miembros == null || miembros.isEmpty()) {
            return 0;
        }

        int sumaEdades = 0;
        for (Miembro miembro : miembros) {
            sumaEdades += miembro.getEdad();
        }

        return (double) sumaEdades / miembros.size();
    }

    /*
     * Método para eliminar nombres con 3 Vocales()
     * 
     */

    public static LinkedList<Miembro> eliminarNombresConTresVocales(LinkedList<Miembro> miembros) {
        final LinkedList<Miembro> miembrosFiltrados = new LinkedList<>();
        for (Miembro miembro : miembros) {
            if (contarVocales(miembro.getNombre()) != 3) {
                miembrosFiltrados.add(miembro);
            }
        }
        return miembrosFiltrados;
    }

    /*
     * Método para determinar vocales
     * 
     * 
     */
    private static int contarVocales(String nombre) {
        int count = 0;
        String vocales = "aeiou";
        for (int i = 0; i < nombre.length(); i++) {
            char c = nombre.toLowerCase().charAt(i);
            for (int j = 0; j < vocales.length(); j++) {
                if (c == vocales.charAt(j)) {
                    count++;
                    break;
                }
            }
        }
        return count;
    }

    /*
     * Método para sacara la edad promedio
     * 
     */

    public class EdadPromedio {
        public static void main(String[] args) {
            LinkedList<Miembro> miembros = new LinkedList<>();
            double promedio = calcularPromedioEdades(miembros);
            System.out.println("LA edad de promedio es" + promedio);
        }

    }

    /**
     * Metodo para obtener nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Metodo para modificar nombre
     */

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LinkedList<Miembro> getMiembros() {
        return miembros;
    }

    public void setMiembros(LinkedList<Miembro> miembros) {
        this.miembros = miembros;
    }

    public LinkedList<Entrenador> getEntrenadores() {
        return entrenadores;
    }

    public void setEntrenadores(LinkedList<Entrenador> entrenadores) {
        this.entrenadores = entrenadores;
    }

    @Override
    public String toString() {
        return "Gimnasio [nombre=" + nombre + ", miembros=" + miembros + ", entrenadores=" + entrenadores + "]";
    }
}
