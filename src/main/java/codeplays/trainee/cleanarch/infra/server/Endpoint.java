package codeplays.trainee.cleanarch.infra.server;

import codeplays.trainee.cleanarch.domain.usecase.UseCase;
import codeplays.trainee.cleanarch.infra.adapter.Controller;
import codeplays.trainee.cleanarch.infra.adapter.Presenter;
import codeplays.trainee.cleanarch.infra.adapter.Request;
import codeplays.trainee.cleanarch.infra.db.DataBaseGateway;
import codeplays.trainee.cleanarch.infra.view.ResponseWriter;
import codeplays.trainee.cleanarch.infra.view.ViewWriter;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@RestController
public class Endpoint {

    private final ViewWriter viewWriter;
    private final Controller controller;

    public Endpoint() {
        ResponseWriter responseWriter = new ResponseWriter();
        this.controller = new Controller(new UseCase(new DataBaseGateway(), new Presenter(responseWriter)));
        this.viewWriter = responseWriter;
    }

    @GetMapping("resource")
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {

        controller.execute(new Request(request.getParameter("data")));

        response.getWriter().print(viewWriter.read().getData());
    }
}
