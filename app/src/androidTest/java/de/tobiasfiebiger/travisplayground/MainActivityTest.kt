package de.tobiasfiebiger.travisplayground

import androidx.test.core.app.ActivityScenario
import androidx.test.ext.junit.runners.AndroidJUnit4
import org.junit.Assert
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class MainActivityTest {

  @Test
  fun hasExpectedUiElements() {
    val scenario = ActivityScenario.launch(MainActivity::class.java)
    scenario.onActivity { activity ->
      Assert.assertNotNull(
        "expected toolbar",
        activity.findViewById(R.id.toolbar)
      )

      Assert.assertNotNull(
        "expected label",
        activity.findViewById(R.id.label)
      )

      Assert.assertNotNull(
        "expected fab",
        activity.findViewById(R.id.fab)
      )
    }
  }

}