class Persona {

    String nombre;

    Persona(String nombre) {
        this.nombre = nombre;
    }

    void mostrarNombre() {
        System.out.println("Nombre: " + nombre);
    }
}

public class Main {
    public static void main(String[] args) {

        Persona p = new Persona("Ana");

        p.mostrarNombre();
    }
}