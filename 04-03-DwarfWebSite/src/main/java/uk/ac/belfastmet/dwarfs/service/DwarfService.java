package uk.ac.belfastmet.dwarfs.service;

import org.springframework.stereotype.Service;

@Service
public class DwarfService {

	private ArrayList<Dwarf> disneyDwarfs;
	private ArrayList<Dwarf> tolkienDwarfs;
	
	public ArrayList>Dwarf> getDisneyDwarfs() {
		
		this.disneyDwarfs = new ArrayList<Dwarf>();
		
		//add disney dwarfs here!
		this.disneyDwarfs.add(new Dwarf("Sleepy", "Disney", "Sleepy.png"));
		this.disneyDwarfs.add(new Dwarf("Happy", "Disney", "Happy.png"));
		this.disneyDwarfs.add(new Dwarf("Bashful", "Disney", "Bashful.png"));
		this.disneyDwarfs.add(new Dwarf("Dopey", "Disney", "Dopey.png"));
		this.disneyDwarfs.add(new Dwarf("Doc", "Disney", "Doc.png"));
		this.disneyDwarfs.add(new Dwarf("Grumpy", "Disney", "Grumpy.png"));
		this.disneyDwarfs.add(new Dwarf("Sneezy", "Disney", "Sneezy.png"));
																
		return this.disneyDwarfs;
		
		public ArrayList>Dwarf> getTolkienDwarfs() {
			
			this.tolkienDwarfs = new ArrayList<Dwarf>();
			
		/*add tolkien dwarfs here!	
			this.tolkienDwarfs.add(new Dwarf("Thorin", "Tolkien", "Thorin.png"));
			this.tolkienDwarfs.add(new Dwarf("Thorin", "Tolkien", "Thorin.png"));
			this.tolkienDwarfs.add(new Dwarf("Thorin", "Tolkien", "Thorin.png"));
			this.tolkienDwarfs.add(new Dwarf("Thorin", "Tolkien", "Thorin.png"));
			this.tolkienDwarfs.add(new Dwarf("Thorin", "Tolkien", "Thorin.png"));
			this.tolkienDwarfs.add(new Dwarf("Thorin", "Tolkien", "Thorin.png"));
			this.tolkienDwarfs.add(new Dwarf("Thorin", "Tolkien", "Thorin.png"));
			this.tolkienDwarfs.add(new Dwarf("Thorin", "Tolkien", "Thorin.png"));
			this.tolkienDwarfs.add(new Dwarf("Thorin", "Tolkien", "Thorin.png"));
			this.tolkienDwarfs.add(new Dwarf("Thorin", "Tolkien", "Thorin.png"));
			*/
			
			
			
			
			
			
	}
	
}
