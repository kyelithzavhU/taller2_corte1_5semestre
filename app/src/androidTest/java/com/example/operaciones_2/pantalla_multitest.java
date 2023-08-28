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
public class pantalla_multitest {

    @Rule
    public ActivityScenarioRule<pantalla_principal> mActivityScenarioRule =
            new ActivityScenarioRule<>(pantalla_principal.class);

    @Test
    public void pantalla_multitest() {
        // Added a sleep statement to match the app's execution delay.
        // The recommended way to handle such scenarios is to use Espresso idling resources:
        // https://google.github.io/android-testing-support-library/docs/espresso/idling-resource/index.html
        try {
            Thread.sleep(700);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        ViewInteraction textView = onView(
                allOf(withId(R.id.titulo_multi), withText("Multiplicacion"),
                        withParent(allOf(withId(R.id.pant_multi),
                                withParent(withId(android.R.id.content)))),
                        isDisplayed()));
        textView.check(matches(withText("Multiplicacion")));

        ViewInteraction editText = onView(
                allOf(withId(R.id.valor_multi_1),
                        withParent(allOf(withId(R.id.pant_multi),
                                withParent(withId(android.R.id.content)))),
                        isDisplayed()));
        editText.check(matches(isDisplayed()));

        ViewInteraction editText2 = onView(
                allOf(withId(R.id.valor_multi_2),
                        withParent(allOf(withId(R.id.pant_multi),
                                withParent(withId(android.R.id.content)))),
                        isDisplayed()));
        editText2.check(matches(isDisplayed()));

        ViewInteraction button = onView(
                allOf(withId(R.id.boton_multi), withText("Ingresar"),
                        withParent(allOf(withId(R.id.accion_boton_multi),
                                withParent(withId(R.id.pant_multi)))),
                        isDisplayed()));
        button.check(matches(isDisplayed()));

        ViewInteraction textView2 = onView(
                allOf(withId(R.id.text_resul_multi), withText("Resultado Multiplicacion:"),
                        withParent(allOf(withId(R.id.resultado_multi),
                                withParent(withId(R.id.pant_multi)))),
                        isDisplayed()));
        textView2.check(matches(withText("Resultado Multiplicacion:")));
    }
}
