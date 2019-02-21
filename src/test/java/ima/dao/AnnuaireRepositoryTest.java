package ima.dao;

import java.util.List;
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
public class AnnuaireRepositoryTest {
	
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
	public void recupererEtablissementParCodePostal() {
		final List<Etablissement> etablissements = repository.findByCodepostal("49");
		
		Assert.assertNotNull(etablissements);
        Assert.assertTrue(etablissements.iterator().hasNext());
	}
	
	@Test
	public void recupererEtablissementParId() {
		final List<Etablissement> etablissement = repository.findByIdentifiantdeletablissement("0170660A");
		
		Assert.assertNotNull(etablissement);
        Assert.assertTrue(!etablissement.iterator().hasNext());
	}
	
	@Test
	public void recupererEtablissementIdNull() {
		final List<Etablissement> etablissement = repository.findByIdentifiantdeletablissement(null);
		
		Assert.assertNull(etablissement);
	}
	

}