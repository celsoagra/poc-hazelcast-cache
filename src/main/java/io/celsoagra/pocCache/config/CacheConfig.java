package io.celsoagra.pocCache.config;

import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.hazelcast.config.Config;
import com.hazelcast.config.MapConfig;

@Configuration
@EnableCaching
public class CacheConfig {
    
    private static final String REQUEST_IDENTIFIER = "request";

    @Bean
    Config config() {
        Config config = new Config();

        MapConfig mapConfig = new MapConfig();
        mapConfig.setTimeToLiveSeconds(3000);
        config.getMapConfigs().put(REQUEST_IDENTIFIER, mapConfig);

        return config;
    }

}
