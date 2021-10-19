package covid;

public class Suivie {
	private int id, date , heure,id_malade;
	private float temperature;
	private String description;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getDate() {
		return date;
	}
	public void setDate(int date) {
		this.date = date;
	}
	public int getHeure() {
		return heure;
	}
	public void setHeure(int heure) {
		this.heure = heure;
	}
	public int getId_malade() {
		return id_malade;
	}
	public void setId_malade(int id_malade) {
		this.id_malade = id_malade;
	}
	public float getTemperature() {
		return temperature;
	}
	public void setTemperature(float temperature) {
		this.temperature = temperature;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Suivie(int id, int date, int heure, int id_malade, float temperature, String description) {
		super();
		this.id = id;
		this.date = date;
		this.heure = heure;
		this.id_malade = id_malade;
		this.temperature = temperature;
		this.description = description;
	}
	public Suivie() {
		super();
	}
	
	
	

}
