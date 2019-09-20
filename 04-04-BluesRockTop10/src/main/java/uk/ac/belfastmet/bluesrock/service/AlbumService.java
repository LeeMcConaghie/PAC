package uk.ac.belfastmet.bluesrock.service;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import uk.ac.belfastmet.bluesrock.domain.Album;


@Service
public class AlbumService {

	private ArrayList<Album> albums;
	
	public ArrayList<Album> getAlbums() {
		
		this.albums = new ArrayList<Album>();
		
		//add top ten Album here!
		this.albums.add(new Album("Anthony Gomes", "PeaceLoveAndLoudGuitars.jpg", "Peace, Love and Loud Guitars", "fender"));
		this.albums.add(new Album("Dan Patlansky", "PerfectionKillsDanPatlansky.jpg", "Perfection Kills", "fender"));
		this.albums.add(new Album("Joe Bonamassa", "Redemption.jpg", "Redemption", "Gibson various"));
		this.albums.add(new Album("The Kris Barras Band", "Divine&Dirty.jpg", "The Divine & Dirty", "Gibson various"));
		this.albums.add(new Album("The Temperance Movement", "ADeeperCut.jpg", "A Deeper Cut", "Gibson various"));
		this.albums.add(new Album("Danielle Nicole", "CryNoMore.jpg", "Cry No More", "Gibson various"));
		this.albums.add(new Album("Marcus King Band", "CarolinaConfessions.jpg", "Carolina Confessions", "Gibson various"));
		this.albums.add(new Album("Ben Poole", "AnytimeYouNeedMe.jpg", "Anytime You Need Me", "Gibson various"));
		this.albums.add(new Album("Buddy Guy", "TheBluesIsAliveAndWell.jpg", "The Blues Is Alive and Well", "Gibson various"));
		this.albums.add(new Album("The Record Company", "AllOfThisLife.jpg", "All of This Life", "Gibson various"));
		
	
																
		return this.albums;
	}
		
		
	
}
