package Clase09.Teoria.domain;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Cliente extends Persona {
    private int idCliente;
    private static int contadorClientes;
    private Date fechaRegistro;
    private boolean vip;

    public Cliente(Date fecha, boolean vip, String nombre, char genero, int edad, String direccion) {
        super(nombre, genero, edad, direccion);
        this.fechaRegistro = fecha;
        this.idCliente = ++Cliente.contadorClientes;
        this.vip = vip;
    }

    public int getIdCliente() {
        return this.idCliente;
    }

    public Date getFechaRegistro() {
        return this.fechaRegistro;
    }

    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public boolean isVip() {
        return this.vip;
    }

    public void setVip(boolean vip) {
        this.vip = vip;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Cliente{idCliente=").append(this.idCliente);
        sb.append(", fecha=").append(this.fechaRegistro != null ? new SimpleDateFormat("dd-MM-yyyy").format(this.fechaRegistro) : null);
        sb.append(", vip=").append(this.vip);
        sb.append(", ").append(super.toString());
        sb.append("}");
        return sb.toString();
    }
}
