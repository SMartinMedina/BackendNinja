package com.smartinm.backendninja.model;

import java.util.ArrayList;
import java.util.List;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Persona {
	
	@NotNull
	@Size(min=2, max=6)
	private String nombre;
	@NotNull
	@Min(18)
	private int age;
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Persona(String nombre, int age) {
		super();
		this.nombre = nombre;
		this.age = age;
	}
	public Persona() {}
}
