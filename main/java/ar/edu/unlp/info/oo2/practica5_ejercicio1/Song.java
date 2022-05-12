package ar.edu.unlp.info.oo2.practica5_ejercicio1;

public class Song {
	private String name;
	private Author author;
	private String genre;

	public Song(String name, Author author, String genre) {
		this.name = name;
		this.author = author;
		author.addSong(this);
	}

	public Author author() {
		// TODO Auto-generated method stub
		return null;
	}

	public Album album() {
		// TODO Auto-generated method stub
		return null;
	}

}
