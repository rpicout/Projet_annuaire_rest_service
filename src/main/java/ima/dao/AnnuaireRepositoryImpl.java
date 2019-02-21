package ima.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

import ima.entities.Etablissement;


@Repository // Stéréotype pour les classes d'accès aux données 
@Profile("mongodb")
public class AnnuaireRepositoryImpl implements AnnuaireRepositoryInterface {

	private final String COLLECTION_NAME = "en";
	
	private final MongoOperations operations;

	@Autowired
	public AnnuaireRepositoryImpl(MongoOperations operations) {
		this.operations = operations;
	}

	@Override
	public long count() {
		return operations.count(new Query(), COLLECTION_NAME);
	}

	@Override
	public <E extends Etablissement> E save(E entity) {
		try {
			operations.save(entity, COLLECTION_NAME);
		}
		catch (Exception e) {
			return null;
		}
		return entity;
	}

	@Override
	public <E extends Etablissement> Iterable<E> saveAll(Iterable<E> entities) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<Etablissement> findById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean existsById(Long id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Iterable<Etablissement> findAll() {
		return operations.findAll(Etablissement.class, COLLECTION_NAME);
	}
	
	@Override
	public List<Etablissement> findByNometablissement() {
		return operations.findAll(Etablissement.class, COLLECTION_NAME);
	}
	
	@Override
	public List<Etablissement> findByIdentifiantdeletablissement(String id) {
		List<Etablissement> listEtablissement = findByNometablissement();
		List<Etablissement> etablissementID = new ArrayList<Etablissement>();
		
		if (id != null) {
			for (Etablissement e : listEtablissement) {
				if (e.getIdentifiantdeletablissement().equals(id)) {
					etablissementID.add(e);
				}
			}
		}
		return etablissementID;
	}
	
	@Override
	public List<Etablissement> findByCodepostal(String cp) {
		List<Etablissement> listEtablissement = findByNometablissement();
		List<Etablissement> listEtablissementCP = new ArrayList<Etablissement>();
		
		if (cp != null) {
			for (Etablissement e : listEtablissement) {
				if (e.getCodepostal().contains(cp)) {
					listEtablissementCP.add(e);
				}
			}
		}
		return cp != null ? listEtablissementCP : listEtablissement;
	}

	@Override
	public Iterable<Etablissement> findAllById(Iterable<Long> ids) {
		return null;
	}

	@Override
	public void deleteById(Long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Etablissement entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll(Iterable<? extends Etablissement> entities) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}

}
