package de.tobiasfiebiger.travisplayground

import androidx.test.core.app.ActivityScenario
import androidx.test.ext.junit.runners.AndroidJUnit4
import org.junit.Assert
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class HelloTravisTest {

  @Test
  fun hasExpectedUiElements() {
    val scenario = ActivityScenario.launch(MainActivity::class.java)
    scenario.onActivity { activity ->

      Assert.assertNotNull(
        "expected title label",
        activity.findViewById(R.id.label_title)
      )

      Assert.assertNotNull(
        "expected body label",
        activity.findViewById(R.id.label_body)
      )
    }
  }

}