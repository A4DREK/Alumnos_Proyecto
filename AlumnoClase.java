package AlumnoClase;

public class AlumnoClase {
    String name, numCuenta; 
    int numCal; // ¿Cuántas calificaciones necesito?
    int cali[]; //array de las calificaciones 

    public AlumnoClase (String name, String numCuenta, int numCal){

        this.name = name;
        this.numCuenta = numCuenta;
        this.numCal = numCal;
        this.cali = new int [numCal];
    }

    public int[] getCali() {
        return cali;
    }
    public String getName() {
        return name;
    }
    public String getNumCuenta() {
        return numCuenta;
    }
    public int getNumCal() {
        return numCal;
    }
    public void setCali(int[] cali) {
        this.cali = cali;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setNumCuenta(String numCuenta) {
        this.numCuenta = numCuenta;
    }
    public void setNumCal(int numCal) {
        this.numCal = numCal;
        this.cali = new int[numCal]; // Cambiar el tamaño del array si cambia numCal
    }
}
