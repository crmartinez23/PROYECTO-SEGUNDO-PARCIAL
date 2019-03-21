public class Docente extends Asignatura {
    private int cuenta;
    private String id;

    public Docente(int cuenta,String id, String nombre, String uv, String codigo ) {
        super(nombre,uv,codigo);

    }

    public int getCuenta() {
        return cuenta;
    }

    public String getId() {
        return id;
    }
    @Override
    public String mostrarDatos(){
        return "nombre:"+nombre+"\n"+"\ncuenta:"+cuenta+"\nid"+id;
    }
}
