package ar.edu.unlp.info.oo2.practica5_ejercicio1;

import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestDrivenDevelopment {
	
	SpOOtify spOOtify;
	User user1;
	User user2;
	Author mercedesSosa;
	Author abelPintos;
	Author atahualpaYupanqui;
	Author carlosGardel;
	Author chaquenioPalavecino;	
	Album album;
	Song song;
	
	
	@BeforeEach
	void setUp () throws Exception{
		spOOtify = new SpOOtify();
		user1 = new User("ElCaptus");
		user2 = new User("Destinesiv");
		
		spOOtify.agregarUsuario(user1);
		spOOtify.agregarUsuario(user2);
		
		mercedesSosa = new Author("Mercedes Sosa");
		abelPintos = new Author("Abel Pintos");
		atahualpaYupanqui = new Author("Atahualpa Yupanqui");
		carlosGardel = new Author("Carlos Gardel");
		chaquenioPalavecino = new Author("Chaque;o Palavecino");
		
		spOOtify.agregarAutor(mercedesSosa);
		spOOtify.agregarAutor(abelPintos);
		spOOtify.agregarAutor(atahualpaYupanqui);
		spOOtify.agregarAutor(carlosGardel);
		spOOtify.agregarAutor(chaquenioPalavecino);
	}

	@Test
	public void autorBusqueda() {
	}

	@Test
	public void generoBusqueda() {
		
	}
	
	@Test
	public void albumBusqueda() {
		
	}
	
	@Test
	public void agregarCanciones() {
		
	}
	
	@Test
	public void borrarCanciones() {
		
	}
	
	@Test
	public void verificarAutor() {
		
	}
	
	@Test
	public void verificaralbum() {
		
	}
	
	@Test
	public void verificarAutorSpOO() {
		
	}
	
	@Test
	public void verificarUsersSpOO() {
		
	}
}
