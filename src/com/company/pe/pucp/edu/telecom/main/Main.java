package com.company.pe.pucp.edu.telecom.main;

import com.company.pe.pucp.edu.telecom.entity.Instructor;
import com.company.pe.pucp.edu.telecom.entity.JefePractica;
import com.company.pe.pucp.edu.telecom.entity.PersonalAdministrativo;
import com.company.pe.pucp.edu.telecom.entity.Profesor;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("1. Leer Datos");
        System.out.println("2. Agregar Usuario");
        System.out.println("3. Buscar Usuario");
        System.out.println("4. Escribir Directorio");

        System.out.print("Ingrese una opcion:");

        String opcion;
        Scanner teclado = new Scanner(System.in);
        opcion = teclado.nextLine();


        switch(opcion) {
            case "1":
                System.out.println("1");
                break;
            case "2":
                System.out.println("1. Instructor");
                System.out.println("2. Jefe de Practica");
                System.out.println("3. Profesor");
                System.out.println("4. Personal Administrativo");
                System.out.print("Ingrese una opcion:");
                String tipo;
                Scanner tecl = new Scanner(System.in);
                tipo = tecl.nextLine();


                System.out.print("Ingrese codigo:");
                String codigo;
                Scanner tcodigo = new Scanner(System.in);
                codigo = tcodigo.nextLine();

                System.out.print("Ingrese Nombres:");
                String nombre;
                Scanner tnombre = new Scanner(System.in);
                nombre = tnombre.nextLine();

                System.out.print("Ingrese Apellido:");
                String apellido;
                Scanner tapellido = new Scanner(System.in);
                apellido = tapellido.nextLine();

                System.out.print("Ingrese telefono:");
                String telefono;
                Scanner ttelefono = new Scanner(System.in);
                telefono = ttelefono.nextLine();

                System.out.print("Ingrese anexo:");
                String anexo;
                Scanner tanexo = new Scanner(System.in);
                anexo = tcodigo.nextLine();

                System.out.print("Ingrese Departamento:");
                String departamento;
                Scanner tdepartamento = new Scanner(System.in);
                departamento = tdepartamento.nextLine();


                switch (tipo){

                    case "1":
                        Instructor i = new Instructor();
                        i.setCodigoPucp(codigo);
                        i.setNombre(nombre);
                        i.setApellido(apellido);
                        i.setTelefono(telefono);
                        i.setAnexo(anexo);
                        i.setDepartamento(departamento);

                        System.out.print("Ingrese Año Inicio:");
                        String yearini;
                        Scanner tyearini = new Scanner(System.in);
                        yearini = tyearini.nextLine();
                        System.out.print("Ingrese Cantidad de cursos:");
                        String cursos;
                        Scanner tcursos = new Scanner(System.in);
                        cursos = tcursos.nextLine();

                        System.out.print("Ingrese Ciclo actual:");
                        String ciclo;
                        Scanner tciclo = new Scanner(System.in);
                        ciclo = tciclo.nextLine();

                        i.setYearInicio(yearini);
                        i.setCantidadCursos(cursos);
                        i.setCiclo(ciclo);

                        System.out.println(i.getNombre());


                        break;
                    case "2":
                        JefePractica j = new JefePractica();
                        j.setCodigoPucp(codigo);
                        j.setNombre(nombre);
                        j.setApellido(apellido);
                        j.setTelefono(telefono);
                        j.setAnexo(anexo);
                        j.setDepartamento(departamento);

                        System.out.print("Ingrese Año Inicio:");
                        String yearinij;
                        Scanner tyearinij = new Scanner(System.in);
                        yearinij = tyearinij.nextLine();
                        System.out.print("Ingrese Cantidad de cursos:");
                        String cursosj;
                        Scanner tcursosj = new Scanner(System.in);
                        cursosj = tcursosj.nextLine();

                        System.out.print("Ingrese año de egreso:");
                        String egreso;
                        Scanner tegreso = new Scanner(System.in);
                        egreso = tegreso.nextLine();

                        j.setYearInicio(yearinij);
                        j.setCantidadCursos(cursosj);
                        j.setYearEgreso(egreso);

                        System.out.println(j.getNombre());

                        break;
                    case "3":
                        Profesor p = new Profesor();
                        p.setCodigoPucp(codigo);
                        p.setNombre(nombre);
                        p.setApellido(apellido);
                        p.setTelefono(telefono);
                        p.setAnexo(anexo);
                        p.setDepartamento(departamento);

                        System.out.print("Ingrese Año Inicio:");
                        String yearinip;
                        Scanner tyearinip = new Scanner(System.in);
                        yearinip = tyearinip.nextLine();
                        System.out.print("Ingrese Cantidad de cursos:");
                        String cursosp;
                        Scanner tcursosp = new Scanner(System.in);
                        cursosp = tcursosp.nextLine();

                        p.setYearInicio(yearinip);
                        p.setCantidadCursos(cursosp);

                        System.out.print("Ingrese facultad:");
                        String facultad;
                        Scanner tfacultad = new Scanner(System.in);
                        facultad = tfacultad.nextLine();

                        p.setFacultad(facultad);

                        System.out.println(p.getNombre());

                        break;
                    case "4":
                        PersonalAdministrativo a = new PersonalAdministrativo();
                        a.setCodigoPucp(codigo);
                        a.setNombre(nombre);
                        a.setApellido(apellido);
                        a.setTelefono(telefono);
                        a.setAnexo(anexo);
                        a.setDepartamento(departamento);

                        System.out.print("Ingrese cargo:");
                        String cargo;
                        Scanner tcargo = new Scanner(System.in);
                        cargo = tcargo.nextLine();
                        a.setCargo(cargo);

                        System.out.println(a.getNombre());

                        break;
                }



                break;
            case "3":
                System.out.println("3");
                break;
            case "4":
                System.out.println("4");
                break;
            default:
                System.out.println("opcion invalida");
        }


    }
}
