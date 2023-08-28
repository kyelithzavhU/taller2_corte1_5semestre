package com.example.operaciones_2;


import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withParent;
import static androidx.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.Matchers.allOf;

import androidx.test.espresso.ViewInteraction;
import androidx.test.ext.junit.rules.ActivityScenarioRule;
import androidx.test.ext.junit.runners.AndroidJUnit4;
import androidx.test.filters.LargeTest;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

@LargeTest
@RunWith(AndroidJUnit4.class)
public class testprimera_pantalla {

    @Rule
    public ActivityScenarioRule<pantalla_principal> mActivityScenarioRule =
            new ActivityScenarioRule<>(pantalla_principal.class);

    @Test
    public void testprimera_pantalla() {
        // Added a sleep statement to match the app's execution delay.
        // The recommended way to handle such scenarios is to use Espresso idling resources:
        // https://google.github.io/android-testing-support-library/docs/espresso/idling-resource/index.html
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        ViewInteraction textView = onView(
                allOf(withId(R.id.titulo_prin), withText("Ingresa alguna de estas opciones:"),
                        withParent(allOf(withId(R.id.pant_prin),
                                withParent(withId(android.R.id.content)))),
                        isDisplayed()));
        textView.check(matches(withText("Ingresa alguna de estas opciones:")));

        ViewInteraction textView2 = onView(
                allOf(withId(R.id.op_1), withText("1.Fibonacci"),
                        withParent(allOf(withId(R.id.opciones_prin),
                                withParent(withId(R.id.pant_prin)))),
                        isDisplayed()));
        textView2.check(matches(withText("1.Fibonacci")));

        ViewInteraction textView3 = onView(
                allOf(withId(R.id.op_2), withText("2.Potencia"),
                        withParent(allOf(withId(R.id.opciones_prin),
                                withParent(withId(R.id.pant_prin)))),
                        isDisplayed()));
        textView3.check(matches(withText("2.Potencia")));

        ViewInteraction textView4 = onView(
                allOf(withId(R.id.op_3), withText("3.Multiplicacion"),
                        withParent(allOf(withId(R.id.opciones_prin),
                                withParent(withId(R.id.pant_prin)))),
                        isDisplayed()));
        textView4.check(matches(withText("3.Multiplicacion")));

        ViewInteraction textView5 = onView(
                allOf(withId(R.id.op_4), withText("4.Ubicacion Universidad Agustiniana"),
                        withParent(allOf(withId(R.id.opciones_prin),
                                withParent(withId(R.id.pant_prin)))),
                        isDisplayed()));
        textView5.check(matches(withText("4.Ubicacion Universidad Agustiniana")));

        ViewInteraction editText = onView(
                allOf(withId(R.id.campo_op),
                        withParent(allOf(withId(R.id.ingrese_op),
                                withParent(withId(R.id.pant_prin)))),
                        isDisplayed()));
        editText.check(matches(isDisplayed()));

        ViewInteraction button = onView(
                allOf(withId(R.id.boton_op), withText("Ingresar"),
                        withParent(allOf(withId(R.id.ingrese_op),
                                withParent(withId(R.id.pant_prin)))),
                        isDisplayed()));
        button.check(matches(isDisplayed()));
    }
}
