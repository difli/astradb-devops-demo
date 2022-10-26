package org.cloudfoundry.samples.music.repositories.cassandra;

import org.cloudfoundry.samples.music.domain.Album;
import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CassandraAlbumRepository extends CassandraRepository<Album, String> {
	
}
