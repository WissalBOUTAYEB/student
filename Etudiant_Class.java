
public class Etudiant_Class {

	

	
	    private String nom;
	    private String prenom;
	    private String matricule;
	

	    public Etudiant_Class(String nom, String prenom, String matricule) {
	        this.nom = nom;
	        this.prenom = prenom;
	        this.matricule = matricule;
	       
	    }

	    public void ajouterNote(double note) {
	        this.notes.add(note);
	    }

	    public void supprimerNote(double note) {
	        if (this.notes.contains(note)) {
	            this.notes.remove(note);
	        } else {
	            System.out.println("La note n'existe pas pour cet étudiant.");
	        }
	


}
