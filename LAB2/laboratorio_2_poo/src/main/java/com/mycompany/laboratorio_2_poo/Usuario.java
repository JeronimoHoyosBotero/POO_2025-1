package com.mycompany.laboratorio_2_poo;

public class Usuario {
    private String nombre;
    private long id;
    private String fecha_nacimiento;
    private String ciudad_nacimiento;
    private long tel;
    private String email;
    private String dir;
    public Usuario(){
    };
    public Usuario(String nombre,long id,String fecha_nacimiento,String ciudad_nacimiento,long tel,String email,String dir){
    this.nombre = nombre;
    this.id = id;
    this.fecha_nacimiento = fecha_nacimiento;
    this.ciudad_nacimiento = ciudad_nacimiento;
    this.tel = tel;
    this.email = email;
    this.dir = dir;
    };
    public String getNombre(){return nombre;};
    public long getId(){return id;};
    public String getFecha_nacimiento(){return fecha_nacimiento;};
    public String getCiudad_nacimiento(){return ciudad_nacimiento;};
    public long getTel(){return tel;};
    public String getEmail(){return email;};
    public String getDir(){return dir;};

    public void setNombre(String nombre){this.nombre = nombre;};
    public void setId(long id){this.id = id;};
    public void setFecha_nacimiento(String fecha_nacimiento){this.fecha_nacimiento = fecha_nacimiento;};
    public void setCiudad_nacimiento(String ciudad_nacimiento){this.ciudad_nacimiento = ciudad_nacimiento;};
    public void setTel(long tel){this.tel = tel;};
    public void setEmail(String email){this.email = email;};
    public void setDir(String dir){this.dir = dir;};
    
    public String toString(){return nombre + "," + id + "," + fecha_nacimiento+ "," + ciudad_nacimiento + "," + tel + "," + dir;};
} 
