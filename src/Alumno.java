public class Alumno extends Asignatura {

    private int cuentaD;
    private int id;

    public Alumno(int cuenta,int id, String nombre, String uv,String codigo) {
        super(nombre,uv,codigo);

    }

    public int getCuentaD() {
        return cuentaD;
    }

    public int getId() {
        return id;
    }

    @Override
    public String mostrarDatos(){
        return "nombre:"+nombre+"\n"+"\ncuenta:"+cuentaD+"\nid"+id;
    }
}
