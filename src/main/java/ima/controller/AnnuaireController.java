package ima.controller;

import java.util.List;
import java.util.logging.Logger;

import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.mongodb.MongoClient;

import ima.entities.Etablissement;
import ima.dao.AnnuaireRepositoryImpl;
import ima.dao.AnnuaireRepositoryInterface;

@RestController
public class AnnuaireController {

	Logger logger = Logger.getLogger(AnnuaireController.class.getName());
	
	private AnnuaireRepositoryInterface annuaireRepositoryImpl = null;

	public AnnuaireController() {
		MongoOperations mongoOp = new MongoTemplate(new MongoClient("localhost"), "annuaire");
		this.annuaireRepositoryImpl = new AnnuaireRepositoryImpl(mongoOp);
	}
	
	@GetMapping("/etablissements")
	public List<Etablissement> getEtablissements() {
		return annuaireRepositoryImpl.findByNometablissement();
	}
	
	@GetMapping("/etablissements/codePostal")
	public List<Etablissement> getEtablissementsParCP() {
		return annuaireRepositoryImpl.findByCodepostal(null);
	}
	@GetMapping("/etablissements/codePostal/{codepostal}")
	public List<Etablissement> getEtablissementsParCP(@PathVariable String codepostal) {
		return annuaireRepositoryImpl.findByCodepostal(codepostal);
	}
	
	@GetMapping("/etablissements/id")
	public List<Etablissement> getEtablissementParId() {
		return annuaireRepositoryImpl.findByIdentifiantdeletablissement(null);
	}
	@GetMapping("/etablissements/id/{id}")
	public List<Etablissement> getEtablissementParId(@PathVariable String id) {
		return annuaireRepositoryImpl.findByIdentifiantdeletablissement(id);
	}

}
