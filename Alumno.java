public class Alumno {
private String Codigo;
private String Nombre;
private String Carnet;

public Alumno() {
}

public Alumno(String codigo, String nombre, String carnet) {
    Codigo = codigo;
    Nombre = nombre;
    Carnet = carnet;
}

public String getCodigo() {
    return Codigo;
}

public void setCodigo(String codigo) {
    Codigo = codigo;
}

public String getNombre() {
    return Nombre;
}

public void setNombre(String nombre) {
    Nombre = nombre;
}

public String getCarnet() {
    return Carnet;
}

public void setCarnet(String carnet) {
    Carnet = carnet;
}
 @Override
    public String toString() {
        return "Código: " + Codigo + ", Nombre: " + Nombre + ", Carnet: " + Carnet;
    }
}
