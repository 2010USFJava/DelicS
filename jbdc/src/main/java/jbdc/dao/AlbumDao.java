package jbdc.dao;

import java.sql.SQLException;
import java.util.List;

import jbdc.beans.Album;

public interface AlbumDao {
	//crud ops
	public List<Album> getAllAlbums() throws SQLException;
}