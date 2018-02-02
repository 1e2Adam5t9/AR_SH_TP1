package projet;

public class CV {

	public static void main( String[] args ) {
		System.out.println( "Bienvenue chez Barette!" );

	}

	public CV() {
		this.nom = "";
		this.prenom = "";
		this.formation = "";
		this.attentes = "";
		this.anneesExperience = 0;
	}

	//constructeur avec paramètres
	public CV( String nom, String prenom, String formation, String attentes, String[] tabCompetences, int anneesExperience ) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.formation = formation;
		this.attentes = attentes;
		this.tabCompetences = tabCompetences;
		this.anneesExperience = anneesExperience;
	}

	public String nom, prenom, formation, attentes;
	public String[] tabCompetences;
	public int anneesExperience;

	public void affiche() {
		System.out.println( this.nom + "\n" + this.prenom + "\n" + this.formation + "\n" + this.attentes + "\n" + this.anneesExperience );
		for ( int i = 0; i < this.tabCompetences.length; i++ ) {
			System.out.println( "\n" + this.tabCompetences[i] );
		}
}

