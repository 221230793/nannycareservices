package za.ac.cput.repository;

import za.ac.cput.domain.Nanny;
//Author: Nakedi Puleng Veronica (222914556)
//Date 25/03/2025
import java.util.List;

public interface INannyRepository extends IRepository<Nanny, Integer>{
 List<Nanny> getAll();


}
