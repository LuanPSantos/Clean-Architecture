package codeplays.trainee.cleanarch.infra.adapter.presenter;

import codeplays.trainee.cleanarch.infra.adapter.presenter.ViewModel;

public interface ViewAdapter {

    void write(ViewModel viewModel);
    ViewModel read();
}
