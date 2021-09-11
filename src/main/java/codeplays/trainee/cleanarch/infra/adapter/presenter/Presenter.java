package codeplays.trainee.cleanarch.infra.adapter.presenter;

import codeplays.trainee.cleanarch.domain.usecase.OutputPort;
import codeplays.trainee.cleanarch.domain.usecase.ResponseModel;

public class Presenter implements OutputPort {

    private final ViewAdapter viewAdapter;

    public Presenter(ViewAdapter viewAdapter) {
        this.viewAdapter = viewAdapter;
    }

    @Override
    public void apply(ResponseModel output) {
        viewAdapter.write(new ViewModel(output.getData()));
    }
}
