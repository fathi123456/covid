package covid;

public class Malade {

	private String id ,prenom ,nom,adresse, id_parent;
	private int telephone;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public String getId_parent() {
		return id_parent;
	}
	public void setId_parent(String id_parent) {
		this.id_parent = id_parent;
	}
	public int getTelephone() {
		return telephone;
	}
	public void setTelephone(int telephone) {
		this.telephone = telephone;
	}
	public Malade(String id, String prenom, String nom, String adresse, String id_parent, int telephone) {
		super();
		this.id = id;
		this.prenom = prenom;
		this.nom = nom;
		this.adresse = adresse;
		this.id_parent = id_parent;
		this.telephone = telephone;
	}
	public Malade() {
		super();
	}
	
	
}
