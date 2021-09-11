package codeplays.trainee.cleanarch.infra.db;

import codeplays.trainee.cleanarch.domain.entity.Entity;
import codeplays.trainee.cleanarch.domain.entity.Gateway;

public class DataBaseGateway implements Gateway {
    @Override
    public Entity getEntity(String data) {
        return new Entity(data);
    }
}
