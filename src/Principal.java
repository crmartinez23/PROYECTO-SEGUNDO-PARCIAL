import java.util.Scanner;

public class Principal {
    public static void main(String[] args){
        Asignatura misDocentes[]=new Asignatura[5];
        misDocentes [0]=new Docente(2014110074,"0801-1997-12348","herctor campos","","");
        misDocentes [1]=new Docente(2014115674,"0801-1987-12758","jose peres","","");
        misDocentes [2]=new Docente(2015610074,"0805-1985-16548","elmer lozano","","");
        misDocentes [3]=new Docente(2018746684,"0605-2018-12000","pedro mendez","","");
        misDocentes [4]=new Docente(2000476584,"0801-2003-85485","alejandra urrutia","","");

        Asignatura misClases[]=new Asignatura[10];
        misClases [0]=new Asignatura("N.1 deporte","4"," bf70\n");
        misClases [1]=new Asignatura("N.2 alegebra","4"," dj78\n");
        misClases [2]=new Asignatura("N.3 trigonometria","3"," hd94\n");
        misClases [3]=new Asignatura("N.4 ingles","3"," gd78\n");
        misClases [4]=new Asignatura("N.5 español","5"," gdy4\n");
        misClases [5]=new Asignatura("N.6 sociologia","5"," hd69\n");
        misClases [6]=new Asignatura("N.7 psicologia","4"," gs70\n");
        misClases [7]=new Asignatura("N.8 filosofia","5"," bd06\n");
        misClases [8]=new Asignatura("N.9 geometria","3"," gs548\n");
        misClases [9]=new Asignatura("N. 10 administracion","2"," vd654\n");

        Asignatura misCarreras[]=new Asignatura[4];
        misCarreras [0]=new Asignatura("N.1 ingenieria de la construccion","","");
        misCarreras [1]=new Asignatura("N.2 ingenieria civil","","");
        misCarreras [2]=new Asignatura("N.3 ingenieria en sistemas","","");
        misCarreras [3]=new Asignatura("N.4 arquitectura","","");

        System.out.println("Bienvenidos a su asistencia de matricula por favor seguir las instrucciones como se le indica\n");

        Scanner bc = new Scanner(System.in);
        System.out.println("favor ingrese su primer nombre");
        String nombre;
        nombre=bc.nextLine();

       System.out.println("le gustaria ver nuestra oferta academica si = 1, no =2;");
        int sn;
        sn=bc.nextInt();
        if (sn==1){
        }else if (sn==2) {
            return;
        }
        System.out.println("mucho gusto  "+nombre+" \n");



        for (Asignatura ab: misCarreras){
            System.out.println(ab.mostrarDatos());


        }
        System.out.println("favor ingrese el numero de la carrera que eligio");
        int numcare;
        numcare=bc.nextInt();
        if (numcare==1){
            System.out.println("eligio ingenieria de la contruccion");
        }else  if (numcare==2) {
            System.out.println("eligio ingenieria civil");

        }else  if (numcare==3) {
            System.out.println("eligio ingenieria en sistemas");

        }else  if (numcare==4) {
            System.out.println("eligio arquitectura");

        }else{
            System.out.println("no se encontro la carrera ingresada");
        }
        System.out.println("le gustaria ver nuestras clases disponibles si = 1, no =2;");
        int sno;
        sno=bc.nextInt();
        if (sno==1){
        }else if (sno==2) {
            return;
        }
      System.out.println("en la carrera seleccionada tenemos disponibles las siguientes asignaturas:\n");

        for (Asignatura ab: misClases){
            System.out.println(ab.mostrarDatos());


        }
        System.out.println("favor ingrese el numero de la clase que eligio");
        int nummcare;
        nummcare=bc.nextInt();
        if (nummcare==1){
            System.out.println("eligio deporte");
        }else  if (nummcare==2) {
            System.out.println("eligio algebra");

        }else  if (nummcare==3) {
            System.out.println("eligio trigonometri");

        }else  if (nummcare==4) {
            System.out.println("eligio ingles");

        }else  if (nummcare==5) {
            System.out.println("eligio españos");

        }else  if (nummcare==6) {
            System.out.println("eligio sociologia");

        }else  if (nummcare==7) {
            System.out.println("eligio psicologia");

        }else  if (nummcare==8) {
            System.out.println("eligio filosofia");

        }else  if (nummcare==9) {
            System.out.println("eligio geometria");
        }else  if (nummcare==10) {
            System.out.println("eligio administracion");

        }else{
            System.out.println("no se encontro la clase ingresada");
        }



        if (nummcare<2){
            System.out.println("la asignatura la imparte:\n"+misDocentes[0].mostrarDatos());

        }else if (nummcare<4){
            System.out.println("la asignatura la imparte:\n"+misDocentes[1].mostrarDatos());

        }else if (nummcare<6){
            System.out.println("la asignatura  la imparte:\n"+misDocentes[2].mostrarDatos());

        }else if (nummcare<8){
            System.out.println("la asignatura la imparte:\n"+misDocentes[3].mostrarDatos());

        }else {
            System.out.println("la asignatura la imparte:\n"+misDocentes[4].mostrarDatos());

        }
        System.out.println("  fue un placer brindarle nuestra ayuda  "+nombre+ "  lo esperamos pronto");
        return;












    }

}
