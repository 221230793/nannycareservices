package za.ac.cput.repository;
//Author: Nakedi Puleng Veronica (222914556)
//Date 27/03/2025
public interface IRepository< T, ID> {

    T create(T t);

     T read(ID id);

    T update(T t);

    boolean delete(ID id);

}
