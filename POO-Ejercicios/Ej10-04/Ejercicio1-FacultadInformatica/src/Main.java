public class Main {
    public static void main(String[] args) {
        Facultad miFacultad = new Facultad();

        Estudiante juan = new Estudiante("Juan", "Orozco", "12345678A", "Primero DAM");
        Estudiante david = new Estudiante("David", "García", "87654321B", "Primero DAM");
        Profesor hugo = new Profesor("Hugo", "Martinez", "11223344C", 2010, 101, "Informática");
        PersonalServicio adrian = new PersonalServicio("Adrian", "Caballero", "55667788D", 2015, 101, "Redes");

        miFacultad.darDeAlta(juan);
        miFacultad.darDeAlta(david);
        miFacultad.darDeAlta(hugo);
        miFacultad.darDeAlta(adrian);

        System.out.println("Alumnos DAM");
        for (Estudiante e : miFacultad.getAlumnosPorCurso("Primero DAM")) {
            System.out.println("- " + e);
        }

        System.out.println("\nPersonas despacho 101");
        for (Empleado emp : miFacultad.getPersonalPorDespacho(101)) {
            System.out.println("- " + emp);
        }
    }
}
