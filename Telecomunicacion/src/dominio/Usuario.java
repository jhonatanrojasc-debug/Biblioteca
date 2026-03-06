import java.util.UUID;

public class Usuario {
    private static final String PLAN_DATOS = "500 GB";
    private UUID id;
    private String nombre = "Pedro Perez";
    private String email = "usuaru@gmail..";
    private int telefono = 4456776;


    // Constructor vacio
    public Usuario (){

    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public void mostrarDatos () {
        id = UUID.randomUUID();
        System.out.println("--datos-- \n" +
                "-ID:"+ this.id +
                "-nombre:"+ this.nombre+
                "-email:"+ this.email
            );

    }
}
