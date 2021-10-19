package covid;

public class medecin_superviseur {
	private int id,telephone;
	private String nom,email,mdp;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getTelephone() {
		return telephone;
	}
	public void setTelephone(int telephone) {
		this.telephone = telephone;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMdp() {
		return mdp;
	}
	public void setMdp(String mdp) {
		this.mdp = mdp;
	}
	public medecin_superviseur(int id, int telephone, String nom, String email, String mdp) {
		super();
		this.id = id;
		this.telephone = telephone;
		this.nom = nom;
		this.email = email;
		this.mdp = mdp;
	}
	public medecin_superviseur() {
		super();
	}
	

}
