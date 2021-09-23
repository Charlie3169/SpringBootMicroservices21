package com.plantplaces.service;

import com.plantplaces.dto.SpecimenDTO;


/** * 
 * CRUD operations for specimen
 * @author Administrator
 *
 */
public interface ISpecimenService {
	
	/** 
	 * Get specimen from persistence layer
	 * @param ID a unique lookup
	 * @return A specimen with a matching ID
	 */
	SpecimenDTO fetchBy(int id);

	/** 
	 * Persist the given DTO
	 * @param SpecimenDTO
	 * 
	 */
	void save(SpecimenDTO specimenDTO);
	
	

}