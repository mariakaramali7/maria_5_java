import java.util.Scanner;

public class SongTest {
	public static void main(String[] args) {

		Scanner scanner = new Scanner (System.in);

		Singer frank = new Singer ("Frank Sinatra");
		Singer wham = new Singer ("Wham!");
		Singer mariah = new Singer ("Mariah Carey");
		Singer chris = new Singer ("Chris Rea");
		Singer sia = new Singer ("Sia");

		Song song1 = new Song ("All I Want for Christmas Is You",mariah,"https://www.youtube.com/watch?v=yXQViqx6GMY" );
		Song song2 = new Song ("White Christmas",frank, "https://www.youtube.com/watch?v=q_XzZNCDWCA" );
		Song song3 = new Song ("Last Christmas",wham, "https://www.youtube.com/watch?v=E8gmARGvPlI" );
		Song song4 = new Song ("Driving home for christmas",chris, "https://www.youtube.com/watch?v=EvDxSW8mzvU");
		Song song5 = new Song ("Santa's Coming For Us",sia, "https://www.youtube.com/watch?v=V3EYjVPRClU" );
		Song song6 = new Song ("Let It Snow!Let It Snow!Let It Snow!",frank, "https://www.youtube.com/watch?v=vGRC2LYmHfU");

		Singer singers [] =new Singer [10];
		singers[0]=frank;
		singers[1]=wham;
		singers[2]=mariah;
		singers[3]=chris;
		singers[4]=sia;

		Song songs []= new Song [10];
		songs [0]=song1;
        songs [1]=song2;
        songs [2]=song3;
        songs [3]=song4;
        songs [4]=song5;
        songs [5]=song6;

		while (true){
			System.out.println("\n------ Welcome to our DMST Christmas Music Application ------");
			System.out.println("Type 1 to display singers' list ");
			System.out.println("Type 2 to display Franks' Synatra available songs ");

			int choice = scanner.nextInt();

			if (choice == 1){
				System.out.println("\nList of Singers: ");
				   for (int i=0;i<singers.length;i++){
					  if (singers[i]!= null)
						System.out.println(singers[i].toString());

				}
			}
			else if (choice == 2 ){
					int singcounter=0;
					for(int y=0; y<songs.length; y++){
					  if(songs[y]!= null){
						if (frank.equals(songs[y].getSinger())){
						  singcounter++;
						}
					}
				}
					System.out.println("\n"+singcounter+" songs were found");
					   for(int y=0; y<songs.length; y++){
						 if(songs[y]!= null){
						    if (frank.equals(songs[y].getSinger())){
						     System.out.println("song: "+songs[y].getTitle()+ " ,url to listen "+ songs[y].getUrl());

							}
						}
					}
			}
			 else  {
		    System.out.println("wrong input");
			System.out.println("\n------ Welcome to our DMST Christmas Music Application ------");
		    System.out.println("Type 1 to display singers' list ");
			System.out.println("Type 2 to display Franks' Synatra available songs ");

			choice = scanner.nextInt();
		}
	}
}
}
