public class Carrera extends Asignatura {

    public Carrera(String nombre, String uv, String codigo) {
        super(nombre,uv,codigo);
    }

@Override
    public String mostrarDatos(){
        return "nomccbre:"+nombre;
    }
}
