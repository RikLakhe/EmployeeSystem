package edu.lfa.ajc.employeesystem.dao;

import java.util.List;


public interface GenericT<T> {
	boolean insert(T t);
	boolean update(int id);
	boolean delete(int id);
	T getById(int id);
	List<T> getAll();
}
