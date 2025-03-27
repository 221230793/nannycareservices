package za.ac.cput.repository;

import za.ac.cput.domain.Nanny;
//Author: Nakedi Puleng Veronica (222914556)
//Date 25/03/2025
import java.util.ArrayList;
import java.util.List;

public class NannyRepository implements INannyRepository {

    private static INannyRepository repository = null;
    private List<Nanny> nannyList;


      private NannyRepository() {
          nannyList = new ArrayList<Nanny>();
      }

      public static INannyRepository getRepository() {

          if (repository == null) {
              repository = new NannyRepository();
          }
          return repository;
      }
    @Override
    public List<Nanny> getAll() {
        return nannyList;
    }

    @Override
    public Nanny create(Nanny nanny) {
        boolean success = nannyList.add(nanny);
        if (success) {
            return nanny;
        }
        return null;
    }

    @Override
    public Nanny read(Integer yearsOfExperience) {
     for (Nanny e : nannyList) {
         if (e.getYearsOfExperience() == yearsOfExperience.intValue())
             return e;

         }
     return null;

    }

    @Override
    public Nanny update(Nanny nanny) {
          Integer yearsOfExperience = nanny.getYearsOfExperience();
          Nanny oldNanny = read(yearsOfExperience);
          if (oldNanny == null)
              return null;
          boolean success = delete(yearsOfExperience);
              if (success) {
                  if(nannyList.add(nanny))
                      return nanny;
              }
              return null;
          }


    @Override
    public boolean delete(Integer integer) {
        Nanny nannyToDelete = read(integer);
        if(nannyToDelete == null)
            return false;
        return nannyList.remove(nannyToDelete);

    }
}
