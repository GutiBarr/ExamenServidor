package com.examen.model;

public class Jugador {
    private static int contId = 1;
    private int id;
    private String nombre;
    private Posicion posicion;
    private int valor;
    private int salario;
    private String equipoOriginal;
    private String equipoImg;


    public Jugador() {
    }

    public Jugador(String nombre, Posicion posicion, int valor, int salario, String equipoOriginal) {
        this.id = contId++;
        this.nombre = nombre;
        this.posicion = posicion;
        this.valor = valor;
        this.salario = salario;
        this.equipoOriginal = equipoOriginal;
        this.equipoImg = equipoOriginal.replace(" ", "_").toLowerCase().concat(".png");
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Posicion getPosicion() {
        return this.posicion;
    }

    public void setPosicion(Posicion posicion) {
        this.posicion = posicion;
    }

    public int getValor() {
        return this.valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public int getSalario() {
        return this.salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    public String getEquipoOriginal() {
        return this.equipoOriginal;
    }

    public void setEquipoOriginal(String equipoOriginal) {
        this.equipoOriginal = equipoOriginal;
    }

    public String getEquipoImg(){
        return this.equipoImg;
    }

    public void setEquipoImg(String equipoImg){
        this.equipoImg = equipoImg;
    }

    @Override
    public String toString() {
        return "{" +
            " nombre='" + getNombre() + "'" +
            ", posicion='" + getPosicion() + "'" +
            ", valor='" + getValor() + "'" +
            ", salario='" + getSalario() + "'" +
            ", equipoOriginal='" + getEquipoOriginal() + "'" +
            ", equipoImg='" + getEquipoImg() + "'" +
            "}";
    }
    
}
