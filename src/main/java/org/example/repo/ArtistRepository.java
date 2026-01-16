package org.example.repo;

import org.example.entity.Artist;

import java.util.List;

/**
 * Repository interface for managing {@link Artist} entities.
 *
 * <p>This interface defines the contract for artist-related
 * persistence operations, independent of the underlying
 * persistence technology.</p>
 *
 * <p>Implementations are responsible for handling database
 * access and entity lifecycle management.</p>
 */
public interface ArtistRepository {

    boolean existsByUniqueId(Artist artist);

    Long count();

    void save(Artist artist);

    List<Artist> findAll();

}
