
public class CD extends AudioVideo {
	
	String Artist;
	int numberOfTracks;
	public String getArtist() {
		return Artist;
	}
	public void setArtist(String artist) {
		Artist = artist;
	}
	public int getNumberOfTracks() {
		return numberOfTracks;
	}
	public void setNumberOfTracks(int numberOfTracks) {
		this.numberOfTracks = numberOfTracks;
	}
	
void print () {
		
		System.out.print(Artist + ", " + numberOfTracks);
	}


}
