package org.example;

import jakarta.persistence.EntityManagerFactory;

import java.util.Map;

/**
 * Central access point for the application's {@link EntityManagerFactory}.
 *
 * <p>This class initializes a single, shared {@link EntityManagerFactory}
 * instance using {@link EntityManagerFactoryProvider} and exposes it
 * for use throughout the application.</p>
 *
 * <p>The factory is automatically closed when the JVM shuts down.</p>
 */
public class PersistenceManager {
    private static final EntityManagerFactory emf =
        EntityManagerFactoryProvider.create(
            "jdbc:mysql://localhost:3306/myPodDB",
            "user",
            "pass",
            Map.of(
                "hibernate.hbm2ddl.auto", "update",
                "hibernate.show_sql", "true",
                "hibernate.format_sql", "true"
            )
        );

    static {
        Runtime.getRuntime().addShutdownHook(new Thread(emf::close));
    }

    /**
     * Returns the shared {@link EntityManagerFactory} instance.
     *
     * @return application-wide {@link EntityManagerFactory}
     */
    public static EntityManagerFactory getEntityManagerFactory() {
        return emf;
    }
}
