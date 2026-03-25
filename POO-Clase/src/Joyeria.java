public class Joyeria{
    // ATRIBUTOS PRIVADOS: las joyas estan protegidas
    private String joya;

    // CONSTRUCTOR
    public Joyeria(String joyaOro){
        this.joya = joyaOro;
    }

    // GETTERS: Le pides al joyero que te enseñe una joya
    public String getJoya() {
        return joya;
    }

    // SETTERS: Cambiar la joya (con reglas especificas)
    public void setJoya(String nuevaJoya) {
        if (nuevaJoya != null && !nuevaJoya.isEmpty()){
            this.joya = joya;
        } else {
            System.out.println("No se puede asignar una joya inválida.");
        }
    }

    // METODOS: acciones de la clase
    public void pulirJoya(){
        System.out.println("La joya se está puliendo.");
    }




}