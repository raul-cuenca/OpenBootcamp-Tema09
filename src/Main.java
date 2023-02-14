public class Main {
    public static void main(String[] args) {

        //Clase Cliente
        Cliente cliente = new Cliente();
        cliente.setNombre("Raul Cuenca");
        cliente.setEdad(36);
        cliente.setTelefono("909087654");
        cliente.setCredito(500.00);

        System.out.println("Cliente  : " + cliente.getNombre());
        System.out.println("Edad     : " + cliente.getEdad());
        System.out.println("Telefono : " + cliente.getTelefono());
        System.out.println("Credito  : " + cliente.getCredito());

        //Clase Trabajador

        Trabajador trabajador = new Trabajador();
        trabajador.setNombre("Katherine Nieves");
        trabajador.setEdad(35);
        trabajador.setTelefono("998766533");
        trabajador.setSalario(2199.00);

        System.out.println("Trabajador  : " + trabajador.getNombre());
        System.out.println("Edad        : " + trabajador.getEdad());
        System.out.println("Telefono    : " + trabajador.getTelefono());
        System.out.println("Salario     : " + trabajador.getSalario());

    }
}

class Persona{
    private int edad;
    private String nombre;
    private String telefono;

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getEdad() {
        return edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getTelefono() {
        return telefono;
    }
}

class Cliente extends Persona{
    private double credito;

    public void setCredito(double credito) {
        this.credito = credito;
    }

    public double getCredito() {
        return credito;
    }
}

class Trabajador extends Persona{
    private double salario;

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }
}