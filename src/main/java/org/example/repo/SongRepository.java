package org.example.repo;

import org.example.entity.Album;
import org.example.entity.Artist;
import org.example.entity.Song;

import java.util.List;

/**
 * Repository interface for managing {@link Song} entities.
 *
 * <p>This interface defines the contract for song-related
 * persistence operations, independent of the underlying
 * persistence technology.</p>
 *
 * <p>Implementations are responsible for handling database
 * access and entity lifecycle management.</p>
 */
public interface SongRepository {

    boolean existsByUniqueId(Song song);

    Long count();

    void save(Song song);

    List<Song> findAll();

    List<Song> findByArtist(Artist artist);

    List<Song> findByAlbum(Album album);

}
