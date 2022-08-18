package com.seleccion.banistmo.prueba.automatization.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;


public class SeleccionarCurso extends PageObject {
    public static final Target SELECT_BUTTON = Target.the("seleccionar selenium rubi")
            .located(By.xpath("(//A[@rel='nofollow'][text()='Add to basket'])[7]"));
    public static final Target SELECT_BUTTON_2 = Target.the("seleccionar el otro lenguaje")
            .located(By.xpath("(//A[@rel='nofollow'][text()='Add to basket'])[6]"));
    public static final Target CARRITO_COMPRA = Target.the("seleccionar el otro lenguaje")
            .located(By.xpath("//I[@class='wpmenucart-icon-shopping-cart-0']"));
    public static final Target DELETE = Target.the("seleccionar el otro lenguaje")
            .located(By.xpath("//A[@href='https://practice.automationtesting.in/basket/?remove_item=b73ce398c39f506af761d2277d853a92&_wpnonce=da08f8380b'][text()='×']"));
    public static final Target PRICE = Target.the("seleccionar el otro lenguaje")
            .located(By.xpath("(//SPAN[@class='woocommerce-Price-amount amount'])[5]"));
}


