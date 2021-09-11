package codeplays.trainee.cleanarch.infra.adapter.gateway;

import codeplays.trainee.cleanarch.domain.entity.Entity;
import codeplays.trainee.cleanarch.domain.entity.Gateway;

public class DataBaseGateway implements Gateway {

    private final DataBaseAdapter adapter;

    public DataBaseGateway(DataBaseAdapter adapter) {
        this.adapter = adapter;
    }

    @Override
    public Entity getEntity(String data) {
        DataBaseModel dataBaseModel = adapter.select(data);

        return new Entity(dataBaseModel.getData());
    }
}
