package ima.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import ima.entities.Etablissement;


public interface AnnuaireRepositoryInterface extends CrudRepository<Etablissement, Long> {
	
	public List<Etablissement> findBycodepostal(String cp);
	public List<Etablissement> findByidentifiantdeletablissement();

}
