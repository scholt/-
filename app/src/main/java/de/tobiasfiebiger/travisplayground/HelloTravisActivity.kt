package de.tobiasfiebiger.travisplayground

import android.content.Context
import android.content.Intent
import android.os.Bundle
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity;

import kotlinx.android.synthetic.main.activity_hello_travis.*

class HelloTravisActivity : AppCompatActivity() {

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_hello_travis)
    setSupportActionBar(toolbar)
  }


  companion object {

    fun createIntent(context: Context) = Intent(context, HelloTravisActivity::class.java)

  }

}
