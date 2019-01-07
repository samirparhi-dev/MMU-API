package com.iemr.mmu.repo.masterrepo.doctor;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.iemr.mmu.data.masterdata.doctor.RouteOfAdmin;

@Repository
public interface RouteOfAdminRepo extends CrudRepository<RouteOfAdmin, Long> {
	@Query("SELECT routeID, routeName FROM RouteOfAdmin WHERE deleted is false ")
	public ArrayList<Object[]> getRouteOfAdminList();

}
