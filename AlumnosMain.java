import java.util.Scanner;
import AlumnoClase.AlumnoClase;


public class AlumnosMain {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        
        int numAlumn; 
        System.out.println("Ingrese número de alumnos: ");
        numAlumn = in.nextInt();
        AlumnoClase[] alumnos = new AlumnoClase [numAlumn]; 

        int numCal; //número de las calificaciones de los alumnos...  
        System.out.println("Ingrese número de calificaciones: ");
        numCal = in.nextInt();
        


        //Aquí inicia a llenar cada slot de alumnos 
        for(int i = 0; i<alumnos.length; i++){
        
            System.out.println("Ingrese datos del alumno "+ (i-1) + ":");

            System.out.println("Ingrese nombre del alumno: ");
            String name = in.next();

            System.out.println("Ingrese número de cuenta: ");
            String numCuenta = in.next(); 

            alumnos[i] = new AlumnoClase (name, numCuenta, numCal);

            //llena el array de las calificaciones del array: 
            int[] calificaciones = new int[numCal];
            for (int j = 0; j < numCal; j++) {
                System.out.print("Ingrese Calificación " + (j + 1) + ": ");
                calificaciones[j] = in.nextInt();
            }
            alumnos[i].setCali(calificaciones);

            in.nextLine();
        }
        in.close();

        //para imprimir todos los alumnos: 
        for(AlumnoClase alumno : alumnos){
            System.out.println("\nEstudiante: " + alumno.getName());
            System.out.println("Número de cuenta: " + alumno.getNumCuenta());
            System.out.print("Calificaciones: ");
            for (int grade : alumno.getCali()) {
                System.out.print(grade + " ");
            }
            System.out.println();
        }
    }
}
