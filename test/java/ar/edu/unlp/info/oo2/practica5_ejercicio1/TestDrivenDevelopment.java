package ar.edu.unlp.info.oo2.practica5_ejercicio1;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.ArrayList;
import java.util.List;

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
	Song zambaParaOlvidar;
	Song porUnaCabeza;
	Album mercedesSosaAlbum;
	List<Song> user1Music;
	
	@BeforeEach
	void setUp () throws Exception{
		user1Music = new ArrayList<Song>();
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
		
		album = new Album("Cantora, un viaje intimo", mercedesSosa);
		mercedesSosaAlbum = album;
		song = new Song("Zamba para olvidar", mercedesSosa, "Zamba");
		zambaParaOlvidar = song;
		album.addSong(song);
		user1.addSong(song);
		user1Music.add(song);
		song = new Song("Todo cambia", mercedesSosa, "Folk");
		album.addSong(song);
		
		album = new Album("11",abelPintos);
		song = new Song("Sin principio sin final", abelPintos, "Pop");
		album.addSong(song);
		song = new Song("La llave", abelPintos, "Pop");
		album.addSong(song);
		song = new Song("Oncemil", abelPintos, "Pop");
		album.addSong(song);
		album = new Album("Suenio dorado",abelPintos);
		song = new Song("El amor de mi vida", abelPintos, "Pop");
		user1.addSong(song);
		user1Music.add(song);
		album.addSong(song);
		
		album = new Album("El canto del viento",atahualpaYupanqui);
		song = new Song("Perdido", atahualpaYupanqui, "Payada");
		album.addSong(song);
		
		song = new Song("Por una cabeza", carlosGardel, "Tango");
		porUnaCabeza = song;
		song = new Song("Mi buenos aires querido", carlosGardel, "Tango");
		song = new Song("El dia que me quieras", carlosGardel, "Tango");
		user1.addSong(song);
		user1Music.add(song);
		
		album = new Album("La pura verdad",chaquenioPalavecino);
		song = new Song("Amor salvaje", chaquenioPalavecino, "Folk");
		album.addSong(song);
		song = new Song("La ley y la trampa", chaquenioPalavecino, "Folk");
		user1.addSong(song);
		user1Music.add(song);
		album.addSong(song);
		
	}

	@Test
	public void autorBusqueda() {
		assertEquals("Perdido", spOOtify.buscarToString("yup"));
		assertEquals("Zamba para Olvida, Todo cambia, Sin principio sin final, La llave, "
				+ "Oncemil, El amor de mi vida, Por una cabeza, "
				+ "Mi buenos aires querido, El dia que me quieras",
				spOOtify.buscarToString("os"));
	}

	@Test
	public void generoBusqueda() {
		assertEquals("Por una cabeza, Mi buenos aires querido, El dia que me quieras", spOOtify.buscarToString("tango"));
		assertEquals("Todo cambia, Amor salvaje, La ley y la trampa", spOOtify.buscarToString("folk"));
	}
	
	@Test
	public void albumBusqueda() {
		assertEquals("Zamba para Olvida, Todo cambia", spOOtify.buscarToString("cantora"));
		assertEquals("Zamba para Olvida, Todo cambia, Perdido", spOOtify.buscarToString("to"));
	}
	
	@Test
	public void tituloBusqueda() {
		assertEquals("Oncemil, El amor de mi vida, Mi buenos aires querido, ", spOOtify.buscar("mi"));
		assertEquals("Zamba para olvidar, El amor de mi vida", spOOtify.buscar("da"));
	}
	
	@Test
	public void agregarCanciones() {
		assertEquals(user1Music, user1.myMusic());
		user1.addSong(song);
		assertEquals(user1Music, user1.myMusic());
	}
	
	@Test
	public void borrarCanciones() {
		user1.removeSong(song);
		user1Music.remove(song);
		assertEquals(user1Music, user1.myMusic());
	}
	
	@Test
	public void verificarAutor() {
		assertEquals(mercedesSosa,zambaParaOlvidar.author());
		assertEquals(carlosGardel,porUnaCabeza.author());
		
	}
	
	@Test
	public void verificaralbum() {
		assertEquals(mercedesSosaAlbum, zambaParaOlvidar.album());
		assertEquals(null, porUnaCabeza.album());
	}
	
	@Test
	public void verificarAutorSpOO() {
		assertEquals(5, spOOtify.authors().size());
		assertEquals(mercedesSosa, spOOtify.authors().get(0));
	}
	
	@Test
	public void verificarUsersSpOO() {
		assertEquals(2, spOOtify.users().size());
		assertEquals(user1, spOOtify.users().get(0));
	}
}
