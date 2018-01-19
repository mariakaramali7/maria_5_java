public class Singer {

	// Για κάθε τραγουδιστή ,όνομα και η id

static Singer singers[]=new Singer[10];

	private String name;
	private int id;
	static int counter= 0;

	public Singer (String name_1) {
		this.name = name_1;
        singers[counter]=this;

		id=counter++;
	}

	public String getName() {
		return name;
	}

	public void setName(String name_1) {
		this.name = name_1;
	}

	public int getId() {
		return id;
	}

	public void setId(int id_1) {
		this.id = id_1;
	}

	public String toString() {
		return "Singer : name=" + name + ", id=" + id ;
	}
}
