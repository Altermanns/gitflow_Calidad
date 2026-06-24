public class Saludo {
    public Sting generarSaludo (String nombre){
        if ( nombre == null || nombre.is empty()){
            return "Hola, Invalido"
        }
        return "Hola," +nombre+ "!";
    }
}