package com.android.imageretriever.modelo;

import java.util.Date;

import android.graphics.drawable.Drawable;

public class Individuo {
	
	private long idIndividuo;
	private Drawable imagen;
	private String nombres;
	private String apellidoPaterno;
	private String apellidoMaterno;
	private String fechaNacimiento;
	private String sexo;
	private String direccion;
	private int[] caracteristicas;
	
	public Individuo(long idIndividuo, Drawable imagen, String nombres,
			String apellidoPaterno, String apellidoMaterno,
			String fechaNacimiento, String sexo, String direccion) {
		this.idIndividuo = idIndividuo;
		this.imagen = imagen;
		this.nombres = nombres;
		this.apellidoPaterno = apellidoPaterno;
		this.apellidoMaterno = apellidoMaterno;
		this.fechaNacimiento = fechaNacimiento;
		this.sexo = sexo;
		this.direccion = direccion;
	}

	public long getDni() {
		return idIndividuo;
	}

	public void setDni(long dni) {
		this.idIndividuo = dni;
	}

	public Drawable getImagen() {
		return imagen;
	}

	public void setImagen(Drawable imagen) {
		this.imagen = imagen;
	}

	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public String getApellidoPaterno() {
		return apellidoPaterno;
	}

	public void setApellidoPaterno(String apellidoPaterno) {
		this.apellidoPaterno = apellidoPaterno;
	}

	public String getApellidoMaterno() {
		return apellidoMaterno;
	}

	public void setApellidoMaterno(String apellidoMaterno) {
		this.apellidoMaterno = apellidoMaterno;
	}

	public String getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(String fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
	
}
