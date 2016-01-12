/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dao;

import com.ec.entidades.Paciente;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author stand
 */
@ManagedBean(name= "usuariop")
@SessionScoped

public class pacienteControl {
    public String nombre;
    public String apellido;
    public String correo;
    public String login;
    public String password;
    public String password2;

    
    public String validarLogin() throws Exception{
        pacienteDao paciente = new pacienteDao();
        Paciente p = paciente.validarPaciente(login, password);
        if (p != null) {
            nombre = p.getNombresPaciente();
            apellido= p.getApellidosPaciente();
            correo= p.getEmailPaciente();
            password2 = p.getPasswordPaciente();
            return "home2";
        } else {
            return "index";
        }
    }
    
    
    public String getPassword2() {
        return password2;
    }

    public void setPassword2(String password2) {
        this.password2 = password2;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getCorreo() {
        return correo;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }
}
