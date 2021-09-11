package codeplays.trainee.cleanarch.infra.frameworksdrivers.web;

import codeplays.trainee.cleanarch.domain.usecase.UseCase;
import codeplays.trainee.cleanarch.infra.adapter.controller.Controller;
import codeplays.trainee.cleanarch.infra.adapter.presenter.Presenter;
import codeplays.trainee.cleanarch.infra.adapter.controller.Request;
import codeplays.trainee.cleanarch.infra.adapter.gateway.DataBaseGateway;
import codeplays.trainee.cleanarch.infra.frameworksdrivers.db.DataBaseAdapted;
import codeplays.trainee.cleanarch.infra.adapter.presenter.ViewAdapter;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@RestController
public class View {

    private final ViewAdapter viewAdapter;
    private final Controller controller;

    public View() {
        ViewAdapted viewAdapted = new ViewAdapted();
        this.controller = new Controller(new UseCase(new DataBaseGateway(new DataBaseAdapted()), new Presenter(viewAdapted)));
        this.viewAdapter = viewAdapted;
    }

    @GetMapping("resource")
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {

        controller.execute(new Request(request.getParameter("data")));

        response.getWriter().print(viewAdapter.read().getData());
    }
}
