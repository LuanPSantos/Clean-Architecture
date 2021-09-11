package codeplays.trainee.cleanarch.infra.frameworksdrivers.web;

import codeplays.trainee.cleanarch.infra.adapter.presenter.ViewModel;
import codeplays.trainee.cleanarch.infra.adapter.presenter.ViewAdapter;

public class ViewAdapted implements ViewAdapter {

    private ViewModel viewModel;
    @Override
    public void write(ViewModel viewModel) {
        this.viewModel = viewModel;
    }

    @Override
    public ViewModel read() {
        return viewModel;
    }
}
