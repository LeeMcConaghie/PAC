package uk.ac.belfastmet.bluesrock.domain;

public class Album {

	//instance variables, properties
		private String albumName;
		private String guitars;
		private String image;
		private String artist;
		
//Constructors
	public Album(String artist, String image, String albumName, String guitars) {
		super();
		this.albumName = albumName;
		this.guitars = guitars;
		this.image = image;
		this.artist = artist;
	}
	
	//Getters and Setters
	public String getArtist() {
		return artist;
	}
	
	public String getAlbumName() {
		return albumName;
	}
	public void setAlbumName(String albumName) {
		this.albumName = albumName;
	}
	public String getGuitars() {
		return guitars;
	}
	public void setGuitars(String guitars) {
		this.guitars = guitars;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public void setArtist(String artist) {
		this.artist = artist;
	}
	
	
	



}