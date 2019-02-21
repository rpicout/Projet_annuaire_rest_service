package ima.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import ima.entities.Etablissement;


public interface AnnuaireRepositoryInterface extends CrudRepository<Etablissement, Long> {
	
	public List<Etablissement> findByCodepostal(String cp);
	
	public List<Etablissement> findByNometablissement();
	
	public List<Etablissement> findByIdentifiantdeletablissement(String id);

}
