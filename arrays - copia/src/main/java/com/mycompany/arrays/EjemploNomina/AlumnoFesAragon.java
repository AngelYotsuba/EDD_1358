package com.mycompany.arrays.EjemploNomina;

public class AlumnoFesAragon {
    
    //Atribuutos
    private String numCuenta;
    private String nombre;
    private String carrera;
    private String plantel;
    private double promedio;
    
    //Constructos sobre cargado
    public AlumnoFesAragon(String numCuenta, String nombre, String carrera, String plante, double promedio) {
        this.numCuenta = numCuenta;
        this.nombre = nombre;
        this.carrera = carrera;
        this.promedio = promedio;
    }
   
    //gets and sets
    public double getPromedio() {
        return promedio;
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }

    public String getNumCuenta() {
        return numCuenta;
    }

    public void setNumCuenta(String numCuenta) {
        this.numCuenta = numCuenta;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }
    
    public String getPlantel (){
        return plantel;
    }
    
    public void setPlantel (String plantel){
        this.plantel = plantel;
    }

    @Override
    public String toString() {
        return "Alumno{" + "numeroCuenta=" + numCuenta + ", nombre=" + nombre + ", carrera=" + carrera + ", promedio=" + promedio + '}';
    }
}
