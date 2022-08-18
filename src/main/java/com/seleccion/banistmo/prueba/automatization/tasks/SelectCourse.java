package com.seleccion.banistmo.prueba.automatization.tasks;

import com.seleccion.banistmo.prueba.automatization.userinterface.SeleccionarCurso;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.conditions.Check;

public class SelectCourse implements Task {

    public static SelectCourse enterTo() {
        return Tasks.instrumented(SelectCourse.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(SeleccionarCurso.SELECT_BUTTON),
                Click.on(SeleccionarCurso.SELECT_BUTTON_2),
                Click.on(SeleccionarCurso.CARRITO_COMPRA),
                Click.on(SeleccionarCurso.DELETE),
                Check.whether(SeleccionarCurso.PRICE.equals(357.00)));
    }
}
