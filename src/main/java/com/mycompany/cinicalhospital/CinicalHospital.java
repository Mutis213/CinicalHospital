package com.mycompany.cinicalhospital;

import models.Consulta;
import models.Hospital;
import models.Doctor;

public class CinicalHospital {

    public static void main(String[] args) {
        System.out.println("===== SISTEMA DE GESTIÓN HOSPITAL CLÍNICO =====\n");
        System.out.println("1. CREANDO HOSPITAL:");
        System.out.println("-".repeat(50));
        Hospital hospital = new Hospital("Clínica Santa María", "Bogotá");
        System.out.println(" Hospital creado: " + hospital.getNombre());
        System.out.println(" Ciudad: " + hospital.getCiudad());
        System.out.println();

        System.out.println("2. REGISTRANDO CONSULTAS:");
        System.out.println("-".repeat(50));
        
        Consulta consulta1 = new Consulta("2026-03-20", "Dolor de cabeza", "Migraña moderada", 30);
        Consulta consulta2 = new Consulta("2026-03-22", "Presión arterial alta", "Hipertensión grado 2", 45);
        Consulta consulta3 = new Consulta("2026-03-25", "Dolor en el pecho", "Angina pectoris", 60);

        hospital.registrarConsulta(consulta1);
        hospital.registrarConsulta(consulta2);
        hospital.registrarConsulta(consulta3);

        System.out.println("\nDetalles de las consultas registradas:");
        System.out.println("  • " + consulta1.toString());
        System.out.println("  • " + consulta2.toString());
        System.out.println("  • " + consulta3.toString());
        System.out.println("\n✓ Total de consultas en el hospital: " + hospital.getConsulta());
        System.out.println();

        System.out.println("3. CREANDO MÉDICOS:");
        System.out.println("-".repeat(50));
        
        Doctor doctor1 = new Doctor(
            "Dr. Juan Carlos Rodríguez", 
            "1234567890",
            41,             
            301567890,
            "Neurología", 
            "MN-2020-45678",
            101
        );

        Doctor doctor2 = new Doctor(
            "Dra. María Fernanda López", 
            "9876543210",
            38, 
            310987654,
            "Cardiología", 
            "MN-2019-23456",
            202
        );

        System.out.println("Médico 1 Creado:");
        System.out.println("  • Nombre: " + doctor1.getNombre());
        System.out.println("  • Edad: " + doctor1.getEdad());
        System.out.println("  • Cédula: " + doctor1.getCedula());
        System.out.println("  • Teléfono: " + doctor1.getTelefono() + " (NUEVO)");
        System.out.println("  • Especialidad: " + doctor1.getEspecialidad());
        System.out.println("  • Tarjeta Profesional: " + doctor1.getTarjetaProfecional());
        System.out.println("  • Consultorio: " + doctor1.getConsultorio() + " (NUEVO)");
        System.out.println("  ✓ Datos de Persona inicializados correctamente con super()");

        System.out.println("\nMédico 2 Creado:");
        System.out.println("  • Nombre: " + doctor2.getNombre());
        System.out.println("  • Edad: " + doctor2.getEdad());
        System.out.println("  • Cédula: " + doctor2.getCedula());
        System.out.println("  • Teléfono: " + doctor2.getTelefono() + " (NUEVO)");
        System.out.println("  • Especialidad: " + doctor2.getEspecialidad());
        System.out.println("  • Tarjeta Profesional: " + doctor2.getTarjetaProfecional());
        System.out.println("  • Consultorio: " + doctor2.getConsultorio() + " (NUEVO)");
        System.out.println("  ✓ Datos de Persona inicializados correctamente con super()");
        System.out.println();

        // 4. MÉDICOS ATENDIENDO CONSULTAS (Demostrando DEPENDENCIA)
        System.out.println("4. MÉDICOS ATENDIENDO CONSULTAS (Demostrando Dependencia):");
        System.out.println("-".repeat(50));

        System.out.println("\nAtención Médica 1:");
        doctor1.atender(consulta1);
        System.out.println("   → Duración: " + consulta1.getDuracionMinutos() + " minutos");

        System.out.println("\nAtención Médica 2:");
        doctor1.atender(consulta2);
        System.out.println("   → Duración: " + consulta2.getDuracionMinutos() + " minutos");

        System.out.println("\nAtención Médica 3:");
        doctor2.atender(consulta3);
        System.out.println("   → Duración: " + consulta3.getDuracionMinutos() + " minutos");
        System.out.println();

        // 5. DEMOSTRANDO SETTERS (Modificar datos)
        System.out.println("5. DEMOSTRANDO SETTERS (Modificando Datos):");
        System.out.println("-".repeat(50));

        System.out.println("\nModificando consultorio del Médico 1:");
        doctor1.setConsultorio(105);
        System.out.println("  • Nuevo consultorio: " + doctor1.getConsultorio());

        System.out.println("\nModificando duración de la Consulta 1:");
        consulta1.setDuracionMinutos(40);
        System.out.println("  • Nueva duración: " + consulta1.getDuracionMinutos() + " minutos");

        System.out.println("\nModificando teléfono del Médico 2:");
        doctor2.setTelefono(320123456);
        System.out.println("  • Nuevo teléfono: " + doctor2.getTelefono());
        System.out.println();

        System.out.println("6. RESUMEN FINAL DEL SISTEMA:");
        System.out.println("-".repeat(50));
        System.out.println("\n" + hospital.toString());
        
        System.out.println("\nMédicos registrados:");
        System.out.println("  • " + doctor1.toString());
        System.out.println("  • " + doctor2.toString());
        
        System.out.println("\nConsultas en el hospital:");
        for (int i = 0; i < hospital.getConsulta().size(); i++) {
            System.out.println("  " + (i + 1) + ". " + hospital.getConsulta().get(i).toString());
        }

        System.out.println("\n===== ESTADÍSTICAS FINALES =====");
        System.out.println("Total de médicos: 2");
        System.out.println("Total de consultas: " + hospital.getConsulta());
        System.out.println("Duración total de consultas: " + (consulta1.getDuracionMinutos() + consulta2.getDuracionMinutos() + consulta3.getDuracionMinutos()) + " minutos");

        System.out.println("\n===== FIN DE LA DEMOSTRACIÓN =====");

    }
}
