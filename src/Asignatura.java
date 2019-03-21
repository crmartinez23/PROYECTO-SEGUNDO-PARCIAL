public class Asignatura {
    protected  String nm;
    protected String nombre;
    protected String uv;
    protected String codigo;

    public Asignatura(String nombre, String uv,String codigo){
        this.nombre=nombre;
        this.uv=uv;
        this.codigo=codigo;

    }


    public String getNombre() {
        return nombre;
    }

    public String getUv() {
        return uv;
    }

    public String getCodigo() {
        return codigo;
    }

    public String mostrarDatos (){
        return "nombre:"+nombre+"\n"+"\nuv:"+uv+"\ncodigo"+codigo;
    }

}
