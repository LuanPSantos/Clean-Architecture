package codeplays.trainee.cleanarch.infra.frameworksdrivers.db;

import codeplays.trainee.cleanarch.infra.adapter.gateway.DataBaseAdapter;
import codeplays.trainee.cleanarch.infra.adapter.gateway.DataBaseModel;

public class DataBaseAdapted implements DataBaseAdapter {
    @Override
    public DataBaseModel select(String data) {
        return new DataBaseModel(data);
    }
}
