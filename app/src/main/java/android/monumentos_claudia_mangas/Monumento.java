package android.monumentos_claudia_mangas;

import android.graphics.drawable.Drawable;

public class Monumento {
    private String nombre;
    private String pais;
    private String ciudad;
    private int anioConstruccion;
    private Arquitecto arquitecto;
    private String descripcion;
    private boolean esPatrimonioMundial;
    private String estiloArquitectonico;
    private int altura;
    private int imgId;

    // Constructor
    public Monumento(String nombre, String pais, String ciudad, int anioConstruccion,
                     Arquitecto arquitecto, String descripcion, boolean esPatrimonioMundial,
                     String estiloArquitectonico, int altura, int imgId) {
        this.nombre = nombre;
        this.pais = pais;
        this.ciudad = ciudad;
        this.anioConstruccion = anioConstruccion;
        this.arquitecto = arquitecto;
        this.descripcion = descripcion;
        this.esPatrimonioMundial = esPatrimonioMundial;
        this.estiloArquitectonico = estiloArquitectonico;
        this.altura = altura;
        this.imgId = imgId;
    }

    // Getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public int getAnioConstruccion() {
        return anioConstruccion;
    }

    public void setAnioConstruccion(int anioConstruccion) {
        this.anioConstruccion = anioConstruccion;
    }

    public Arquitecto getArquitecto() {
        return arquitecto;
    }

    public void setArquitecto(Arquitecto arquitecto) {
        this.arquitecto = arquitecto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public boolean isEsPatrimonioMundial() {
        return esPatrimonioMundial;
    }

    public void setEsPatrimonioMundial(boolean esPatrimonioMundial) {
        this.esPatrimonioMundial = esPatrimonioMundial;
    }

    public String getEstiloArquitectonico() {
        return estiloArquitectonico;
    }

    public void setEstiloArquitectonico(String estiloArquitectonico) {
        this.estiloArquitectonico = estiloArquitectonico;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int getImgId() {
        return imgId;
    }

    public void setImagen(int imgId) {
        this.imgId =imgId;
    }

}

