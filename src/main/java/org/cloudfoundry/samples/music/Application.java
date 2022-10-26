package org.cloudfoundry.samples.music;

import org.cloudfoundry.samples.music.repositories.AlbumRepositoryPopulator;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        new SpringApplicationBuilder(Application.class)
                .listeners(new AlbumRepositoryPopulator())
                .application()
                .run(args);
    }
}
