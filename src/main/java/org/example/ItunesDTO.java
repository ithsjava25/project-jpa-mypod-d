package org.example;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.net.URL;
import java.time.LocalDate;

/**
 * Data Transfer Object representing a single song result
 * returned from the iTunes Search API.
 *
 * <p>This record is designed to map directly to the JSON structure
 * returned by the API and is used as an intermediate representation
 * before converting the data into domain entities.</p>
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public record ItunesDTO(Long artistId,
                        Long collectionId,
                        Long trackId,
                        String trackName,
                        String artistName,
                        String collectionName,
                        String country,
                        String primaryGenreName,
                        LocalDate releaseDate,
                        Long trackCount,
                        Long trackTimeMillis,
                        URL artworkUrl100,
                        String previewUrl) {

    /**
     * Extracts the release year from the release date.
     *
     * @return release year, or {@code 0} if the release date is unknown
     */
    public int releaseYear() {
        return releaseDate != null ? releaseDate.getYear() : 0;
    }
}
