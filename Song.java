public class Song {

	// Για κάθε τραγούδι ο τίτλος ,ο τραγουδιστής και το url.
static Song songs[]=new Song[10];

	private String title;
	private Singer singer;
	static String url;
    static int counter=0;

	public Song(String title_1,Singer singer_1,String url_1) {
		this.title = title_1;
		this.singer=singer_1;
		this.url=url_1;
		songs[counter]=this;
		counter ++;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title_1) {
		this.title = title_1;
	}

	public Singer getSinger() {
		return singer;
	}

	public void setSinger(Singer singer_1) {
		this.singer = singer_1;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url_1) {
		this.url = url_1;
	}

	public String toString() {
		return "Song : title"+title +",singer : "+ singer + ", url=" + url ;
	}
}
