package myweb.web1.dao;

import java.util.List;

import myweb.web1.model.Book;

public interface IMyDAO {

    List<Book> selectList(String query, int param);

}
