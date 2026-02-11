package com.JeremyAquino.RepuestosAutomotrices.entity;

import jakarta.persistence.*;

@Entity
@Table (name = "Proveedores")

public class Proveedor {

@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column (name = "id_proveedor")
    private Integer idProveedor;

@Column (name = "nombre_proveedor")
    private String nombreProveedor;

@Column (name = "telefono_proveedor")
    private int telefonoProveedor;

@Column (name = "direccion")
    private String direccionProveedor;

@Column (name = "email_proveedor")
    private String emailEmpleado;


    //getter y setters}

    public Integer getIdProveedor() {
        return idProveedor;
    }

    public void setIdProveedor(Integer idProveedor) {
        this.idProveedor = idProveedor;
    }

    public String getNombreProveedor() {
        return nombreProveedor;
    }

    public void setNombreProveedor(String nombreProveedor) {
        this.nombreProveedor = nombreProveedor;
    }

    public String getEmailEmpleado() {
        return emailEmpleado;
    }

    public void setEmailEmpleado(String emailEmpleado) {
        this.emailEmpleado = emailEmpleado;
    }

    public String getDireccionProveedor() {
        return direccionProveedor;
    }

    public void setDireccionProveedor(String direccionProveedor) {
        this.direccionProveedor = direccionProveedor;
    }

    public int getTelefonoProveedor() {
        return telefonoProveedor;
    }

    public void setTelefonoProveedor(int telefonoProveedor) {
        this.telefonoProveedor = telefonoProveedor;
    }
}
