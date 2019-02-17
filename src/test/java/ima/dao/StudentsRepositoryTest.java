package ima.dao;

import java.util.logging.Logger;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import ima.entities.Etablissement;
import ima.config.MongoDBConfig;
import ima.controller.AnnuaireController;

@RunWith(SpringJUnit4ClassRunner.class)
@ActiveProfiles("mongodb")
@ContextConfiguration(classes={MongoDBConfig.class})
public class StudentsRepositoryTest {
	
	Logger logger = Logger.getLogger(AnnuaireController.class.getName());

	@Autowired
	@Qualifier("annuaireRepositoryImpl")
	private AnnuaireRepositoryInterface repository;
	
	@Test
	public void recupererTousLesEtablissements() {
		final Iterable<Etablissement> etablissements = repository.findAll();
		
		// Assertions
        Assert.assertNotNull(etablissements);
        Assert.assertTrue(etablissements.iterator().hasNext());
	}
	
	@Test
	public void recupererEtablissement() {
		Etablissement etablissement = null;
		final Iterable<Etablissement> etablissements= repository.findAll();
		
		for (Etablissement etablissementObj : etablissements) {
			if (etablissementObj.getIdentifiantdeletablissement().equals("0170486L"))
				etablissement = etablissementObj;
		}
		
		Assert.assertNotNull(etablissement);
	}

	@Test
	public void compterEtablissements() {
		Assert.assertTrue(repository.count() > 0);
	}
}