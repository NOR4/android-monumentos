package android.monumentos_claudia_mangas;

public class Arquitecto {
    private String nombre;
    private String sexo; // 'M' para masculino, 'F' para femenino, 'O' para otros
    private String pais;

    // Constructor
    public Arquitecto(String nombre, String sexo, String pais) {
        this.nombre = nombre;
        this.sexo = sexo;
        this.pais = pais;
    }

    // Getters y setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }



}

