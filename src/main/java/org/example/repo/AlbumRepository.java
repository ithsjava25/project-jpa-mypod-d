package org.example.repo;

import org.example.entity.Album;
import org.example.entity.Artist;

import java.util.List;

/**
 * Repository interface for managing {@link Album} entities.
 *
 * <p>This interface defines the contract for album-related
 * persistence operations, independent of the underlying
 * persistence technology.</p>
 *
 * <p>Implementations are responsible for handling database
 * access and entity lifecycle management.</p>
 */
public interface AlbumRepository {

    boolean existsByUniqueId(Album album);

    Long count();

    void save(Album album);

    List<Album> findAll();

    List<Album> findByArtist(Artist artist);

}
