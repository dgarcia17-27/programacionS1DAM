class EdadInvalidaExcepcion extends Exception{
    public EdadInvalidaExcepcion(String mensaje){
        super(mensaje);
    }
}

class Persona {
    private int edad;

    public void setEdad(int edad) throws EdadInvalidaExcepcion {
        if (edad < 0 || edad > 120){
            throw new EdadInvalidaExcepcion("La edad introducida no es válida");
        }
        this.edad = edad;
    }
}

class Main{
    static void main(String[] args) {
        Persona p = new Persona();

        try{
            p.setEdad(90);
        } catch (EdadInvalidaExcepcion e){
            System.out.println(e.getMessage());
        } finally {
            System.out.println("La edad introducida es válida");
        }
    }
}