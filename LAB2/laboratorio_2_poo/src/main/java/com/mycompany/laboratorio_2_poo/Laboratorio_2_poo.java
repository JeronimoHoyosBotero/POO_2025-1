
package com.mycompany.laboratorio_2_poo;

import java.util.Scanner;
/**
 *  Laboratorio 2 POO Java
 *  Por: Jerónimo Hoyos Botero
*/

public class Laboratorio_2_poo {
    public static void main(String[] args) {
        System.out.println("Parte A");
        Fecha objeto_fecha = new Fecha(15,5,15);
        System.out.println(objeto_fecha.toString());
        Direccion objeto_direccion = new Direccion("Calle 50","#20-15","El Poblado","Medellín","Altos del Sur","405");
        System.out.println(objeto_direccion.toString());
        Usuario objeto_usuario = new Usuario("Laura Martínez",987654321,"15-5-2005","Cali",311987543,"laura.martinez@correo.com","Calle 50,#20-15,El Poblado,Medellín,Altos del Sur,405");
        System.out.println(objeto_usuario.toString());

        System.out.println("Parte B");
        System.out.println("Creacion usuario");
        System.out.println("Ingrese los datos de forma correcta");

        Scanner sc = new Scanner(System.in);
        System.out.println("Nombre: ");
        String input_nombre = sc.nextLine();
        System.out.println("ID: ");
        long input_id = sc.nextLong();
        sc.nextLine();
        System.out.println("Fecha de nacimiento (dd-mm-aa): ");
        String input_fecha_nacimiento = sc.nextLine();
        System.out.println("Ciudad de nacimiento: ");
        String input_ciudad_nacimiento = sc.nextLine();
        System.out.println("Teléfono: ");
        long input_tel = sc.nextLong();
        sc.nextLine();
        System.out.println("Correo electrónico: ");
        String input_email = sc.nextLine();
        System.out.println("Direccion (calle,nomenclatura,barrio,ciudad,edificio,apto): ");
        String input_direccion = sc.nextLine();
        sc.close();

        Usuario input_objeto_usuario = new Usuario(input_nombre,input_id,input_fecha_nacimiento,input_ciudad_nacimiento,input_tel,input_email,input_direccion);
        String[] split_fecha = input_fecha_nacimiento.split("-");
        Fecha input_objeto_fecha = new Fecha(Integer.parseInt(split_fecha[0]),Integer.parseInt(split_fecha[1]),Integer.parseInt(split_fecha[2]));
        String[] split_direccion = input_direccion.split(",");
        Direccion input_objeto_direccion = new Direccion(split_direccion[0],split_direccion[1],split_direccion[2],split_direccion[3],split_direccion[4],split_direccion[5]);
        System.out.println("Atributos Usuario");
        System.out.println(input_objeto_usuario.toString());
        System.out.println("Atributos Fecha");
        System.out.println(input_objeto_fecha.toString());
        System.out.println("Atributos dirección");
        System.out.println(input_objeto_direccion.toString());
    };
}
