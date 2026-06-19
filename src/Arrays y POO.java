class Persona {

    String nombre;

    Persona(String nombre) {
        this.nombre = nombre;
    }
}

public class Main {
    public static void main(String[] args) {

        Persona[] personas = {
            new Persona("Ana"),
            new Persona("Luis"),
            new Persona("Maria")
        };

        for (Persona p : personas) {
            System.out.println(p.nombre);
        }
    }
}