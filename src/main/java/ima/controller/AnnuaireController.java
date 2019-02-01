package ima.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.web.bind.annotation.GetMapping;
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
	public List<Etablissement> getEtablissements () {
		
		final Iterable<Etablissement> etablissements = annuaireRepositoryImpl.findAll();
		
		final List<Etablissement> ret = new ArrayList<Etablissement>();
		
		// Lambda Expression
		// Pour chaque élément (forEach) nommé "e", je l'ajoute à la liste
		etablissements.forEach((e) -> ret.add(e));		

		return ret;
	}

}
