package ma.ensias.miniprojet.Model;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Date;

//@Entity
//@Table(name = "users")
public class User implements Serializable {

    public User() {
    }

    public User(long id,String Username, String Password,String nom, String prenom, Date dateNaissance, Double soldeCompte, String adresse, String ville, String codePostal, String pays, String role) {
        this.id = id;
        this.Username = Username;
        this.password = Password;
        this.nom = nom;
        this.prenom = prenom;
        this.dateNaissance = dateNaissance;
        this.soldeCompte = soldeCompte;
        this.adresse = adresse;
        this.ville = ville;
        this.codePostal = codePostal;
        this.pays = pays;
        this.role = role;
    }

    //@Id
    //@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String Username;
    private String password;
    private String nom;
    private String prenom;

    //@Temporal(TemporalType.DATE)
    private Date dateNaissance;

    private Double soldeCompte;
    private String adresse;
    private String ville;
    private String codePostal;
    private String pays;
    private String role;

    public Long getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public Date getDateNaissance() {
        return dateNaissance;
    }

    public Double getSoldeCompte() {
        return soldeCompte;
    }

    public String getAdresse() {
        return adresse;
    }

    public String getVille() {
        return ville;
    }

    public String getCodePostal() {
        return codePostal;
    }

    public String getPays() {
        return pays;
    }

    public String getRole() {
        return role;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setDateNaissance(Date dateNaissance) {
        this.dateNaissance = dateNaissance;
    }

    public void setSoldeCompte(Double soldeCompte) {
        this.soldeCompte = soldeCompte;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public void setCodePostal(String codePostal) {
        this.codePostal = codePostal;
    }

    public void setPays(String pays) {
        this.pays = pays;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String username) {
        Username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

