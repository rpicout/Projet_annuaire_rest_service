package ima.entities;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.hateoas.ResourceSupport;

@Document
public class Etablissement extends ResourceSupport {
	
	private String identifiantdeletablissement;
	private String nometablissement;
	private String typeetablissement;
	private String statutpublicprive;
	private String adresse1;
	private String adresse2;
	private String adresse3;
	private String codepostal; 
	private String codecommune;
	private String nomcommune;
	private String codedepartement;
	private String codeacademie;
	private String coderegion;
	private String ecolematernelle; 
	private String ecoleelementaire;
	private String voiegenerale;
	private String voietechnologique;
	private String voieprofessionnelle;
	private String telephone;
	private String fax;
	private String web;
	private String mail;
	private String restauration;
	private String hebergement;
	private String ulis;
	private String apprentissage; 
	private String segpa; 
	private String sectionarts; 
	private String sectioncinema;	
	private String sectiontheatre;
	private String sectionsport; 	
	private String sectionStringernationale;
	private String sectioneuropeenne;
	private String lyceeAgricole;
	private String lyceemilitaire;
	private String lyceedesmetiers;
	private String postBAC; 
	private String appartenanceEducationPrioritaire;
	private String greta;
	private String sirenSIRET;
	private String nombredeleves;
	private String ficheonisep;
	private String typecontratprive;
	private String libelledepartement;
	private String libelleacademie;
	private String libelleregion;
	private String coordonneeX;
	private String coordonneeY;
	private String epsg;
	private String nomcirconscription;
	private String latitude;
	private String longitude;
	private String precisionlocalisation;
	private String dateouverture;
	private String datemajligne; 
	private String etat;
	private String ministeretutelle;
	private String etablissementmultilignes;
	private String rpiconcentre; 
	private String rpidisperse; 
	private String codenature;
	private String libellenature;
	
	
	public String getIdentifiantdeletablissement() {
		return identifiantdeletablissement;
	}
	public void setIdentifiantdeletablissement(String identifiantdeletablissement) {
		this.identifiantdeletablissement = identifiantdeletablissement;
	}
	
	public String getNometablissement() {
		return nometablissement;
	}
	public void setNometablissement(String nometablissement) {
		this.nometablissement = nometablissement;
	}
	
	public String getTypeetablissement() {
		return typeetablissement;
	}
	public void setTypeetablissement(String typeetablissement) {
		this.typeetablissement = typeetablissement;
	}
	
	public String getStatutpublicprive() {
		return statutpublicprive;
	}
	public void setStatutpublicprive(String statutpublicprive) {
		this.statutpublicprive = statutpublicprive;
	}
	
	public String getAdresse1() {
		return adresse1;
	}
	public void setAdresse1(String adresse1) {
		this.adresse1 = adresse1;
	}
	
	public String getAdresse2() {
		return adresse2;
	}
	public void setAdresse2(String adresse2) {
		this.adresse2 = adresse2;
	}
	
	public String getAdresse3() {
		return adresse3;
	}
	public void setAdresse3(String adresse3) {
		this.adresse3 = adresse3;
	}
	
	public String getCodepostal() {
		return codepostal;
	}
	public void setCodepostal(String codepostal) {
		this.codepostal = codepostal;
	}
	
	public String getCodecommune() {
		return codecommune;
	}
	public void setCodecommune(String codecommune) {
		this.codecommune = codecommune;
	}
	
	public String getNomcommune() {
		return nomcommune;
	}
	public void setNomcommune(String nomcommune) {
		this.nomcommune = nomcommune;
	}
	
	public String getCodedepartement() {
		return codedepartement;
	}
	public void setCodedepartement(String codedepartement) {
		this.codedepartement = codedepartement;
	}
	
	public String getCodeacademie() {
		return codeacademie;
	}
	public void setCodeacademie(String codeacademie) {
		this.codeacademie = codeacademie;
	}
	
	public String getCoderegion() {
		return coderegion;
	}
	public void setCoderegion(String coderegion) {
		this.coderegion = coderegion;
	}
	
	public String getEcolematernelle() {
		return ecolematernelle;
	}
	public void setEcolematernelle(String ecolematernelle) {
		this.ecolematernelle = ecolematernelle;
	}
	
	public String getEcoleelementaire() {
		return ecoleelementaire;
	}
	public void setEcoleelementaire(String ecoleelementaire) {
		this.ecoleelementaire = ecoleelementaire;
	}
	
	public String getVoiegenerale() {
		return voiegenerale;
	}
	public void setVoiegenerale(String voiegenerale) {
		this.voiegenerale = voiegenerale;
	}
	
	public String getVoietechnologique() {
		return voietechnologique;
	}
	public void setVoietechnologique(String voietechnologique) {
		this.voietechnologique = voietechnologique;
	}
	
	public String getVoieprofessionnelle() {
		return voieprofessionnelle;
	}
	public void setVoieprofessionnelle(String voieprofessionnelle) {
		this.voieprofessionnelle = voieprofessionnelle;
	}
	
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	
	public String getFax() {
		return fax;
	}
	public void setFax(String fax) {
		this.fax = fax;
	}
	
	public String getWeb() {
		return web;
	}
	public void setWeb(String web) {
		this.web = web;
	}
	
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	
	public String getRestauration() {
		return restauration;
	}
	public void setRestauration(String restauration) {
		this.restauration = restauration;
	}
	
	public String getHebergement() {
		return hebergement;
	}
	public void setHebergement(String hebergement) {
		this.hebergement = hebergement;
	}
	
	public String getUlis() {
		return ulis;
	}
	public void setUlis(String ulis) {
		this.ulis = ulis;
	}
	
	public String getApprentissage() {
		return apprentissage;
	}
	public void setApprentissage(String apprentissage) {
		this.apprentissage = apprentissage;
	}
	
	public String getSegpa() {
		return segpa;
	}
	public void setSegpa(String segpa) {
		this.segpa = segpa;
	}
	
	public String getSectionarts() {
		return sectionarts;
	}
	public void setSectionarts(String sectionarts) {
		this.sectionarts = sectionarts;
	}
	
	public String getSectioncinema() {
		return sectioncinema;
	}
	public void setSectioncinema(String sectioncinema) {
		this.sectioncinema = sectioncinema;
	}
	
	public String getSectiontheatre() {
		return sectiontheatre;
	}
	public void setSectiontheatre(String sectiontheatre) {
		this.sectiontheatre = sectiontheatre;
	}
	
	public String getSectionsport() {
		return sectionsport;
	}
	public void setSectionsport(String sectionsport) {
		this.sectionsport = sectionsport;
	}
	
	public String getSectionStringernationale() {
		return sectionStringernationale;
	}
	public void setSectionStringernationale(String sectionStringernationale) {
		this.sectionStringernationale = sectionStringernationale;
	}
	
	public String getSectioneuropeenne() {
		return sectioneuropeenne;
	}
	public void setSectioneuropeenne(String sectioneuropeenne) {
		this.sectioneuropeenne = sectioneuropeenne;
	}
	
	public String getLyceeAgricole() {
		return lyceeAgricole;
	}
	public void setLyceeAgricole(String lyceeAgricole) {
		this.lyceeAgricole = lyceeAgricole;
	}
	
	public String getLyceemilitaire() {
		return lyceemilitaire;
	}
	public void setLyceemilitaire(String lyceemilitaire) {
		this.lyceemilitaire = lyceemilitaire;
	}
	
	public String getLyceedesmetiers() {
		return lyceedesmetiers;
	}
	public void setLyceedesmetiers(String lyceedesmetiers) {
		this.lyceedesmetiers = lyceedesmetiers;
	}
	
	public String getPostBAC() {
		return postBAC;
	}
	public void setPostBAC(String postBAC) {
		this.postBAC = postBAC;
	}
	
	public String getAppartenanceEducationPrioritaire() {
		return appartenanceEducationPrioritaire;
	}
	public void setAppartenanceEducationPrioritaire(String appartenanceEducationPrioritaire) {
		this.appartenanceEducationPrioritaire = appartenanceEducationPrioritaire;
	}
	
	public String getGreta() {
		return greta;
	}
	public void setGreta(String greta) {
		this.greta = greta;
	}
	
	public String getSirenSIRET() {
		return sirenSIRET;
	}
	public void setSirenSIRET(String sirenSIRET) {
		this.sirenSIRET = sirenSIRET;
	}
	
	public String getNombredeleves() {
		return nombredeleves;
	}
	public void setNombredeleves(String nombredeleves) {
		this.nombredeleves = nombredeleves;
	}
	
	public String getFicheonisep() {
		return ficheonisep;
	}
	public void setFicheonisep(String ficheonisep) {
		this.ficheonisep = ficheonisep;
	}
	
	public String getTypecontratprive() {
		return typecontratprive;
	}
	public void setTypecontratprive(String typecontratprive) {
		this.typecontratprive = typecontratprive;
	}
	
	public String getLibelledepartement() {
		return libelledepartement;
	}
	public void setLibelledepartement(String libelledepartement) {
		this.libelledepartement = libelledepartement;
	}
	
	public String getLibelleacademie() {
		return libelleacademie;
	}
	public void setLibelleacademie(String libelleacademie) {
		this.libelleacademie = libelleacademie;
	}
	
	public String getLibelleregion() {
		return libelleregion;
	}
	public void setLibelleregion(String libelleregion) {
		this.libelleregion = libelleregion;
	}

	public String getCoordonneeX() {
		return coordonneeX;
	}
	public void setCoordonneeX(String coordonneeX) {
		this.coordonneeX = coordonneeX;
	}
	
	public String getCoordonneeY() {
		return coordonneeY;
	}
	public void setCoordonneeY(String coordonneeY) {
		this.coordonneeY = coordonneeY;
	}
	
	public String getEpsg() {
		return epsg;
	}
	public void setEpsg(String epsg) {
		this.epsg = epsg;
	}
	
	public String getNomcirconscription() {
		return nomcirconscription;
	}
	public void setNomcirconscription(String nomcirconscription) {
		this.nomcirconscription = nomcirconscription;
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
	
	public String getPrecisionlocalisation() {
		return precisionlocalisation;
	}
	public void setPrecisionlocalisation(String precisionlocalisation) {
		this.precisionlocalisation = precisionlocalisation;
	}
	
	public String getDateouverture() {
		return dateouverture;
	}
	public void setDateouverture(String dateouverture) {
		this.dateouverture = dateouverture;
	}
	
	public String getDatemajligne() {
		return datemajligne;
	}
	public void setDatemajligne(String datemajligne) {
		this.datemajligne = datemajligne;
	}
	
	public String getEtat() {
		return etat;
	}
	public void setEtat(String etat) {
		this.etat = etat;
	}
	
	public String getMinisteretutelle() {
		return ministeretutelle;
	}
	public void setMinisteretutelle(String ministeretutelle) {
		this.ministeretutelle = ministeretutelle;
	}
	
	public String getEtablissementmultilignes() {
		return etablissementmultilignes;
	}
	public void setEtablissementmultilignes(String etablissementmultilignes) {
		this.etablissementmultilignes = etablissementmultilignes;
	}
	
	public String getRpiconcentre() {
		return rpiconcentre;
	}
	public void setRpiconcentre(String rpiconcentre) {
		this.rpiconcentre = rpiconcentre;
	}
	
	public String getRpidisperse() {
		return rpidisperse;
	}
	public void setRpidisperse(String rpidisperse) {
		this.rpidisperse = rpidisperse;
	}
	
	public String getCodenature() {
		return codenature;
	}
	public void setCodenature(String codenature) {
		this.codenature = codenature;
	}
	
	public String getLibellenature() {
		return libellenature;
	}
	public void setLibellenature(String libellenature) {
		this.libellenature = libellenature;
	}
}
