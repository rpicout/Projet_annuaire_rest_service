package ima.entities;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.hateoas.ResourceSupport;

@Document
public class Etablissement extends ResourceSupport {
	
	private String Identifiant_de_l_etablissement;
	private String Nom_etablissement;
	private String Type_etablissement;
	private String Statut_public_prive;
	private String Adresse_1;
	private String Adresse_2;
	private String Adresse_3;
	private String Code_postal; 
	private String Code_commune;
	private String Nom_commune;
	private String Code_departement;
	private String Code_academie;
	private String Code_region;
	private String Ecole_maternelle; 
	private String Ecole_elementaire;
	private String Voie_generale;
	private String Voie_technologique;
	private String Voie_professionnelle;
	private String Telephone;
	private String Fax;
	private String Web;
	private String Mail;
	private String Restauration;
	private String Hebergement;
	private String ULIS;
	private String Apprentissage; 
	private String Segpa; 
	private String Section_arts; 
	private String Section_cinema;	
	private String Section_theatre;
	private String Section_sport; 	
	private String Section_Stringernationale;
	private String Section_europeenne;
	private String Lycee_Agricole;
	private String Lycee_militaire;
	private String Lycee_des_metiers;
	private String Post_BAC; 
	private String Appartenance_Education_Prioritaire;
	private String GRETA;//TODO c'est peut etre un autre Type
	private String SIREN_SIRET;
	private String Nombre_d_eleves;
	private String Fiche_onisep;
	private String Type_contrat_prive;
	private String Libelle_departement;
	private String Libelle_academie;
	private String Libelle_region;
	private String coordonnee_X;
	private String coordonnee_Y;
	private String epsg;
	private String nom_circonscription;
	private String latitude;
	private String longitude;
	private String precision_localisation;
	private String date_ouverture;
	private String date_maj_ligne; 
	private String etat;
	private String ministere_tutelle;
	private String etablissement_multi_lignes;
	private String rpi_concentre; 
	private String rpi_disperse; 
	private String code_nature;
	private String libelle_nature;
	
	
	public String getIdentifiant_de_l_etablissement() {
		return Identifiant_de_l_etablissement;
	}
	public void setIdentifiant_de_l_etablissement(String identifiant_de_l_etablissement) {
		Identifiant_de_l_etablissement = identifiant_de_l_etablissement;
	}
	
	public String getNom_etablissement() {
		return Nom_etablissement;
	}
	public void setNom_etablissement(String nom_etablissement) {
		Nom_etablissement = nom_etablissement;
	}
	
	public String getType_etablissement() {
		return Type_etablissement;
	}
	public void setType_etablissement(String type_etablissement) {
		Type_etablissement = type_etablissement;
	}
	
	public String getStatut_public_prive() {
		return Statut_public_prive;
	}
	public void setStatut_public_prive(String statut_public_prive) {
		Statut_public_prive = statut_public_prive;
	}
	
	public String getAdresse_1() {
		return Adresse_1;
	}
	public void setAdresse_1(String adresse_1) {
		Adresse_1 = adresse_1;
	}
	
	public String getAdresse_2() {
		return Adresse_2;
	}
	public void setAdresse_2(String adresse_2) {
		Adresse_2 = adresse_2;
	}
	
	public String getAdresse_3() {
		return Adresse_3;
	}
	public void setAdresse_3(String adresse_3) {
		Adresse_3 = adresse_3;
	}
	
	public String getCode_postal() {
		return Code_postal;
	}
	public void setCode_postal(String code_postal) {
		Code_postal = code_postal;
	}
	
	public String getCode_commune() {
		return Code_commune;
	}
	public void setCode_commune(String code_commune) {
		Code_commune = code_commune;
	}
	
	public String getNom_commune() {
		return Nom_commune;
	}
	public void setNom_commune(String nom_commune) {
		Nom_commune = nom_commune;
	}
	
	public String getCode_departement() {
		return Code_departement;
	}
	public void setCode_departement(String code_departement) {
		Code_departement = code_departement;
	}
	
	public String getCode_academie() {
		return Code_academie;
	}
	public void setCode_academie(String code_academie) {
		Code_academie = code_academie;
	}
	
	public String getCode_region() {
		return Code_region;
	}
	public void setCode_region(String code_region) {
		Code_region = code_region;
	}
	
	public String getEcole_maternelle() {
		return Ecole_maternelle;
	}
	public void setEcole_maternelle(String ecole_maternelle) {
		Ecole_maternelle = ecole_maternelle;
	}
	
	public String getEcole_elementaire() {
		return Ecole_elementaire;
	}
	public void setEcole_elementaire(String ecole_elementaire) {
		Ecole_elementaire = ecole_elementaire;
	}
	
	public String getVoie_generale() {
		return Voie_generale;
	}
	public void setVoie_generale(String voie_generale) {
		Voie_generale = voie_generale;
	}
	
	public String getVoie_technologique() {
		return Voie_technologique;
	}
	public void setVoie_technologique(String voie_technologique) {
		Voie_technologique = voie_technologique;
	}
	
	public String getVoie_professionnelle() {
		return Voie_professionnelle;
	}
	public void setVoie_professionnelle(String voie_professionnelle) {
		Voie_professionnelle = voie_professionnelle;
	}
	
	public String getTelephone() {
		return Telephone;
	}
	public void setTelephone(String telephone) {
		Telephone = telephone;
	}
	
	public String getFax() {
		return Fax;
	}
	public void setFax(String fax) {
		Fax = fax;
	}
	
	public String getWeb() {
		return Web;
	}
	public void setWeb(String web) {
		Web = web;
	}
	
	public String getMail() {
		return Mail;
	}
	public void setMail(String mail) {
		Mail = mail;
	}
	
	public String getRestauration() {
		return Restauration;
	}
	public void setRestauration(String restauration) {
		Restauration = restauration;
	}
	
	public String getHebergement() {
		return Hebergement;
	}
	public void setHebergement(String hebergement) {
		Hebergement = hebergement;
	}
	
	public String getULIS() {
		return ULIS;
	}
	public void setULIS(String uLIS) {
		ULIS = uLIS;
	}
	
	public String getApprentissage() {
		return Apprentissage;
	}
	public void setApprentissage(String apprentissage) {
		Apprentissage = apprentissage;
	}
	
	public String getSegpa() {
		return Segpa;
	}
	public void setSegpa(String segpa) {
		Segpa = segpa;
	}
	
	public String getSection_arts() {
		return Section_arts;
	}
	public void setSection_arts(String section_arts) {
		Section_arts = section_arts;
	}
	
	public String getSection_cinema() {
		return Section_cinema;
	}
	public void setSection_cinema(String section_cinema) {
		Section_cinema = section_cinema;
	}
	
	public String getSection_theatre() {
		return Section_theatre;
	}
	public void setSection_theatre(String section_theatre) {
		Section_theatre = section_theatre;
	}
	
	public String getSection_sport() {
		return Section_sport;
	}
	public void setSection_sport(String section_sport) {
		Section_sport = section_sport;
	}
	
	public String getSection_Stringernationale() {
		return Section_Stringernationale;
	}
	public void setSection_Stringernationale(String section_Stringernationale) {
		Section_Stringernationale = section_Stringernationale;
	}
	
	public String getSection_europeenne() {
		return Section_europeenne;
	}
	public void setSection_europeenne(String section_europeenne) {
		Section_europeenne = section_europeenne;
	}
	
	public String getLycee_Agricole() {
		return Lycee_Agricole;
	}
	public void setLycee_Agricole(String lycee_Agricole) {
		Lycee_Agricole = lycee_Agricole;
	}
	
	public String getLycee_militaire() {
		return Lycee_militaire;
	}
	public void setLycee_militaire(String lycee_militaire) {
		Lycee_militaire = lycee_militaire;
	}
	
	public String getLycee_des_metiers() {
		return Lycee_des_metiers;
	}
	public void setLycee_des_metiers(String lycee_des_metiers) {
		Lycee_des_metiers = lycee_des_metiers;
	}
	
	public String getPost_BAC() {
		return Post_BAC;
	}
	public void setPost_BAC(String post_BAC) {
		Post_BAC = post_BAC;
	}
	
	public String getAppartenance_Education_Prioritaire() {
		return Appartenance_Education_Prioritaire;
	}
	public void setAppartenance_Education_Prioritaire(String appartenance_Education_Prioritaire) {
		Appartenance_Education_Prioritaire = appartenance_Education_Prioritaire;
	}
	
	public String getGRETA() {
		return GRETA;
	}
	public void setGRETA(String gRETA) {
		GRETA = gRETA;
	}
	
	public String getSIREN_SIRET() {
		return SIREN_SIRET;
	}
	public void setSIREN_SIRET(String sIREN_SIRET) {
		SIREN_SIRET = sIREN_SIRET;
	}
	
	public String getNombre_d_eleves() {
		return Nombre_d_eleves;
	}
	public void setNombre_d_eleves(String nombre_d_eleves) {
		Nombre_d_eleves = nombre_d_eleves;
	}
	
	public String getFiche_onisep() {
		return Fiche_onisep;
	}
	public void setFiche_onisep(String fiche_onisep) {
		Fiche_onisep = fiche_onisep;
	}
	
	public String getType_contrat_prive() {
		return Type_contrat_prive;
	}
	public void setType_contrat_prive(String type_contrat_prive) {
		Type_contrat_prive = type_contrat_prive;
	}
	
	public String getLibelle_departement() {
		return Libelle_departement;
	}
	public void setLibelle_departement(String libelle_departement) {
		Libelle_departement = libelle_departement;
	}
	
	public String getLibelle_academie() {
		return Libelle_academie;
	}
	public void setLibelle_academie(String libelle_academie) {
		Libelle_academie = libelle_academie;
	}
	
	public String getLibelle_region() {
		return Libelle_region;
	}
	public void setLibelle_region(String libelle_region) {
		Libelle_region = libelle_region;
	}
	
	public String getCoordonnee_X() {
		return coordonnee_X;
	}
	public void setCoordonnee_X(String coordonnee_X) {
		this.coordonnee_X = coordonnee_X;
	}
	
	public String getCoordonnee_Y() {
		return coordonnee_Y;
	}
	public void setCoordonnee_Y(String coordonnee_Y) {
		this.coordonnee_Y = coordonnee_Y;
	}
	
	public String getEpsg() {
		return epsg;
	}
	public void setEpsg(String epsg) {
		this.epsg = epsg;
	}
	
	public String getNom_circonscription() {
		return nom_circonscription;
	}
	public void setNom_circonscription(String nom_circonscription) {
		this.nom_circonscription = nom_circonscription;
	}
	
	public String getLatitude() {
		return latitude;
	}
	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}
	
	public String getLongitude() {
		return longitude;
	}
	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}
	
	public String getPrecision_localisation() {
		return precision_localisation;
	}
	public void setPrecision_localisation(String precision_localisation) {
		this.precision_localisation = precision_localisation;
	}
	
	public String getdate_ouverture() {
		return date_ouverture;
	}
	public void setDate_ouverture(String date_ouverture) {
		this.date_ouverture = date_ouverture;
	}
	
	public String getdate_maj_ligne() {
		return date_maj_ligne;
	}
	public void setDate_maj_ligne(String date_maj_ligne) {
		this.date_maj_ligne = date_maj_ligne;
	}
	
	public String getEtat() {
		return etat;
	}
	public void setEtat(String etat) {
		this.etat = etat;
	}
	
	public String getMinistere_tutelle() {
		return ministere_tutelle;
	}
	public void setMinistere_tutelle(String ministere_tutelle) {
		this.ministere_tutelle = ministere_tutelle;
	}
	
	public String getEtablissement_multi_lignes() {
		return etablissement_multi_lignes;
	}
	public void setEtablissement_multi_lignes(String etablissement_multi_lignes) {
		this.etablissement_multi_lignes = etablissement_multi_lignes;
	}
	
	public String getRpi_concentre() {
		return rpi_concentre;
	}
	public void setRpi_concentre(String rpi_concentre) {
		this.rpi_concentre = rpi_concentre;
	}
	
	public String getRpi_disperse() {
		return rpi_disperse;
	}
	public void setRpi_disperse(String rpi_disperse) {
		this.rpi_disperse = rpi_disperse;
	}
	
	public String getCode_nature() {
		return code_nature;
	}
	public void setCode_nature(String code_nature) {
		this.code_nature = code_nature;
	}
	
	public String getLibelle_nature() {
		return libelle_nature;
	}
	public void setLibelle_nature(String libelle_nature) {
		this.libelle_nature = libelle_nature;
	}
}
